package com.byted.cast.mediacommon;

import android.content.Context;
import android.content.Intent;
import android.hardware.Camera;
import android.hardware.display.VirtualDisplay;
import android.media.AudioRecord;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import android.os.Handler;
import android.view.Surface;

/* loaded from: classes29.dex */
public interface ISafetyInterface {
    Intent createScreenCaptureIntent(MediaProjectionManager mediaProjectionManager);

    VirtualDisplay createVirtualDisplay(MediaProjection mediaProjection, String str, int i, int i2, int i3, int i4, Surface surface, VirtualDisplay.Callback callback, Handler handler);

    MediaProjection getMediaProjection(MediaProjectionManager mediaProjectionManager, int i, Intent intent);

    MediaProjectionManager getMediaProjectionManager(Context context);

    Camera openCamera();

    Camera openCamera(int i);

    void releaseCamera(Camera camera);

    void startRecording(AudioRecord audioRecord);

    void stop(AudioRecord audioRecord);
}
