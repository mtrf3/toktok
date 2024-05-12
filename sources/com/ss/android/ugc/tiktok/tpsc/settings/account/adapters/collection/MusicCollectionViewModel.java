package com.ss.android.ugc.tiktok.tpsc.settings.account.adapters.collection;

import X.SKL;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.tiktok.tpsc.settings.account.BasePrivacyUserSettingViewModelV3;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class MusicCollectionViewModel extends BasePrivacyUserSettingViewModelV3 {
    public String LJLJL;

    public MusicCollectionViewModel() {
        super("favorite_music");
    }

    @Override // com.ss.android.ugc.tiktok.tpsc.base.BasePrivacySettingViewModel
    public final void iv0(int i, BaseResponse response) {
        SKL kv0;
        o.LJIIIZ(response, "response");
        if (i == 1 && !o.LJ(this.LJLJL, "privacy_and_safety_settings") && (kv0 = kv0()) != null) {
            kv0.LIZ(R.string.cis);
        }
    }
}
