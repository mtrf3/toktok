package com.bytedance.android.livesdk.subscribe.model;

import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.api.SubInfo;
import com.bytedance.android.livesdk.chatroom.api.SubLevel;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public final class SubscribingInfo {

    @InterfaceC65349Pkn("all_levels")
    public List<SubLevel> allLevels = new ArrayList();

    @InterfaceC65349Pkn("anchor_info")
    public User anchorInfo;

    @InterfaceC65349Pkn("sub_info")
    public SubInfo subInfo;
}
