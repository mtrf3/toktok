package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;

/* renamed from: X.YRy, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87402YRy {
    public C87401YRx LIZLLL = new C87401YRx();
    public C87401YRx LJ = new C87401YRx();
    public C87403YRz LIZ = new C87403YRz(1.0d);
    public C87403YRz LIZIZ = new C87403YRz(10.0d);
    public C87403YRz LIZJ = new C87403YRz(0.15000000596046448d);
    public YS1 LJFF = new YS1();
    public YS1 LJI = new YS1();

    public final void LIZ(C87401YRx c87401YRx, long j) {
        this.LIZIZ.LIZ(c87401YRx, j, 1.0d);
        C87401YRx.LJI(c87401YRx, this.LIZIZ.LIZIZ, this.LIZLLL);
        YS1 ys1 = this.LJI;
        if (this.LIZLLL.LIZJ() < 0.00800000037997961d) {
            ys1.LIZ++;
        } else {
            ys1.LIZ = 0;
        }
        if (this.LJI.LIZ >= 10 && this.LJFF.LIZ >= 10) {
            double LIZJ = c87401YRx.LIZJ();
            if (LIZJ < 0.30000001192092896d) {
                double max = Math.max(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, 1.0d - (LIZJ / 0.30000001192092896d));
                this.LIZJ.LIZ(this.LIZIZ.LIZIZ, j, max * max);
            }
        }
    }
}
