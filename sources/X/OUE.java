package X;

import android.app.Activity;
import android.os.Bundle;
import com.ss.android.ugc.aweme.compliance.consent.serviceimpl.PNSDeviceConsentServiceImpl;
import com.ss.android.ugc.aweme.feed.spi.CommonFeedServiceImpl;
import com.ss.android.ugc.aweme.friends.service.ISocialFriendsService;
import com.ss.android.ugc.aweme.recommend.users.IRecommendUsersServiceImpl;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.util.ArrayList;
import java.util.Iterator;
import yq4.a;

/* loaded from: classes11.dex */
public final /* synthetic */ class OUE implements C10I {
    public final /* synthetic */ Bundle LIZ;

    public /* synthetic */ OUE(Bundle bundle) {
        this.LIZ = bundle;
    }

    @Override // X.C10I
    public final Object then(C10K c10k) {
        final Bundle bundle = this.LIZ;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new OUM() { // from class: X.OUL
            @Override // X.OUM
            public final void LIZ(Bundle bundle2) {
                Bundle bundle3 = bundle;
                if (bundle2 == null) {
                    bundle2 = bundle3;
                }
                a.LJIJJ().LIZ();
                PNSDeviceConsentServiceImpl.LJI().LIZ();
                if (C40534FvW.LIZ()) {
                    a.LIZIZ().LIZLLL();
                    if (!R41.LJ().toRecoverDeletedAccount("enter_from_login_ui_routine")) {
                        OUG.LIZ(bundle2);
                        return;
                    }
                    return;
                }
                if (((RBX) HG3.LJIILL()).getCurUser().isUserCancelled()) {
                    return;
                }
                OUG.LIZ(bundle2);
            }
        });
        if (C40534FvW.LIZ()) {
            arrayList.add(new OU6(bundle));
        }
        arrayList.add(new OUM() { // from class: X.OU7
            @Override // X.OUM
            public final void LIZ(Bundle bundle2) {
                String str;
                Bundle bundle3 = bundle2;
                Bundle bundle4 = bundle;
                if (bundle3 == null) {
                    bundle3 = bundle4;
                }
                int i = bundle3.getInt("kr_marketing_notification_operation", 0);
                if (i != 0) {
                    C188727au c188727au = new C188727au();
                    if (i == 2) {
                        str = "on";
                    } else {
                        str = "off";
                    }
                    c188727au.LJIIIZ("trending", str);
                    FMX.LJIIL("tns_trending_setting", c188727au.LIZ);
                    a.LJIIL().LIZ("kr_consent_market_message", "v20200629", "bottom", null, Integer.valueOf(i), 0, Boolean.FALSE, null, null);
                }
                OUG.LIZ(bundle3);
            }
        });
        arrayList.add(new OUM() { // from class: X.OUF
            @Override // X.OUM
            public final void LIZ(Bundle bundle2) {
                Bundle bundle3 = bundle;
                if (bundle2 == null) {
                    bundle2 = bundle3;
                }
                IRecommendUsersServiceImpl.LJIIIZ().LJIIIIZZ("login");
                if (CommonFeedServiceImpl.LJJIJLIJ().LJJIJ() || CommonFeedServiceImpl.LJJIJLIJ().LJJIIZI()) {
                    R41.LIZJ();
                    if (R41.LIZJ().getSecUid() != null) {
                        CommonFeedServiceImpl.LJJIJLIJ().LJIJ(R41.LIZJ().getSecUid());
                    }
                } else if (bundle2.getBoolean("need_restart", false)) {
                    CommonFeedServiceImpl.LJJIJLIJ().LJIIIIZZ();
                } else {
                    R41.LIZJ();
                    if (R41.LIZJ().getSecUid() != null) {
                        CommonFeedServiceImpl.LJJIJLIJ().LJIJ(R41.LIZJ().getSecUid());
                    }
                }
                OUG.LIZ(bundle2);
            }
        });
        final boolean z = false;
        boolean z2 = bundle.getBoolean("is_from_new_user_journey", false);
        boolean z3 = bundle.getBoolean("need_restart", false);
        boolean z4 = bundle.getBoolean("should_restart_later", false);
        if (z3 || z4) {
            z = true;
        }
        if (!z2) {
            arrayList.add(new OUM() { // from class: X.OUI
                @Override // X.OUM
                public final void LIZ(Bundle bundle2) {
                    Bundle bundle3 = bundle;
                    boolean z5 = z;
                    if (bundle2 == null) {
                        bundle2 = bundle3;
                    }
                    if (z5) {
                        bundle2.putBoolean("needCheckSocialRecDialog", true);
                    }
                    Activity topActivity = ActivityStack.getTopActivity();
                    ISocialFriendsService LJJIL = C77266UUc.LIZIZ.LJJIL();
                    if (topActivity == null || LJJIL == null) {
                        OUG.LIZ(bundle2);
                    } else {
                        LJJIL.LJI(topActivity, z5, new OUK(bundle2));
                    }
                }
            });
        }
        if (C38700FGu.LIZ()) {
            arrayList.add(new OUC(bundle));
        }
        arrayList.add(new OUA(bundle));
        arrayList.add(new OU4(bundle));
        OUJ.LIZIZ = ORZ.LLJILJILJ(arrayList);
        Iterator<OUN> it = OUJ.LIZ.iterator();
        while (it.hasNext()) {
            it.next().onStart();
        }
        OUG.LIZ(bundle);
        return c10k.LJIIJJI();
    }
}
