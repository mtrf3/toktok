package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.deeplink.actions.base.BaseLinkAction$preRunBlock$2", f = "BaseLinkAction.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.LPw, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54224LPw extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd, Object> {
    public final /* synthetic */ AbstractC54341LUj<T> LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C54224LPw(AbstractC54341LUj<T> abstractC54341LUj, InterfaceC67352kd<? super C54224LPw> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = abstractC54341LUj;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C54224LPw(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        return null;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd interfaceC67352kd) {
        ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
        return null;
    }
}
