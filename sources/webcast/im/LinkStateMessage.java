package webcast.im;

import X.C61878OQg;
import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;
import X.WM7;
import java.util.List;
import tikcast.linkmic.common.BackGroundImageState;
import tikcast.linkmic.common.LayoutState;
import tikcast.linkmic.common.LinkUserState;

/* loaded from: classes14.dex */
public final class LinkStateMessage extends CR6 {

    @InterfaceC65349Pkn("background")
    public BackGroundImageState background;

    @InterfaceC65349Pkn("channel_id")
    public long channelId;

    @InterfaceC65349Pkn("client_send_time")
    public long clientSendTime;

    @InterfaceC65349Pkn("layout")
    public LayoutState layout;

    @InterfaceC65349Pkn("need_ack")
    public int needAck;

    @InterfaceC65349Pkn(WM7.SCENE_SERVICE)
    public int scene;

    @InterfaceC65349Pkn("state_type")
    public int stateType;

    @InterfaceC65349Pkn("user_states")
    public List<LinkUserState> userStates;

    @InterfaceC65349Pkn("version")
    public long version;

    public LinkStateMessage() {
        this.type = EnumC31509CYf.LINK_STATE_MESSAGE;
        this.userStates = C61878OQg.INSTANCE;
    }
}
