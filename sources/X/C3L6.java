package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.common.controller.core.refactor.datasource.MessageRequestDataSource$refresh$1", f = "MessageRequestDataSource.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.3L6, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3L6 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C82283Ku LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3L6(C82283Ku c82283Ku, InterfaceC67352kd<? super C3L6> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c82283Ku;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C3L6(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C81843Jc.LIZJ("SessionRefactor-MessageRequestDataSource", "refresh");
        this.LJLIL.LJIIZILJ();
        C31N.LIZ();
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}