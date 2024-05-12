package X;

import java.io.IOException;
import java.net.SocketTimeoutException;

/* loaded from: classes12.dex */
public final class PXM implements Runnable {
    public final /* synthetic */ PXI LJLIL;

    public final void LIZ() {
        int i;
        PXI pxi = this.LJLIL;
        C64537PUn c64537PUn = C64537PUn.EMPTY;
        synchronized (pxi) {
            if (!pxi.LJIJ) {
                PVW pvw = pxi.LJIIJ;
                if (pxi.LJIJJ) {
                    i = pxi.LJIJI;
                } else {
                    i = -1;
                }
                pxi.LJIJI++;
                pxi.LJIJJ = true;
                if (i != -1) {
                    pxi.LIZLLL(new SocketTimeoutException("sent ping but didn't receive pong"), null);
                } else {
                    if (pvw == null) {
                        return;
                    }
                    try {
                        pvw.LIZ(c64537PUn, 9);
                    } catch (IOException e) {
                        pxi.LIZLLL(e, null);
                    }
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

    public PXM(PXI pxi) {
        this.LJLIL = pxi;
    }
}
