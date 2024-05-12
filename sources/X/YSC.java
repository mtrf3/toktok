package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import com.ss.android.videoshop.controller.VideoController;
import java.util.HashMap;

/* loaded from: classes16.dex */
public final class YSC implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ YD6 LJLIL;
    public final /* synthetic */ C79985VaH LJLILLLLZI;
    public final /* synthetic */ YS7 LJLJI;
    public final /* synthetic */ YS5 LJLJJI;

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

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        if (!((HashMap) this.LJLJJI.LIZIZ).containsValue(this.LJLIL)) {
            return;
        }
        Surface surface = this.LJLIL.getSurface();
        if (surface != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onSurfaceTextureAvailable prepare vid:");
            LIZ.append(this.LJLILLLLZI.LIZ);
            LIZ.append(" title:");
            this.LJLILLLLZI.getClass();
            LIZ.append((String) null);
            LIZ.append(" surface hash:");
            LIZ.append(surface.hashCode());
            X1D.LIZIZ(LIZ);
            this.LJLJI.setSurface(surface);
        }
        this.LJLJI.prepare();
    }

    public YSC(YS5 ys5, YD6 yd6, C79985VaH c79985VaH, VideoController videoController) {
        this.LJLJJI = ys5;
        this.LJLIL = yd6;
        this.LJLILLLLZI = c79985VaH;
        this.LJLJI = videoController;
    }
}
