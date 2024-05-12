package X;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import kotlin.jvm.internal.o;

/* renamed from: X.KMf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class TextureViewSurfaceTextureListenerC51581KMf implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ KMZ LJLIL;

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surface) {
        o.LJIIIZ(surface, "surface");
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surface) {
        o.LJIIIZ(surface, "surface");
    }

    public TextureViewSurfaceTextureListenerC51581KMf(KMZ kmz) {
        this.LJLIL = kmz;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surface, int i, int i2) {
        o.LJIIIZ(surface, "surface");
        this.LJLIL.LJII(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surface, int i, int i2) {
        o.LJIIIZ(surface, "surface");
        this.LJLIL.LJII(i, i2);
    }
}
