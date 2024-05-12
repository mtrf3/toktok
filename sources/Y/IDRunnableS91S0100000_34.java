package Y;

import X.AbstractC93356aPY;
import X.C68463Qtv;
import X.C68824Qzk;
import X.C93378aPu;
import X.C93390aQ6;
import X.R0H;
import X.R0I;
import X.R0J;
import X.R0K;
import X.R0L;
import android.os.RemoteException;

/* loaded from: classes32.dex */
public class IDRunnableS91S0100000_34 implements Runnable {
    public final int $t;
    public Object l0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        C93390aQ6 c93390aQ6 = (C93390aQ6) ((AbstractC93356aPY) this.l0);
        C68824Qzk c68824Qzk = c93390aQ6.LIZ;
        if (c68824Qzk != null) {
            try {
                c68824Qzk.LIZ.LLLFFI(new R0J(c93390aQ6));
                C68824Qzk c68824Qzk2 = c93390aQ6.LIZ;
                c68824Qzk2.getClass();
                try {
                    c68824Qzk2.LIZ.LLIIIILZ(new R0K(c93390aQ6));
                    C68824Qzk c68824Qzk3 = c93390aQ6.LIZ;
                    c68824Qzk3.getClass();
                    try {
                        c68824Qzk3.LIZ.LJJZZIII(new R0H(c93390aQ6));
                        C68824Qzk c68824Qzk4 = c93390aQ6.LIZ;
                        c68824Qzk4.getClass();
                        try {
                            c68824Qzk4.LIZ.y(new R0I(c93390aQ6));
                            C68824Qzk c68824Qzk5 = c93390aQ6.LIZ;
                            c68824Qzk5.getClass();
                            try {
                                c68824Qzk5.LIZ.X(new R0L(c93390aQ6));
                            } catch (RemoteException e) {
                                throw new C68463Qtv(e);
                            }
                        } catch (RemoteException e2) {
                            throw new C68463Qtv(e2);
                        }
                    } catch (RemoteException e3) {
                        throw new C68463Qtv(e3);
                    }
                } catch (RemoteException e4) {
                    throw new C68463Qtv(e4);
                }
            } catch (RemoteException e5) {
                throw new C68463Qtv(e5);
            }
        }
    }

    public static final void run$0(IDRunnableS91S0100000_34 iDRunnableS91S0100000_34) {
        ((C93378aPu.i) iDRunnableS91S0100000_34.l0).sendEmptyMessage(1);
    }

    public static final void run$1(IDRunnableS91S0100000_34 iDRunnableS91S0100000_34) {
        boolean LIZ;
        try {
            iDRunnableS91S0100000_34.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public IDRunnableS91S0100000_34(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
