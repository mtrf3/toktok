package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.AbstractC72932td;
import X.C213138Yb;
import X.C213178Yf;
import X.C3C8;
import X.C56412MCa;
import X.C76800UCe;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import X.InterfaceC88476Ynw;
import X.TBW;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;

/* loaded from: classes4.dex */
public class AqS0S0700000_3 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;
    public Object l6;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS0S0700000_3 aqS0S0700000_3) {
        return ((AssemViewModel) aqS0S0700000_3.l0).getVmDispatcher().LJIIIIZZ((LifecycleOwner) aqS0S0700000_3.l1, (TBW) aqS0S0700000_3.l2, (C56412MCa) aqS0S0700000_3.l3, C213138Yb.LJLIL, (InterfaceC88472Yns) aqS0S0700000_3.l4, (InterfaceC65784Pro) aqS0S0700000_3.l5, (InterfaceC88472Yns) aqS0S0700000_3.l6);
    }

    public static final Object invoke$1(AqS0S0700000_3 aqS0S0700000_3) {
        ((InterfaceC88476Ynw) aqS0S0700000_3.l0).invoke((C3C8) aqS0S0700000_3.l1, aqS0S0700000_3.l2, aqS0S0700000_3.l3, aqS0S0700000_3.l4, aqS0S0700000_3.l5, aqS0S0700000_3.l6);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS0S0700000_3(InterfaceC88476Ynw interfaceC88476Ynw, InterfaceC88476Ynw<C3C8, Object, Object, Object, Object, Object, C76800UCe> interfaceC88476Ynw2, C3C8 c3c8, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        super(0);
        this.$t = obj5;
        this.l0 = interfaceC88476Ynw;
        this.l1 = interfaceC88476Ynw2;
        this.l2 = c3c8;
        this.l3 = obj;
        this.l4 = obj2;
        this.l5 = obj3;
        this.l6 = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS0S0700000_3(AssemViewModel assemViewModel, AssemViewModel<S> assemViewModel2, LifecycleOwner lifecycleOwner, TBW<S, ? extends AbstractC72932td<? extends T>> tbw, C56412MCa<C213178Yf<AbstractC72932td<T>>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC88472Yns<? super T, C76800UCe> interfaceC88472Yns2) {
        super(0);
        this.$t = interfaceC88472Yns2;
        this.l0 = assemViewModel;
        this.l1 = assemViewModel2;
        this.l2 = lifecycleOwner;
        this.l3 = tbw;
        this.l4 = c56412MCa;
        this.l5 = interfaceC88472Yns;
        this.l6 = interfaceC65784Pro;
    }
}
