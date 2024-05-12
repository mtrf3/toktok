package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.im.core.internal.link.usecase.receivenewmessage.NewMsgNotifyUseCase$processResponseAndNotify$4", f = "NewMsgNotifyUseCase.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.OuK, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63392OuK extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C63385OuD LJLIL;
    public final /* synthetic */ C109544Rq LJLILLLLZI;
    public final /* synthetic */ C63210OrO LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C63392OuK(C63385OuD c63385OuD, C109544Rq c109544Rq, C63210OrO c63210OrO, InterfaceC67352kd<? super C63392OuK> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c63385OuD;
        this.LJLILLLLZI = c109544Rq;
        this.LJLJI = c63210OrO;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C63392OuK(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        this.LJLIL.LIZ(this.LJLILLLLZI, this.LJLJI.LIZJ);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
