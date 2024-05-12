package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.common.controller.block.BlockUserController$updateBlockStatus$1", f = "BlockUserController.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.36P, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C36P extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C784636c LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36P(C784636c c784636c, InterfaceC67352kd<? super C36P> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c784636c;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C36P(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        this.LJLIL.LJLJJI.invoke();
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
