package com.ss.android.ugc.aweme.browserecord;

import X.AbstractC73672Svk;
import X.E4Q;
import X.InterfaceC64989Pez;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* loaded from: classes5.dex */
public interface BrowseRecordSettingApi$Api {
    @E4Q("/aweme/v1/user/set/settings/")
    AbstractC73672Svk<BaseResponse> setSetting(@InterfaceC64989Pez("field") String str, @InterfaceC64989Pez("value") int i);
}
