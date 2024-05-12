package X;

import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.setting.page.account.ThirdPartyBindingPage;

/* loaded from: classes5.dex */
public final class AK7 implements C2YO {
    public final /* synthetic */ ThirdPartyBindingPage LIZ;

    @Override // X.C2YO
    public final void onUpdateFailed(String str) {
    }

    public AK7(ThirdPartyBindingPage thirdPartyBindingPage) {
        this.LIZ = thirdPartyBindingPage;
    }

    @Override // X.C2YO
    public final void onUpdateSuccess(boolean z) {
        this.LIZ.LJLJJL = z;
        SharePrefCache.inst().getUserHasPassword().LIZLLL(Boolean.valueOf(this.LIZ.LJLJJL));
    }
}
