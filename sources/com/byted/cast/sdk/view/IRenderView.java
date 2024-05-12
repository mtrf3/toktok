package com.byted.cast.sdk.view;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.View;

/* loaded from: classes29.dex */
public interface IRenderView {

    /* loaded from: classes29.dex */
    public interface IRenderCallback {
        void onSurfaceChanged(ISurfaceHolder iSurfaceHolder, int i, int i2, int i3);

        void onSurfaceCreated(ISurfaceHolder iSurfaceHolder, int i, int i2);

        void onSurfaceDestroyed(ISurfaceHolder iSurfaceHolder);

        void onSurfaceTextureCreated(IRenderView iRenderView, Surface surface);
    }

    /* loaded from: classes29.dex */
    public interface ISurfaceHolder {
        IRenderView getRenderView();

        SurfaceHolder getSurfaceHolder();

        SurfaceTexture getSurfaceTexture();

        Surface openSurface();
    }

    void addRenderCallback(IRenderCallback iRenderCallback);

    View getView();

    void removeRenderCallback(IRenderCallback iRenderCallback);

    void setAspectRatio(int i);

    void setVideoRotation(int i);

    void setVideoSampleAspectRatio(int i, int i2);

    void setVideoSize(int i, int i2);
}
