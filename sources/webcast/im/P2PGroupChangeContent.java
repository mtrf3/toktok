package webcast.im;

import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.model.message.linkcore.RTCExtraInfo;
import java.util.ArrayList;
import java.util.List;
import tikcast.linkmic.common.GroupChannelAllUser;

/* loaded from: classes14.dex */
public final class P2PGroupChangeContent {

    @InterfaceC65349Pkn("group_ext_info")
    public List<RTCExtraInfo> groupExtInfo = new ArrayList();

    @InterfaceC65349Pkn("group_user")
    public GroupChannelAllUser groupUser;
}
