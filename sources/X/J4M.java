package X;

import java.util.HashMap;

/* loaded from: classes9.dex */
public final class J4M implements J4H {
    public final /* synthetic */ J43 LIZ;
    public final /* synthetic */ J4Z LIZIZ;

    public J4M(J43 j43, long j, J4S j4s) {
        this.LIZ = j43;
        this.LIZIZ = j4s;
    }

    @Override // X.J4H
    public final void LIZ(boolean z, int i, String str, java.util.Map map) {
        if (this.LIZ.LIZIZ) {
            System.currentTimeMillis();
        }
        HashMap hashMap = new HashMap();
        if (z && str != null && map != null) {
            hashMap.putAll(map);
        }
        J4J j4j = J4V.LIZ;
        if (j4j.LIZIZ) {
            j4j.LJIIIZ.LIZIZ = System.currentTimeMillis();
            j4j.LJIIJJI = i;
        }
        J4Z j4z = this.LIZIZ;
        if (j4z != null) {
            boolean z2 = true;
            boolean z3 = !hashMap.isEmpty();
            J4S j4s = (J4S) j4z;
            J4W j4w = j4s.LIZ;
            long j = j4s.LIZIZ;
            j4w.getClass();
            if (!z3 || hashMap.isEmpty()) {
                z2 = false;
            }
            if (J6U.LIZ) {
                long currentTimeMillis = System.currentTimeMillis() - j;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("HARService predictRun end2 runSuccess:");
                LIZ.append(z2);
                LIZ.append(" cost:");
                LIZ.append(currentTimeMillis);
                LIZ.append(" success:");
                LIZ.append(z3);
                LIZ.append(" errCode:");
                LIZ.append(i);
                LIZ.append(" outputs:");
                LIZ.append(hashMap);
                X1D.LIZIZ(LIZ);
            }
            if (z2) {
                j4w.LIZ.LJII(hashMap, 0, z2);
            } else {
                j4w.LIZ.LJII(null, -3, false);
            }
        }
    }
}
