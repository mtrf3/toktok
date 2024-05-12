package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;

/* renamed from: X.Iey, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47152Iey implements Comparable<C47152Iey> {
    public double LJLIL;
    public double LJLILLLLZI;
    public long LJLJI;
    public long LJLJJI;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SpeedRecord{mSpeed=");
        LIZ.append(this.LJLIL);
        LIZ.append(", mWeight=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", mCostTime=");
        LIZ.append(this.LJLJI);
        LIZ.append(", currentTime=");
        return C47135Ieh.LIZIZ(LIZ, this.LJLJJI, '}', LIZ);
    }

    @Override // java.lang.Comparable
    public final int compareTo(C47152Iey c47152Iey) {
        double d = this.LJLIL;
        double d2 = c47152Iey.LJLIL;
        if (d == d2) {
            return 0;
        }
        if (d < d2) {
            return -1;
        }
        return 1;
    }

    public C47152Iey(double d, double d2, long j, long j2) {
        this.LJLIL = d;
        this.LJLILLLLZI = d2;
        this.LJLJI = j;
        this.LJLJJI = j2;
        if (d >= LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX && d2 >= LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
        } else {
            throw new IllegalArgumentException(toString());
        }
    }
}
