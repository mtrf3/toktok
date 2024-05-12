package Y;

import X.C71911SKd;
import X.C71912SKe;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import X.S44;
import X.S45;
import X.SL3;
import X.SL4;
import android.widget.CompoundButton;

/* loaded from: classes13.dex */
public class IDCListenerS208S0100000_12 implements CompoundButton.OnCheckedChangeListener {
    public final int $t;
    public Object l0;

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        switch (this.$t) {
            case 0:
                onCheckedChanged$0(this, compoundButton, z);
                return;
            case 1:
                onCheckedChanged$1(this, compoundButton, z);
                return;
            case 2:
                onCheckedChanged$2(this, compoundButton, z);
                return;
            default:
                return;
        }
    }

    public IDCListenerS208S0100000_12(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onCheckedChanged$0(IDCListenerS208S0100000_12 iDCListenerS208S0100000_12, CompoundButton compoundButton, boolean z) {
        SL4 sl4;
        InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns;
        C71912SKe c71912SKe = (C71912SKe) iDCListenerS208S0100000_12.l0;
        if (!c71912SKe.LIZJ && (interfaceC88472Yns = (sl4 = c71912SKe.LIZIZ).LJIIIIZZ) != null) {
            interfaceC88472Yns.invoke(Integer.valueOf(sl4.LJIILLIIL));
        }
    }

    public static final void onCheckedChanged$1(IDCListenerS208S0100000_12 iDCListenerS208S0100000_12, CompoundButton compoundButton, boolean z) {
        int i;
        SL3 sl3 = ((C71911SKd) iDCListenerS208S0100000_12.l0).LIZIZ;
        InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns = sl3.LJIIIIZZ;
        if (interfaceC88472Yns != null) {
            if (z) {
                i = sl3.LJIILLIIL;
            } else {
                i = sl3.LJIIZILJ;
            }
            interfaceC88472Yns.invoke(Integer.valueOf(i));
        }
    }

    public static final void onCheckedChanged$2(IDCListenerS208S0100000_12 iDCListenerS208S0100000_12, CompoundButton compoundButton, boolean z) {
        S45 s45 = ((S44) iDCListenerS208S0100000_12.l0).LJLIL;
        if (s45 != null) {
            s45.LIZ(z);
        }
    }
}
