package X;

import X.NDO;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.ecommercelive.business.hybrid.HardwareAccelerometer$init$2;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NDE extends AbstractC58901N9t {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [androidx.lifecycle.LifecycleObserver, com.ss.android.ugc.aweme.ecommercelive.business.hybrid.HardwareAccelerometer$init$2] */
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        final Context context;
        boolean z;
        int i;
        Sensor defaultSensor;
        boolean z2;
        SensorManager sensorManager;
        o.LJIIIZ(type, "type");
        Number interval = ((InterfaceC58902N9u) xBaseParamModel).getInterval();
        InterfaceC38263Ezz interfaceC38263Ezz = this.LJLIL;
        if (interfaceC38263Ezz != null && (context = interfaceC38263Ezz.getContext()) != 0) {
            NDO ndo = NDO.LJLIL;
            int intValue = interval.intValue();
            if (NDO.LJLJI) {
                ndo.LIZ();
            }
            if (NDO.LJLILLLLZI == null) {
                Object LLILL = C16880lQ.LLILL(context, "sensor");
                o.LJII(LLILL, "null cannot be cast to non-null type android.hardware.SensorManager");
                NDO.LJLILLLLZI = (SensorManager) LLILL;
            }
            if (context instanceof LifecycleOwner) {
                HardwareAccelerometer$init$2 hardwareAccelerometer$init$2 = NDO.LJLJJI;
                if (hardwareAccelerometer$init$2 != null) {
                    ((LifecycleOwner) context).getLifecycle().removeObserver(hardwareAccelerometer$init$2);
                }
                ?? r1 = new GenericLifecycleObserver() { // from class: com.ss.android.ugc.aweme.ecommercelive.business.hybrid.HardwareAccelerometer$init$2
                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                        if (event == Lifecycle.Event.ON_DESTROY) {
                            onDestroy();
                        }
                    }

                    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
                    public final void onDestroy() {
                        NDO.LJLIL.LIZ();
                        ((LifecycleOwner) context).getLifecycle().removeObserver(this);
                        NDO.LJLJJI = null;
                    }
                };
                ((LifecycleOwner) context).getLifecycle().addObserver(r1);
                NDO.LJLJJI = r1;
            }
            if (intValue != 0) {
                int i2 = 1000 / intValue;
                if (i2 >= 0 && i2 < 10) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    i = 3;
                } else {
                    if (10 <= i2) {
                        if (i2 < 30) {
                            i = 2;
                        } else if (i2 < 61) {
                            i = 1;
                        }
                    }
                    i = 0;
                }
                SensorManager sensorManager2 = NDO.LJLILLLLZI;
                if (sensorManager2 != null) {
                    C03880Dg c03880Dg = new C03880Dg(2);
                    Object[] objArr = {1};
                    C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(I)Landroid/hardware/Sensor;", "3352822694363041177");
                    C39519Ff9 LIZJ = c03880Dg.LIZJ(100703, "android/hardware/SensorManager", "getDefaultSensor", sensorManager2, objArr, "android.hardware.Sensor", c65300Pk0);
                    if (LIZJ.LIZ) {
                        c03880Dg.LIZIZ(100703, "android/hardware/SensorManager", "getDefaultSensor", null, objArr, sensorManager2, c65300Pk0, false);
                        defaultSensor = (Sensor) LIZJ.LIZIZ;
                    } else {
                        defaultSensor = sensorManager2.getDefaultSensor(1);
                        c03880Dg.LIZIZ(100703, "android/hardware/SensorManager", "getDefaultSensor", defaultSensor, objArr, sensorManager2, c65300Pk0, true);
                    }
                    if (defaultSensor != null) {
                        try {
                            sensorManager = NDO.LJLILLLLZI;
                        } catch (Q0C unused) {
                        }
                        if (sensorManager != null) {
                            C39187FZn c39187FZn = C39188FZo.LIZ;
                            C78862UxG LJJIIJ = C78857UxB.LJJIIJ(1476415492, "bpea-e_commerce_jsb_register_sensor");
                            c39187FZn.getClass();
                            z2 = C39187FZn.LIZJ(sensorManager, ndo, defaultSensor, i, LJJIIJ);
                            NDO.LJLJI = z2;
                        }
                        z2 = false;
                        NDO.LJLJI = z2;
                    }
                }
            }
            XBaseModel LIZJ2 = ED5.LIZJ(InterfaceC58900N9s.class, null);
            InterfaceC58900N9s interfaceC58900N9s = (InterfaceC58900N9s) LIZJ2;
            interfaceC58900N9s.setCode(1);
            interfaceC58900N9s.setMsg("start accelerometer success.");
            c37356ElM.onSuccess((XBaseResultModel) LIZJ2, "start accelerometer success.");
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        C31626Cb8.LIZ(c37356ElM, 0, "context is null!!", 4);
    }
}
