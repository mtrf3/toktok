package X;

import android.content.Context;
import android.os.RemoteException;

/* renamed from: X.Qzb, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68815Qzb {
    public static boolean LIZ;

    static {
        C16880lQ.LJLLJ(C68815Qzb.class);
        LIZ = false;
    }

    public static synchronized int LIZ(Context context) {
        synchronized (C68815Qzb.class) {
            QH7.LJIIIZ(context, "Context is null");
            if (LIZ) {
                return 0;
            }
            try {
                InterfaceC68816Qzc LIZ2 = C68459Qtr.LIZ(context);
                try {
                    InterfaceC68803QzP LJ = LIZ2.LJ();
                    QH7.LJIIIIZZ(LJ);
                    C17J.LJLJJLL = LJ;
                    InterfaceC68819Qzf LJIIJJI = LIZ2.LJIIJJI();
                    if (C78949Uyf.LJLIL == null) {
                        QH7.LJIIIZ(LJIIJJI, "delegate must not be null");
                        C78949Uyf.LJLIL = LJIIJJI;
                    }
                    LIZ = true;
                    try {
                        LIZ2.LIZLLL();
                        LIZ2.Z(new BinderC68153Qov(context), 0);
                    } catch (RemoteException unused) {
                    }
                    return 0;
                } catch (RemoteException e) {
                    throw new C68463Qtv(e);
                }
            } catch (PSW e2) {
                return e2.errorCode;
            }
        }
    }
}
