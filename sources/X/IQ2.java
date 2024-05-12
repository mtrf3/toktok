package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class IQ2 implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ IQ5 LJLIL;

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture p0, int i, int i2) {
        o.LJIIIZ(p0, "p0");
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture p0) {
        o.LJIIIZ(p0, "p0");
    }

    public IQ2(IQ5 iq5) {
        this.LJLIL = iq5;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surface) {
        o.LJIIIZ(surface, "surface");
        IQ5 iq5 = this.LJLIL;
        iq5.LJFF = false;
        iq5.LJ = null;
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surface, int i, int i2) {
        o.LJIIIZ(surface, "surface");
        IQ5 iq5 = this.LJLIL;
        SurfaceTexture surfaceTexture = iq5.LJ;
        if (surfaceTexture == null) {
            iq5.LJ = surface;
            iq5.LIZJ.setSurface(new Surface(surface));
        } else if (!o.LJ(surfaceTexture, iq5.LIZIZ.getVideoView().getSurfaceTexture())) {
            iq5.LIZIZ.getVideoView().setSurfaceTexture(surfaceTexture);
        }
        IQ5 iq52 = this.LJLIL;
        iq52.LJFF = true;
        if (iq52.LJI) {
            iq52.start(0);
        }
    }
}
