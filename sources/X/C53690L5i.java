package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.user.repository.UserState;
import kotlin.jvm.internal.o;

/* renamed from: X.L5i, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53690L5i extends AbstractC65781Prl implements InterfaceC88471Ynr<UserState, AbstractC26082ALm<? extends BaseResponse>, UserState> {
    public static final C53690L5i LJLIL = new C53690L5i();

    public C53690L5i() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final UserState invoke(UserState userState, AbstractC26082ALm<? extends BaseResponse> abstractC26082ALm) {
        UserState execute = userState;
        AbstractC26082ALm<? extends BaseResponse> res = abstractC26082ALm;
        o.LJIIIZ(execute, "$this$execute");
        o.LJIIIZ(res, "res");
        boolean z = res instanceof C163586bS;
        if (res instanceof C173936s9) {
            BaseResponse LIZ = res.LIZ();
            o.LJI(LIZ);
            if (LIZ.status_code == 0) {
                User user = ((RBX) HG3.LJIILL()).getCurUser();
                EY3 ey3 = EY3.LJLIL;
                if (C78841Uwv.LJJJ(user)) {
                    o.LJIIIIZZ(user, "user");
                    ey3.invoke(new C53417Kxp(user), new C53388KxM(user));
                } else {
                    o.LJIIIIZZ(user, "user");
                    ey3.invoke(new C53689L5h(user), new C53413Kxl(user));
                }
                return UserState.copy$default(execute, null, true, null, null, null, 29, null);
            }
        }
        if (!z) {
            return execute;
        }
        return UserState.copy$default(execute, null, false, null, null, ((C163586bS) res).LIZ, 15, null);
    }
}
