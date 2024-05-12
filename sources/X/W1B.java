package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import com.ss.android.ugc.gamora.editorpro.anchor.EditorProAnchorActivity;
import com.ss.ttvideoengine.TTVideoEngine;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class W1B implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ EditorProAnchorActivity LJLIL;

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

    public W1B(EditorProAnchorActivity editorProAnchorActivity) {
        this.LJLIL = editorProAnchorActivity;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surface, int i, int i2) {
        o.LJIIIZ(surface, "surface");
        EditorProAnchorActivity editorProAnchorActivity = this.LJLIL;
        if (editorProAnchorActivity.LJLJLLL == null) {
            editorProAnchorActivity.LJLJLLL = new Surface(surface);
        }
        EditorProAnchorActivity editorProAnchorActivity2 = this.LJLIL;
        TTVideoEngine tTVideoEngine = editorProAnchorActivity2.LJLL;
        if (tTVideoEngine != null) {
            tTVideoEngine.LLILZIL(editorProAnchorActivity2.LJLJLLL);
            TTVideoEngine tTVideoEngine2 = this.LJLIL.LJLL;
            if (tTVideoEngine2 != null) {
                tTVideoEngine2.LJJLI();
            } else {
                o.LJIJI("videoEngine");
                throw null;
            }
        }
    }
}
