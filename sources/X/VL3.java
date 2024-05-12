package X;

import java.util.Arrays;

/* loaded from: classes15.dex */
public final class VL3 {
    public final String LIZ;
    public final VL4 LIZIZ;
    public VL4 LIZJ;

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.LIZ);
        sb.append('{');
        VL4 vl4 = this.LIZIZ.LIZJ;
        String str = "";
        while (vl4 != null) {
            Object obj = vl4.LIZIZ;
            sb.append(str);
            String str2 = vl4.LIZ;
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
            vl4 = vl4.LIZJ;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }

    public VL3(String str) {
        VL4 vl4 = new VL4();
        this.LIZIZ = vl4;
        this.LIZJ = vl4;
        this.LIZ = str;
    }

    public final void LIZ(Object obj, String str) {
        VL4 vl4 = new VL4();
        this.LIZJ.LIZJ = vl4;
        this.LIZJ = vl4;
        vl4.LIZIZ = obj;
        vl4.LIZ = str;
    }
}
