package X;

import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.PQd, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64423PQd {
    public Double LIZ;
    public List<C64421PQb> LIZIZ;
    public Long LIZJ;
    public Long LIZLLL;
    public final java.util.Map<String, String> LJ = new LinkedHashMap();

    public final synchronized C64424PQe LJFF() {
        Double d = this.LIZ;
        if (d == null) {
            return null;
        }
        double doubleValue = d.doubleValue();
        List<C64421PQb> list = this.LIZIZ;
        if (list == null) {
            return null;
        }
        Long l = this.LIZJ;
        if (l == null) {
            return null;
        }
        long longValue = l.longValue();
        Long l2 = this.LIZLLL;
        if (l2 == null) {
            return null;
        }
        long longValue2 = l2.longValue();
        long j = longValue2 - longValue;
        java.util.Map<String, String> map = this.LJ;
        if (!(!map.isEmpty())) {
            map = null;
        }
        return new C64424PQe(doubleValue, list, longValue, longValue2, j, map);
    }

    public final synchronized void LIZ(java.util.Map<String, String> extra) {
        o.LJIIIZ(extra, "extra");
        this.LJ.putAll(extra);
    }

    public final synchronized boolean LIZIZ(List<C64421PQb> droppedFrameList) {
        o.LJIIIZ(droppedFrameList, "droppedFrameList");
        if (this.LIZIZ == null) {
            this.LIZIZ = droppedFrameList;
            return true;
        }
        return false;
    }

    public final synchronized void LIZJ(long j) {
        this.LIZLLL = Long.valueOf(j);
    }

    public final synchronized boolean LIZLLL(double d) {
        if (this.LIZ == null) {
            this.LIZ = Double.valueOf(d);
            return true;
        }
        return false;
    }

    public final synchronized void LJ(long j) {
        this.LIZJ = Long.valueOf(j);
    }
}
