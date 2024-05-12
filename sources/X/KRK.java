package X;

import android.graphics.SurfaceTexture;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KRK implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ KRJ LJLIL;

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surface, int i, int i2) {
        o.LJIIIZ(surface, "surface");
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surface) {
        o.LJIIIZ(surface, "surface");
    }

    public KRK(KRJ krj) {
        this.LJLIL = krj;
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
            KRJ krj = this.LJLIL;
            krj.LIZJ = surface;
            IWF iwf = krj.LJ;
            if (iwf != null) {
                iwf.setSurface(new Surface(this.LJLIL.LIZJ));
            }
        } else {
            KRJ krj2 = this.LJLIL;
            SurfaceTexture surfaceTexture2 = krj2.LIZJ;
            if (surfaceTexture2 != null && !o.LJ(surfaceTexture2, krj2.LIZ.getVideoView().getSurfaceTexture())) {
                krj2.LIZ.getVideoView().setSurfaceTexture(surfaceTexture2);
            }
        }
        KRJ krj3 = this.LJLIL;
        krj3.LIZIZ = true;
        if (krj3.LJFF) {
            krj3.start(krj3.LJIIIZ);
            this.LJLIL.LJIIIZ = 0;
        }
    }
}
