package ms.bd.o;

import X.C03880Dg;
import X.C16880lQ;
import X.C39519Ff9;
import X.C65300Pk0;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import java.util.Date;
import java.util.LinkedList;
import java.util.Locale;

/* loaded from: classes7.dex */
public class c2 implements SensorEventListener {
    public static volatile c2 LJLLLLLL;
    public HandlerThread LJLILLLLZI;
    public final LinkedList<String> LJLJJLL;
    public long LJLJLJ;
    public final SensorManager LJLL;
    public long LJLLLL;
    public Handler LJLIL = null;
    public boolean LJLJI = true;
    public boolean LJLJJI = false;
    public boolean LJLJJL = false;
    public boolean LJLJL = false;
    public int LJLJLLL = 0;
    public float[] LJLLI = new float[3];
    public float[] LJLLILLLL = new float[3];
    public float[] LJLLJ = new float[3];
    public float[] LJLLL = new float[3];

    /* loaded from: classes7.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean LIZ;
            try {
                c2.this.LIZLLL();
                c2.this.LJLJI = false;
            } finally {
                if (LIZ) {
                }
            }
        }
    }

    /* loaded from: classes7.dex */
    public class b implements Runnable {
        public b() {
        }

        public final void LIZ() {
            long time;
            c2 c2Var = c2.this;
            if (!c2Var.LJLJJL || (c2Var.LJLJJLL.size() % 10 == 0 && n2.LIZ() != 1)) {
                c2.this.LIZJ();
                return;
            }
            if (c2.this.LJLLLL != 0) {
                time = ((c2.this.LJLLLL - SystemClock.elapsedRealtimeNanos()) / 1000000000) + (new Date().getTime() / 1000);
            } else {
                time = new Date().getTime() / 1000;
            }
            c2.this.LJLJJLL.add(C16880lQ.LLLZI(Locale.ENGLISH, (String) k.a(16777217, 0, 0L, "cdd253", new byte[]{55, 98, 91, 3, 68, 118, 102, 9, 112, 44, 32, 96, 91, 3, 68, 118, 102, 9, 112, 44, 32, 96, 91, 3, 68, 118, 102, 9, 112, 44, 32, 96, 91, 3, 68, 118, 102, 9, 112, 44, 32, 96, 91, 3, 68, 118, 102, 9, 112, 44, 32, 96, 91, 3, 68, 118, 102, 9, 112, 44, 32, 96}), new Object[]{Long.valueOf(time), Float.valueOf(c2.this.LJLLI[0]), Float.valueOf(c2.this.LJLLI[1]), Float.valueOf(c2.this.LJLLI[2]), Float.valueOf(c2.this.LJLLILLLL[0]), Float.valueOf(c2.this.LJLLILLLL[1]), Float.valueOf(c2.this.LJLLILLLL[2]), Float.valueOf(c2.this.LJLLJ[0]), Float.valueOf(c2.this.LJLLJ[1]), Float.valueOf(c2.this.LJLLJ[2]), Float.valueOf(c2.this.LJLLL[0]), Float.valueOf(c2.this.LJLLL[1]), Float.valueOf(c2.this.LJLLL[2])}));
            int size = c2.this.LJLJJLL.size();
            c2 c2Var2 = c2.this;
            if (size < c2Var2.LJLJLLL) {
                c2Var2.LJLIL.postDelayed(this, c2Var2.LJLJLJ);
                return;
            }
            c2Var2.LIZJ();
            c2 c2Var3 = c2.this;
            synchronized (c2Var3) {
                if (c2Var3.LJLILLLLZI.isAlive()) {
                    c2Var3.LJLILLLLZI.quit();
                }
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean LIZ;
            try {
                LIZ();
            } finally {
                if (LIZ) {
                }
            }
        }
    }

    public c2(Context context) {
        this.LJLL = null;
        Context LLLLL = C16880lQ.LLLLL(context);
        if (LLLLL != null) {
            this.LJLL = (SensorManager) C16880lQ.LLILL(LLLLL, (String) k.a(16777217, 0, 0L, "62e216", new byte[]{52, 53, 24, 85, 1, 51}));
        }
        this.LJLJJLL = new LinkedList<>();
    }

