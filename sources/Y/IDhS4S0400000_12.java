package Y;

import X.C28043AzX;
import X.C78983UzD;
import X.InterfaceC48038ItG;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.RYJ;
import X.TBW;
import X.TMG;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.api.model.ButtonAction;
import com.ss.android.ugc.aweme.ecommerce.base.cart.repository.dto.BundleAddItemsToCartData;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS72S0400000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class IDhS4S0400000_12 implements InterfaceC48038ItG {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object obj) {
        switch (this.$t) {
            case 0:
                return apply$0(this, obj);
            case 1:
                return apply$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object apply$0(IDhS4S0400000_12 iDhS4S0400000_12, Object it) {
        o.LJIIJ(it, "it");
        return new TMG(((TBW) iDhS4S0400000_12.l1).get(it), ((TBW) iDhS4S0400000_12.l2).get(it));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object apply$1(IDhS4S0400000_12 iDhS4S0400000_12, Object obj) {
        BundleAddItemsToCartData bundleAddItemsToCartData;
        View view;
        RYJ it = (RYJ) obj;
        o.LJIIIZ(it, "it");
        BundleAddItemsToCartData bundleAddItemsToCartData2 = (BundleAddItemsToCartData) it.data;
        if (bundleAddItemsToCartData2 != null && bundleAddItemsToCartData2.exceptionUX != null && (view = (View) iDhS4S0400000_12.l0) != null) {
            ((C28043AzX) iDhS4S0400000_12.l1).LLLLZLLIL(new AqS72S0400000_12((InterfaceC88472Yns) iDhS4S0400000_12.l2, (InterfaceC88472Yns<? super RYJ, Boolean>) it, (RYJ) view, (View) iDhS4S0400000_12.l3, (InterfaceC88471Ynr<? super RYJ, ? super ButtonAction, Boolean>) 24));
        }
        if (!it.isCodeOK() && ((bundleAddItemsToCartData = (BundleAddItemsToCartData) it.data) == null || bundleAddItemsToCartData.exceptionUX == null)) {
            C78983UzD.LJIIZILJ(new RuntimeException("add cart bundle fail. code!=0 && exceptionUX == null"));
            C28043AzX c28043AzX = (C28043AzX) iDhS4S0400000_12.l1;
            View view2 = (View) iDhS4S0400000_12.l0;
            c28043AzX.getClass();
            if (view2 != null) {
                c28043AzX.LLLLZLLIL(new AqS162S0100000_12(view2, 1049));
            }
        }
        return it;
    }

    public IDhS4S0400000_12(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
    }
}
