package tikcast.api.privilege;

import X.InterfaceC65349Pkn;
import X.WM7;

/* loaded from: classes17.dex */
public final class FansRankListRequest {

    @InterfaceC65349Pkn("count")
    public long count;

    @InterfaceC65349Pkn("fans_data_section")
    public int fansDataSection;

    @InterfaceC65349Pkn("offset")
    public long offset;

    @InterfaceC65349Pkn("online_opt")
    public int onlineOpt;

    @InterfaceC65349Pkn("rank_type")
    public int rankType;

    @InterfaceC65349Pkn("room_id")
    public String roomId = "";

    @InterfaceC65349Pkn(WM7.SCENE_SERVICE)
    public String scene = "";

    @InterfaceC65349Pkn("sec_anchor_id")
    public String secAnchorId;

    @InterfaceC65349Pkn("with_discord_entrance")
    public boolean withDiscordEntrance;
}
