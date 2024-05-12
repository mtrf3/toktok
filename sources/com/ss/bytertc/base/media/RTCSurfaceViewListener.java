package com.ss.bytertc.base.media;

import X.C16880lQ;
import android.os.Handler;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.ss.bytertc.base.media.RTCSurfaceViewListener;

/* loaded from: classes33.dex */
public class RTCSurfaceViewListener implements SurfaceHolder.Callback {
    public final String key;
    public long nativeSurfaceHelperHandle;
    public SurfaceView surfaceView;

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    public void resetCallback() {
        this.nativeSurfaceHelperHandle = 0L;
        SurfaceView surfaceView = this.surfaceView;
        if (surfaceView != null) {
            surfaceView.getHolder().removeCallback(this);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        if (this.nativeSurfaceHelperHandle != 0 && surfaceHolder != null && surfaceHolder.getSurface() != null && surfaceHolder.getSurface().isValid()) {
            RTCSurfaceHelper.nativeSetRenderTarget(this.nativeSurfaceHelperHandle, surfaceHolder.getSurface(), this.key);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        long j = this.nativeSurfaceHelperHandle;
        if (j != 0) {
            RTCSurfaceHelper.nativeSetRenderTarget(j, null, this.key);
        }
    }

    public RTCSurfaceViewListener(SurfaceView surfaceView, final long j, final String str) {
        SurfaceHolder holder;
        Surface surface;
        final Surface surface2;
        this.nativeSurfaceHelperHandle = j;
        this.surfaceView = surfaceView;
        this.key = str;
        if (surfaceView != null && surfaceView.getHolder() != null && (holder = this.surfaceView.getHolder()) != null && holder.getSurface() != null && (surface = holder.getSurface()) != null && surface.isValid() && (surface2 = holder.getSurface()) != null && this.nativeSurfaceHelperHandle != 0) {
            new Handler(C16880lQ.LLJJJJ()).post(new Runnable() { // from class: X.ZVa
                @Override // java.lang.Runnable
                public final void run() {
                    RTCSurfaceViewListener.this.lambda$new$0(surface2, j, str);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(Surface surface, long j, String str) {
        Surface surface2 = this.surfaceView.getHolder().getSurface();
        if (surface2 != null && surface2.isValid() && surface2 == surface) {
            RTCSurfaceHelper.nativeSetRenderTarget(j, surface2, str);
        }
    }
}
