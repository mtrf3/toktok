package com.ss.android.ugc.aweme.feed.model;

import X.IZ8;
import X.InterfaceC65349Pkn;
import X.O5Y;
import X.Q89;
import X.X1D;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.discover.model.VideoTag;
import com.ss.android.ugc.aweme.feed.model.video.PillarBoxVideoInfo;
import com.ss.android.ugc.aweme.feed.model.video.PlayTokenAuth;
import defpackage.q;
import java.io.Serializable;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class Video implements Serializable {

    @InterfaceC65349Pkn("ai_static_cover")
    public UrlModel aiCover;

    @InterfaceC65349Pkn("ai_dynamic_cover")
    public UrlModel aiDynamicCover;

    @InterfaceC65349Pkn("ai_dynamic_cover_bak")
    public UrlModel aiDynamicCoverBak;

    @InterfaceC65349Pkn("animated_cover")
    public UrlModel animatedCover;
    public float aspectRatio;

    @InterfaceC65349Pkn("big_thumbs")
    public List<BigThumb> bigThumbs;

    @InterfaceC65349Pkn("bit_rate")
    public List<BitRate> bitRate;

    @InterfaceC65349Pkn("bit_rate_audio")
    public List<BitrateAudioStruct> bitRateAudio;
    public int[] cachedOuterCoverSize;
    public UrlModel cachedOuterCoverUrl;

    @InterfaceC65349Pkn("caption_download_addr")
    public UrlModel captionDownloadAddr;

    @InterfaceC65349Pkn("cla_info")
    public CaptionModel captionModel;

    @InterfaceC65349Pkn("cdn_url_expired")
    public long cdnUrlExpired;

    @InterfaceC65349Pkn("cover")
    public UrlModel cover;

    @InterfaceC65349Pkn("CoverTsp")
    public double coverTsp;

    @InterfaceC65349Pkn("video_model")
    public String dVideoModel;

    @InterfaceC65349Pkn("download_addr")
    public UrlModel downloadAddr;

    @InterfaceC65349Pkn("token_auth")
    public PlayTokenAuth drmTokenAuth;

    @InterfaceC65349Pkn("dynamic_cover")
    public UrlModel dynamicCover;

    @InterfaceC65349Pkn("is_drm_source")
    public boolean enableIntertrustDrm;

    @InterfaceC65349Pkn("fake_landscape_video_info")
    public FakeLandscapeInfo fakeLandscapeInfo;

    @InterfaceC65349Pkn("format")
    public String format;

    @InterfaceC65349Pkn("play_addr_h264")
    public VideoUrlModel h264PlayAddr;
    public Boolean hasDashBitrate;

    @InterfaceC65349Pkn("height")
    public int height;

    @InterfaceC65349Pkn("is_callback")
    public boolean isCallback;

    @InterfaceC65349Pkn("cover_is_custom")
    public boolean isCustomCover;

    @InterfaceC65349Pkn("is_long_video")
    public int isLongVideo;

    @InterfaceC65349Pkn("meta")
    public String meta;

    @InterfaceC65349Pkn("misc_download_addrs")
    public String miscDownloadAddrs;

    @InterfaceC65349Pkn("need_set_token")
    public boolean needSetCookie;

    @InterfaceC65349Pkn("new_download_addr")
    public UrlModel newDownloadAddr;

    @InterfaceC65349Pkn("origin_cover")
    public UrlModel originCover;

    @InterfaceC65349Pkn("pillar_box_video_info")
    public PillarBoxVideoInfo pillarBoxVideoInfo;

    @InterfaceC65349Pkn("real_duration")
    public int pilotLength;

    @InterfaceC65349Pkn("play_addr")
    public VideoUrlModel playAddr;

    @InterfaceC65349Pkn("play_addr_bytevc1")
    public VideoUrlModel playAddrBytevc1;

    @InterfaceC65349Pkn("ratio")
    public String ratio;

    @InterfaceC65349Pkn("ui_alike_download_addr")
    public UrlModel uiAlikeAddr;
    public String videoAdTag;

    @InterfaceC65349Pkn("duration")
    public int videoLength;
    public transient Object videoModelObject;

    @InterfaceC65349Pkn("tag")
    public VideoTag videoTag;

    @InterfaceC65349Pkn("tags")
    public List<VideoTag> videoTags;

    @InterfaceC65349Pkn("width")
    public int width;

    public boolean isLowBr() {
        return false;
    }

    private void checkBitRateAndDurationCopy() {
        VideoUrlModel videoUrlModel = this.playAddrBytevc1;
        if (videoUrlModel != null) {
            List<BitRate> bitRate = videoUrlModel.getBitRate();
            List<BitRate> list = this.bitRate;
            if (bitRate != list) {
                this.playAddrBytevc1.setBitRate(list);
                this.playAddrBytevc1.setAudioBitrate(this.bitRateAudio);
                this.playAddrBytevc1.setMeta(this.meta);
                this.playAddrBytevc1.setFormat(this.format);
                this.playAddrBytevc1.setDashVideoModelStr(getVideoModelStr());
                this.playAddrBytevc1.setDuration(this.videoLength);
                this.playAddrBytevc1.setCodecType(1);
                this.playAddrBytevc1.setCdnUrlExpired(this.cdnUrlExpired);
                initAspectRatio(this.playAddrBytevc1);
            }
        }
        VideoUrlModel videoUrlModel2 = this.playAddr;
        if (videoUrlModel2 != null) {
            List<BitRate> bitRate2 = videoUrlModel2.getBitRate();
            List<BitRate> list2 = this.bitRate;
            if (bitRate2 != list2) {
                this.playAddr.setBitRate(list2);
                this.playAddr.setAudioBitrate(this.bitRateAudio);
                this.playAddr.setMeta(this.meta);
                this.playAddr.setFormat(this.format);
                this.playAddr.setDashVideoModelStr(getVideoModelStr());
                this.playAddr.setDuration(this.videoLength);
                this.playAddr.setCodecType(0);
                this.playAddr.setCdnUrlExpired(this.cdnUrlExpired);
                initAspectRatio(this.playAddr);
            }
        }
    }

    public Video copyFrom() {
        Video video = new Video();
        video.playAddr = this.playAddr;
        video.playAddrBytevc1 = this.playAddrBytevc1;
        video.h264PlayAddr = this.h264PlayAddr;
        video.cover = this.cover;
        video.aiCover = this.aiCover;
        video.isCustomCover = this.isCustomCover;
        video.coverTsp = this.coverTsp;
        video.dVideoModel = this.dVideoModel;
        video.drmTokenAuth = this.drmTokenAuth;
        video.dynamicCover = this.dynamicCover;
        video.animatedCover = this.animatedCover;
        video.originCover = this.originCover;
        video.aiDynamicCover = this.aiDynamicCover;
        video.aiDynamicCoverBak = this.aiDynamicCoverBak;
        video.height = this.height;
        video.width = this.width;
        video.ratio = this.ratio;
        video.downloadAddr = this.downloadAddr;
        video.videoLength = this.videoLength;
        video.bitRate = this.bitRate;
        video.newDownloadAddr = this.newDownloadAddr;
        video.uiAlikeAddr = this.uiAlikeAddr;
        video.captionDownloadAddr = this.captionDownloadAddr;
        video.needSetCookie = this.needSetCookie;
        video.videoTag = this.videoTag;
        video.videoTags = this.videoTags;
        video.miscDownloadAddrs = this.miscDownloadAddrs;
        video.enableIntertrustDrm = this.enableIntertrustDrm;
        video.pilotLength = this.pilotLength;
        video.captionModel = this.captionModel;
        video.bigThumbs = this.bigThumbs;
        video.cachedOuterCoverUrl = this.cachedOuterCoverUrl;
        video.cachedOuterCoverSize = this.cachedOuterCoverSize;
        video.isCallback = this.isCallback;
        video.meta = this.meta;
        video.isLongVideo = this.isLongVideo;
        video.videoAdTag = this.videoAdTag;
        video.cdnUrlExpired = this.cdnUrlExpired;
        return video;
    }

    public VideoUrlModel getH264PlayAddr() {
        VideoUrlModel videoUrlModel = this.h264PlayAddr;
        if (videoUrlModel != null) {
            long cdnUrlExpired = videoUrlModel.getCdnUrlExpired();
            long j = this.cdnUrlExpired;
            if (cdnUrlExpired != j) {
                this.h264PlayAddr.setCdnUrlExpired(j);
            }
        }
        return this.h264PlayAddr;
    }

    public String getVideoId() {
        PlayTokenAuth playTokenAuth = this.drmTokenAuth;
        if (playTokenAuth != null) {
            return playTokenAuth.getVid();
        }
        return null;
    }

    public String getVideoIdApiHost() {
        PlayTokenAuth playTokenAuth = this.drmTokenAuth;
        if (playTokenAuth != null) {
            return playTokenAuth.tryGetHost();
        }
        return null;
    }

    public String getVideoIdAuth() {
        PlayTokenAuth playTokenAuth = this.drmTokenAuth;
        if (playTokenAuth != null) {
            return playTokenAuth.getAuth();
        }
        return null;
    }

    public String getVideoIdPToken() {
        PlayTokenAuth playTokenAuth = this.drmTokenAuth;
        if (playTokenAuth != null) {
            return playTokenAuth.getToken();
        }
        return null;
    }

    public String getVideoModelStr() {
        if (!TextUtils.isEmpty(this.dVideoModel)) {
            return this.dVideoModel;
        }
        String dashJsonStrFromVideo = DashVideoModelUtil.Companion.getDashJsonStrFromVideo(this);
        this.dVideoModel = dashJsonStrFromVideo;
        return dashJsonStrFromVideo;
    }

    public boolean hasByteVC2() {
        List<BitRate> list = this.bitRate;
        if (list == null) {
            return false;
        }
        for (BitRate bitRate : list) {
            if (bitRate != null && 2 == bitRate.isBytevc1()) {
                return true;
            }
        }
        return false;
    }

    public boolean isCoverValid() {
        return isUrlModelValid(this.cover);
    }

    public boolean isLongVideo() {
        if (this.isLongVideo > 0) {
            return true;
        }
        return false;
    }

    public boolean isOriginCoverValid() {
        return isUrlModelValid(this.originCover);
    }

    private void calculateHasDashBitrate() {
        if (O5Y.LJIILJJIL()) {
            return;
        }
        if (!TextUtils.isEmpty(this.meta)) {
            try {
                if (TextUtils.equals(new JSONObject(this.meta).optString("format"), "dash")) {
                    this.hasDashBitrate = Boolean.TRUE;
                    return;
                }
            } catch (Throwable unused) {
            }
        }
        this.hasDashBitrate = Boolean.FALSE;
    }

    public List<BitRate> getBitRate() {
        if (hasDashBitrate()) {
            return Collections.emptyList();
        }
        List<BitRate> list = this.bitRate;
        if (list == null) {
            return Collections.emptyList();
        }
        return list;
    }

    public UrlModel getOriginCover() {
        if (!isOriginCoverValid() && isCoverValid()) {
            return this.cover;
        }
        return this.originCover;
    }

    public VideoUrlModel getPlayAddr() {
        checkBitRateAndDurationCopy();
        VideoUrlModel videoUrlModel = this.playAddrBytevc1;
        if (videoUrlModel != null) {
            videoUrlModel.setCodecType(1);
            this.playAddrBytevc1.setRatio(this.ratio);
        }
        VideoUrlModel videoUrlModel2 = this.playAddr;
        if (videoUrlModel2 != null) {
            videoUrlModel2.setCodecType(0);
            this.playAddr.setRatio(this.ratio);
        }
        if (checkVideo(this.playAddrBytevc1)) {
            return this.playAddrBytevc1;
        }
        return this.playAddr;
    }

    public VideoUrlModel getPlayAddrBytevc1() {
        checkBitRateAndDurationCopy();
        VideoUrlModel videoUrlModel = this.playAddrBytevc1;
        if (videoUrlModel != null) {
            videoUrlModel.setCodecType(1);
            this.playAddrBytevc1.setRatio(this.ratio);
        }
        return this.playAddrBytevc1;
    }

    public VideoUrlModel getPlayAddrH264() {
        checkBitRateAndDurationCopy();
        VideoUrlModel videoUrlModel = this.playAddr;
        if (videoUrlModel != null) {
            videoUrlModel.setCodecType(0);
            this.playAddr.setRatio(this.ratio);
        }
        return this.playAddr;
    }

    public VideoUrlModel getProperPlayAddr() {
        return getPlayAddr();
    }

    public boolean hasDashBitrate() {
        Boolean bool;
        if (O5Y.LJIILJJIL()) {
            return TextUtils.equals("dash", this.format);
        }
        Object value = IZ8.Z0.getValue();
        o.LJIIIIZZ(value, "<get-dashBitrateResultCachEnable>(...)");
        if (((Boolean) value).booleanValue() && (bool = this.hasDashBitrate) != null) {
            return bool.booleanValue();
        }
        calculateHasDashBitrate();
        return this.hasDashBitrate.booleanValue();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Video{playAddr=");
        LIZ.append(this.playAddr);
        LIZ.append(", playAddrBytevc1=");
        LIZ.append(this.playAddrBytevc1);
        LIZ.append(", cover=");
        LIZ.append(this.cover);
        LIZ.append(", dynamicCover=");
        LIZ.append(this.dynamicCover);
        LIZ.append(", originCover=");
        LIZ.append(this.originCover);
        LIZ.append(", height=");
        LIZ.append(this.height);
        LIZ.append(", width=");
        LIZ.append(this.width);
        LIZ.append(", ratio='");
        Q89.LIZIZ(LIZ, this.ratio, '\'', ", downloadAddr=");
        LIZ.append(this.downloadAddr);
        LIZ.append(", videoLength=");
        LIZ.append(this.videoLength);
        LIZ.append(", bitRate=");
        LIZ.append(this.bitRate);
        LIZ.append(", newDownloadAddr=");
        LIZ.append(this.newDownloadAddr);
        LIZ.append(", needSetCookie=");
        LIZ.append(this.needSetCookie);
        LIZ.append(", misc_download_addrs=");
        LIZ.append(this.miscDownloadAddrs);
        LIZ.append(", isCallback=");
        LIZ.append(this.isCallback);
        LIZ.append(", isLongVideo=");
        LIZ.append(this.isLongVideo);
        LIZ.append(", meta=");
        return q.LIZIZ(LIZ, this.meta, '}', LIZ);
    }

    public boolean enableIntertrustDrm() {
        return this.enableIntertrustDrm;
    }

    public UrlModel getAiCover() {
        return this.aiCover;
    }

    public UrlModel getAiDynamicCover() {
        return this.aiDynamicCover;
    }

    public UrlModel getAiDynamicCoverBak() {
        return this.aiDynamicCoverBak;
    }

    public UrlModel getAnimatedCover() {
        return this.animatedCover;
    }

    public List<BigThumb> getBigThumbs() {
        return this.bigThumbs;
    }

    public int[] getCachedOuterCoverSize() {
        return this.cachedOuterCoverSize;
    }

    public UrlModel getCachedOuterCoverUrl() {
        return this.cachedOuterCoverUrl;
    }

    public UrlModel getCaptionDownloadAddr() {
        return this.captionDownloadAddr;
    }

    public CaptionModel getCaptionModel() {
        return this.captionModel;
    }

    public long getCdnUrlExpired() {
        return this.cdnUrlExpired;
    }

    public UrlModel getCover() {
        return this.cover;
    }

    public double getCoverTsp() {
        return this.coverTsp;
    }

    public UrlModel getDownloadAddr() {
        return this.downloadAddr;
    }

    public PlayTokenAuth getDrmTokenAuth() {
        return this.drmTokenAuth;
    }

    public int getDuration() {
        return this.videoLength;
    }

    public UrlModel getDynamicCover() {
        return this.dynamicCover;
    }

    public FakeLandscapeInfo getFakeLandscapeInfo() {
        return this.fakeLandscapeInfo;
    }

    public String getFormat() {
        return this.format;
    }

    public int getHeight() {
        return this.height;
    }

    public String getMeta() {
        return this.meta;
    }

    public String getMiscDownloadAddrs() {
        return this.miscDownloadAddrs;
    }

    public UrlModel getNewDownloadAddr() {
        return this.newDownloadAddr;
    }

    public PillarBoxVideoInfo getPillarBoxVideoInfo() {
        return this.pillarBoxVideoInfo;
    }

    public int getPilotLength() {
        return this.pilotLength;
    }

    public String getRatio() {
        return this.ratio;
    }

    public List<BitRate> getRawBitRate() {
        return this.bitRate;
    }

    public UrlModel getUIAlikeDownloadAddr() {
        return this.uiAlikeAddr;
    }

    public String getVideoAdTag() {
        return this.videoAdTag;
    }

    public int getVideoLength() {
        return this.videoLength;
    }

    public Object getVideoModelObject() {
        return this.videoModelObject;
    }

    public VideoTag getVideoTag() {
        return this.videoTag;
    }

    public List<VideoTag> getVideoTags() {
        return this.videoTags;
    }

    public int getWidth() {
        return this.width;
    }

    public boolean isCallback() {
        return this.isCallback;
    }

    public boolean isCustomCover() {
        return this.isCustomCover;
    }

    public boolean isNeedSetCookie() {
        return this.needSetCookie;
    }

    private void initAspectRatio(VideoUrlModel videoUrlModel) {
        int i;
        int i2;
        if (this.aspectRatio <= 0.0f && (i = this.width) != 0 && (i2 = this.height) != 0) {
            this.aspectRatio = (i * 1.0f) / i2;
        }
        if (videoUrlModel != null) {
            float f = this.aspectRatio;
            if (f > 0.0f) {
                videoUrlModel.setAspectRatio(f);
            }
        }
    }

    public static boolean isUrlModelValid(UrlModel urlModel) {
        if (urlModel == null || urlModel.getUrlList() == null || urlModel.getUrlList().isEmpty()) {
            return false;
        }
        return true;
    }

    public boolean checkVideo(UrlModel urlModel) {
        List<String> urlList;
        if (urlModel == null || (urlList = urlModel.getUrlList()) == null || urlList.isEmpty()) {
            return false;
        }
        Iterator<String> it = urlList.iterator();
        while (it.hasNext()) {
            if (TextUtils.isEmpty(it.next())) {
                it.remove();
            }
        }
        if (urlList.isEmpty() || TextUtils.isEmpty(urlModel.getUri())) {
            return false;
        }
        return true;
    }

    public void setAiDynamicCover(UrlModel urlModel) {
        this.aiDynamicCover = urlModel;
    }

    public void setAiDynamicCoverBak(UrlModel urlModel) {
        this.aiDynamicCoverBak = urlModel;
    }

    public void setAnimatedCover(UrlModel urlModel) {
        this.animatedCover = urlModel;
    }

    public void setBigThumbs(List<BigThumb> list) {
        this.bigThumbs = list;
    }

    public void setBitRate(List<BitRate> list) {
        this.bitRate = list;
    }

    public void setCachedOuterCoverSize(int[] iArr) {
        this.cachedOuterCoverSize = iArr;
    }

    public void setCachedOuterCoverUrl(UrlModel urlModel) {
        this.cachedOuterCoverUrl = urlModel;
    }

    public void setCallback(boolean z) {
        this.isCallback = z;
    }

    public void setCaptionModel(CaptionModel captionModel) {
        this.captionModel = captionModel;
    }

    public void setCdnUrlExpired(long j) {
        this.cdnUrlExpired = j;
    }

    public void setCover(UrlModel urlModel) {
        this.cover = urlModel;
    }

    public void setCoverTsp(double d) {
        this.coverTsp = d;
    }

    public void setDownloadAddr(UrlModel urlModel) {
        this.downloadAddr = urlModel;
    }

    public void setDrmTokenAuth(PlayTokenAuth playTokenAuth) {
        this.drmTokenAuth = playTokenAuth;
    }

    public void setDuration(double d) {
        this.videoLength = (int) d;
    }

    public void setDynamicCover(UrlModel urlModel) {
        this.dynamicCover = urlModel;
    }

    public void setEnableIntertrustDrm(boolean z) {
        this.enableIntertrustDrm = z;
    }

    public void setFakeLandscapeInfo(FakeLandscapeInfo fakeLandscapeInfo) {
        this.fakeLandscapeInfo = fakeLandscapeInfo;
    }

    public void setFormat(String str) {
        this.format = str;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setMeta(String str) {
        this.meta = str;
    }

    public void setMiscDownloadAddrs(String str) {
        this.miscDownloadAddrs = str;
    }

    public void setNeedSetCookie(boolean z) {
        this.needSetCookie = z;
    }

    public void setNewDownloadAddr(UrlModel urlModel) {
        this.newDownloadAddr = urlModel;
    }

    public void setOriginCover(UrlModel urlModel) {
        this.originCover = urlModel;
    }

    public void setPillarBoxVideoInfo(PillarBoxVideoInfo pillarBoxVideoInfo) {
        this.pillarBoxVideoInfo = pillarBoxVideoInfo;
    }

    public void setPlayAddr(VideoUrlModel videoUrlModel) {
        this.playAddr = videoUrlModel;
    }

    public void setPlayAddrBytevc1(VideoUrlModel videoUrlModel) {
        this.playAddrBytevc1 = videoUrlModel;
    }

    public void setRatio(String str) {
        this.ratio = str;
    }

    public void setRationAndSourceId(String str) {
        VideoUrlModel videoUrlModel = this.playAddrBytevc1;
        if (videoUrlModel != null) {
            videoUrlModel.setRatio(this.ratio);
            videoUrlModel.setSourceId(str);
            this.playAddrBytevc1.setCodecType(1);
        }
        VideoUrlModel videoUrlModel2 = this.playAddr;
        if (videoUrlModel2 != null) {
            videoUrlModel2.setRatio(this.ratio);
            videoUrlModel2.setSourceId(str);
            this.playAddr.setCodecType(0);
        }
    }

    public void setSourceId(String str) {
        setRationAndSourceId(str);
    }

    public void setVideoAdTag(String str) {
        this.videoAdTag = str;
        VideoUrlModel videoUrlModel = this.playAddr;
        if (videoUrlModel != null) {
            videoUrlModel.setVideoAdTag(str);
        }
        VideoUrlModel videoUrlModel2 = this.playAddrBytevc1;
        if (videoUrlModel2 != null) {
            videoUrlModel2.setVideoAdTag(str);
        }
        VideoUrlModel videoUrlModel3 = this.h264PlayAddr;
        if (videoUrlModel3 != null) {
            videoUrlModel3.setVideoAdTag(str);
        }
    }

    public void setVideoLength(int i) {
        this.videoLength = i;
    }

    public void setVideoModelObject(Object obj) {
        this.videoModelObject = obj;
    }

    public void setVideoModelStr(String str) {
        this.dVideoModel = str;
    }

    public void setVideoTag(VideoTag videoTag) {
        this.videoTag = videoTag;
    }

    public void setVideoTags(List<VideoTag> list) {
        this.videoTags = list;
    }

    public void setWidth(int i) {
        this.width = i;
    }
}
