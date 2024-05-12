package X;

import java.util.HashMap;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes7.dex */
public final class EZO {
    public static final EZP LIZLLL = new EZP();
    public final HashMap<String, String> LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public final String LIZIZ() {
        String str;
        if (this.LIZ.isEmpty()) {
            return this.LIZIZ;
        }
        EZP ezp = LIZLLL;
        HashMap<String, String> hashMap = this.LIZ;
        String str2 = this.LIZJ;
        ezp.getClass();
        StringBuilder sb = new StringBuilder();
        java.util.Set<String> keySet = hashMap.keySet();
        String str3 = "";
        if (keySet != null && !keySet.isEmpty()) {
            for (String str4 : keySet) {
                String LIZ = EZP.LIZ(str4, str2);
                String str5 = hashMap.get(str4);
                if (str5 == null) {
                    str = "";
                } else {
                    LIZLLL.getClass();
                    str = EZP.LIZ(str5, str2);
                }
                if (sb.length() > 0) {
                    sb.append("&");
                }
                C1DI.LIZIZ(sb, LIZ, "=", str);
            }
            str3 = sb.toString();
            o.LJFF(str3, "result.toString()");
        }
        String str6 = this.LIZIZ;
        if (str6 == null || str6.length() == 0) {
            return str3;
        }
        if (s.LJJLIIIJJIZ(this.LIZIZ, '?', 0, false, 6) >= 0) {
            StringBuilder LIZ2 = X1D.LIZ();
            return C0MT.LIZ(LIZ2, this.LIZIZ, '&', str3, LIZ2);
        }
        StringBuilder LIZ3 = X1D.LIZ();
        return C0MT.LIZ(LIZ3, this.LIZIZ, '?', str3, LIZ3);
    }

    public final String toString() {
        return LIZIZ();
    }

    public EZO(String url) {
        o.LJIIJ(url, "url");
        this.LIZ = new HashMap<>();
        this.LIZJ = "UTF-8";
        this.LIZIZ = url;
    }

    public final void LIZ(String name, String value) {
        o.LJIIJ(name, "name");
        o.LJIIJ(value, "value");
        this.LIZ.put(name, value);
    }
}
