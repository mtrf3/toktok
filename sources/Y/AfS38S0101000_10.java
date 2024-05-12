package Y;

import X.AV1;
import X.C188727au;
import X.C237559Tz;
import X.C28467BFf;
import X.C59764Ncu;
import X.C73411SrX;
import X.C7CZ;
import X.C84763XOl;
import X.FMX;
import X.InterfaceC64592gB;
import X.InterfaceC65784Pro;
import android.app.Activity;
import android.app.Application;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.api.revenue.subscription.api.SubscribeUserInfoResponse;
import com.bytedance.android.livesdk.broadcast.interaction.function.illegal.LiveIllegalPresenter;
import com.bytedance.android.livesdk.i18n.I18nDbManager;
import com.ss.android.ugc.aweme.commercialize.ba.impl.service.BASwitchToPAorBAServiceImpl;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.crossplatform.activity.MixActivityContainer;
import com.ss.android.ugc.aweme.photo.PhotoModule;
import com.ss.android.ugc.aweme.setting.I18nSettingManageMyAccountActivity;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public class AfS38S0101000_10 implements InterfaceC64592gB {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [X.AXR] */
    public static final void accept$0(AfS38S0101000_10 afS38S0101000_10, Object obj) {
        T t;
        int i;
        boolean z = true;
        switch (afS38S0101000_10.i1) {
            case 0:
                C7CZ c7cz = (C7CZ) afS38S0101000_10.l0;
                BaseResponse baseResponse = (BaseResponse) obj;
                if (baseResponse != null && (t = baseResponse.data) != 0) {
                    boolean booleanValue = ((SubscribeUserInfoResponse) t).subscribing.subInfo.isSubscribing.booleanValue();
                    boolean z2 = ((SubscribeUserInfoResponse) baseResponse.data).subOnlyLiveInfo.hasPermission;
                    if (!booleanValue && !z2) {
                        z = false;
                    }
                    c7cz.LIZ(z);
                    return;
                }
                return;
            case 1:
                ((Application.ActivityLifecycleCallbacks) afS38S0101000_10.l0).onActivityStopped((Activity) obj);
                return;
            case 2:
                PhotoModule photoModule = (PhotoModule) afS38S0101000_10.l0;
                photoModule.LJLILLLLZI.LIZIZ("", new ArrayList());
                photoModule.LJLJJI = false;
                return;
            default:
                final I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity = (I18nSettingManageMyAccountActivity) afS38S0101000_10.l0;
                i18nSettingManageMyAccountActivity.getClass();
                if (e1.LIZ(31744, "ba_leave_survey", true, false)) {
                    new C237559Tz().LJII("ttelite_click_switch_to_PA", new String[0]);
                    BASwitchToPAorBAServiceImpl.LIZLLL().LIZIZ(i18nSettingManageMyAccountActivity, new InterfaceC65784Pro() { // from class: X.AXR
                        @Override // X.InterfaceC65784Pro
                        public final Object invoke() {
                            I18nSettingManageMyAccountActivity.this.LLJILLL(true);
                            return C76800UCe.LIZ;
                        }
                    });
                    return;
                }
                if (AV1.LIZIZ() != null && AV1.LIZIZ().getCommerceUserLevel() == 2) {
                    i = R.string.sl7;
                } else {
                    i = R.string.sl9;
                }
                i18nSettingManageMyAccountActivity.LLJJIJIIJIL(i, R.string.sl8);
                return;
        }
    }

    public static final void accept$1(AfS38S0101000_10 afS38S0101000_10, Object obj) {
        switch (afS38S0101000_10.i1) {
            case 0:
                LiveIllegalPresenter.LJJJJIZL((LiveIllegalPresenter) afS38S0101000_10.l0, (C28467BFf) obj);
                return;
            case 1:
                ((I18nDbManager) afS38S0101000_10.l0).lambda$updateTranslations$4((Boolean) obj);
                return;
            default:
                MixActivityContainer mixActivityContainer = (MixActivityContainer) afS38S0101000_10.l0;
                C59764Ncu c59764Ncu = (C59764Ncu) obj;
                mixActivityContainer.getClass();
                if (c59764Ncu.LIZIZ && C84763XOl.LJIIJJI) {
                    c59764Ncu.LIZ.LJIIL();
                }
                Activity activity = c59764Ncu.LIZJ.get();
                if (mixActivityContainer.LLFF && activity != null && (activity instanceof CrossPlatformActivity)) {
                    if (C84763XOl.LJIIJJI) {
                        C188727au c188727au = new C188727au();
                        c188727au.LJ(mixActivityContainer.LJLLILLLL, "stay_time");
                        c188727au.LJIIIZ("exit_method", "background");
                        FMX.LJIIL("exit_referral_new_user_guide", c188727au.LIZ);
                    } else {
                        C188727au c188727au2 = new C188727au();
                        c188727au2.LJ(mixActivityContainer.LJLLILLLL, "stay_time");
                        c188727au2.LJIIIZ("exit_method", "dismiss");
                        FMX.LJIIL("exit_referral_new_user_guide", c188727au2.LIZ);
                    }
                }
                C73411SrX c73411SrX = mixActivityContainer.LJLLJ;
                if (c73411SrX != null) {
                    c73411SrX.dispose();
                    return;
                }
                return;
        }
    }

    public AfS38S0101000_10(int i, Object obj, int i2) {
        this.$t = i2;
        this.i1 = i;
        this.l0 = obj;
    }
}
