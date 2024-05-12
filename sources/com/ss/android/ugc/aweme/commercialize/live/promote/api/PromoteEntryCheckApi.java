package com.ss.android.ugc.aweme.commercialize.live.promote.api;

import X.AbstractC73672Svk;
import X.E8L;
import X.InterfaceC64986Pew;
import com.ss.android.ugc.aweme.feed.model.PromoteEntryCheck;

/* loaded from: classes11.dex */
public interface PromoteEntryCheckApi {
    @E8L("/aweme/v1/promote/api/entry/check/")
    AbstractC73672Svk<PromoteEntryCheck> getPromoteEntryCheck(@InterfaceC64986Pew("item_id") String str, @InterfaceC64986Pew("source") String str2, @InterfaceC64986Pew("click_time") long j, @InterfaceC64986Pew("room_id") long j2, @InterfaceC64986Pew("promote_by") String str3);
}
