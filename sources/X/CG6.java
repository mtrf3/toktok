package X;

import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.AqS171S0100000_5;

/* loaded from: classes6.dex */
public final class CG6 implements CGL {
    public final java.util.Set<InterfaceC88472Yns<Long, C76800UCe>> LIZ = new LinkedHashSet();

    @Override // X.CGL
    public final synchronized void LJFF() {
        long longValue;
        if (this.LIZ.isEmpty()) {
            return;
        }
        Long l = C31023CFn.LIZIZ.get("mem_java_used");
        if (l == null) {
            longValue = -1;
        } else {
            longValue = l.longValue();
        }
        Iterator<InterfaceC88472Yns<Long, C76800UCe>> it = this.LIZ.iterator();
        while (it.hasNext()) {
            it.next().invoke(Long.valueOf(longValue));
        }
    }

    @Override // X.CGL
    public final synchronized void destroy() {
        this.LIZ.clear();
    }

    @Override // X.CGL
    public final void start() {
    }

    @Override // X.CGL
    public final void stop() {
    }

    public static final float LIZ() {
        long longValue;
        long longValue2;
        Long l = C31023CFn.LIZIZ.get("mem_app_allocate");
        if (l == null) {
            longValue = -999;
        } else {
            longValue = l.longValue();
        }
        Long l2 = C31023CFn.LIZIZ.get("mem_pss_total");
        if (l2 == null) {
            longValue2 = -999;
        } else {
            longValue2 = l2.longValue();
        }
        if (longValue != -999 && longValue2 != -999) {
            return (float) (longValue2 / longValue);
        }
        return -999.0f;
    }

    public static final long LIZIZ() {
        Long l = C31023CFn.LIZIZ.get("mem_java_total");
        if (l == null) {
            return -1L;
        }
        return l.longValue();
    }

    public final void LIZJ(AqS171S0100000_5 aqS171S0100000_5) {
        this.LIZ.add(aqS171S0100000_5);
    }
}
