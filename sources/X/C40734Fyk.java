package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.compliance.api.services.termspp.ITermsConsentService;
import com.ss.android.ugc.awemepushapi.IPushPermissionApi;

/* renamed from: X.Fyk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40734Fyk implements InterfaceC39262Fb0 {
    public final /* synthetic */ IPushPermissionApi LIZ;
    public final /* synthetic */ Activity LIZIZ;
    public final /* synthetic */ ITermsConsentService LIZJ;

    @Override // X.InterfaceC39262Fb0
    public final void LIZ(boolean z) {
        if (z) {
            C221018lt.LIZ("PushPermissionPopup", "pass consent,show push now");
            this.LIZ.LIZJ(this.LIZIZ);
            this.LIZJ.LJI(this);
        }
    }

    public C40734Fyk(IPushPermissionApi iPushPermissionApi, ActivityC45651qj activityC45651qj, ITermsConsentService iTermsConsentService) {
        this.LIZ = iPushPermissionApi;
        this.LIZIZ = activityC45651qj;
        this.LIZJ = iTermsConsentService;
    }
}
