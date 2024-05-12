package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.services.BaseUserService;

/* renamed from: X.43J, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C43J {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C43L.LJLIL);
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C43M.LJLIL);
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(C43K.LJLIL);
    public static final C62822Ol8 LIZLLL = C221108m2.LIZIZ(C1031543b.LJLIL);

    public static Keva LIZJ() {
        return (Keva) LIZLLL.getValue();
    }

    public static boolean LIZLLL() {
        return ((Boolean) LIZJ.getValue()).booleanValue();
    }

    public static String LIZ() {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("DISPLAY:");
        LIZ2.append(BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUserID());
        return X1D.LIZIZ(LIZ2);
    }

    public static String LIZIZ() {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("OPERATE:");
        LIZ2.append(BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUserID());
        return X1D.LIZIZ(LIZ2);
    }

    public static void LJ() {
        LIZJ().storeInt(LIZIZ(), LIZJ().getInt(LIZIZ(), 0) + 1);
    }
}
