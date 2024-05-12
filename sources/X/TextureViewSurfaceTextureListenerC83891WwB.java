package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;

/* renamed from: X.WwB, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class TextureViewSurfaceTextureListenerC83891WwB implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ YD6 LJLIL;

    public TextureViewSurfaceTextureListenerC83891WwB(YD6 yd6) {
        this.LJLIL = yd6;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        Surface surface;
        YD6 yd6 = this.LJLIL;
        if (yd6.LJLJI && !yd6.LJLJJI && (surface = yd6.LJLJJL) != null) {
            surface.release();
            YD6 yd62 = this.LJLIL;
            yd62.LJLJJL = null;
            yd62.LJLJJLL = null;
        }
        TextureView.SurfaceTextureListener surfaceTextureListener = this.LJLIL.LJLIL;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureDestroyed(surfaceTexture);
        }
        YDA yda = this.LJLIL.LJLILLLLZI;
        if (yda != null) {
            ((YS2) yda).LJIJJ();
        }
        YD6 yd63 = this.LJLIL;
        if (!yd63.LJLJI) {
            Surface surface2 = yd63.LJLJJL;
            if (surface2 != null) {
                surface2.release();
                yd63.LJLJJL = null;
            }
            yd63.LJLJJI = false;
            yd63.LJLJJL = null;
            yd63.LJLJJLL = null;
        }
        return !this.LJLIL.LJLJI;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        TextureView.SurfaceTextureListener surfaceTextureListener = this.LJLIL.LJLIL;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureUpdated(surfaceTexture);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        YD6 yd6 = this.LJLIL;
        if (yd6.LJLJI) {
            Surface surface = yd6.LJLJJL;
            if (surface != null && (!yd6.LJLJJI || !surface.isValid())) {
                this.LJLIL.LJLJJL.release();
                YD6 yd62 = this.LJLIL;
                yd62.LJLJJL = null;
                yd62.LJLJJLL = null;
            }
            YD6 yd63 = this.LJLIL;
            if (yd63.LJLJJL == null) {
                yd63.LJLJJL = new Surface(surfaceTexture);
                this.LJLIL.LJLJJLL = surfaceTexture;
            } else {
                try {
                    SurfaceTexture surfaceTexture2 = yd63.LJLJJLL;
                    if (surfaceTexture2 == null || YD6.LIZIZ(surfaceTexture2)) {
                        YD6 yd64 = this.LJLIL;
                        yd64.LJLJJLL = surfaceTexture;
                        yd64.LJLJJL = new Surface(surfaceTexture);
                    } else {
                        YD6 yd65 = this.LJLIL;
                        if (yd65.LJLJJLL != yd65.getSurfaceTexture()) {
                            YD6 yd66 = this.LJLIL;
                            yd66.setSurfaceTexture(yd66.LJLJJLL);
                        }
                    }
                } catch (Exception e) {
                    StringBuilder LIZIZ = C59895Nf1.LIZIZ(e, "surface_texture_available:");
                    LIZIZ.append(e.getMessage());
                    X1D.LIZIZ(LIZIZ);
                    YD6 yd67 = this.LJLIL;
                    yd67.LJLJJLL = surfaceTexture;
                    yd67.LJLJJL = new Surface(surfaceTexture);
                }
            }
            this.LJLIL.LJLJJI = true;
        } else {
            yd6.LJLJJL = new Surface(surfaceTexture);
            this.LJLIL.LJLJJLL = surfaceTexture;
        }
        YDA yda = this.LJLIL.LJLILLLLZI;
        if (yda != null) {
            ((YS2) yda).LJIJI();
        }
        YD6 yd68 = this.LJLIL;
        TextureView.SurfaceTextureListener surfaceTextureListener = yd68.LJLIL;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureAvailable(yd68.LJLJJLL, i, i2);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onSurfaceTextureSizeChanged width:");
        LIZ.append(i);
        LIZ.append(" height:");
        LIZ.append(i2);
        X1D.LIZIZ(LIZ);
        YDA yda = this.LJLIL.LJLILLLLZI;
        if (yda != null) {
            ((YS2) yda).LJIJ();
        }
        TextureView.SurfaceTextureListener surfaceTextureListener = this.LJLIL.LJLIL;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
        }
    }
}
