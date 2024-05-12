package X;

import java.io.PrintStream;
import java.util.Arrays;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class PSY {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LIZ(String text) {
        o.LJIIJ(text, "text");
    }

    public static final void LJ(String text) {
        o.LJIIJ(text, "text");
        C66465Q6r c66465Q6r = C66465Q6r.LJIILLIIL;
        o.LJFF(c66465Q6r, "SafeModeConfig.getInstance()");
        if (c66465Q6r.LIZIZ != null) {
            C1JX.LJIIIIZZ("msg:", text);
        }
    }

    public static final void LIZIZ(String str, String text) {
        o.LJIIJ(text, "text");
        o.LJIIIIZZ(C16880lQ.LLLZ("%s %s", Arrays.copyOf(new Object[]{str, text}, 2)), "java.lang.String.format(format, *args)");
    }

    public static final void LIZJ(String text, Throwable th) {
        o.LJIIJ(text, "text");
        C66465Q6r c66465Q6r = C66465Q6r.LJIILLIIL;
        o.LJFF(c66465Q6r, "SafeModeConfig.getInstance()");
        if (c66465Q6r.LIZIZ != null) {
            PrintStream printStream = System.err;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("SafeModeCallback msg:");
            LIZ2.append(text);
            LIZ2.append(" throwable:");
            LIZ2.append(th);
            printStream.println(X1D.LIZIZ(LIZ2));
        }
    }

    public static final void LIZLLL(String str, String text) {
        o.LJIIJ(text, "text");
        C66465Q6r c66465Q6r = C66465Q6r.LJIILLIIL;
        o.LJFF(c66465Q6r, "SafeModeConfig.getInstance()");
        if (c66465Q6r.LIZIZ != null) {
            String LIZIZ = Q8U.LIZIZ(new Object[]{str, text}, 2, "%s %s", "java.lang.String.format(format, *args)");
            PrintStream printStream = System.err;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("SafeModeCallback msg:");
            LIZ2.append(LIZIZ);
            printStream.println(X1D.LIZIZ(LIZ2));
        }
    }

    public static final void LJFF(String str, String text) {
        o.LJIIJ(text, "text");
        C66465Q6r c66465Q6r = C66465Q6r.LJIILLIIL;
        o.LJFF(c66465Q6r, "SafeModeConfig.getInstance()");
        if (c66465Q6r.LIZIZ != null) {
            C1JX.LJIIIIZZ("msg:", Q8U.LIZIZ(new Object[]{str, text}, 2, "%s %s", "java.lang.String.format(format, *args)"));
        }
    }
}
