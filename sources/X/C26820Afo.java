package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.address.AddressPageStarter;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import fjb.a;
import java.util.HashMap;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel$openAddressListPage$1$1", f = "PdpViewModel.kt", l = {4433}, m = "invokeSuspend")
/* renamed from: X.Afo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26820Afo extends AbstractC65782Prm implements InterfaceC88472Yns<InterfaceC67352kd<? super AddressPageStarter.AddressEvent>, Object> {
    public int LJLIL;
    public final /* synthetic */ View LJLILLLLZI;
    public final /* synthetic */ PdpViewModel LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26820Afo(View view, PdpViewModel pdpViewModel, InterfaceC67352kd<? super C26820Afo> interfaceC67352kd) {
        super(1, interfaceC67352kd);
        this.LJLILLLLZI = view;
        this.LJLJI = pdpViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(InterfaceC67352kd<?> interfaceC67352kd) {
        return new C26820Afo(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // X.InterfaceC88472Yns
    public final Object invoke(InterfaceC67352kd<? super AddressPageStarter.AddressEvent> interfaceC67352kd) {
        return ((a) create(interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Context context;
        String str;
        String str2;
        HashMap<String, Object> trackParams;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            View view = this.LJLILLLLZI;
            String str3 = null;
            if (view != null) {
                context = view.getContext();
            } else {
                context = null;
            }
            View view2 = this.LJLILLLLZI;
            if (view2 != null) {
                str = C79234V7u.LJJIJ(view2);
            } else {
                str = null;
            }
            IPdpStarter.PdpEnterParam pdpEnterParam = this.LJLJI.LJLJJLL;
            if (pdpEnterParam != null && (trackParams = pdpEnterParam.getTrackParams()) != null) {
                str2 = C27739Aud.LJI(trackParams);
            } else {
                str2 = null;
            }
            ProductPackStruct productPackStruct = this.LJLJI.LJLJLLL;
            if (productPackStruct != null) {
                str3 = productPackStruct.productId;
            }
            this.LJLIL = 1;
            C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(this));
            AddressPageStarter.LIZIZ = c84654XKg;
            AddressPageStarter.LIZLLL(context, str, str2, null, str3, null, 192);
            obj = c84654XKg.LIZ();
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }
}
