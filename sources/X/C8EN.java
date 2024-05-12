package X;

import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.8EN, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8EN {
    public final C8EP LIZ;
    public final C8EO LIZIZ;
    public final EnumC226898vN LIZJ;
    public final EnumC226878vL LIZLLL;
    public final EnumC226888vM LJ;
    public final int LJFF;
    public boolean LJI;
    public boolean LJII;

    public static String LIZJ(Enum r1) {
        o.LJIIIZ(r1, "<this>");
        String lowerCase = r1.name().toLowerCase(Locale.ROOT);
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }

    public final void LIZ(C188727au c188727au) {
        C8EP c8ep = this.LIZ;
        if (c8ep != null) {
            c188727au.LIZLLL(c8ep.getValue(), "avatar_only_flow");
        }
        C8EO c8eo = this.LIZIZ;
        if (c8eo != null) {
            c188727au.LIZLLL(c8eo.getValue(), "nickname_only_flow");
        }
        c188727au.LJI("enter_from", LIZJ(this.LIZJ));
        EnumC226878vL enumC226878vL = this.LIZLLL;
        if (enumC226878vL != null) {
            c188727au.LJI("position", LIZJ(enumC226878vL));
        }
        c188727au.LJI("show_reason", LIZJ(this.LJ));
        c188727au.LIZLLL(this.LJFF, "show_cnt");
    }

    public final boolean LIZIZ(C8EI c8ei) {
        if (this.LJII) {
            return true;
        }
        if (c8ei == C8EI.CANCEL || c8ei == C8EI.NOT_NOW || c8ei == C8EI.X_SIGN || c8ei == C8EI.ELSEWHERE) {
            if (this.LJI) {
                return true;
            }
            this.LJI = true;
        }
        return false;
    }

    public final void LIZLLL(C8EI clickWhat) {
        o.LJIIIZ(clickWhat, "clickWhat");
        if (LIZIZ(clickWhat)) {
            return;
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("click_what", LIZJ(clickWhat));
        LIZ(c188727au);
        FMX.LJIIL("click_update_avatar_toast", c188727au.LIZ);
    }

    public final void LJ(C8EI clickWhat) {
        o.LJIIIZ(clickWhat, "clickWhat");
        if (LIZIZ(clickWhat)) {
            return;
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("click_what", LIZJ(clickWhat));
        LIZ(c188727au);
        FMX.LJIIL("click_update_nickname_toast", c188727au.LIZ);
    }

    public C8EN(C8EP c8ep, C8EO c8eo, EnumC226898vN enterFrom, EnumC226878vL enumC226878vL, EnumC226888vM showReason, int i) {
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(showReason, "showReason");
        this.LIZ = c8ep;
        this.LIZIZ = c8eo;
        this.LIZJ = enterFrom;
        this.LIZLLL = enumC226878vL;
        this.LJ = showReason;
        this.LJFF = i;
    }
}
