package X;

import defpackage.b1;
import java.util.Map;

/* loaded from: classes7.dex */
public final class FMU {
    public final String LIZ;
    public final int LIZIZ;
    public final java.util.Map<String, Object> LIZJ;

    public final String toString() {
        java.util.Map<String, Object> map = this.LIZJ;
        String str = "";
        if (map != null) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                StringBuilder LIZJ = b1.LIZJ(str, "[key:");
                LIZJ.append((Object) entry.getKey());
                LIZJ.append(" value: ");
                LIZJ.append(entry.getValue());
                LIZJ.append("]");
                str = X1D.LIZIZ(LIZJ);
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("event: ");
        LIZ.append(this.LIZ);
        LIZ.append(" send channels: ");
        LIZ.append(this.LIZIZ);
        LIZ.append(" info: ");
        LIZ.append(str);
        return X1D.LIZIZ(LIZ);
    }

    public FMU(int i, String str, java.util.Map map) {
        this.LIZ = str;
        this.LIZJ = map;
        this.LIZIZ = i;
    }
}
