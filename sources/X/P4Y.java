package X;

import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;

/* loaded from: classes12.dex */
public final class P4Y implements SurfaceTexture.OnFrameAvailableListener, Runnable {
    public static final int[] LJLJL = {12352, 4, 12339, 1, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12344};
    public final Handler LJLIL;
    public final int[] LJLILLLLZI = new int[1];
    public EGLDisplay LJLJI;
    public EGLContext LJLJJI;
    public EGLSurface LJLJJL;
    public SurfaceTexture LJLJJLL;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            SurfaceTexture surfaceTexture = this.LJLJJLL;
            if (surfaceTexture != null) {
                surfaceTexture.updateTexImage();
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public P4Y(Handler handler) {
        this.LJLIL = handler;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.LJLIL.post(this);
    }
}
