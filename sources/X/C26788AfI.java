package X;

import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.shipping.PdpDeliveryHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShippingService;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.module.shipping.PdpDeliveryHolder$handleShippingService$2", f = "PdpDeliveryHolder.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.AfI, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26788AfI extends AbstractC65782Prm implements InterfaceC88473Ynt<InterfaceC70422pa, View, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ PdpDeliveryHolder LJLIL;
    public final /* synthetic */ C27127Akl LJLILLLLZI;
    public final /* synthetic */ ShippingService LJLJI;
    public final /* synthetic */ View LJLJJI;
    public final /* synthetic */ C5H3<PdpViewModel> LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C26788AfI(PdpDeliveryHolder pdpDeliveryHolder, C27127Akl c27127Akl, ShippingService shippingService, View view, C5H3<? extends PdpViewModel> c5h3, InterfaceC67352kd<? super C26788AfI> interfaceC67352kd) {
        super(3, interfaceC67352kd);
        this.LJLIL = pdpDeliveryHolder;
        this.LJLILLLLZI = c27127Akl;
        this.LJLJI = shippingService;
        this.LJLJJI = view;
        this.LJLJJL = c5h3;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        PdpDeliveryHolder pdpDeliveryHolder = this.LJLIL;
        C78565UsT.LJJIJIIJIL(pdpDeliveryHolder.LJLIL, new C26787AfH(pdpDeliveryHolder, this.LJLJI, this.LJLJJI, null));
        C70414RkI c70414RkI = this.LJLJJL.getValue().LLFII;
        if (c70414RkI != null) {
            C70414RkI.LJJJIL(c70414RkI, "logistics", this.LJLILLLLZI, "shipping_rights", null, 24);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88473Ynt
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, View view, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return new C26788AfI(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd).invokeSuspend(C76800UCe.LIZ);
    }
}
