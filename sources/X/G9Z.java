package X;

import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class G9Z {
    public static GVN LIZ;

    public static void LIZ(C145995oB c145995oB) {
        Integer num;
        o.LJIIIZ(c145995oB, "<this>");
        GVN gvn = LIZ;
        if (gvn != null && (num = gvn.LIZLLL) != null) {
            c145995oB.LIZ(num.intValue(), "aweme_type");
        }
    }

    public static void LIZIZ(C145995oB c145995oB) {
        String str;
        c145995oB.LIZLLL("user_id", C60903NvH.LJIIJJI().getAccountService().getCurrentUserID());
        GVN gvn = LIZ;
        if (gvn == null || (str = gvn.LIZ) == null) {
            str = "";
        }
        c145995oB.LIZLLL("group_id", str);
        LIZ(c145995oB);
    }

    public static void LIZJ(String str, String str2) {
        C145995oB c145995oB = new C145995oB();
        LIZIZ(c145995oB);
        c145995oB.LJI("enter_method", str2);
        FMX.LJIIL(str, c145995oB.LIZ);
    }
}
