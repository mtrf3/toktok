package com.ss.android.ugc.aweme.feed.model.live;

import X.AbstractC36908Ee8;
import X.C62850Ola;
import X.C69432nz;
import X.InterfaceC65316PkG;
import X.InterfaceC65349Pkn;
import X.InterfaceC65404Plg;
import X.Q89;
import X.X1D;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.feed.model.TVStationRoomStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;

/* loaded from: classes16.dex */
public class NewLiveRoomStruct extends AbstractC36908Ee8 implements InterfaceC65316PkG, Serializable {

    @InterfaceC65349Pkn("auto_cover")
    public long autoCover;

    @InterfaceC65349Pkn("blurred_cover")
    public UrlModel blurredCover;
    public Challenge challenge;

    @InterfaceC65349Pkn("challenge_info")
    public String challengeInfo;

    @InterfaceC65349Pkn("client_version")
    public String clientVersion;

    @InterfaceC65349Pkn("commerce_info")
    public CommerceStruct commerceStruct;

    @InterfaceC65349Pkn("content_label")
    public LiveImageModel contentLabel;

    @InterfaceC65349Pkn("content_tag")
    public String contentTag;

    @InterfaceC65349Pkn("disable_preload_stream")
    public boolean disablePrePullStream;
    public String errorMsg;

    @InterfaceC65349Pkn("fyp_room_tags")
    public FeedRoomTagList feedRoomTagList;

    @InterfaceC65349Pkn("fyp_commerce_info")
    public FYPCommerceStruct fypCommerceStruct;

    @InterfaceC65349Pkn("has_commerce_goods")
    public boolean hasCommerceGoods;

    @InterfaceC65349Pkn("hashtag")
    public Hashtag hashTag;

    @InterfaceC65349Pkn(alternate = {"id"}, value = "room_id")
    public long id;

    @InterfaceC65349Pkn("live_type_official")
    public boolean isOfficialType;

    @InterfaceC65349Pkn("live_type_screenshot")
    public boolean isScreenshot;

    @InterfaceC65349Pkn("live_type_third_party")
    public boolean isThirdParty;

    @InterfaceC65349Pkn("link_mic")
    @InterfaceC65404Plg(RawStringJsonAdapter.class)
    public String linkMic;

    @InterfaceC65349Pkn("linkmic_layout")
    public long linkMicLayout;

    @InterfaceC65349Pkn("live_event_info")
    public LiveEventInfo liveEventInfo;

    @InterfaceC65349Pkn("live_reason")
    public String liveReason;

    @InterfaceC65349Pkn("live_room_mode")
    public int liveRoomMode;

    @InterfaceC65349Pkn("live_sub_only")
    public long liveSubOnly;

    @InterfaceC65349Pkn("live_type_audio")
    public boolean liveTypeAudio;
    public String mRequestId;
    public long mUserFrom;

    @InterfaceC65349Pkn("mask_layer")
    public MaskLayer maskLayer;
    public String message;

    @InterfaceC65349Pkn("multi_stream_id")
    public long multiStreamId;

    @InterfaceC65349Pkn("multi_stream_scene")
    public long multiStreamScene;

    @InterfaceC65349Pkn("multi_stream_url")
    public LiveStreamUrl multiStreamUrl;

    @InterfaceC65349Pkn("operation_label")
    public LiveImageModel operationLabel;
    public String optionsSting;

    @InterfaceC65349Pkn("owner")
    public LiveUser owner;

    @InterfaceC65349Pkn("owner_user_id")
    public long ownerUserId;

    @InterfaceC65349Pkn("os_type")
    public int platform;
    public String prompts;

    @InterfaceC65349Pkn("room_auth")
    public RoomAuthStatus roomAuthStatus;

    @InterfaceC65349Pkn(alternate = {"cover"}, value = "room_cover")
    public UrlModel roomCover;

    @InterfaceC65349Pkn("room_layout")
    public int roomLayout;

    @InterfaceC65349Pkn("stats")
    public RoomStas roomStas;

    @InterfaceC65349Pkn("status")
    public int status;
    public int status_code;
    public String status_msg;

    @InterfaceC65349Pkn("stream_url")
    public LiveStreamUrl stream_url;

    @InterfaceC65349Pkn("title")
    public String title;

    @InterfaceC65349Pkn("top_frame_summary")
    public TopFrameSummary topFrameSummary;

    @InterfaceC65349Pkn("tv")
    public TVStationRoomStruct tvStationRoomStruct;
    public long userId;

    @InterfaceC65349Pkn("user_count")
    public int user_count;

