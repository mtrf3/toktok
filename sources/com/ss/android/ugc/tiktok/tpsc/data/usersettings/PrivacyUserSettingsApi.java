package com.ss.android.ugc.tiktok.tpsc.data.usersettings;

import X.AbstractC73672Svk;
import X.E8L;
import X.E8M;
import X.InterfaceC195757mF;
import X.InterfaceC64985Pev;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* loaded from: classes13.dex */
public interface PrivacyUserSettingsApi {
    @E8L("/tiktok/privacy/user/settings/v2")
    AbstractC73672Svk<PrivacyUserSettingsResponse> getPrivacyUserSettings();

    @E8M("/tiktok/privacy/user/settings/update/v1")
    @InterfaceC195757mF
    AbstractC73672Svk<BaseResponse> setPrivacySetting(@InterfaceC64985Pev("field") String str, @InterfaceC64985Pev("value") int i);

    @E8M("/tiktok/privacy/user/settings/update/v1")
    @InterfaceC195757mF
    AbstractC73672Svk<PrivacyUserSettingsResponse> setPrivateAccount(@InterfaceC64985Pev("field") String str, @InterfaceC64985Pev("value") int i, @InterfaceC64985Pev("confirmed") int i2);
}
