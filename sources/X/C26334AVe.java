package X;

import android.os.Bundle;
import kotlin.jvm.internal.o;

/* renamed from: X.AVe, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26334AVe {
    public static void LIZ(ActivityC45651qj activityC45651qj, String enterFrom, String enterMethod, Bundle bundle, JJ4 jj4) {
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(enterMethod, "enterMethod");
        C40883G2t c40883G2t = new C40883G2t();
        c40883G2t.LIZLLL("previous_uid", ((RBX) HG3.LJIILL()).getCurUserId());
        c40883G2t.LIZJ("force_use_default_login_method", true);
        c40883G2t.LIZJ("is_multi_account", true);
        c40883G2t.LIZJ("is_fullscreen_dialog", true);
        c40883G2t.LIZJ("is_skippable_dialog", true);
        c40883G2t.LIZJ("need_auto_fill_latest_login_info", false);
        Bundle bundle2 = (Bundle) c40883G2t.LIZ;
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        J9P.LIZIZ(activityC45651qj, enterFrom, enterMethod, bundle2, jj4);
    }
}
