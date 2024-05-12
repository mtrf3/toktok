package X;

import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.platform.base.data.ProfileUser;
import com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel;
import kotlin.jvm.internal.AqS167S0100000_1;

/* renamed from: X.9Su, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C237249Su extends AbstractC65781Prl implements InterfaceC88473Ynt<Boolean, Throwable, ProfileUser, C76800UCe> {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ ProfilePlatformViewModel LJLJI;
    public final /* synthetic */ EnumC235129Kq LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C237249Su(long j, String str, ProfilePlatformViewModel profilePlatformViewModel, EnumC235129Kq enumC235129Kq) {
        super(3);
        this.LJLIL = j;
        this.LJLILLLLZI = str;
        this.LJLJI = profilePlatformViewModel;
        this.LJLJJI = enumC235129Kq;
    }

    @Override // X.InterfaceC88473Ynt
    public final C76800UCe invoke(Boolean bool, Throwable th, ProfileUser profileUser) {
        User user;
        Throwable th2 = th;
        ProfileUser profileUser2 = profileUser;
        try {
            if (bool.booleanValue() && profileUser2 != null) {
                C237259Sv.LJIIIZ(System.currentTimeMillis() - this.LJLIL, true);
                try {
                    user = this.LJLJI.LJLJJI;
                    long currentTimeMillis = System.currentTimeMillis();
                    if (user == null) {
                        user = new User();
                    }
                    C244699iz.LJIJJLI(profileUser2.common, user);
                    C244699iz.LJJIFFI(profileUser2.navBarComponents, user, false);
                    C244699iz.LJIL(profileUser2.headerComponents, user, false);
                    C244699iz.LJJIII(user, profileUser2, false);
                    C237259Sv.LIZJ(System.currentTimeMillis() - currentTimeMillis, "convert_data_new_2_old");
                } catch (Exception e) {
                    C237259Sv.LJ(e, C244699iz.LIZ);
                    user = null;
                }
                ProfilePlatformViewModel profilePlatformViewModel = this.LJLJI;
                profilePlatformViewModel.nv0(user, this.LJLJJI, profileUser2, profilePlatformViewModel.kv0());
            } else {
                C237259Sv.LJIIIZ(System.currentTimeMillis() - this.LJLIL, false);
                if (th2 == null) {
                    th2 = new Exception("data is null");
                }
                C237259Sv.LJIIJ(this.LJLILLLLZI, th2);
                this.LJLJI.setState(new AqS167S0100000_1(th2, 486));
            }
        } catch (Exception e2) {
            ProfilePlatformViewModel profilePlatformViewModel2 = this.LJLJI;
            User user2 = profilePlatformViewModel2.LJLJJI;
            C176956x1 c176956x1 = MF2.LIZ;
            if (c176956x1 != null) {
                c176956x1.LIZIZ(1);
            }
            C56483MEt.LIZJ(false, true);
            C73353Sqb.LIZJ().LIZJ();
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("to_user_id", profilePlatformViewModel2.kv0());
            c188727au.LJIIIZ("enter_from", profilePlatformViewModel2.iv0());
            c188727au.LIZLLL(0, "is_success");
            c188727au.LJIIIZ("fail_info", e2.getMessage());
            if (e2 instanceof C38333F2r) {
                C38333F2r c38333F2r = (C38333F2r) e2;
                c188727au.LJI("response", c38333F2r.getResponse());
                if (C9T4.LIZ() && (c38333F2r.getRawResponse() instanceof ProfileUser)) {
                    C221008ls.LIZJ(user2);
                }
            }
            java.util.Map<String, String> map = c188727au.LIZ;
            FMX.LJIIL("profile_request_response", map);
            C36922EeM.LIZLLL(4, "aweme/v1/user", map.toString());
            C237259Sv.LJIIIZ(System.currentTimeMillis() - this.LJLIL, false);
            C237259Sv.LJIIJ(this.LJLILLLLZI, e2);
            this.LJLJI.setState(new AqS167S0100000_1(e2, 487));
        }
        return C76800UCe.LIZ;
    }
}
