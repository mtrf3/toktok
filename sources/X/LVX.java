package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.compliance.api.services.termspp.ITermsConsentService;
import com.ss.android.ugc.aweme.homeobserver.SocialActivityAssem;
import com.ss.android.ugc.awemepushlib.manager.PushPermissionPopupManager;

/* loaded from: classes10.dex */
public final class LVX implements InterfaceC39262Fb0 {
    public final /* synthetic */ SocialActivityAssem LIZ;
    public final /* synthetic */ Activity LIZIZ;
    public final /* synthetic */ ITermsConsentService LIZJ;

    @Override // X.InterfaceC39262Fb0
    public final void LIZ(boolean z) {
        if (z) {
            C221018lt.LIZ("PushPermissionPopup", "SocialActivityAssem.onPassedConsentChanged()");
            SocialActivityAssem socialActivityAssem = this.LIZ;
            Activity activity = this.LIZIZ;
            socialActivityAssem.getClass();
            PushPermissionPopupManager.LJII().LIZ(activity, new LVY(socialActivityAssem, activity));
            this.LIZJ.LJI(this);
        }
    }

    public LVX(SocialActivityAssem socialActivityAssem, Activity activity, ITermsConsentService iTermsConsentService) {
        this.LIZ = socialActivityAssem;
        this.LIZIZ = activity;
        this.LIZJ = iTermsConsentService;
    }
}
