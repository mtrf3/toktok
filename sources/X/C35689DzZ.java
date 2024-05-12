package X;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.DzZ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35689DzZ {
    public final java.util.Map<String, Object> LIZ;

    public C35689DzZ(java.util.Map<String, Object> singleAct) {
        o.LJIIIZ(singleAct, "singleAct");
        this.LIZ = singleAct;
    }

    public final void LIZ(String actType, Object value, String key) {
        EnumC35691Dzb enumC35691Dzb;
        o.LJIIIZ(actType, "actType");
        o.LJIIIZ(key, "key");
        o.LJIIIZ(value, "value");
        if (this.LIZ.get(key) == null) {
            this.LIZ.put(key, value);
            return;
        }
        java.util.Map map = (java.util.Map) ((LinkedHashMap) C36033ECf.LIZIZ).get(actType);
        if (map == null || (enumC35691Dzb = (EnumC35691Dzb) map.get(key)) == null) {
            return;
        }
        int i = C35690Dza.LIZ[enumC35691Dzb.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                Object obj = this.LIZ.get(key);
                if ((value instanceof Integer) && (obj instanceof Integer)) {
                    this.LIZ.put(key, Integer.valueOf(((Number) value).intValue() + ((Number) obj).intValue()));
                    return;
                } else {
                    if (!(value instanceof Long) || !(obj instanceof Long)) {
                        return;
                    }
                    this.LIZ.put(key, Long.valueOf(((Number) value).longValue() + ((Number) obj).longValue()));
                    return;
                }
            }
            if (!o.LJ(value, Boolean.TRUE)) {
                return;
            }
            this.LIZ.put(key, value);
            return;
        }
        this.LIZ.put(key, value);
    }
}
