package Y;

import X.C03880Dg;
import X.C10I;
import X.C10K;
import X.C39099FWd;
import X.C39519Ff9;
import X.C65300Pk0;
import X.C76800UCe;
import android.webkit.CookieManager;
import defpackage.i0;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public class AgS23S1000000_6 implements C10I {
    public final int $t;
    public String s0;

    @Override // X.C10I
    public final Object then(C10K c10k) {
        switch (this.$t) {
            case 0:
                return then$0(this, c10k);
            case 1:
                return then$1(this, c10k);
            default:
                return null;
        }
    }

    public AgS23S1000000_6(String str, int i) {
        this.$t = i;
        switch (i) {
            case 0:
                this.s0 = str;
                return;
            default:
                this.s0 = str;
                return;
        }
    }

    public static final Object then$0(AgS23S1000000_6 agS23S1000000_6, C10K c10k) {
        String cookie;
        CookieManager cookieManager = CookieManager.getInstance();
        String str = agS23S1000000_6.s0;
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(103100, "android/webkit/CookieManager", "getCookie", cookieManager, new Object[]{str}, "java.lang.String", new C65300Pk0(false, "(Ljava/lang/String;)Ljava/lang/String;", "-4934686094424539222"));
        if (LIZJ.LIZ) {
            cookie = (String) LIZJ.LIZIZ;
        } else {
            cookie = cookieManager.getCookie(str);
        }
        String str2 = agS23S1000000_6.s0;
        o.LJIIIIZZ(cookie, "cookie");
        C39099FWd.LIZJ(str2, cookie);
        return C76800UCe.LIZ;
    }

    public static final Object then$1(AgS23S1000000_6 agS23S1000000_6, C10K c10k) {
        String str = agS23S1000000_6.s0;
        if (!c10k.LJIILJJIL()) {
            return null;
        }
        throw new RuntimeException(i0.LJFF("Error while start downloading ", str), c10k.LJIIJ());
    }
}
