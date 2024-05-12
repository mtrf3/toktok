package X;

import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Lock;

/* renamed from: X.Qif, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67765Qif implements InterfaceC67783Qix {
    public final WeakReference<C67761Qib> LIZ;
    public final C67718Qhu<?> LIZIZ;
    public final boolean LIZJ;

    @Override // X.InterfaceC67783Qix
    public final void LIZ(ConnectionResult connectionResult) {
        boolean z;
        Lock lock;
        C67761Qib c67761Qib = this.LIZ.get();
        if (c67761Qib == null) {
            return;
        }
        if (Looper.myLooper() == c67761Qib.LIZ.LJLLJ.LJLJL) {
            z = true;
        } else {
            z = false;
        }
        QH7.LJIIJ("onReportServiceBinding must be called on the GoogleApiClient handler thread", z);
        c67761Qib.LIZIZ.lock();
        try {
            if (!c67761Qib.LJIILIIL(0)) {
                lock = c67761Qib.LIZIZ;
            } else {
                if (!connectionResult.LJJJJZ()) {
                    c67761Qib.LJIIJJI(connectionResult, this.LIZIZ, this.LIZJ);
                }
                if (c67761Qib.LJIILJJIL()) {
                    c67761Qib.LJIIL();
                }
                lock = c67761Qib.LIZIZ;
            }
            lock.unlock();
        } catch (Throwable th) {
            c67761Qib.LIZIZ.unlock();
            throw th;
        }
    }

    public C67765Qif(C67761Qib c67761Qib, C67718Qhu<?> c67718Qhu, boolean z) {
        this.LIZ = new WeakReference<>(c67761Qib);
        this.LIZIZ = c67718Qhu;
        this.LIZJ = z;
    }
}
