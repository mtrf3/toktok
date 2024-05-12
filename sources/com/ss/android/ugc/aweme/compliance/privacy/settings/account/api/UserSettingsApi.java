package com.ss.android.ugc.aweme.compliance.privacy.settings.account.api;

import X.AbstractC73672Svk;
import X.E8L;
import X.InterfaceC64986Pew;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;

/* loaded from: classes2.dex */
public interface UserSettingsApi {
    @E8L("/aweme/v1/user/settings/")
    AbstractC73672Svk<PushSettings> getUserSettings(@InterfaceC64986Pew("last_settings_version") String str);
}
