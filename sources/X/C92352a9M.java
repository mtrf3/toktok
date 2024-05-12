package X;

import com.bytedance.pipo.checkout.api.network.model.response.CashierOptionList;
import com.bytedance.pipo.checkout.api.network.model.response.Elements;
import java.util.List;
import kotlin.jvm.internal.IDqS418S0100000_31;

/* renamed from: X.a9M, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92352a9M extends C92219a7D {
    public C92352a9M() {
        throw null;
    }

    public C92352a9M(Elements elements, InterfaceC88472Yns interfaceC88472Yns) {
        super(elements, null, true, null, interfaceC88472Yns, null, null, 438);
        Object LJLLJ;
        String value;
        List<CashierOptionList> cashierOptionList = this.LIZ.getCashierOptionList();
        if (cashierOptionList == null && (cashierOptionList = this.LIZ.getOptionList()) == null) {
            return;
        }
        if (cashierOptionList.isEmpty()) {
            LJLLJ = null;
        } else {
            LJLLJ = ORZ.LJLLJ(cashierOptionList);
        }
        CashierOptionList cashierOptionList2 = (CashierOptionList) LJLLJ;
        if (cashierOptionList2 == null || (value = cashierOptionList2.getValue()) == null) {
            return;
        }
        ((IDqS418S0100000_31) this.LJIILL).invoke(value);
        LJIIL();
    }
}
