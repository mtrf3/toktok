package X;

import java.io.IOException;
import java.net.SocketTimeoutException;

/* loaded from: classes12.dex */
public final class PXL implements Runnable {
    public final /* synthetic */ PXH LJLIL;

    public final void LIZ() {
        int i;
        PXH pxh = this.LJLIL;
        synchronized (pxh) {
            if (!pxh.LJIJ) {
                PVX pvx = pxh.LJIIIIZZ;
                if (pxh.LJIJJ) {
                    i = pxh.LJIJI;
                } else {
                    i = -1;
                }
                pxh.LJIJI++;
                pxh.LJIJJ = true;
                if (i != -1) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("sent ping but didn't receive pong within ");
                    LIZ.append(pxh.LIZLLL);
                    LIZ.append("ms (after ");
                    LIZ.append(i - 1);
                    LIZ.append(" successful ping/pongs)");
                    pxh.LIZLLL(new SocketTimeoutException(X1D.LIZIZ(LIZ)), null);
                    return;
                }
                try {
                    pvx.LIZ(C64537PUn.EMPTY, 9);
                } catch (IOException e) {
                    pxh.LIZLLL(e, null);
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public PXL(PXH pxh) {
        this.LJLIL = pxh;
    }
}
