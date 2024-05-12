package X;

import android.graphics.SurfaceTexture;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class IQ1 implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ C46581IPx LJLIL;

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surface, int i, int i2) {
        o.LJIIIZ(surface, "surface");
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surface) {
        o.LJIIIZ(surface, "surface");
    }

    public IQ1(C46581IPx c46581IPx) {
        this.LJLIL = c46581IPx;
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
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        o.LJIIIZ(surfaceTexture, "surfaceTexture");
        SurfaceTexture surfaceTexture2 = this.LJLIL.LIZJ;
        if (surfaceTexture2 == null || (Build.VERSION.SDK_INT >= 26 && surfaceTexture2.isReleased())) {
            C46581IPx c46581IPx = this.LJLIL;
            c46581IPx.LIZJ = surfaceTexture;
            c46581IPx.LIZLLL = new Surface(this.LJLIL.LIZJ);
            C46581IPx c46581IPx2 = this.LJLIL;
            IWF iwf = c46581IPx2.LJI;
            if (iwf != null) {
                iwf.setSurface(c46581IPx2.LIZLLL);
            }
        } else {
            C46581IPx c46581IPx3 = this.LJLIL;
            SurfaceTexture surfaceTexture3 = c46581IPx3.LIZJ;
            if (surfaceTexture3 != null && !o.LJ(surfaceTexture3, c46581IPx3.LIZ.getSurfaceTexture())) {
                c46581IPx3.LIZ.setSurfaceTexture(surfaceTexture3);
                c46581IPx3.LIZLLL = new Surface(surfaceTexture3);
            }
        }
        C46581IPx c46581IPx4 = this.LJLIL;
        c46581IPx4.LIZIZ = true;
        if (c46581IPx4.LJII) {
            c46581IPx4.start();
        }
    }
}
