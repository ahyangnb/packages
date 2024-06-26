// Copyright 2013 The Flutter Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.
// Autogenerated from Pigeon (v20.0.1), do not edit directly.
// See also: https://pub.dev/packages/pigeon

package io.flutter.plugins.googlemaps;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.CLASS;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugin.common.StandardMessageCodec;
import java.io.ByteArrayOutputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/** Generated class from Pigeon. */
@SuppressWarnings({"unused", "unchecked", "CodeBlock2Expr", "RedundantSuppression", "serial"})
public class Messages {

  /** Error class for passing custom error details to Flutter via a thrown PlatformException. */
  public static class FlutterError extends RuntimeException {

    /** The error code. */
    public final String code;

    /** The error details. Must be a datatype supported by the api codec. */
    public final Object details;

    public FlutterError(@NonNull String code, @Nullable String message, @Nullable Object details) {
      super(message);
      this.code = code;
      this.details = details;
    }
  }

  @NonNull
  protected static ArrayList<Object> wrapError(@NonNull Throwable exception) {
    ArrayList<Object> errorList = new ArrayList<Object>(3);
    if (exception instanceof FlutterError) {
      FlutterError error = (FlutterError) exception;
      errorList.add(error.code);
      errorList.add(error.getMessage());
      errorList.add(error.details);
    } else {
      errorList.add(exception.toString());
      errorList.add(exception.getClass().getSimpleName());
      errorList.add(
          "Cause: " + exception.getCause() + ", Stacktrace: " + Log.getStackTraceString(exception));
    }
    return errorList;
  }

  @Target(METHOD)
  @Retention(CLASS)
  @interface CanIgnoreReturnValue {}

  /**
   * Pigeon equivalent of LatLng.
   *
   * <p>Generated class from Pigeon that represents data sent in messages.
   */
  public static final class PlatformLatLng {
    private @NonNull Double lat;

    public @NonNull Double getLat() {
      return lat;
    }

