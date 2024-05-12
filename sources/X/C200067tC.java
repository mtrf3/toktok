package X;

import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.RootData;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.viewmodel.BillboardGlobalViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.viewmodel.BillboardGlobalViewModel$setAutoDisplay$2", f = "BillboardGlobalViewModel.kt", l = {110, 112}, m = "invokeSuspend")
/* renamed from: X.7tC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C200067tC extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ BillboardGlobalViewModel LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ RootData LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C200067tC(RootData rootData, BillboardGlobalViewModel billboardGlobalViewModel, InterfaceC67352kd interfaceC67352kd, boolean z) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = billboardGlobalViewModel;
        this.LJLJI = z;
        this.LJLJJI = rootData;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C200067tC(this.LJLJJI, this.LJLILLLLZI, interfaceC67352kd, this.LJLJI);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C141335gf.LIZJ(obj);
                    return C76800UCe.LIZ;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C141335gf.LIZJ(obj);
        } else {
            C141335gf.LIZJ(obj);
            BillboardGlobalViewModel billboardGlobalViewModel = this.LJLILLLLZI;
            boolean z = this.LJLJI;
            this.LJLIL = 1;
            if (billboardGlobalViewModel.iv0(z, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        FSJ fsj = C36576EXc.LIZIZ;
        C200077tD c200077tD = new C200077tD(this.LJLJJI, this.LJLILLLLZI, null, this.LJLJI);
        this.LJLIL = 2;
        if (XKX.LJI(fsj, c200077tD, this) == enumC58928NAu) {
            return enumC58928NAu;
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
