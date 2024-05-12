package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import java.util.Locale;

/* renamed from: X.YRx, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87401YRx {
    public double LIZ;
    public double LIZIZ;
    public double LIZJ;

    public final double LIZJ() {
        double d = this.LIZ;
        double d2 = this.LIZIZ;
        double d3 = (d2 * d2) + (d * d);
        double d4 = this.LIZJ;
        return Math.sqrt((d4 * d4) + d3);
    }

    public final boolean LIZLLL() {
        double LIZJ = LIZJ();
        if (LIZJ != LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
            LJ(1.0d / LIZJ);
            return true;
        }
        return false;
    }

    public final String toString() {
        return C16880lQ.LLLZI(Locale.getDefault(), "%+5f %+05f %+05f", new Object[]{Double.valueOf(this.LIZ), Double.valueOf(this.LIZIZ), Double.valueOf(this.LIZJ)});
    }

    public C87401YRx() {
    }

    public C87401YRx(C87401YRx c87401YRx) {
        this.LIZ = c87401YRx.LIZ;
        this.LIZIZ = c87401YRx.LIZIZ;
        this.LIZJ = c87401YRx.LIZJ;
    }

    public final void LJ(double d) {
        this.LIZ *= d;
        this.LIZIZ *= d;
        this.LIZJ *= d;
    }

    public static C87401YRx LIZ(C87401YRx c87401YRx, C87401YRx c87401YRx2) {
        double d = c87401YRx.LIZIZ;
        double d2 = c87401YRx2.LIZJ;
        double d3 = c87401YRx.LIZJ;
        double d4 = c87401YRx2.LIZIZ;
        double d5 = (d * d2) - (d3 * d4);
        double d6 = c87401YRx2.LIZ;
        double d7 = c87401YRx.LIZ;
        return new C87401YRx(d5, (d3 * d6) - (d2 * d7), (d7 * d4) - (d * d6));
    }

    public static double LIZIZ(C87401YRx c87401YRx, C87401YRx c87401YRx2) {
        return (c87401YRx.LIZJ * c87401YRx2.LIZJ) + (c87401YRx.LIZIZ * c87401YRx2.LIZIZ) + (c87401YRx.LIZ * c87401YRx2.LIZ);
    }

    public C87401YRx(double d, double d2, double d3) {
        LJFF(d, d2, d3);
    }

    public static void LJI(C87401YRx c87401YRx, C87401YRx c87401YRx2, C87401YRx c87401YRx3) {
        c87401YRx3.LJFF(c87401YRx.LIZ - c87401YRx2.LIZ, c87401YRx.LIZIZ - c87401YRx2.LIZIZ, c87401YRx.LIZJ - c87401YRx2.LIZJ);
    }

    public final void LJFF(double d, double d2, double d3) {
        this.LIZ = d;
        this.LIZIZ = d2;
        this.LIZJ = d3;
    }
}
