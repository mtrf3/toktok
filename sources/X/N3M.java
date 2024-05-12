package X;

import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes11.dex */
public final class N3M {
    public final String LIZ;
    public String LIZIZ;
    public List<String> LIZJ;
    public String LIZLLL;

    public final N3J LIZ() {
        if (this.LIZ.length() > 0 && this.LIZIZ.length() > 0 && this.LIZLLL.length() > 0) {
            return new N3J(this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL);
        }
        return null;
    }

    public final String toString() {
        return String.valueOf(LIZ());
    }

    public N3M(String url) {
        int i;
        o.LJIIIZ(url, "url");
        String str = "";
        this.LIZ = "";
        this.LIZIZ = "";
        this.LIZLLL = "";
        String LJLLI = s.LJLLI(url, "tplv-", url);
        String LJLLL = s.LJLLL(LJLLI, "?", LJLLI);
        int LJJLIIIJL = s.LJJLIIIJL(LJLLL, "-", 0, false, 6);
        try {
            String substring = LJLLL.substring(0, LJJLIIIJL);
            o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            if (substring != null) {
                str = substring;
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
        }
        this.LIZ = str;
        try {
            int LJJLIIIJL2 = s.LJJLIIIJL(LJLLL, ":", 0, false, 6);
            int LJJLIIIJL3 = s.LJJLIIIJL(LJLLL, ".", 0, false, 6);
            int i2 = LJJLIIIJL + 1;
            if (LJJLIIIJL2 == -1) {
                i = LJJLIIIJL3;
            } else {
                i = LJJLIIIJL2;
            }
            String substring2 = LJLLL.substring(i2, i);
            o.LJIIIIZZ(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
            this.LIZIZ = substring2;
            if (LJJLIIIJL2 != -1) {
                String substring3 = LJLLL.substring(LJJLIIIJL2 + 1, LJJLIIIJL3);
                o.LJIIIIZZ(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
                this.LIZJ = s.LJLJJL(substring3, new String[]{":"}, 0, 6);
            }
            String substring4 = LJLLL.substring(LJJLIIIJL3 + 1);
            o.LJIIIIZZ(substring4, "this as java.lang.String).substring(startIndex)");
            this.LIZLLL = substring4;
        } catch (Throwable th) {
            C78983UzD.LJIIZILJ(th);
        }
    }

    public N3M(N3J n3j) {
        this.LIZ = "";
        this.LIZ = n3j.LIZ;
        this.LIZIZ = n3j.LIZIZ;
        this.LIZJ = n3j.LIZJ;
        this.LIZLLL = n3j.LIZLLL;
    }
}
