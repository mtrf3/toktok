package X;

import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Trace;
import com.ss.android.ttvecamera.TEFrameSizei;

/* loaded from: classes12.dex */
public class P7F implements SurfaceTexture.OnFrameAvailableListener {
    public final /* synthetic */ P7G LJLIL;

    public P7F(P7G p7g) {
        this.LJLIL = p7g;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        boolean z;
        P7G p7g = this.LJLIL;
        if (p7g.LIZLLL == null) {
            return;
        }
        if (p7g.LJII) {
            P7T.LIZ("TESurfaceTexture-onFrameAvailable drop frame due to preview is stopped");
            P7T.LIZIZ();
            C63922P6w.LIZLLL("TESurfaceTextureProvider", "Drop frame due to preview is stopped");
            z = true;
        } else {
            z = false;
        }
        X10 x10 = this.LJLIL.LIZLLL;
        x10.LLZILL(x10.LLLLLIL());
        if (this.LJLIL.LJIJ) {
            C63922P6w.LIZLLL("TESurfaceTextureProvider", "CAMERA_COST camera first frame callback");
            this.LJLIL.LJIJ = false;
            if (P7T.LIZ && Build.VERSION.SDK_INT >= 29) {
                Trace.endAsyncSection("VECamera-TECamera1-camera-frame", 1);
            }
            if (P7T.LIZ && Build.VERSION.SDK_INT >= 29) {
                Trace.endAsyncSection("VECamera-TECamera2-camera-frame", 2);
            }
        }
        surfaceTexture.getTransformMatrix(this.LJLIL.LJIILLIIL);
        TEFrameSizei tEFrameSizei = this.LJLIL.LIZJ;
        P6E p6e = new P6E(tEFrameSizei.width, tEFrameSizei.height, surfaceTexture.getTimestamp());
        P7G p7g2 = this.LJLIL;
        int i = p7g2.LJIIZILJ;
        int LLLFFI = p7g2.LIZLLL.LLLFFI();
        P7G p7g3 = this.LJLIL;
        p6e.LJFF(i, LLLFFI, p7g3.LJIILLIIL, p7g3.LIZIZ, p7g3.LIZLLL.LLLLLIL());
        P7G p7g4 = this.LJLIL;
        p6e.LIZLLL = p7g4.LJI;
        p6e.LJI = z;
        P7P p7p = p7g4.LIZ;
        if (p7p != null) {
            p7p.onFrameCaptured(p6e);
        }
    }
}
