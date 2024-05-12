package X;

import android.hardware.SensorEvent;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;

/* renamed from: X.YRv, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87399YRv {
    public YS0 LIZIZ;
    public C87402YRy LIZJ;
    public C87401YRx LIZLLL;
    public C87401YRx LJ;
    public OFW LJFF;
    public boolean LJI;
    public C87400YRw LJII;
    public C87400YRw LJIIIIZZ;
    public boolean LJIIIZ;
    public C87400YRw LJIIJJI;
    public C87401YRx LJIIL;
    public int LJIILIIL;
    public double LJIILLIIL;
    public double LJIIZILJ;
    public C87401YRx LJIJ;
    public OFW LJIJI;
    public OFW LJIJJ;
    public OFW LJIJJLI;
    public OFW LJIL;
    public OFW LJJ;
    public int LJJI;
    public final int LJJIFFI;
    public long LIZ = -1;
    public double LJIIJ = 1.0d;
    public long LJIILJJIL = -1;
    public final C87401YRx LJIILL = new C87401YRx();
    public boolean LJJII = false;
    public C87401YRx LJJIII = null;

    public final void LIZIZ() {
        C87400YRw LIZIZ;
        for (int i = 0; i < 3; i++) {
            C87401YRx c87401YRx = new C87401YRx(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX);
            if (i == 0) {
                c87401YRx.LIZ = 1.0E-7d;
            } else if (i == 1) {
                c87401YRx.LIZIZ = 1.0E-7d;
            } else {
                c87401YRx.LIZJ = 1.0E-7d;
            }
            double LIZJ = c87401YRx.LIZJ();
            if (LIZJ < 1.0E-15d) {
                LIZIZ = new C87400YRw();
            } else {
                c87401YRx.LIZLLL();
                LIZIZ = C87400YRw.LIZIZ(c87401YRx, LIZJ);
            }
            C87401YRx.LJI(this.LJIJ, LIZ(LIZIZ.LJ(this.LJII)), c87401YRx);
            double d = c87401YRx.LIZ / 1.0E-7d;
            c87401YRx.LIZ = d;
            double d2 = c87401YRx.LIZIZ / 1.0E-7d;
            c87401YRx.LIZIZ = d2;
            double d3 = c87401YRx.LIZJ / 1.0E-7d;
            Object obj = this.LJIJJLI.LIZ;
            ((double[]) obj)[i] = d;
            ((double[]) obj)[3 + i] = d2;
            ((double[]) obj)[6 + i] = d3;
        }
    }

    public final void LIZLLL() {
        this.LIZIZ = new YS0();
        this.LIZJ = new C87402YRy();
        this.LJII = new C87400YRw();
        OFW ofw = new OFW();
        this.LJIJI = ofw;
        ofw.LJIIL();
        this.LJIJI.LJIIJ(25.0d);
        this.LIZLLL = new C87401YRx();
        this.LJ = new C87401YRx();
        OFW ofw2 = new OFW();
        this.LJFF = ofw2;
        ofw2.LJIIL();
        this.LJI = false;
        this.LJIJJ = new OFW();
        this.LJIJJLI = new OFW();
        this.LJJ = new OFW();
        this.LJIL = new OFW();
        this.LJJI = 0;
        this.LJIIJJI = null;
        C48284IxE.LIZ(2, this.LJJIFFI, "TR_SensorFusionEkf", "ekf reset");
    }

    public C87399YRv(int i) {
        this.LJJIFFI = -1;
        this.LJJIFFI = i;
        LIZLLL();
        C48284IxE.LIZ(2, i, "TR_SensorFusionEkf", "new SensorFusionEkf");
    }

    public final C87401YRx LIZ(C87400YRw c87400YRw) {
        C87400YRw LIZLLL = C87400YRw.LIZLLL(C87400YRw.LIZ(this.LJIIL, c87400YRw), this.LJIILL);
        C87401YRx c87401YRx = new C87401YRx(LIZLLL.LIZ, LIZLLL.LIZIZ, LIZLLL.LIZJ);
        if (!c87401YRx.LIZLLL()) {
            c87401YRx.LJFF(1.0d, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX);
        }
        double LIZJ = new C87401YRx(LIZLLL.LIZ, LIZLLL.LIZIZ, LIZLLL.LIZJ).LIZJ();
        double d = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        if (LIZJ != LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
            d = Math.acos(LIZLLL.LIZLLL) * 2.0d;
        }
        c87401YRx.LJ(d);
        return c87401YRx;
    }

    public final synchronized void LIZJ(SensorEvent sensorEvent) {
        C87400YRw LIZIZ;
        long j = this.LIZ;
        if (j > sensorEvent.timestamp) {
            C48284IxE.LIZ(6, this.LJJIFFI, "TR_SensorFusionEkf", "lastTime > curTime, return");
            return;
        }
        if (j > 0) {
            double d = (r5 - j) * 9.999999717180685E-10d;
            if (this.LIZIZ == null) {
                this.LIZIZ = new YS0();
            }
            if (d <= 0.03999999910593033d) {
                YS0 ys0 = this.LIZIZ;
                if (!ys0.LIZ) {
                    ys0.LIZIZ = d;
                    ys0.LIZ = true;
                    ys0.LIZJ = 1;
                } else {
                    ys0.LIZIZ = (0.050000011920928955d * d) + (ys0.LIZIZ * 0.949999988079071d);
                    int i = ys0.LIZJ + 1;
                    ys0.LIZJ = i;
                    if (i > 10) {
                        ys0.LIZLLL = true;
                    }
                }
            } else {
                YS0 ys02 = this.LIZIZ;
                d = ys02.LIZLLL ? ys02.LIZIZ : 0.009999999776482582d;
            }
            C87401YRx c87401YRx = this.LIZLLL;
            float[] fArr = sensorEvent.values;
            int i2 = 0;
            c87401YRx.LJFF(fArr[0], fArr[1], fArr[2]);
            this.LIZJ.LIZ(this.LIZLLL, sensorEvent.timestamp);
            C87402YRy c87402YRy = this.LIZJ;
            C87401YRx c87401YRx2 = this.LJ;
            C87403YRz c87403YRz = c87402YRy.LIZJ;
            if (c87403YRz.LIZLLL < 30) {
                c87401YRx2.LIZJ = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
                c87401YRx2.LIZIZ = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
                c87401YRx2.LIZ = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
            } else {
                C87401YRx c87401YRx3 = c87403YRz.LIZIZ;
                c87401YRx2.getClass();
                c87401YRx2.LIZ = c87401YRx3.LIZ;
                c87401YRx2.LIZIZ = c87401YRx3.LIZIZ;
                c87401YRx2.LIZJ = c87401YRx3.LIZJ;
                c87401YRx2.LJ(Math.min(1.0d, (c87402YRy.LIZJ.LIZLLL - 30) / 100.0d));
            }
            if (this.LJI) {
                C87401YRx c87401YRx4 = this.LIZLLL;
                C87401YRx c87401YRx5 = this.LJ;
                c87401YRx4.getClass();
                C87401YRx c87401YRx6 = new C87401YRx(c87401YRx4.LIZ - c87401YRx5.LIZ, c87401YRx4.LIZIZ - c87401YRx5.LIZIZ, c87401YRx4.LIZJ - c87401YRx5.LIZJ);
                double LIZJ = c87401YRx6.LIZJ();
                if (LIZJ < 1.0E-15d) {
                    LIZIZ = new C87400YRw();
                } else {
                    c87401YRx6.LIZ /= LIZJ;
                    c87401YRx6.LIZIZ /= LIZJ;
                    c87401YRx6.LIZJ /= LIZJ;
                    LIZIZ = C87400YRw.LIZIZ(c87401YRx6, (-d) * LIZJ);
                }
                this.LJII = LIZIZ.LJ(this.LJII);
                OFW LJIIIZ = OFW.LJIIIZ(LIZIZ);
                OFW LJFF = OFW.LJFF(OFW.LJFF(LJIIIZ, this.LJIJI), LJIIIZ.LJIILJJIL());
                this.LJIJI = LJFF;
                OFW ofw = this.LJFF;
                double d2 = d * d;
                ofw.getClass();
                OFW ofw2 = new OFW();
                do {
                    ((double[]) ofw2.LIZ)[i2] = ((double[]) ofw.LIZ)[i2] * d2;
                    i2++;
                } while (i2 < 9);
                LJFF.LJIIIIZZ(ofw2);
            }
        }
        this.LIZ = sensorEvent.timestamp;
    }
}
