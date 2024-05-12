package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.o;

/* renamed from: X.3Tk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C84523Tk {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C84533Tl.LJLIL);

    public static Keva LJII() {
        return (Keva) LIZ.getValue();
    }

    public static boolean LIZ() {
        Keva kevaRepo = LJII();
        o.LJIIIIZZ(kevaRepo, "kevaRepo");
        if (kevaRepo.getBoolean(LJ(), false)) {
            return false;
        }
        Keva kevaRepo2 = LJII();
        o.LJIIIIZZ(kevaRepo2, "kevaRepo");
        if (kevaRepo2.getBoolean(LIZIZ(), false)) {
            return false;
        }
        return true;
    }

    public static String LIZIZ() {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("has_add_welcome_msg-");
        LIZ2.append(((RBX) HG3.LJIILL()).getCurUser().getUid());
        return X1D.LIZIZ(LIZ2);
    }

    public static boolean LIZJ() {
        Keva kevaRepo = LJII();
        o.LJIIIIZZ(kevaRepo, "kevaRepo");
        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        o.LJIIIIZZ(curUserId, "userService().curUserId");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("has_agreed_disclaimer");
        LIZ2.append(curUserId);
        return kevaRepo.getBoolean(X1D.LIZIZ(LIZ2), false);
    }

    public static String LIZLLL() {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("has_bring_to_top-");
        LIZ2.append(((RBX) HG3.LJIILL()).getCurUser().getUid());
        return X1D.LIZIZ(LIZ2);
    }

    public static String LJ() {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("has_entered_tik_bot-");
        LIZ2.append(((RBX) HG3.LJIILL()).getCurUser().getUid());
        return X1D.LIZIZ(LIZ2);
    }

    public static boolean LJFF() {
        Keva kevaRepo = LJII();
        o.LJIIIIZZ(kevaRepo, "kevaRepo");
        return kevaRepo.getBoolean(LJIIIIZZ(), false);
    }

    public static String LJI() {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("has_shown_guide_card-");
        LIZ2.append(((RBX) HG3.LJIILL()).getCurUser().getUid());
        return X1D.LIZIZ(LIZ2);
    }

    public static String LJIIIIZZ() {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("has_mark_read_first_time-");
        LIZ2.append(((RBX) HG3.LJIILL()).getCurUser().getUid());
        return X1D.LIZIZ(LIZ2);
    }

    public static void LJIIIZ() {
        Keva kevaRepo = LJII();
        o.LJIIIIZZ(kevaRepo, "kevaRepo");
        kevaRepo.storeBoolean(LJIIIIZZ(), true);
    }

    public static void LJIIJ() {
        Keva kevaRepo = LJII();
        o.LJIIIIZZ(kevaRepo, "kevaRepo");
        kevaRepo.storeBoolean(LJI(), true);
    }
}
