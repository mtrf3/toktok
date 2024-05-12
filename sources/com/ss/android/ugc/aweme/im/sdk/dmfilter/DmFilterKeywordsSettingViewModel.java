package com.ss.android.ugc.aweme.im.sdk.dmfilter;

import X.C73318Sq2;
import X.V8H;
import X.XLM;
import com.ss.android.ugc.aweme.compliance.privacy.impl.PrivacyServiceImpl;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2;

/* loaded from: classes2.dex */
public final class DmFilterKeywordsSettingViewModel extends DmFilterKeywordsViewModel {
    public final boolean LJLJJL;
    public final XLM LJLJJLL;
    public C73318Sq2 LJLJL;

    public DmFilterKeywordsSettingViewModel() {
        super(0);
        boolean kv0 = kv0();
        this.LJLJJL = kv0;
        this.LJLJJLL = V8H.LIZ(Boolean.valueOf(kv0));
        this.LJLJL = new C73318Sq2();
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        this.LJLJL.LIZLLL();
        super.onCleared();
    }

    public static boolean kv0() {
        Integer M;
        PrivacyUserSettingsV2 privacyUserSettings = PrivacyServiceImpl.LJIIIIZZ().getPrivacyUserSettings();
        if (privacyUserSettings == null || (M = privacyUserSettings.M("dm_filter_keyword")) == null || M.intValue() != 1) {
            return false;
        }
        return true;
    }
}
