package com.ss.android.ugc.aweme.feed.model.live;

import X.AbstractC36908Ee8;
import X.C08380Uo;
import X.C62850Ola;
import X.C69432nz;
import X.InterfaceC65316PkG;
import X.InterfaceC65349Pkn;
import X.InterfaceC65404Plg;
import X.Q89;
import X.X1D;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.feed.model.TVStationRoomStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;

/* loaded from: classes16.dex */
public class LiveRoomStruct extends AbstractC36908Ee8 implements InterfaceC65316PkG, Serializable {

    @InterfaceC65349Pkn("additional_stream_url")
    public StreamUrlStruct additional_stream_url;
    public long autoCover;

    @InterfaceC65349Pkn("blurred_cover")
    public UrlModel blurredCover;
    public Challenge challenge;

    @InterfaceC65349Pkn("challenge_info")
    public String challengeInfo;

    @InterfaceC65349Pkn("client_version")
    public String clientVersion;

    @InterfaceC65349Pkn("coins")
    public int coins;

    @InterfaceC65349Pkn("commerce_permission")
    public int commercePermission;

    @InterfaceC65349Pkn("commerce_info")
    public CommerceStruct commerceStruct;

    @InterfaceC65349Pkn("content_label")
    public LiveImageModel contentLabel;

    @InterfaceC65349Pkn("content_tag")
    public String contentTag;

    @InterfaceC65349Pkn("create_time")
    public long create_time;

    @InterfaceC65349Pkn("digg_count")
    public int digg_count;

    @InterfaceC65349Pkn("disable_preload_stream")
    public boolean disablePrePullStream;

    @InterfaceC65349Pkn("distance")
    public String distance;
    public String errorMsg;

    @InterfaceC65349Pkn("fyp_room_tags")
    public FeedRoomTagList feedRoomTagList;

    @InterfaceC65349Pkn("finish_time")
    public long finish_time;
    public int fromInnerPush;

    @InterfaceC65349Pkn("fyp_commerce_info")
    public FYPCommerceStruct fypCommerceStruct;

    @InterfaceC65349Pkn("has_commerce_goods")
    public boolean hasCommerceGoods;

    @InterfaceC65349Pkn("hashtag")
    public Hashtag hashTag;

    @InterfaceC65349Pkn(alternate = {"id"}, value = "room_id")
    public long id;

    @InterfaceC65349Pkn("in_sandbox")
    public boolean inSandbox;

    @InterfaceC65349Pkn("live_type_official")
    public boolean isOfficialType;

    @InterfaceC65349Pkn("live_type_screenshot")
    public boolean isScreenshot;
    public boolean isShow;

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

    @InterfaceC65349Pkn("live_total_time")
    public long liveTotalTime;

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
    public StreamUrlStruct multiStreamUrl;

    @InterfaceC65349Pkn("new_fans_count")
    public int newFansCount;

    @InterfaceC65349Pkn("operation_label")
    public LiveImageModel operationLabel;
    public String optionsSting;

    @InterfaceC65349Pkn("owner")
    public User owner;

    @InterfaceC65349Pkn("owner_user_id")
    public long ownerUserId;

    @InterfaceC65349Pkn("os_type")
    public int platform;
    public String prompts;

    @InterfaceC65349Pkn("activity")
    public RoomBuilding roomActivity;

    @InterfaceC65349Pkn(alternate = {"cover"}, value = "room_cover")
    public UrlModel roomCover;

    @InterfaceC65349Pkn("room_layout")
    public int roomLayout;

    @InterfaceC65349Pkn("room_type_tag")
    public String roomTypeTag;

    @InterfaceC65349Pkn("scm_label")
    public String scmLabel;

    @InterfaceC65349Pkn("share_info")
    public ShareStruct share_info;

    @InterfaceC65349Pkn("status")
    public int status;
    public int status_code;
    public String status_msg;

    @InterfaceC65349Pkn("stream_id")
    public long stream_id;

    @InterfaceC65349Pkn("stream_url")
    public StreamUrlStruct stream_url;

    @InterfaceC65349Pkn("title")
    public String title;

    @InterfaceC65349Pkn("top_frame_summary")
    public TopFrameSummary topFrameSummary;

    @InterfaceC65349Pkn("total_user")
    public int total_user;

    @InterfaceC65349Pkn("total_user_count")
    public int total_user_count;

    @InterfaceC65349Pkn("tv_station_room")
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

    public long getAnchorId() {
        User user = this.owner;
        if (user != null && !TextUtils.isEmpty(user.getUid())) {
            return CastLongProtector.parseLong(this.owner.getUid());
        }
        return 0L;
    }

    public Challenge getChallenge() {
        try {
            Challenge challenge = this.challenge;
            if (challenge == null) {
                Challenge awemeChallenge = ((LiveChallenge) C69432nz.LIZ().LJI(this.challengeInfo, LiveChallenge.class)).toAwemeChallenge();
                this.challenge = awemeChallenge;
                return awemeChallenge;
            }
            return challenge;
        } catch (Exception unused) {
            return null;
        }
    }

