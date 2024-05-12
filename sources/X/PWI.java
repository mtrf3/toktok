package X;

import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes12.dex */
public class PWI extends PUA {
    public final /* synthetic */ PWF LJIIJ;

    @Override // X.PUA
    public final void LJIILIIL() {
        PWF pwf = this.LJIIJ;
        PWT pwt = PWT.CANCEL;
        if (pwf.LIZLLL(pwt)) {
            pwf.LIZLLL.LJIIJJI(pwf.LIZJ, pwt);
        }
        PWE pwe = this.LJIIJ.LIZLLL;
        synchronized (pwe) {
            long j = pwe.LJLLL;
            long j2 = pwe.LJLLJ;
            if (j >= j2) {
                pwe.LJLLJ = j2 + 1;
                pwe.LJLLLL = System.nanoTime() + 1000000000;
                try {
                    pwe.LJLJLJ.execute(new PWX(pwe, pwe.LJLJJI));
                } catch (RejectedExecutionException unused) {
                }
            }
        }
    }

    public final void LJIILJJIL() {
        if (!LJIIIZ()) {
        } else {
            throw LJIIL(null);
        }
    }

    public PWI(PWF pwf) {
        this.LJIIJ = pwf;
    }

    @Override // X.PUA
    public final IOException LJIIL(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }
}
