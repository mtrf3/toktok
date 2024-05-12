package X;

import java.util.Arrays;

/* renamed from: X.PrI, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65752PrI {
    public final String LIZ;
    public final C65754PrK LIZIZ;
    public C65754PrK LIZJ;

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.LIZ);
        sb.append('{');
        C65754PrK c65754PrK = this.LIZIZ.LIZJ;
        String str = "";
        while (c65754PrK != null) {
            Object obj = c65754PrK.LIZIZ;
            sb.append(str);
            String str2 = c65754PrK.LIZ;
            if (str2 != null) {
                sb.append(str2);
                sb.append('=');
            }
            if (obj != null && obj.getClass().isArray()) {
                String deepToString = Arrays.deepToString(new Object[]{obj});
                sb.append((CharSequence) deepToString, 1, deepToString.length() - 1);
            } else {
                sb.append(obj);
            }
            c65754PrK = c65754PrK.LIZJ;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }

    public C65752PrI(String str) {
        C65754PrK c65754PrK = new C65754PrK();
        this.LIZIZ = c65754PrK;
        this.LIZJ = c65754PrK;
        this.LIZ = str;
    }

    public final void LIZ(long j, String str) {
        LIZIZ(String.valueOf(j), str);
    }

    public final void LIZIZ(Object obj, String str) {
        C65754PrK c65754PrK = new C65754PrK();
        this.LIZJ.LIZJ = c65754PrK;
        this.LIZJ = c65754PrK;
        c65754PrK.LIZIZ = obj;
        c65754PrK.LIZ = str;
    }
}
