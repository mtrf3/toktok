package Y;

import X.C26045AKb;
import X.C56186M3i;
import X.C76800UCe;
import X.InterfaceC65784Pro;
import X.R47;
import com.zhiliaoapp.musically.R;

/* loaded from: classes5.dex */
public class IDeS354S0100000_4 implements R47 {
    public final int $t;
    public Object l0;

    @Override // X.R47
    public final void onResult(int i, int i2, Object obj) {
        switch (this.$t) {
            case 0:
                onResult$0(this, i, i2, obj);
                return;
            case 1:
                onResult$1(this, i, i2, obj);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public IDeS354S0100000_4(Object obj, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.$t = interfaceC65784Pro;
        this.l0 = obj;
    }

    public static final void onResult$0(IDeS354S0100000_4 iDeS354S0100000_4, int i, int i2, Object obj) {
        InterfaceC65784Pro interfaceC65784Pro;
        if (i == 1 && i2 == 1 && (interfaceC65784Pro = (InterfaceC65784Pro) iDeS354S0100000_4.l0) != null) {
            interfaceC65784Pro.invoke();
        }
    }

    public static final void onResult$1(IDeS354S0100000_4 iDeS354S0100000_4, int i, int i2, Object obj) {
        if (i == 7 && i2 == 1) {
            C26045AKb c26045AKb = new C26045AKb(((C56186M3i) iDeS354S0100000_4.l0).LIZ);
            c26045AKb.LJIIIIZZ(R.string.c9u);
            c26045AKb.LJIIJ();
        }
    }
}
