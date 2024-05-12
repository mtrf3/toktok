package X;

import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class T64 {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(T6A.LJLIL);

    public static void LIZIZ(String str, String userId) {
        o.LJIIIZ(userId, "userId");
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("enter_from", "");
        c145995oB.LJI("sign_enter_from", str);
        c145995oB.LJI("exit_method", "exit");
        c145995oB.LJI("user_id", userId);
        FMX.LJIIL("exit_vop_sign_up_intro_page", c145995oB.LIZ);
    }

    public static void LIZ(int i, String str, String userId) {
        o.LJIIIZ(userId, "userId");
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("enter_from", str);
        c145995oB.LIZ(i, "is_first_enter");
        c145995oB.LJI("user_id", userId);
        FMX.LJIIL("enter_vop_sign_up_intro_page", c145995oB.LIZ);
    }
}
