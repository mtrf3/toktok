package com.bytedance.android.live.liveinteract.multihost.core.model;

import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo;
import com.bytedance.android.livesdk.chatroom.model.interact.CohostABTestSetting;
import com.bytedance.android.livesdk.chatroom.model.interact.CohostTopic;
import com.bytedance.android.livesdk.model.message.PerceptionDialogInfo;
import com.bytedance.android.livesdk.model.message.PunishEventInfo;
import java.util.List;
import webcast.im.JoinGroupMessageExtra;

/* loaded from: classes14.dex */
public final class MHJoinBizContent {
    public CohostTopic LIZ;

    @InterfaceC65349Pkn("ab_test_setting")
    public List<CohostABTestSetting> abTestSetting;

    @InterfaceC65349Pkn("biz_extra")
    public JoinGroupMessageExtra bizExtra;

    @InterfaceC65349Pkn("dialog")
    public PerceptionDialogInfo dialog;

    @InterfaceC65349Pkn("from_room_age_restricted")
    public int fromRoomAgeRestricted;

    @InterfaceC65349Pkn("from_tag")
    public RivalExtraInfo.Tag fromTag;

    @InterfaceC65349Pkn("punish_info")
    public PunishEventInfo punishInfo;
}
