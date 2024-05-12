package X;

import com.bytedance.pipo.checkout.api.network.model.response.District;
import com.bytedance.pipo.checkout.element.component.business.address.AddressViewModel;
import fjb.a;
import java.util.LinkedHashMap;

@InterfaceC65848Psq(c = "com.bytedance.pipo.checkout.element.component.business.address.AddressViewModel$dataInitializer$1$2", f = "AddressViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.aKd, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C93051aKd extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ AddressViewModel LJLIL;
    public final /* synthetic */ District LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C93051aKd(AddressViewModel addressViewModel, District district, InterfaceC67352kd<? super C93051aKd> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = addressViewModel;
        this.LJLILLLLZI = district;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C93051aKd(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Integer geonameId;
        C141335gf.LIZJ(obj);
        C41311jj<EnumC91763Zzr, District> c41311jj = this.LJLIL.LJLLLL;
        EnumC91763Zzr enumC91763Zzr = EnumC91763Zzr.CountryRegion;
        c41311jj.put(enumC91763Zzr, this.LJLILLLLZI);
        InterfaceC35811ar interfaceC35811ar = (InterfaceC35811ar) ((LinkedHashMap) this.LJLIL.LJLZ).get(enumC91763Zzr);
        if (interfaceC35811ar != null) {
            District district = this.LJLILLLLZI;
            if (district == null) {
                geonameId = null;
            } else {
                geonameId = district.getGeonameId();
            }
            interfaceC35811ar.setValue(geonameId);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
