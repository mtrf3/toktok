package com.ss.android.ugc.aweme.im.service.model;

import X.C34B;
import X.C75792yF;
import X.InterfaceC65349Pkn;
import X.Q89;
import X.X1D;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.InteractionTagUserInfo;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.BaseUserService;
import defpackage.b0;
import java.util.List;

/* loaded from: classes16.dex */
public class IMUser extends IMContact {
    public int accountType;

    @InterfaceC65349Pkn("avatar_medium")
    public UrlModel avatarMedium;
    public String avatarMediumStr;
    public String avatarStr;

    @InterfaceC65349Pkn("avatar_thumb")
    public UrlModel avatarThumb;

    @InterfaceC65349Pkn("block_status")
    public int blockStatus;

    @InterfaceC65349Pkn("can_message_follow_status_list")
    public List<Integer> canMessageFollowStatusList;
    public long checkedUnreadStoryMillis;

    @InterfaceC65349Pkn("comment_mention_block_status")
    public long commentMentionBlockStatus;

    @InterfaceC65349Pkn("commerce_user_level")
    public int commerceUserLevel;

    @InterfaceC65349Pkn("contact_name")
    public String contactName;
    public String contactNameInitial;
    public String contactNamePinyin;

    @InterfaceC65349Pkn("custom_verify")
    public String customVerify;

    @InterfaceC65349Pkn("enable_direct_message")
    public boolean enableDirectMessage;
    public boolean enterprise;

    @InterfaceC65349Pkn("enterprise_verify_reason")
    public String enterpriseVerifyReason;

    @InterfaceC65349Pkn("follow_status")
    public int followStatus;

    @InterfaceC65349Pkn("follow_time")
    public long followTime;

    @InterfaceC65349Pkn("follower_count")
    public int followerCount;

    @InterfaceC65349Pkn("follower_status")
    public int followerStatus;

    @InterfaceC65349Pkn("following_count")
    public int followingCount;
    public long friendRecTime;

    @InterfaceC65349Pkn("rec_type")
    public int friendRecType;
    public boolean hasUnreadStory;
    public String initialLetter;

    @InterfaceC65349Pkn("is_block")
    public boolean isBlock;

    @InterfaceC65349Pkn("is_blocked")
    public boolean isBlocked;
    public boolean isFake;

    @InterfaceC65349Pkn("is_group_owner")
    public boolean isGroupOwner;
    public Boolean isUserEnabledQAInvite;
    public boolean isUserNotInAllFriends;

    @InterfaceC65349Pkn("nickname")
    public String nickName;
    public String nickNameInitial;
    public String nickNamePinyin;

    @InterfaceC65349Pkn("qa_invite_block_status")
    public long qaInviteBlockStatus;
    public String qaPrivacyMessage;

    @InterfaceC65349Pkn("recommend_reason")
    public String recommendReason;
    public String remarkInitial;

    @InterfaceC65349Pkn("remark_name")
    public String remarkName;
    public String remarkPinyin;
    public boolean searchIsBusinessAccount;
    public int searchType;

    @InterfaceC65349Pkn("sec_uid")
    public String secUid;

    @InterfaceC65349Pkn("secret")
    public boolean secret;

    @InterfaceC65349Pkn("short_id")
    public String shortId;

    @InterfaceC65349Pkn("signature")
    public String signature;
    public String sortWeight;

    @InterfaceC65349Pkn("invitation_status")
    public int taggedBAInvitationStatus;

    @InterfaceC65349Pkn("is_business_account")
    public boolean taggedIsBA;

    @InterfaceC65349Pkn("third_name")
    public String thirdName;

    @InterfaceC65349Pkn("uid")
    public String uid;

    @InterfaceC65349Pkn("verification_type")
    public int verificationType;

    @InterfaceC65349Pkn("video_mention_block_status")
    public long videoMentionBlockStatus;

    @InterfaceC65349Pkn("video_tag_block_status")
    public long videoTagBlockStatus;

    @InterfaceC65349Pkn("weibo_verify")
    public String weiboVerify;

    @InterfaceC65349Pkn("is_welcome_msg_enabled")
    public int welcomeMsgEnabled;
    public boolean withCommerceEntry;

    @InterfaceC65349Pkn("unique_id")
    public String uniqueId = "";

    @InterfaceC65349Pkn("is_mention_enabled")
    public boolean isMentionEnabled = true;

    @InterfaceC65349Pkn("can_share_message")
    public int shareStatus = getShareStatusDefault();
    public int internalShareHoldoutVersion = 0;
    public String recType = "";
    public int shareLinkRelationIndex = -1;
    public int disabledOnSharePanelReasonCode = 0;
    public boolean isOnline = false;

