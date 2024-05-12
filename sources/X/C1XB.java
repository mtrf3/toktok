package X;

import Y.IDfS124S0200000;
import Y.IDfS292S0100000;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.bytedance.android.livesdk.chatroom.ui.GameBroadcastFragment;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.text.DecimalFormat;
import java.util.List;
import kotlin.jvm.internal.o;
import webcast.api.game.TnsPiracyDetail;

/* renamed from: X.1XB, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1XB implements InterfaceC18260ne {
    public long LIZ;
    public long LIZIZ;
    public long LIZJ;
    public final SensorManager LIZLLL;
    public final float[] LJ;
    public final float[] LJFF;
    public final float[] LJI;
    public final float[] LJII;
    public final float[] LJIIIIZZ;
    public final C18300ni LJIIIZ;

    @Override // X.InterfaceC18260ne
    public final void start() {
        if (C30922CBq.LIZIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("SensorSignalSource. start. ThreadName=");
            LIZ.append(C18280ng.LIZ());
            C0NB.LJIIIZ("SensorSignalSource", X1D.LIZIZ(LIZ));
        }
        AbstractC73672Svk.LJJIJIL(Boolean.TRUE).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new IDfS292S0100000(this, 34));
    }

    @Override // X.InterfaceC18260ne
    public final void stop() {
        if (C30922CBq.LIZIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("SensorSignalSource. stop. ThreadName=");
            LIZ.append(C18280ng.LIZ());
            C0NB.LJIIIZ("SensorSignalSource", X1D.LIZIZ(LIZ));
        }
        AbstractC73672Svk.LJJIJIL(Boolean.TRUE).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new IDfS292S0100000(this, 35));
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.0ni] */
    public C1XB(GameBroadcastFragment fragment) {
        Object obj;
        o.LJIIIZ(fragment, "fragment");
        this.LJ = new float[9];
        this.LJFF = new float[3];
        this.LJI = new float[3];
        this.LJII = new float[3];
        this.LJIIIIZZ = new float[3];
        this.LJIIIZ = new SensorEventListener() { // from class: X.0ni
            @Override // android.hardware.SensorEventListener
            public final void onAccuracyChanged(Sensor sensor, int i) {
            }

            @Override // android.hardware.SensorEventListener
            public final void onSensorChanged(SensorEvent sensorEvent) {
                Sensor sensor;
                Integer valueOf;
                long currentTimeMillis = System.currentTimeMillis();
                if (sensorEvent != null && (sensor = sensorEvent.sensor) != null && (valueOf = Integer.valueOf(sensor.getType())) != null) {
                    if (valueOf.intValue() == 10) {
                        C1XB c1xb = C1XB.this;
                        if (currentTimeMillis - c1xb.LIZ < 500) {
                            return;
                        } else {
                            c1xb.LIZ = currentTimeMillis;
                        }
                    } else if (valueOf.intValue() == 1) {
                        C1XB c1xb2 = C1XB.this;
                        if (currentTimeMillis - c1xb2.LIZIZ < 500) {
                            return;
                        } else {
                            c1xb2.LIZIZ = currentTimeMillis;
                        }
                    } else if (valueOf.intValue() == 2) {
                        C1XB c1xb3 = C1XB.this;
                        if (currentTimeMillis - c1xb3.LIZJ < 500) {
                            return;
                        } else {
                            c1xb3.LIZJ = currentTimeMillis;
                        }
                    }
                }
                AbstractC73672Svk.LJJIJIL(Boolean.TRUE).LJJJ(T16.LIZ).LJJJJZI(new IDfS124S0200000(sensorEvent, C1XB.this, 12));
            }
        };
        ActivityC45651qj mo49getActivity = fragment.mo49getActivity();
        if (mo49getActivity != null) {
            obj = C16880lQ.LLILLJJLI(mo49getActivity, "sensor");
        } else {
            obj = null;
        }
        this.LIZLLL = (SensorManager) obj;
    }

    @Override // X.InterfaceC18260ne
    public final void LIZ(TnsPiracyDetail tnsPiracyDetail) {
        boolean z;
        if (C30922CBq.LIZIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("SensorSignalSource. flush. ThreadName=");
            LIZ.append(C18280ng.LIZ());
            C0NB.LJIIIZ("SensorSignalSource", X1D.LIZIZ(LIZ));
        }
        SensorManager.getRotationMatrix(this.LJ, null, this.LJII, this.LJIIIIZZ);
        SensorManager.getOrientation(this.LJ, this.LJFF);
        if (tnsPiracyDetail.angle == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            tnsPiracyDetail.angle = C47261Igj.LJJIJIL(Double.valueOf(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX), Double.valueOf(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX), Double.valueOf(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX));
        }
        if (tnsPiracyDetail.acceleration == null) {
            tnsPiracyDetail.acceleration = C47261Igj.LJJIJIL(Double.valueOf(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX), Double.valueOf(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX), Double.valueOf(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX));
        }
        DecimalFormat decimalFormat = new DecimalFormat("#.###");
        try {
            List<Double> list = tnsPiracyDetail.acceleration;
            if (list != null) {
                String format = decimalFormat.format(Float.valueOf(this.LJI[0]));
                o.LJIIIIZZ(format, "df.format(linearAccelerationReading[0])");
            }
            List<Double> list2 = tnsPiracyDetail.acceleration;
            if (list2 != null) {
                String format2 = decimalFormat.format(Float.valueOf(this.LJI[1]));
                o.LJIIIIZZ(format2, "df.format(linearAccelerationReading[1])");
            }
            List<Double> list3 = tnsPiracyDetail.acceleration;
            if (list3 != null) {
                String format3 = decimalFormat.format(Float.valueOf(this.LJI[2]));
                o.LJIIIIZZ(format3, "df.format(linearAccelerationReading[2])");
            }
            List<Double> list4 = tnsPiracyDetail.angle;
            if (list4 != null) {
                String format4 = decimalFormat.format(Float.valueOf(this.LJFF[0]));
                o.LJIIIIZZ(format4, "df.format(orientationAngles[0])");
            }
            List<Double> list5 = tnsPiracyDetail.angle;
            if (list5 != null) {
                String format5 = decimalFormat.format(Float.valueOf(this.LJFF[1]));
                o.LJIIIIZZ(format5, "df.format(orientationAngles[1])");
            }
            List<Double> list6 = tnsPiracyDetail.angle;
            if (list6 != null) {
                String format6 = decimalFormat.format(Float.valueOf(this.LJFF[2]));
                o.LJIIIIZZ(format6, "df.format(orientationAngles[2])");
            }
        } catch (Exception unused) {
            List<Double> list7 = tnsPiracyDetail.acceleration;
            if (list7 != null) {
                ListProtector.set(list7, 0, Double.valueOf(this.LJI[0]));
            }
            List<Double> list8 = tnsPiracyDetail.acceleration;
            if (list8 != null) {
                ListProtector.set(list8, 1, Double.valueOf(this.LJI[1]));
            }
            List<Double> list9 = tnsPiracyDetail.acceleration;
            if (list9 != null) {
                ListProtector.set(list9, 2, Double.valueOf(this.LJI[2]));
            }
            List<Double> list10 = tnsPiracyDetail.angle;
            if (list10 != null) {
                ListProtector.set(list10, 0, Double.valueOf(this.LJFF[0]));
            }
            List<Double> list11 = tnsPiracyDetail.angle;
            if (list11 != null) {
                ListProtector.set(list11, 1, Double.valueOf(this.LJFF[1]));
            }
            List<Double> list12 = tnsPiracyDetail.angle;
            if (list12 != null) {
                ListProtector.set(list12, 2, Double.valueOf(this.LJFF[2]));
            }
        }
    }
}
