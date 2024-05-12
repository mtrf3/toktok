package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C05P;
import X.C1ZD;
import X.C34K;
import X.C61878OQg;
import X.C76800UCe;
import X.C78613UtF;
import X.C91706Zyw;
import X.C91720ZzA;
import X.C92145a61;
import X.C93044aKW;
import X.InterfaceC65784Pro;
import X.InterfaceC70422pa;
import X.InterfaceC88472Yns;
import X.XKX;
import android.os.Bundle;
import android.view.View;
import androidx.navigation.NavBackStackEntry;
import com.bytedance.pipo.checkout.api.network.model.request.PaymentMethod;
import com.bytedance.pipo.checkout.sdk.viewmodel.PIViewModel;

/* loaded from: classes20.dex */
public class IDqS9S0400000_31 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
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

    public static final Object invoke$0(IDqS9S0400000_31 iDqS9S0400000_31, Object obj) {
        NavBackStackEntry it = (NavBackStackEntry) obj;
        o.LJIIIZ(it, "it");
        ((C34K) iDqS9S0400000_31.l0).element = true;
        ((C91706Zyw) iDqS9S0400000_31.l1).LIZ((C91720ZzA) iDqS9S0400000_31.l2, (Bundle) iDqS9S0400000_31.l3, it, C61878OQg.INSTANCE);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(IDqS9S0400000_31 iDqS9S0400000_31, Object obj) {
        ((InterfaceC88472Yns) iDqS9S0400000_31.l0).invoke(Integer.valueOf(((Number) obj).intValue()));
        XKX.LIZLLL((InterfaceC70422pa) iDqS9S0400000_31.l1, C78613UtF.LIZJ, null, new C93044aKW((C1ZD) iDqS9S0400000_31.l2, (InterfaceC65784Pro) iDqS9S0400000_31.l3, null), 2);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(IDqS9S0400000_31 iDqS9S0400000_31, Object obj) {
        PaymentMethod paymentMethod = (PaymentMethod) obj;
        o.LJIIIZ(paymentMethod, "paymentMethod");
        C05P c05p = (C05P) iDqS9S0400000_31.l0;
        if (c05p != null) {
            c05p.hide();
        }
        ((PIViewModel) iDqS9S0400000_31.l1).storePaymentMethod(paymentMethod, (C92145a61) iDqS9S0400000_31.l2, (View) iDqS9S0400000_31.l3);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS9S0400000_31(C05P c05p, PIViewModel pIViewModel, C92145a61 c92145a61, View view, int i) {
        super(1);
        this.$t = i;
        this.l0 = c05p;
        this.l1 = pIViewModel;
        this.l2 = c92145a61;
        this.l3 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS9S0400000_31(C34K c34k, C91706Zyw c91706Zyw, C91720ZzA c91720ZzA, Bundle bundle, int i) {
        super(1);
        this.$t = i;
        this.l0 = c34k;
        this.l1 = c91706Zyw;
        this.l2 = c91720ZzA;
        this.l3 = bundle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS9S0400000_31(InterfaceC88472Yns interfaceC88472Yns, InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns2, InterfaceC70422pa interfaceC70422pa, C1ZD c1zd, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        super(1);
        this.$t = interfaceC65784Pro;
        this.l0 = interfaceC88472Yns;
        this.l1 = interfaceC88472Yns2;
        this.l2 = interfaceC70422pa;
        this.l3 = c1zd;
    }
}
