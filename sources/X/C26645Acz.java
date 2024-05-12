package X;

import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.address.api.AddressApi;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ModifyRequest;
import com.ss.android.ugc.aweme.ecommerce.global.address.list.GlobalAddressListViewModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.global.address.list.GlobalAddressListViewModel$setAddressAsDefault$1", f = "GlobalAddressListViewModel.kt", l = {59}, m = "invokeSuspend")
/* renamed from: X.Acz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26645Acz extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ Address LJLILLLLZI;
    public final /* synthetic */ GlobalAddressListViewModel LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26645Acz(Address address, GlobalAddressListViewModel globalAddressListViewModel, InterfaceC67352kd<? super C26645Acz> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = address;
        this.LJLJI = globalAddressListViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C26645Acz(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            C27096AkG c27096AkG = AddressApi.LIZ;
            String str = this.LJLILLLLZI.id;
            if (str == null) {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            this.LJLIL = 1;
            c27096AkG.getClass();
            obj = ((AddressApi) C27096AkG.LIZIZ.create(AddressApi.class)).modifyAddress(new ModifyRequest(str, 1), this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        if (((Response) obj).code == 0) {
            this.LJLJI.Lv0();
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
