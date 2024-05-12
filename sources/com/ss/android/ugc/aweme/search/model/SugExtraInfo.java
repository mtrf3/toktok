package com.ss.android.ugc.aweme.search.model;

import X.C38350F3i;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes9.dex */
public final class SugExtraInfo implements Serializable {

    @InterfaceC65349Pkn("can_message_follow_status_list")
    public final List<Integer> canMessageFollowStatusList;

    @InterfaceC65349Pkn("follower_status")
    public int followerStatus;

    @InterfaceC65349Pkn("is_business_account")
    public boolean isBusinessAccount;

    @InterfaceC65349Pkn("is_private_account")
    public boolean isPrivateAccount;

    @InterfaceC65349Pkn("matched_friend")
    public final String matchedFriendStruct;

    @InterfaceC65349Pkn("mention_block_type")
    public long mentionBlockType;

    @InterfaceC65349Pkn("rich_sug_follower_count")
    public Long totalFollowers;

    @InterfaceC65349Pkn("user_story_status")
    public final int userStoryStatus;

    @InterfaceC65349Pkn("is_rich_sug")
    public String isRichSugValue = "";

    @InterfaceC65349Pkn("sug_user_id")
    public String userId = "";

    @InterfaceC65349Pkn("sug_sec_user_id")
    public String secUserId = "";

    @InterfaceC65349Pkn("rich_sug_avatar_uri")
    public String userAvatarUri = "";

    @InterfaceC65349Pkn("rich_sug_nickname")
    public String userNickname = "";

    @InterfaceC65349Pkn("sug_uniq_id")
    public String username = "";

    @InterfaceC65349Pkn("relation_type")
    public String userRelationType = "";

    @InterfaceC65349Pkn("rich_sug_aweme_count")
    public String totalVideos = "";

    @InterfaceC65349Pkn("rich_sug_user_type")
    public String userTypeString = "";

    @InterfaceC65349Pkn("rich_sug_type")
    public String sugTypeString = "";

    @InterfaceC65349Pkn("is_history_sug")
    public final String isHistorySug = "";

    @InterfaceC65349Pkn("is_personalized")
    public final String isPersonalized = "";

    @InterfaceC65349Pkn("lang")
    public final String queryLang = "";

    @InterfaceC65349Pkn("recall_reason")
    public String recallReason = "";

    @InterfaceC65349Pkn("result_tab")
    public String resultTab = "";

    @InterfaceC65349Pkn("sug_hint")
    public String sugHint = "";

    @InterfaceC65349Pkn("is_creator_live")
    public String isCreatorLiveValue = "";

    @InterfaceC65349Pkn("is_live_query")
    public String isLiveQueryValue = "";

    @InterfaceC65349Pkn("sug_shop_id")
    public String sugShopId = "";

    @InterfaceC65349Pkn("words_type")
    public String wordsType = "";

    @InterfaceC65349Pkn("follow_status")
    public int followStatusFromApi = -1;

    @InterfaceC65349Pkn("followers_count")
    public final int followerCount = -1;

    @InterfaceC65349Pkn("aweme_count")
    public final int awemeCount = -1;

    @InterfaceC65349Pkn("use_generative_sug")
    public String useGenerativeSug = "";

    @InterfaceC65349Pkn("generative_display_starting_pos")
    public String generativeDisplayStartingPos = "";

    public static /* synthetic */ void getSugHint$annotations() {
    }

    public static /* synthetic */ void getUserRelationType$annotations() {
    }

    public final int getFollowStatus() {
        String str = this.userRelationType;
        if (o.LJ(str, "friends")) {
            return 2;
        }
        if (o.LJ(str, "following")) {
            return 1;
        }
        return 0;
    }

    public final Integer getGenerativeDisplayBegin() {
        String str = this.generativeDisplayStartingPos;
        if (str != null) {
            return C38350F3i.LJJIL(str);
        }
        return null;
    }

    public final boolean getHasUserRelation() {
        if (o.LJ(this.userRelationType, "friends") || o.LJ(this.userRelationType, "following")) {
            return true;
        }
        return false;
    }

    public final int getUserType() {
        Integer LJJIL;
        String str = this.userTypeString;
        if (str != null && (LJJIL = C38350F3i.LJJIL(str)) != null) {
            return LJJIL.intValue();
        }
        return -1;
    }

    public final boolean isCreatorLive() {
        return o.LJ(this.isCreatorLiveValue, "1");
    }

    public final boolean isGenerativeSug() {
        return o.LJ(this.useGenerativeSug, "1");
    }

    public final boolean isLiveQuery() {
        return o.LJ(this.isLiveQueryValue, "1");
    }

    public final boolean isRegularSugType() {
        Integer LJJIL;
        String str = this.sugTypeString;
        if (str == null || (LJJIL = C38350F3i.LJJIL(str)) == null || LJJIL.intValue() != 1) {
            return false;
        }
        return true;
    }