    @InterfaceC65349Pkn("video_feed_tag")
    public String videoFeedTag;

    @InterfaceC65349Pkn("warning_tag")
    public WarningTag warningTag;

    @InterfaceC65349Pkn("with_linkmic")
    public boolean withLinkmic;
    public int roomType = 3;

    @InterfaceC65349Pkn("allow_preview_time")
    public long allowPreviewTime = -1;

    @InterfaceC65349Pkn("max_preview_time")
    public long maxPreviewTime = -1;

    @InterfaceC65349Pkn("multi_stream_id_str")
    public String multiStreamIdStr = "";

    public boolean getAutoCover() {
        if (this.autoCover == 1) {
            return true;
        }
        return false;
    }

    public Challenge getChallenge() {
        try {
            if (this.challenge == null) {
                this.challenge = (Challenge) C69432nz.LIZ().LJI(this.challengeInfo, Challenge.class);
            }
            return this.challenge;
        } catch (Exception unused) {
            return null;
        }
    }

    public String getLiveStudioExtraSdkParams() {
        LiveStreamUrl liveStreamUrl = this.multiStreamUrl;
        if (liveStreamUrl == null) {
            return null;
        }
        return getLiveStudioExtraSdkParams(liveStreamUrl.defaultQualityName);
    }

    public String getLiveStudioExtraStreamData() {
        LiveStreamUrl liveStreamUrl = this.multiStreamUrl;
        if (liveStreamUrl != null && liveStreamUrl.getLiveCoreSDKData() != null && this.multiStreamUrl.getLiveCoreSDKData().getPullData() != null) {
            return this.multiStreamUrl.getLiveCoreSDKData().getPullData().getStreamData();
        }
        return null;
    }

    public String getLiveStudioExtraStreamDefaultQualitySdkKey() {
        LiveStreamUrl liveStreamUrl = this.multiStreamUrl;
        if (liveStreamUrl != null && liveStreamUrl.getLiveCoreSDKData() != null && this.multiStreamUrl.getLiveCoreSDKData().getDefaultQuality() != null) {
            return this.multiStreamUrl.getLiveCoreSDKData().getDefaultQuality().sdkKey;
        }
        return null;
    }

    public LiveStreamUrlExtra getLiveStudioStreamUrlExtra() {
        LiveStreamUrl liveStreamUrl = this.multiStreamUrl;
        if (liveStreamUrl == null) {
            return null;
        }
        return liveStreamUrl.getExtra();
    }

    public boolean getLiveSubOnlyEnable() {
        if (this.liveSubOnly == 1) {
            return true;
        }
        return false;
    }

    public String getMultiStreamData() {
        LiveStreamUrl liveStreamUrl = this.stream_url;
        if (liveStreamUrl != null && liveStreamUrl.getLiveCoreSDKData() != null && this.stream_url.getLiveCoreSDKData().getPullData() != null) {
            return this.stream_url.getLiveCoreSDKData().getPullData().getStreamData();
        }
        return null;
    }

    public String getMultiStreamDefaultPreviewQualitySdkKey() {
        LiveStreamUrl liveStreamUrl = this.stream_url;
        if (liveStreamUrl != null && liveStreamUrl.getLiveCoreSDKData() != null && this.stream_url.getLiveCoreSDKData().getDefaultPreviewQuality() != null) {
            return this.stream_url.getLiveCoreSDKData().getDefaultPreviewQuality().sdkKey;
        }
        return null;
    }

    public String getMultiStreamDefaultQualitySdkKey() {
        LiveStreamUrl liveStreamUrl = this.stream_url;
        if (liveStreamUrl != null && liveStreamUrl.getLiveCoreSDKData() != null && this.stream_url.getLiveCoreSDKData().getDefaultQuality() != null) {
            return this.stream_url.getLiveCoreSDKData().getDefaultQuality().sdkKey;
        }
        return null;
    }

    public String getOptions() {
        LiveStreamUrl liveStreamUrl;
        if (TextUtils.isEmpty(this.optionsSting) && (liveStreamUrl = this.stream_url) != null && liveStreamUrl.getLiveCoreSDKData() != null && this.stream_url.getLiveCoreSDKData().getPullData() != null && this.stream_url.getLiveCoreSDKData().getPullData().getOptions() != null) {
            this.optionsSting = GsonProtectorUtils.toJson(C69432nz.LIZ(), this.stream_url.getLiveCoreSDKData().getPullData().getOptions());
        }
        return this.optionsSting;
    }

    public String getSdkParams() {
        LiveStreamUrl liveStreamUrl = this.stream_url;
        if (liveStreamUrl == null) {
            return null;
        }
        return getSdkParams(liveStreamUrl.defaultQualityName);
    }

