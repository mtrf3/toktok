package X;

import android.os.Handler;
import com.ss.android.ugc.aweme.sticker.senor.presenter.ARSenorPresenter;
import com.ss.android.vesdk.VEConfigCenter;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class ID9 implements InterfaceC84016WyC {
    public InterfaceC84018WyE LIZ;
    public final Handler LIZIZ;
    public final InterfaceC65784Pro<Boolean> LIZJ;

    public static boolean LIZLLL() {
        VEConfigCenter.ValuePkt value = VEConfigCenter.getInstance().getValue("enable_build_in_sensor_service");
        if (value != null) {
            Object value2 = value.getValue();
            o.LJIIIIZZ(value2, "value.getValue()");
            return ((Boolean) value2).booleanValue();
        }
        return false;
    }

    @Override // X.InterfaceC84016WyC
    public final void LIZ() {
        InterfaceC84018WyE interfaceC84018WyE;
        if (LIZLLL()) {
            return;
        }
        if ((!this.LIZJ.invoke().booleanValue() || !(this.LIZ instanceof ARSenorPresenter)) && (interfaceC84018WyE = this.LIZ) != null && interfaceC84018WyE.Kk()) {
            interfaceC84018WyE.unRegister();
        }
    }

    @Override // X.InterfaceC84016WyC
    public final Handler LIZIZ() {
        return this.LIZIZ;
    }

    public ID9(Handler handler, AqS157S0100000_7 aqS157S0100000_7) {
        this.LIZIZ = handler;
        this.LIZJ = aqS157S0100000_7;
    }

    @Override // X.InterfaceC84016WyC
    public final void LIZJ(InterfaceC84018WyE newSensor, boolean z) {
        InterfaceC84018WyE interfaceC84018WyE;
        InterfaceC84018WyE interfaceC84018WyE2;
        o.LJIIIZ(newSensor, "newSensor");
        InterfaceC84018WyE interfaceC84018WyE3 = this.LIZ;
        if (z || interfaceC84018WyE3 == null || (!o.LJ(newSensor.getClass(), interfaceC84018WyE3.getClass())) || ((interfaceC84018WyE2 = this.LIZ) != null && !interfaceC84018WyE2.Kk())) {
            LIZ();
            this.LIZ = newSensor;
            if (LIZLLL() || (interfaceC84018WyE = this.LIZ) == null || interfaceC84018WyE.Kk()) {
                return;
            }
            interfaceC84018WyE.register();
        }
    }
}
