package com.bytedance.android.livesdk.chatroom.api;

import X.AbstractC73638SvC;
import X.C28467BFf;
import X.E8L;
import X.InterfaceC64986Pew;
import com.bytedance.android.livesdk.chatroom.model.LatestBanRecordInfo;
import tikcast.api.perception.ViolationStatusResponse;

/* loaded from: classes6.dex */
public interface LinkReviewApi {
    @E8L("/webcast/review/get_latest_ban_record/")
    AbstractC73638SvC<C28467BFf<LatestBanRecordInfo>> bannedInfo(@InterfaceC64986Pew("ban_type") int i);

    @E8L("/webcast/perception/violation/status/")
    AbstractC73638SvC<C28467BFf<ViolationStatusResponse.ResponseData>> requestViolation(@InterfaceC64986Pew("scene") int i);
}