    public LiveStreamUrlExtra getStreamUrlExtra() {
        LiveStreamUrl liveStreamUrl = this.stream_url;
        if (liveStreamUrl == null) {
            return null;
        }
        return liveStreamUrl.getExtra();
    }

    public void init() {
        LiveStreamUrl liveStreamUrl = this.stream_url;
        if (liveStreamUrl != null) {
            liveStreamUrl.validatePullUrl();
            if (this.stream_url.getLiveCoreSDKData() != null) {
                this.stream_url.validateMultiPullData();
            }
        }
        LiveStreamUrl liveStreamUrl2 = this.multiStreamUrl;
        if (liveStreamUrl2 != null) {
            liveStreamUrl2.validatePullUrl();
            if (this.multiStreamUrl.getLiveCoreSDKData() != null) {
                this.multiStreamUrl.validateMultiPullData();
            }
        }
    }

    public boolean isFinish() {
        if (this.status == 4) {
            return true;
        }
        return false;
    }

    public boolean isPullUrlValid() {
        LiveStreamUrl liveStreamUrl = this.stream_url;
        if (liveStreamUrl != null && !TextUtils.isEmpty(liveStreamUrl.rtmp_pull_url)) {
            return true;
        }
        return false;
    }

    public LiveRoomStruct roomStructConstructor() {
        LiveRoomStruct liveRoomStruct = new LiveRoomStruct();
        StreamUrlStruct streamUrlStruct = new StreamUrlStruct();
        StreamUrlStruct streamUrlStruct2 = new StreamUrlStruct();
        LiveStreamUrl liveStreamUrl = this.stream_url;
        if (liveStreamUrl != null) {
            streamUrlStruct.liveCoreSDKData = liveStreamUrl.liveCoreSDKData;
            streamUrlStruct.liveStreamUrlExtra = getStreamUrlExtraSafely();
            LiveStreamUrl liveStreamUrl2 = this.stream_url;
            streamUrlStruct.mCandidateResolutionList = liveStreamUrl2.candidateResolution;
            streamUrlStruct.mDefaultResolution = liveStreamUrl2.defaultResolution;
            streamUrlStruct.mFlvPullUrlMap = liveStreamUrl2.flvPullUrl;
            streamUrlStruct.provider = liveStreamUrl2.provider;
            streamUrlStruct.rtmp_pull_url = liveStreamUrl2.rtmp_pull_url;
            streamUrlStruct.rtmp_push_url = liveStreamUrl2.rtmp_push_url;
            streamUrlStruct.sid = liveStreamUrl2.id;
            streamUrlStruct.sdkParams = getSdkParams();
        }
        LiveStreamUrl liveStreamUrl3 = this.multiStreamUrl;
        if (liveStreamUrl3 != null) {
            streamUrlStruct2.liveCoreSDKData = liveStreamUrl3.liveCoreSDKData;
            streamUrlStruct2.liveStreamUrlExtra = getStreamUrlExtraSafely();
            LiveStreamUrl liveStreamUrl4 = this.multiStreamUrl;
            streamUrlStruct2.mCandidateResolutionList = liveStreamUrl4.candidateResolution;
            streamUrlStruct2.mDefaultResolution = liveStreamUrl4.defaultResolution;
            streamUrlStruct2.mFlvPullUrlMap = liveStreamUrl4.flvPullUrl;
            streamUrlStruct2.provider = liveStreamUrl4.provider;
            streamUrlStruct2.rtmp_pull_url = liveStreamUrl4.rtmp_pull_url;
            streamUrlStruct2.rtmp_push_url = liveStreamUrl4.rtmp_push_url;
            streamUrlStruct2.sid = liveStreamUrl4.id;
            streamUrlStruct2.sdkParams = getLiveStudioExtraSdkParams();
        }
        User user = new User();
        LiveUser liveUser = this.owner;
        if (liveUser != null) {
            user.setUid(String.valueOf(liveUser.id));
            user.setSecUid(this.owner.secUid);
            user.setShortId(String.valueOf(this.owner.shortId));
            user.setNickname(this.owner.nickname);
            user.setAvatarLarger(this.owner.avatarLarger);
            user.setAvatarMedium(this.owner.avatarMedium);
            user.setAvatarThumb(this.owner.avatarThumb);
            boolean z = true;
            if (this.owner.secret != 1) {
                z = false;
            }
            user.setSecret(z);
            FollowInfo followInfo = this.owner.followInfo;
            if (followInfo != null) {
                user.setFollowStatus((int) followInfo.followStatus);
            }
            user.setUniqueId(this.owner.uniqueId);
            user.authenticationInfo = this.owner.authenticationInfo;
        }
        RoomStas roomStas = this.roomStas;
        if (roomStas != null) {
            liveRoomStruct.total_user = roomStas.totalUser;
        }
        liveRoomStruct.id = this.id;
        liveRoomStruct.status = this.status;
        liveRoomStruct.owner = user;
        liveRoomStruct.title = this.title;
        liveRoomStruct.user_count = this.user_count;
        liveRoomStruct.roomCover = this.roomCover;
        liveRoomStruct.blurredCover = this.blurredCover;
        liveRoomStruct.liveTypeAudio = this.liveTypeAudio;
        liveRoomStruct.isThirdParty = this.isThirdParty;
        liveRoomStruct.isScreenshot = this.isScreenshot;
        liveRoomStruct.isOfficialType = this.isOfficialType;
        liveRoomStruct.ownerUserId = this.ownerUserId;
        liveRoomStruct.videoFeedTag = this.videoFeedTag;
        liveRoomStruct.liveReason = this.liveReason;
        liveRoomStruct.withLinkmic = this.withLinkmic;
        long j = this.liveSubOnly;
        liveRoomStruct.stream_url = streamUrlStruct;
        liveRoomStruct.clientVersion = this.clientVersion;
        liveRoomStruct.platform = this.platform;
        liveRoomStruct.tvStationRoomStruct = this.tvStationRoomStruct;
        liveRoomStruct.challengeInfo = this.challengeInfo;
        liveRoomStruct.roomLayout = this.roomLayout;
        liveRoomStruct.contentLabel = this.contentLabel;
        liveRoomStruct.operationLabel = this.operationLabel;
        liveRoomStruct.contentTag = this.contentTag;
        liveRoomStruct.linkMicLayout = this.linkMicLayout;
        liveRoomStruct.autoCover = this.autoCover;
        liveRoomStruct.disablePrePullStream = this.disablePrePullStream;
        liveRoomStruct.allowPreviewTime = this.allowPreviewTime;
        liveRoomStruct.maxPreviewTime = this.maxPreviewTime;
        liveRoomStruct.liveEventInfo = this.liveEventInfo;
        liveRoomStruct.linkMic = this.linkMic;
        liveRoomStruct.warningTag = this.warningTag;
        liveRoomStruct.maskLayer = this.maskLayer;
        liveRoomStruct.commerceStruct = this.commerceStruct;
        liveRoomStruct.hasCommerceGoods = this.hasCommerceGoods;
        liveRoomStruct.liveSubOnly = j;
        RoomAuthStatus roomAuthStatus = this.roomAuthStatus;
        if (roomAuthStatus != null) {
            liveRoomStruct.commercePermission = roomAuthStatus.getCommercePermission();
        }
        liveRoomStruct.fypCommerceStruct = this.fypCommerceStruct;
        liveRoomStruct.feedRoomTagList = this.feedRoomTagList;
        liveRoomStruct.scmLabel = this.owner.scmLabel;
        liveRoomStruct.topFrameSummary = this.topFrameSummary;
        liveRoomStruct.multiStreamUrl = streamUrlStruct2;
        liveRoomStruct.multiStreamIdStr = this.multiStreamIdStr;
        liveRoomStruct.multiStreamId = this.multiStreamId;
        liveRoomStruct.multiStreamScene = this.multiStreamScene;
        liveRoomStruct.liveRoomMode = this.liveRoomMode;
        liveRoomStruct.hashTag = this.hashTag;
        return liveRoomStruct;
    }

