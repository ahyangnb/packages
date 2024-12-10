# google_adsense
[Google AdSense](https://adsense.google.com/intl/en_us/start/) plugin for Flutter Web

This package initializes AdSense on your website and provides an ad unit `Widget` that can be configured and placed in the desired location in your Flutter web app UI, without having to directly modify the HTML markup of the app directly.

## Disclaimer: Early Access ⚠️
This package is currently in early access and is provided as-is. While it's open source and publicly available, it's likely that you'll need to make additional customizations and configurations to fully integrate it with your Flutter Web App.
Please express interest joining Early Access program using [this form](https://docs.google.com/forms/d/e/1FAIpQLSdN6aOwVkaxGdxbVQFVZ_N4_UCBkuWYa-cS4_rbU_f1jK10Tw/viewform)

## Usage

### Setup your AdSense account
1. [Make sure your site's pages are ready for AdSense](https://support.google.com/adsense/answer/7299563)
2. [Create your AdSense account](https://support.google.com/adsense/answer/10162)

### Initialize AdSense
To start displaying ads, initialize AdSense with your [Publisher ID](https://support.google.com/adsense/answer/105516) (only use numbers).

<?code-excerpt "example/lib/main.dart (init)"?>
```dart
import 'package:google_adsense/experimental/ad_unit_widget.dart';
import 'package:google_adsense/google_adsense.dart';

void main() async {
  // Call `initialize` with your Publisher ID (pub-0123456789012345)
  // (See: https://support.google.com/adsense/answer/105516)
  await adSense.initialize('0123456789012345');

  runApp(const MyApp());
}
```

### Displaying Auto Ads
In order to start displaying [Auto ads](https://support.google.com/adsense/answer/9261805):

1. Configure this feature in your AdSense Console.

Auto ads should start showing just with the call to `initialize`, when available.

If you want to display ad units within your app content, continue to the next step

### Display ad units (`AdUnitWidget`)

To display an Ad unit in your Flutter application:

1. Create [ad units](https://support.google.com/adsense/answer/9183549) in your AdSense account.
   This will provide an HTML snippet, which you need to translate to Dart.
2. Pick the `AdUnitConfiguration` for your ad type:

| Ad Unit Type   | `AdUnitConfiguration` constructor method   |
|----------------|--------------------------------------------|
| Display Ads    | `AdUnitConfiguration.displayAdUnit(...)`   |
| In-feed Ads    | `AdUnitConfiguration.inFeedAdUnit(...)`    |
| In-article Ads | `AdUnitConfiguration.inArticleAdUnit(...)` |
| Multiplex Ads  | `AdUnitConfiguration.multiplexAdUnit(...)` |

3. The data-attributes from the generated snippet are available through the `AdUnitConfiguration` object.
Their Dart name is created as follows:

- The `data-` prefix is **removed**.
- `kebab-case` becomes `camelCase`

The only exception to this is `data-ad-client`, that is passed to `adSense.initialize`,
instead of through an `AdUnitConfiguration` object.

For example snippet below:

```html
<ins class="adsbygoogle"
     style="display:block"
     data-ad-client="ca-pub-0123456789012345"
     data-ad-slot="1234567890"
     data-ad-format="auto"
     data-full-width-responsive="true"></ins>
<script>
     (adsbygoogle = window.adsbygoogle || []).push({});
</script>
```
translates into:

<?code-excerpt "example/lib/main.dart (init-min)"?>
```dart
// Call `initialize` with your Publisher ID (pub-0123456789012345)
// (See: https://support.google.com/adsense/answer/105516)
await adSense.initialize('0123456789012345');

```

and:

<?code-excerpt "example/lib/main.dart (adUnit)"?>
```dart
    AdUnitWidget(
  configuration: AdUnitConfiguration.displayAdUnit(
    // TODO: Replace with your Ad Unit ID
    adSlot: '1234567890',
    // Remove AdFormat to make ads limited by height
    adFormat: AdFormat.AUTO,
  ),
),
```

#### `AdUnitWidget` customizations

To [modify your responsive ad code](https://support.google.com/adsense/answer/9183363?hl=en&ref_topic=9183242&sjid=11551379421978541034-EU):
1. Make sure to follow [AdSense policies](https://support.google.com/adsense/answer/1346295?hl=en&sjid=18331098933308334645-EU&visit_id=638689380593964621-4184295127&ref_topic=1271508&rd=1)
2. Use Flutter instruments for [adaptive and responsive design](https://docs.flutter.dev/ui/adaptive-responsive)

For example, when not using responsive `AdFormat` it is recommended to wrap adUnit widget in the `Container` with width and/or height constraints.
Note some [policies and restrictions](https://support.google.com/adsense/answer/9185043?hl=en#:~:text=Policies%20and%20restrictions) related to ad unit sizing:

<?code-excerpt "example/lib/main.dart (constraints)"?>
```dart
Container(
  constraints:
      const BoxConstraints(maxHeight: 100, maxWidth: 1200),
  padding: const EdgeInsets.only(bottom: 10),
  child: AdUnitWidget(
    configuration: AdUnitConfiguration.displayAdUnit(
      // TODO: Replace with your Ad Unit ID
      adSlot: '1234567890',
      // Do not use adFormat to make ad unit respect height constraint
      // adFormat: AdFormat.AUTO,
    ),
  ),
),
```
## Testing and common errors

### Failed to load resource: the server responded with a status of 400
Make sure to set correct values to adSlot and adClient arguments

### Failed to load resource: the server responded with a status of 403
1. When happening in **testing/staging** environment it is likely related to the fact that ads are only filled when requested from an authorized domain. If you are testing locally and running your web app on `localhost`, you need to:
   1. Set custom domain name on localhost by creating a local DNS record that would point `127.0.0.1` and/or `localhost` to `your-domain.com`. On mac/linux machines this can be achieved by adding the following records to you /etc/hosts file:
        `127.0.0.1	your-domain.com`
        `localhost   your-domain.com`
   2. Specify additional run arguments in IDE by editing `Run/Debug Configuration` or by passing them directly to `flutter run` command:  
       `--web-port=8080`  
       `--web-hostname=your-domain.com`
2. When happening in **production** it might be that your domain was not yet approved or was disapproved. Login to your AdSense account to check your domain approval status

### Ad unfilled  

There is no deterministic way to make sure your ads are 100% filled even when testing. Some of the way to increase the fill rate:
- Ensure your ad units are correctly configured in AdSense
- Try setting `adTest` parameter to `true`  
- Try setting AD_FORMAT to `auto` (default setting)
- Try setting FULL_WIDTH_RESPONSIVE to `true` (default setting)
- Try resizing the window or making sure that ad unit Widget width is less than ~1200px 