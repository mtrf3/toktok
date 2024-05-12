package webcast.api.game;

import X.InterfaceC65349Pkn;
import X.WM7;

/* loaded from: classes17.dex */
public final class GetGameVideoListRequest {

    @InterfaceC65349Pkn("pull_type")
    public int pullType;

    @InterfaceC65349Pkn(WM7.SCENE_SERVICE)
    public int scene;

    @InterfaceC65349Pkn("video_id")
    public String videoId = "";

    @InterfaceC65349Pkn("author_id")
    public String authorId = "";

    @InterfaceC65349Pkn("game_tag_id")
    public String gameTagId = "";
}
