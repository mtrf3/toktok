package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.compliance.business.privateaccount.publishconfirm.PolicyApi;
import kotlin.jvm.internal.o;

/* renamed from: X.On7, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62945On7 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Activity activity) {
        if (activity == null) {
            return;
        }
        ((RBX) HG3.LJIILL()).getCurUser().setAcceptPrivatePolicy(true);
        C77119UOl.LJIJ(((PolicyApi.PolicyService) PolicyApi.LIZ.getValue()).acceptPrivacyPolicy(), "/aweme/v1/accept-private-policy/").LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(C62944On6.LJLIL, C62946On8.LJLIL);
    }

    public static boolean LIZIZ(Activity activity) {
        o.LJIIIZ(activity, "activity");
        boolean z = !((RBX) HG3.LJIILL()).getCurUser().isAcceptPrivatePolicy();
        if (z && ((RBX) HG3.LJIILL()).getCurUser().isSecret()) {
            LIZ(activity);
            return false;
        }
        return z;
    }
}
