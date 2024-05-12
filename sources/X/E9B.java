package X;

import com.bytedance.hybrid.spark.SparkContext;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class E9B implements InterfaceC73352uJ {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(E2V.LJLIL);

    @Override // X.InterfaceC73352uJ
    public final boolean LIZ(String str) {
        if (((java.util.Map) this.LIZ.getValue()).keySet().contains("*")) {
            return true;
        }
        return ((java.util.Map) this.LIZ.getValue()).keySet().contains(str);
    }

    @Override // X.InterfaceC73352uJ
    public final void LIZIZ(SparkContext sparkContext, String url, String str) {
        Object LIZ;
        Double d;
        Boolean bool;
        String str2;
        o.LJIIIZ(sparkContext, "sparkContext");
        o.LJIIIZ(url, "url");
        try {
            sparkContext.LJJIIZ(C27739Aud.LJI(E9D.LIZ()), "ec_page_source_config");
            java.util.Map map = (java.util.Map) ((java.util.Map) this.LIZ.getValue()).get("*");
            if (map != null) {
                sparkContext.LJJIJ(map);
            }
            java.util.Map map2 = (java.util.Map) ((java.util.Map) this.LIZ.getValue()).get(str);
            LIZ = null;
            if (map2 != null) {
                for (Map.Entry entry : map2.entrySet()) {
                    sparkContext.LJJIIZ(entry.getValue(), (String) entry.getKey());
                    E9C e9c = E9C.LIZ;
                    String param = (String) entry.getKey();
                    e9c.getClass();
                    o.LJIIIZ(param, "param");
                    java.util.Set<String> set = E9C.LIZIZ;
                    if (set.isEmpty() || set.contains(param)) {
                        Object value = entry.getValue();
                        if (value instanceof Number) {
                            Object value2 = entry.getValue();
                            if ((value2 instanceof Double) && (d = (Double) value2) != null) {
                                double doubleValue = d.doubleValue();
                                int i = (int) doubleValue;
                                if (Double.compare(doubleValue, i) == 0) {
                                    sparkContext.LJJIFFI(i, (String) entry.getKey());
                                } else {
                                    sparkContext.LJJII((String) entry.getKey(), doubleValue);
                                }
                            }
                        } else if (value instanceof Boolean) {
                            Object value3 = entry.getValue();
                            if ((value3 instanceof Boolean) && (bool = (Boolean) value3) != null) {
                                sparkContext.LJJIIJZLJL((String) entry.getKey(), bool.booleanValue());
                            }
                        } else if (value instanceof String) {
                            Object value4 = entry.getValue();
                            if ((value4 instanceof String) && (str2 = (String) value4) != null) {
                                sparkContext.LJJIIJ((String) entry.getKey(), str2);
                            }
                        }
                    }
                }
                LIZ = C76800UCe.LIZ;
            }
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
        if (m10exceptionOrNullimpl != null) {
            C78983UzD.LJIIZILJ(m10exceptionOrNullimpl);
        }
    }
}
