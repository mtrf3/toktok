package X;

import kotlin.jvm.internal.o;

/* renamed from: X.SMq, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71976SMq {
    public static final /* synthetic */ int LIZ = 0;

    public static final String LIZ(Integer num) {
        if (num != null) {
            if (num.intValue() == 1) {
                return "Everyone";
            }
            if (num.intValue() == 2) {
                return "Friends";
            }
            if (num.intValue() == 3) {
                return "No_one";
            }
            if (num.intValue() == 4) {
                return "Suggested_friends";
            }
        }
        return null;
    }

    public static final void LIZIZ(int i, Integer num, String str) {
        if (num == null || num.intValue() != 1) {
            return;
        }
        LIZJ(i, "privacy_and_safety_settings", str, "system");
    }

    public static void LIZJ(int i, String enterFrom, String str, String str2) {
        String str3;
        o.LJIIIZ(enterFrom, "enterFrom");
        if (i != 1) {
            if (i != 2) {
                str3 = "";
            } else {
                str3 = "off";
            }
        } else {
            str3 = "on";
        }
        C71969SMj c71969SMj = new C71969SMj();
        c71969SMj.LIZIZ("enter_from", enterFrom);
        c71969SMj.LIZIZ("to_status", str3);
        c71969SMj.LIZIZ("target", str);
        if (!o.LJ(str, "business_allowance")) {
            c71969SMj.LIZIZ("action_source", str2);
        }
        C72028SOq LIZ2 = C0N3.LIZ(C71909SKb.LIZ);
        java.util.Map<String, String> map = c71969SMj.LIZ;
        C07250Qf.LIZLLL(map, "builder.builder()", LIZ2, "change_message_preference_permission", map);
    }
}
