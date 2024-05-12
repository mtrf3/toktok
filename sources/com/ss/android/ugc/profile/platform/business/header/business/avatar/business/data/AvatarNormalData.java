package com.ss.android.ugc.profile.platform.business.header.business.avatar.business.data;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import com.ss.android.ugc.aweme.profile.model.ProfileBadgeStruct;
import com.ss.android.ugc.aweme.profile.model.UserNowPackStruct;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;

/* loaded from: classes5.dex */
public final class AvatarNormalData extends BizBaseData {

    @InterfaceC65349Pkn("badge_info")
    public ProfileBadgeStruct profileBadgeStruct;

    @InterfaceC65349Pkn("room_data")
    public String roomData;

    @InterfaceC65349Pkn("room_id")
    public Long roomId;

    @InterfaceC65349Pkn("share_info")
    public ShareInfo shareInfo;

    @InterfaceC65349Pkn("story_status")
    public Integer storyStatus;

    @InterfaceC65349Pkn("user_now_pack_info")
    public final UserNowPackStruct userNowPackStruct;

    public final ProfileBadgeStruct getProfileBadgeStruct() {
        return this.profileBadgeStruct;
    }

    public final String getRoomData() {
        return this.roomData;
    }

    public final Long getRoomId() {
        return this.roomId;
    }

    public final ShareInfo getShareInfo() {
        return this.shareInfo;
    }

    public final Integer getStoryStatus() {
        return this.storyStatus;
    }

    public final UserNowPackStruct getUserNowPackStruct() {
        return this.userNowPackStruct;
    }

    public final void setProfileBadgeStruct(ProfileBadgeStruct profileBadgeStruct) {
        this.profileBadgeStruct = profileBadgeStruct;
    }

    public final void setRoomData(String str) {
        this.roomData = str;
    }

    public final void setRoomId(Long l) {
        this.roomId = l;
    }

    public final void setShareInfo(ShareInfo shareInfo) {
        this.shareInfo = shareInfo;
    }

    public final void setStoryStatus(Integer num) {
        this.storyStatus = num;
    }
}
