package X;

import android.graphics.SurfaceTexture;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class IQ0 implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ C46579IPv LJLIL;

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surface, int i, int i2) {
        o.LJIIIZ(surface, "surface");
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surface) {
        o.LJIIIZ(surface, "surface");
    }

    public IQ0(C46579IPv c46579IPv) {
        this.LJLIL = c46579IPv;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surface) {
        o.LJIIIZ(surface, "surface");
        SurfaceTexture surfaceTexture = this.LJLIL.LIZLLL;
        if (surfaceTexture != null && (Build.VERSION.SDK_INT < 26 || !surfaceTexture.isReleased())) {
            return false;
        }
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surface, int i, int i2) {
        o.LJIIIZ(surface, "surface");
        SurfaceTexture surfaceTexture = this.LJLIL.LIZLLL;
        if (surfaceTexture == null || (Build.VERSION.SDK_INT >= 26 && surfaceTexture.isReleased())) {
            C46579IPv c46579IPv = this.LJLIL;
            c46579IPv.LIZLLL = surface;
            IWF iwf = c46579IPv.LJII;
            if (iwf != null) {
                iwf.setSurface(new Surface(this.LJLIL.LIZLLL));
            }
        } else {
            C46579IPv c46579IPv2 = this.LJLIL;
            SurfaceTexture surfaceTexture2 = c46579IPv2.LIZLLL;
            if (surfaceTexture2 != null && !o.LJ(surfaceTexture2, c46579IPv2.LIZ.getVideoView().getSurfaceTexture())) {
                c46579IPv2.LIZ.getVideoView().setSurfaceTexture(surfaceTexture2);
            }
        }
        C46579IPv c46579IPv3 = this.LJLIL;
        c46579IPv3.LIZJ = true;
        if (c46579IPv3.LJIIIIZZ) {
            c46579IPv3.start(c46579IPv3.LJIIL);
            this.LJLIL.LJIIL = 0;
        }
    }
}
