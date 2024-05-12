package X;

import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel$updateMafFor$1", f = "ProfilePlatformViewModel.kt", l = {670}, m = "invokeSuspend")
/* renamed from: X.398, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass398 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ User LJLILLLLZI;
    public final /* synthetic */ ProfilePlatformViewModel LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass398(User user, ProfilePlatformViewModel profilePlatformViewModel, InterfaceC67352kd<? super AnonymousClass398> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = user;
        this.LJLJI = profilePlatformViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new AnonymousClass398(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            User user = this.LJLILLLLZI;
            String iv0 = this.LJLJI.iv0();
            if (iv0 == null) {
                iv0 = "";
            }
            this.LJLIL = 1;
            if (AnonymousClass396.LIZ(user, iv0, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
