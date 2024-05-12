package com.bytedance.android.live.base.model.user;

import X.InterfaceC05190Ih;
import X.InterfaceC29384Bg4;
import X.InterfaceC29385Bg5;
import X.InterfaceC65349Pkn;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.message.proto.EcommerceEntrance;
import com.bytedance.android.livesdk.model.ActivityRewardInfo;
import com.bytedance.android.livesdk.model.AnchorInfo;
import com.bytedance.android.livesdk.model.AnchorLevel;
import com.bytedance.android.livesdk.model.AuthenticationInfo;
import com.bytedance.android.livesdk.model.Author;
import com.bytedance.android.livesdk.model.BorderInfo;
import com.bytedance.android.livesdk.model.FansClubMember;
import com.bytedance.android.livesdk.model.FraternityInfo;
import com.bytedance.android.livesdk.model.LiveEventInfo;
import com.bytedance.android.livesdk.model.NobleLevelInfo;
import com.bytedance.android.livesdk.model.UserAttr;
import com.bytedance.android.livesdk.model.UserHonor;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class User implements InterfaceC05190Ih {
    public static boolean sSubPermission;

    @InterfaceC65349Pkn("allow_find_by_contacts")
    public boolean allowFindByContacts;

    @InterfaceC65349Pkn("allow_others_download_video")
    public boolean allowOthersDownloadVideo;

    @InterfaceC65349Pkn("allow_others_download_when_sharing_video")
    public boolean allowOthersDownloadWhenSharingVideo;

    @InterfaceC65349Pkn("allow_share_show_profile")
    public boolean allowShareShowProfile;

    @InterfaceC65349Pkn("allow_show_in_gossip")
    public boolean allowShowInGossip;

    @InterfaceC65349Pkn("allow_show_my_action")
    public boolean allowShowMyAction;

    @InterfaceC65349Pkn("allow_strange_comment")
    public boolean allowStrangeComment;

    @InterfaceC65349Pkn("allow_unfollower_comment")
    public boolean allowUnfollowerComment;

    @InterfaceC65349Pkn("allow_use_linkmic")
    public boolean allowUseLinkmic;

    @InterfaceC65349Pkn("anchor_info")
    public AnchorInfo anchorInfo;

    @InterfaceC65349Pkn("webcast_anchor_level")
    public AnchorLevel anchorLevel;

    @InterfaceC65349Pkn("authentication_info")
    public AuthenticationInfo authenticationInfo;

    @InterfaceC65349Pkn("author_stats")
    public Author authorInfo;

    @InterfaceC65349Pkn("avatar_border")
    public ImageModel avatarBorder;

    @InterfaceC65349Pkn("avatar_jpg")
    public ImageModel avatarJpg;

    @InterfaceC65349Pkn("avatar_large")
    public ImageModel avatarLarge;

    @InterfaceC65349Pkn("avatar_medium")
    public ImageModel avatarMedium;

    @InterfaceC65349Pkn("avatar_thumb")
    public ImageModel avatarThumb;

    @InterfaceC65349Pkn("badge_list")
    public List<BadgeStruct> badgeList;

    @InterfaceC65349Pkn("block_status")
    public int blockStatus;

    @InterfaceC65349Pkn("border")
    public BorderInfo border;

    @InterfaceC65349Pkn("border_list")
    public List<BorderInfo> borders;

    @InterfaceC65349Pkn("combo_badge_info")
    public ComboBadgeInfo comboBadgeInfo;

    @InterfaceC65349Pkn("comment_restrict")
    public int commentRestrict;

    @InterfaceC65349Pkn("commerce_webcast_config_ids")
    public List<Long> commerceWebcastConfigIds;

    @InterfaceC65349Pkn("create_time")
    public long createTime;

    @InterfaceC65349Pkn("disable_ichat")
    public int disableIchat;

    @InterfaceC65349Pkn("ecommerce_entrance")
    public EcommerceEntrance ecommerceEntrance;

    @InterfaceC65349Pkn("with_car_management_permission")
    public boolean enableCarManagementPermission;

    @InterfaceC65349Pkn("enable_ichat_img")
    public long enableIchatImg;

    @InterfaceC65349Pkn("with_commerce_permission")
    public boolean enableShowCommerceSale;

    @InterfaceC65349Pkn("exp")
    public int exp;

    @InterfaceC65349Pkn("ticket_count")
    public long fanTicketCount;

    @InterfaceC65349Pkn("fans_club")
    public FansClubMember fansClub;

    @InterfaceC65349Pkn("fans_club_info")
    public FansClubInfo fansClubInfo;

    @InterfaceC65349Pkn("fold_stranger_chat")
    public boolean foldStrangerChat;

    @InterfaceC65349Pkn("follow_info")
    public FollowInfo followInfo;
    public FraternityInfo fraternityInfo;

    @InterfaceC65349Pkn("ichat_restrict_type")
    public int ichatRestrictType;

    @InterfaceC65349Pkn("id")
    public long id;

    @InterfaceC65349Pkn("is_block")
    public boolean isBlock;

    @InterfaceC65349Pkn("is_follower")
    public boolean isFollower;

    @InterfaceC65349Pkn("is_following")
    public boolean isFollowing;

    @InterfaceC65349Pkn("verified")
    public boolean isVerified;

    @InterfaceC65349Pkn("link_mic_stats")
    public int linkMicStats;
    public String logPb;
    public String mAvatarLargeStr;
    public String mAvatarMediumStr;
    public String mAvatarThumbStr;

    @InterfaceC65349Pkn("medal")
    public ImageModel medal;

    @InterfaceC65349Pkn("media_badge_image_list")
    public List<ImageModel> mediaBadgeImageList;

    @InterfaceC65349Pkn("mint_type_label")
    public List<Long> mintTypeLabel;

    @InterfaceC65349Pkn("modify_time")
    public long modifyTime;

    @InterfaceC65349Pkn("need_profile_guide")
    public boolean needProfileGuide;

    @InterfaceC65349Pkn("new_real_time_icons")
    public List<ImageModel> newUserBadges;
    public NobleLevelInfo nobleLevelInfo;

    @InterfaceC65349Pkn("own_room")
    public OwnRoom ownRoom;

    @InterfaceC65349Pkn("pay_score")
    public long payScore;

    @InterfaceC65349Pkn("deprecated21")
    public long payScores;

    @InterfaceC65349Pkn("personal_card")
    public ImageModel personalCard;

    @InterfaceC65349Pkn("push_comment_status")
    public boolean pushCommentStatus;

    @InterfaceC65349Pkn("push_digg")
    public boolean pushDigg;

    @InterfaceC65349Pkn("push_follow")
    public boolean pushFollow;

    @InterfaceC65349Pkn("push_friend_action")
    public boolean pushFriendAction;

    @InterfaceC65349Pkn("push_ichat")
    public boolean pushIchat;

    @InterfaceC65349Pkn("push_status")
    public boolean pushStatus;

    @InterfaceC65349Pkn("push_video_post")
    public boolean pushVideoPost;

    @InterfaceC65349Pkn("push_video_recommend")
    public boolean pushVideoRecommend;
    public String requestId;

    @InterfaceC65349Pkn("activity_reward")
    public ActivityRewardInfo rewardInfo;

    @InterfaceC65349Pkn("secret")
    public int secret;

    @InterfaceC65349Pkn("status")
    public int status;

    @InterfaceC65349Pkn("subscribe_info")
    public SubscribeInfo subscribeInfo;

    @InterfaceC65349Pkn("top_fans")
    public List<User> topFans;

    @InterfaceC65349Pkn("top_vip_no")
    public int topVipNo;

    @InterfaceC65349Pkn("upcoming_event_list")
    public List<LiveEventInfo> upcomingEventList;

    @InterfaceC65349Pkn("user_attr")
    public UserAttr userAttr;

    @InterfaceC65349Pkn("real_time_icons")
    public List<ImageModel> userBadges;

    @InterfaceC65349Pkn("pay_grade")
    public UserHonor userHonor;

    @InterfaceC65349Pkn("user_role")
    public int userRole;

    @InterfaceC65349Pkn("with_fusion_shop_entry")
    public boolean withFusionShopEntry;

    @InterfaceC65349Pkn("nickname")
    public String nickName = "";

    @InterfaceC65349Pkn("bio_description")
    public String signature = "";

    @InterfaceC65349Pkn("sec_uid")
    public String secUid = "";

    @InterfaceC65349Pkn("share_qrcode_uri")
    public String shareQrcodeUri = "";

    @InterfaceC65349Pkn("verified_content")
    public String verifiedContent = "";

    @InterfaceC65349Pkn("scm_label")
    public String scmLabel = "";

    @InterfaceC65349Pkn("id_str")
    public String idStr = "";

    @InterfaceC65349Pkn("verified_reason")
    public String verifiedReason = "";

    @InterfaceC65349Pkn("display_id")
    public String username = "";

    @InterfaceC65349Pkn("special_id")
    public String specialId = "";

    @InterfaceC65349Pkn("bg_img_url")
    public String backgroundImgUrl = "";

    @InterfaceC65349Pkn("constellation")
    public String constellation = "";

    @InterfaceC65349Pkn("follow_status")
    public Long followStatus = 0L;

    /* loaded from: classes.dex */
    public static class ComboBadgeInfo {

        @InterfaceC65349Pkn("combo_count")
        public long comboCount;

        @InterfaceC65349Pkn("icon")
        public ImageModel icon;
    }

    /* loaded from: classes.dex */
    public static final class FansClubInfo {

        @InterfaceC65349Pkn("badge")
        public ImageModel badge;

        @InterfaceC65349Pkn("fans_count")
        public long fansCount;

        @InterfaceC65349Pkn("fans_level")
        public long fansLevel;

        @InterfaceC65349Pkn("fans_score")
        public long fansScore;

        @InterfaceC65349Pkn("is_sleeping")
        public boolean isSleeping;
    }

    /* loaded from: classes.dex */
    public static class OwnRoom {

        @InterfaceC65349Pkn("room_ids")
        public List<Long> roomIdList;
    }

    public boolean childrenManagerForbidCreateLiveRoom() {
        return false;
    }

    @Override // X.InterfaceC05190Ih
    public boolean childrenManagerForbidWalletFunctions() {
        return false;
    }

    @Override // X.InterfaceC05190Ih
    public ImageModel getAvatarLarge() {
        try {
            if (this.avatarLarge == null && !TextUtils.isEmpty(this.mAvatarLargeStr)) {
                this.avatarLarge = (ImageModel) new Gson().LJI(this.mAvatarLargeStr, ImageModel.class);
            }
        } catch (Exception unused) {
        }
        return this.avatarLarge;
    }

    @Override // X.InterfaceC05190Ih
    public ImageModel getAvatarMedium() {
        try {
            if (this.avatarMedium == null && !TextUtils.isEmpty(this.mAvatarMediumStr)) {
                this.avatarMedium = (ImageModel) new Gson().LJI(this.mAvatarMediumStr, ImageModel.class);
            }
        } catch (Exception unused) {
        }
        return this.avatarMedium;
    }

    @Override // X.InterfaceC05190Ih
    public ImageModel getAvatarThumb() {
        try {
            if (this.avatarThumb == null && !TextUtils.isEmpty(this.mAvatarThumbStr)) {
                this.avatarThumb = (ImageModel) new Gson().LJI(this.mAvatarThumbStr, ImageModel.class);
            }
        } catch (Exception unused) {
        }
        return this.avatarThumb;
    }

    public String getIdStr() {
        if (TextUtils.isEmpty(this.idStr)) {
            return String.valueOf(this.id);
        }
        return this.idStr;
    }

    @Override // X.InterfaceC05190Ih
    public long getLiveRoomId() {
        List<Long> list;
        OwnRoom ownRoom = this.ownRoom;
        if (ownRoom == null || (list = ownRoom.roomIdList) == null || list.size() == 0) {
            return 0L;
        }
        return ((Long) ListProtector.get(ownRoom.roomIdList, 0)).longValue();
    }

    @Override // X.InterfaceC05190Ih
    public List<ImageModel> getNewUserBadges() {
        List<ImageModel> list = this.newUserBadges;
        if (list != null && !list.isEmpty()) {
            return this.newUserBadges;
        }
        return this.userBadges;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        String str = this.nickName;
        int i20 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i21 = i * 31;
        String str2 = this.signature;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        long j = this.id;
        int i22 = (((i21 + i2) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.createTime;
        int i23 = (i22 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        ImageModel imageModel = this.avatarThumb;
        if (imageModel != null) {
            i3 = imageModel.hashCode();
        } else {
            i3 = 0;
        }
        int i24 = (i23 + i3) * 31;
        ImageModel imageModel2 = this.avatarMedium;
        if (imageModel2 != null) {
            i4 = imageModel2.hashCode();
        } else {
            i4 = 0;
        }
        int i25 = (i24 + i4) * 31;
        ImageModel imageModel3 = this.avatarLarge;
        if (imageModel3 != null) {
            i5 = imageModel3.hashCode();
        } else {
            i5 = 0;
        }
        int i26 = (i25 + i5) * 31;
        List<User> list = this.topFans;
        if (list != null) {
            i6 = list.hashCode();
        } else {
            i6 = 0;
        }
        int i27 = (i26 + i6) * 31;
        String str3 = this.idStr;
        if (str3 != null) {
            i7 = str3.hashCode();
        } else {
            i7 = 0;
        }
        long j3 = this.fanTicketCount;
        int i28 = (((((i27 + i7) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.isVerified ? 1 : 0)) * 31;
        String str4 = this.verifiedReason;
        if (str4 != null) {
            i8 = str4.hashCode();
        } else {
            i8 = 0;
        }
        int i29 = (((i28 + i8) * 31) + this.topVipNo) * 31;
        UserHonor userHonor = this.userHonor;
        if (userHonor != null) {
            i9 = userHonor.hashCode();
        } else {
            i9 = 0;
        }
        int i30 = (i29 + i9) * 31;
        AnchorLevel anchorLevel = this.anchorLevel;
        if (anchorLevel != null) {
            i10 = anchorLevel.hashCode();
        } else {
            i10 = 0;
        }
        int i31 = (i30 + i10) * 31;
        List<ImageModel> list2 = this.userBadges;
        if (list2 != null) {
            i11 = list2.hashCode();
        } else {
            i11 = 0;
        }
        int i32 = (i31 + i11) * 31;
        List<ImageModel> list3 = this.newUserBadges;
        if (list3 != null) {
            i12 = list3.hashCode();
        } else {
            i12 = 0;
        }
        int i33 = (i32 + i12) * 31;
        String str5 = this.mAvatarThumbStr;
        if (str5 != null) {
            i13 = str5.hashCode();
        } else {
            i13 = 0;
        }
        int i34 = (i33 + i13) * 31;
        String str6 = this.mAvatarMediumStr;
        if (str6 != null) {
            i14 = str6.hashCode();
        } else {
            i14 = 0;
        }
        int i35 = (i34 + i14) * 31;
        String str7 = this.mAvatarLargeStr;
        if (str7 != null) {
            i15 = str7.hashCode();
        } else {
            i15 = 0;
        }
        int i36 = (((i35 + i15) * 31) + (this.enableShowCommerceSale ? 1 : 0)) * 31;
        String str8 = this.backgroundImgUrl;
        if (str8 != null) {
            i16 = str8.hashCode();
        } else {
            i16 = 0;
        }
        int i37 = (((i36 + i16) * 31) + this.status) * 31;
        long j4 = this.modifyTime;
        int i38 = (((i37 + ((int) (j4 ^ (j4 >>> 32)))) * 31) + this.secret) * 31;
        String str9 = this.shareQrcodeUri;
        if (str9 != null) {
            i17 = str9.hashCode();
        } else {
            i17 = 0;
        }
        int i39 = (i38 + i17) * 31;
        FollowInfo followInfo = this.followInfo;
        if (followInfo != null) {
            i18 = followInfo.hashCode();
        } else {
            i18 = 0;
        }
        int i40 = (i39 + i18) * 31;
        UserAttr userAttr = this.userAttr;
        if (userAttr != null) {
            i19 = userAttr.hashCode();
        } else {
            i19 = 0;
        }
        int i41 = (i40 + i19) * 31;
        AnchorInfo anchorInfo = this.anchorInfo;
        if (anchorInfo != null) {
            i20 = anchorInfo.hashCode();
        }
        return i41 + i20;
    }

    public boolean isAnchorHasSubQualification() {
        SubscribeInfo subscribeInfo = this.subscribeInfo;
        if (subscribeInfo != null) {
            return subscribeInfo.isAnchorQualified();
        }
        return false;
    }

    public boolean isFollowing() {
        FollowInfo followInfo = this.followInfo;
        if (followInfo == null) {
            return false;
        }
        if (followInfo.getFollowStatus() != 2 && this.followInfo.getFollowStatus() != 1) {
            return false;
        }
        return true;
    }

    public boolean isSubscribed() {
        SubscribeInfo subscribeInfo = this.subscribeInfo;
        if (subscribeInfo != null && subscribeInfo.isAnchorQualified()) {
            return this.subscribeInfo.isSubscribed();
        }
        return false;
    }

    public boolean isWithCommercePermission() {
        return isEnableShowCommerceSale();
    }

    @Override // X.InterfaceC05190Ih
    public AnchorInfo getAnchorInfo() {
        return this.anchorInfo;
    }

    @Override // X.InterfaceC05190Ih
    public AuthenticationInfo getAuthenticationInfo() {
        return this.authenticationInfo;
    }

    public Author getAuthorInfo() {
        return this.authorInfo;
    }

    @Override // X.InterfaceC05190Ih
    public String getAutoGraph() {
        return this.signature;
    }

    public ImageModel getAvatarBorder() {
        return this.avatarBorder;
    }

    @Override // X.InterfaceC05190Ih
    public String getBackgroundImgUrl() {
        return this.backgroundImgUrl;
    }

    public List<BadgeStruct> getBadgeList() {
        return this.badgeList;
    }

    public BorderInfo getBorder() {
        return this.border;
    }

    public List<BorderInfo> getBorders() {
        return this.borders;
    }

    public ComboBadgeInfo getComboBadgeInfo() {
        return this.comboBadgeInfo;
    }

    @Override // X.InterfaceC05190Ih
    public long getCreateTime() {
        return this.createTime;
    }

    public String getDisplayId() {
        return this.username;
    }

    @Override // X.InterfaceC05190Ih
    public long getFanTicketCount() {
        return this.fanTicketCount;
    }

    public FansClubMember getFansClub() {
        return this.fansClub;
    }

    @Override // X.InterfaceC05190Ih
    public FollowInfo getFollowInfo() {
        return this.followInfo;
    }

    public FraternityInfo getFraternityInfo() {
        return this.fraternityInfo;
    }

    @Override // X.InterfaceC05190Ih
    public long getId() {
        return this.id;
    }

    public int getLinkMicStats() {
        return this.linkMicStats;
    }

    public String getLogPb() {
        return this.logPb;
    }

    public ImageModel getMedal() {
        return this.medal;
    }

    @Override // X.InterfaceC05190Ih
    public long getModifyTime() {
        return this.modifyTime;
    }

    public String getNickName() {
        return this.nickName;
    }

    public NobleLevelInfo getNobleLevelInfo() {
        return this.nobleLevelInfo;
    }

    @Override // X.InterfaceC05190Ih
    public OwnRoom getOwnRoom() {
        return this.ownRoom;
    }

    public long getPayScores() {
        return this.payScores;
    }

    public ImageModel getPersonalCard() {
        return this.personalCard;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public ActivityRewardInfo getRewardInfo() {
        return this.rewardInfo;
    }

    public String getScmLabel() {
        return this.scmLabel;
    }

    @Override // X.InterfaceC05190Ih
    public String getSecUid() {
        return this.secUid;
    }

    @Override // X.InterfaceC05190Ih
    public int getSecret() {
        return this.secret;
    }

    @Override // X.InterfaceC05190Ih
    public String getShareQrcodeUri() {
        return this.shareQrcodeUri;
    }

    public String getSpecialId() {
        return this.specialId;
    }

    @Override // X.InterfaceC05190Ih
    public int getStatus() {
        return this.status;
    }

    public SubscribeInfo getSubscribeInfo() {
        return this.subscribeInfo;
    }

    @Override // X.InterfaceC05190Ih
    public List<User> getTopFans() {
        return this.topFans;
    }

    @Override // X.InterfaceC05190Ih
    public int getTopVipNo() {
        return this.topVipNo;
    }

    @Override // X.InterfaceC05190Ih
    public UserAttr getUserAttr() {
        return this.userAttr;
    }

    @Override // X.InterfaceC05190Ih
    public List<ImageModel> getUserBadges() {
        return this.userBadges;
    }

    public int getUserRole() {
        return this.userRole;
    }

    public String getUsername() {
        return this.username;
    }

    public String getVerifiedContent() {
        return this.verifiedContent;
    }

    @Override // X.InterfaceC05190Ih
    public String getVerifiedReason() {
        return this.verifiedReason;
    }

    public boolean isEnableCarManagement() {
        return this.enableCarManagementPermission;
    }

    @Override // X.InterfaceC05190Ih
    public boolean isEnableShowCommerceSale() {
        return this.enableShowCommerceSale;
    }

    @Override // X.InterfaceC05190Ih
    public boolean isVerified() {
        return this.isVerified;
    }

    @Override // X.InterfaceC05190Ih
    public AnchorLevel getAnchorLevel() {
        return this.anchorLevel;
    }

    @Override // X.InterfaceC05190Ih
    public UserHonor getUserHonor() {
        return this.userHonor;
    }

    public static User from(InterfaceC05190Ih interfaceC05190Ih) {
        if (interfaceC05190Ih == null) {
            return null;
        }
        if (interfaceC05190Ih instanceof User) {
            Gson gson = new Gson();
            return (User) GsonProtectorUtils.fromJson(gson, GsonProtectorUtils.toJson(gson, interfaceC05190Ih), User.class);
        }
        User user = new User();
        user.initWith(interfaceC05190Ih);
        return user;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        User user = (User) obj;
        if (this.id != user.id || this.createTime != user.createTime || this.fanTicketCount != user.fanTicketCount || this.isVerified != user.isVerified || this.topVipNo != user.topVipNo || getLiveRoomId() != user.getLiveRoomId() || this.enableShowCommerceSale != user.enableShowCommerceSale) {
            return false;
        }
        String str = this.nickName;
        if (str == null ? user.nickName != null : !str.equals(user.nickName)) {
            return false;
        }
        String str2 = this.signature;
        if (str2 == null ? user.signature != null : !str2.equals(user.signature)) {
            return false;
        }
        ImageModel imageModel = this.avatarThumb;
        if (imageModel == null ? user.avatarThumb != null : !imageModel.equals(user.avatarThumb)) {
            return false;
        }
        ImageModel imageModel2 = this.avatarMedium;
        if (imageModel2 == null ? user.avatarMedium != null : !imageModel2.equals(user.avatarMedium)) {
            return false;
        }
        ImageModel imageModel3 = this.avatarLarge;
        if (imageModel3 == null ? user.avatarLarge != null : !imageModel3.equals(user.avatarLarge)) {
            return false;
        }
        List<User> list = this.topFans;
        if (list == null ? user.topFans != null : !list.equals(user.topFans)) {
            return false;
        }
        String str3 = this.idStr;
        if (str3 == null ? user.idStr != null : !str3.equals(user.idStr)) {
            return false;
        }
        String str4 = this.verifiedReason;
        if (str4 == null ? user.verifiedReason != null : !str4.equals(user.verifiedReason)) {
            return false;
        }
        UserHonor userHonor = this.userHonor;
        if (userHonor == null ? user.userHonor != null : !userHonor.equals(user.userHonor)) {
            return false;
        }
        AnchorLevel anchorLevel = this.anchorLevel;
        if (anchorLevel == null ? user.anchorLevel != null : !anchorLevel.equals(user.anchorLevel)) {
            return false;
        }
        List<ImageModel> list2 = this.userBadges;
        if (list2 == null ? user.userBadges != null : !list2.equals(user.userBadges)) {
            return false;
        }
        List<ImageModel> list3 = this.newUserBadges;
        if (list3 == null ? user.newUserBadges != null : !list3.equals(user.newUserBadges)) {
            return false;
        }
        String str5 = this.mAvatarThumbStr;
        if (str5 == null ? user.mAvatarThumbStr != null : !str5.equals(user.mAvatarThumbStr)) {
            return false;
        }
        String str6 = this.mAvatarMediumStr;
        if (str6 == null ? user.mAvatarMediumStr != null : !str6.equals(user.mAvatarMediumStr)) {
            return false;
        }
        String str7 = this.mAvatarLargeStr;
        if (str7 == null ? user.mAvatarLargeStr != null : !str7.equals(user.mAvatarLargeStr)) {
            return false;
        }
        String str8 = this.backgroundImgUrl;
        if (str8 == null ? user.backgroundImgUrl != null : !str8.equals(user.backgroundImgUrl)) {
            return false;
        }
        if (this.status != user.status || this.modifyTime != user.modifyTime || this.secret != user.secret) {
            return false;
        }
        String str9 = this.shareQrcodeUri;
        if (str9 == null ? user.shareQrcodeUri != null : !str9.equals(user.shareQrcodeUri)) {
            return false;
        }
        FollowInfo followInfo = this.followInfo;
        if (followInfo == null ? user.followInfo != null : !followInfo.equals(user.followInfo)) {
            return false;
        }
        UserAttr userAttr = this.userAttr;
        if (userAttr == null ? user.userAttr != null : !userAttr.equals(user.userAttr)) {
            return false;
        }
        AuthenticationInfo authenticationInfo = this.authenticationInfo;
        if (authenticationInfo == null ? user.authenticationInfo != null : !authenticationInfo.equals(user.authenticationInfo)) {
            return false;
        }
        AnchorInfo anchorInfo = this.anchorInfo;
        AnchorInfo anchorInfo2 = user.anchorInfo;
        if (anchorInfo != null) {
            return anchorInfo.equals(anchorInfo2);
        }
        if (anchorInfo2 == null) {
            return true;
        }
        return false;
    }

    public void initWith(InterfaceC05190Ih interfaceC05190Ih) {
        ArrayList arrayList;
        UserHonor userHonor;
        ArrayList arrayList2;
        AnchorLevel anchorLevel;
        ArrayList arrayList3;
        this.enableShowCommerceSale = interfaceC05190Ih.isEnableShowCommerceSale();
        this.fanTicketCount = interfaceC05190Ih.getFanTicketCount();
        this.avatarThumb = interfaceC05190Ih.getAvatarThumb();
        this.avatarMedium = interfaceC05190Ih.getAvatarMedium();
        this.avatarLarge = interfaceC05190Ih.getAvatarLarge();
        if (interfaceC05190Ih instanceof User) {
            this.nickName = ((User) interfaceC05190Ih).nickName;
        }
        this.signature = interfaceC05190Ih.getAutoGraph();
        this.id = interfaceC05190Ih.getId();
        ArrayList arrayList4 = null;
        if (interfaceC05190Ih.getTopFans() != null) {
            arrayList = new ArrayList(interfaceC05190Ih.getTopFans());
        } else {
            arrayList = null;
        }
        this.topFans = arrayList;
        this.isVerified = interfaceC05190Ih.isVerified();
        this.verifiedReason = interfaceC05190Ih.getVerifiedReason();
        this.topVipNo = interfaceC05190Ih.getTopVipNo();
        InterfaceC29385Bg5 userHonor2 = interfaceC05190Ih.getUserHonor();
        if (userHonor2 == null) {
            userHonor = null;
        } else if (userHonor2 instanceof UserHonor) {
            Gson gson = new Gson();
            userHonor = (UserHonor) GsonProtectorUtils.fromJson(gson, GsonProtectorUtils.toJson(gson, userHonor2), UserHonor.class);
        } else {
            userHonor = new UserHonor();
            UserHonor userHonor3 = (UserHonor) userHonor2;
            userHonor.diamondIcon = userHonor3.diamondIcon;
            userHonor.currentHonorIcon = userHonor3.currentHonorIcon;
            userHonor.nextHonorIcon = userHonor3.nextHonorIcon;
            userHonor.nextHonorName = userHonor3.nextHonorName;
            userHonor.currentHonorName = userHonor3.currentHonorName;
            userHonor.totalDiamond = userHonor3.totalDiamond;
            userHonor.currentDiamond = userHonor3.currentDiamond;
            userHonor.imIcon = userHonor3.imIcon;
            userHonor.imIconWithLevel = userHonor3.imIconWithLevel;
            ImageModel imageModel = userHonor3.newImIconWithLevel;
            if (imageModel == null) {
                imageModel = userHonor3.imIconWithLevel;
            }
            userHonor.newImIconWithLevel = imageModel;
            userHonor.level = userHonor3.level;
            userHonor.liveIcon = userHonor3.liveIcon;
            ImageModel imageModel2 = userHonor3.newLiveIcon;
            if (imageModel2 == null) {
                imageModel2 = userHonor3.liveIcon;
            }
            userHonor.newLiveIcon = imageModel2;
            if (userHonor3.gradeIconList != null) {
                arrayList2 = new ArrayList(userHonor3.gradeIconList);
            } else {
                arrayList2 = null;
            }
            userHonor.gradeIconList = arrayList2;
            userHonor.gradeDescribe = userHonor3.gradeDescribe;
            userHonor.thisGradeMaxDiamond = userHonor3.thisGradeMaxDiamond;
            userHonor.thisGradeMinDiamond = userHonor3.thisGradeMinDiamond;
            userHonor.profileDialogBg = userHonor3.profileDialogBg;
            userHonor.profileDialogBackBg = userHonor3.profileDialogBackBg;
        }
        this.userHonor = userHonor;
        InterfaceC29384Bg4 anchorLevel2 = interfaceC05190Ih.getAnchorLevel();
        if (anchorLevel2 == null) {
            anchorLevel = null;
        } else if (anchorLevel2 instanceof AnchorLevel) {
            anchorLevel = (AnchorLevel) anchorLevel2;
        } else {
            AnchorLevel anchorLevel3 = new AnchorLevel();
            AnchorLevel anchorLevel4 = (AnchorLevel) anchorLevel2;
            anchorLevel3.level = anchorLevel4.level;
            anchorLevel3.experience = anchorLevel4.experience;
            anchorLevel3.lowestExperienceThisLevel = anchorLevel4.lowestExperienceThisLevel;
            anchorLevel3.highestExperienceThisLevel = anchorLevel4.highestExperienceThisLevel;
            anchorLevel3.taskStartExperience = anchorLevel4.taskStartExperience;
            anchorLevel3.taskStartTime = anchorLevel4.taskStartTime;
            anchorLevel3.taskDecreaseExperience = anchorLevel4.taskDecreaseExperience;
            anchorLevel3.taskTargetExperience = anchorLevel4.taskTargetExperience;
            anchorLevel3.taskEndTime = anchorLevel4.taskEndTime;
            anchorLevel3.profileDialogBg = anchorLevel4.profileDialogBg;
            anchorLevel3.profileDialogBackBg = anchorLevel4.profileDialogBackBg;
            anchorLevel3.stageLevelIcon = anchorLevel4.stageLevelIcon;
            anchorLevel3.levelIcon = anchorLevel4.levelIcon;
            anchorLevel = anchorLevel3;
        }
        this.anchorLevel = anchorLevel;
        this.createTime = interfaceC05190Ih.getCreateTime();
        this.ownRoom = interfaceC05190Ih.getOwnRoom();
        if (interfaceC05190Ih.getUserBadges() != null) {
            arrayList3 = new ArrayList(interfaceC05190Ih.getUserBadges());
        } else {
            arrayList3 = null;
        }
        this.userBadges = arrayList3;
        if (interfaceC05190Ih.getNewUserBadges() != null) {
            arrayList4 = new ArrayList(interfaceC05190Ih.getNewUserBadges());
        }
        this.newUserBadges = arrayList4;
        this.backgroundImgUrl = interfaceC05190Ih.getBackgroundImgUrl();
        this.status = interfaceC05190Ih.getStatus();
        this.modifyTime = interfaceC05190Ih.getModifyTime();
        this.secret = interfaceC05190Ih.getSecret();
        this.shareQrcodeUri = interfaceC05190Ih.getShareQrcodeUri();
        this.followInfo = interfaceC05190Ih.getFollowInfo();
        this.userAttr = interfaceC05190Ih.getUserAttr();
        this.anchorInfo = interfaceC05190Ih.getAnchorInfo();
        this.authenticationInfo = interfaceC05190Ih.getAuthenticationInfo();
    }

    public void setAnchorInfo(AnchorInfo anchorInfo) {
        this.anchorInfo = anchorInfo;
    }

    public void setAvatarLarge(ImageModel imageModel) {
        this.avatarLarge = imageModel;
    }

    public void setAvatarMedium(ImageModel imageModel) {
        this.avatarMedium = imageModel;
    }

    public void setAvatarThumb(ImageModel imageModel) {
        this.avatarThumb = imageModel;
    }

    public void setBadgeList(List<BadgeStruct> list) {
        this.badgeList = list;
    }

    public void setBorder(BorderInfo borderInfo) {
        this.border = borderInfo;
    }

    public void setDisplayId(String str) {
        this.username = str;
    }

    public void setEnableShowCommerceSale(boolean z) {
        this.enableShowCommerceSale = z;
    }

    public void setFollowInfo(FollowInfo followInfo) {
        this.followInfo = followInfo;
    }

    public void setFollowStatus(int i) {
        FollowInfo followInfo = this.followInfo;
        if (followInfo != null) {
            followInfo.setFollowStatus(i);
        }
    }

    public void setId(long j) {
        this.id = j;
    }

    public void setIdStr(String str) {
        this.idStr = str;
    }

    public void setLogPb(String str) {
        this.logPb = str;
    }

    public void setModifyTime(long j) {
        this.modifyTime = j;
    }

    public void setNickName(String str) {
        this.nickName = str;
    }

    public void setPayScores(long j) {
        this.payScores = j;
    }

    public void setRequestId(String str) {
        this.requestId = str;
    }

    public void setScmLabel(String str) {
        this.scmLabel = str;
    }

    public void setSecUid(String str) {
        this.secUid = str;
    }

    public void setSecret(int i) {
        this.secret = i;
    }

    public void setShareQrcodeUri(String str) {
        this.shareQrcodeUri = str;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public void setSubscribeStatus(boolean z) {
        SubscribeInfo subscribeInfo = this.subscribeInfo;
        if (subscribeInfo != null) {
            subscribeInfo.setSubscribed(z);
        }
    }

    @Override // X.InterfaceC05190Ih
    public void setUserAttr(UserAttr userAttr) {
        this.userAttr = userAttr;
    }

    public void setUserRole(int i) {
        this.userRole = i;
    }

    public void setWithCommercePermission(boolean z) {
        setEnableShowCommerceSale(z);
    }
}
