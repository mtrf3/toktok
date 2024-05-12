package X;

import android.graphics.SurfaceTexture;
import android.view.TextureView;

/* loaded from: classes16.dex */
public final class Y6B implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ Y61 LJLIL;

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public Y6B(Y61 y61) {
        this.LJLIL = y61;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        Y61 y61 = this.LJLIL;
        y61.LJLLLLLL = new Y64(i, i2);
        y61.LJFF();
    }
}
