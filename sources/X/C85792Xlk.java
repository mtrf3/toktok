package X;

import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.setting.I18nSettingManageMyAccountActivity;

/* renamed from: X.Xlk, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85792Xlk implements C2YO {
    public final /* synthetic */ I18nSettingManageMyAccountActivity LIZ;

    @Override // X.C2YO
    public final void onUpdateFailed(String str) {
    }

    public C85792Xlk(I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity) {
        this.LIZ = i18nSettingManageMyAccountActivity;
    }

    @Override // X.C2YO
    public final void onUpdateSuccess(boolean z) {
        this.LIZ.LJLILLLLZI = z;
        SharePrefCache.inst().getUserHasPassword().LIZLLL(Boolean.valueOf(this.LIZ.LJLILLLLZI));
    }
}
