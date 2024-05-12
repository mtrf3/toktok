package X;

import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.api.model.ButtonAction;
import com.ss.android.ugc.aweme.ecommerce.base.cart.repository.dto.AddItemToCartData;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.CouponClaimSuccessEvent;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.Voucher;
import java.util.List;
import kotlin.jvm.internal.AqS72S0400000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.B2y, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28148B2y<T, R> implements InterfaceC48038ItG {
    public final /* synthetic */ View LJLIL;
    public final /* synthetic */ View LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ C28043AzX LJLJJI;
    public final /* synthetic */ InterfaceC88472Yns<C58045MqH, Boolean> LJLJJL;
    public final /* synthetic */ InterfaceC88471Ynr<C58045MqH, ButtonAction, Boolean> LJLJJLL;

    /* JADX WARN: Multi-variable type inference failed */
    public C28148B2y(View view, View view2, boolean z, C28043AzX c28043AzX, InterfaceC88472Yns<? super C58045MqH, Boolean> interfaceC88472Yns, InterfaceC88471Ynr<? super C58045MqH, ? super ButtonAction, Boolean> interfaceC88471Ynr) {
        this.LJLIL = view;
        this.LJLILLLLZI = view2;
        this.LJLJI = z;
        this.LJLJJI = c28043AzX;
        this.LJLJJL = interfaceC88472Yns;
        this.LJLJJLL = interfaceC88471Ynr;
    }

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object obj) {
        View view;
        AddItemToCartData addItemToCartData;
        List<Voucher> list;
        C58045MqH it = (C58045MqH) obj;
        o.LJIIIZ(it, "it");
        if (it.isCodeOK()) {
            view = this.LJLIL;
        } else {
            view = this.LJLILLLLZI;
        }
        AddItemToCartData addItemToCartData2 = (AddItemToCartData) it.data;
        if (addItemToCartData2 != null && (list = addItemToCartData2.autoVouchers) != null) {
            C26059AKp.LIZ().LIZ("ec_vouchers_claim_success_event", C27739Aud.LJI(new CouponClaimSuccessEvent(C27739Aud.LJI(list))));
        }
        AddItemToCartData addItemToCartData3 = (AddItemToCartData) it.data;
        if (addItemToCartData3 != null && addItemToCartData3.exceptionUX != null && view != null && (!it.isCodeOK() || this.LJLJI)) {
            this.LJLJJI.LLLLZLLIL(new AqS72S0400000_12((InterfaceC88472Yns) this.LJLJJL, (InterfaceC88472Yns<? super C58045MqH, Boolean>) it, (C58045MqH) view, (View) this.LJLJJLL, (InterfaceC88471Ynr<? super C58045MqH, ? super ButtonAction, Boolean>) 23));
        }
        if (it.isCodeOK() || ((addItemToCartData = (AddItemToCartData) it.data) != null && addItemToCartData.exceptionUX != null)) {
            return it;
        }
        throw new RuntimeException("data error");
    }
}
