package X;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import kotlin.jvm.internal.o;

/* renamed from: X.VIv, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class TextureViewSurfaceTextureListenerC79521VIv implements TextureView.SurfaceTextureListener {
    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surface) {
        o.LJIIIZ(surface, "surface");
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surface, int i, int i2) {
        o.LJIIIZ(surface, "surface");
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surface) {
        o.LJIIIZ(surface, "surface");
    }
}
