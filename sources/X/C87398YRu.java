package X;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.Display;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.bpea.basics.Cert;
import java.io.Serializable;

/* renamed from: X.YRu, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87398YRu extends GestureDetector.SimpleOnGestureListener implements InterfaceC79442VFu, SensorEventListener {
    public final C87399YRv LJLIL;
    public final C39212FaC LJLILLLLZI;
    public final Display LJLJI;
    public volatile boolean LJLJJI;
    public final int LJLJJLL;
    public final boolean LJLJLJ;
    public final int LJLJLLL;
    public final int LJLJJL = 1;
    public C87400YRw LJLJL = new C87400YRw();

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // X.InterfaceC79442VFu
    public final void reset() {
        this.LJLJL = new C87400YRw();
    }

    @Override // X.InterfaceC79442VFu
    public final void start() {
        if (!this.LJLJJI) {
            C48284IxE.LIZ(2, this.LJLJLLL, "TR_SensorDirector", "start");
            C39212FaC c39212FaC = this.LJLILLLLZI;
            synchronized (c39212FaC.LJFF) {
                c39212FaC.LJFF.add(this);
            }
            C39212FaC c39212FaC2 = this.LJLILLLLZI;
            if (!c39212FaC2.LIZ) {
                c39212FaC2.LIZLLL = new C39213FaD(c39212FaC2);
                HandlerThreadC39211FaB handlerThreadC39211FaB = new HandlerThreadC39211FaB(c39212FaC2);
                handlerThreadC39211FaB.start();
                c39212FaC2.LIZJ = handlerThreadC39211FaB.getLooper();
                c39212FaC2.LIZ = true;
            }
            C87399YRv c87399YRv = this.LJLIL;
            if (c87399YRv != null) {
                if (!c87399YRv.LJI) {
                    c87399YRv.LIZLLL();
                } else {
                    c87399YRv.LIZLLL();
                    if (!this.LJLJLJ || this.LJLJJLL != 1) {
                        C87399YRv c87399YRv2 = this.LJLIL;
                        c87399YRv2.LJIILIIL = 2;
                        c87399YRv2.LJIIIIZZ = this.LJLJL;
                        c87399YRv2.LJIIJJI = null;
                    }
                }
                int rotation = this.LJLJI.getRotation();
                C87399YRv c87399YRv3 = this.LJLIL;
                if (rotation != c87399YRv3.LJJI) {
                    c87399YRv3.LIZLLL();
                    C87399YRv c87399YRv4 = this.LJLIL;
                    int i = c87399YRv4.LJJIFFI;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("display rotation:");
                    LIZ.append(rotation);
                    C48284IxE.LIZ(2, i, "TR_SensorFusionEkf", X1D.LIZIZ(LIZ));
                    c87399YRv4.LJJI = rotation;
                    this.LJLIL.LJIILIIL = this.LJLJJLL;
                }
            }
            this.LJLJJI = true;
        }
    }

    @Override // X.InterfaceC79442VFu
    public final void stop() {
        if (this.LJLJJI) {
            C48284IxE.LIZ(2, this.LJLJLLL, "TR_SensorDirector", "stop");
            C39212FaC c39212FaC = this.LJLILLLLZI;
            synchronized (c39212FaC.LJFF) {
                c39212FaC.LJFF.remove(this);
            }
            C39212FaC c39212FaC2 = this.LJLILLLLZI;
            if (c39212FaC2.LIZ) {
                try {
                    SensorManager sensorManager = c39212FaC2.LIZIZ;
                    C39213FaD c39213FaD = c39212FaC2.LIZLLL;
                    Cert cert = c39212FaC2.LJ;
                    C39188FZo.LIZ.getClass();
                    C39187FZn.LIZLLL(sensorManager, c39213FaD, cert);
                } catch (Q0C | Error unused) {
                }
                c39212FaC2.LIZLLL = null;
                c39212FaC2.LIZJ.quit();
                c39212FaC2.LIZJ = null;
                c39212FaC2.LIZ = false;
            }
            this.LJLJJI = false;
        }
    }

    @Override // X.InterfaceC79442VFu
    public final void LIZ(Bundle bundle) {
        boolean z;
        if (bundle != null) {
            C87399YRv c87399YRv = this.LJLIL;
            if (c87399YRv != null) {
                if (bundle.getInt("disable_axis") == 3) {
                    z = true;
                } else {
                    z = false;
                }
                c87399YRv.LJJII = z;
            }
            if (this.LJLILLLLZI != null && bundle.containsKey("cert")) {
                C39212FaC c39212FaC = this.LJLILLLLZI;
                Serializable serializable = bundle.getSerializable("cert");
                c39212FaC.getClass();
                c39212FaC.LJ = (Cert) serializable;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0143  */
    @Override // X.InterfaceC79442VFu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(float[] r32) {
        /*
            Method dump skipped, instructions count: 614
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C87398YRu.LIZIZ(float[]):void");
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        C87400YRw LIZIZ;
        if (sensorEvent.sensor.getType() == 1) {
            C87399YRv c87399YRv = this.LJLIL;
            synchronized (c87399YRv) {
                if (c87399YRv.LJIILJJIL <= sensorEvent.timestamp) {
                    C87401YRx c87401YRx = c87399YRv.LJIILL;
                    float[] fArr = sensorEvent.values;
                    c87401YRx.LJFF(fArr[0], fArr[1], fArr[2]);
                    long j = sensorEvent.timestamp;
                    c87399YRv.LJIILJJIL = j;
                    C87402YRy c87402YRy = c87399YRv.LIZJ;
                    C87401YRx c87401YRx2 = c87399YRv.LJIILL;
                    c87402YRy.LIZ.LIZ(c87401YRx2, j, 1.0d);
                    C87401YRx.LJI(c87401YRx2, c87402YRy.LIZ.LIZIZ, c87402YRy.LJ);
                    YS1 ys1 = c87402YRy.LJFF;
                    if (c87402YRy.LJ.LIZJ() < 0.5d) {
                        ys1.LIZ++;
                    } else {
                        ys1.LIZ = 0;
                    }
                    if (!c87399YRv.LJI) {
                        c87399YRv.LJI = true;
                        if (c87399YRv.LJIILIIL == 2) {
                            c87399YRv.LJIIL = new C87401YRx(c87399YRv.LJIILL);
                        } else {
                            int i = c87399YRv.LJJI;
                            if (i != 0) {
                                if (i != 1) {
                                    if (i != 2) {
                                        if (i == 3) {
                                            c87399YRv.LJIIL = new C87401YRx(-1.0d, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX);
                                        }
                                    } else {
                                        c87399YRv.LJIIL = new C87401YRx(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, -1.0d, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX);
                                    }
                                } else {
                                    c87399YRv.LJIIL = new C87401YRx(1.0d, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX);
                                }
                            } else {
                                c87399YRv.LJIIL = new C87401YRx(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, 1.0d, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX);
                            }
                        }
                        c87399YRv.LJII = C87400YRw.LIZLLL(c87399YRv.LJIIL, c87399YRv.LJIILL);
                        int i2 = c87399YRv.LJJIFFI;
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("rotation start:");
                        LIZ.append(c87399YRv.LJII);
                        LIZ.append(";acc:");
                        LIZ.append(c87399YRv.LJIILL.toString());
                        C48284IxE.LIZ(2, i2, "TR_SensorFusionEkf", X1D.LIZIZ(LIZ));
                        c87399YRv.LJIILLIIL = c87399YRv.LJIILL.LIZJ();
                        return;
                    }
                    double LIZJ = c87399YRv.LJIILL.LIZJ();
                    double abs = Math.abs(LIZJ - c87399YRv.LJIILLIIL);
                    c87399YRv.LJIILLIIL = LIZJ;
                    double d = (c87399YRv.LJIIZILJ + abs) / 2.0d;
                    c87399YRv.LJIIZILJ = d;
                    double min = Math.min(7.0d, ((d / 0.15d) * 6.25d) + 0.75d);
                    c87399YRv.LJIJJ.LJIIL();
                    c87399YRv.LJIJJ.LJIIJ(min * min);
                    c87399YRv.LJIJ = c87399YRv.LIZ(c87399YRv.LJII);
                    c87399YRv.LIZIZ();
                    OFW LJIILJJIL = c87399YRv.LJIJJLI.LJIILJJIL();
                    OFW.LJI(c87399YRv.LJIJJLI, c87399YRv.LJIJI, c87399YRv.LJIL);
                    OFW ofw = c87399YRv.LJIL;
                    OFW.LJI(ofw, LJIILJJIL, ofw);
                    OFW ofw2 = c87399YRv.LJIL;
                    OFW.LIZIZ(ofw2, c87399YRv.LJIJJ, ofw2);
                    OFW ofw3 = new OFW();
                    c87399YRv.LJIL.LIZLLL(ofw3);
                    OFW.LJI(c87399YRv.LJIJI, LJIILJJIL, c87399YRv.LJJ);
                    OFW ofw4 = c87399YRv.LJJ;
                    OFW.LJI(ofw4, ofw3, ofw4);
                    C87401YRx c87401YRx3 = new C87401YRx();
                    OFW.LJII(c87399YRv.LJJ, c87399YRv.LJIJ, c87401YRx3);
                    OFW ofw5 = new OFW();
                    OFW.LJI(c87399YRv.LJJ, c87399YRv.LJIJJLI, ofw5);
                    OFW ofw6 = new OFW();
                    ofw6.LJIIL();
                    ofw6.LJ(ofw5);
                    OFW ofw7 = c87399YRv.LJIJI;
                    OFW.LJI(ofw6, ofw7, ofw7);
                    double LIZJ2 = c87401YRx3.LIZJ();
                    if (LIZJ2 < 1.0E-15d) {
                        LIZIZ = new C87400YRw();
                    } else {
                        c87401YRx3.LIZLLL();
                        LIZIZ = C87400YRw.LIZIZ(c87401YRx3, LIZJ2);
                    }
                    c87399YRv.LJII = LIZIZ.LJ(c87399YRv.LJII);
                    OFW LJIIIZ = OFW.LJIIIZ(LIZIZ);
                    c87399YRv.LJIJI = OFW.LJFF(OFW.LJFF(LJIIIZ, c87399YRv.LJIJI), LJIIIZ.LJIILJJIL());
                    return;
                }
                return;
            }
        }
        if (sensorEvent.sensor.getType() == 4 || sensorEvent.sensor.getType() == 16) {
            this.LJLIL.LIZJ(sensorEvent);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.LJLJJL == 1) {
            return false;
        }
        C87399YRv c87399YRv = this.LJLIL;
        c87399YRv.getClass();
        c87399YRv.LJII = C87400YRw.LIZLLL(new C87401YRx(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, -800.0d), new C87401YRx(-f, f2, -800.0d)).LJ(c87399YRv.LJII);
        return true;
    }

    public C87398YRu(Context context, Display display, int i, int i2, int i3, int i4, double d) {
        boolean z;
        this.LJLJLLL = -1;
        this.LJLJLLL = i3;
        this.LJLILLLLZI = new C39212FaC((SensorManager) C16880lQ.LLILL(context, "sensor"));
        this.LJLJI = display;
        C87399YRv c87399YRv = new C87399YRv(i3);
        this.LJLIL = c87399YRv;
        if (i4 == 1) {
            z = true;
        } else {
            z = false;
        }
        int i5 = c87399YRv.LJJIFFI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("enable smoother:");
        LIZ.append(z);
        LIZ.append(",factor:");
        LIZ.append(d);
        C48284IxE.LIZ(2, i5, "TR_SensorFusionEkf", X1D.LIZIZ(LIZ));
        c87399YRv.LJIIIZ = z;
        c87399YRv.LJIIJ = d;
        c87399YRv.LJIILIIL = i;
        int rotation = display.getRotation();
        int i6 = c87399YRv.LJJIFFI;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("display rotation:");
        LIZ2.append(rotation);
        C48284IxE.LIZ(2, i6, "TR_SensorFusionEkf", X1D.LIZIZ(LIZ2));
        c87399YRv.LJJI = rotation;
        this.LJLJJLL = i;
        this.LJLJLJ = i2 == 1;
    }
}
