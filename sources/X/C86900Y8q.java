package X;

import android.view.View;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.profile.widgets.awemepager.AwemePagerVM;
import kotlin.jvm.internal.o;

/* renamed from: X.Y8q, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86900Y8q extends C86898Y8o {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C86900Y8q(AwemePagerVM pagerVM) {
        super(pagerVM);
        o.LJIIIZ(pagerVM, "pagerVM");
    }

    @Override // X.C86898Y8o
    public final void LIZ(C79236V7w profileTabData, View view) {
        C79235V7v c79235V7v;
        o.LJIIIZ(profileTabData, "profileTabData");
        if ((profileTabData instanceof C79235V7v) && (c79235V7v = (C79235V7v) profileTabData) != null && c79235V7v.LJFF) {
            Keva repo = Keva.getRepo("PROFILE_TAB_REPO");
            if (this.LIZ.LJLJI) {
                if (!repo.getBoolean("PROFILE_EFFECT_TAB_RED_DOT_SHOWN", false)) {
                    C86898Y8o.LJII(view);
                } else {
                    C86898Y8o.LIZIZ(view);
                }
            }
        }
    }

    @Override // X.C86898Y8o
    public final void LJ(C79236V7w profileTabData, int i, View view) {
        o.LJIIIZ(profileTabData, "profileTabData");
        o.LJIIIZ(view, "view");
        super.LJ(profileTabData, i, view);
        if (this.LIZ.LJLJI) {
            Keva.getRepo("PROFILE_TAB_REPO").storeBoolean("PROFILE_EFFECT_TAB_RED_DOT_SHOWN", true);
            C86898Y8o.LIZIZ(view);
        }
    }
}
