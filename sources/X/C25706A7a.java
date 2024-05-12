package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.o;

/* renamed from: X.A7a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25706A7a {
    public static Keva LIZIZ() {
        Object value = C25710A7e.LJII.getValue();
        o.LJIIIIZZ(value, "<get-repo>(...)");
        return (Keva) value;
    }

    public static boolean LIZ() {
        RBX rbx = (RBX) HG3.LJIILL();
        if (!rbx.isLogin()) {
            C221018lt.LJFF("@LinkRelation", "not showPrivacyNotice, not login!");
            return false;
        }
        C25707A7b.LIZ.getClass();
        FFL.LJIIIZ().getClass();
        if (FFL.LJIIJ(31744, 0, "link_privacy_guide_dialog_enable", true) == 1) {
            String curUserId = rbx.getCurUserId();
            if (curUserId == null) {
                curUserId = "";
            }
            if (!LIZIZ().getBoolean(curUserId, false)) {
                return true;
            }
            C221018lt.LJFF("@LinkRelation", "not showPrivacyNotice, has shown!");
            return false;
        }
        C221018lt.LJFF("@LinkRelation", "not showPrivacyNotice, experiment not enable!");
        return false;
    }
}
