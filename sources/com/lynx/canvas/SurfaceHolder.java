package com.lynx.canvas;

import X.InterfaceC63882P5i;
import X.O5Y;
import X.P60;
import X.X1D;
import android.graphics.SurfaceTexture;
import android.view.Surface;

/* loaded from: classes12.dex */
public class SurfaceHolder implements InterfaceC63882P5i {
    public final FirstFrameAwareSurfaceTexture LJLIL;
    public final Surface LJLILLLLZI;
    public final P60 LJLJI;
    public final float LJLJJI;
    public boolean LJLJJL;
    public int LJLJJLL;
    public int LJLJL;

    public static native void nativeSurfaceChanged(long j, int i, int i2);

    public static native void nativeSurfaceCreated(long j, Surface surface, FirstFrameAwareSurfaceTexture firstFrameAwareSurfaceTexture, int i, int i2, float f);

    public static native void nativeSurfaceDestroyed(long j);

    @Override // X.InterfaceC63882P5i
    public final void onFirstFrameAvailable() {
        O5Y.LJJJ("KryptonSurfaceHolder", "onFirstFrameAvailable");
        ((UICanvasView) this.LJLJI).LIZLLL();
    }

    public final void LIZ(long j) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("dispose surface texture with ");
        LIZ.append(this.LJLIL);
        O5Y.LJJJ("KryptonSurfaceHolder", X1D.LIZIZ(LIZ));
        nativeSurfaceDestroyed(j);
        this.LJLILLLLZI.release();
    }

    public final void LIZIZ(UICanvasView uICanvasView) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("initTextureView with ");
        LIZ.append(uICanvasView);
        O5Y.LJJJ("KryptonSurfaceHolder", X1D.LIZIZ(LIZ));
        SurfaceTexture surfaceTexture = uICanvasView.getSurfaceTexture();
        if (this.LJLIL.equals(surfaceTexture)) {
            return;
        }
        if (surfaceTexture != null) {
            O5Y.LJJJ("KryptonSurfaceHolder", "Init TextureView but it has already another st.");
        }
        uICanvasView.setSurfaceTexture(this.LJLIL);
    }

    public SurfaceHolder(P60 p60, float f) {
        FirstFrameAwareSurfaceTexture firstFrameAwareSurfaceTexture = new FirstFrameAwareSurfaceTexture();
        this.LJLIL = firstFrameAwareSurfaceTexture;
        firstFrameAwareSurfaceTexture.detachFromGLContext();
        firstFrameAwareSurfaceTexture.LJLILLLLZI = this;
        if (firstFrameAwareSurfaceTexture.LJLJI) {
            onFirstFrameAvailable();
        }
        this.LJLILLLLZI = new Surface(firstFrameAwareSurfaceTexture);
        this.LJLJI = p60;
        this.LJLJJLL = 1;
        this.LJLJL = 1;
        this.LJLJJI = f;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Created with surface texture ");
        LIZ.append(firstFrameAwareSurfaceTexture);
        O5Y.LJJJ("KryptonSurfaceHolder", X1D.LIZIZ(LIZ));
    }

    public final void LIZJ(int i, int i2, long j) {
        if (this.LJLJJL && this.LJLJJLL == i && this.LJLJL == i2) {
            return;
        }
        if (i == 0 || i2 == 0) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onSurfaceTextureSizeChanged with invalid size ");
            LIZ.append(i);
            LIZ.append(" / ");
            LIZ.append(i2);
            O5Y.LJJLIIIJJI("KryptonSurfaceHolder", X1D.LIZIZ(LIZ));
            return;
        }
        this.LJLJJLL = i;
        this.LJLJL = i2;
        this.LJLIL.setDefaultBufferSize(i, i2);
        if (!this.LJLJJL) {
            O5Y.LJJJ("KryptonSurfaceHolder", "first valid size, trigger created.");
            nativeSurfaceCreated(j, this.LJLILLLLZI, this.LJLIL, this.LJLJJLL, this.LJLJL, this.LJLJJI);
            this.LJLJJL = true;
            return;
        }
        nativeSurfaceChanged(j, this.LJLJJLL, this.LJLJL);
    }
}
