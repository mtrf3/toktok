package com.bytedance.android.live.liveinteract.multimatch.matchitem.model;

import X.C07670Rv;
import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.ImageModel;

/* loaded from: classes14.dex */
public final class ItemInfo4FE {

    @InterfaceC65349Pkn("avatar_thumb")
    public ImageModel avatarThumb;

    @InterfaceC65349Pkn("pk_id")
    public long battleId;

    @InterfaceC65349Pkn("channel_id")
    public long channelId;

    @InterfaceC65349Pkn("anchor_id")
    public Long currentAnchorId;

    @InterfaceC65349Pkn("effect_last_duration")
    public long effectLastDuration;

    @InterfaceC65349Pkn("effect_time_sec")
    public long effectStartTimeSec;

    @InterfaceC65349Pkn("end_at")
    public long endAt;

    @InterfaceC65349Pkn("is_self_room")
    public boolean isSelfRoom = true;

    @InterfaceC65349Pkn("is_team_match")
    public long isTeamMatch;

    @InterfaceC65349Pkn("is_team_mate_room")
    public boolean isTeamMate;

    @InterfaceC65349Pkn("item_id")
    public String itemId;

    @InterfaceC65349Pkn("item_image")
    public String itemImage;

    @InterfaceC65349Pkn("multiple")
    public long itemMultiple;

    @InterfaceC65349Pkn("item_name")
    public String itemName;

    @InterfaceC65349Pkn("probability_high")
    public long itemProbabilityHigh;

    @InterfaceC65349Pkn("probability_low")
    public long itemProbabilityLow;

    @InterfaceC65349Pkn("item_type")
    public int itemType;

    @InterfaceC65349Pkn("send_time_sec")
    public long sendTimeSec;

    @InterfaceC65349Pkn("to_anchor_id")
    public String sendToAnchorId;

    @InterfaceC65349Pkn("send_user_id")
    public String senderUid;

    @InterfaceC65349Pkn("send_user_avatar_url")
    public String senderUserAvatar;

    @InterfaceC65349Pkn("send_user_name")
    public String senderUserName;

    public final String toString() {
        StringBuilder sb = new StringBuilder("ItemInfo4FE(senderUserAvatar=");
        sb.append(this.senderUserAvatar);
        sb.append(", avatarThumb=");
        sb.append(this.avatarThumb);
        sb.append(", itemId=");
        sb.append(this.itemId);
        sb.append(", itemType=");
        sb.append(this.itemType);
        sb.append(", itemImage=");
        sb.append(this.itemImage);
        sb.append(", itemName=");
        sb.append(this.itemName);
        sb.append(", senderUid=");
        sb.append(this.senderUid);
        sb.append(", senderUserName=");
        sb.append(this.senderUserName);
        sb.append(", endAt=");
        sb.append(this.endAt);
        sb.append(", itemProbabilityHigh=");
        sb.append(this.itemProbabilityHigh);
        sb.append(", itemProbabilityLow=");
        sb.append(this.itemProbabilityLow);
        sb.append(", itemMultiple=");
        sb.append(this.itemMultiple);
        sb.append(", sendTimeSec=");
        sb.append(this.sendTimeSec);
        sb.append(", effectStartTimeSec=");
        sb.append(this.effectStartTimeSec);
        sb.append(", effectLastDuration=");
        sb.append(this.effectLastDuration);
        sb.append(", battleId=");
        sb.append(this.battleId);
        sb.append(", channelId=");
        sb.append(this.channelId);
        sb.append(", currentAnchorId=");
        sb.append(this.currentAnchorId);
        sb.append(", isSelfRoom=");
        sb.append(this.isSelfRoom);
        sb.append(", isTeamMate=");
        sb.append(this.isTeamMate);
        sb.append(", isTeamMatch=");
        sb.append(this.isTeamMatch);
        sb.append(", sendToAnchorId=");
        return C07670Rv.LIZIZ(sb, this.sendToAnchorId, ')');
    }
}
