package X;

import android.hardware.SensorEventListener;
import com.bytedance.pitaya.log.PitayaLogger;
import kotlin.jvm.internal.o;

/* renamed from: X.aP2, reason: case insensitive filesystem */
/* loaded from: classes30.dex */
public final class C93324aP2 implements InterfaceC93239aNf {
    public final /* synthetic */ SensorEventListener LJLIL;
    public final /* synthetic */ SensorEventListener LJLILLLLZI;
    public final /* synthetic */ SensorEventListener LJLJI;
    public final /* synthetic */ SensorEventListener LJLJJI;
    public final /* synthetic */ C93251aNr LJLJJL;

    @Override // X.InterfaceC93239aNf
    public final void onAppBackground() {
        try {
            C93252aNs c93252aNs = this.LJLJJL.LJIILLIIL;
            SensorEventListener listener = this.LJLIL;
            c93252aNs.getClass();
            o.LJIIJ(listener, "listener");
            o.LJIIJ(null, "sensor");
            C93252aNs c93252aNs2 = this.LJLJJL.LJIILLIIL;
            SensorEventListener listener2 = this.LJLILLLLZI;
            c93252aNs2.getClass();
            o.LJIIJ(listener2, "listener");
            o.LJIIJ(null, "sensor");
            C93252aNs c93252aNs3 = this.LJLJJL.LJIILLIIL;
            SensorEventListener listener3 = this.LJLJI;
            c93252aNs3.getClass();
            o.LJIIJ(listener3, "listener");
            o.LJIIJ(null, "sensor");
            C93252aNs c93252aNs4 = this.LJLJJL.LJIILLIIL;
            SensorEventListener listener4 = this.LJLJJI;
            c93252aNs4.getClass();
            o.LJIIJ(listener4, "listener");
            o.LJIIJ(null, "sensor");
        } catch (Throwable th) {
            PitayaLogger.LIZLLL("", "", th);
        }
    }

    @Override // X.InterfaceC93239aNf
    public final void onAppForeground() {
        try {
            C93252aNs c93252aNs = this.LJLJJL.LJIILLIIL;
            SensorEventListener listener = this.LJLIL;
            c93252aNs.getClass();
            o.LJIIJ(listener, "listener");
            o.LJIIJ(null, "sensor");
            C93252aNs c93252aNs2 = this.LJLJJL.LJIILLIIL;
            SensorEventListener listener2 = this.LJLILLLLZI;
            c93252aNs2.getClass();
            o.LJIIJ(listener2, "listener");
            o.LJIIJ(null, "sensor");
            C93252aNs c93252aNs3 = this.LJLJJL.LJIILLIIL;
            SensorEventListener listener3 = this.LJLJI;
            c93252aNs3.getClass();
            o.LJIIJ(listener3, "listener");
            o.LJIIJ(null, "sensor");
            C93252aNs c93252aNs4 = this.LJLJJL.LJIILLIIL;
            SensorEventListener listener4 = this.LJLJJI;
            c93252aNs4.getClass();
            o.LJIIJ(listener4, "listener");
            o.LJIIJ(null, "sensor");
        } catch (Throwable th) {
            PitayaLogger.LIZLLL("", "", th);
        }
    }

    public C93324aP2(C93251aNr c93251aNr, SensorEventListener sensorEventListener, SensorEventListener sensorEventListener2, SensorEventListener sensorEventListener3, SensorEventListener sensorEventListener4) {
        this.LJLJJL = c93251aNr;
        this.LJLIL = sensorEventListener;
        this.LJLILLLLZI = sensorEventListener2;
        this.LJLJI = sensorEventListener3;
        this.LJLJJI = sensorEventListener4;
    }
}
