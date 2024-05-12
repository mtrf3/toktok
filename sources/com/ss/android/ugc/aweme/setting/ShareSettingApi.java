package com.ss.android.ugc.aweme.setting;

import X.C76L;
import X.E4Q;
import com.ss.android.ugc.aweme.setting.model.ShareSettings;

/* loaded from: classes7.dex */
public interface ShareSettingApi {
    @E4Q("/aweme/v2/platform/share/settings/")
    C76L<ShareSettings> queryRawSetting();
}
