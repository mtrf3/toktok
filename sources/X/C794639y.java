package X;

import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.widgets.common.UserProfileInfoVM;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.profile.widgets.common.UserProfileInfoVM$onSuccess$4", f = "UserProfileInfoVM.kt", l = {173}, m = "invokeSuspend")
/* renamed from: X.39y, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C794639y extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public C3GF LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ User LJLJI;
    public final /* synthetic */ UserProfileInfoVM LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C794639y(User user, UserProfileInfoVM userProfileInfoVM, InterfaceC67352kd<? super C794639y> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = user;
        this.LJLJJI = userProfileInfoVM;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C794639y(this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C3GF imUserService;
        IMUser fromUser;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLILLLLZI;
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
            o.LJIIIIZZ(uid, "user.uid");
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
        o.LJIIIIZZ(uid3, "user.uid");
        imUserService.LJIIIZ(uid3, booleanValue);
        UserProfileInfoVM userProfileInfoVM = this.LJLJJI;
        User user = this.LJLJI;
        userProfileInfoVM.getClass();
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
