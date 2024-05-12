package com.bytedance.realx;

import android.view.Surface;

/* loaded from: classes33.dex */
public class RXVideoSurfaceController {
    public static RXVideoSurfaceController instance = new RXVideoSurfaceController();
    public RXSurfaceListener mSurfaceLisener;
    public boolean usePassSurfaceMode;

    /* loaded from: classes33.dex */
    public interface RXSurfaceListener {
        void onSurfaceAvailable(Surface surface);
    }

    public static RXVideoSurfaceController getInstance() {
        return instance;
    }

    public boolean usePassSurfaceMode() {
        return this.usePassSurfaceMode;
    }

    public void setPassSurfaceMode(boolean z) {
        this.usePassSurfaceMode = z;
    }

    public void setSurface(Surface surface) {
        RXSurfaceListener rXSurfaceListener = this.mSurfaceLisener;
        if (rXSurfaceListener != null) {
            rXSurfaceListener.onSurfaceAvailable(surface);
        }
    }

    public void setSurfaceListener(RXSurfaceListener rXSurfaceListener) {
        this.mSurfaceLisener = rXSurfaceListener;
    }
}
