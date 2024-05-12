package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;

/* renamed from: X.J9k, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class TextureViewSurfaceTextureListenerC48700J9k implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ C48699J9j LJLIL;

    public TextureViewSurfaceTextureListenerC48700J9k(C48699J9j c48699J9j) {
        this.LJLIL = c48699J9j;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        B4I.LIZ("KeepSurfaceTextureRenderView", "onSurfaceTextureDestroyed");
        C48699J9j c48699J9j = this.LJLIL;
        c48699J9j.LJLJLLL = false;
        TextureView.SurfaceTextureListener surfaceTextureListener = c48699J9j.LJLL;
        if (surfaceTextureListener != null && !surfaceTextureListener.onSurfaceTextureDestroyed(surfaceTexture)) {
            return false;
        }
        this.LJLIL.getClass();
        this.LJLIL.LIZIZ();
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        TextureView.SurfaceTextureListener surfaceTextureListener = this.LJLIL.LJLL;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureUpdated(surfaceTexture);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        B4I.LIZ("KeepSurfaceTextureRenderView", "onSurfaceTextureAvailable");
        this.LJLIL.LIZIZ();
        C48699J9j c48699J9j = this.LJLIL;
        if (c48699J9j.LJLJL == null) {
            c48699J9j.LJLJL = surfaceTexture;
            c48699J9j.LJLJLJ = new Surface(this.LJLIL.LJLJL);
        }
        C48699J9j c48699J9j2 = this.LJLIL;
        c48699J9j2.LJLJLLL = true;
        TextureView.SurfaceTextureListener surfaceTextureListener = c48699J9j2.LJLL;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureAvailable(c48699J9j2.LJLJL, i, i2);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        B4I.LIZ("KeepSurfaceTextureRenderView", "onSurfaceTextureSizeChanged");
        TextureView.SurfaceTextureListener surfaceTextureListener = this.LJLIL.LJLL;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
        }
    }
}
