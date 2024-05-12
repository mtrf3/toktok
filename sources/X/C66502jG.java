package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.payment.bnpl.BnplMiddleActivity$showRetryDialog$1", f = "BnplMiddleActivity.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2jG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C66502jG extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C26231ARf LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C66502jG(C26231ARf c26231ARf, InterfaceC67352kd<? super C66502jG> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c26231ARf;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C66502jG(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        this.LJLIL.LIZLLL();
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
