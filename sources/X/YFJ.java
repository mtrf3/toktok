package X;

import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.widgets.awemepager.UserAwemePagerAssem;

/* loaded from: classes16.dex */
public final class YFJ implements MFC {
    public final /* synthetic */ UserAwemePagerAssem LIZ;

    public YFJ(UserAwemePagerAssem userAwemePagerAssem) {
        this.LIZ = userAwemePagerAssem;
    }

    @Override // X.MFC
    public final void LIZ(int i) {
        C80648Vky c80648Vky = this.LIZ.LJLJJL;
        if (c80648Vky != null) {
            c80648Vky.setCanScrollUp(true);
        }
        if (i == 0) {
            this.LIZ.X3().Jv0(false);
            this.LIZ.X3().Iv0(false);
        }
    }

    @Override // X.MFC
    public final void LIZIZ(int i, boolean z) {
        User mUser;
        C80648Vky c80648Vky = this.LIZ.LJLJJL;
        if (c80648Vky != null) {
            c80648Vky.setCanScrollUp(true);
        }
        if (i == 0) {
            this.LIZ.X3().Jv0(true);
            if (!z && C34172Db6.LIZ() && (mUser = this.LIZ.getMUser()) != null) {
                UserAwemePagerAssem userAwemePagerAssem = this.LIZ;
                if (mUser.getFollowerCount() < 1000 && mUser.getAccountType() != 2 && mUser.getAccountType() != 3) {
                    userAwemePagerAssem.LLILLIZIL = true;
                    if (mUser.getTabType() == 0 || AV1.LJIIZILJ(mUser, false)) {
                        InterfaceC57512Mhg interfaceC57512Mhg = (InterfaceC57512Mhg) C8VC.LJII(userAwemePagerAssem, C65352Pkq.LIZ(InterfaceC57512Mhg.class));
                        if (interfaceC57512Mhg != null) {
                            interfaceC57512Mhg.H7();
                        }
                        userAwemePagerAssem.LLILLIZIL = false;
                    }
                }
            }
            this.LIZ.X3().Iv0(true);
        }
    }
}
