package com.byted.cast.sdk.view;

import X.C90652Zhw;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.byted.cast.sdk.view.IRenderView;

/* loaded from: classes29.dex */
public final class SurfaceRenderView$InternalSurfaceHolder implements IRenderView.ISurfaceHolder {
    public SurfaceHolder mSurfaceHolder;
    public C90652Zhw mSurfaceView;

    @Override // com.byted.cast.sdk.view.IRenderView.ISurfaceHolder
    public SurfaceTexture getSurfaceTexture() {
        return null;
    }

    @Override // com.byted.cast.sdk.view.IRenderView.ISurfaceHolder
    public Surface openSurface() {
        SurfaceHolder surfaceHolder = this.mSurfaceHolder;
        if (surfaceHolder == null) {
            return null;
        }
        return surfaceHolder.getSurface();
    }

    @Override // com.byted.cast.sdk.view.IRenderView.ISurfaceHolder
    public IRenderView getRenderView() {
        return this.mSurfaceView;
    }

    @Override // com.byted.cast.sdk.view.IRenderView.ISurfaceHolder
    public SurfaceHolder getSurfaceHolder() {
        return this.mSurfaceHolder;
    }

    public SurfaceRenderView$InternalSurfaceHolder(C90652Zhw c90652Zhw, SurfaceHolder surfaceHolder) {
        this.mSurfaceView = c90652Zhw;
        this.mSurfaceHolder = surfaceHolder;
    }
}
