package com.bytedance.android.livesdk.event;

import com.bytedance.android.live.base.model.user.User;
import java.util.Map;

/* loaded from: classes6.dex */
public class UserProfileEvent {
    public String cardEnterFrom;
    public String chatType;
    public String clickMethod;
    public String clickModule;
    public boolean coHostEnable;
    public String content;
    public boolean currentHasMultiCoHostPermission;
    public long currentMultiCoHostGuestId;
    public int disableNavigateBadgeType;
    public Map<String, String> extraParams;
    public String interactLogLabel;
    public boolean isFromProgrammedLiveFollowCard;
    public boolean isFromProgrammedLiveMenu;
    public boolean linkInRoomEnable;
    public String mClickUserPosition;
    public Boolean mEnterFromRankList;
    public String mEventModule;
    public String mEventPage;
    public Map<String, String> mRankInfo;
    public String mReportType;
    public String mShowEntrance;
    public String mSource;
    public long msgId;
    public long pinId;
    public long pinMsgId;
    public long releaseId;
    public long roomId;
    public Map<String, String> trackExtra;
    public User user;
    public long userId;

    public Boolean getEnterFromRankList() {
        return this.mEnterFromRankList;
    }

    public UserProfileEvent(User user) {
        this.mEnterFromRankList = Boolean.FALSE;
        this.mEventPage = null;
        this.content = "";
        this.clickModule = "";
        this.clickMethod = "";
        this.coHostEnable = false;
        this.linkInRoomEnable = true;
        this.currentHasMultiCoHostPermission = false;
        this.chatType = "1";
        this.mReportType = "report_anchor";
        this.isFromProgrammedLiveMenu = false;
        this.isFromProgrammedLiveFollowCard = false;
        this.cardEnterFrom = "";
        this.disableNavigateBadgeType = -1;
        if (user != null) {
            this.user = user;
            return;
        }
        throw new RuntimeException("mUser cannot be null!");
    }

    public void setClickModule(String str) {
        this.clickModule = str;
    }

    public void setClickUserPosition(String str) {
        this.mClickUserPosition = str;
    }

    public void setEnterFromRankList(Boolean bool) {
        this.mEnterFromRankList = bool;
    }

    public void setEventModule(String str) {
        this.mEventModule = str;
    }

    public void setExtraParams(Map<String, String> map) {
        this.extraParams = map;
    }

    public UserProfileEvent(long j) {
        this.mEnterFromRankList = Boolean.FALSE;
        this.mEventPage = null;
        this.content = "";
        this.clickModule = "";
        this.clickMethod = "";
        this.coHostEnable = false;
        this.linkInRoomEnable = true;
        this.currentHasMultiCoHostPermission = false;
        this.chatType = "1";
        this.mReportType = "report_anchor";
        this.isFromProgrammedLiveMenu = false;
        this.isFromProgrammedLiveFollowCard = false;
        this.cardEnterFrom = "";
        this.disableNavigateBadgeType = -1;
        this.userId = j;
    }

    public UserProfileEvent(long j, String str) {
        this.mEnterFromRankList = Boolean.FALSE;
        this.mEventPage = null;
        this.content = "";
        this.clickMethod = "";
        this.coHostEnable = false;
        this.linkInRoomEnable = true;
        this.currentHasMultiCoHostPermission = false;
        this.chatType = "1";
        this.mReportType = "report_anchor";
        this.isFromProgrammedLiveMenu = false;
        this.isFromProgrammedLiveFollowCard = false;
        this.cardEnterFrom = "";
        this.disableNavigateBadgeType = -1;
        this.userId = j;
        this.clickModule = str;
    }

    public UserProfileEvent(User user, String str) {
        this(user);
        this.interactLogLabel = str;
    }
}
