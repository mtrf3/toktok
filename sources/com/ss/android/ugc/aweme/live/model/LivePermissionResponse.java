package com.ss.android.ugc.aweme.live.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.AnchorLevelPermission;
import com.ss.android.ugc.aweme.LivePermissionApply;
import com.ss.android.ugc.aweme.LiveScenario;
import com.ss.android.ugc.aweme.TryMode;

/* loaded from: classes6.dex */
public class LivePermissionResponse {

    @InterfaceC65349Pkn("data")
    public LivePodcastResponse data;

    /* loaded from: classes6.dex */
    public class LivePodcastResponse {

        @InterfaceC65349Pkn("anchor_level_permission")
        public AnchorLevelPermission anchorLevelPermission;

        @InterfaceC65349Pkn("can_be_live_podcast")
        public boolean canLive;

        @InterfaceC65349Pkn("show_live_studio")
        public boolean canShowLiveStudio;

        @InterfaceC65349Pkn("live_permission_apply")
        public LivePermissionApply livePermissionApply;

        @InterfaceC65349Pkn("live_scenario")
        public LiveScenario liveScenario;

        @InterfaceC65349Pkn("try_mode")
        public TryMode tryMode;

        public LivePodcastResponse(LivePermissionResponse livePermissionResponse) {
        }
    }
}