    public static c2 LIZ(Context context) {
        if (LJLLLLLL == null) {
            synchronized (e2.class) {
                if (LJLLLLLL == null) {
                    LJLLLLLL = new c2(context);
                }
            }
        }
        return LJLLLLLL;
    }

    public static Sensor LJ(SensorManager sensorManager, int i) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {Integer.valueOf(i)};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(I)Landroid/hardware/Sensor;", "2981384262718483");
        C39519Ff9 LIZJ = c03880Dg.LIZJ(100703, "android/hardware/SensorManager", "getDefaultSensor", sensorManager, objArr, "android.hardware.Sensor", c65300Pk0);
        if (LIZJ.LIZ) {
            c03880Dg.LIZIZ(100703, "android/hardware/SensorManager", "getDefaultSensor", null, objArr, sensorManager, c65300Pk0, false);
            return (Sensor) LIZJ.LIZIZ;
        }
        Sensor defaultSensor = sensorManager.getDefaultSensor(i);
        c03880Dg.LIZIZ(100703, "android/hardware/SensorManager", "getDefaultSensor", defaultSensor, objArr, sensorManager, c65300Pk0, true);
        return defaultSensor;
    }

    public static boolean LJFF(SensorManager sensorManager, SensorEventListener sensorEventListener, Sensor sensor) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(100700, "android/hardware/SensorManager", "registerListener", sensorManager, new Object[]{sensorEventListener, sensor, 3}, "boolean", new C65300Pk0(false, "(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z", "2981384262718483"));
        return LIZJ.LIZ ? ((Boolean) LIZJ.LIZIZ).booleanValue() : sensorManager.registerListener(sensorEventListener, sensor, 3);
    }

    public static boolean LJI(SensorManager sensorManager, SensorEventListener sensorEventListener, Sensor sensor, Handler handler) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(100700, "android/hardware/SensorManager", "registerListener", sensorManager, new Object[]{sensorEventListener, sensor, 3, handler}, "boolean", new C65300Pk0(false, "(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;ILandroid/os/Handler;)Z", "2981384262718483"));
        return LIZJ.LIZ ? ((Boolean) LIZJ.LIZIZ).booleanValue() : sensorManager.registerListener(sensorEventListener, sensor, 3, handler);
    }

    public static void LJII(SensorManager sensorManager, c2 c2Var) {
        if (new C03880Dg(2).LIZJ(100701, "android/hardware/SensorManager", "unregisterListener", sensorManager, new Object[]{c2Var}, "void", new C65300Pk0(false, "(Landroid/hardware/SensorEventListener;)V", "2981384262718483")).LIZ) {
            return;
        }
        sensorManager.unregisterListener(c2Var);
    }

    public final synchronized void LIZIZ(int i) {
        try {
            SensorManager sensorManager = this.LJLL;
            if (sensorManager != null) {
                Sensor LJ = LJ(sensorManager, i);
                Handler handler = this.LJLIL;
                if (handler != null) {
                    if (!LJI(this.LJLL, this, LJ, handler)) {
                        return;
                    }
                } else if (!LJFF(this.LJLL, this, LJ)) {
                    return;
                }
                this.LJLJJL = true;
            }
        } catch (Exception unused) {
        }
    }

    public final synchronized void LIZJ() {
        synchronized (this) {
            try {
                SensorManager sensorManager = this.LJLL;
                if (sensorManager != null && this.LJLJJL) {
                    LJII(sensorManager, this);
                    this.LJLJJL = false;
                }
            } catch (Exception unused) {
            }
        }
        this.LJLJJI = false;
    }

    public final void LIZLLL() {
        if (this.LJLJJLL.size() % 10 != 0 || n2.LIZ() == 1) {
            LIZIZ(1);
            LIZIZ(9);
            LIZIZ(4);
            LIZIZ(11);
            this.LJLJJI = true;
            this.LJLIL.postDelayed(new b(), this.LJLJLJ);
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        this.LJLLLL = sensorEvent.timestamp;
        int type = sensorEvent.sensor.getType();
        if (type == 1) {
            this.LJLLI = sensorEvent.values;
            return;
        }
        if (type == 4) {
            this.LJLLJ = sensorEvent.values;
        } else if (type == 9) {
            this.LJLLILLLL = sensorEvent.values;
        } else {
            if (type != 11) {
                return;
            }
            this.LJLLL = sensorEvent.values;
        }
    }
}