    public LiveStreamUrlExtra getStreamUrlExtraSafely() {
        LiveStreamUrlExtra streamUrlExtra = getStreamUrlExtra();
        if (streamUrlExtra == null) {
            return new LiveStreamUrlExtra();
        }
        return streamUrlExtra;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NewLiveRoomStruct{mUserFrom=");
        LIZ.append(this.mUserFrom);
        LIZ.append(", mRequestId='");
        Q89.LIZIZ(LIZ, this.mRequestId, '\'', ", status_code=");
        LIZ.append(this.status_code);
        LIZ.append(", message='");
        Q89.LIZIZ(LIZ, this.message, '\'', ", status_msg='");
        Q89.LIZIZ(LIZ, this.status_msg, '\'', ", prompts='");
        Q89.LIZIZ(LIZ, this.prompts, '\'', ", userId=");
        LIZ.append(this.userId);
        LIZ.append(", roomType=");
        LIZ.append(this.roomType);
        LIZ.append(", id=");
        LIZ.append(this.id);
        LIZ.append(", status=");
        LIZ.append(this.status);
        LIZ.append(", owner=");
        LIZ.append(this.owner);
        LIZ.append(", title='");
        Q89.LIZIZ(LIZ, this.title, '\'', ", user_count=");
        LIZ.append(this.user_count);
        LIZ.append(", roomCover=");
        LIZ.append(this.roomCover);
        LIZ.append(",blurredCover=");
        LIZ.append(this.blurredCover);
        LIZ.append(", liveTypeAudio=");
        LIZ.append(this.liveTypeAudio);
        LIZ.append(", isThirdParty=");
        LIZ.append(this.isThirdParty);
        LIZ.append(", isScreenshot=");
        LIZ.append(this.isScreenshot);
        LIZ.append(", isOfficialType=");
        LIZ.append(this.isOfficialType);
        LIZ.append(", ownerUserId=");
        LIZ.append(this.ownerUserId);
        LIZ.append(", videoFeedTag='");
        Q89.LIZIZ(LIZ, this.videoFeedTag, '\'', ", withLinkmic=");
        LIZ.append(this.withLinkmic);
        LIZ.append(", stream_url=");
        LIZ.append(this.stream_url);
        LIZ.append(", clientVersion='");
        Q89.LIZIZ(LIZ, this.clientVersion, '\'', ", platform=");
        LIZ.append(this.platform);
        LIZ.append(", tvStationRoomStruct=");
        LIZ.append(this.tvStationRoomStruct);
        LIZ.append(", errorMsg='");
        Q89.LIZIZ(LIZ, this.errorMsg, '\'', ", autoCover='");
        C62850Ola.LJIIIIZZ(LIZ, this.autoCover, '\'', ", multi_stream_url='");
        LIZ.append(this.multiStreamUrl);
        LIZ.append('\'');
        LIZ.append(", multi_stream_id_str='");
        Q89.LIZIZ(LIZ, this.multiStreamIdStr, '\'', ", multi_stream_id='");
        C62850Ola.LJIIIIZZ(LIZ, this.multiStreamId, '\'', ", multi_stream_scene='");
        C62850Ola.LJIIIIZZ(LIZ, this.multiStreamScene, '\'', ", liveSubOnly='");
        C62850Ola.LJIIIIZZ(LIZ, this.liveSubOnly, '\'', ", live_room_mode='");
        LIZ.append(this.liveRoomMode);
        LIZ.append('\'');
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    public String getChallengeInfo() {
        return this.challengeInfo;
    }

    public LiveImageModel getContentLabel() {
        return this.contentLabel;
    }

    public String getContentTag() {
        return this.contentTag;
    }

    public LiveImageModel getOperationLabel() {
        return this.operationLabel;
    }

    @Override // X.InterfaceC65316PkG
    public String getRequestId() {
        return this.mRequestId;
    }

    public TopFrameSummary getTopFrameSummary() {
        return this.topFrameSummary;
    }

    public long getUserFrom() {
        return this.mUserFrom;
    }

    public static boolean isValid(NewLiveRoomStruct newLiveRoomStruct) {
        if (newLiveRoomStruct != null && newLiveRoomStruct.id > 0 && newLiveRoomStruct.owner != null) {
            return true;
        }
        return false;
    }

    public String getLiveStudioExtraSdkParams(String str) {
        LiveStreamUrl liveStreamUrl = this.multiStreamUrl;
        if (liveStreamUrl == null) {
            return null;
        }
        return liveStreamUrl.sdkParamsMap.get(str);
    }

    public String getSdkParams(String str) {
        LiveStreamUrl liveStreamUrl = this.stream_url;
        if (liveStreamUrl == null) {
            return null;
        }
        return liveStreamUrl.sdkParamsMap.get(str);
    }

    public void setChallengeInfo(String str) {
        this.challengeInfo = str;
    }

    public void setContentLabel(LiveImageModel liveImageModel) {
        this.contentLabel = liveImageModel;
    }

    public void setContentTag(String str) {
        this.contentTag = str;
    }

    public void setOperationLabel(LiveImageModel liveImageModel) {
        this.operationLabel = liveImageModel;
    }

    @Override // X.InterfaceC65316PkG
    public void setRequestId(String str) {
        this.mRequestId = str;
    }

    public void setTopFrameSummary(TopFrameSummary topFrameSummary) {
        this.topFrameSummary = topFrameSummary;
    }

    public void setUserFrom(long j) {
        this.mUserFrom = j;
    }
}
