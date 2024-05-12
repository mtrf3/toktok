package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel$getPreviewProduct$2", f = "PdpViewModel.kt", l = {1163}, m = "invokeSuspend")
/* renamed from: X.2tL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C72752tL extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ PdpViewModel LJLILLLLZI;
    public final /* synthetic */ Object LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C72752tL(PdpViewModel pdpViewModel, Object obj, InterfaceC67352kd<? super C72752tL> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = pdpViewModel;
        this.LJLJI = obj;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C72752tL(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            this.LJLIL = 1;
            if (C1JD.LIZJ(200L, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        PdpViewModel pdpViewModel = this.LJLILLLLZI;
        if (pdpViewModel.LLJI) {
            return C76800UCe.LIZ;
        }
        PdpViewModel.yx0(pdpViewModel, (ProductPackStruct) this.LJLJI, null, false, false, true, false, 80);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