    public static boolean isFriend(int i) {
        return i == 2;
    }

    public int getShareStatusDefault() {
        return 1;
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public IMUser m136clone() {
        IMUser iMUser = new IMUser();
        iMUser.uid = this.uid;
        iMUser.secUid = this.secUid;
        iMUser.nickName = this.nickName;
        iMUser.signature = this.signature;
        iMUser.avatarThumb = this.avatarThumb;
        iMUser.followStatus = this.followStatus;
        iMUser.relationListItemType = this.relationListItemType;
        iMUser.uniqueId = this.uniqueId;
        iMUser.shortId = this.shortId;
        iMUser.weiboVerify = this.weiboVerify;
        iMUser.customVerify = this.customVerify;
        iMUser.enterpriseVerifyReason = this.enterpriseVerifyReason;
        iMUser.verificationType = this.verificationType;
        iMUser.remarkName = this.remarkName;
        iMUser.avatarStr = this.avatarStr;
        iMUser.initialLetter = this.initialLetter;
        iMUser.sortWeight = this.sortWeight;
        iMUser.remarkPinyin = this.remarkPinyin;
        iMUser.remarkInitial = this.remarkInitial;
        iMUser.nickNamePinyin = this.nickNamePinyin;
        iMUser.nickNameInitial = this.nickNameInitial;
        iMUser.isBlock = this.isBlock;
        iMUser.isBlocked = this.isBlocked;
        iMUser.commerceUserLevel = this.commerceUserLevel;
        iMUser.withCommerceEntry = this.withCommerceEntry;
        iMUser.hasUnreadStory = this.hasUnreadStory;
        iMUser.checkedUnreadStoryMillis = this.checkedUnreadStoryMillis;
        iMUser.contactName = this.contactName;
        iMUser.contactNamePinyin = this.contactNamePinyin;
        iMUser.contactNameInitial = this.contactNameInitial;
        iMUser.shareStatus = this.shareStatus;
        iMUser.enterprise = this.enterprise;
        iMUser.accountType = this.accountType;
        iMUser.isGroupOwner = this.isGroupOwner;
        iMUser.recommendReason = this.recommendReason;
        iMUser.followerStatus = this.followerStatus;
        iMUser.thirdName = this.thirdName;
        iMUser.recType = this.recType;
        iMUser.secret = this.secret;
        iMUser.followTime = this.followTime;
        iMUser.shareLinkRelationIndex = this.shareLinkRelationIndex;
        iMUser.isUserNotInAllFriends = this.isUserNotInAllFriends;
        iMUser.isUserEnabledQAInvite = this.isUserEnabledQAInvite;
        iMUser.qaPrivacyMessage = this.qaPrivacyMessage;
        iMUser.isMentionEnabled = this.isMentionEnabled;
        iMUser.commentMentionBlockStatus = this.commentMentionBlockStatus;
        iMUser.videoMentionBlockStatus = this.videoMentionBlockStatus;
        iMUser.videoTagBlockStatus = this.videoTagBlockStatus;
        iMUser.qaInviteBlockStatus = this.qaInviteBlockStatus;
        iMUser.followerCount = this.followerCount;
        iMUser.followingCount = this.followingCount;
        iMUser.internalShareHoldoutVersion = this.internalShareHoldoutVersion;
        iMUser.avatarMedium = this.avatarMedium;
        iMUser.canMessageFollowStatusList = this.canMessageFollowStatusList;
        iMUser.welcomeMsgEnabled = this.welcomeMsgEnabled;
        iMUser.taggedIsBA = this.taggedIsBA;
        iMUser.taggedBAInvitationStatus = this.taggedBAInvitationStatus;
        iMUser.enableDirectMessage = this.enableDirectMessage;
        iMUser.blockStatus = this.blockStatus;
        return iMUser;
    }

    public UrlModel getAvatarMedium() {
        if (this.avatarMedium == null && !TextUtils.isEmpty(this.avatarMediumStr)) {
            try {
                this.avatarMedium = (UrlModel) C75792yF.LIZ(this.avatarMediumStr, UrlModel.class);
            } catch (Exception e) {
                C34B.LJ("IMUser", e);
            }
        }
        return this.avatarMedium;
    }

    public UrlModel getAvatarThumb() {
        if (this.avatarThumb == null && !TextUtils.isEmpty(this.avatarStr)) {
            try {
                this.avatarThumb = (UrlModel) C75792yF.LIZ(this.avatarStr, UrlModel.class);
            } catch (Exception e) {
                C34B.LJ("IMUser", e);
            }
        }
        return this.avatarThumb;
    }

    public String getDisplayId() {
        if (TextUtils.isEmpty(this.uniqueId)) {
            return this.shortId;
        }
        return this.uniqueId;
    }

    @Override // com.ss.android.ugc.aweme.im.service.model.IMContact
    public String getDisplayName() {
        if (TextUtils.isEmpty(this.remarkName)) {
            return this.nickName;
        }
        return this.remarkName;
    }

    public int getFollowStatus() {
        if (isSelf(this.uid)) {
            return 2;
        }
        return this.followStatus;
    }

    @Override // com.ss.android.ugc.aweme.im.service.model.IMContact
    public UrlModel getDisplayAvatar() {
        return getAvatarThumb();
    }

    public int hashCode() {
        if (getUid() != null) {
            return getUid().hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("IMUser{uid='");
        Q89.LIZIZ(LIZ, this.uid, '\'', ", secUid='");
        Q89.LIZIZ(LIZ, this.secUid, '\'', ", nickName='");
        Q89.LIZIZ(LIZ, this.nickName, '\'', ", signature='");
        Q89.LIZIZ(LIZ, this.signature, '\'', ", avatarThumb=");
        LIZ.append(this.avatarThumb);
        LIZ.append(", followStatus=");
        LIZ.append(this.followStatus);
        LIZ.append(", uniqueId='");
        Q89.LIZIZ(LIZ, this.uniqueId, '\'', ", shortId='");
        Q89.LIZIZ(LIZ, this.shortId, '\'', ", weiboVerify='");
        Q89.LIZIZ(LIZ, this.weiboVerify, '\'', ", customVerify='");
        Q89.LIZIZ(LIZ, this.customVerify, '\'', ", enterpriseVerifyReason='");
        Q89.LIZIZ(LIZ, this.enterpriseVerifyReason, '\'', ", verificationType=");
        LIZ.append(this.verificationType);
        LIZ.append(", remarkName='");
        Q89.LIZIZ(LIZ, this.remarkName, '\'', ", commerceUserLevel=");
        LIZ.append(this.commerceUserLevel);
        LIZ.append(", contactName='");
        Q89.LIZIZ(LIZ, this.contactName, '\'', ", withCommerceEntry=");
        LIZ.append(this.withCommerceEntry);
        LIZ.append(", hasUnreadStory=");
        LIZ.append(this.hasUnreadStory);
        LIZ.append(", checkedUnreadStoryMillis=");
        LIZ.append(this.checkedUnreadStoryMillis);
        LIZ.append(", avatarStr='");
        Q89.LIZIZ(LIZ, this.avatarStr, '\'', ", sortWeight='");
        Q89.LIZIZ(LIZ, this.sortWeight, '\'', ", initialLetter='");
        Q89.LIZIZ(LIZ, this.initialLetter, '\'', ", remarkPinyin='");
        Q89.LIZIZ(LIZ, this.remarkPinyin, '\'', ", remarkInitial='");
        Q89.LIZIZ(LIZ, this.remarkInitial, '\'', ", nickNamePinyin='");
        Q89.LIZIZ(LIZ, this.nickNamePinyin, '\'', ", nickNameInitial='");
        Q89.LIZIZ(LIZ, this.nickNameInitial, '\'', ", contactNamePinyin='");
        Q89.LIZIZ(LIZ, this.contactNamePinyin, '\'', ", contactNameInitial='");
        Q89.LIZIZ(LIZ, this.contactNameInitial, '\'', ", shareStatus=");
        LIZ.append(this.shareStatus);
        LIZ.append(", searchType=");
        LIZ.append(this.searchType);
        LIZ.append(", isBlock=");
        LIZ.append(this.isBlock);
        LIZ.append(", isBlocked=");
        LIZ.append(this.isBlocked);
        LIZ.append(", isFake=");
        LIZ.append(this.isFake);
        LIZ.append(", friendRecType=");
        LIZ.append(this.friendRecType);
        LIZ.append(", friendRecTime=");
        LIZ.append(this.friendRecTime);
        LIZ.append(", enterprise=");
        LIZ.append(this.enterprise);
        LIZ.append(", accountType=");
        LIZ.append(this.accountType);
        LIZ.append(", followerStatus=");
        LIZ.append(this.followerStatus);
        LIZ.append(", followTime =");
        LIZ.append(this.followTime);
        LIZ.append(", secret=");
        LIZ.append(this.secret);
        LIZ.append(", isMentionEnabled=");
        LIZ.append(this.isMentionEnabled);
        LIZ.append(", commentMentionBlockStatus=");
        LIZ.append(this.commentMentionBlockStatus);
        LIZ.append(", videoMentionBlockStatus=");
        LIZ.append(this.videoMentionBlockStatus);
        LIZ.append(", videoTagBlockStatus=");
        LIZ.append(this.videoTagBlockStatus);
        LIZ.append(", qaInviteBlockStatus=");
        LIZ.append(this.qaInviteBlockStatus);
        LIZ.append(", followerCount=");
        LIZ.append(this.followerCount);
        LIZ.append(", followingCount=");
        LIZ.append(this.followingCount);
        LIZ.append(", internalShareHoldoutVersion=");
        LIZ.append(this.internalShareHoldoutVersion);
        LIZ.append(", avatarMedium=");
        LIZ.append(this.avatarMedium);
        LIZ.append(", canMessageFollowStatusList=");
        LIZ.append(this.canMessageFollowStatusList);
        LIZ.append(", welcomeMsgEnabled=");
        LIZ.append(this.welcomeMsgEnabled);
        LIZ.append(", taggedIsBA=");
        LIZ.append(this.taggedIsBA);
        LIZ.append(", taggedBAInvitationStatus=");
        LIZ.append(this.taggedBAInvitationStatus);
        LIZ.append(", enableDirectMessage=");
        LIZ.append(this.enableDirectMessage);
        LIZ.append(", blockStatus=");
        return b0.LIZJ(LIZ, this.blockStatus, '}', LIZ);
    }

    public int getAccountType() {
        return this.accountType;
    }

    public String getAvatarMediumStr() {
        return this.avatarMediumStr;
    }

    public String getAvatarStr() {
        return this.avatarStr;
    }

    public int getBlockStatus() {
        return this.blockStatus;
    }

    public List<Integer> getCanMessageFollowStatusList() {
        return this.canMessageFollowStatusList;
    }

    public long getCheckedUnreadStoryMillis() {
        return this.checkedUnreadStoryMillis;
    }

    public long getCommentMentionBlockStatus() {
        return this.commentMentionBlockStatus;
    }

    public int getCommerceUserLevel() {
        return this.commerceUserLevel;
    }

    public String getContactName() {
        return this.contactName;
    }

    public String getContactNameInitial() {
        return this.contactNameInitial;
    }

    public String getContactNamePinyin() {
        return this.contactNamePinyin;
    }

    public String getCustomVerify() {
        return this.customVerify;
    }

    public int getDisabledOnSharePanelReasonCode() {
        return this.disabledOnSharePanelReasonCode;
    }

    public boolean getEnterprise() {
        return this.enterprise;
    }

    public String getEnterpriseVerifyReason() {
        return this.enterpriseVerifyReason;
    }

    public long getFollowTime() {
        return this.followTime;
    }

    public int getFollowerCount() {
        return this.followerCount;
    }

    public int getFollowerStatus() {
        return this.followerStatus;
    }

    public int getFollowingCount() {
        return this.followingCount;
    }

    public long getFriendRecTime() {
        return this.friendRecTime;
    }

    public int getFriendRecType() {
        return this.friendRecType;
    }

    public String getInitialLetter() {
        return this.initialLetter;
    }

    public int getInternalShareHoldoutVersion() {
        return this.internalShareHoldoutVersion;
    }

    public boolean getIsUserNotInAllFriends() {
        return this.isUserNotInAllFriends;
    }

    @Override // com.ss.android.ugc.aweme.im.service.model.IMContact
    public String getNickName() {
        return this.nickName;
    }

    public String getNickNameInitial() {
        return this.nickNameInitial;
    }

    public String getNickNamePinyin() {
        return this.nickNamePinyin;
    }

    public long getQaInviteBlockStatus() {
        return this.qaInviteBlockStatus;
    }

    public String getQaPrivacyMessage() {
        return this.qaPrivacyMessage;
    }

    public String getRecType() {
        return this.recType;
    }

    public String getRecommendReason() {
        return this.recommendReason;
    }

    public String getRemarkInitial() {
        return this.remarkInitial;
    }

    public String getRemarkName() {
        return this.remarkName;
    }

    public String getRemarkPinyin() {
        return this.remarkPinyin;
    }

    public boolean getSearchIsBusinessAccount() {
        return this.searchIsBusinessAccount;
    }

    public int getSearchType() {
        return this.searchType;
    }

    public String getSecUid() {
        return this.secUid;
    }

    public int getShareLinkRelationIndex() {
        return this.shareLinkRelationIndex;
    }

    public int getShareStatus() {
        return this.shareStatus;
    }

    public String getShortId() {
        return this.shortId;
    }

    public String getSignature() {
        return this.signature;
    }

    public String getSortWeight() {
        return this.sortWeight;
    }

    public int getTaggedBAInvitationStatus() {
        return this.taggedBAInvitationStatus;
    }

    public boolean getTaggedIsBA() {
        return this.taggedIsBA;
    }

    public String getThirdName() {
        return this.thirdName;
    }

    public String getUid() {
        return this.uid;
    }

    public String getUniqueId() {
        return this.uniqueId;
    }

    public int getVerificationType() {
        return this.verificationType;
    }

    public long getVideoMentionBlockStatus() {
        return this.videoMentionBlockStatus;
    }

    public long getVideoTagBlockStatus() {
        return this.videoTagBlockStatus;
    }

    public String getWeiboVerify() {
        return this.weiboVerify;
    }

    public int getWelcomeMsgEnabled() {
        return this.welcomeMsgEnabled;
    }

    public boolean isBlock() {
        return this.isBlock;
    }

    public boolean isBlocked() {
        return this.isBlocked;
    }

    public boolean isEnableDirectMessage() {
        return this.enableDirectMessage;
    }

    public boolean isEnterprise() {
        return this.enterprise;
    }

    public boolean isFake() {
        return this.isFake;
    }

    public boolean isGroupOwner() {
        return this.isGroupOwner;
    }

    public boolean isHasUnreadStory() {
        return this.hasUnreadStory;
    }

    public boolean isMentionEnabled() {
        return this.isMentionEnabled;
    }

    public boolean isOnline() {
        return this.isOnline;
    }

    public boolean isSecret() {
        return this.secret;
    }

    public Boolean isUserEnabledQAInvite() {
        return this.isUserEnabledQAInvite;
    }

    public boolean isWithCommerceEntry() {
        return this.withCommerceEntry;
    }

    public static IMUser fromInteractionTagUser(InteractionTagUserInfo interactionTagUserInfo) {
        if (interactionTagUserInfo == null) {
            return null;
        }
        IMUser iMUser = new IMUser();
        iMUser.setUid(interactionTagUserInfo.getUid());
        iMUser.setNickName(interactionTagUserInfo.getNickname());
        iMUser.setAvatarThumb(interactionTagUserInfo.getAvatarThumb());
        if (interactionTagUserInfo.getFollowStatus() == 1 && interactionTagUserInfo.getFollowerStatus() == 1) {
            iMUser.setFollowStatus(2);
        } else {
            iMUser.setFollowStatus(interactionTagUserInfo.getFollowStatus());
        }
        iMUser.setFollowerStatus(interactionTagUserInfo.getFollowerStatus());
        iMUser.setUniqueId(interactionTagUserInfo.getUniqueId());
        iMUser.setCustomVerify(interactionTagUserInfo.getCustomVerify());
        iMUser.setEnterpriseVerifyReason(interactionTagUserInfo.getEnterpriseVerifyReason());
        iMUser.setCheckedUnreadStoryMillis(0L);
        iMUser.setTaggedIsBA(interactionTagUserInfo.isBusinessAccount());
        iMUser.setTaggedBAInvitationStatus(interactionTagUserInfo.getInvitationStatus());
        return iMUser;
    }

    public static IMUser fromUser(User user) {
        if (user == null) {
            return null;
        }
        IMUser iMUser = new IMUser();
        iMUser.setUid(user.getUid());
        iMUser.setSecUid(user.getSecUid());
        iMUser.setNickName(user.getNickname());
        iMUser.setSignature(user.getSignature());
        iMUser.setAvatarThumb(user.getAvatarThumb());
        boolean z = true;
        if (user.getFollowStatus() == 1 && user.getFollowerStatus() == 1) {
            iMUser.setFollowStatus(2);
        } else {
            iMUser.setFollowStatus(user.getFollowStatus());
        }
        iMUser.setFollowerStatus(user.getFollowerStatus());
        iMUser.setUniqueId(user.getUniqueId());
        iMUser.setShortId(user.getShortId());
        iMUser.setCustomVerify(user.getCustomVerify());
        iMUser.setEnterpriseVerifyReason(user.getEnterpriseVerifyReason());
        iMUser.setVerificationType(user.getVerificationType());
        iMUser.setRemarkName(user.getRemarkName());
        iMUser.setBlock(user.isBlock());
        iMUser.setBlocked(user.isBlocked());
        iMUser.setContactName(user.getContactName());
        iMUser.setCommerceUserLevel(user.getCommerceUserLevel());
        iMUser.setWithCommerceEntry(user.isWithCommerceEntry());
        iMUser.setCheckedUnreadStoryMillis(0L);
        if (user.getCommercePermission() == null || user.getCommercePermission().enterprise != 1) {
            z = false;
        }
        iMUser.setEnterprise(z);
        iMUser.setAccountType(user.getAccountType());
        iMUser.setRecommendReason(user.getRecommendReason());
        iMUser.setSecret(user.isSecret());
        iMUser.setFollowingCount(user.getFollowingCount());
        iMUser.setFollowerCount(user.getFollowerCount());
        iMUser.setAvatarMedium(user.getAvatarMedium());
        iMUser.setRecType(user.getAccurateRecType());
        iMUser.setCanMessageFollowStatusList(user.getCanMessageFollowStatusList());
        iMUser.setEnableDirectMessage(user.isEnableDirectMessage());
        iMUser.setBlockStatus(user.getBlockStatus());
        return iMUser;
    }

    public static boolean isInvalidUser(String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        try {
            if (CastLongProtector.parseLong(str) <= 0) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return true;
        }
    }

    public static boolean isSelf(String str) {
        IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
        if (createIUserServicebyMonsterPlugin == null) {
            return false;
        }
        return TextUtils.equals(createIUserServicebyMonsterPlugin.getCurrentUserID(), str);
    }

    public static InteractionTagUserInfo toInteractionTagUserInfo(IMUser iMUser) {
        InteractionTagUserInfo interactionTagUserInfo = new InteractionTagUserInfo();
        interactionTagUserInfo.setUid(iMUser.getUid());
        interactionTagUserInfo.setUniqueId(iMUser.getUniqueId());
        interactionTagUserInfo.setNickname(iMUser.getNickName());
        interactionTagUserInfo.setAvatarThumb(iMUser.getAvatarThumb());
        interactionTagUserInfo.setFollowStatus(iMUser.getFollowStatus());
        interactionTagUserInfo.setFollowerStatus(iMUser.getFollowerStatus());
        interactionTagUserInfo.setPrivateAccount(iMUser.isSecret() ? 1 : 0);
        interactionTagUserInfo.setCustomVerify(iMUser.getCustomVerify());
        interactionTagUserInfo.setEnterpriseVerifyReason(iMUser.getEnterpriseVerifyReason());
        interactionTagUserInfo.setBusinessAccount(iMUser.getTaggedIsBA());
        interactionTagUserInfo.setInvitationStatus(iMUser.getTaggedBAInvitationStatus());
        return interactionTagUserInfo;
    }

    public static User toUser(IMUser iMUser) {
        User user = new User();
        user.setUid(iMUser.getUid());
        user.setSecUid(iMUser.getSecUid());
        user.setNickname(iMUser.getNickName());
        user.setSignature(iMUser.getSignature());
        user.setAvatarThumb(iMUser.getAvatarThumb());
        user.setFollowStatus(iMUser.getFollowStatus());
        user.setUniqueId(iMUser.getUniqueId());
        user.setShortId(iMUser.getShortId());
        user.setCustomVerify(iMUser.getCustomVerify());
        user.setEnterpriseVerifyReason(iMUser.getEnterpriseVerifyReason());
        user.setVerificationType(iMUser.getVerificationType());
        user.setRemarkName(iMUser.getRemarkName());
        user.setBlock(iMUser.isBlock());
        user.setBlocked(iMUser.isBlocked());
        user.setCommerceUserLevel(iMUser.getCommerceUserLevel());
        user.setWithCommerceEntry(iMUser.isWithCommerceEntry());
        user.setRecommendReason(iMUser.getRecommendReason());
        user.setFollowerStatus(iMUser.getFollowerStatus());
        user.setSecret(iMUser.isSecret());
        user.setAccountType(iMUser.accountType);
        user.setFollowerCount(iMUser.followerCount);
        user.setFollowingCount(iMUser.followingCount);
        user.setAvatarMedium(iMUser.getAvatarMedium());
        user.setRecType(iMUser.getRecType());
        user.setCanMessageFollowStatusList(iMUser.getCanMessageFollowStatusList());
        user.setEnableDirectMessage(iMUser.isEnableDirectMessage());
        user.setBlockStatus(iMUser.getBlockStatus());
        return user;
    }

    public void copy(IMUser iMUser) {
        setUid(iMUser.getUid());
        setSecUid(iMUser.getSecUid());
        setNickName(iMUser.getNickName());
        setSignature(iMUser.getSignature());
        setAvatarThumb(iMUser.getAvatarThumb());
        setFollowStatus(iMUser.getFollowStatus());
        setUniqueId(iMUser.getUniqueId());
        setShortId(iMUser.getShortId());
        setWeiboVerify(iMUser.getWeiboVerify());
        setCustomVerify(iMUser.getCustomVerify());
        setEnterpriseVerifyReason(iMUser.getEnterpriseVerifyReason());
        setVerificationType(iMUser.getVerificationType());
        setRemarkName(iMUser.getRemarkName());
        setBlock(iMUser.isBlock());
        setBlocked(iMUser.isBlocked());
        setCommerceUserLevel(iMUser.getCommerceUserLevel());
        setWithCommerceEntry(iMUser.isWithCommerceEntry());
        setHasUnreadStory(iMUser.isHasUnreadStory());
        setCheckedUnreadStoryMillis(0L);
        setShareStatus(iMUser.getShareStatus());
        setEnterprise(iMUser.getEnterprise());
        setAccountType(iMUser.getAccountType());
        setRecommendReason(iMUser.recommendReason);
        setFollowerStatus(iMUser.followerStatus);
        setThirdName(iMUser.thirdName);
        setRecType(iMUser.recType);
        setSecret(iMUser.secret);
        setFollowTime(iMUser.followTime);
        setIsUserNotInAllFriends(iMUser.isUserNotInAllFriends);
        setUserEnabledQAInvite(iMUser.isUserEnabledQAInvite);
        setQaPrivacyMessage(iMUser.qaPrivacyMessage);
        setMentionEnabled(iMUser.isMentionEnabled);
        setCommentMentionBlockStatus(iMUser.commentMentionBlockStatus);
        setVideoTagBlockStatus(iMUser.videoTagBlockStatus);
        setVideoMentionBlockStatus(iMUser.videoMentionBlockStatus);
        setQaInviteBlockStatus(iMUser.qaInviteBlockStatus);
        setFollowingCount(iMUser.followingCount);
        setFollowerCount(iMUser.followerCount);
        setInternalShareHoldoutVersion(iMUser.internalShareHoldoutVersion);
        setAvatarMedium(iMUser.getAvatarMedium());
        setCanMessageFollowStatusList(iMUser.getCanMessageFollowStatusList());
        setWelcomeMsgEnabled(iMUser.welcomeMsgEnabled);
        setTaggedIsBA(iMUser.taggedIsBA);
        setEnableDirectMessage(iMUser.isEnableDirectMessage());
        setBlockStatus(iMUser.blockStatus);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IMUser)) {
            return false;
        }
        IMUser iMUser = (IMUser) obj;
        if (getUid() != null) {
            return getUid().equals(iMUser.getUid());
        }
        if (iMUser.getUid() == null) {
            return true;
        }
        return false;
    }

