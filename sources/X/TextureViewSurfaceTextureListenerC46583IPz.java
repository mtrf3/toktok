package X;

import android.graphics.SurfaceTexture;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import kotlin.jvm.internal.o;

/* renamed from: X.IPz, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class TextureViewSurfaceTextureListenerC46583IPz implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ C46580IPw LJLIL;

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surface, int i, int i2) {
        o.LJIIIZ(surface, "surface");
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surface) {
        o.LJIIIZ(surface, "surface");
    }

    public TextureViewSurfaceTextureListenerC46583IPz(C46580IPw c46580IPw) {
        this.LJLIL = c46580IPw;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surface) {
        o.LJIIIZ(surface, "surface");
        SurfaceTexture surfaceTexture = this.LJLIL.LIZJ;
        if (surfaceTexture != null && (Build.VERSION.SDK_INT < 26 || !surfaceTexture.isReleased())) {
            return false;
        }
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surface, int i, int i2) {
        o.LJIIIZ(surface, "surface");
        SurfaceTexture surfaceTexture = this.LJLIL.LIZJ;
        if (surfaceTexture == null || (Build.VERSION.SDK_INT >= 26 && surfaceTexture.isReleased())) {
            C46580IPw c46580IPw = this.LJLIL;
            c46580IPw.LIZJ = surface;
            IWF iwf = c46580IPw.LJII;
            if (iwf != null) {
                iwf.setSurface(new Surface(this.LJLIL.LIZJ));
            }
        } else {
            C46580IPw c46580IPw2 = this.LJLIL;
            SurfaceTexture surfaceTexture2 = c46580IPw2.LIZJ;
            if (surfaceTexture2 != null && !o.LJ(surfaceTexture2, c46580IPw2.LIZ.getVideoView().getSurfaceTexture())) {
                c46580IPw2.LIZ.getVideoView().setSurfaceTexture(surfaceTexture2);
            }
        }
        C46580IPw c46580IPw3 = this.LJLIL;
        c46580IPw3.LIZIZ = true;
        if (c46580IPw3.LJIIIIZZ) {
            c46580IPw3.LJIIIIZZ = false;
            IWF iwf2 = c46580IPw3.LJII;
            if (iwf2 != null) {
                c46580IPw3.LJI();
                iwf2.LJJJLL(c46580IPw3.LJIILLIIL);
                iwf2.LJJJJI(c46580IPw3.LJ, true);
                iwf2.LJJJLIIL();
            }
        }
    }
}
