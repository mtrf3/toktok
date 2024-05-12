package X;

import android.graphics.Typeface;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.FnL, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40027FnL implements InterfaceC40021FnF {
    public static final C40027FnL LIZ = new C40027FnL();

    @Override // X.InterfaceC40021FnF
    public final Typeface LIZ(int i, String fontFamily) {
        String LIZ2;
        o.LJIIIIZZ(fontFamily, "fontFamily");
        Locale locale = Locale.ENGLISH;
        String LIZIZ = C141415gn.LIZIZ(locale, "ENGLISH", fontFamily, locale, "this as java.lang.String).toLowerCase(locale)");
        if (C40026FnK.LIZIZ.contains(LIZIZ)) {
            LIZ2 = UYR.LIZ(3, false);
        } else if (C40026FnK.LIZJ.contains(LIZIZ)) {
            LIZ2 = UYR.LIZ(2, false);
        } else if (C40026FnK.LIZLLL.contains(LIZIZ)) {
            LIZ2 = UYR.LIZ(1, false);
        } else if (C40026FnK.LJ.contains(LIZIZ)) {
            LIZ2 = UYR.LIZ(3, true);
        } else if (C40026FnK.LJFF.contains(LIZIZ)) {
            LIZ2 = UYR.LIZ(2, true);
        } else {
            if (C40026FnK.LJI.contains(LIZIZ)) {
                LIZ2 = UYR.LIZ(1, true);
            }
            return null;
        }
        try {
            return Typeface.createFromAsset(EF7.LIZIZ().getAssets(), LIZ2);
        } catch (Throwable unused) {
        }
    }
}
