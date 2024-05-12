package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.PreviewVideoScene;
import com.ss.ttvideoengine.TTVideoEngine;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WGY implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ PreviewVideoScene LJLIL;

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

    public WGY(PreviewVideoScene previewVideoScene) {
        this.LJLIL = previewVideoScene;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surface, int i, int i2) {
        o.LJIIIZ(surface, "surface");
        PreviewVideoScene previewVideoScene = this.LJLIL;
        if (previewVideoScene.LJLL != null && previewVideoScene.LJLLLL == null) {
            previewVideoScene.LJLLLL = new Surface(surface);
            PreviewVideoScene previewVideoScene2 = this.LJLIL;
            TTVideoEngine tTVideoEngine = previewVideoScene2.LJLL;
            if (tTVideoEngine != null) {
                tTVideoEngine.LLILZIL(previewVideoScene2.LJLLLL);
                PreviewVideoScene previewVideoScene3 = this.LJLIL;
                if (previewVideoScene3.mUserVisibleHint) {
                    previewVideoScene3.LJLLJ = true;
                    TTVideoEngine tTVideoEngine2 = previewVideoScene3.LJLL;
                    if (tTVideoEngine2 != null) {
                        tTVideoEngine2.LJJLI();
                        return;
                    } else {
                        o.LJIJI("videoEngine");
                        throw null;
                    }
                }
                return;
            }
            o.LJIJI("videoEngine");
            throw null;
        }
    }
}
