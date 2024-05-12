package com.ss.android.ugc.aweme.setting.api;

import X.C61720OKe;
import X.C76L;
import X.E4Q;
import X.InterfaceC64989Pez;
import com.ss.android.ugc.aweme.feed.model.PromoteEntryCheck;

/* loaded from: classes11.dex */
public interface PromoteEntryCheckApi {
    public static final C61720OKe LIZ = C61720OKe.LIZ;

    @E4Q("/aweme/v1/promote/api/entry/check/")
    C76L<PromoteEntryCheck> getPromoteEntryCheck(@InterfaceC64989Pez("item_id") String str, @InterfaceC64989Pez("source") String str2, @InterfaceC64989Pez("click_time") long j, @InterfaceC64989Pez("promote_by") String str3);
}
