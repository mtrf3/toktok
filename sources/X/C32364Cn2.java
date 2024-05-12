package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Cn2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32364Cn2 {
    public final List<J71> LIZ;
    public String LIZIZ;
    public final String LIZJ;

    public final String LIZLLL() {
        String str;
        if (((ArrayList) this.LIZ).isEmpty()) {
            return this.LIZIZ;
        }
        List<J71> list = this.LIZ;
        String str2 = this.LIZJ;
        StringBuilder sb = new StringBuilder();
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            InterfaceC32365Cn3 interfaceC32365Cn3 = (InterfaceC32365Cn3) it.next();
            String LJIIJJI = C77412UZs.LJIIJJI(interfaceC32365Cn3.getName(), str2);
            String value = interfaceC32365Cn3.getValue();
            if (value != null) {
                str = C77412UZs.LJIIJJI(value, str2);
            } else {
                str = "";
            }
            if (sb.length() > 0) {
                sb.append("&");
            }
            C1DI.LIZIZ(sb, LJIIJJI, "=", str);
        }
        String sb2 = sb.toString();
        String str3 = this.LIZIZ;
        if (str3 == null || str3.length() == 0) {
            return sb2;
        }
        int indexOf = this.LIZIZ.indexOf(63);
        if (indexOf >= 0) {
            if (this.LIZIZ.indexOf(61, indexOf) > 0) {
                int i = indexOf + 1;
                return C0ON.LIZJ(this.LIZIZ.substring(0, i), sb2, "&", this.LIZIZ.substring(i));
            }
            StringBuilder LIZ = X1D.LIZ();
            return C025908h.LIZIZ(LIZ, this.LIZIZ, "&", sb2, LIZ);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        return C025908h.LIZIZ(LIZ2, this.LIZIZ, "?", sb2, LIZ2);
    }

    public C32364Cn2() {
        this.LIZ = new ArrayList();
        this.LIZJ = "UTF-8";
        this.LIZIZ = null;
    }

    public final String toString() {
        return LIZLLL();
    }

    public C32364Cn2(String str) {
        this.LIZ = new ArrayList();
        this.LIZJ = "UTF-8";
        this.LIZIZ = str;
    }

    public final void LIZ(int i, String str) {
        ((ArrayList) this.LIZ).add(new J71(str, String.valueOf(i)));
    }

    public final void LIZIZ(long j, String str) {
        ((ArrayList) this.LIZ).add(new J71(str, String.valueOf(j)));
    }

    public final void LIZJ(String str, String str2) {
        ((ArrayList) this.LIZ).add(new J71(str, str2));
    }
}
