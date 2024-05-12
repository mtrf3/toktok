package com.ss.android.ugc.aweme.im.sdk.privacy.data.api;

import X.AbstractC73638SvC;
import X.C76L;
import X.C85813Yj;
import X.E8L;
import X.InterfaceC64986Pew;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;

/* loaded from: classes2.dex */
public interface UserSettingService {
    public static final C85813Yj LIZ = C85813Yj.LIZ;

    @E8L("/aweme/v1/user/settings/")
    AbstractC73638SvC<PushSettings> getUserSettings(@InterfaceC64986Pew("last_settings_version") String str);

    @E8L("/aweme/v1/user/settings/")
    C76L<PushSettings> getUserSettingsFuture(@InterfaceC64986Pew("last_settings_version") String str);
}
