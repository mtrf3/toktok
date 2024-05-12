package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;

/* renamed from: X.WsU, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class TextureViewSurfaceTextureListenerC83662WsU implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ C83621Wrp LJLIL;

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public TextureViewSurfaceTextureListenerC83662WsU(C83621Wrp c83621Wrp) {
        this.LJLIL = c83621Wrp;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C83621Wrp c83621Wrp = this.LJLIL;
        c83621Wrp.LLJZIJLIL = true;
        c83621Wrp.LLLLLL();
        this.LJLIL.LLILL.release();
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        C83621Wrp c83621Wrp = this.LJLIL;
        c83621Wrp.LLJZIJLIL = false;
        if (c83621Wrp.LLILL == null) {
            c83621Wrp.LLILL = new Surface(surfaceTexture);
        }
        this.LJLIL.LLLLLJLJLL();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.LJLIL.LLLLLJIL(i, i2);
    }
}