    public void setAccountType(int i) {
        this.accountType = i;
    }

    public void setAvatarMedium(UrlModel urlModel) {
        this.avatarMedium = urlModel;
        try {
            this.avatarMediumStr = C75792yF.LIZJ(urlModel);
        } catch (Exception e) {
            C34B.LJ("IMUser", e);
        }
    }

    public void setAvatarMediumStr(String str) {
        this.avatarMediumStr = str;
    }

    public void setAvatarStr(String str) {
        this.avatarStr = str;
    }

    public void setAvatarThumb(UrlModel urlModel) {
        this.avatarThumb = urlModel;
        try {
            this.avatarStr = C75792yF.LIZJ(urlModel);
        } catch (Exception e) {
            C34B.LJ("IMUser", e);
        }
    }

    public void setBlock(boolean z) {
        this.isBlock = z;
    }

    public void setBlockStatus(int i) {
        this.blockStatus = i;
    }

    public void setBlocked(boolean z) {
        this.isBlocked = z;
    }

    public void setCanMessageFollowStatusList(List<Integer> list) {
        this.canMessageFollowStatusList = list;
    }

    public void setCheckedUnreadStoryMillis(long j) {
        this.checkedUnreadStoryMillis = j;
    }

    public void setCommentMentionBlockStatus(long j) {
        this.commentMentionBlockStatus = j;
    }

