package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import com.ss.android.ugc.aweme.shortvideo.edit.capcut.EditCapCutFragment;
import com.ss.ttvideoengine.TTVideoEngine;
import kotlin.jvm.internal.o;

/* renamed from: X.KRv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class TextureViewSurfaceTextureListenerC51727KRv implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ EditCapCutFragment LJLIL;
    public final /* synthetic */ TTVideoEngine LJLILLLLZI;

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

    public TextureViewSurfaceTextureListenerC51727KRv(EditCapCutFragment editCapCutFragment, TTVideoEngine tTVideoEngine) {
        this.LJLIL = editCapCutFragment;
        this.LJLILLLLZI = tTVideoEngine;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surface, int i, int i2) {
        o.LJIIIZ(surface, "surface");
        if (this.LJLIL.LJLJJLL == null) {
            Surface surface2 = new Surface(surface);
            EditCapCutFragment editCapCutFragment = this.LJLIL;
            TTVideoEngine tTVideoEngine = this.LJLILLLLZI;
            editCapCutFragment.LJLJJLL = surface2;
            tTVideoEngine.LLILZIL(surface2);
        }
        if (this.LJLIL.getUserVisibleHint()) {
            this.LJLIL.LJLJJI = true;
            this.LJLILLLLZI.LJJLI();
        }
    }
}
