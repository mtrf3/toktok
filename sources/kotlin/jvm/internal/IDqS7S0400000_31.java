package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C05P;
import X.C0ZJ;
import X.C1ZD;
import X.C76800UCe;
import X.C91671ZyN;
import X.C91706Zyw;
import X.C91869a1Z;
import X.C91980a3M;
import X.C91992a3Y;
import X.C92054a4Y;
import X.C92145a61;
import X.C92158a6E;
import X.C92181a6b;
import X.C92230a7O;
import X.C92231a7P;
import X.C92283a8F;
import X.C92284a8G;
import X.C92363a9X;
import X.C92507aBr;
import X.C93043aKV;
import X.C93090aLG;
import X.C93092aLI;
import X.EnumC92042a4M;
import X.EnumC92043a4N;
import X.InterfaceC35811ar;
import X.InterfaceC65784Pro;
import X.InterfaceC70422pa;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC91758Zzm;
import X.InterfaceC91938a2g;
import X.InterfaceC91961a33;
import X.InterfaceC91978a3K;
import X.XKW;
import X.XKX;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.bytedance.pipo.checkout.api.network.model.response.Methods;
import com.bytedance.pipo.checkout.sdk.viewmodel.PIViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* loaded from: classes20.dex */
public class IDqS7S0400000_31 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
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
            case 9:
                return invoke$9(this);
            case 10:
                return invoke$10(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(IDqS7S0400000_31 iDqS7S0400000_31) {
        XKX.LIZLLL((InterfaceC70422pa) iDqS7S0400000_31.l0, (XKW) iDqS7S0400000_31.l1, null, new C93043aKV((C1ZD) iDqS7S0400000_31.l2, (InterfaceC65784Pro) iDqS7S0400000_31.l3, null), 2);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(IDqS7S0400000_31 iDqS7S0400000_31) {
        XKX.LIZLLL((InterfaceC70422pa) iDqS7S0400000_31.l0, null, null, new C93092aLI((InterfaceC35811ar) iDqS7S0400000_31.l1, (List) iDqS7S0400000_31.l2, (C05P) iDqS7S0400000_31.l3, null), 3);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$10(IDqS7S0400000_31 iDqS7S0400000_31) {
        ((InterfaceC91758Zzm) iDqS7S0400000_31.l0).LIZLLL(new IDqS33S0300000_31((ViewGroup) iDqS7S0400000_31.l1, (ViewGroup) iDqS7S0400000_31.l2, (ComposeView) iDqS7S0400000_31.l3, (InterfaceC65784Pro<C76800UCe>) 8));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(IDqS7S0400000_31 iDqS7S0400000_31) {
        C92283a8F c92283a8F = (C92283a8F) iDqS7S0400000_31.l0;
        String paymentMethodType = ((Methods) iDqS7S0400000_31.l1).getPaymentMethodType();
        if (paymentMethodType == null) {
            paymentMethodType = "";
        }
        c92283a8F.LJI(paymentMethodType, ((Methods) iDqS7S0400000_31.l1).getPaymentMethodId(), null, false);
        ((C92283a8F) iDqS7S0400000_31.l0).LJIIIZ();
        ((InterfaceC88472Yns) iDqS7S0400000_31.l2).invoke(new C92231a7P((Methods) iDqS7S0400000_31.l1));
        ((InterfaceC88471Ynr) iDqS7S0400000_31.l3).invoke("checkout_home", Boolean.FALSE);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(IDqS7S0400000_31 iDqS7S0400000_31) {
        int i;
        ((C92283a8F) iDqS7S0400000_31.l1).LJI(((C92230a7O) ((InterfaceC91961a33) iDqS7S0400000_31.l0)).LJLILLLLZI, null, null, false);
        ((C92283a8F) iDqS7S0400000_31.l1).LJIIIZ();
        InterfaceC88473Ynt interfaceC88473Ynt = (InterfaceC88473Ynt) iDqS7S0400000_31.l2;
        InterfaceC91961a33 interfaceC91961a33 = (InterfaceC91961a33) iDqS7S0400000_31.l0;
        String LIZ = C92054a4Y.LIZ("pipo_common_payin_conveniencestore", new String[0]);
        if (C91671ZyN.LIZ) {
            i = R.drawable.j0;
        } else {
            i = R.drawable.j1;
        }
        interfaceC88473Ynt.invoke(interfaceC91961a33, LIZ, Integer.valueOf(i));
        ((InterfaceC88472Yns) iDqS7S0400000_31.l3).invoke("select_assemble_pi");
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(IDqS7S0400000_31 iDqS7S0400000_31) {
        int i;
        ((C92283a8F) iDqS7S0400000_31.l1).LJI(((C92230a7O) ((InterfaceC91961a33) iDqS7S0400000_31.l0)).LJLILLLLZI, null, null, false);
        ((C92283a8F) iDqS7S0400000_31.l1).LJIIIZ();
        InterfaceC88473Ynt interfaceC88473Ynt = (InterfaceC88473Ynt) iDqS7S0400000_31.l2;
        InterfaceC91961a33 interfaceC91961a33 = (InterfaceC91961a33) iDqS7S0400000_31.l0;
        String LIZ = C92054a4Y.LIZ("pipo_payin_logo_type_internetbanking", new String[0]);
        if (C91671ZyN.LIZ) {
            i = R.drawable.ij;
        } else {
            i = R.drawable.ik;
        }
        interfaceC88473Ynt.invoke(interfaceC91961a33, LIZ, Integer.valueOf(i));
        ((InterfaceC88472Yns) iDqS7S0400000_31.l3).invoke("select_assemble_pi");
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(IDqS7S0400000_31 iDqS7S0400000_31) {
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) iDqS7S0400000_31.l0;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        C92363a9X c92363a9X = (C92363a9X) ((InterfaceC91938a2g) iDqS7S0400000_31.l1);
        InterfaceC65784Pro onOcrStart = (InterfaceC65784Pro) iDqS7S0400000_31.l2;
        InterfaceC65784Pro onOcrFinish = (InterfaceC65784Pro) iDqS7S0400000_31.l3;
        c92363a9X.getClass();
        o.LJIIIZ(onOcrStart, "onOcrStart");
        o.LJIIIZ(onOcrFinish, "onOcrFinish");
        InterfaceC91978a3K interfaceC91978a3K = C91980a3M.LIZ;
        if (interfaceC91978a3K != null) {
            onOcrStart.invoke();
            interfaceC91978a3K.LIZ(new C92181a6b(onOcrFinish, c92363a9X));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(IDqS7S0400000_31 iDqS7S0400000_31) {
        C92283a8F c92283a8F = (C92283a8F) iDqS7S0400000_31.l0;
        c92283a8F.getClass();
        c92283a8F.LJIIJ(EnumC92042a4M.Quit.getObjId(), EnumC92043a4N.QuitTransaction.getPopupId());
        ((InterfaceC91758Zzm) iDqS7S0400000_31.l1).LIZLLL(C92507aBr.LJLIL);
        XKX.LIZLLL((InterfaceC70422pa) iDqS7S0400000_31.l2, null, null, new C93090aLG((InterfaceC65784Pro) iDqS7S0400000_31.l3, null), 3);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$7(IDqS7S0400000_31 iDqS7S0400000_31) {
        ((InterfaceC65784Pro) iDqS7S0400000_31.l0).invoke();
        C92158a6E c92158a6E = new C92158a6E(null);
        c92158a6E.LJFF();
        C91992a3Y.LJI((View) iDqS7S0400000_31.l1, c92158a6E, null, C91869a1Z.LIZ, C92054a4Y.LIZ("pipo_common_payin_tips_security_code_1", new String[0]), C92054a4Y.LIZ("pipo_common_got_it", new String[0]), new IDqS33S0300000_31(c92158a6E, (C92158a6E) iDqS7S0400000_31.l2, (InterfaceC65784Pro<C76800UCe>) iDqS7S0400000_31.l3, (InterfaceC65784Pro<C76800UCe>) 3), null, null, C91869a1Z.LIZIZ, 3778);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$8(IDqS7S0400000_31 iDqS7S0400000_31) {
        C92284a8G eventSender = ((PIViewModel) iDqS7S0400000_31.l0).getEventSender();
        eventSender.getClass();
        eventSender.LJ(EnumC92042a4M.Back);
        if (o.LJ((Boolean) iDqS7S0400000_31.l1, Boolean.TRUE)) {
            ((InterfaceC65784Pro) iDqS7S0400000_31.l2).invoke();
        } else {
            C91706Zyw.LJIILL((C92145a61) iDqS7S0400000_31.l3, "available_methods", false);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$9(IDqS7S0400000_31 iDqS7S0400000_31) {
        ((InterfaceC91758Zzm) iDqS7S0400000_31.l0).LIZLLL(new IDqS33S0300000_31((ViewGroup) iDqS7S0400000_31.l1, (ViewGroup) iDqS7S0400000_31.l2, (ComposeView) iDqS7S0400000_31.l3, (InterfaceC65784Pro<C76800UCe>) 7));
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS7S0400000_31(InterfaceC70422pa interfaceC70422pa, InterfaceC70422pa interfaceC70422pa2, InterfaceC35811ar<Integer> interfaceC35811ar, List<C0ZJ> list, C05P c05p) {
        super(0);
        this.$t = c05p;
        this.l0 = interfaceC70422pa;
        this.l1 = interfaceC70422pa2;
        this.l2 = interfaceC35811ar;
        this.l3 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS7S0400000_31(InterfaceC70422pa interfaceC70422pa, InterfaceC70422pa interfaceC70422pa2, XKW xkw, C1ZD c1zd, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        super(0);
        this.$t = interfaceC65784Pro;
        this.l0 = interfaceC70422pa;
        this.l1 = interfaceC70422pa2;
        this.l2 = xkw;
        this.l3 = c1zd;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS7S0400000_31(InterfaceC65784Pro interfaceC65784Pro, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2, InterfaceC91938a2g<?> interfaceC91938a2g, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro3, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro4) {
        super(0);
        this.$t = interfaceC65784Pro4;
        this.l0 = interfaceC65784Pro;
        this.l1 = interfaceC65784Pro2;
        this.l2 = interfaceC91938a2g;
        this.l3 = interfaceC65784Pro3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS7S0400000_31(InterfaceC65784Pro interfaceC65784Pro, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2, View view, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro3, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro4) {
        super(0);
        this.$t = interfaceC65784Pro4;
        this.l0 = interfaceC65784Pro;
        this.l1 = interfaceC65784Pro2;
        this.l2 = view;
        this.l3 = interfaceC65784Pro3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS7S0400000_31(InterfaceC91758Zzm interfaceC91758Zzm, InterfaceC91758Zzm interfaceC91758Zzm2, ViewGroup viewGroup, ComposeView composeView, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        super(0);
        this.$t = interfaceC65784Pro;
        this.l0 = interfaceC91758Zzm;
        this.l1 = interfaceC91758Zzm2;
        this.l2 = viewGroup;
        this.l3 = composeView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS7S0400000_31(InterfaceC91961a33 interfaceC91961a33, InterfaceC91961a33 interfaceC91961a332, C92283a8F c92283a8F, InterfaceC88473Ynt<? super InterfaceC91961a33, ? super String, Object, C76800UCe> interfaceC88473Ynt, InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns) {
        super(0);
        this.$t = interfaceC88472Yns;
        this.l0 = interfaceC91961a33;
        this.l1 = interfaceC91961a332;
        this.l2 = c92283a8F;
        this.l3 = interfaceC88473Ynt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS7S0400000_31(C92283a8F c92283a8F, C92158a6E c92158a6E, InterfaceC70422pa interfaceC70422pa, InterfaceC65784Pro interfaceC65784Pro, int i) {
        super(0);
        this.$t = i;
        this.l0 = c92283a8F;
        this.l1 = c92158a6E;
        this.l2 = interfaceC70422pa;
        this.l3 = interfaceC65784Pro;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS7S0400000_31(C92283a8F c92283a8F, C92283a8F c92283a8F2, Methods methods, InterfaceC88472Yns<? super InterfaceC91961a33, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super String, ? super Boolean, C76800UCe> interfaceC88471Ynr) {
        super(0);
        this.$t = interfaceC88471Ynr;
        this.l0 = c92283a8F;
        this.l1 = c92283a8F2;
        this.l2 = methods;
        this.l3 = interfaceC88472Yns;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS7S0400000_31(PIViewModel pIViewModel, PIViewModel pIViewModel2, Boolean bool, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, C92145a61 c92145a61) {
        super(0);
        this.$t = c92145a61;
        this.l0 = pIViewModel;
        this.l1 = pIViewModel2;
        this.l2 = bool;
        this.l3 = interfaceC65784Pro;
    }
}
