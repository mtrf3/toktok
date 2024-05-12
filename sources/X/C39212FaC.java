package X;

import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Looper;
import com.bytedance.bpea.basics.Cert;
import java.util.ArrayList;

/* renamed from: X.FaC, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39212FaC {
    public boolean LIZ;
    public final SensorManager LIZIZ;
    public Looper LIZJ;
    public C39213FaD LIZLLL;
    public Cert LJ;
    public final ArrayList<SensorEventListener> LJFF = new ArrayList<>();
    public final int LJI = -1;

    public C39212FaC(SensorManager sensorManager) {
        this.LIZIZ = sensorManager;
    }
}
