package X;

import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.viewmodel.BillboardGlobalViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.viewmodel.BillboardGlobalViewModel$updateEffectAutoDisplayStatus$lastEffectImage$1", f = "BillboardGlobalViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.S6i, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71552S6i extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super String>, Object> {
    public final /* synthetic */ BillboardGlobalViewModel LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71552S6i(BillboardGlobalViewModel billboardGlobalViewModel, InterfaceC67352kd<? super C71552S6i> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = billboardGlobalViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C71552S6i(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C71559S6p LJJJIL = C71554S6k.LJJJIL();
        if (LJJJIL != null) {
            return LJJJIL.LJLJJI;
        }
        return null;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super String> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
