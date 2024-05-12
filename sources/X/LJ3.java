package X;

import com.ss.android.ugc.aweme.settings.NearbyTabConfig;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LJ3 implements LDY {
    public final /* synthetic */ C53956LFo LJLIL;

    public LJ3(C53956LFo c53956LFo) {
        this.LJLIL = c53956LFo;
    }

    @Override // X.LDY
    public final void LIZ(String str, String to) {
        ActivityC45651qj activityC45651qj;
        LJ1 LJII;
        LJ1 LJII2;
        ActivityC45651qj activityC45651qj2;
        o.LJIIIZ(to, "to");
        LJ5.LIZIZ = o.LJ(to, "Nearby");
        if (NearbyTabConfig.LIZLLL()) {
            C54045LIz.LIZ.getClass();
            if (C54045LIz.LIZ()) {
                return;
            }
            if (o.LJ(to, "Nearby") && NearbyTabConfig.LJI() && (activityC45651qj2 = this.LJLIL.LJLIL) != null) {
                LJ5.LJIIJ(activityC45651qj2);
            }
            if (!o.LJ(str, "Nearby") || (activityC45651qj = this.LJLIL.LJLIL) == null || (LJII = LJ5.LJII(activityC45651qj)) == null || !LJII.LJLJJI || (LJII2 = LJ5.LJII(activityC45651qj)) == null) {
                return;
            }
            LJII2.LIZJ();
        }
    }
}
