package webcast.data.multi_guest_play;

import X.InterfaceC65349Pkn;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes14.dex */
public final class ShowContent {

    @InterfaceC65349Pkn("channel_id")
    public long channelId;

    @InterfaceC65349Pkn("room_id")
    public long roomId;

    @InterfaceC65349Pkn("show_config")
    public ShowConfig showConfig;

    @InterfaceC65349Pkn("show_create_time")
    public long showCreateTime;

    @InterfaceC65349Pkn("show_id")
    public long showId;

    @InterfaceC65349Pkn("show_status")
    public int showStatus;

    @InterfaceC65349Pkn("version")
    public long version;

    @InterfaceC65349Pkn("showing_and_ready_list")
    public List<ShowListUser> showingAndReadyList = new ArrayList();

    @InterfaceC65349Pkn("finished_list")
    public List<ShowListUser> finishedList = new ArrayList();
}
