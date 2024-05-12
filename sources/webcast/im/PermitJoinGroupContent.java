package webcast.im;

import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.model.message.linkcore.RTCExtraInfo;
import java.util.ArrayList;
import java.util.List;
import tikcast.linkmic.common.GroupChannelAllUser;
import tikcast.linkmic.common.GroupPlayer;

/* loaded from: classes14.dex */
public final class PermitJoinGroupContent {

    @InterfaceC65349Pkn("agree_status")
    public int agreeStatus;

    @InterfaceC65349Pkn("approver")
    public GroupPlayer approver;

    @InterfaceC65349Pkn("group_ext_info")
    public List<RTCExtraInfo> groupExtInfo = new ArrayList();

    @InterfaceC65349Pkn("group_user")
    public GroupChannelAllUser groupUser;

    @InterfaceC65349Pkn("type")
    public int type;
}
