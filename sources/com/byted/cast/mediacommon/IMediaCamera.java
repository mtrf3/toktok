package com.byted.cast.mediacommon;

import android.graphics.Point;
import android.graphics.SurfaceTexture;
import com.byted.cast.common.config.Config;

/* loaded from: classes29.dex */
public interface IMediaCamera {
    Point getCameraSize();

    int getFps();

    void openCamera(int i, int i2, int i3, int i4, int i5);

    void releaseCamera();

    void setConfig(Config config);

    void setFlashEnable(boolean z);

    void setStartCert(Object obj);

    void setStopCert(Object obj);

    void startPreview(SurfaceTexture surfaceTexture);
}
