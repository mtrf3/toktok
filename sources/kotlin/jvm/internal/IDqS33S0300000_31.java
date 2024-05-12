package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C0Z5;
import X.C16880lQ;
import X.C1ZD;
import X.C76800UCe;
import X.C78613UtF;
import X.C91706Zyw;
import X.C91874a1e;
import X.C92145a61;
import X.C92158a6E;
import X.C92283a8F;
import X.C93045aKX;
import X.EnumC92041a4L;
import X.InterfaceC35811ar;
import X.InterfaceC65784Pro;
import X.InterfaceC70422pa;
import X.InterfaceC88472Yns;
import X.XKX;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.bytedance.pipo.checkout.sdk.viewmodel.CheckoutUiState;

/* loaded from: classes20.dex */
public class IDqS33S0300000_31 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC65784Pro
    public /* bridge */ /* synthetic */ Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            default:
                return null;
        }
    }

    public final void invoke$0() {
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) this.l0;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        InterfaceC65784Pro interfaceC65784Pro2 = (InterfaceC65784Pro) this.l1;
        if (interfaceC65784Pro2 != null) {
            interfaceC65784Pro2.invoke();
        }
        ((InterfaceC65784Pro) this.l2).invoke();
    }

    public final void invoke$1() {
        C16880lQ.LJLLL((ComposeView) this.l1, (ViewGroup) this.l0);
        ((InterfaceC65784Pro) this.l2).invoke();
    }

    public final void invoke$2() {
        C16880lQ.LJLLL((ComposeView) this.l1, (ViewGroup) this.l0);
        ((InterfaceC65784Pro) this.l2).invoke();
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(IDqS33S0300000_31 iDqS33S0300000_31) {
        iDqS33S0300000_31.invoke$0();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(IDqS33S0300000_31 iDqS33S0300000_31) {
        XKX.LIZLLL((InterfaceC70422pa) iDqS33S0300000_31.l0, C78613UtF.LIZJ, null, new C93045aKX((C1ZD) iDqS33S0300000_31.l1, (InterfaceC65784Pro) iDqS33S0300000_31.l2, null), 2);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(IDqS33S0300000_31 iDqS33S0300000_31) {
        ((InterfaceC35811ar) iDqS33S0300000_31.l0).setValue(((InterfaceC35811ar) iDqS33S0300000_31.l1).getValue());
        if (((Number) ((InterfaceC35811ar) iDqS33S0300000_31.l0).getValue()).intValue() != -1) {
            ((C0Z5) iDqS33S0300000_31.l2).LIZIZ(false);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(IDqS33S0300000_31 iDqS33S0300000_31) {
        ((C92158a6E) iDqS33S0300000_31.l0).LIZLLL(new IDqS178S0200000_31((InterfaceC65784Pro) iDqS33S0300000_31.l1, (InterfaceC65784Pro<C76800UCe>) iDqS33S0300000_31.l2, (InterfaceC65784Pro<C76800UCe>) 8));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(IDqS33S0300000_31 iDqS33S0300000_31) {
        ((C92158a6E) iDqS33S0300000_31.l0).LJFF();
        C91874a1e.LIZIZ((C92158a6E) iDqS33S0300000_31.l0, (View) iDqS33S0300000_31.l1, (InterfaceC65784Pro) iDqS33S0300000_31.l2);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(IDqS33S0300000_31 iDqS33S0300000_31) {
        ((InterfaceC88472Yns) iDqS33S0300000_31.l0).invoke(Boolean.valueOf(!o.LJ(((CheckoutUiState) iDqS33S0300000_31.l1).getNavBarState().getCurrentRoute(), "pay_result")));
        C92283a8F c92283a8F = (C92283a8F) iDqS33S0300000_31.l2;
        c92283a8F.getClass();
        c92283a8F.LJIIIIZZ(EnumC92041a4L.Close);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(IDqS33S0300000_31 iDqS33S0300000_31) {
        if (o.LJ((Boolean) iDqS33S0300000_31.l0, Boolean.TRUE)) {
            ((InterfaceC65784Pro) iDqS33S0300000_31.l1).invoke();
        } else {
            C91706Zyw.LJIILL((C92145a61) iDqS33S0300000_31.l2, "available_methods", false);
        }
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$7(IDqS33S0300000_31 iDqS33S0300000_31) {
        iDqS33S0300000_31.invoke$1();
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$8(IDqS33S0300000_31 iDqS33S0300000_31) {
        iDqS33S0300000_31.invoke$2();
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS33S0300000_31(InterfaceC35811ar interfaceC35811ar, InterfaceC35811ar<Integer> interfaceC35811ar2, InterfaceC35811ar<Integer> interfaceC35811ar3, C0Z5 c0z5) {
        super(0);
        this.$t = c0z5;
        this.l0 = interfaceC35811ar;
        this.l1 = interfaceC35811ar2;
        this.l2 = interfaceC35811ar3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS33S0300000_31(InterfaceC70422pa interfaceC70422pa, InterfaceC70422pa interfaceC70422pa2, C1ZD c1zd, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        super(0);
        this.$t = interfaceC65784Pro;
        this.l0 = interfaceC70422pa;
        this.l1 = interfaceC70422pa2;
        this.l2 = c1zd;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS33S0300000_31(InterfaceC65784Pro interfaceC65784Pro, InterfaceC65784Pro interfaceC65784Pro2, InterfaceC65784Pro interfaceC65784Pro3, int i) {
        super(0);
        this.$t = i;
        this.l0 = interfaceC65784Pro;
        this.l1 = interfaceC65784Pro2;
        this.l2 = interfaceC65784Pro3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS33S0300000_31(InterfaceC88472Yns interfaceC88472Yns, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns2, CheckoutUiState checkoutUiState, C92283a8F c92283a8F) {
        super(0);
        this.$t = c92283a8F;
        this.l0 = interfaceC88472Yns;
        this.l1 = interfaceC88472Yns2;
        this.l2 = checkoutUiState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS33S0300000_31(C92158a6E c92158a6E, C92158a6E c92158a6E2, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2) {
        super(0);
        this.$t = interfaceC65784Pro2;
        this.l0 = c92158a6E;
        this.l1 = c92158a6E2;
        this.l2 = interfaceC65784Pro;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS33S0300000_31(C92158a6E c92158a6E, C92158a6E c92158a6E2, View view, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        super(0);
        this.$t = interfaceC65784Pro;
        this.l0 = c92158a6E;
        this.l1 = c92158a6E2;
        this.l2 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS33S0300000_31(ViewGroup viewGroup, ViewGroup viewGroup2, ComposeView composeView, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        super(0);
        this.$t = interfaceC65784Pro;
        this.l0 = viewGroup;
        this.l1 = viewGroup2;
        this.l2 = composeView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS33S0300000_31(Boolean bool, Boolean bool2, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, C92145a61 c92145a61) {
        super(0);
        this.$t = c92145a61;
        this.l0 = bool;
        this.l1 = bool2;
        this.l2 = interfaceC65784Pro;
    }
}
