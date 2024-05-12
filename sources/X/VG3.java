package X;

import java.util.LinkedList;

/* loaded from: classes15.dex */
public final class VG3 {
    public final LinkedList<VGB> LIZ = new LinkedList<>();

    public final String toString() {
        String str = "";
        for (int i = 0; i < this.LIZ.size(); i++) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(str);
            LIZ.append("pts[");
            LIZ.append(i);
            LIZ.append("]:");
            str = C0H1.LIZJ(LIZ, this.LIZ.get(i).pts, ";", LIZ);
        }
        return str;
    }

    public final VGB LIZ(long j) {
        VGB vgb = null;
        while (!this.LIZ.isEmpty()) {
            long j2 = this.LIZ.element().updateClockTime;
            if (j <= j2) {
                if (vgb == null) {
                    return this.LIZ.poll();
                }
                long j3 = vgb.updateClockTime;
                if (j > j3) {
                    if (j - j3 < j2 - j) {
                        return vgb;
                    }
                    return this.LIZ.poll();
                }
            }
            vgb = this.LIZ.poll();
            if (this.LIZ.isEmpty()) {
                return vgb;
            }
        }
        return null;
    }
}
