package X;

import android.graphics.Typeface;
import kotlin.jvm.internal.o;

/* renamed from: X.Uxa, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78882Uxa {
    public static final /* synthetic */ InterfaceC74236TBo[] LIZ;
    public static final C82892Wg4 LIZIZ;
    public static final C82892Wg4 LIZJ;
    public static InterfaceC82885Wfx LIZLLL;
    public static final C78882Uxa LJ;

    static {
        TBV tbv = new TBV(C78882Uxa.class, "fontSource", "getFontSource()Lcom/ss/android/ugc/tools/view/style/IFontSource;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LIZ = new InterfaceC74236TBo[]{tbv, C07250Qf.LIZIZ(C78882Uxa.class, "defaultFontProvider", "getDefaultFontProvider()Lkotlin/jvm/functions/Function0;", 0, c65351Pkp)};
        LJ = new C78882Uxa();
        LIZIZ = new C82892Wg4(C78884Uxc.LJLIL);
        LIZJ = new C82892Wg4(C78883Uxb.LJLIL);
    }

    public static final Typeface LIZ(String fontName) {
        o.LJIIIZ(fontName, "fontName");
        C78882Uxa c78882Uxa = LJ;
        c78882Uxa.getClass();
        InterfaceC173646rg interfaceC173646rg = (InterfaceC173646rg) LIZIZ.LIZ(c78882Uxa, LIZ[0]);
        if (interfaceC173646rg != null) {
            return interfaceC173646rg.LIZIZ(fontName);
        }
        return null;
    }
}
