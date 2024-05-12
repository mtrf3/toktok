package com.bytedance.android.livesdk.chatroom.model.interact;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.ImageModel;

/* loaded from: classes14.dex */
public final class CohostListUser extends F9E {

    @InterfaceC65349Pkn("avatar_thumb")
    public ImageModel avatarThumb;

    @InterfaceC65349Pkn("best_teammate_uid")
    public long bestTeammateUid;

    @InterfaceC65349Pkn("display_id")
    public String displayId;

    @InterfaceC65349Pkn("follow_status")
    public Long followStatus;

    @InterfaceC65349Pkn("has_topic_perm")
    public boolean hasTopicPerm;

    @InterfaceC65349Pkn("inner_channel_id")
    public long innerChannelId;

    @InterfaceC65349Pkn("is_initiator")
    public Boolean isInitiator;

    @InterfaceC65349Pkn("is_low_version")
    public Boolean isLowVersion;

    @InterfaceC65349Pkn("link_remaining_time")
    public Long linkRemainingTime;

    @InterfaceC65349Pkn("linked_time")
    public Long linkedTime;

    @InterfaceC65349Pkn("linkmic_id_str")
    public String linkmicIdStr;

    @InterfaceC65349Pkn("linkmic_user_status")
    public int linkmicUserStatus;

    @InterfaceC65349Pkn("nick_name")
    public String nickName;

    @InterfaceC65349Pkn("permission_type")
    public int permissionType;

    @InterfaceC65349Pkn("play_type")
    public int playType;

    @InterfaceC65349Pkn("rival_room_id")
    public Long rivalRoomId;

    @InterfaceC65349Pkn("rival_user_id")
    public Long rivalUserId;

    @InterfaceC65349Pkn("room_id")
    public Long roomId;

    @InterfaceC65349Pkn("user_id")
    public Long userId;

    @Override // X.F9E
    public final Object[] getObjects() {
        Long l = this.userId;
        String str = this.nickName;
        ImageModel imageModel = this.avatarThumb;
        Long l2 = this.linkedTime;
        Long l3 = this.roomId;
        Long l4 = this.linkRemainingTime;
        String str2 = this.displayId;
        Long l5 = this.followStatus;
        Boolean bool = this.isLowVersion;
        Long l6 = this.rivalUserId;
        Long l7 = this.rivalRoomId;
        return new Object[]{l, l, str, str, imageModel, imageModel, l2, l2, Integer.valueOf(this.playType), l3, l3, Integer.valueOf(this.linkmicUserStatus), l4, l4, Integer.valueOf(this.permissionType), str2, str2, l5, l5, bool, bool, l6, l6, l7, l7};
    }
}
