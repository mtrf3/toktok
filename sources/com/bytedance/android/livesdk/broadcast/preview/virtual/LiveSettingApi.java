package com.bytedance.android.livesdk.broadcast.preview.virtual;

import X.AbstractC73672Svk;
import X.C28467BFf;
import X.E8L;
import X.InterfaceC65349Pkn;

/* loaded from: classes6.dex */
public final class LiveSettingApi {

    /* loaded from: classes6.dex */
    public interface WebcastAPI {
        @E8L("/webcast/room/live_podcast/")
        AbstractC73672Svk<C28467BFf<LiveSettingResponse>> getLivePodCast();
    }

    /* loaded from: classes6.dex */
    public class LiveSettingResponse {

        @InterfaceC65349Pkn("can_be_live_podcast")
        public boolean canLive;

        @InterfaceC65349Pkn("show_live_studio")
        public boolean canShowLiveStudio;

        @InterfaceC65349Pkn("live_permission_apply")
        public LivePermissionApply livePermissionApply;

        @InterfaceC65349Pkn("live_scenario")
        public LiveScenario liveScenario;

        public LiveSettingResponse(LiveSettingApi liveSettingApi) {
        }
    }
}
