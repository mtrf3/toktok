package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;

/* loaded from: classes11.dex */
public final class N3E extends N3C {
    @Override // X.N3C
    public final boolean LIZJ(N3H n3h) {
        int LIZ = LIZ();
        if (LIZ < 0) {
            return true;
        }
        if (LIZ <= 0 && n3h != null && !TextUtils.isEmpty(n3h.LIZIZ)) {
            try {
                if (CastLongProtector.parseLong(n3h.LIZIZ) % 10000 >= this.LIZ) {
                    return true;
                }
                return false;
            } catch (NumberFormatException unused) {
            }
        }
        return false;
    }

    public N3E(int i, java.util.Map map, java.util.Map map2, java.util.Set set) {
        super(i, map, map2, set);
    }
}
