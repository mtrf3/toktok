package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import com.ss.ttvideoengine.TTVideoEngine;
import kotlin.jvm.internal.o;

/* renamed from: X.Hzx, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class TextureViewSurfaceTextureListenerC45905Hzx implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ C45903Hzv LJLIL;

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surface) {
        o.LJIIIZ(surface, "surface");
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surface, int i, int i2) {
        o.LJIIIZ(surface, "surface");
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surface) {
        o.LJIIIZ(surface, "surface");
    }

    public TextureViewSurfaceTextureListenerC45905Hzx(C45903Hzv c45903Hzv) {
        this.LJLIL = c45903Hzv;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surface, int i, int i2) {
        o.LJIIIZ(surface, "surface");
        C45903Hzv c45903Hzv = this.LJLIL;
        if (c45903Hzv.LJLLJ != null && c45903Hzv.LJLJJLL == null) {
            c45903Hzv.LJLJJLL = new Surface(surface);
            C45903Hzv c45903Hzv2 = this.LJLIL;
            TTVideoEngine tTVideoEngine = c45903Hzv2.LJLLJ;
            if (tTVideoEngine != null) {
                tTVideoEngine.LLILZIL(c45903Hzv2.LJLJJLL);
                TTVideoEngine tTVideoEngine2 = this.LJLIL.LJLLJ;
                if (tTVideoEngine2 != null) {
                    tTVideoEngine2.LJJLI();
                    return;
                } else {
                    o.LJIJI("videoEngine");
                    throw null;
                }
            }
            o.LJIJI("videoEngine");
            throw null;
        }
    }
}
