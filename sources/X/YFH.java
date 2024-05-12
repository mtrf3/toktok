package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.platform.business.header.business.recommend.business.base.IHeaderRecommendUserCardAbility;
import com.ss.android.ugc.profile.platform.business.tabs.container.other.UserAwemePagerAssemV2;

/* loaded from: classes16.dex */
public final class YFH implements MFC {
    public final /* synthetic */ UserAwemePagerAssemV2 LIZ;

    public YFH(UserAwemePagerAssemV2 userAwemePagerAssemV2) {
        this.LIZ = userAwemePagerAssemV2;
    }

    @Override // X.MFC
    public final void LIZ(int i) {
        C80648Vky c80648Vky = this.LIZ.LJLJL;
        if (c80648Vky != null) {
            c80648Vky.setCanScrollUp(true);
        }
        if (i == 0) {
            this.LIZ.k4().Jv0(false);
            this.LIZ.k4().Iv0(false);
        }
    }

    @Override // X.MFC
    public final void LIZIZ(int i, boolean z) {
        User user;
        IHeaderRecommendUserCardAbility iHeaderRecommendUserCardAbility;
        C80648Vky c80648Vky = this.LIZ.LJLJL;
        if (c80648Vky != null) {
            c80648Vky.setCanScrollUp(true);
        }
        if (i == 0) {
            this.LIZ.k4().Jv0(true);
            if (!z && C34172Db6.LIZ() && (user = this.LIZ.getUser()) != null) {
                UserAwemePagerAssemV2 userAwemePagerAssemV2 = this.LIZ;
                if (user.getFollowerCount() < 1000 && user.getAccountType() != 2 && user.getAccountType() != 3) {
                    userAwemePagerAssemV2.LLILLJJLI = true;
                    if (user.getTabType() == 0 || AV1.LJIIZILJ(user, false)) {
                        if (!C235099Kn.LIZ()) {
                            InterfaceC57512Mhg interfaceC57512Mhg = (InterfaceC57512Mhg) C8VC.LJII(userAwemePagerAssemV2, C65352Pkq.LIZ(InterfaceC57512Mhg.class));
                            if (interfaceC57512Mhg != null) {
                                interfaceC57512Mhg.H7();
                            }
                        } else {
                            Fragment LIZLLL = C212428Vi.LIZLLL(userAwemePagerAssemV2);
                            if (LIZLLL != null && (iHeaderRecommendUserCardAbility = (IHeaderRecommendUserCardAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(LIZLLL, null), IHeaderRecommendUserCardAbility.class, null)) != null) {
                                iHeaderRecommendUserCardAbility.H7();
                            }
                        }
                        userAwemePagerAssemV2.LLILLJJLI = false;
                    }
                }
            }
            this.LIZ.k4().Iv0(true);
        }
    }
}
