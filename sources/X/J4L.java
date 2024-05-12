package X;

import Y.ARunnableS11S0201000_8;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes9.dex */
public final class J4L implements SensorEventListener {
    public Context LJLIL;
    public boolean LJLILLLLZI;
    public SensorManager LJLJJI;
    public Sensor LJLJJL;
    public Sensor LJLJJLL;
    public Sensor LJLJL;
    public boolean LJLJLJ;
    public int LJLJLLL;
    public J4W LJLLI;
    public boolean LJLLILLLL;
    public boolean LJLLJ;
    public boolean LJLLL;
    public int LJLJI = -999;
    public int LJLL = -999;
    public final List<Float> LJLLLL = new ArrayList(150);
    public final List<Float> LJLLLLLL = new ArrayList(150);
    public final List<Float> LJLZ = new ArrayList(150);
    public final List<Float> LJZ = new ArrayList(150);
    public final List<Float> LJZI = new ArrayList(150);
    public final List<Float> LJZL = new ArrayList(150);
    public final List<Float> LL = new ArrayList(150);
    public final List<Float> LLD = new ArrayList(150);
    public final List<Float> LLF = new ArrayList(150);

    public static boolean LIZIZ(SensorManager sensorManager, J4L j4l, Sensor sensor) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(100700, "android/hardware/SensorManager", "registerListener", sensorManager, new Object[]{j4l, sensor, 20000}, "boolean", new C65300Pk0(false, "(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z", "6147811972126432971"));
        return LIZJ.LIZ ? ((Boolean) LIZJ.LIZIZ).booleanValue() : sensorManager.registerListener(j4l, sensor, 20000);
    }

    public static void LIZJ(SensorManager sensorManager, SensorEventListener sensorEventListener, Sensor sensor) {
        if (new C03880Dg(2).LIZJ(100701, "android/hardware/SensorManager", "unregisterListener", sensorManager, new Object[]{sensorEventListener, sensor}, "void", new C65300Pk0(false, "(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;)V", "6147811972126432971")).LIZ) {
            return;
        }
        sensorManager.unregisterListener(sensorEventListener, sensor);
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final void LIZ() {
        long j;
        boolean z;
        boolean z2;
        if (((ArrayList) this.LJLLLL).size() >= 100 && ((ArrayList) this.LJLLLLLL).size() >= 100 && ((ArrayList) this.LJLZ).size() >= 100 && ((ArrayList) this.LJZ).size() >= 100 && ((ArrayList) this.LJZI).size() >= 100 && ((ArrayList) this.LJZL).size() >= 100 && ((ArrayList) this.LL).size() >= 100 && ((ArrayList) this.LLD).size() >= 100 && ((ArrayList) this.LLF).size() >= 100) {
            int size = ((ArrayList) this.LJLLLL).size();
            int size2 = ((ArrayList) this.LJZ).size();
            int size3 = ((ArrayList) this.LL).size();
            if (J6U.LIZ) {
                j = System.currentTimeMillis();
            } else {
                j = 0;
            }
            float[] fArr = new float[900];
            int i = 0;
            do {
                int i2 = i * 9;
                fArr[i2] = ((Float) ListProtector.get(this.LJLLLL, i)).floatValue();
                fArr[i2 + 1] = ((Float) ListProtector.get(this.LJLLLLLL, i)).floatValue();
                fArr[i2 + 2] = ((Float) ListProtector.get(this.LJLZ, i)).floatValue();
                fArr[i2 + 3] = ((Float) ListProtector.get(this.LL, i)).floatValue();
                fArr[i2 + 4] = ((Float) ListProtector.get(this.LLD, i)).floatValue();
                fArr[i2 + 5] = ((Float) ListProtector.get(this.LLF, i)).floatValue();
                fArr[i2 + 6] = ((Float) ListProtector.get(this.LJZ, i)).floatValue();
                fArr[i2 + 7] = ((Float) ListProtector.get(this.LJZI, i)).floatValue();
                fArr[i2 + 8] = ((Float) ListProtector.get(this.LJZL, i)).floatValue();
                i++;
            } while (i < 100);
            ((ArrayList) this.LJLLLL).clear();
            ((ArrayList) this.LJLLLLLL).clear();
            ((ArrayList) this.LJLZ).clear();
            ((ArrayList) this.LL).clear();
            ((ArrayList) this.LLD).clear();
            ((ArrayList) this.LLF).clear();
            ((ArrayList) this.LJZ).clear();
            ((ArrayList) this.LJZI).clear();
            ((ArrayList) this.LJZL).clear();
            if (J6U.LIZ) {
                long currentTimeMillis = System.currentTimeMillis() - j;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("HarSensorManager.buildPredictInputData cost: ");
                LIZ.append(currentTimeMillis);
                LIZ.append(" aSize:");
                LIZ.append(size);
                C1EU.LIZJ(LIZ, " gSize:", size2, " lSize:", size3);
                LIZ.append(" inputs.size:");
                LIZ.append(900);
                X1D.LIZIZ(LIZ);
            }
            J4W j4w = this.LJLLI;
            if (j4w != null) {
                if (J6U.LIZ) {
                    J4O j4o = j4w.LIZ.LIZLLL;
                    if (j4o != null && j4o.isReady()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("HARService.onOnePredictSensorDataReady inputs.size:");
                    LIZ2.append(900);
                    LIZ2.append(" isEngineReady:");
                    LIZ2.append(z2);
                    X1D.LIZIZ(LIZ2);
                }
                J4O j4o2 = j4w.LIZ.LIZLLL;
                if (j4o2 != null && j4o2.isReady()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    Handler handler = j4w.LIZ.LJIIJJI;
                    if (handler != null) {
                        handler.removeCallbacksAndMessages(null);
                        j4w.LIZ.LJIIJJI.post(new ARunnableS11S0201000_8(0, j4w, fArr, 12));
                        J4K j4k = j4w.LIZ;
                        if (j4k.LIZ) {
                            j4k.LIZJ();
                        }
                    }
                } else {
                    j4w.LIZ.LJII(null, -2, false);
                }
            }
            if (this.LJLLILLLL) {
                this.LJLLILLLL = false;
                this.LJLLJ = true;
            }
        }
    }

    public final void LJFF() {
        if (J6U.LIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("HarSensorManager.unInit hasInit:");
            LIZ.append(this.LJLILLLLZI);
            LIZ.append(" lastInitErrCode:");
            LIZ.append(this.LJLJI);
            LIZ.append(" appContext:");
            LIZ.append(this.LJLIL);
            X1D.LIZIZ(LIZ);
        }
        if (this.LJLILLLLZI) {
            this.LJLILLLLZI = false;
            LJI();
            this.LJLIL = null;
            this.LJLJJI = null;
            this.LJLJJL = null;
            this.LJLJJLL = null;
            this.LJLJL = null;
            this.LJLJI = -999;
            ((ArrayList) this.LJLLLL).clear();
            ((ArrayList) this.LJLLLLLL).clear();
            ((ArrayList) this.LJLZ).clear();
            ((ArrayList) this.LJZ).clear();
            ((ArrayList) this.LJZI).clear();
            ((ArrayList) this.LJZL).clear();
            ((ArrayList) this.LL).clear();
            ((ArrayList) this.LLD).clear();
            ((ArrayList) this.LLF).clear();
        }
    }

    public final void LJI() {
        long j;
        if (J6U.LIZ) {
            j = System.currentTimeMillis();
        } else {
            j = 0;
        }
        boolean z = this.LJLJLJ;
        SensorManager sensorManager = this.LJLJJI;
        Sensor sensor = this.LJLJJL;
        Sensor sensor2 = this.LJLJJLL;
        Sensor sensor3 = this.LJLJL;
        if (z && sensorManager != null && sensor != null && sensor2 != null && sensor3 != null) {
            LIZJ(sensorManager, this, sensor);
            LIZJ(sensorManager, this, sensor2);
            LIZJ(sensorManager, this, sensor3);
            this.LJLJLJ = false;
        }
        if (J6U.LIZ) {
            long currentTimeMillis = System.currentTimeMillis() - j;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("HarSensorManager.unregister cost:");
            LIZ.append(currentTimeMillis);
            LIZ.append(" hasRegister:");
            LIZ.append(z);
            X1D.LIZIZ(LIZ);
        }
    }

    public final int LIZLLL(Context context) {
        long j;
        if (J6U.LIZ) {
            j = System.currentTimeMillis();
        } else {
            j = 0;
        }
        if (!this.LJLILLLLZI) {
            Context LLLLL = C16880lQ.LLLLL(context);
            this.LJLIL = LLLLL;
            this.LJLILLLLZI = true;
            SensorManager sensorManager = (SensorManager) C16880lQ.LLILL(LLLLL, "sensor");
            if (sensorManager != null) {
                this.LJLJJL = V0N.LJIJJ(sensorManager, 1);
                this.LJLJJLL = V0N.LJIJJ(sensorManager, 4);
                this.LJLJL = V0N.LJIJJ(sensorManager, 10);
                this.LJLJJI = sensorManager;
                if (J6U.LIZ) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("HarSensorManager getDefaultSensor, accelerometer:");
                    LIZ.append(this.LJLJJL);
                    LIZ.append(" gyroscope:");
                    LIZ.append(this.LJLJJLL);
                    LIZ.append(" linearAcceleration:");
                    LIZ.append(this.LJLJL);
                    X1D.LIZIZ(LIZ);
                }
            }
            if (this.LJLJJL == null) {
                this.LJLJI = -1;
            } else if (this.LJLJJLL == null) {
                this.LJLJI = -2;
            } else if (this.LJLJL == null) {
                this.LJLJI = -3;
            } else {
                this.LJLJI = 0;
            }
            if (this.LJLJI != 0) {
                this.LJLJJI = null;
                this.LJLJJL = null;
                this.LJLJJLL = null;
                this.LJLJL = null;
            }
        }
        if (J6U.LIZ) {
            StringBuilder LIZJ = V10.LIZJ("HarSensorManager.init cost:", System.currentTimeMillis() - j, " hasInit:");
            LIZJ.append(this.LJLILLLLZI);
            LIZJ.append(" lastInitErrCode:");
            LIZJ.append(this.LJLJI);
            LIZJ.append(" appContext:");
            LIZJ.append(this.LJLIL);
            X1D.LIZIZ(LIZJ);
        }
        return this.LJLJI;
    }

    public final void LJ(boolean z) {
        if (J6U.LIZ) {
            C07670Rv.LIZLLL("HarSensorManager.onlyTrackDataOnceWithSensorKeepRegister only:", z);
        }
        this.LJLLILLLL = z;
        this.LJLLJ = false;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (this.LJLILLLLZI && this.LJLLL && !this.LJLLJ) {
            Sensor sensor = sensorEvent.sensor;
            if (sensor.getType() == 1) {
                if (((ArrayList) this.LJLLLL).size() < 300) {
                    ((ArrayList) this.LJLLLL).add(Float.valueOf(sensorEvent.values[0]));
                    ((ArrayList) this.LJLLLLLL).add(Float.valueOf(sensorEvent.values[1]));
                    ((ArrayList) this.LJLZ).add(Float.valueOf(sensorEvent.values[2]));
                    LIZ();
                    return;
                }
                return;
            }
            if (sensor.getType() == 4) {
                if (((ArrayList) this.LJZ).size() >= 300) {
                    return;
                }
                ((ArrayList) this.LJZ).add(Float.valueOf(sensorEvent.values[0]));
                ((ArrayList) this.LJZI).add(Float.valueOf(sensorEvent.values[1]));
                ((ArrayList) this.LJZL).add(Float.valueOf(sensorEvent.values[2]));
                LIZ();
                return;
            }
            if (sensor.getType() != 10 || ((ArrayList) this.LL).size() >= 300) {
                return;
            }
            ((ArrayList) this.LL).add(Float.valueOf(sensorEvent.values[0]));
            ((ArrayList) this.LLD).add(Float.valueOf(sensorEvent.values[1]));
            ((ArrayList) this.LLF).add(Float.valueOf(sensorEvent.values[2]));
            LIZ();
        }
    }
}
