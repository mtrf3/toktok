package X;

import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.address.AddressPageStarter;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel$openAddressEditPage$1", f = "PdpViewModel.kt", l = {4407}, m = "invokeSuspend")
/* renamed from: X.Afn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26819Afn extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ PdpViewModel LJLILLLLZI;
    public final /* synthetic */ View LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26819Afn(View view, PdpViewModel pdpViewModel, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = pdpViewModel;
        this.LJLJI = view;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C26819Afn(this.LJLJI, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
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
            PdpViewModel pdpViewModel = this.LJLILLLLZI;
            C26818Afm c26818Afm = new C26818Afm(this.LJLJI, pdpViewModel, null);
            this.LJLIL = 1;
            obj = pdpViewModel.Nw0(this, c26818Afm, true);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        AddressPageStarter.AddressEvent addressEvent = (AddressPageStarter.AddressEvent) obj;
        if (addressEvent != null) {
            PdpViewModel pdpViewModel2 = this.LJLILLLLZI;
            if (addressEvent.type == 0) {
                PdpViewModel.bx0(pdpViewModel2, false, true, addressEvent.addressId, null, 16);
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
