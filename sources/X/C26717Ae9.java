package X;

import Y.IDxS305S0100000_4;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.address.api.AddressApi;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandInputDataOptions;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandInputRequest;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel$getCandInputOptionsReal$1", f = "AddressEditViewModel.kt", l = {893}, m = "invokeSuspend")
/* renamed from: X.Ae9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26717Ae9 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ AddressEditViewModel LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ Address LJLJJI;
    public final /* synthetic */ InterfaceC88472Yns<CandInputDataOptions, C76800UCe> LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C26717Ae9(AddressEditViewModel addressEditViewModel, String str, Address address, InterfaceC88472Yns<? super CandInputDataOptions, C76800UCe> interfaceC88472Yns, InterfaceC67352kd<? super C26717Ae9> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = addressEditViewModel;
        this.LJLJI = str;
        this.LJLJJI = address;
        this.LJLJJL = interfaceC88472Yns;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C26717Ae9(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C141335gf.LIZJ(obj);
            } else {
                C141335gf.LIZJ(obj);
                AddressEditViewModel addressEditViewModel = this.LJLILLLLZI;
                CandInputRequest candInputRequest = new CandInputRequest(this.LJLJI, this.LJLJJI, null, 4, null);
                this.LJLIL = 1;
                addressEditViewModel.getClass();
                C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(this));
                AddressApi.LIZ.getClass();
                C27096AkG.LJ(candInputRequest).LJJL(T16.LIZ()).LIZ(new IDxS305S0100000_4(c84654XKg, 19));
                obj = c84654XKg.LIZ();
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            C64797Pbt c64797Pbt = (C64797Pbt) obj;
            if (((Response) c64797Pbt.LIZIZ).isCodeOK()) {
                this.LJLJJL.invoke((CandInputDataOptions) ((Response) c64797Pbt.LIZIZ).data);
            }
        } catch (Throwable unused) {
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
