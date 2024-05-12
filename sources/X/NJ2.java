package X;

import java.io.InputStream;
import kotlin.jvm.internal.AqS160S0100000_10;
import ujb.o;
import ujb.s;

/* loaded from: classes11.dex */
public final class NJ2 extends O43 {
    public static boolean LJIILJJIL;
    public static boolean LJIILL;
    public static String LJIILLIIL;
    public final String LIZIZ;
    public final String LIZJ;
    public final InterfaceC88472Yns<String, C76800UCe> LIZLLL;
    public java.util.Map<String, NJ3> LJ;
    public NJ0 LJFF;
    public String LJI;
    public final C62822Ol8 LJII;
    public long LJIIIIZZ;
    public long LJIIIZ;
    public long LJIIJ;
    public long LJIIJJI;
    public long LJIIL;
    public long LJIILIIL;

    @Override // X.O43
    public final InputStream LIZIZ(String str) {
        return null;
    }

    @Override // X.O43
    public final String LIZLLL() {
        return "";
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x02e0  */
    @Override // X.O43, X.NJM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.webkit.WebResourceResponse LIZ(java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 1224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NJ2.LIZ(java.lang.String):android.webkit.WebResourceResponse");
    }

    @Override // X.O43
    public final String LIZJ(String str) {
        if (str != null) {
            if (o.LJJJJ(str, ".shtml", false) || o.LJJJJ(str, ".do", false)) {
                return "text/html";
            }
            if (s.LJJJLZIJ(str, ".", false)) {
                String substring = str.substring(s.LJJLIIJ(str, ".", 6));
                kotlin.jvm.internal.o.LJIIIIZZ(substring, "this as java.lang.String).substring(startIndex)");
                int LJJLIIIJL = s.LJJLIIIJL(substring, "/", 0, false, 6);
                if (LJJLIIIJL > -1) {
                    String substring2 = str.substring(0, s.LJJLIIJ(str, ".", 6) + LJJLIIIJL);
                    kotlin.jvm.internal.o.LJIIIIZZ(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    return super.LIZJ(substring2);
                }
            }
        }
        return super.LIZJ(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NJ2(String str, String str2, InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns) {
        super(true);
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = interfaceC88472Yns;
        this.LJII = C221108m2.LIZIZ(new AqS160S0100000_10(this, 578));
    }
}
