package X;

import Y.AfS61S0100000_9;
import Y.IDuS320S0100000_9;
import com.ss.android.ugc.aweme.notification.perf.NoticePerfManager;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class M4Q {
    public final String LIZ;
    public final M4S LIZIZ;
    public int LIZJ;
    public volatile boolean LJ;
    public volatile M4U LIZLLL = new M4U();
    public final C62822Ol8 LJFF = C221108m2.LIZIZ(M4P.LJLIL);

    public final boolean LIZ(EnumC55898Lwk reason) {
        o.LJIIIZ(reason, "reason");
        int i = C55899Lwl.LIZ[reason.ordinal()];
        if (i != 1 && i != 2) {
            if (i == 3 || i == 4 || i == 5) {
                if (this.LJ) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("ModelHolder preloadByRefresh but drained, reason:");
                    LIZ.append(reason);
                    C221018lt.LJFF("NoticePerfManager", X1D.LIZIZ(LIZ));
                    return false;
                }
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("ModelHolder preloadByRefresh, reason:");
                LIZ2.append(reason);
                C221018lt.LJFF("NoticePerfManager", X1D.LIZIZ(LIZ2));
                M4U m4u = this.LIZLLL;
                m4u.getClass();
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("preload, reason:");
                LIZ3.append(reason);
                C221018lt.LJFF("NotificationTLPreload", X1D.LIZIZ(LIZ3));
                if (ORZ.LJLJJI(m4u.LJIILL, m4u.LJIILL())) {
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append("preload blocked by refreshing now:");
                    LIZ4.append(m4u.LJIILL);
                    LIZ4.append(", ");
                    LIZ4.append(m4u.LJIIIZ());
                    C221018lt.LIZIZ("NotificationTLPreload", X1D.LIZIZ(LIZ4));
                    return false;
                }
                if (reason == EnumC55898Lwk.CLICK_ENTRANCE && m4u.LJIJJ <= 0) {
                    return m4u.LJIJJ(MLW.PRELOAD_REFRESH_CLICK);
                }
                if (reason == EnumC55898Lwk.BOOT_LAZY || reason == EnumC55898Lwk.POST_UNREAD) {
                    if (System.currentTimeMillis() - m4u.LJIJ >= NoticePerfManager.LIZ().preloadReqDurationMs) {
                        return m4u.LJIJJ(MLW.PRELOAD_REFRESH_EXCEPT_REC);
                    }
                }
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append("preload blocked, reason:");
                LIZ5.append(reason);
                LIZ5.append(", lastTs:");
                LIZ5.append(m4u.LJIJ);
                LIZ5.append(", lastFullTs:");
                LIZ5.append(m4u.LJIJJ);
                LIZ5.append(", lastJanusTs:");
                LIZ5.append(m4u.LJIJI);
                C221018lt.LJFF("NotificationTLPreload", X1D.LIZIZ(LIZ5));
                return false;
            }
            throw new C162476Zf();
        }
        if (!this.LJ) {
            M4U m4u2 = this.LIZLLL;
            if (m4u2.LJIJ <= 0 && !m4u2.LJIIIZ() && m4u2.LJIILL == null) {
                M4S m4s = this.LIZIZ;
                if (m4s == null) {
                    return false;
                }
                C221018lt.LJFF("NoticePerfManager", "ModelHolder preloadByCache start");
                C78999UzT.LJFF(AbstractC73672Svk.LJIIJ(new IDuS320S0100000_9(m4s, 1)).LJJL(T16.LIZ()).LJJJLIIL(new AfS61S0100000_9(this, 7), M4R.LJLIL), (C73318Sq2) this.LJFF.getValue());
                return true;
            }
        }
        StringBuilder LIZ6 = X1D.LIZ();
        LIZ6.append("ModelHolder preloadByCache not needed: ");
        HH1.LIZIZ(LIZ6, this.LJ, LIZ6, "NoticePerfManager");
        return false;
    }

    public M4Q(String str, M4S m4s) {
        this.LIZ = str;
        this.LIZIZ = m4s;
    }
}
