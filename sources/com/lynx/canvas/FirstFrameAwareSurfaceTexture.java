package com.lynx.canvas;

import X.InterfaceC63882P5i;
import X.O5Y;
import X.X1D;
import android.graphics.SurfaceTexture;
import android.os.Handler;

/* loaded from: classes12.dex */
public class FirstFrameAwareSurfaceTexture extends SurfaceTexture implements SurfaceTexture.OnFrameAvailableListener {
    public SurfaceTexture.OnFrameAvailableListener LJLIL;
    public InterfaceC63882P5i LJLILLLLZI;
    public boolean LJLJI;

    public FirstFrameAwareSurfaceTexture() {
        super(0);
    }

    @Override // android.graphics.SurfaceTexture
    public void release() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("release with ");
        LIZ.append(this);
        O5Y.LJJJ("KryptonFirstFrameAwareSurfaceTexture", X1D.LIZIZ(LIZ));
        super.release();
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener = this.LJLIL;
        if (onFrameAvailableListener != null) {
            onFrameAvailableListener.onFrameAvailable(surfaceTexture);
        }
        if (!this.LJLJI) {
            this.LJLJI = true;
            InterfaceC63882P5i interfaceC63882P5i = this.LJLILLLLZI;
            if (interfaceC63882P5i != null) {
                interfaceC63882P5i.onFirstFrameAvailable();
            }
        }
    }

    @Override // android.graphics.SurfaceTexture
    public final void setOnFrameAvailableListener(SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener) {
        setOnFrameAvailableListener(onFrameAvailableListener, null);
    }

    @Override // android.graphics.SurfaceTexture
    public final void setOnFrameAvailableListener(SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener, Handler handler) {
        this.LJLIL = onFrameAvailableListener;
        if (onFrameAvailableListener == null) {
            super.setOnFrameAvailableListener(null, null);
        } else {
            super.setOnFrameAvailableListener(this, handler);
        }
    }
}
