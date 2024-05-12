package Y;

import X.C64797Pbt;
import X.C92097a5F;
import X.InterfaceC36621EYv;
import X.InterfaceC37276Ek4;
import X.InterfaceC92098a5G;
import com.bytedance.pipo.checkout.api.network.model.HttpResponse;
import com.bytedance.retrofit2.mime.TypedInput;

/* loaded from: classes20.dex */
public class IDdS381S0100000_31 implements InterfaceC36621EYv {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC36621EYv
    public final void LIZJ(InterfaceC37276Ek4<TypedInput> interfaceC37276Ek4, Throwable th) {
        switch (this.$t) {
            case 0:
                LIZJ$0(this, interfaceC37276Ek4, th);
                return;
            case 1:
                LIZJ$1(this, interfaceC37276Ek4, th);
                return;
            default:
                return;
        }
    }

    @Override // X.InterfaceC36621EYv
    public final void LJII(InterfaceC37276Ek4<TypedInput> interfaceC37276Ek4, C64797Pbt<TypedInput> c64797Pbt) {
        switch (this.$t) {
            case 0:
                LJII$0(this, interfaceC37276Ek4, c64797Pbt);
                return;
            case 1:
                LJII$1(this, interfaceC37276Ek4, c64797Pbt);
                return;
            default:
                return;
        }
    }

    public IDdS381S0100000_31(InterfaceC92098a5G interfaceC92098a5G, int i) {
        this.$t = i;
        this.l0 = interfaceC92098a5G;
    }

    public static final void LIZJ$0(IDdS381S0100000_31 iDdS381S0100000_31, InterfaceC37276Ek4 interfaceC37276Ek4, Throwable th) {
        ((InterfaceC92098a5G) iDdS381S0100000_31.l0).onFailure(th);
    }

    public static final void LIZJ$1(IDdS381S0100000_31 iDdS381S0100000_31, InterfaceC37276Ek4 interfaceC37276Ek4, Throwable th) {
        ((InterfaceC92098a5G) iDdS381S0100000_31.l0).onFailure(th);
    }

    public static final void LJII$0(IDdS381S0100000_31 iDdS381S0100000_31, InterfaceC37276Ek4 interfaceC37276Ek4, C64797Pbt c64797Pbt) {
        try {
            ((InterfaceC92098a5G) iDdS381S0100000_31.l0).LIZ(new HttpResponse(c64797Pbt.LIZ.LIZIZ, C92097a5F.LIZJ(((TypedInput) c64797Pbt.LIZIZ).in())));
        } catch (Throwable th) {
            ((InterfaceC92098a5G) iDdS381S0100000_31.l0).onFailure(th);
        }
    }

    public static final void LJII$1(IDdS381S0100000_31 iDdS381S0100000_31, InterfaceC37276Ek4 interfaceC37276Ek4, C64797Pbt c64797Pbt) {
        try {
            ((InterfaceC92098a5G) iDdS381S0100000_31.l0).LIZ(new HttpResponse(c64797Pbt.LIZ.LIZIZ, C92097a5F.LIZJ(((TypedInput) c64797Pbt.LIZIZ).in())));
        } catch (Throwable th) {
            ((InterfaceC92098a5G) iDdS381S0100000_31.l0).onFailure(th);
        }
    }
}
