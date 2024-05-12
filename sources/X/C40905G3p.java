package X;

import android.content.Context;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.G3p, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40905G3p {
    public static boolean LIZIZ;
    public static C40910G3u LIZJ;
    public static FQV LIZLLL;
    public static C64286PKw LJ;
    public static Locale LJFF;
    public static FQU LJI;
    public static int LJII;
    public static final C40905G3p LIZ = new C40905G3p();
    public static final Object LJIIIIZZ = new Object();

    public static C40910G3u LIZ() {
        C40910G3u c40910G3u = LIZJ;
        if (c40910G3u != null) {
            return c40910G3u;
        }
        o.LJIJI("config");
        throw null;
    }

    public static Locale LIZIZ() {
        Locale locale = LJFF;
        if (locale != null) {
            return locale;
        }
        o.LJIJI("currentLocale");
        throw null;
    }

    public static void LIZLLL(Context context, String str, Locale locale, boolean z) {
        if (LIZ().LIZIZ) {
            if (z) {
                LIZJ(context, locale, str, "local", System.nanoTime(), null);
                return;
            } else {
                LIZLLL = null;
                return;
            }
        }
        LIZJ(context, locale, str, "local", System.nanoTime(), null);
    }

    public static final void LIZJ(Context context, Locale currentLocale, String str, String str2, long j, InterfaceC39411FdP interfaceC39411FdP) {
        FQV fqv;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(currentLocale, "currentLocale");
        int i = 0;
        try {
            try {
                C40912G3w c40912G3w = C40908G3s.LIZIZ;
                if (c40912G3w != null) {
                    c40912G3w.LIZ = j;
                    c40912G3w.LIZLLL = str2;
                    c40912G3w.LJ = currentLocale;
                }
                if (C40913G3x.LIZ[LIZ().LIZLLL.ordinal()] == 1) {
                    fqv = C40907G3r.LIZ(context, str, currentLocale, LIZ().LIZIZ);
                } else {
                    fqv = null;
                }
                LIZLLL = fqv;
                if (fqv != null) {
                    i = 1;
                }
                C40912G3w c40912G3w2 = C40908G3s.LIZIZ;
                if (c40912G3w2 != null) {
                    c40912G3w2.LJII = i;
                    c40912G3w2.LIZIZ = System.nanoTime();
                }
                C40908G3s.LIZ();
                if (interfaceC39411FdP == null) {
                    return;
                }
            } catch (Exception e) {
                LIZLLL = null;
                i = -1;
                C40912G3w c40912G3w3 = C40908G3s.LIZIZ;
                if (c40912G3w3 != null) {
                    c40912G3w3.LJII = -1;
                    String message = e.getMessage();
                    if (message == null) {
                        message = e.toString();
                    }
                    o.LJIIIZ(message, "<set-?>");
                    c40912G3w3.LJIIIIZZ = message;
                }
                C40912G3w c40912G3w4 = C40908G3s.LIZIZ;
                if (c40912G3w4 != null) {
                    c40912G3w4.LIZIZ = System.nanoTime();
                }
                C40908G3s.LIZ();
                if (interfaceC39411FdP == null) {
                    return;
                }
            }
            interfaceC39411FdP.LIZ(i);
        } catch (Throwable th) {
            C40912G3w c40912G3w5 = C40908G3s.LIZIZ;
            if (c40912G3w5 != null) {
                c40912G3w5.LIZIZ = System.nanoTime();
            }
            C40908G3s.LIZ();
            if (interfaceC39411FdP != null) {
                interfaceC39411FdP.LIZ(i);
            }
            throw th;
        }
    }
}
