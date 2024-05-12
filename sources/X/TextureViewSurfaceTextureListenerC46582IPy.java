package X;

import android.graphics.SurfaceTexture;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import kotlin.jvm.internal.o;

/* renamed from: X.IPy, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class TextureViewSurfaceTextureListenerC46582IPy implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ C46578IPu LJLIL;

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surface, int i, int i2) {
        o.LJIIIZ(surface, "surface");
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surface) {
        o.LJIIIZ(surface, "surface");
    }

    public TextureViewSurfaceTextureListenerC46582IPy(C46578IPu c46578IPu) {
        this.LJLIL = c46578IPu;
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
            C46578IPu c46578IPu = this.LJLIL;
            c46578IPu.LIZJ = surface;
            IWF iwf = c46578IPu.LJII;
            if (iwf != null) {
                iwf.setSurface(new Surface(this.LJLIL.LIZJ));
            }
        } else {
            C46578IPu c46578IPu2 = this.LJLIL;
            SurfaceTexture surfaceTexture2 = c46578IPu2.LIZJ;
            if (surfaceTexture2 != null && !o.LJ(surfaceTexture2, c46578IPu2.LIZ.getVideoView().getSurfaceTexture())) {
                c46578IPu2.LIZ.getVideoView().setSurfaceTexture(surfaceTexture2);
            }
        }
        C46578IPu c46578IPu3 = this.LJLIL;
        c46578IPu3.LIZIZ = true;
        if (c46578IPu3.LJIIIIZZ) {
            c46578IPu3.LJIIIIZZ = false;
            IWF iwf2 = c46578IPu3.LJII;
            if (iwf2 != null) {
                c46578IPu3.LJ();
                iwf2.LJJJLL(c46578IPu3.LJIILJJIL);
                iwf2.LJJJJI(c46578IPu3.LJ, true);
                iwf2.LJJJLIIL();
            }
        }
    }
}
