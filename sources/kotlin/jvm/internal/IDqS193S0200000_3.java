package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C3C8;
import X.C76800UCe;
import X.C8VR;
import X.C8YM;
import X.InterfaceC212848Wy;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;

/* loaded from: classes4.dex */
public class IDqS193S0200000_3 extends AbstractC65781Prl implements InterfaceC88474Ynu {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC88474Ynu
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3, obj4);
            case 1:
                return invoke$1(this, obj, obj2, obj3, obj4);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS193S0200000_3(InterfaceC212848Wy interfaceC212848Wy, InterfaceC212848Wy<? extends RECEIVER> interfaceC212848Wy2, InterfaceC88475Ynv<? super RECEIVER, ? super A, ? super B, ? super C, ? super D, C76800UCe> interfaceC88475Ynv) {
        super(4);
        this.$t = interfaceC88475Ynv;
        this.l0 = interfaceC212848Wy;
        this.l1 = interfaceC212848Wy2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS193S0200000_3(C8YM c8ym, C8YM<RECEIVER> c8ym2, InterfaceC88475Ynv<? super RECEIVER, ? super A, ? super B, ? super C, ? super D, C76800UCe> interfaceC88475Ynv) {
        super(4);
        this.$t = interfaceC88475Ynv;
        this.l0 = c8ym;
        this.l1 = c8ym2;
    }

    public static final Object invoke$0(IDqS193S0200000_3 iDqS193S0200000_3, Object obj, Object obj2, Object obj3, Object obj4) {
        C3C8 actualReceiver = ((InterfaceC212848Wy) iDqS193S0200000_3.l0).getActualReceiver();
        if (actualReceiver != null) {
            C8VR.LIZIZ(actualReceiver, new AqS7S0600000_3((InterfaceC88475Ynv) iDqS193S0200000_3.l1, (InterfaceC88475Ynv<C3C8, Object, Object, Object, Object, C76800UCe>) actualReceiver, (C3C8) obj, obj2, obj3, obj4, (Object) 4));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(IDqS193S0200000_3 iDqS193S0200000_3, Object obj, Object obj2, Object obj3, Object obj4) {
        C3C8 receiverForHostVM = ((C8YM) iDqS193S0200000_3.l0).getReceiverForHostVM();
        if (receiverForHostVM == null) {
            receiverForHostVM = ((C8YM) iDqS193S0200000_3.l0).getActualReceiverHolder().getActualReceiver();
        }
        if (receiverForHostVM != null) {
            ((InterfaceC88475Ynv) iDqS193S0200000_3.l1).invoke(receiverForHostVM, obj, obj2, obj3, obj4);
        }
        return C76800UCe.LIZ;
    }
}