    public void setCommerceUserLevel(int i) {
        this.commerceUserLevel = i;
    }

    public void setContactName(String str) {
        this.contactName = str;
    }

    public void setContactNameInitial(String str) {
        this.contactNameInitial = str;
    }

    public void setContactNamePinyin(String str) {
        this.contactNamePinyin = str;
    }

    public void setCustomVerify(String str) {
        this.customVerify = str;
    }

    public void setDisabledOnSharePanelReasonCode(int i) {
        this.disabledOnSharePanelReasonCode = i;
    }

    public void setEnableDirectMessage(boolean z) {
        this.enableDirectMessage = z;
    }

    public void setEnterprise(boolean z) {
        this.enterprise = z;
    }

    public void setEnterpriseVerifyReason(String str) {
        this.enterpriseVerifyReason = str;
    }

    public void setFake(boolean z) {
        this.isFake = z;
    }

    public void setFollowStatus(int i) {
        this.followStatus = i;
    }

    public void setFollowTime(long j) {
        this.followTime = j;
        this.friendRecTime = j * 1000;
    }

    public void setFollowerCount(int i) {
        this.followerCount = i;
    }

    public void setFollowerStatus(int i) {
        this.followerStatus = i;
    }

    public void setFollowingCount(int i) {
        this.followingCount = i;
    }

