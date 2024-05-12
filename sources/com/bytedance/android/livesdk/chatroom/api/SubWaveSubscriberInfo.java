package com.bytedance.android.livesdk.chatroom.api;

import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes17.dex */
public final class SubWaveSubscriberInfo {

    @InterfaceC65349Pkn("avatar")
    public ImageModel avatar;

    @InterfaceC65349Pkn("user_id")
    public long userId;

    @InterfaceC65349Pkn("display_id")
    public String displayId = "";

    @InterfaceC65349Pkn("user_id_str")
    public String userIdStr = "";

    @InterfaceC65349Pkn("badge_list")
    public List<BadgeStruct> badgeList = new ArrayList();
}
