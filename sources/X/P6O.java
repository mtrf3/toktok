package X;

import android.graphics.SurfaceTexture;
import com.ss.android.ttvecamera.TEFrameSizei;

/* loaded from: classes12.dex */
public class P6O {
    public final EnumC63901P6b LIZ;
    public TEFrameSizei LIZIZ;
    public P63 LIZJ;
    public SurfaceTexture LJ;
    public boolean LJFF = true;
    public final boolean LIZLLL = true;

    public boolean LIZIZ() {
        TEFrameSizei tEFrameSizei = this.LIZIZ;
        if (tEFrameSizei != null && tEFrameSizei.width > 0 && tEFrameSizei.height > 0 && this.LIZJ != null) {
            return true;
        }
        return false;
    }

    public SurfaceTexture LIZ() {
        return this.LJ;
    }

    public void LIZJ(SurfaceTexture surfaceTexture) {
        this.LJ = surfaceTexture;
    }

    public P6O(EnumC63901P6b enumC63901P6b, TEFrameSizei tEFrameSizei, InterfaceC63916P6q interfaceC63916P6q, SurfaceTexture surfaceTexture) {
        this.LIZ = enumC63901P6b;
        this.LIZIZ = tEFrameSizei;
        this.LIZJ = interfaceC63916P6q;
        this.LJ = surfaceTexture;
    }
}
