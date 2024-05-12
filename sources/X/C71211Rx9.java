package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommercelive.common.popcard.AbsECLiveExplanationCardWidget$onMessage$3", f = "AbsECLiveExplanationCardWidget.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.Rx9, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71211Rx9 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ AbstractC71187Rwl LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71211Rx9(AbstractC71187Rwl abstractC71187Rwl, InterfaceC67352kd<? super C71211Rx9> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = abstractC71187Rwl;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C71211Rx9(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        AbstractC71187Rwl.LJJIII(this.LJLIL, false, null, false, 6);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
