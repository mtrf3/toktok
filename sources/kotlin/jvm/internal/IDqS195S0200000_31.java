package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C09290Yb;
import X.C1M1;
import X.C47261Igj;
import X.C70657RoD;
import X.C76800UCe;
import X.C91878a1i;
import X.C92060a4e;
import X.InterfaceC07790Sh;
import X.InterfaceC10180ac;
import X.InterfaceC24520xk;
import X.InterfaceC88474Ynu;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pipo.checkout.sdk.viewmodel.CheckoutUiState;
import com.bytedance.pipo.checkout.sdk.viewmodel.CheckoutViewModel;
import java.util.List;

/* loaded from: classes20.dex */
public class IDqS195S0200000_31 extends AbstractC65781Prl implements InterfaceC88474Ynu {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC88474Ynu
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
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
    public IDqS195S0200000_31(CheckoutViewModel checkoutViewModel, CheckoutUiState checkoutUiState, int i) {
        super(4);
        this.$t = i;
        this.l0 = checkoutViewModel;
        this.l1 = checkoutUiState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS195S0200000_31(List list, List list2, int i) {
        super(4);
        this.$t = i;
        this.l0 = list;
        this.l1 = list2;
    }

    public final void invoke$0(InterfaceC10180ac items, int i, InterfaceC24520xk interfaceC24520xk, int i2) {
        int i3;
        int i4;
        float f;
        float f2;
        int i5;
        int i6;
        int i7;
        int i8;
        o.LJIIIZ(items, "$this$items");
        if ((i2 & 14) == 0) {
            if (interfaceC24520xk.LJIJJ(items)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i3 = i8 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            if (interfaceC24520xk.LJIIIZ(i)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i3 |= i7;
        }
        if ((i3 & 731) != 146 || !interfaceC24520xk.LIZ()) {
            Object obj = ListProtector.get((List) this.l0, i);
            int i9 = (i3 & 112) | (i3 & 14);
            if ((i9 & 112) == 0) {
                if (interfaceC24520xk.LJIIIZ(i)) {
                    i6 = 32;
                } else {
                    i6 = 16;
                }
                i4 = i6 | i9;
            } else {
                i4 = i9;
            }
            if ((i9 & 896) == 0) {
                if (interfaceC24520xk.LJIJJ(obj)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i4 |= i5;
            }
            if (((i4 & 5841) ^ 1168) != 0 || !interfaceC24520xk.LIZ()) {
                C1M1 c1m1 = InterfaceC07790Sh.LJJJI;
                if (i == 0) {
                    f = 16;
                } else {
                    f = 0;
                }
                if (i != C47261Igj.LJJI((List) this.l1)) {
                    f2 = 6;
                } else {
                    f2 = 16;
                }
                C92060a4e.LIZ(obj, C09290Yb.LJIIL(C70657RoD.LJIL(c1m1, f, 0.0f, f2, 0.0f, 10), 32, 20), null, null, interfaceC24520xk, (i4 >> 6) & 14, 12);
                return;
            }
            interfaceC24520xk.LIZLLL();
            return;
        }
        interfaceC24520xk.LIZLLL();
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(IDqS195S0200000_31 iDqS195S0200000_31, Object obj, Object obj2, Object obj3, Object obj4) {
        iDqS195S0200000_31.invoke$0((InterfaceC10180ac) obj, ((Number) obj2).intValue(), (InterfaceC24520xk) obj3, ((Number) obj4).intValue());
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(IDqS195S0200000_31 iDqS195S0200000_31, Object checkoutRoutePage, Object it, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        o.LJIIIZ(checkoutRoutePage, "$this$checkoutRoutePage");
        o.LJIIIZ(it, "it");
        C91878a1i.LIZ(((CheckoutViewModel) iDqS195S0200000_31.l0).getEventSender(), false, ((CheckoutUiState) iDqS195S0200000_31.l1).getErrorCode(), new IDqS422S0100000_31((CheckoutViewModel) iDqS195S0200000_31.l0, 87), (InterfaceC24520xk) obj, 8, 2);
        return C76800UCe.LIZ;
    }
}
