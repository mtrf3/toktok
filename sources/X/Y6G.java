package X;

import android.graphics.SurfaceTexture;
import android.view.SurfaceHolder;

/* loaded from: classes16.dex */
public final class Y6G {
    public final SurfaceHolder LIZ;
    public final SurfaceTexture LIZIZ;

    public Y6G(SurfaceTexture surfaceTexture) {
        if (surfaceTexture != null) {
            this.LIZIZ = surfaceTexture;
            return;
        }
        throw new IllegalArgumentException("surfaceTexture may not be null");
    }

    public Y6G(SurfaceHolder surfaceHolder) {
        if (surfaceHolder != null) {
            this.LIZ = surfaceHolder;
            return;
        }
        throw new IllegalArgumentException("surfaceHolder may not be null");
    }
}
