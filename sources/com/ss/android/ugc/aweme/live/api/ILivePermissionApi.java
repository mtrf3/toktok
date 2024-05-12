package com.ss.android.ugc.aweme.live.api;

import X.AbstractC73672Svk;
import X.E8L;
import com.ss.android.ugc.aweme.live.model.LivePermissionResponse;

/* loaded from: classes6.dex */
public interface ILivePermissionApi {
    @E8L("/webcast/room/live_podcast/")
    AbstractC73672Svk<LivePermissionResponse> getLivePodCast();
}
