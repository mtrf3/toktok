package com.bytedance.android.livesdkapi.depend.model.live;

import X.C09650Zl;
import X.C32364Cn2;
import X.InterfaceC65349Pkn;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.MaskLayer;
import com.bytedance.android.livesdk.model.WarningTag;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import java.util.List;

/* loaded from: classes6.dex */
public class SlimRoom {

    @InterfaceC65349Pkn("caption_info")
    public CaptionInfo captionInfo;

    @InterfaceC65349Pkn("client_version")
    public String clientVersion;

    @InterfaceC65349Pkn("has_commerce_goods")
    public boolean hasCommerceGoods;

    @InterfaceC65349Pkn("id")
    public long id;

    @InterfaceC65349Pkn("live_type_screenshot")
    public boolean isScreenshot;

    @InterfaceC65349Pkn("live_type_third_party")
    public boolean isThirdParty;

    @InterfaceC65349Pkn("common_label_list")
    public String labels;

    @InterfaceC65349Pkn("layout")
    public long layout;

    @InterfaceC65349Pkn("link_mic")
    public LinkMic linkMic;

    @InterfaceC65349Pkn("live_room_mode")
    public int liveRoomMode;

    @InterfaceC65349Pkn("live_type_audio")
    public boolean liveTypeAudio;

    @InterfaceC65349Pkn("mask_layer")
    public MaskLayer maskLayer;

    @InterfaceC65349Pkn("multi_stream_id")
    public long multiStreamId;

    @InterfaceC65349Pkn("multi_stream_id_str")
    public String multiStreamIdStr = "";

    @InterfaceC65349Pkn("multi_stream_scene")
    public long multiStreamScene;

    @InterfaceC65349Pkn("multi_stream_url")
    public StreamUrl multiStreamUrl;
    public String optionsSting;

    @InterfaceC65349Pkn("orientation")
    public int orientation;

    @InterfaceC65349Pkn("owner_user_id")
    public long ownerUserId;

    @InterfaceC65349Pkn("os_type")
    public int platform;

    @InterfaceC65349Pkn("private_info")
    public String privateInfo;

    @InterfaceC65349Pkn("room_auth")
    public RoomAuthStatus roomAuthStatus;

    @InterfaceC65349Pkn("stream_url")
    public StreamUrl streamUrl;

    @InterfaceC65349Pkn("title")
    public String title;

    @InterfaceC65349Pkn("warning_tag")
    public WarningTag warningTag;

    /* loaded from: classes10.dex */
    public static class LinkMic {

        @InterfaceC65349Pkn("audience_id_list")
        public List<Long> audienceIdList;

        @InterfaceC65349Pkn("followed_count")
        public int followedCount;

        @InterfaceC65349Pkn("show_user_list")
        public List<User> followedList;
    }

    /* loaded from: classes10.dex */
    public static class RoomAuthStatus {

        @InterfaceC65349Pkn("CommercePermission")
        public int commercePermission;
    }

    public String buildExtraSreamPullUrl() {
        StreamUrl streamUrl = this.multiStreamUrl;
        if (streamUrl == null) {
            return null;
        }
        String str = streamUrl.qualityMap.get(streamUrl.LIZJ);
        if (str == null) {
            return null;
        }
        C32364Cn2 c32364Cn2 = new C32364Cn2(str);
        c32364Cn2.LIZ(this.platform, "anchor_device_platform");
        c32364Cn2.LIZJ("anchor_version", this.clientVersion);
        c32364Cn2.LIZIZ(this.id, "room_id");
        c32364Cn2.LIZIZ(this.ownerUserId, "anchor_id");
        return c32364Cn2.LIZLLL();
    }

    public String buildPullUrl() {
        StreamUrl streamUrl = this.streamUrl;
        if (streamUrl == null) {
            return null;
        }
        return buildPullUrl(streamUrl.LIZJ);
    }

    public String getExtraSdkParams() {
        StreamUrl streamUrl = this.multiStreamUrl;
        if (streamUrl == null) {
            return null;
        }
        return getExtraSdkParams(streamUrl.LIZJ);
    }

    public String getExtraStreamData() {
        LiveCoreSDKData liveCoreSDKData;
        StreamUrl streamUrl = this.multiStreamUrl;
        if (streamUrl == null || (liveCoreSDKData = streamUrl.liveCoreSDKData) == null || liveCoreSDKData.getPullData() == null) {
            return null;
        }
        return this.multiStreamUrl.liveCoreSDKData.getPullData().getStreamData();
    }

    public String getExtraStreamDefaultQualitySdkKey() {
        LiveCoreSDKData liveCoreSDKData;
        StreamUrl streamUrl = this.multiStreamUrl;
        if (streamUrl == null || (liveCoreSDKData = streamUrl.liveCoreSDKData) == null || liveCoreSDKData.getDefaultQuality() == null) {
            return null;
        }
        return this.multiStreamUrl.liveCoreSDKData.getDefaultQuality().sdkKey;
    }

    public StreamUrlExtra getExtraStreamUrlExtra() {
        StreamUrlExtra streamUrlExtra;
        StreamUrl streamUrl = this.multiStreamUrl;
        if (streamUrl == null || (streamUrlExtra = streamUrl.extra) == null) {
            return new StreamUrlExtra();
        }
        return streamUrlExtra;
    }

    public String getMultiStreamData() {
        LiveCoreSDKData liveCoreSDKData;
        StreamUrl streamUrl = this.streamUrl;
        if (streamUrl == null || (liveCoreSDKData = streamUrl.liveCoreSDKData) == null || liveCoreSDKData.getPullData() == null) {
            return null;
        }
        return this.streamUrl.liveCoreSDKData.getPullData().getStreamData();
    }

