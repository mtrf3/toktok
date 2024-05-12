package X;

import android.graphics.SurfaceTexture;
import com.ss.android.ttvecamera.TEFrameSizei;

/* loaded from: classes12.dex */
public final class P7E implements SurfaceTexture.OnFrameAvailableListener {
    public final /* synthetic */ P7L LJLIL;

    public P7E(P7L p7l) {
        this.LJLIL = p7l;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        P7L p7l = this.LJLIL;
        if (p7l.LIZLLL == null) {
            return;
        }
        surfaceTexture.getTransformMatrix(p7l.LJIILJJIL);
        TEFrameSizei tEFrameSizei = this.LJLIL.LIZJ;
        P6E p6e = new P6E(tEFrameSizei.width, tEFrameSizei.height, surfaceTexture.getTimestamp());
        P7L p7l2 = this.LJLIL;
        int i = p7l2.LJIILL;
        int LLLFFI = p7l2.LIZLLL.LLLFFI();
        P7L p7l3 = this.LJLIL;
        p6e.LJFF(i, LLLFFI, p7l3.LJIILJJIL, p7l3.LIZIZ, p7l3.LIZLLL.LLLLLIL());
        P7P p7p = this.LJLIL.LIZ;
        if (p7p != null) {
            p7p.onFrameCaptured(p6e);
        }
    }
}
