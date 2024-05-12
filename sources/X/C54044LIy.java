package X;

import android.view.View;
import com.ss.android.ugc.aweme.mob.event.IHomePageMobProvider;
import com.ss.android.ugc.aweme.mob.event.NearbyHomePageMobProvider;

/* renamed from: X.LIy, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C54044LIy {
    public NearbyHomePageMobProvider LIZ;

    public void LIZ(View view) {
        ActivityC45651qj LJ;
        if (!C16330kX.LIZIZ(view)) {
            NearbyHomePageMobProvider nearbyHomePageMobProvider = this.LIZ;
            if (nearbyHomePageMobProvider != null && (LJ = C1DG.LJ(view, "view.context")) != null) {
                C62814Ol0.LJJIJL(C55230Lly.LIZLLL(LJ, null), IHomePageMobProvider.class, nearbyHomePageMobProvider);
                return;
            }
            return;
        }
        view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC54043LIx(view, this, view));
    }

    public void LIZIZ(View view) {
        ActivityC45651qj LJ = C1DG.LJ(view, "view.context");
        if (LJ != null) {
            C55247LmF.LIZIZ(C55230Lly.LIZLLL(LJ, null), new C80703Es(String.valueOf(LJ5.LJIIIIZZ(LJ) ? 1 : 0), 6), C80703Es.class, "source_default_key");
        }
    }
}
