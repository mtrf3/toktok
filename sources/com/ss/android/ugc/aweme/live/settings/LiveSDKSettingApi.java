package com.ss.android.ugc.aweme.live.settings;

import X.C10K;
import X.E4Q;
import X.InterfaceC64997Pf7;
import java.util.Map;

/* loaded from: classes7.dex */
public interface LiveSDKSettingApi {
    @E4Q("/webcast/setting/")
    C10K<LiveSDKSettingResponse> querySettings(@InterfaceC64997Pf7 Map<String, String> map);
}
