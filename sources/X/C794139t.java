package X;

import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel$onSuccess$3", f = "ProfilePlatformViewModel.kt", l = {604}, m = "invokeSuspend")
/* renamed from: X.39t, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C794139t extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public C3GF LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ User LJLJI;
    public final /* synthetic */ ProfilePlatformViewModel LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C794139t(User user, ProfilePlatformViewModel profilePlatformViewModel, InterfaceC67352kd<? super C794139t> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = user;
        this.LJLJJI = profilePlatformViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C794139t(this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C3GF imUserService;
        IMUser fromUser;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLILLLLZI;
        String str = "";
        if (i != 0) {
            if (i == 1) {
                imUserService = this.LJLIL;
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            imUserService = IMService.createIIMServicebyMonsterPlugin(false).getImUserService();
            String uid = this.LJLJI.getUid();
            if (uid == null) {
                uid = "";
            }
            if (imUserService.LJIILL(uid) == null) {
                String uid2 = this.LJLJI.getUid();
                String secUid = this.LJLJI.getSecUid();
                this.LJLIL = imUserService;
                this.LJLILLLLZI = 1;
                obj = imUserService.LIZLLL(uid2, secUid, this);
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            return C76800UCe.LIZ;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        String uid3 = this.LJLJI.getUid();
        if (uid3 != null) {
            str = uid3;
        }
        imUserService.LJIIIZ(str, booleanValue);
        ProfilePlatformViewModel profilePlatformViewModel = this.LJLJJI;
        User user = this.LJLJI;
        profilePlatformViewModel.getClass();
        if (user == null) {
            fromUser = null;
        } else {
            fromUser = IMUser.fromUser(user);
        }
        imUserService.LJIIZILJ(fromUser);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
