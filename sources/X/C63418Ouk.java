package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.im.core.internal.link.usecase.sendmsg.SendMsgUseCase$Companion$sendWithCallback$3", f = "SendMsgUseCase.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.Ouk, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63418Ouk extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ InterfaceC86963bA<C109544Rq> LJLIL;
    public final /* synthetic */ C63623Oy3 LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C63418Ouk(InterfaceC86963bA<C109544Rq> interfaceC86963bA, C63623Oy3 c63623Oy3, InterfaceC67352kd<? super C63418Ouk> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = interfaceC86963bA;
        this.LJLILLLLZI = c63623Oy3;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C63418Ouk(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        this.LJLIL.LIZIZ(this.LJLILLLLZI);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}