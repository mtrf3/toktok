package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.common.ui.avatar.DMAvatarResManager$refreshUserInfoFromNet$2$onQueryError$1", f = "DMAvatarResManager.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.3fR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C89613fR extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C89593fP LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C89613fR(C89593fP c89593fP, String str, int i, InterfaceC67352kd<? super C89613fR> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c89593fP;
        this.LJLILLLLZI = str;
        this.LJLJI = i;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C89613fR(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        this.LJLIL.LJFF(this.LJLJI - 1, this.LJLILLLLZI);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}