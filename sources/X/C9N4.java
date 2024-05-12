package X;

import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.platform.base.data.ProfileUser;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.profile.platform.base.OldUserAndProfileUserAdapter$transformToProfileUser$2", f = "OldUserAndProfileUserAdapter.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.9N4, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9N4 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ User LJLIL;
    public final /* synthetic */ ProfileUser LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9N4(User user, ProfileUser profileUser, boolean z, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC67352kd<? super C9N4> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = user;
        this.LJLILLLLZI = profileUser;
        this.LJLJI = z;
        this.LJLJJI = interfaceC65784Pro;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C9N4(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C244699iz.LIZLLL(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
