package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;

/* loaded from: classes15.dex */
public final class VC1 implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ C79340VBw LJLIL;

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public VC1(C79340VBw c79340VBw) {
        this.LJLIL = c79340VBw;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        C79340VBw c79340VBw = this.LJLIL;
        if (c79340VBw.LJLJLLL != null && c79340VBw.LJLJL == null) {
            B4I.LIZ("PreCreateSurface", "one px surface available, create one px surface");
            this.LJLIL.LJLJL = new Surface(surfaceTexture);
            this.LJLIL.LJJLIIIJJI(true);
        }
    }
}
