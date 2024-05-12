package X;

import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.SystemClock;
import kotlin.jvm.internal.o;

/* renamed from: X.YAx, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public abstract class AbstractC86959YAx implements SensorEventListener {
    public boolean LJLIL;

    public AbstractC86959YAx(boolean z) {
        this.LJLIL = z;
    }

    public static double LIZ(SensorEvent sensorEvent) {
        o.LJIIIZ(sensorEvent, "sensorEvent");
        long j = sensorEvent.timestamp;
        long abs = Math.abs(System.nanoTime() - j);
        long abs2 = Math.abs(SystemClock.elapsedRealtimeNanos() - j);
        long abs3 = Math.abs((SystemClock.uptimeMillis() * 1000000) - j);
        if (abs > abs2) {
            abs = abs2;
        }
        if (abs <= abs3) {
            abs3 = abs;
        }
        return r3 - abs3;
    }
}
