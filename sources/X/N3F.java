package X;

import android.text.TextUtils;

/* loaded from: classes11.dex */
public final class N3F extends N3C {
    @Override // X.N3C
    public final boolean LIZJ(N3H n3h) {
        int LIZ = LIZ();
        if (LIZ < 0) {
            return true;
        }
        if (LIZ > 0 || n3h == null || TextUtils.isEmpty(n3h.LIZ) || TextUtils.isEmpty(n3h.LIZIZ)) {
            return false;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(n3h.LIZ);
        LIZ2.append(":");
        LIZ2.append(n3h.LIZIZ);
        return !C78598Ut0.LJIILIIL(this.LIZ, X1D.LIZIZ(LIZ2));
    }

    public N3F(int i, java.util.Map map, java.util.Map map2, java.util.Set set) {
        super(i, map, map2, set);
    }
}
