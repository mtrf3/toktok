package X;

import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.RootData;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.viewmodel.BillboardGlobalViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.viewmodel.BillboardGlobalViewModel$setAutoDisplay$2$1", f = "BillboardGlobalViewModel.kt", l = {114}, m = "invokeSuspend")
/* renamed from: X.7tD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C200077tD extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ BillboardGlobalViewModel LJLILLLLZI;
    public final /* synthetic */ RootData LJLJI;
    public final /* synthetic */ boolean LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C200077tD(RootData rootData, BillboardGlobalViewModel billboardGlobalViewModel, InterfaceC67352kd interfaceC67352kd, boolean z) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = billboardGlobalViewModel;
        this.LJLJI = rootData;
        this.LJLJJI = z;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C200077tD(this.LJLJI, this.LJLILLLLZI, interfaceC67352kd, this.LJLJJI);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        try {
            if (i != 0) {
                if (i == 1) {
                    C141335gf.LIZJ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C141335gf.LIZJ(obj);
                C71534S5q c71534S5q = this.LJLILLLLZI.LJLILLLLZI.LIZIZ;
                String str = this.LJLJI.authorId;
                boolean z = this.LJLJJI;
                this.LJLIL = 1;
                if (c71534S5q.LJLIL.LIZ.updateBillboardSettings(str, z, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
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
