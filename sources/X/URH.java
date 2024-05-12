package X;

import com.bytedance.lobby.auth.AuthResult;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class URH {
    public static final List<URJ> LIZ;
    public static final List<URJ> LIZIZ;
    public static final List<URJ> LIZJ;

    static {
        URJ urj = URJ.BLACK_BACKGROUND_ACTUAL_DIALOG_USER;
        LIZ = C47261Igj.LJJIJIIJI(URJ.BLACK_BACKGROUND_ACTUAL, urj);
        URJ urj2 = URJ.DIALOG_ACTUAL_AND_USER;
        LIZIZ = C47261Igj.LJJIJIIJI(URJ.DIALOG_ACTUAL, urj2);
        LIZJ = C47261Igj.LJJIJIIJI(URJ.DIALOG_USER, urj2, urj);
    }

    public static final String LIZ(EnumC77147UPn enumC77147UPn) {
        o.LJIIIZ(enumC77147UPn, "<this>");
        int i = C77142UPi.LIZ[enumC77147UPn.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return "finish_mlbb_permission_process";
                }
                "wrong relationAuthPlatform".toString();
                throw new IllegalStateException("wrong relationAuthPlatform");
            }
            return "finish_facebook_permission_process";
        }
        return "finish_contact_permission_process";
    }

    public static final ActivityC45651qj LIZIZ(C77207URv c77207URv) {
        o.LJIIIZ(c77207URv, "<this>");
        ActivityC45651qj activityC45651qj = c77207URv.LIZIZ;
        if (activityC45651qj != null) {
            return activityC45651qj;
        }
        "context is null".toString();
        throw new IllegalStateException("context is null");
    }

    public static final ActivityC45651qj LIZJ(C77210URy c77210URy) {
        o.LJIIIZ(c77210URy, "<this>");
        ActivityC45651qj activityC45651qj = c77210URy.LIZIZ;
        if (activityC45651qj != null) {
            return activityC45651qj;
        }
        "context is null".toString();
        throw new IllegalStateException("context is null");
    }

    public static final boolean LIZLLL(AuthResult authResult, String str) {
        o.LJIIIZ(authResult, "<this>");
        String[] stringArray = authResult.mBundle.getStringArray("fb_granted_permissions");
        if (stringArray == null || stringArray.length == 0) {
            return false;
        }
        C38489F8r LJJIIJZLJL = C30581Hy.LJJIIJZLJL(stringArray);
        while (LJJIIJZLJL.hasNext()) {
            if (o.LJ(LJJIIJZLJL.next(), str)) {
                return true;
            }
        }
        return false;
    }
}
