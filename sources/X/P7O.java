package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import com.ss.android.ttvecamera.TEFrameSizei;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes12.dex */
public final class P7O extends P7K {
    public static final String LJIILLIIL = C16880lQ.LJLLJ(P7O.class);
    public P7N LJIIJJI;
    public int LJIIL;
    public final SurfaceTexture LJIILIIL;
    public byte[][] LJIILJJIL;
    public int LJIILL;

    @Override // X.P7K
    public final Surface LIZJ() {
        return null;
    }

    @Override // X.P7K
    public final int LJIIJJI() {
        return 4;
    }

    @Override // X.P7K
    public final void LJIILJJIL() {
    }

    @Override // X.P7K
    public final void LJIJJLI(SurfaceTexture surfaceTexture) {
    }

    public final byte[][] LJJII() {
        TEFrameSizei tEFrameSizei = this.LIZJ;
        int i = ((tEFrameSizei.width * tEFrameSizei.height) * 3) / 2;
        String str = LJIILLIIL;
        StringBuilder LJ = C7MY.LJ("getBuffers current bufferSize: ", i, " mCallbackBytebufferSize:");
        LJ.append(this.LJIILL);
        C63922P6w.LIZ(str, X1D.LIZIZ(LJ));
        int i2 = this.LJIILL;
        if (i > i2 || i2 == 0) {
            this.LJIILJJIL = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 3, i);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("new mCallbackBytebuffer size :");
            LIZ.append(i);
            C63922P6w.LIZ(str, X1D.LIZIZ(LIZ));
            this.LJIILL = i;
        }
        return this.LJIILJJIL;
    }

    @Override // X.P7K
    public final SurfaceTexture LJI() {
        return this.LJIILIIL;
    }

    public P7O(C63915P6p c63915P6p, X10 x10) {
        super(c63915P6p, x10);
        this.LJIILIIL = c63915P6p.LIZLLL;
    }

    @Override // X.P7K
    public final void LJIILIIL(List list, TEFrameSizei tEFrameSizei) {
        if (((ArrayList) list).size() > 0) {
            this.LIZJ = PDA.LIZIZ(list, tEFrameSizei);
        }
        SurfaceTexture surfaceTexture = this.LJIILIIL;
        TEFrameSizei tEFrameSizei2 = this.LIZJ;
        surfaceTexture.setDefaultBufferSize(tEFrameSizei2.width, tEFrameSizei2.height);
        this.LJIIJJI = new P7N(this);
    }
}
