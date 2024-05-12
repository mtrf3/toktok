package webcast.api.game;

import X.InterfaceC65349Pkn;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes17.dex */
public final class LiveFragmentMontageRequest {

    @InterfaceC65349Pkn("is_post")
    public boolean isPost;

    @InterfaceC65349Pkn("vcloud_video_param_video_extra")
    public VcloudVideoEditParamVideoExtra vcloudVideoParamVideoExtra;

    @InterfaceC65349Pkn("room_id")
    public String roomId = "";

    @InterfaceC65349Pkn("title")
    public String title = "";

    @InterfaceC65349Pkn("fragment_id")
    public String fragmentId = "";

    @InterfaceC65349Pkn("video_tracks")
    public List<VideoTrack> videoTracks = new ArrayList();
}