    public String getMultiStreamDefaultQualitySdkKey() {
        LiveCoreSDKData liveCoreSDKData;
        StreamUrl streamUrl = this.streamUrl;
        if (streamUrl == null || (liveCoreSDKData = streamUrl.liveCoreSDKData) == null || liveCoreSDKData.getDefaultQuality() == null) {
            return null;
        }
        return this.streamUrl.liveCoreSDKData.getDefaultQuality().sdkKey;
    }

    public String getOptions() {
        LiveCoreSDKData liveCoreSDKData;
        StreamUrl streamUrl = this.streamUrl;
        if (streamUrl == null || (liveCoreSDKData = streamUrl.liveCoreSDKData) == null || liveCoreSDKData.getPullData() == null || this.streamUrl.liveCoreSDKData.getPullData().getOptions() == null) {
            return null;
        }
        if (TextUtils.isEmpty(this.optionsSting)) {
            this.optionsSting = GsonProtectorUtils.toJson(C09650Zl.LIZJ, this.streamUrl.liveCoreSDKData.getPullData().getOptions());
        }
        return this.optionsSting;
    }

    public String getSdkParams() {
        StreamUrl streamUrl = this.streamUrl;
        if (streamUrl == null) {
            return null;
        }
        return getSdkParams(streamUrl.LIZJ);
    }

    public LiveMode getStreamType() {
        if (this.layout == 1) {
            return LiveMode.OFFICIAL_ACTIVITY;
        }
        if (this.isScreenshot) {
            return LiveMode.SCREEN_RECORD;
        }
        if (this.isThirdParty) {
            return LiveMode.THIRD_PARTY;
        }
        if (this.liveTypeAudio) {
            return LiveMode.AUDIO;
        }
        if (this.liveRoomMode == 7) {
            return LiveMode.LIVE_VOICE;
        }
        return LiveMode.VIDEO;
    }

    public StreamUrlExtra getStreamUrlExtra() {
        StreamUrl streamUrl = this.streamUrl;
        if (streamUrl == null) {
            return null;
        }
        return streamUrl.extra;
    }

    public void init() {
        StreamUrl streamUrl = this.streamUrl;
        if (streamUrl != null) {
            streamUrl.LIZJ();
            StreamUrl streamUrl2 = this.streamUrl;
            if (streamUrl2.liveCoreSDKData != null) {
                streamUrl2.LIZIZ();
            }
        }
        StreamUrl streamUrl3 = this.multiStreamUrl;
        if (streamUrl3 != null) {
            streamUrl3.LIZJ();
            StreamUrl streamUrl4 = this.multiStreamUrl;
            if (streamUrl4.liveCoreSDKData != null) {
                streamUrl4.LIZIZ();
            }
        }
    }

    public StreamUrlExtra getStreamUrlExtraSafely() {
        StreamUrlExtra streamUrlExtra = getStreamUrlExtra();
        if (streamUrlExtra == null) {
            return new StreamUrlExtra();
        }
        return streamUrlExtra;
    }

    public String getClientVersion() {
        return this.clientVersion;
    }

    public long getId() {
        return this.id;
    }

    public String getLabels() {
        return this.labels;
    }

    public long getLayout() {
        return this.layout;
    }

    public LinkMic getLinkMic() {
        return this.linkMic;
    }

    public int getOrientation() {
        return this.orientation;
    }

    public long getOwnerUserId() {
        return this.ownerUserId;
    }

    public int getPlatform() {
        return this.platform;
    }

    public String getPrivateInfo() {
        return this.privateInfo;
    }

    public StreamUrl getStreamUrl() {
        return this.streamUrl;
    }

    public boolean isLiveTypeScreenshot() {
        return this.isScreenshot;
    }

    public String buildPullUrl(String str) {
        String str2;
        StreamUrl streamUrl = this.streamUrl;
        if (streamUrl == null || (str2 = streamUrl.qualityMap.get(str)) == null) {
            return null;
        }
        C32364Cn2 c32364Cn2 = new C32364Cn2(str2);
        c32364Cn2.LIZ(this.platform, "anchor_device_platform");
        c32364Cn2.LIZJ("anchor_version", this.clientVersion);
        c32364Cn2.LIZIZ(this.id, "room_id");
        c32364Cn2.LIZIZ(this.ownerUserId, "anchor_id");
        return c32364Cn2.LIZLLL();
    }

    public String getExtraSdkParams(String str) {
        StreamUrl streamUrl = this.multiStreamUrl;
        if (streamUrl == null) {
            return null;
        }
        return streamUrl.sdkParamsMap.get(str);
    }

    public String getSdkParams(String str) {
        StreamUrl streamUrl = this.streamUrl;
        if (streamUrl == null) {
            return null;
        }
        return streamUrl.sdkParamsMap.get(str);
    }

    public void setClientVersion(String str) {
        this.clientVersion = str;
    }

    public void setId(long j) {
        this.id = j;
    }

    public void setLabels(String str) {
        this.labels = str;
    }

    public void setLayout(long j) {
        this.layout = j;
    }

    public void setLinkMic(LinkMic linkMic) {
        this.linkMic = linkMic;
    }

    public void setLiveTypeScreenshot(boolean z) {
        this.isScreenshot = z;
    }

    public void setOrientation(int i) {
        this.orientation = i;
    }

    public void setOwnerUserId(long j) {
        this.ownerUserId = j;
    }

    public void setPlatform(int i) {
        this.platform = i;
    }

    public void setPrivateInfo(String str) {
        this.privateInfo = str;
    }

    public void setStreamUrl(StreamUrl streamUrl) {
        this.streamUrl = streamUrl;
    }
}
