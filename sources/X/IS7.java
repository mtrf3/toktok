package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class IS7 implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ JIZ LJLIL;

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture p0, int i, int i2) {
        o.LJIIIZ(p0, "p0");
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surface) {
        o.LJIIIZ(surface, "surface");
    }

    public IS7(JIZ jiz) {
        this.LJLIL = jiz;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surface) {
        o.LJIIIZ(surface, "surface");
        IQ9 iq9 = this.LJLIL.LJLJI;
        if (iq9 != null) {
            SurfaceTexture surfaceTexture = iq9.LIZ;
            if (surfaceTexture == null || IQ9.LJIIIIZZ(surfaceTexture)) {
                return true;
            }
            return false;
        }
        o.LJIJI("playerController");
        throw null;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surface, int i, int i2) {
        o.LJIIIZ(surface, "surface");
        JIZ jiz = this.LJLIL;
        IQ9 iq9 = jiz.LJLJI;
        if (iq9 != null) {
            SurfaceTexture surfaceTexture = iq9.LIZ;
            if (surfaceTexture == null || jiz.LJLJJL || IQ9.LJIIIIZZ(surfaceTexture)) {
                JIZ jiz2 = this.LJLIL;
                if (jiz2.LJLJJL) {
                    IQ9 iq92 = jiz2.LJLJI;
                    if (iq92 != null) {
                        iq92.LJI(new Surface(surface));
                        JIZ jiz3 = this.LJLIL;
                        IQ9 iq93 = jiz3.LJLJI;
                        if (iq93 != null) {
                            iq93.LIZ = surface;
                            jiz3.LJLJJL = false;
                            return;
                        } else {
                            o.LJIJI("playerController");
                            throw null;
                        }
                    }
                    o.LJIJI("playerController");
                    throw null;
                }
                return;
            }
            JIZ jiz4 = this.LJLIL;
            IQ9 iq94 = jiz4.LJLJI;
            if (iq94 != null) {
                SurfaceTexture surfaceTexture2 = iq94.LIZ;
                if (surfaceTexture2 == null || o.LJ(surfaceTexture2, ((TextureView) jiz4.LJLILLLLZI.LJ(R.id.n8n)).getSurfaceTexture())) {
                    return;
                }
                ((TextureView) jiz4.LJLILLLLZI.LJ(R.id.n8n)).setSurfaceTexture(surfaceTexture2);
                return;
            }
            o.LJIJI("playerController");
            throw null;
        }
        o.LJIJI("playerController");
        throw null;
    }
}
