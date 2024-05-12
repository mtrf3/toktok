package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.o;

/* renamed from: X.3hp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C91093hp {
    public static final C91093hp LIZ = new C91093hp();
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C91133ht.LJLIL);

    public static Keva LIZLLL() {
        return (Keva) LIZIZ.getValue();
    }

    public static boolean LIZ() {
        Keva kevaRepo = LIZLLL();
        o.LJIIIIZZ(kevaRepo, "kevaRepo");
        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        o.LJIIIIZZ(curUserId, "userService().curUserId");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("key_has_show_chat_page_education_sheet");
        LIZ2.append(curUserId);
        return kevaRepo.getBoolean(X1D.LIZIZ(LIZ2), false);
    }

    public static boolean LIZIZ() {
        Keva kevaRepo = LIZLLL();
        o.LJIIIIZZ(kevaRepo, "kevaRepo");
        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        o.LJIIIIZZ(curUserId, "userService().curUserId");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("key_has_show_red_dot");
        LIZ2.append(curUserId);
        return kevaRepo.getBoolean(X1D.LIZIZ(LIZ2), false);
    }

    public static boolean LIZJ() {
        Keva kevaRepo = LIZLLL();
        o.LJIIIIZZ(kevaRepo, "kevaRepo");
        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        o.LJIIIIZZ(curUserId, "userService().curUserId");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("has_show_video_sticker_by_sticker_store");
        LIZ2.append(curUserId);
        return kevaRepo.getBoolean(X1D.LIZIZ(LIZ2), false);
    }

    public static boolean LJ() {
        Keva kevaRepo = LIZLLL();
        o.LJIIIIZZ(kevaRepo, "kevaRepo");
        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        o.LJIIIIZZ(curUserId, "userService().curUserId");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("key_show_red_dot");
        LIZ2.append(curUserId);
        return kevaRepo.getBoolean(X1D.LIZIZ(LIZ2), false);
    }

    public static void LJI() {
        Keva kevaRepo = LIZLLL();
        o.LJIIIIZZ(kevaRepo, "kevaRepo");
        kevaRepo.storeBoolean("has_enter_sticker_store", true);
    }

    public static void LJII() {
        Keva kevaRepo = LIZLLL();
        o.LJIIIIZZ(kevaRepo, "kevaRepo");
        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        o.LJIIIIZZ(curUserId, "userService().curUserId");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("key_has_show_red_dot");
        LIZ2.append(curUserId);
        kevaRepo.storeBoolean(X1D.LIZIZ(LIZ2), true);
    }

    public static void LJIIIIZZ() {
        Keva kevaRepo = LIZLLL();
        o.LJIIIIZZ(kevaRepo, "kevaRepo");
        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        o.LJIIIIZZ(curUserId, "userService().curUserId");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("has_show_video_sticker_by_sticker_store");
        LIZ2.append(curUserId);
        kevaRepo.storeBoolean(X1D.LIZIZ(LIZ2), true);
    }

    public static String LJFF(C91093hp c91093hp) {
        c91093hp.getClass();
        Keva kevaRepo = LIZLLL();
        o.LJIIIIZZ(kevaRepo, "kevaRepo");
        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        o.LJIIIIZZ(curUserId, "userService().curUserId");
        c91093hp.getClass();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("key_sticker_inline_msg_id");
        LIZ2.append(curUserId);
        return kevaRepo.getString(X1D.LIZIZ(LIZ2), null);
    }

    public static void LJIIIZ(boolean z) {
        Keva kevaRepo = LIZLLL();
        o.LJIIIIZZ(kevaRepo, "kevaRepo");
        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        o.LJIIIIZZ(curUserId, "userService().curUserId");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("key_intercept_education_sheet");
        LIZ2.append(curUserId);
        kevaRepo.storeBoolean(X1D.LIZIZ(LIZ2), z);
    }

    public static void LJIIJ(boolean z) {
        Keva kevaRepo = LIZLLL();
        o.LJIIIIZZ(kevaRepo, "kevaRepo");
        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        o.LJIIIIZZ(curUserId, "userService().curUserId");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("key_show_red_dot");
        LIZ2.append(curUserId);
        kevaRepo.storeBoolean(X1D.LIZIZ(LIZ2), z);
    }

    public static void LJIIJJI(boolean z) {
        Keva kevaRepo = LIZLLL();
        o.LJIIIIZZ(kevaRepo, "kevaRepo");
        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        o.LJIIIIZZ(curUserId, "userService().curUserId");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("key_show_red_dot_v2");
        LIZ2.append(curUserId);
        kevaRepo.storeBoolean(X1D.LIZIZ(LIZ2), z);
    }

    public static void LJIIL(String str, String str2) {
        C91093hp c91093hp = LIZ;
        Keva kevaRepo = LIZLLL();
        o.LJIIIIZZ(kevaRepo, "kevaRepo");
        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        o.LJIIIIZZ(curUserId, "userService().curUserId");
        synchronized (c91093hp) {
            if (LJFF(c91093hp) == null) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("key_sticker_inline_conv_id");
                LIZ2.append(curUserId);
                kevaRepo.storeString(X1D.LIZIZ(LIZ2), str2);
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("key_sticker_inline_msg_id");
                LIZ3.append(curUserId);
                kevaRepo.storeString(X1D.LIZIZ(LIZ3), str);
            }
        }
    }
}
