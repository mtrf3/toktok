package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.helper.SocialRecFriendsDialogHelper$2", f = "SocialRecFriendsDialogHelper.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes10.dex */
public final class LTM extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ UPK LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LTM(UPK upk, InterfaceC67352kd<? super LTM> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = upk;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new LTM(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        this.LJLIL.LJIIIIZZ();
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}