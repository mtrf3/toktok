package X;

import Y.ARunnableS44S0100000_8;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import com.ss.android.ugc.aweme.simkit.impl.player.TextureViewHolder;

/* loaded from: classes9.dex */
public final class J9Z implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ boolean LJLIL = true;
    public final /* synthetic */ J9Y LJLILLLLZI;
    public final /* synthetic */ TextureViewHolder LJLJI;

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onSurfaceTextureDestroyed:");
        LIZ.append(surfaceTexture);
        X1D.LIZIZ(LIZ);
        J9W j9w = this.LJLJI.LJFF;
        if (j9w != null) {
            j9w.onSurfaceDestroy();
        }
        if (!this.LJLIL) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onSurfaceTextureDestroyed: Surface:");
            LIZ2.append(this.LJLJI.LJ);
            LIZ2.append(", SurfaceTexture:");
            LIZ2.append(surfaceTexture);
            X1D.LIZIZ(LIZ2);
            this.LJLJI.LJ = null;
        }
        this.LJLILLLLZI.post(new ARunnableS44S0100000_8(this, 54));
        return !this.LJLIL;
    }

    public J9Z(TextureViewHolder textureViewHolder, J9Y j9y) {
        this.LJLJI = textureViewHolder;
        this.LJLILLLLZI = j9y;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onSurfaceTextureAvailable:");
        LIZ.append(surfaceTexture);
        X1D.LIZIZ(LIZ);
        if (this.LJLJI.LJ == null) {
            this.LJLJI.LJ = new Surface(surfaceTexture);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onSurfaceTextureAvailable: Surface:");
            LIZ2.append(this.LJLJI.LJ);
            LIZ2.append(", SurfaceTexture:");
            LIZ2.append(surfaceTexture);
            X1D.LIZIZ(LIZ2);
        }
        if (this.LJLIL) {
            this.LJLJI.LIZJ = surfaceTexture;
        }
        J9W j9w = this.LJLJI.LJFF;
        if (j9w != null) {
            j9w.LIZ();
        }
    }
}
