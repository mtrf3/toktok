package X;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.Vibrator;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NDT implements SensorEventListener {
    public final NDS LJLIL;
    public boolean LJLILLLLZI;
    public final C62822Ol8 LJLJI;

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public NDT(NDP depend) {
        o.LJIIIZ(depend, "depend");
        this.LJLIL = depend;
        this.LJLJI = C221108m2.LIZIZ(NDU.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.List] */
    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        ?? arrayList;
        InterfaceC60761Nsz kitView;
        if (sensorEvent == null || !this.LJLIL.LIZ() || this.LJLIL.LIZIZ() || this.LJLILLLLZI) {
            return;
        }
        float[] fArr = sensorEvent.values;
        o.LJIIIIZZ(fArr, "event.values");
        if (3 >= fArr.length) {
            arrayList = ORY.LJJLL(fArr);
        } else {
            arrayList = new ArrayList(3);
            int i = 0;
            for (float f : fArr) {
                arrayList.add(Float.valueOf(f));
                i++;
                if (i == 3) {
                    break;
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            float floatValue = ((Number) it.next()).floatValue();
            arrayList2.add(Float.valueOf(floatValue * floatValue));
        }
        if (Math.abs(((float) Math.sqrt(ORZ.LLILL(arrayList2))) - 9.80665f) > 13.0f) {
            this.LJLILLLLZI = true;
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LIZJ = this.LJLIL.LIZJ();
            if (LIZJ != null && (kitView = LIZJ.getKitView()) != null) {
                kitView.LJIIJ("IBEShake", null);
            }
            Vibrator vibrator = (Vibrator) this.LJLJI.getValue();
            if (vibrator != null) {
                vibrator.vibrate(500L);
            }
        }
    }
}