    public final boolean isRelationSugType() {
        Integer LJJIL;
        String str = this.sugTypeString;
        if (str == null || (LJJIL = C38350F3i.LJJIL(str)) == null || LJJIL.intValue() != 2) {
            return false;
        }
        return true;
    }

    public final boolean isRichSug() {
        return o.LJ(this.isRichSugValue, "1");
    }

    public final boolean isVerifiedUser() {
        Integer LJJIL;
        String str = this.userTypeString;
        if (str == null || (LJJIL = C38350F3i.LJJIL(str)) == null || LJJIL.intValue() != 1) {
            return false;
        }
        return true;
    }

    public final boolean matchQuery() {
        return s.LJLJJL(this.recallReason, new String[]{"|"}, 0, 6).contains("origin_query");
    }

    public final int getAwemeCount() {
        return this.awemeCount;
    }

    public final List<Integer> getCanMessageFollowStatusList() {
        return this.canMessageFollowStatusList;
    }

    public final int getFollowStatusFromApi() {
        return this.followStatusFromApi;
    }

    public final int getFollowerCount() {
        return this.followerCount;
    }

    public final int getFollowerStatus() {
        return this.followerStatus;
    }

    public final String getGenerativeDisplayStartingPos() {
        return this.generativeDisplayStartingPos;
    }

    public final String getMatchedFriendStruct() {
        return this.matchedFriendStruct;
    }

    public final long getMentionBlockType() {
        return this.mentionBlockType;
    }

    public final String getQueryLang() {
        return this.queryLang;
    }

    public final String getRecallReason() {
        return this.recallReason;
    }

    public final String getResultTab() {
        return this.resultTab;
    }

    public final String getSecUserId() {
        return this.secUserId;
    }

    public final String getSugHint() {
        return this.sugHint;
    }

    public final String getSugShopId() {
        return this.sugShopId;
    }

    public final Long getTotalFollowers() {
        return this.totalFollowers;
    }

    public final String getTotalVideos() {
        return this.totalVideos;
    }

    public final String getUseGenerativeSug() {
        return this.useGenerativeSug;
    }

    public final String getUserAvatarUri() {
        return this.userAvatarUri;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getUserNickname() {
        return this.userNickname;
    }

    public final String getUserRelationType() {
        return this.userRelationType;
    }

    public final int getUserStoryStatus() {
        return this.userStoryStatus;
    }

    public final String getUserTypeString() {
        return this.userTypeString;
    }

    public final String getUsername() {
        return this.username;
    }

    public final String getWordsType() {
        return this.wordsType;
    }

    public final boolean isBusinessAccount() {
        return this.isBusinessAccount;
    }

    public final String isCreatorLiveValue() {
        return this.isCreatorLiveValue;
    }

    public final String isHistorySug() {
        return this.isHistorySug;
    }

    public final String isPersonalized() {
        return this.isPersonalized;
    }

    public final boolean isPrivateAccount() {
        return this.isPrivateAccount;
    }

    public final String isRichSugValue() {
        return this.isRichSugValue;
    }

    public final void setBusinessAccount(boolean z) {
        this.isBusinessAccount = z;
    }

    public final void setCreatorLiveValue(String str) {
        this.isCreatorLiveValue = str;
    }

    public final void setFollowStatusFromApi(int i) {
        this.followStatusFromApi = i;
    }

    public final void setFollowerStatus(int i) {
        this.followerStatus = i;
    }

    public final void setGenerativeDisplayStartingPos(String str) {
        this.generativeDisplayStartingPos = str;
    }

    public final void setMentionBlockType(long j) {
        this.mentionBlockType = j;
    }

    public final void setPrivateAccount(boolean z) {
        this.isPrivateAccount = z;
    }

    public final void setRecallReason(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.recallReason = str;
    }

    public final void setResultTab(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.resultTab = str;
    }

    public final void setRichSugValue(String str) {
        this.isRichSugValue = str;
    }

    public final void setSecUserId(String str) {
        this.secUserId = str;
    }

    public final void setSugHint(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.sugHint = str;
    }

    public final void setSugShopId(String str) {
        this.sugShopId = str;
    }

    public final void setTotalFollowers(Long l) {
        this.totalFollowers = l;
    }

    public final void setTotalVideos(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.totalVideos = str;
    }

    public final void setUseGenerativeSug(String str) {
        this.useGenerativeSug = str;
    }

    public final void setUserAvatarUri(String str) {
        this.userAvatarUri = str;
    }

    public final void setUserId(String str) {
        this.userId = str;
    }

    public final void setUserNickname(String str) {
        this.userNickname = str;
    }

    public final void setUserRelationType(String str) {
        this.userRelationType = str;
    }

    public final void setUserTypeString(String str) {
        this.userTypeString = str;
    }

    public final void setUsername(String str) {
        this.username = str;
    }

    public final void setWordsType(String str) {
        this.wordsType = str;
    }
}
