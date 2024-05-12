package X;

import com.ss.android.common.util.NetworkUtils;

/* renamed from: X.3dB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C88213dB {
    public final C88223dC LIZ;
    public boolean LIZIZ;

    public C88213dB(C88223dC c88223dC) {
        this.LIZ = c88223dC;
    }

    public final void LIZ(boolean z) {
        long j;
        long j2;
        if (this.LIZIZ) {
            return;
        }
        this.LIZIZ = true;
        long serverTimeMills = NetworkUtils.getServerTimeMills();
        C88223dC c88223dC = this.LIZ;
        String str = c88223dC.LJLIL;
        boolean z2 = c88223dC.LJLILLLLZI;
        boolean z3 = c88223dC.LJLJI;
        long j3 = serverTimeMills - c88223dC.LJLJJI;
        C85323Wm LIZJ = C05040Hs.LIZJ(str, "enterMethod", "onEventV3");
        C65864Pt6 c65864Pt6 = new C65864Pt6();
        C3QD.LIZJ("enter_method", str, c65864Pt6);
        long j4 = 1;
        if (z2) {
            j = 1;
        } else {
            j = 0;
        }
        C3QD.LIZ(c65864Pt6, "is_animation_enable", Long.valueOf(j));
        if (z3) {
            j2 = 1;
        } else {
            j2 = 0;
        }
        C3QD.LIZ(c65864Pt6, "is_low_end_device", Long.valueOf(j2));
        C3QD.LIZ(c65864Pt6, "overall_cost", Long.valueOf(j3));
        if (!z) {
            j4 = 0;
        }
        C3QD.LIZ(c65864Pt6, "is_empty", Long.valueOf(j4));
        LIZJ.LIZIZ("dm_search_launch_performance", c65864Pt6);
        c65864Pt6.build();
    }
}
