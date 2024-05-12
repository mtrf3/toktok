package X;

import com.ss.android.ugc.aweme.im.sdk.common.data.model.ShareStateResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.common.data.service.IMUserService$updateShareStatus$1", f = "IMUserService.kt", l = {282, 286}, m = "invokeSuspend")
/* renamed from: X.2xU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C75322xU extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public User LJLIL;
    public ShareStateResponse.ShareUserStruct[] LJLILLLLZI;
    public int LJLJI;
    public final /* synthetic */ User LJLJJI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C75322xU(User user, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC67352kd<? super C75322xU> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJI = user;
        this.LJLJJL = interfaceC65784Pro;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C75322xU(this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        ShareStateResponse.ShareUserStruct[] shareUsers;
        User user;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLJI;
        try {
        } catch (Exception e) {
            C34B.LJ("updateShareStatus", e);
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    shareUsers = this.LJLILLLLZI;
                    user = this.LJLIL;
                    C141335gf.LIZJ(obj);
                    C81023Fy c81023Fy = C81023Fy.LJLIL;
                    String uid = user.getUid();
                    o.LJIIIIZZ(uid, "user.uid");
                    c81023Fy.LIZIZ(shareUsers[0].getShareStatus(), uid);
                    return C76800UCe.LIZ;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C141335gf.LIZJ(obj);
        } else {
            C141335gf.LIZJ(obj);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("[\"");
            LIZ.append(this.LJLJJI.getSecUid());
            LIZ.append("\"]");
            String LIZIZ = X1D.LIZIZ(LIZ);
            this.LJLJI = 1;
            obj = C793739p.LIZIZ.getShareUserCanSendMsg(LIZIZ, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        shareUsers = ((ShareStateResponse) obj).getShareUsers();
        if (shareUsers != null && shareUsers.length != 0 && (!false)) {
            user = this.LJLJJI;
            InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJLJJL;
            if (shareUsers[0].getShareStatus() == 1) {
                XIF xif = EXV.LIZ;
                C65572hl c65572hl = new C65572hl(interfaceC65784Pro, null);
                this.LJLIL = user;
                this.LJLILLLLZI = shareUsers;
                this.LJLJI = 2;
                if (XKX.LJI(xif, c65572hl, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            C81023Fy c81023Fy2 = C81023Fy.LJLIL;
            String uid2 = user.getUid();
            o.LJIIIIZZ(uid2, "user.uid");
            c81023Fy2.LIZIZ(shareUsers[0].getShareStatus(), uid2);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