    public void setFriendRecTime(long j) {
        this.friendRecTime = j;
    }

    public void setFriendRecType(int i) {
        this.friendRecType = i;
    }

    public void setGroupOwner(boolean z) {
        this.isGroupOwner = z;
    }

    public void setHasUnreadStory(boolean z) {
        this.hasUnreadStory = z;
    }

    public void setInitialLetter(String str) {
        this.initialLetter = str;
    }

    public void setInternalShareHoldoutVersion(int i) {
        this.internalShareHoldoutVersion = i;
    }

    public void setIsUserNotInAllFriends(boolean z) {
        this.isUserNotInAllFriends = z;
    }

    public void setMentionEnabled(boolean z) {
        this.isMentionEnabled = z;
    }

    public void setNickName(String str) {
        this.nickName = str;
    }

    public void setNickNameInitial(String str) {
        this.nickNameInitial = str;
    }

    public void setNickNamePinyin(String str) {
        this.nickNamePinyin = str;
    }

    public void setOnline(boolean z) {
        this.isOnline = z;
    }

    public void setQaInviteBlockStatus(long j) {
        this.qaInviteBlockStatus = j;
    }

    public void setQaPrivacyMessage(String str) {
        this.qaPrivacyMessage = str;
    }

    public void setRecType(String str) {
        this.recType = str;
    }

