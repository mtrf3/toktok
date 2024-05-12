package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;

/* renamed from: X.Hm2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45042Hm2 {
    public static final /* synthetic */ int LIZ = 0;

    public static final boolean LIZIZ() {
        if (C00F.LIZ(31744, 0, "landing_page_optimization_experiment", false) != 3) {
            return false;
        }
        return true;
    }

    public static final boolean LIZ(Aweme aweme) {
        AwemeStatus status;
        int LIZ2 = C00F.LIZ(31744, 0, "landing_page_optimization_experiment", false);
        if (LIZ2 != 3 && ((LIZ2 != 1 && LIZ2 != 2) || (status = aweme.getStatus()) == null || status.getPrivateStatus() != 0)) {
            return false;
        }
        return true;
    }
}