    public FypRecommendInfo getEcommerceFypRecommendInfo() {
        PreviewProductCardInfo previewProductCardInfo;
        FYPCommerceStruct fYPCommerceStruct = this.fypCommerceStruct;
        if (fYPCommerceStruct == null || (previewProductCardInfo = fYPCommerceStruct.getPreviewProductCardInfo()) == null) {
            return null;
        }
        return previewProductCardInfo.getRecommendInfo();
    }

    public String getLiveStudioExtraStreamData() {
        LiveCoreSDKData liveCoreSDKData;
        StreamUrlStruct streamUrlStruct = this.multiStreamUrl;
        if (streamUrlStruct != null && (liveCoreSDKData = streamUrlStruct.liveCoreSDKData) != null && liveCoreSDKData.getPullData() != null) {
            return this.multiStreamUrl.liveCoreSDKData.getPullData().getStreamData();
        }
        return null;
    }

    public String getLiveStudioExtraStreamDefaultPreviewQualitySdkKey() {
        LiveCoreSDKData liveCoreSDKData;
        StreamUrlStruct streamUrlStruct = this.multiStreamUrl;
        if (streamUrlStruct != null && (liveCoreSDKData = streamUrlStruct.liveCoreSDKData) != null && liveCoreSDKData.getDefaultPreviewQuality() != null) {
            return this.multiStreamUrl.liveCoreSDKData.getDefaultPreviewQuality().sdkKey;
        }
        return null;
    }

    public String getLiveStudioExtraStreamDefaultQualitySdkKey() {
        LiveCoreSDKData liveCoreSDKData;
        StreamUrlStruct streamUrlStruct = this.multiStreamUrl;
        if (streamUrlStruct != null && (liveCoreSDKData = streamUrlStruct.liveCoreSDKData) != null && liveCoreSDKData.getDefaultQuality() != null) {
            return this.multiStreamUrl.liveCoreSDKData.getDefaultQuality().sdkKey;
        }
        return null;
    }

    public LiveStreamUrlExtra getLiveStudioStreamUrlExtra() {
        StreamUrlStruct streamUrlStruct = this.multiStreamUrl;
        if (streamUrlStruct == null) {
            return null;
        }
        return streamUrlStruct.liveStreamUrlExtra;
    }

    public String getMultiStreamData() {
        LiveCoreSDKData liveCoreSDKData;
        StreamUrlStruct streamUrlStruct = this.stream_url;
        if (streamUrlStruct != null && (liveCoreSDKData = streamUrlStruct.liveCoreSDKData) != null && liveCoreSDKData.getPullData() != null) {
            return this.stream_url.liveCoreSDKData.getPullData().getStreamData();
        }
        return null;
    }

    public String getMultiStreamDefaultPreviewQualitySdkKey() {
        LiveCoreSDKData liveCoreSDKData;
        StreamUrlStruct streamUrlStruct = this.stream_url;
        if (streamUrlStruct != null && (liveCoreSDKData = streamUrlStruct.liveCoreSDKData) != null && liveCoreSDKData.getDefaultPreviewQuality() != null) {
            return this.stream_url.liveCoreSDKData.getDefaultPreviewQuality().sdkKey;
        }
        return null;
    }

    public String getMultiStreamDefaultQualitySdkKey() {
        LiveCoreSDKData liveCoreSDKData;
        StreamUrlStruct streamUrlStruct = this.stream_url;
        if (streamUrlStruct != null && (liveCoreSDKData = streamUrlStruct.liveCoreSDKData) != null && liveCoreSDKData.getDefaultQuality() != null) {
            return this.stream_url.liveCoreSDKData.getDefaultQuality().sdkKey;
        }
        return null;
    }

    public String getOptions() {
        StreamUrlStruct streamUrlStruct;
        LiveCoreSDKData liveCoreSDKData;
        if (TextUtils.isEmpty(this.optionsSting) && (streamUrlStruct = this.stream_url) != null && (liveCoreSDKData = streamUrlStruct.liveCoreSDKData) != null && liveCoreSDKData.getPullData() != null && this.stream_url.liveCoreSDKData.getPullData().getOptions() != null) {
            this.optionsSting = GsonProtectorUtils.toJson(C69432nz.LIZ(), this.stream_url.liveCoreSDKData.getPullData().getOptions());
        }
        return this.optionsSting;
    }

    public LiveStreamUrlExtra getStreamUrlExtra() {
        StreamUrlStruct streamUrlStruct = this.stream_url;
        if (streamUrlStruct == null) {
            return null;
        }
        return streamUrlStruct.liveStreamUrlExtra;
    }

    public String getTotalUserDes() {
        int i = this.total_user;
        if (i < 1000) {
            StringBuilder LIZ = X1D.LIZ();
            return C08380Uo.LIZ(LIZ, this.total_user, "", LIZ);
        }
        if (i > 1000000) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(new BigDecimal(this.total_user / 1000000.0f).setScale(1, RoundingMode.DOWN).floatValue());
            LIZ2.append("M");
            return X1D.LIZIZ(LIZ2);
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append(new BigDecimal(this.total_user / 1000.0f).setScale(1, RoundingMode.DOWN).floatValue());
        LIZ3.append("K");
        return X1D.LIZIZ(LIZ3);
    }

