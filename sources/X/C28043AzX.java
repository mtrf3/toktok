package X;

import Y.ARunnableS40S0100000_4;
import Y.AfS16S0210000_4;
import android.os.Handler;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.cart.repository.dto.AddItemToCartRequest;
import com.ss.android.ugc.aweme.ecommerce.base.cart.repository.dto.RecommendAfterAddRequest;
import java.util.HashMap;

/* renamed from: X.AzX, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28043AzX extends AbstractC73313Spx {
    public static final C28043AzX LJLJJLL = new C28043AzX();
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(C28040AzU.LJLIL);
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(C28042AzW.LJLIL);
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(C28041AzV.LJLIL);
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(C28044AzY.INSTANCE);

    public C28043AzX() {
        new HashMap();
    }

    public final C73454SsE LLLLZIL(RecommendAfterAddRequest recommendAfterAddRequest) {
        return ((R30) this.LJLJI.getValue()).LIZ(recommendAfterAddRequest).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ());
    }

    public final void LLLLZLLIL(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        ((Handler) this.LJLJJL.getValue()).post(new ARunnableS40S0100000_4((InterfaceC65784Pro) interfaceC65784Pro, 100));
    }

    public final C73454SsE LLLLZ(AddItemToCartRequest addItemToCartRequest, View view, View view2, boolean z, InterfaceC88471Ynr interfaceC88471Ynr, InterfaceC88472Yns interfaceC88472Yns) {
        return new C73338SqM(((R30) this.LJLILLLLZI.getValue()).LIZ(addItemToCartRequest).LJJL(T16.LIZ()).LJJIJL(new C28148B2y(view2, view, z, this, interfaceC88472Yns, interfaceC88471Ynr)).LJIJJ(new AfS16S0210000_4(view, this, 1)).LJIL(new InterfaceC64592gB() { // from class: X.9Eg
            @Override // X.InterfaceC64592gB
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }).LJJJJIZL()).LJJJ(C73969T1h.LIZIZ());
    }
}
