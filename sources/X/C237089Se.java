package X;

import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.UserResponse;
import com.ss.android.ugc.aweme.profile.widgets.common.MineProfileInfoVM;
import fjb.a;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.AqS170S0100000_4;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.profile.widgets.common.MineProfileInfoVM$getUserInfo$1", f = "MineProfileInfoVM.kt", l = {C61447O9r.LJIIJ}, m = "invokeSuspend")
/* renamed from: X.9Se, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C237089Se extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public long LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ MineProfileInfoVM LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ long LJLJJL;
    public final /* synthetic */ EnumC235129Kq LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C237089Se(MineProfileInfoVM mineProfileInfoVM, int i, long j, EnumC235129Kq enumC235129Kq, InterfaceC67352kd<? super C237089Se> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = mineProfileInfoVM;
        this.LJLJJI = i;
        this.LJLJJL = j;
        this.LJLJJLL = enumC235129Kq;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C237089Se(this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        long currentTimeMillis;
        User user;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLILLLLZI;
        try {
            if (i != 0) {
                if (i == 1) {
                    currentTimeMillis = this.LJLIL;
                    C141335gf.LIZJ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C141335gf.LIZJ(obj);
                currentTimeMillis = System.currentTimeMillis();
                InterfaceC237099Sf interfaceC237099Sf = (InterfaceC237099Sf) this.LJLJI.LJLIL.getValue().getOperator();
                int i2 = this.LJLJJI;
                this.LJLIL = currentTimeMillis;
                this.LJLILLLLZI = 1;
                obj = interfaceC237099Sf.LJLLL(i2);
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            UserResponse userResponse = (UserResponse) obj;
            C237259Sv.LJIIIZ(System.currentTimeMillis() - currentTimeMillis, true);
            if (userResponse == null) {
                user = null;
            } else {
                user = userResponse.getUser();
            }
            this.LJLJI.getClass();
            MineProfileInfoVM.gv0(user);
            C56483MEt.LIZJ(true, true);
            ((RBX) HG3.LJIILL()).updateCurUser(user);
            this.LJLJI.setState(new AqS135S0200000_4(user, this.LJLJJLL, 221));
            if (user != null) {
                L6F.LIZIZ.LIZLLL(L61.STORY, EnumC53719L6l.PROFILE, C47261Igj.LJJIJ(user), new AqS170S0100000_4(user, 1228));
            }
        } catch (Exception e) {
            C237259Sv.LJIIIZ(System.currentTimeMillis() - this.LJLJJL, false);
            this.LJLJI.getClass();
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("to_user_id", ((RBX) HG3.LJIILL()).getCurUserId());
            c188727au.LJIIIZ("enter_from", "personal_homepage");
            c188727au.LIZLLL(0, "is_success");
            c188727au.LJIIIZ("fail_info", e.getMessage());
            if (e instanceof C38333F2r) {
                c188727au.LJI("response", ((C38333F2r) e).getResponse());
            }
            java.util.Map<String, String> map = c188727au.LIZ;
            FMX.LJIIL("profile_request_response", map);
            C36922EeM.LIZLLL(4, "aweme/v1/user", map.toString());
            C56483MEt.LIZJ(false, true);
            this.LJLJI.setState(new AqS170S0100000_4(e, 1229));
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