    public String getUserCountDes() {
        int i = this.user_count;
        if (i < 1000) {
            StringBuilder LIZ = X1D.LIZ();
            return C08380Uo.LIZ(LIZ, this.user_count, "", LIZ);
        }
        if (i > 1000000) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(new BigDecimal(this.user_count / 1000000.0f).setScale(1, RoundingMode.DOWN).floatValue());
            LIZ2.append("M");
            return X1D.LIZIZ(LIZ2);
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append(new BigDecimal(this.user_count / 1000.0f).setScale(1, RoundingMode.DOWN).floatValue());
        LIZ3.append("K");
        return X1D.LIZIZ(LIZ3);
    }

    public boolean isFinish() {
        if (this.status == 4) {
            return true;
        }
        return false;
    }

    public boolean isMediaRoom() {
        if (this.roomLayout == 1) {
            return true;
        }
        return false;
    }

    public boolean isPullUrlValid() {
        StreamUrlStruct streamUrlStruct = this.stream_url;
        if (streamUrlStruct != null && !TextUtils.isEmpty(streamUrlStruct.rtmp_pull_url)) {
            return true;
        }
        return false;
    }

    public LiveStreamUrlExtra getLiveStudioStreamUrlExtraSafely() {
        LiveStreamUrlExtra liveStudioStreamUrlExtra = getLiveStudioStreamUrlExtra();
        if (liveStudioStreamUrlExtra == null) {
            return new LiveStreamUrlExtra();
        }
        return liveStudioStreamUrlExtra;
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
        LIZ.append("LiveRoomStruct{mUserFrom=");
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
        LIZ.append(", create_time=");
        LIZ.append(this.create_time);
        LIZ.append(", finish_time=");
        LIZ.append(this.finish_time);
        LIZ.append(", stream_id=");
        LIZ.append(this.stream_id);
        LIZ.append(", additional_stream_url=");
        LIZ.append(this.additional_stream_url);
        LIZ.append(", share_info=");
        LIZ.append(this.share_info);
        LIZ.append(", digg_count=");
        LIZ.append(this.digg_count);
        LIZ.append(", coins=");
        LIZ.append(this.coins);
        LIZ.append(", inSandbox=");
        LIZ.append(this.inSandbox);
        LIZ.append(", total_user_count=");
        LIZ.append(this.total_user_count);
        LIZ.append(", roomActivity=");
        LIZ.append(this.roomActivity);
        LIZ.append(", roomCover=");
        LIZ.append(this.roomCover);
        LIZ.append(",blurredCover=");
        LIZ.append(this.blurredCover);
        LIZ.append(", roomTypeTag='");
        Q89.LIZIZ(LIZ, this.roomTypeTag, '\'', ", newFansCount=");
        LIZ.append(this.newFansCount);
        LIZ.append(", liveTypeAudio=");
        LIZ.append(this.liveTypeAudio);
        LIZ.append(", isThirdParty=");
        LIZ.append(this.isThirdParty);
        LIZ.append(", isScreenshot=");
        LIZ.append(this.isScreenshot);
        LIZ.append(", isOfficialType=");
        LIZ.append(this.isOfficialType);
        LIZ.append(", liveTotalTime=");
        LIZ.append(this.liveTotalTime);
        LIZ.append(", ownerUserId=");
        LIZ.append(this.ownerUserId);
        LIZ.append(", videoFeedTag='");
        Q89.LIZIZ(LIZ, this.videoFeedTag, '\'', ", withLinkmic=");
        LIZ.append(this.withLinkmic);
        LIZ.append(", distance='");
        Q89.LIZIZ(LIZ, this.distance, '\'', ", stream_url=");
        LIZ.append(this.stream_url);
        LIZ.append(", clientVersion='");
        Q89.LIZIZ(LIZ, this.clientVersion, '\'', ", platform=");
        LIZ.append(this.platform);
        LIZ.append(", errorMsg='");
        Q89.LIZIZ(LIZ, this.errorMsg, '\'', ", multi_stream_url='");
        LIZ.append(this.multiStreamUrl);
        LIZ.append('\'');
        LIZ.append(", multi_stream_id_str='");
        Q89.LIZIZ(LIZ, this.multiStreamIdStr, '\'', ", multi_stream_id='");
        C62850Ola.LJIIIIZZ(LIZ, this.multiStreamId, '\'', ", multi_stream_scene='");
        C62850Ola.LJIIIIZZ(LIZ, this.multiStreamScene, '\'', ", liveSubObly=");
        LIZ.append(this.liveSubOnly);
        LIZ.append("', live_room_mode='");
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

    public String getRoomTypeTag() {
        return this.roomTypeTag;
    }

    public TopFrameSummary getTopFrameSummary() {
        return this.topFrameSummary;
    }

    public long getUserFrom() {
        return this.mUserFrom;
    }

    public static boolean isValid(LiveRoomStruct liveRoomStruct) {
        if (liveRoomStruct != null && liveRoomStruct.id > 0 && liveRoomStruct.owner != null) {
            return true;
        }
        return false;
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
