package X;

import com.ss.android.ugc.aweme.ISmartLockService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.widgets.BaseMyProfileGuideWidget;
import com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidgetV2;
import com.ss.android.ugc.aweme.services.SmartLockService;

/* renamed from: X.LiT, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55013LiT implements R5X {
    public final /* synthetic */ BaseMyProfileGuideWidget LIZ;
    public final /* synthetic */ User LIZIZ;

    @Override // X.R5X
    public final void onDialogShow() {
        try {
            BaseMyProfileGuideWidget baseMyProfileGuideWidget = this.LIZ;
            baseMyProfileGuideWidget.getClass();
            if (!C77125UOr.LIZJ(baseMyProfileGuideWidget).isFinishing()) {
                BaseMyProfileGuideWidget baseMyProfileGuideWidget2 = this.LIZ;
                baseMyProfileGuideWidget2.getClass();
                if (!C77125UOr.LIZJ(baseMyProfileGuideWidget2).isDestroyed()) {
                    ISmartLockService createISmartLockServicebyMonsterPlugin = SmartLockService.createISmartLockServicebyMonsterPlugin(false);
                    BaseMyProfileGuideWidget baseMyProfileGuideWidget3 = this.LIZ;
                    baseMyProfileGuideWidget3.getClass();
                    createISmartLockServicebyMonsterPlugin.smartLockTipMaskShow(C77125UOr.LIZJ(baseMyProfileGuideWidget3), this.LIZIZ.getUniqueId());
                    C188727au c188727au = new C188727au();
                    c188727au.LJIIIZ("enter_from", "profile_page");
                    FMX.LJIIL("express_login_authority_window_pop_up", c188727au.LIZ);
                }
            }
        } catch (Throwable unused) {
        }
    }

    @Override // X.R5X
    public final void onFailure(int i) {
        SmartLockService.createISmartLockServicebyMonsterPlugin(false).smartLockTipMaskDismiss();
    }

    @Override // X.R5X
    public final void onSuccess(MLL mll) {
        SmartLockService.createISmartLockServicebyMonsterPlugin(false).smartLockTipMaskDismiss();
    }

    public C55013LiT(MyProfileGuideWidgetV2 myProfileGuideWidgetV2, User user) {
        this.LIZ = myProfileGuideWidgetV2;
        this.LIZIZ = user;
    }
}
