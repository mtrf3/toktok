package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.profile.aigc.ProfileAigcAvatarViewModel$showToast$3$1", f = "ProfileAigcAvatarViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2fo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C64362fo extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ ActivityC45651qj LJLIL;
    public final /* synthetic */ int LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C64362fo(ActivityC45651qj activityC45651qj, int i, InterfaceC67352kd<? super C64362fo> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = activityC45651qj;
        this.LJLILLLLZI = i;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C64362fo(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C26045AKb c26045AKb = new C26045AKb(this.LJLIL);
        c26045AKb.LJIIIIZZ(this.LJLILLLLZI);
        c26045AKb.LIZLLL(3000L);
        c26045AKb.LJIIJ();
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}