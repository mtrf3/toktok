package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;

/* renamed from: X.VBx, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class TextureViewSurfaceTextureListenerC79341VBx implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ C79340VBw LJLIL;

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public TextureViewSurfaceTextureListenerC79341VBx(C79340VBw c79340VBw) {
        this.LJLIL = c79340VBw;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onSurfaceTextureDestroyed ,shouldDestroy=");
        LIZ.append(this.LJLIL.LLIIII);
        B4I.LIZ("LivePlayController", X1D.LIZIZ(LIZ));
        C79340VBw c79340VBw = this.LJLIL;
        VBT vbt = c79340VBw.LJLIL;
        if (vbt != null && c79340VBw.LLIIII) {
            ((VAE) vbt).LJII(null);
            VAE vae = (VAE) this.LJLIL.LJLIL;
            vae.getClass();
            vae.LJI(VAE.LIZJ(29, null));
        }
        return this.LJLIL.LLIIII;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        B4I.LIZ("LivePlayController", "onSurfaceTextureAvailable");
        TextureView textureView = this.LJLIL.LJLJLLL;
        if (textureView != null) {
            textureView.setSurfaceTextureListener(null);
        }
        this.LJLIL.LJJIIJ();
        C79340VBw c79340VBw = this.LJLIL;
        B4E b4e = c79340VBw.LJLJJLL;
        if (((b4e instanceof CVR) || (b4e instanceof C31482CXe)) && c79340VBw.LLIIII) {
            if (c79340VBw.LJLJL != null) {
                VBT vbt = c79340VBw.LJLIL;
                if (vbt != null) {
                    ((VAE) vbt).LJI(VAE.LIZJ(29, null));
                }
                this.LJLIL.LJLJL.release();
            }
            this.LJLIL.LJLJL = new Surface(surfaceTexture);
            this.LJLIL.LJJLIIIJJI(true);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        B4I.LIZ("LivePlayController", C48690J9a.LJIIJJI("onSurfaceTextureSizeChanged -> width: ", i, ",height: ", i2, ","));
    }
}
