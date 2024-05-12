package tikcast.linkmic.controller;

import X.C61878OQg;
import X.InterfaceC65349Pkn;
import java.util.List;
import tikcast.linkmic.common.BackGroundImageState;
import tikcast.linkmic.common.LayoutState;
import tikcast.linkmic.common.LinkUserState;

/* loaded from: classes14.dex */
public final class GetStateResp {

    @InterfaceC65349Pkn("back_ground_image")
    public BackGroundImageState backGroundImage;

    @InterfaceC65349Pkn("channel_id")
    public long channelId;

    @InterfaceC65349Pkn("layout")
    public LayoutState layout;

    @InterfaceC65349Pkn("states")
    public List<LinkUserState> states = C61878OQg.INSTANCE;

    @InterfaceC65349Pkn("version")
    public long version;
}
