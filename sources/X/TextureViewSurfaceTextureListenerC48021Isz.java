package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;

/* renamed from: X.Isz, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class TextureViewSurfaceTextureListenerC48021Isz implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ C48023It1 LJLIL;

    public TextureViewSurfaceTextureListenerC48021Isz(C48023It1 c48023It1) {
        this.LJLIL = c48023It1;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        Surface surface;
        C48023It1 c48023It1 = this.LJLIL;
        if (c48023It1.LJLILLLLZI && !c48023It1.LJLJI && (surface = c48023It1.LJLJJL) != null) {
            surface.release();
            C48023It1 c48023It12 = this.LJLIL;
            c48023It12.LJLJJL = null;
            c48023It12.LJLJJLL = null;
        }
        this.LJLIL.getClass();
        TextureView.SurfaceTextureListener surfaceTextureListener = this.LJLIL.LJLIL;
        if (surfaceTextureListener != null && surfaceTextureListener.onSurfaceTextureDestroyed(surfaceTexture)) {
            this.LJLIL.LIZ();
            return true;
        }
        return false;
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
        C48023It1 c48023It1 = this.LJLIL;
        if (c48023It1.LJLILLLLZI) {
            c48023It1.LJLJJI = true;
            Surface surface = c48023It1.LJLJJL;
            if (surface != null && (!c48023It1.LJLJI || !surface.isValid())) {
                this.LJLIL.LJLJJL.release();
                C48023It1 c48023It12 = this.LJLIL;
                c48023It12.LJLJJL = null;
                c48023It12.LJLJJLL = null;
            }
            C48023It1 c48023It13 = this.LJLIL;
            if (c48023It13.LJLJJL == null) {
                c48023It13.LJLJJL = new Surface(surfaceTexture);
                this.LJLIL.LJLJJLL = surfaceTexture;
            } else {
                try {
                    SurfaceTexture surfaceTexture2 = c48023It13.LJLJJLL;
                    if (surfaceTexture2 != null) {
                        c48023It13.setSurfaceTexture(surfaceTexture2);
                    }
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
            this.LJLIL.getClass();
            this.LJLIL.LJLJI = true;
        } else {
            c48023It1.LJLJJL = new Surface(surfaceTexture);
            this.LJLIL.LJLJJLL = surfaceTexture;
        }
        C48023It1 c48023It14 = this.LJLIL;
        TextureView.SurfaceTextureListener surfaceTextureListener = c48023It14.LJLIL;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureAvailable(c48023It14.LJLJJLL, i, i2);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        TextureView.SurfaceTextureListener surfaceTextureListener = this.LJLIL.LJLIL;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
        }
    }
}
