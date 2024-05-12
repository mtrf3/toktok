package X;

import X.AbstractC67748QiO;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: X.Qjg, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67828Qjg<A extends AbstractC67748QiO<? extends InterfaceC67754QiU, Object>> extends AbstractC67837Qjp {
    public final A LIZIZ;

    @Override // X.AbstractC67837Qjp
    public final void LIZ(Status status) {
        try {
            this.LIZIZ.LJIILJJIL(status);
        } catch (IllegalStateException unused) {
        }
    }

    @Override // X.AbstractC67837Qjp
    public final void LIZIZ(Exception exc) {
        String LJLLJ = C16880lQ.LJLLJ(exc.getClass());
        String localizedMessage = exc.getLocalizedMessage();
        int length = LJLLJ.length();
        try {
            this.LIZIZ.LJIILJJIL(new Status(10, FP1.LIZLLL(new StringBuilder(length + 2 + String.valueOf(localizedMessage).length()), LJLLJ, ": ", localizedMessage)));
        } catch (IllegalStateException unused) {
        }
    }

    @Override // X.AbstractC67837Qjp
    public final void LIZJ(C67825Qjd<?> c67825Qjd) {
        try {
            A a = this.LIZIZ;
            InterfaceC67836Qjo interfaceC67836Qjo = c67825Qjd.LJLILLLLZI;
            a.getClass();
            try {
                a.LJIILIIL(interfaceC67836Qjo);
            } catch (DeadObjectException e) {
                a.LJIILJJIL(new Status(8, null, e.getLocalizedMessage()));
                throw e;
            } catch (RemoteException e2) {
                a.LJIILJJIL(new Status(8, null, e2.getLocalizedMessage()));
            }
        } catch (RuntimeException e3) {
            LIZIZ(e3);
        }
    }

    public C67828Qjg(int i, A a) {
        super(i);
        this.LIZIZ = a;
    }

    @Override // X.AbstractC67837Qjp
    public final void LIZLLL(C67834Qjm c67834Qjm, boolean z) {
        A a = this.LIZIZ;
        c67834Qjm.LIZ.put(a, Boolean.valueOf(z));
        a.LIZJ(new C67909Qkz(c67834Qjm, a));
    }
}
