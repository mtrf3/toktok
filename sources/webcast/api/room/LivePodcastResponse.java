package webcast.api.room;

import X.InterfaceC65349Pkn;

/* loaded from: classes17.dex */
public final class LivePodcastResponse {

    @InterfaceC65349Pkn("data")
    public ResponseData data;

    /* loaded from: classes17.dex */
    public static final class ResponseData {

        @InterfaceC65349Pkn("anchor_level_permission")
        public AnchorLevelPermission anchorLevelPermission;

        @InterfaceC65349Pkn("can_be_live_podcast")
        public boolean canBeLivePodcast;

        @InterfaceC65349Pkn("can_be_pico_live_podcast")
        public boolean canBePicoLivePodcast;

        @InterfaceC65349Pkn("can_be_social_live")
        public boolean canBeSocialLive;

        @InterfaceC65349Pkn("live_permission_apply")
        public LivePermissionApply livePermissionApply;

        @InterfaceC65349Pkn("live_scenario")
        public LiveScenario liveScenario;

        @InterfaceC65349Pkn("show_live_studio")
        public boolean showLiveStudio;

        @InterfaceC65349Pkn("try_mode")
        public TryMode tryMode;
    }
}
