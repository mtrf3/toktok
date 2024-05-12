package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.ecommerce.base.address.AddressPageStarter;
import com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListViewModel$clickAddAddressForResult$2", f = "AddressListViewModel.kt", l = {342}, m = "invokeSuspend")
/* renamed from: X.Aek, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26754Aek extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ AddressListViewModel LJLILLLLZI;
    public final /* synthetic */ Activity LJLJI;
    public final /* synthetic */ InterfaceC71003Rtn LJLJJI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26754Aek(AddressListViewModel addressListViewModel, Activity activity, InterfaceC71003Rtn interfaceC71003Rtn, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC67352kd<? super C26754Aek> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = addressListViewModel;
        this.LJLJI = activity;
        this.LJLJJI = interfaceC71003Rtn;
        this.LJLJJL = interfaceC65784Pro;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C26754Aek(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
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
            AddressListViewModel addressListViewModel = this.LJLILLLLZI;
            C26753Aej c26753Aej = new C26753Aej(addressListViewModel, this.LJLJI, this.LJLJJI, null);
            this.LJLIL = 1;
            obj = addressListViewModel.Qv0(c26753Aej, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        AddressPageStarter.AddressEvent addressEvent = (AddressPageStarter.AddressEvent) obj;
        if (addressEvent != null) {
            InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJLJJL;
            if (addressEvent.type == 0 && interfaceC65784Pro != null) {
                interfaceC65784Pro.invoke();
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
