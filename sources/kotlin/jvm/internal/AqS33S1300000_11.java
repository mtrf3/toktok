package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C03880Dg;
import X.C65300Pk0;
import X.C68322mC;
import X.C68972R5c;
import X.C69084R9k;
import X.C76800UCe;
import X.InterfaceC68974R5e;
import X.InterfaceC88472Yns;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Handler;
import android.os.Looper;
import java.util.Map;

/* loaded from: classes12.dex */
public class AqS33S1300000_11 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

    @Override // X.InterfaceC88472Yns
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public final void invoke$0(Throwable exception) {
        o.LJIIIZ(exception, "exception");
        int errorCode = ((C69084R9k) exception).getErrorCode();
        C68972R5c.LJFF(false, errorCode, this.s0, (InterfaceC68974R5e) ((C68322mC) this.l1).element, (Map) this.l2);
        ((InterfaceC88472Yns) this.l3).invoke(Integer.valueOf(errorCode));
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AqS33S1300000_11 aqS33S1300000_11, Object obj) {
        aqS33S1300000_11.invoke$0((Throwable) obj);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS33S1300000_11 aqS33S1300000_11, Object obj) {
        CameraManager cameraManager = (CameraManager) aqS33S1300000_11.l1;
        String str = aqS33S1300000_11.s0;
        CameraDevice.StateCallback stateCallback = (CameraDevice.StateCallback) aqS33S1300000_11.l2;
        Handler handler = (Handler) aqS33S1300000_11.l3;
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {str, stateCallback, handler};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Ljava/lang/String;Landroid/hardware/camera2/CameraDevice$StateCallback;Landroid/os/Handler;)V", "8001604037654132810");
        if (c03880Dg.LIZJ(100206, "android/hardware/camera2/CameraManager", "openCamera", cameraManager, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(100206, "android/hardware/camera2/CameraManager", "openCamera", null, objArr, cameraManager, c65300Pk0, false);
        } else {
            cameraManager.openCamera(str, stateCallback, handler);
            c03880Dg.LIZIZ(100206, "android/hardware/camera2/CameraManager", "openCamera", null, objArr, cameraManager, c65300Pk0, true);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS33S1300000_11 aqS33S1300000_11, Object obj) {
        LocationManager locationManager = (LocationManager) aqS33S1300000_11.l1;
        String str = aqS33S1300000_11.s0;
        LocationListener locationListener = (LocationListener) aqS33S1300000_11.l2;
        Looper looper = (Looper) aqS33S1300000_11.l3;
        if (!new C03880Dg(2).LIZJ(100002, "android/location/LocationManager", "requestSingleUpdate", locationManager, new Object[]{str, locationListener, looper}, "void", new C65300Pk0(false, "(Ljava/lang/String;Landroid/location/LocationListener;Landroid/os/Looper;)V", "5180359958872162344")).LIZ) {
            locationManager.requestSingleUpdate(str, locationListener, looper);
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS33S1300000_11(CameraManager cameraManager, String str, CameraDevice.StateCallback stateCallback, Handler handler, int i) {
        super(1);
        this.$t = i;
        this.l1 = cameraManager;
        this.s0 = str;
        this.l2 = stateCallback;
        this.l3 = handler;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS33S1300000_11(LocationManager locationManager, String str, LocationListener locationListener, Looper looper, int i) {
        super(1);
        this.$t = i;
        this.l1 = locationManager;
        this.s0 = str;
        this.l2 = locationListener;
        this.l3 = looper;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS33S1300000_11(String str, String str2, C68322mC<InterfaceC68974R5e> c68322mC, Map<String, Object> map, InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns) {
        super(1);
        this.$t = interfaceC88472Yns;
        this.s0 = str;
        this.l1 = str2;
        this.l2 = c68322mC;
        this.l3 = map;
    }
}
