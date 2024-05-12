package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import kotlin.jvm.internal.o;

/* renamed from: X.E8r, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35941E8r {
    public double LIZ;
    public double LIZIZ;
    public double LIZJ;
    public long LIZLLL;
    public java.util.Map<Integer, java.util.Map<Long, Long>> LJ;
    public long LJFF;
    public long LJI;
    public java.util.Map<Integer, Long> LJII;
    public java.util.Map<Integer, java.util.Map<Integer, Long>> LJIIIIZZ;

    public C35941E8r() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35941E8r)) {
            return false;
        }
        C35941E8r c35941E8r = (C35941E8r) obj;
        return o.LJ(Double.valueOf(this.LIZ), Double.valueOf(c35941E8r.LIZ)) && o.LJ(Double.valueOf(this.LIZIZ), Double.valueOf(c35941E8r.LIZIZ)) && o.LJ(Double.valueOf(this.LIZJ), Double.valueOf(c35941E8r.LIZJ)) && this.LIZLLL == c35941E8r.LIZLLL && o.LJ(this.LJ, c35941E8r.LJ) && this.LJFF == c35941E8r.LJFF && this.LJI == c35941E8r.LJI && o.LJ(this.LJII, c35941E8r.LJII) && o.LJ(this.LJIIIIZZ, c35941E8r.LJIIIIZZ);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int LIZJ = JBR.LIZJ(this.LIZLLL, C1JX.LIZIZ(this.LIZJ, C1JX.LIZIZ(this.LIZIZ, C16880lQ.LLJI(this.LIZ) * 31, 31), 31), 31);
        java.util.Map<Integer, java.util.Map<Long, Long>> map = this.LJ;
        int i = 0;
        if (map == null) {
            hashCode = 0;
        } else {
            hashCode = map.hashCode();
        }
        int LIZJ2 = JBR.LIZJ(this.LJI, JBR.LIZJ(this.LJFF, (LIZJ + hashCode) * 31, 31), 31);
        java.util.Map<Integer, Long> map2 = this.LJII;
        if (map2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = map2.hashCode();
        }
        int i2 = (LIZJ2 + hashCode2) * 31;
        java.util.Map<Integer, java.util.Map<Integer, Long>> map3 = this.LJIIIIZZ;
        if (map3 != null) {
            i = map3.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("(cpuUsage:");
        LIZ.append(this.LIZ);
        LIZ.append(", cpuSpeed:");
        LIZ.append(this.LIZIZ);
        LIZ.append(", normalizerCpuUsage:");
        LIZ.append(this.LIZJ);
        LIZ.append(", deviceCpuTime:");
        LIZ.append(this.LIZLLL);
        LIZ.append(", deviceFreqCpuMap:");
        Object obj = this.LJ;
        Object obj2 = "null";
        if (obj == null) {
            obj = "null";
        }
        LIZ.append(obj);
        LIZ.append(", processCpuTime:");
        LIZ.append(this.LJFF);
        LIZ.append(", processWallTime:");
        LIZ.append(this.LJI);
        LIZ.append(", threadCpuMap:");
        LIZ.append(this.LJII);
        LIZ.append(", threadPolicyCpuMap:");
        Object obj3 = this.LJIIIIZZ;
        if (obj3 != null) {
            obj2 = obj3;
        }
        return U26.LIZJ(LIZ, obj2, ')', LIZ);
    }

    public C35941E8r(Object obj) {
        this.LIZ = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        this.LIZIZ = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        this.LIZJ = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        this.LIZLLL = 0L;
        this.LJ = null;
        this.LJFF = 0L;
        this.LJI = 0L;
        this.LJII = null;
        this.LJIIIIZZ = null;
    }
}
