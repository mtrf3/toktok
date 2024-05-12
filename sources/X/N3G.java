package X;

import android.text.TextUtils;

/* loaded from: classes11.dex */
public final class N3G extends N3C {
    @Override // X.N3C
    public final boolean LIZJ(N3H n3h) {
        boolean LJIILIIL;
        int LIZ = LIZ();
        if (LIZ < 0) {
            return true;
        }
        if (LIZ <= 0 && n3h != null && !TextUtils.isEmpty(n3h.LIZ) && !TextUtils.isEmpty(n3h.LIZIZ)) {
            if (!TextUtils.isEmpty(n3h.LJ)) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(n3h.LIZ);
                LIZ2.append(":");
                LIZ2.append(n3h.LJ);
                LJIILIIL = C78598Ut0.LJIILIIL(this.LIZ, X1D.LIZIZ(LIZ2));
            } else if (!TextUtils.isEmpty(n3h.LIZLLL) && !TextUtils.isEmpty(n3h.LIZJ)) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append(n3h.LIZLLL);
                LIZ3.append("_");
                LIZ3.append(n3h.LIZJ);
                String LIZIZ = X1D.LIZIZ(LIZ3);
                StringBuilder LIZ4 = X1D.LIZ();
                LJIILIIL = C78598Ut0.LJIILIIL(this.LIZ, C025908h.LIZIZ(LIZ4, n3h.LIZ, ":", LIZIZ, LIZ4));
            }
            return !LJIILIIL;
        }
        return false;
    }

    public N3G(int i, java.util.Map map, java.util.Map map2, java.util.Set set) {
        super(i, map, map2, set);
    }
}
