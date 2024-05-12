package X;

import com.bytedance.pipo.checkout.api.network.model.response.District;
import com.bytedance.pipo.checkout.element.component.business.address.AddressViewModel;
import fjb.a;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.pipo.checkout.element.component.business.address.AddressViewModel$dataInitializer$1$1", f = "AddressViewModel.kt", l = {223}, m = "invokeSuspend")
/* renamed from: X.aKc, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C93050aKc extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public Object LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ AddressViewModel LJLJI;
    public final /* synthetic */ District LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C93050aKc(AddressViewModel addressViewModel, District district, InterfaceC67352kd<? super C93050aKc> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = addressViewModel;
        this.LJLJJI = district;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C93050aKc(this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Integer geonameId;
        AddressViewModel addressViewModel;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLILLLLZI;
        if (i != 0) {
            if (i == 1) {
                addressViewModel = (AddressViewModel) this.LJLIL;
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            C41311jj<EnumC91763Zzr, District> c41311jj = this.LJLJI.LJLLLL;
            EnumC91763Zzr enumC91763Zzr = EnumC91763Zzr.CountryRegion;
            c41311jj.put(enumC91763Zzr, this.LJLJJI);
            InterfaceC35811ar interfaceC35811ar = (InterfaceC35811ar) ((LinkedHashMap) this.LJLJI.LJLZ).get(enumC91763Zzr);
            if (interfaceC35811ar != null) {
                District district = this.LJLJJI;
                if (district == null) {
                    geonameId = null;
                } else {
                    geonameId = district.getGeonameId();
                }
                interfaceC35811ar.setValue(geonameId);
            }
            InterfaceC88472Yns<List<District>, C76800UCe> interfaceC88472Yns = this.LJLJI.LJLJL.get(enumC91763Zzr);
            if (interfaceC88472Yns != null) {
                interfaceC88472Yns.invoke(C47261Igj.LJJIJ(this.LJLJJI));
            }
            District district2 = this.LJLJJI;
            if (district2 == null) {
                return null;
            }
            Iterator it = ((java.util.Map) this.LJLJI.LJLLILLLL.getValue()).entrySet().iterator();
            int i2 = 0;
            loop0: while (it.hasNext()) {
                i2++;
                Iterator it2 = ((List) ((Map.Entry) it.next()).getValue()).iterator();
                while (it2.hasNext()) {
                    if (o.LJ(((District) it2.next()).getGeonameId(), district2.getGeonameId())) {
                        break loop0;
                    }
                    i2++;
                }
                i2++;
            }
            addressViewModel = this.LJLJI;
            C32541Pm c32541Pm = addressViewModel.LJLL;
            this.LJLIL = addressViewModel;
            this.LJLILLLLZI = 1;
            if (C32541Pm.LJFF(c32541Pm, i2 - 1, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        addressViewModel.LJLLLLLL.put(EnumC91763Zzr.CountryRegion, Boolean.TRUE);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
