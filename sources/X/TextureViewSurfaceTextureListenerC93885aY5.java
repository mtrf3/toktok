package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import com.ss.android.vesdk.VERecorder;
import kotlin.jvm.internal.o;

/* renamed from: X.aY5, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class TextureViewSurfaceTextureListenerC93885aY5 implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ C93886aY6 LJLIL;

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        o.LJIIIZ(surfaceTexture, "surfaceTexture");
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        o.LJIIIZ(surfaceTexture, "surfaceTexture");
    }

    public TextureViewSurfaceTextureListenerC93885aY5(C93886aY6 c93886aY6) {
        this.LJLIL = c93886aY6;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        o.LJIIIZ(surfaceTexture, "surfaceTexture");
        this.LJLIL.LIZ(surfaceTexture);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        o.LJIIIZ(surfaceTexture, "surfaceTexture");
        VERecorder vERecorder = this.LJLIL.LIZLLL;
        if (vERecorder != null) {
            vERecorder.LIZIZ.changeSurface(new Surface(surfaceTexture));
        }
    }
}
