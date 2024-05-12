package com.ss.android.ugc.aweme.setting.api;

import X.AG0;
import X.C76L;
import X.E4Q;
import com.ss.android.ugc.aweme.setting.model.LiveReplayEntranceResponse;

/* loaded from: classes5.dex */
public interface LiveReplayApi {
    public static final AG0 LIZ = AG0.LIZ;

    @E4Q("/aweme/v1/settings/manual/")
    C76L<LiveReplayEntranceResponse> getLiveReplayEntrance();
}
