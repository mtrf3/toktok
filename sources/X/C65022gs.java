package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.gift.render.utils.CoroutineHelper$runWithCoroutine$1", f = "CoroutineHelper.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2gs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C65022gs extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ Runnable LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C65022gs(Runnable runnable, InterfaceC67352kd<? super C65022gs> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = runnable;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C65022gs(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        this.LJLIL.run();
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
