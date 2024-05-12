package com.bytedance.android.livesdk.chatroom.model;

import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.model.Extra;
import com.bytedance.android.livesdk.model.message.PunishEventInfo;

/* loaded from: classes6.dex */
public class EnterRoomExtra extends Extra {

    @InterfaceC65349Pkn("finished_perception_msg")
    public String finishedPerceptionMsg;

    @InterfaceC65349Pkn("is_official_channel")
    public boolean isOfficialChannel;

    @InterfaceC65349Pkn("is_same_app_language")
    public boolean isSameAppLanguage;

    @InterfaceC65349Pkn("punish_info")
    public PunishEventInfo punishInfo;

    @InterfaceC65349Pkn("region")
    public String region;
}