    public void setRecommendReason(String str) {
        this.recommendReason = str;
    }

    public void setRemarkInitial(String str) {
        this.remarkInitial = str;
    }

    public void setRemarkName(String str) {
        this.remarkName = str;
    }

    public void setRemarkPinyin(String str) {
        this.remarkPinyin = str;
    }

    public void setSearchIsBusinessAccount(boolean z) {
        this.searchIsBusinessAccount = z;
    }

    public void setSearchType(int i) {
        this.searchType = i;
    }

    public void setSecUid(String str) {
        this.secUid = str;
    }

    public void setSecret(boolean z) {
        this.secret = z;
    }

    public void setShareLinkRelationIndex(int i) {
        this.shareLinkRelationIndex = i;
    }

    public void setShareStatus(int i) {
        this.shareStatus = i;
    }

    public void setShortId(String str) {
        this.shortId = str;
    }

    public void setSignature(String str) {
        this.signature = str;
    }

    public void setSortWeight(String str) {
        this.sortWeight = str;
    }

    public void setTaggedBAInvitationStatus(int i) {
        this.taggedBAInvitationStatus = i;
    }

    public void setTaggedIsBA(boolean z) {
        this.taggedIsBA = z;
    }

    public void setThirdName(String str) {
        this.thirdName = str;
    }

    public void setUid(String str) {
        this.uid = str;
    }

    public void setUniqueId(String str) {
        this.uniqueId = str;
    }

    public void setUserEnabledQAInvite(Boolean bool) {
        this.isUserEnabledQAInvite = bool;
    }

    public void setVerificationType(int i) {
        this.verificationType = i;
    }

    public void setVideoMentionBlockStatus(long j) {
        this.videoMentionBlockStatus = j;
    }

    public void setVideoTagBlockStatus(long j) {
        this.videoTagBlockStatus = j;
    }

    public void setWeiboVerify(String str) {
        this.weiboVerify = str;
    }

    public void setWelcomeMsgEnabled(int i) {
        this.welcomeMsgEnabled = i;
    }

    public void setWithCommerceEntry(boolean z) {
        this.withCommerceEntry = z;
    }
}
