package com.bytedance.android.livesdk.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.message.proto.ToolBarManagement;
import com.bytedance.android.livesdkapi.depend.model.live.AnchorLevelPermission;

/* loaded from: classes6.dex */
public class RoomAuthStatus extends F9E {

    @InterfaceC65349Pkn("GiftAnchorMt")
    public int anchorGiftType;

    @InterfaceC65349Pkn("anchor_level_permission")
    public AnchorLevelPermission anchorLevelPermission;

    @InterfaceC65349Pkn("GoldenEnvelope")
    public int anchorRedEnvelopeType;

    @InterfaceC65349Pkn("Banner")
    public int bannerState;

    @InterfaceC65349Pkn("BroadcastMessage")
    public Long broadcastmessage;

    @InterfaceC65349Pkn("ChatSubOnly")
    public boolean chatSubOnly;

    @InterfaceC65349Pkn("CommunityFlaggedReview")
    public boolean commentFlaggedReviewSwitch;

    @InterfaceC65349Pkn("CommunityFlagged")
    public boolean commentFlaggedSwitch;

    @InterfaceC65349Pkn("CustomizablePoll")
    public Long customizablepoll = 0L;

    @InterfaceC65349Pkn("deprecated1")
    public Boolean deprecated1;

    @InterfaceC65349Pkn("deprecated2")
    public Long deprecated2;

    @InterfaceC65349Pkn("deprecated3")
    public Long deprecated3;

    @InterfaceC65349Pkn("deprecated4")
    public Long deprecated4;

    @InterfaceC65349Pkn("deprecated5")
    public Long deprecated5;

    @InterfaceC65349Pkn("deprecated6")
    public Long deprecated6;

    @InterfaceC65349Pkn("deprecated7")
    public Long deprecated7;

    @InterfaceC65349Pkn("deprecated8")
    public Long deprecated8;

    @InterfaceC65349Pkn("deprecated9")
    public Long deprecated9;

    @InterfaceC65349Pkn("DonationSticker")
    public int donationSticker;

    @InterfaceC65349Pkn("ShoppingRanking")
    public int ecRankSwitchStatus;

    @InterfaceC65349Pkn("GoldenEnvelopeActivity")
    public int enableActivityTreasureBox;

    @InterfaceC65349Pkn("Chat")
    public boolean enableChat;

    @InterfaceC65349Pkn("ChatL2")
    public boolean enableChatL2;

    @InterfaceC65349Pkn("Danmaku")
    public boolean enableDanmaku;

    @InterfaceC65349Pkn("Digg")
    public boolean enableDigg;

    @InterfaceC65349Pkn("Pictionary")
    public long enableDrawGuess;

    @InterfaceC65349Pkn("Gift")
    public boolean enableGift;

    @InterfaceC65349Pkn("GiftPoll")
    public int enableGiftPoll;

    @InterfaceC65349Pkn("LuckMoney")
    public boolean enableLuckMoney;

    @InterfaceC65349Pkn("Poll")
    public int enablePoll;

    @InterfaceC65349Pkn("Promote")
    public boolean enablePromote;

    @InterfaceC65349Pkn("Props")
    public boolean enableProps;

    @InterfaceC65349Pkn("InteractionQuestion")
    public boolean enableQuestion;

    @InterfaceC65349Pkn("RoomContributor")
    public boolean enableRoomContributor;

    @InterfaceC65349Pkn("Share")
    public boolean enableShare;

    @InterfaceC65349Pkn("Viewers")
    public boolean enableViewers;

    @InterfaceC65349Pkn("EnableFansLevel")
    public boolean enablefanslevel;

    @InterfaceC65349Pkn("EventPromotion")
    public int eventpromotion;

    @InterfaceC65349Pkn("Explore")
    public boolean exploreEnabled;

    @InterfaceC65349Pkn("GameRankingSwitch")
    public int gamerankingswitch;

    @InterfaceC65349Pkn("transaction_history")
    public int giftRankSwitchStatus;

    @InterfaceC65349Pkn("IsMultiCohost")
    public boolean isMultiCohost;

    @InterfaceC65349Pkn("Landscape")
    public int landscape;

    @InterfaceC65349Pkn("LandscapeChat")
    public Long landscapechat;

    @InterfaceC65349Pkn("PublicScreen")
    public int messageType;

    @InterfaceC65349Pkn("MultiEnableReserve")
    public boolean multienablereserve;

    @InterfaceC65349Pkn("PictionaryBubble")
    public long pictionarybubble;

    @InterfaceC65349Pkn("PictionaryPermission")
    public long pictionarypermission;

    @InterfaceC65349Pkn("PromoteOther")
    public int promoteOther;

    @InterfaceC65349Pkn("QuickChat")
    public int quickCommentState;

    @InterfaceC65349Pkn("Rank")
    public int rankState;

    @InterfaceC65349Pkn("OffReason")
    public RoomAuthOffReasons roomAuthOffReasons;

    @InterfaceC65349Pkn("SecretRoom")
    public long secretroom;

    @InterfaceC65349Pkn("ToolBarManagement")
    public ToolBarManagement toolbarmanagement;

    @InterfaceC65349Pkn("use_user_pv")
    public boolean useUserPV;

    @InterfaceC65349Pkn("UserCount")
    public int userCountDisplayState;