    public void setLat(@NonNull Double setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"lat\" is null.");
      }
      this.lat = setterArg;
    }

    private @NonNull Double lng;

    public @NonNull Double getLng() {
      return lng;
    }

    public void setLng(@NonNull Double setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"lng\" is null.");
      }
      this.lng = setterArg;
    }

    /** Constructor is non-public to enforce null safety; use Builder. */
    PlatformLatLng() {}

    public static final class Builder {

      private @Nullable Double lat;

      @CanIgnoreReturnValue
      public @NonNull Builder setLat(@NonNull Double setterArg) {
        this.lat = setterArg;
        return this;
      }

      private @Nullable Double lng;

      @CanIgnoreReturnValue
      public @NonNull Builder setLng(@NonNull Double setterArg) {
        this.lng = setterArg;
        return this;
      }

      public @NonNull PlatformLatLng build() {
        PlatformLatLng pigeonReturn = new PlatformLatLng();
        pigeonReturn.setLat(lat);
        pigeonReturn.setLng(lng);
        return pigeonReturn;
      }
    }

    @NonNull
    ArrayList<Object> toList() {
      ArrayList<Object> toListResult = new ArrayList<Object>(2);
      toListResult.add(lat);
      toListResult.add(lng);
      return toListResult;
    }

    static @NonNull PlatformLatLng fromList(@NonNull ArrayList<Object> __pigeon_list) {
      PlatformLatLng pigeonResult = new PlatformLatLng();
      Object lat = __pigeon_list.get(0);
      pigeonResult.setLat((Double) lat);
      Object lng = __pigeon_list.get(1);
      pigeonResult.setLng((Double) lng);
      return pigeonResult;
    }
  }

  /**
   * Pigeon equivalent of LatLngBounds.
   *
   * <p>Generated class from Pigeon that represents data sent in messages.
   */
  public static final class PlatformLatLngBounds {
    private @NonNull PlatformLatLng northeast;

    public @NonNull PlatformLatLng getNortheast() {
      return northeast;
    }

    public void setNortheast(@NonNull PlatformLatLng setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"northeast\" is null.");
      }
      this.northeast = setterArg;
    }

    private @NonNull PlatformLatLng southwest;

    public @NonNull PlatformLatLng getSouthwest() {
      return southwest;
    }

    public void setSouthwest(@NonNull PlatformLatLng setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"southwest\" is null.");
      }
      this.southwest = setterArg;
    }

    /** Constructor is non-public to enforce null safety; use Builder. */
    PlatformLatLngBounds() {}

    public static final class Builder {

      private @Nullable PlatformLatLng northeast;

      @CanIgnoreReturnValue
      public @NonNull Builder setNortheast(@NonNull PlatformLatLng setterArg) {
        this.northeast = setterArg;
        return this;
      }

      private @Nullable PlatformLatLng southwest;

      @CanIgnoreReturnValue
      public @NonNull Builder setSouthwest(@NonNull PlatformLatLng setterArg) {
        this.southwest = setterArg;
        return this;
      }

      public @NonNull PlatformLatLngBounds build() {
        PlatformLatLngBounds pigeonReturn = new PlatformLatLngBounds();
        pigeonReturn.setNortheast(northeast);
        pigeonReturn.setSouthwest(southwest);
        return pigeonReturn;
      }
    }

    @NonNull
    ArrayList<Object> toList() {
      ArrayList<Object> toListResult = new ArrayList<Object>(2);
      toListResult.add(northeast);
      toListResult.add(southwest);
      return toListResult;
    }

    static @NonNull PlatformLatLngBounds fromList(@NonNull ArrayList<Object> __pigeon_list) {
      PlatformLatLngBounds pigeonResult = new PlatformLatLngBounds();
      Object northeast = __pigeon_list.get(0);
      pigeonResult.setNortheast((PlatformLatLng) northeast);
      Object southwest = __pigeon_list.get(1);
      pigeonResult.setSouthwest((PlatformLatLng) southwest);
      return pigeonResult;
    }
  }

  /**
   * Pigeon equivalent of Cluster.
   *
   * <p>Generated class from Pigeon that represents data sent in messages.
   */
  public static final class PlatformCluster {
    private @NonNull String clusterManagerId;

    public @NonNull String getClusterManagerId() {
      return clusterManagerId;
    }

    public void setClusterManagerId(@NonNull String setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"clusterManagerId\" is null.");
      }
      this.clusterManagerId = setterArg;
    }

    private @NonNull PlatformLatLng position;

    public @NonNull PlatformLatLng getPosition() {
      return position;
    }

    public void setPosition(@NonNull PlatformLatLng setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"position\" is null.");
      }
      this.position = setterArg;
    }

    private @NonNull PlatformLatLngBounds bounds;

    public @NonNull PlatformLatLngBounds getBounds() {
      return bounds;
    }

    public void setBounds(@NonNull PlatformLatLngBounds setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"bounds\" is null.");
      }
      this.bounds = setterArg;
    }

    private @NonNull List<String> markerIds;

    public @NonNull List<String> getMarkerIds() {
      return markerIds;
    }

    public void setMarkerIds(@NonNull List<String> setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"markerIds\" is null.");
      }
      this.markerIds = setterArg;
    }

    /** Constructor is non-public to enforce null safety; use Builder. */
    PlatformCluster() {}

    public static final class Builder {

      private @Nullable String clusterManagerId;

      @CanIgnoreReturnValue
      public @NonNull Builder setClusterManagerId(@NonNull String setterArg) {
        this.clusterManagerId = setterArg;
        return this;
      }

      private @Nullable PlatformLatLng position;

      @CanIgnoreReturnValue
      public @NonNull Builder setPosition(@NonNull PlatformLatLng setterArg) {
        this.position = setterArg;
        return this;
      }

      private @Nullable PlatformLatLngBounds bounds;

      @CanIgnoreReturnValue
      public @NonNull Builder setBounds(@NonNull PlatformLatLngBounds setterArg) {
        this.bounds = setterArg;
        return this;
      }

      private @Nullable List<String> markerIds;

      @CanIgnoreReturnValue
      public @NonNull Builder setMarkerIds(@NonNull List<String> setterArg) {
        this.markerIds = setterArg;
        return this;
      }

      public @NonNull PlatformCluster build() {
        PlatformCluster pigeonReturn = new PlatformCluster();
        pigeonReturn.setClusterManagerId(clusterManagerId);
        pigeonReturn.setPosition(position);
        pigeonReturn.setBounds(bounds);
        pigeonReturn.setMarkerIds(markerIds);
        return pigeonReturn;
      }
    }

    @NonNull
    ArrayList<Object> toList() {
      ArrayList<Object> toListResult = new ArrayList<Object>(4);
      toListResult.add(clusterManagerId);
      toListResult.add(position);
      toListResult.add(bounds);
      toListResult.add(markerIds);
      return toListResult;
    }

    static @NonNull PlatformCluster fromList(@NonNull ArrayList<Object> __pigeon_list) {
      PlatformCluster pigeonResult = new PlatformCluster();
      Object clusterManagerId = __pigeon_list.get(0);
      pigeonResult.setClusterManagerId((String) clusterManagerId);
      Object position = __pigeon_list.get(1);
      pigeonResult.setPosition((PlatformLatLng) position);
      Object bounds = __pigeon_list.get(2);
      pigeonResult.setBounds((PlatformLatLngBounds) bounds);
      Object markerIds = __pigeon_list.get(3);
      pigeonResult.setMarkerIds((List<String>) markerIds);
      return pigeonResult;
    }
  }

  /**
   * Pigeon equivalent of native TileOverlay properties.
   *
   * <p>Generated class from Pigeon that represents data sent in messages.
   */
  public static final class PlatformTileLayer {
    private @NonNull Boolean visible;

    public @NonNull Boolean getVisible() {
      return visible;
    }

    public void setVisible(@NonNull Boolean setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"visible\" is null.");
      }
      this.visible = setterArg;
    }

    private @NonNull Boolean fadeIn;

    public @NonNull Boolean getFadeIn() {
      return fadeIn;
    }

    public void setFadeIn(@NonNull Boolean setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"fadeIn\" is null.");
      }
      this.fadeIn = setterArg;
    }

    private @NonNull Double transparency;

    public @NonNull Double getTransparency() {
      return transparency;
    }

    public void setTransparency(@NonNull Double setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"transparency\" is null.");
      }
      this.transparency = setterArg;
    }

    private @NonNull Double zIndex;

    public @NonNull Double getZIndex() {
      return zIndex;
    }

    public void setZIndex(@NonNull Double setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"zIndex\" is null.");
      }
      this.zIndex = setterArg;
    }

    /** Constructor is non-public to enforce null safety; use Builder. */
    PlatformTileLayer() {}

    public static final class Builder {

      private @Nullable Boolean visible;

      @CanIgnoreReturnValue
      public @NonNull Builder setVisible(@NonNull Boolean setterArg) {
        this.visible = setterArg;
        return this;
      }

      private @Nullable Boolean fadeIn;

      @CanIgnoreReturnValue
      public @NonNull Builder setFadeIn(@NonNull Boolean setterArg) {
        this.fadeIn = setterArg;
        return this;
      }

      private @Nullable Double transparency;

      @CanIgnoreReturnValue
      public @NonNull Builder setTransparency(@NonNull Double setterArg) {
        this.transparency = setterArg;
        return this;
      }

      private @Nullable Double zIndex;

      @CanIgnoreReturnValue
      public @NonNull Builder setZIndex(@NonNull Double setterArg) {
        this.zIndex = setterArg;
        return this;
      }

      public @NonNull PlatformTileLayer build() {
        PlatformTileLayer pigeonReturn = new PlatformTileLayer();
        pigeonReturn.setVisible(visible);
        pigeonReturn.setFadeIn(fadeIn);
        pigeonReturn.setTransparency(transparency);
        pigeonReturn.setZIndex(zIndex);
        return pigeonReturn;
      }
    }

    @NonNull
    ArrayList<Object> toList() {
      ArrayList<Object> toListResult = new ArrayList<Object>(4);
      toListResult.add(visible);
      toListResult.add(fadeIn);
      toListResult.add(transparency);
      toListResult.add(zIndex);
      return toListResult;
    }

    static @NonNull PlatformTileLayer fromList(@NonNull ArrayList<Object> __pigeon_list) {
      PlatformTileLayer pigeonResult = new PlatformTileLayer();
      Object visible = __pigeon_list.get(0);
      pigeonResult.setVisible((Boolean) visible);
      Object fadeIn = __pigeon_list.get(1);
      pigeonResult.setFadeIn((Boolean) fadeIn);
      Object transparency = __pigeon_list.get(2);
      pigeonResult.setTransparency((Double) transparency);
      Object zIndex = __pigeon_list.get(3);
      pigeonResult.setZIndex((Double) zIndex);
      return pigeonResult;
    }
  }

  /**
   * Possible outcomes of launching a URL.
   *
   * <p>Generated class from Pigeon that represents data sent in messages.
   */
  public static final class PlatformZoomRange {
    private @NonNull Double min;

    public @NonNull Double getMin() {
      return min;
    }

    public void setMin(@NonNull Double setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"min\" is null.");
      }
      this.min = setterArg;
    }

    private @NonNull Double max;

    public @NonNull Double getMax() {
      return max;
    }

    public void setMax(@NonNull Double setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"max\" is null.");
      }
      this.max = setterArg;
    }

    /** Constructor is non-public to enforce null safety; use Builder. */
    PlatformZoomRange() {}

    public static final class Builder {

      private @Nullable Double min;

      @CanIgnoreReturnValue
      public @NonNull Builder setMin(@NonNull Double setterArg) {
        this.min = setterArg;
        return this;
      }

      private @Nullable Double max;

      @CanIgnoreReturnValue
      public @NonNull Builder setMax(@NonNull Double setterArg) {
        this.max = setterArg;
        return this;
      }

      public @NonNull PlatformZoomRange build() {
        PlatformZoomRange pigeonReturn = new PlatformZoomRange();
        pigeonReturn.setMin(min);
        pigeonReturn.setMax(max);
        return pigeonReturn;
      }
    }

    @NonNull
    ArrayList<Object> toList() {
      ArrayList<Object> toListResult = new ArrayList<Object>(2);
      toListResult.add(min);
      toListResult.add(max);
      return toListResult;
    }

    static @NonNull PlatformZoomRange fromList(@NonNull ArrayList<Object> __pigeon_list) {
      PlatformZoomRange pigeonResult = new PlatformZoomRange();
      Object min = __pigeon_list.get(0);
      pigeonResult.setMin((Double) min);
      Object max = __pigeon_list.get(1);
      pigeonResult.setMax((Double) max);
      return pigeonResult;
    }
  }

  private static class PigeonCodec extends StandardMessageCodec {
    public static final PigeonCodec INSTANCE = new PigeonCodec();

    private PigeonCodec() {}

    @Override
    protected Object readValueOfType(byte type, @NonNull ByteBuffer buffer) {
      switch (type) {
        case (byte) 129:
          return PlatformLatLng.fromList((ArrayList<Object>) readValue(buffer));
        case (byte) 130:
          return PlatformLatLngBounds.fromList((ArrayList<Object>) readValue(buffer));
        case (byte) 131:
          return PlatformCluster.fromList((ArrayList<Object>) readValue(buffer));
        case (byte) 132:
          return PlatformTileLayer.fromList((ArrayList<Object>) readValue(buffer));
        case (byte) 133:
          return PlatformZoomRange.fromList((ArrayList<Object>) readValue(buffer));
        default:
          return super.readValueOfType(type, buffer);
      }
    }

    @Override
    protected void writeValue(@NonNull ByteArrayOutputStream stream, Object value) {
      if (value instanceof PlatformLatLng) {
        stream.write(129);
        writeValue(stream, ((PlatformLatLng) value).toList());
      } else if (value instanceof PlatformLatLngBounds) {
        stream.write(130);
        writeValue(stream, ((PlatformLatLngBounds) value).toList());
      } else if (value instanceof PlatformCluster) {
        stream.write(131);
        writeValue(stream, ((PlatformCluster) value).toList());
      } else if (value instanceof PlatformTileLayer) {
        stream.write(132);
        writeValue(stream, ((PlatformTileLayer) value).toList());
      } else if (value instanceof PlatformZoomRange) {
        stream.write(133);
        writeValue(stream, ((PlatformZoomRange) value).toList());
      } else {
        super.writeValue(stream, value);
      }
    }
  }

  /**
   * Inspector API only intended for use in integration tests.
   *
   * <p>Generated interface from Pigeon that represents a handler of messages from Flutter.
   */
  public interface MapsInspectorApi {

    @NonNull
    Boolean areBuildingsEnabled();

    @NonNull
    Boolean areRotateGesturesEnabled();

    @NonNull
    Boolean areZoomControlsEnabled();

    @NonNull
    Boolean areScrollGesturesEnabled();

    @NonNull
    Boolean areTiltGesturesEnabled();

    @NonNull
    Boolean areZoomGesturesEnabled();

    @NonNull
    Boolean isCompassEnabled();

    @Nullable
    Boolean isLiteModeEnabled();

    @NonNull
    Boolean isMapToolbarEnabled();

    @NonNull
    Boolean isMyLocationButtonEnabled();

    @NonNull
    Boolean isTrafficEnabled();

    @Nullable
    PlatformTileLayer getTileOverlayInfo(@NonNull String tileOverlayId);

    @NonNull
    PlatformZoomRange getZoomRange();

    @NonNull
    List<PlatformCluster> getClusters(@NonNull String clusterManagerId);

    /** The codec used by MapsInspectorApi. */
    static @NonNull MessageCodec<Object> getCodec() {
      return PigeonCodec.INSTANCE;
    }
    /**
     * Sets up an instance of `MapsInspectorApi` to handle messages through the `binaryMessenger`.
     */
    static void setUp(@NonNull BinaryMessenger binaryMessenger, @Nullable MapsInspectorApi api) {
      setUp(binaryMessenger, "", api);
    }

    static void setUp(
        @NonNull BinaryMessenger binaryMessenger,
        @NonNull String messageChannelSuffix,
        @Nullable MapsInspectorApi api) {
      messageChannelSuffix = messageChannelSuffix.isEmpty() ? "" : "." + messageChannelSuffix;
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(
                binaryMessenger,
                "dev.flutter.pigeon.google_maps_flutter_android.MapsInspectorApi.areBuildingsEnabled"
                    + messageChannelSuffix,
                getCodec());
        if (api != null) {
          channel.setMessageHandler(
              (message, reply) -> {
                ArrayList<Object> wrapped = new ArrayList<Object>();
                try {
                  Boolean output = api.areBuildingsEnabled();
                  wrapped.add(0, output);
                } catch (Throwable exception) {
                  ArrayList<Object> wrappedError = wrapError(exception);
                  wrapped = wrappedError;
                }
                reply.reply(wrapped);
              });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(
                binaryMessenger,
                "dev.flutter.pigeon.google_maps_flutter_android.MapsInspectorApi.areRotateGesturesEnabled"
                    + messageChannelSuffix,
                getCodec());
        if (api != null) {
          channel.setMessageHandler(
              (message, reply) -> {
                ArrayList<Object> wrapped = new ArrayList<Object>();
                try {
                  Boolean output = api.areRotateGesturesEnabled();
                  wrapped.add(0, output);
                } catch (Throwable exception) {
                  ArrayList<Object> wrappedError = wrapError(exception);
                  wrapped = wrappedError;
                }
                reply.reply(wrapped);
              });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(
                binaryMessenger,
                "dev.flutter.pigeon.google_maps_flutter_android.MapsInspectorApi.areZoomControlsEnabled"
                    + messageChannelSuffix,
                getCodec());
        if (api != null) {
          channel.setMessageHandler(
              (message, reply) -> {
                ArrayList<Object> wrapped = new ArrayList<Object>();
                try {
                  Boolean output = api.areZoomControlsEnabled();
                  wrapped.add(0, output);
                } catch (Throwable exception) {
                  ArrayList<Object> wrappedError = wrapError(exception);
                  wrapped = wrappedError;
                }
                reply.reply(wrapped);
              });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(
                binaryMessenger,
                "dev.flutter.pigeon.google_maps_flutter_android.MapsInspectorApi.areScrollGesturesEnabled"
                    + messageChannelSuffix,
                getCodec());
        if (api != null) {
          channel.setMessageHandler(
              (message, reply) -> {
                ArrayList<Object> wrapped = new ArrayList<Object>();
                try {
                  Boolean output = api.areScrollGesturesEnabled();
                  wrapped.add(0, output);
                } catch (Throwable exception) {
                  ArrayList<Object> wrappedError = wrapError(exception);
                  wrapped = wrappedError;
                }
                reply.reply(wrapped);
              });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(
                binaryMessenger,
                "dev.flutter.pigeon.google_maps_flutter_android.MapsInspectorApi.areTiltGesturesEnabled"
                    + messageChannelSuffix,
                getCodec());
        if (api != null) {
          channel.setMessageHandler(
              (message, reply) -> {
                ArrayList<Object> wrapped = new ArrayList<Object>();
                try {
                  Boolean output = api.areTiltGesturesEnabled();
                  wrapped.add(0, output);
                } catch (Throwable exception) {
                  ArrayList<Object> wrappedError = wrapError(exception);
                  wrapped = wrappedError;
                }
                reply.reply(wrapped);
              });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(
                binaryMessenger,
                "dev.flutter.pigeon.google_maps_flutter_android.MapsInspectorApi.areZoomGesturesEnabled"
                    + messageChannelSuffix,
                getCodec());
        if (api != null) {
          channel.setMessageHandler(
              (message, reply) -> {
                ArrayList<Object> wrapped = new ArrayList<Object>();
                try {
                  Boolean output = api.areZoomGesturesEnabled();
                  wrapped.add(0, output);
                } catch (Throwable exception) {
                  ArrayList<Object> wrappedError = wrapError(exception);
                  wrapped = wrappedError;
                }
                reply.reply(wrapped);
              });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(
                binaryMessenger,
                "dev.flutter.pigeon.google_maps_flutter_android.MapsInspectorApi.isCompassEnabled"
                    + messageChannelSuffix,
                getCodec());
        if (api != null) {
          channel.setMessageHandler(
              (message, reply) -> {
                ArrayList<Object> wrapped = new ArrayList<Object>();
                try {
                  Boolean output = api.isCompassEnabled();
                  wrapped.add(0, output);
                } catch (Throwable exception) {
                  ArrayList<Object> wrappedError = wrapError(exception);
                  wrapped = wrappedError;
                }
                reply.reply(wrapped);
              });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(
                binaryMessenger,
                "dev.flutter.pigeon.google_maps_flutter_android.MapsInspectorApi.isLiteModeEnabled"
                    + messageChannelSuffix,
                getCodec());
        if (api != null) {
          channel.setMessageHandler(
              (message, reply) -> {
                ArrayList<Object> wrapped = new ArrayList<Object>();
                try {
                  Boolean output = api.isLiteModeEnabled();
                  wrapped.add(0, output);
                } catch (Throwable exception) {
                  ArrayList<Object> wrappedError = wrapError(exception);
                  wrapped = wrappedError;
                }
                reply.reply(wrapped);
              });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(
                binaryMessenger,
                "dev.flutter.pigeon.google_maps_flutter_android.MapsInspectorApi.isMapToolbarEnabled"
                    + messageChannelSuffix,
                getCodec());
        if (api != null) {
          channel.setMessageHandler(
              (message, reply) -> {
                ArrayList<Object> wrapped = new ArrayList<Object>();
                try {
                  Boolean output = api.isMapToolbarEnabled();
                  wrapped.add(0, output);
                } catch (Throwable exception) {
                  ArrayList<Object> wrappedError = wrapError(exception);
                  wrapped = wrappedError;
                }
                reply.reply(wrapped);
              });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(
                binaryMessenger,
                "dev.flutter.pigeon.google_maps_flutter_android.MapsInspectorApi.isMyLocationButtonEnabled"
                    + messageChannelSuffix,
                getCodec());
        if (api != null) {
          channel.setMessageHandler(
              (message, reply) -> {
                ArrayList<Object> wrapped = new ArrayList<Object>();
                try {
                  Boolean output = api.isMyLocationButtonEnabled();
                  wrapped.add(0, output);
                } catch (Throwable exception) {
                  ArrayList<Object> wrappedError = wrapError(exception);
                  wrapped = wrappedError;
                }
                reply.reply(wrapped);
              });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(
                binaryMessenger,
                "dev.flutter.pigeon.google_maps_flutter_android.MapsInspectorApi.isTrafficEnabled"
                    + messageChannelSuffix,
                getCodec());
        if (api != null) {
          channel.setMessageHandler(
              (message, reply) -> {
                ArrayList<Object> wrapped = new ArrayList<Object>();
                try {
                  Boolean output = api.isTrafficEnabled();
                  wrapped.add(0, output);
                } catch (Throwable exception) {
                  ArrayList<Object> wrappedError = wrapError(exception);
                  wrapped = wrappedError;
                }
                reply.reply(wrapped);
              });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(
                binaryMessenger,
                "dev.flutter.pigeon.google_maps_flutter_android.MapsInspectorApi.getTileOverlayInfo"
                    + messageChannelSuffix,
                getCodec());
        if (api != null) {
          channel.setMessageHandler(
              (message, reply) -> {
                ArrayList<Object> wrapped = new ArrayList<Object>();
                ArrayList<Object> args = (ArrayList<Object>) message;
                String tileOverlayIdArg = (String) args.get(0);
                try {
                  PlatformTileLayer output = api.getTileOverlayInfo(tileOverlayIdArg);
                  wrapped.add(0, output);
                } catch (Throwable exception) {
                  ArrayList<Object> wrappedError = wrapError(exception);
                  wrapped = wrappedError;
                }
                reply.reply(wrapped);
              });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(
                binaryMessenger,
                "dev.flutter.pigeon.google_maps_flutter_android.MapsInspectorApi.getZoomRange"
                    + messageChannelSuffix,
                getCodec());
        if (api != null) {
          channel.setMessageHandler(
              (message, reply) -> {
                ArrayList<Object> wrapped = new ArrayList<Object>();
                try {
                  PlatformZoomRange output = api.getZoomRange();
                  wrapped.add(0, output);
                } catch (Throwable exception) {
                  ArrayList<Object> wrappedError = wrapError(exception);
                  wrapped = wrappedError;
                }
                reply.reply(wrapped);
              });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(
                binaryMessenger,
                "dev.flutter.pigeon.google_maps_flutter_android.MapsInspectorApi.getClusters"
                    + messageChannelSuffix,
                getCodec());
        if (api != null) {
          channel.setMessageHandler(
              (message, reply) -> {
                ArrayList<Object> wrapped = new ArrayList<Object>();
                ArrayList<Object> args = (ArrayList<Object>) message;
                String clusterManagerIdArg = (String) args.get(0);
                try {
                  List<PlatformCluster> output = api.getClusters(clusterManagerIdArg);
                  wrapped.add(0, output);
                } catch (Throwable exception) {
                  ArrayList<Object> wrappedError = wrapError(exception);
                  wrapped = wrappedError;
                }
                reply.reply(wrapped);
              });
        } else {
          channel.setMessageHandler(null);
        }
      }
    }
  }
}
