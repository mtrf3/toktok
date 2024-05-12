package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.platform.base.data.ProfileUser;
import com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel;
import java.util.ArrayList;
import kotlin.jvm.internal.AqS132S0200000_1;
import kotlin.jvm.internal.AqS170S0100000_4;

/* renamed from: X.9Ss, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C237229Ss extends AbstractC65781Prl implements InterfaceC88473Ynt<Boolean, Throwable, ProfileUser, C76800UCe> {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ ProfilePlatformViewModel LJLJI;
    public final /* synthetic */ ArrayList<String> LJLJJI;
    public final /* synthetic */ EnumC235129Kq LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C237229Ss(long j, String str, ProfilePlatformViewModel profilePlatformViewModel, ArrayList<String> arrayList, EnumC235129Kq enumC235129Kq) {
        super(3);
        this.LJLIL = j;
        this.LJLILLLLZI = str;
        this.LJLJI = profilePlatformViewModel;
        this.LJLJJI = arrayList;
        this.LJLJJL = enumC235129Kq;
    }

    @Override // X.InterfaceC88473Ynt
    public final C76800UCe invoke(Boolean bool, Throwable th, ProfileUser profileUser) {
        User user;
        Throwable th2 = th;
        ProfileUser profileUser2 = profileUser;
        try {
            if (bool.booleanValue() && profileUser2 != null) {
                C237259Sv.LJIIIZ(System.currentTimeMillis() - this.LJLIL, true);
                C237409Tk.LIZJ(profileUser2);
                try {
                    user = C244699iz.LJJIIJ(profileUser2);
                } catch (Exception e) {
                    C237259Sv.LJ(e, C244699iz.LIZ);
                    user = null;
                }
                SettingsManager.LIZLLL().getClass();
                if (!SettingsManager.LIZ("profile_platform_legacy_migrate", false) && user != null) {
                    ((RBX) HG3.LJIILL()).updateCurUser(user);
                }
                C237259Sv.LJIIJJI();
                this.LJLJI.setState(new AqS132S0200000_1(profileUser2, this.LJLJJL, 101));
                SettingsManager.LIZLLL().getClass();
                if (!SettingsManager.LIZ("profile_platform_legacy_migrate", false)) {
                    User curUser = AccountService.LJIJ().LJFF().getCurUser();
                    L6F.LIZIZ.LIZLLL(L61.STORY, EnumC53719L6l.PROFILE, C47261Igj.LJJIJ(curUser), new AqS170S0100000_4(curUser, 1636));
                }
                ProfilePlatformViewModel profilePlatformViewModel = this.LJLJI;
                ArrayList<String> arrayList = this.LJLJJI;
                profilePlatformViewModel.getClass();
                ProfilePlatformViewModel.tv0("self", arrayList);
            } else {
                C237259Sv.LJIIIZ(System.currentTimeMillis() - this.LJLIL, false);
                if (th2 == null) {
                    th2 = new Exception("data is null");
                }
                C237259Sv.LJIIJ(this.LJLILLLLZI, th2);
                XKX.LIZLLL(C48841JEv.LIZ(C36636EZk.LIZ), null, null, new AnonymousClass399(this.LJLJI, th2, null), 3);
                ProfilePlatformViewModel profilePlatformViewModel2 = this.LJLJI;
                ArrayList<String> arrayList2 = this.LJLJJI;
                profilePlatformViewModel2.getClass();
                ProfilePlatformViewModel.tv0("self_error", arrayList2);
            }
        } catch (Exception e2) {
            ProfilePlatformViewModel profilePlatformViewModel3 = this.LJLJI;
            ArrayList<String> arrayList3 = this.LJLJJI;
            profilePlatformViewModel3.getClass();
            ProfilePlatformViewModel.tv0("self_error", arrayList3);
            C237259Sv.LJIIIZ(System.currentTimeMillis() - this.LJLIL, false);
            C237259Sv.LJIIJ(this.LJLILLLLZI, e2);
            XKX.LIZLLL(C48841JEv.LIZ(C36636EZk.LIZ), null, null, new C39A(this.LJLJI, e2, null), 3);
        }
        return C76800UCe.LIZ;
    }
}