    @InterfaceC65349Pkn("UserCard")
    public Boolean usercard;

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.enableChat), Boolean.valueOf(this.enableDanmaku), Boolean.valueOf(this.enableGift), Boolean.valueOf(this.enableProps), Boolean.valueOf(this.enableDigg), Boolean.valueOf(this.enableLuckMoney), Boolean.valueOf(this.enableRoomContributor), Integer.valueOf(this.bannerState), Integer.valueOf(this.anchorGiftType), Integer.valueOf(this.messageType), Integer.valueOf(this.donationSticker), Boolean.valueOf(this.enableShare), Boolean.valueOf(this.enableViewers), Integer.valueOf(this.anchorRedEnvelopeType), Boolean.valueOf(this.enableChatL2), Boolean.valueOf(this.commentFlaggedSwitch), Boolean.valueOf(this.commentFlaggedReviewSwitch)};
    }

    public boolean isAnchorEnvelopeRevoke() {
        if (this.anchorRedEnvelopeType == 3) {
            return true;
        }
        return false;
    }

    public boolean isAnchorGiftEnable() {
        if (this.anchorGiftType != 2) {
            return true;
        }
        return false;
    }

    public boolean isBannerEnable() {
        if (this.bannerState != 2) {
            return true;
        }
        return false;
    }

    public boolean isEnableLandscape() {
        if (this.landscape != 2) {
            return true;
        }
        return false;
    }

    public boolean isEnableStickerDonation() {
        if (this.donationSticker == 1) {
            return true;
        }
        return false;
    }

    public boolean isMessageEnable() {
        if (this.messageType != 2) {
            return true;
        }
        return false;
    }

    public boolean showActivityTreasureBox() {
        if (this.enableActivityTreasureBox == 1) {
            return true;
        }
        return false;
    }

    public boolean showRedEnvelope() {
        int i = this.anchorRedEnvelopeType;
        if (i == 1 || i == 3) {
            return true;
        }
        return false;
    }

    public int getBannerState() {
        return this.bannerState;
    }

    public int getGiftRankSwitchStatus() {
        return this.giftRankSwitchStatus;
    }

    public int getLandscape() {
        return this.landscape;
    }

    public int getPromoteOther() {
        return this.promoteOther;
    }

    public int getPublicScreenAuth() {
        return this.messageType;
    }

    public int getQuickCommentState() {
        return this.quickCommentState;
    }

    public int getRankState() {
        return this.rankState;
    }

    public RoomAuthOffReasons getRoomAuthOffReasons() {
        return this.roomAuthOffReasons;
    }

    public int getUserCountDisplayState() {
        return this.userCountDisplayState;
    }

    public boolean isChatL2Enabled() {
        return this.enableChatL2;
    }

    public boolean isEnableChat() {
        return this.enableChat;
    }

    public boolean isEnableDanmaku() {
        return this.enableDanmaku;
    }

    public boolean isEnableDigg() {
        return this.enableDigg;
    }

    public boolean isEnableGift() {
        return this.enableGift;
    }

    public boolean isEnableLuckMoney() {
        return this.enableLuckMoney;
    }

    public boolean isEnablePromote() {
        return this.enablePromote;
    }

    public boolean isEnableProps() {
        return this.enableProps;
    }

    public boolean isEnableQuestion() {
        return this.enableQuestion;
    }

    public boolean isEnableRoomContributor() {
        return this.enableRoomContributor;
    }

    public boolean isEnableShare() {
        return this.enableShare;
    }

    public boolean isEnableViewers() {
        return this.enableViewers;
    }

    public boolean isExploreEnabled() {
        return this.exploreEnabled;
    }

    public boolean isMultiCohost() {
        return this.isMultiCohost;
    }

    public boolean isUseUserPV() {
        return this.useUserPV;
    }

    public void setBannerState(int i) {
        this.bannerState = i;
    }

    public void setChatL2Enabled(boolean z) {
        this.enableChatL2 = z;
    }

    public void setEnableChat(boolean z) {
        this.enableChat = z;
    }

    public void setEnableDanmaku(boolean z) {
        this.enableDanmaku = z;
    }

    public void setEnableDigg(boolean z) {
        this.enableDigg = z;
    }

    public void setEnableGift(boolean z) {
        this.enableGift = z;
    }

    public void setEnableLuckMoney(boolean z) {
        this.enableLuckMoney = z;
    }

    public void setEnablePromote(boolean z) {
        this.enablePromote = z;
    }

    public void setEnableProps(boolean z) {
        this.enableProps = z;
    }

    public void setEnableQuestion(boolean z) {
        this.enableQuestion = z;
    }

    public void setEnableRoomContributor(boolean z) {
        this.enableRoomContributor = z;
    }

    public void setEnableViewers(boolean z) {
        this.enableViewers = z;
    }

    public void setExploreEnabled(boolean z) {
        this.exploreEnabled = z;
    }

    public void setGiftRankSwitchStatus(int i) {
        this.giftRankSwitchStatus = i;
    }

    public void setLandscape(int i) {
        this.landscape = i;
    }

    public void setMultiCohost(boolean z) {
        this.isMultiCohost = z;
    }

    public void setPromoteOther(int i) {
        this.promoteOther = i;
    }

    public void setRankState(int i) {
        this.rankState = i;
    }

    public void setUserCountDisplayState(int i) {
        this.userCountDisplayState = i;
    }
}
