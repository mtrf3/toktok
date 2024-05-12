package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class O7B {
    public static final /* synthetic */ InterfaceC74236TBo[] LIZ;
    public static final String LIZIZ;
    public static final C62822Ol8 LIZJ;
    public static final C62822Ol8 LIZLLL;
    public static final C62822Ol8 LJ;
    public static final C62822Ol8 LJFF;
    public static final C62822Ol8 LJI;
    public static final C62822Ol8 LJII;
    public static final C62822Ol8 LJIIIIZZ;
    public static final O7B LJIIIZ;

    static {
        TBT tbt = new TBT(C65352Pkq.LIZ(O7B.class), "isXm", "isXm()Z");
        C65352Pkq.LIZ.getClass();
        LIZ = new InterfaceC74236TBo[]{tbt, new TBT(C65352Pkq.LIZ(O7B.class), "isOplus", "isOplus()Z"), new TBT(C65352Pkq.LIZ(O7B.class), "isVi", "isVi()Z"), new TBT(C65352Pkq.LIZ(O7B.class), "isOp", "isOp()Z"), new TBT(C65352Pkq.LIZ(O7B.class), "isHave", "isHave()Z"), new TBT(C65352Pkq.LIZ(O7B.class), "isSsung", "isSsung()Z"), new TBT(C65352Pkq.LIZ(O7B.class), "isGoogle", "isGoogle()Z")};
        LJIIIZ = new O7B();
        String str = Build.BRAND;
        o.LJFF(str, "Build.BRAND");
        Locale locale = Locale.getDefault();
        o.LJFF(locale, "Locale.getDefault()");
        String lowerCase = str.toLowerCase(locale);
        o.LJFF(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
        LIZIZ = lowerCase;
        LIZJ = C221108m2.LIZIZ(C61398O7u.LJLIL);
        LIZLLL = C221108m2.LIZIZ(C61400O7w.LJLIL);
        LJ = C221108m2.LIZIZ(O7U.LJLIL);
        LJFF = C221108m2.LIZIZ(O7T.LJLIL);
        LJI = C221108m2.LIZIZ(O7Q.LJLIL);
        LJII = C221108m2.LIZIZ(C61401O7x.LJLIL);
        LJIIIIZZ = C221108m2.LIZIZ(O7S.LJLIL);
    }

    public static int LIZIZ(Context context) {
        int identifier;
        int identifier2;
        O7N LJII2 = C61359O6h.LJII();
        o.LJFF(LJII2, "GlobalInfo.getSplashAdSettings()");
        if (!LJII2.LJIILIIL) {
            if (context == null || (identifier2 = context.getResources().getIdentifier("status_bar_height", "dimen", "android")) <= 0) {
                return 0;
            }
            return context.getResources().getDimensionPixelSize(identifier2);
        }
        if (context == null || (identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android")) <= 0) {
            return 0;
        }
        return context.getResources().getDimensionPixelSize(identifier);
    }

    public static int LIZ(Context context, boolean z) {
        int i = 0;
        if (context == null) {
            return 0;
        }
        Object LLILL = C16880lQ.LLILL(context, "window");
        if (LLILL != null) {
            Display defaultDisplay = ((WindowManager) LLILL).getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getRealMetrics(displayMetrics);
            if (z) {
                int i2 = displayMetrics.heightPixels;
                if (i2 == 0) {
                    Resources resources = context.getResources();
                    o.LJFF(resources, "context.resources");
                    DisplayMetrics displayMetrics2 = resources.getDisplayMetrics();
                    if (displayMetrics2 != null) {
                        i = displayMetrics2.heightPixels;
                    }
                } else {
                    return i2;
                }
            } else {
                int i3 = displayMetrics.widthPixels;
                if (i3 != 0) {
                    return i3;
                }
                O7N LJII2 = C61359O6h.LJII();
                o.LJFF(LJII2, "GlobalInfo.getSplashAdSettings()");
                if (!LJII2.LJIILIIL) {
                    DisplayMetrics displayMetrics3 = context.getResources().getDisplayMetrics();
                    if (displayMetrics3 != null) {
                        i = displayMetrics3.widthPixels;
                    }
                } else {
                    Resources resources2 = context.getResources();
                    o.LJFF(resources2, "context.resources");
                    DisplayMetrics displayMetrics4 = resources2.getDisplayMetrics();
                    if (displayMetrics4 != null) {
                        i = displayMetrics4.widthPixels;
                    }
                }
            }
            return i;
        }
        throw new C37692Eqm("null cannot be cast to non-null type android.view.WindowManager");
    }
}
