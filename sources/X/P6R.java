package X;

import android.graphics.SurfaceTexture;
import com.ss.android.ttvecamera.TEFrameSizei;

/* loaded from: classes12.dex */
public final class P6R extends P6O {
    public final SurfaceTexture LJI;
    public final int LJII;

    @Override // X.P6O
    public final boolean LIZIZ() {
        return super.LIZIZ();
    }

    @Override // X.P6O
    public final SurfaceTexture LIZ() {
        return this.LJI;
    }

    public P6R(int i, SurfaceTexture surfaceTexture, TEFrameSizei tEFrameSizei, InterfaceC63916P6q interfaceC63916P6q) {
        super(EnumC63901P6b.PIXEL_FORMAT_BUFFER, tEFrameSizei, interfaceC63916P6q, surfaceTexture);
        this.LJI = surfaceTexture;
        this.LJII = i;
    }
}
