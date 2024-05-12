package X;

/* loaded from: classes8.dex */
public final class G70 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, String str2) {
        C145995oB c145995oB = new C145995oB();
        if (str == null) {
            str = "";
        }
        c145995oB.LJI("shoot_way", str);
        c145995oB.LJI("creation_id", str2);
        FMX.LJIIL("accept_transl_auth", c145995oB.LIZ);
    }

    public static void LIZIZ(String str, String str2) {
        C145995oB c145995oB = new C145995oB();
        if (str == null) {
            str = "";
        }
        c145995oB.LJI("shoot_way", str);
        c145995oB.LJI("creation_id", str2);
        FMX.LJIIL("decline_transl_auth", c145995oB.LIZ);
    }

    public static void LIZJ(String str, String str2) {
        C145995oB c145995oB = new C145995oB();
        if (str == null) {
            str = "";
        }
        c145995oB.LJI("shoot_way", str);
        c145995oB.LJI("creation_id", str2);
        FMX.LJIIL("show_transl_auth_intro", c145995oB.LIZ);
    }

    public static void LIZLLL(String str, String str2, boolean z) {
        String str3;
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("enter_from", "video_post_page");
        if (z) {
            str3 = "on";
        } else {
            str3 = "off";
        }
        c145995oB.LJI("to_status", str3);
        if (str == null) {
            str = "";
        }
        c145995oB.LJI("shoot_way", str);
        c145995oB.LJI("creation_id", str2);
        c145995oB.LJI("author_id", C44172HVg.LJIJ.getCurrentUserID());
        FMX.LJIIL("change_asr_authorization", c145995oB.LIZ);
    }
}
