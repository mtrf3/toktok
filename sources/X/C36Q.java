package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.common.controller.block.BlockUserController$onPostBlock$2", f = "BlockUserController.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.36Q, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C36Q extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C784636c LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36Q(C784636c c784636c, InterfaceC67352kd<? super C36Q> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c784636c;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C36Q(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C784636c c784636c = this.LJLIL;
        c784636c.LJLJJL.invoke(c784636c.LJLILLLLZI);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
