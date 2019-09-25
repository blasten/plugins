package dev.flutter.plugins.camera;

import androidx.annotation.NonNull;

import io.flutter.plugin.common.PluginRegistry;

/* package */ interface CameraPermissions {

  boolean hasCameraPermission();

  boolean hasAudioPermission();

  void requestPermissions(boolean enableAudio, ResultCallback callback);

  void addRequestPermissionsResultListener(@NonNull PluginRegistry.RequestPermissionsResultListener listener);

  interface ResultCallback {
    void onSuccess();
    void onResult(String errorCode, String errorDescription);
  }
}
