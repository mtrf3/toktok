package X;

import android.graphics.SurfaceTexture;
import com.ss.android.ttvecamera.TEFrameSizei;

/* loaded from: classes12.dex */
public final class P6P extends P6O {
    public int LJI;
    public SurfaceTexture LJII;

    @Override // X.P6O
    public final boolean LIZIZ() {
        return super.LIZIZ();
    }

    @Override // X.P6O
    public final SurfaceTexture LIZ() {
        return this.LJII;
    }

    @Override // X.P6O
    public final void LIZJ(SurfaceTexture surfaceTexture) {
        this.LJII = surfaceTexture;
    }

    public P6P(int i, SurfaceTexture surfaceTexture, TEFrameSizei tEFrameSizei, InterfaceC63916P6q interfaceC63916P6q) {
        super(EnumC63901P6b.PIXEL_FORMAT_OpenGL_OES, tEFrameSizei, interfaceC63916P6q, surfaceTexture);
        this.LJI = i;
        this.LJII = surfaceTexture;
    }
}
