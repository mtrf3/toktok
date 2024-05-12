package X;

import Y.IDbS399S0100000_10;
import Y.IDcS407S0100000_10;

/* renamed from: X.Osv, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63305Osv {
    public static C63305Osv LJ;
    public volatile boolean LIZ;
    public volatile boolean LIZIZ;
    public volatile boolean LIZJ;
    public volatile int LIZLLL = -1;

    public static C63305Osv LIZIZ() {
        if (LJ == null) {
            synchronized (C63305Osv.class) {
                if (LJ == null) {
                    LJ = new C63305Osv();
                }
            }
        }
        return LJ;
    }

    public final void LIZ() {
        if (this.LIZ || this.LIZJ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("LinkModeManager afterPullMixLink checking or ever migrated, isCheck:");
            LIZ.append(this.LIZ);
            LIZ.append(", isEverMigrated:");
            LIZ.append(this.LIZJ);
            C63322OtC.LJFF(X1D.LIZIZ(LIZ));
            return;
        }
        this.LIZ = true;
        RunnableC63345OtZ.LIZLLL(new IDcS407S0100000_10(this, 0), new IDbS399S0100000_10(this, 0), C63346Ota.LIZ());
    }

    public final int LIZJ() {
        if (this.LIZLLL < 0) {
            C63291Osh LIZ = C63291Osh.LIZ();
            InterfaceC63293Osj interfaceC63293Osj = C63291Osh.LIZLLL;
            LIZ.getClass();
            this.LIZLLL = interfaceC63293Osj.getInt(C63291Osh.LJIIIZ("current_link_mode"));
        }
        return this.LIZLLL;
    }

    public final void LIZLLL() {
        if (!C63308Osy.LJI().LIZLLL().LJZI && LIZJ() == 1) {
            C63291Osh LIZ = C63291Osh.LIZ();
            long j = C63308Osy.LJI().LIZLLL().LJJIL.baseIndexV2;
            LIZ.getClass();
            long LIZIZ = C63291Osh.LIZIZ();
            if (j <= LIZIZ) {
                StringBuilder LIZJ = V10.LIZJ("SPUtils try to set invalid indexV2:", j, ", local:");
                LIZJ.append(LIZIZ);
                C63322OtC.LIZLLL(X1D.LIZIZ(LIZJ));
            } else {
                StringBuilder LIZJ2 = V10.LIZJ("SPUtils update indexV2:", j, ", local:");
                LIZJ2.append(LIZIZ);
                C63322OtC.LJFF(X1D.LIZIZ(LIZJ2));
                C63291Osh.LIZLLL.LIZIZ(Long.valueOf(j), C63291Osh.LJIIIZ("base_msg_index_v2"));
            }
        }
    }
}
