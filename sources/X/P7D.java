package X;

import android.graphics.SurfaceTexture;
import com.ss.android.ttvecamera.TEFrameSizei;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes12.dex */
public final class P7D implements SurfaceTexture.OnFrameAvailableListener {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ P7H LJLILLLLZI;

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        X10 x10 = this.LJLILLLLZI.LIZLLL;
        if (x10 == null) {
            return;
        }
        x10.LLZILL(this.LJLIL);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TESurfaceTextureProvider-onFrameAvailable facing ");
        LIZ.append(this.LJLILLLLZI.LIZLLL.LLLLLIL());
        LIZ.append(", timestampe ");
        LIZ.append(surfaceTexture.getTimestamp());
        P7T.LIZ(X1D.LIZIZ(LIZ));
        float[] fArr = new float[16];
        surfaceTexture.getTransformMatrix(fArr);
        TEFrameSizei tEFrameSizei = this.LJLILLLLZI.LIZJ;
        P6E p6e = new P6E(tEFrameSizei.width, tEFrameSizei.height, surfaceTexture.getTimestamp());
        if (((HashMap) this.LJLILLLLZI.LJIILJJIL).get(Integer.valueOf(this.LJLIL)) != null) {
            if (((ConcurrentHashMap) this.LJLILLLLZI.LJIILL).get(Integer.valueOf(this.LJLIL)) != null) {
                p6e.LJFF(((Integer) ((HashMap) this.LJLILLLLZI.LJIILJJIL).get(Integer.valueOf(this.LJLIL))).intValue(), this.LJLILLLLZI.LIZLLL.LLLIIL(this.LJLIL), fArr, this.LJLILLLLZI.LIZIZ, this.LJLIL);
                P7H p7h = this.LJLILLLLZI;
                p6e.LIZLLL = p7h.LJI;
                ((P7P) ((ConcurrentHashMap) p7h.LJIILL).get(Integer.valueOf(this.LJLIL))).onFrameCaptured(p6e);
            }
        }
        P7T.LIZIZ();
    }

    public P7D(P7H p7h, int i) {
        this.LJLILLLLZI = p7h;
        this.LJLIL = i;
    }
}
