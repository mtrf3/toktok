package com.ss.android.ugc.aweme.playereventreporter;

import X.IT8;
import X.UPJ;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class VideoInfo {
    public static final IT8 Companion = new IT8();
    public float duration;
    public int enableHdr;
    public int isBytevc1;
    public long videoSize;
    public String key = "";
    public String url = "";
    public String requestId = "";
    public int isNewUser = -1;
    public int encodedFrameRate = -1;
    public String appId = "";
    public String appVersion = "";
    public String codecName = "";
    public String codecNameStr = "";
    public String contentType = "";
    public String codec = "";
    public int internetSpeed = -1;
    public String aid = "";
    public int isBatterySaver = -1;
    public int videoQuality = -1;
    public int audioQuality = -1;
    public String bitRateSet = "";
    public int playOrder = -1;
    public int enableHwDecode = -1;
    public long videoBitrate = -1;
    public long audioBitrate = -1;
    public long playBitrate = -1;
    public int isPreloaded = -1;
    public String priorityRegion = "";
    public String carrierRegion = "";
    public String enterFrom = "";
    public String format = "";
    public String access2 = "";
    public int codecId = -1;
    public String ptPredictL = "";
    public String topActivity = "";
    public String feedTab = "";
    public String isFromFeedCache = "";
    public String isFirst = "";
    public int isLogin = -1;
    public int isHitCache = -1;
    public int preCacheSize = -1;

    public final void copyFrom(VideoInfo videoInfo) {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("VideoInfo(key=");
        sb.append((Object) this.key);
        sb.append(", url=");
        sb.append((Object) this.url);
        sb.append(", requestId=");
        sb.append((Object) this.requestId);
        sb.append(", duration=");
        sb.append(this.duration);
        sb.append(", isNewUser=");
        sb.append(this.isNewUser);
        sb.append(", isBytevc1=");
        sb.append(this.isBytevc1);
        sb.append(", encodedFrameRate=");
        sb.append(this.encodedFrameRate);
        sb.append(", appId=");
        sb.append((Object) this.appId);
        sb.append(", appVersion=");
        sb.append((Object) this.appVersion);
        sb.append(", codecName=");
        sb.append((Object) this.codecName);
        sb.append(", codecNameStr=");
        sb.append((Object) this.codecNameStr);
        sb.append(",contentType=");
        sb.append((Object) this.contentType);
        sb.append(", codec=");
        sb.append((Object) this.codec);
        sb.append(", internetSpeed=");
        sb.append(this.internetSpeed);
        sb.append(", aid=");
        sb.append((Object) this.aid);
        sb.append(", isBatterySaver=");
        sb.append(this.isBatterySaver);
        sb.append(", videoQuality=");
        sb.append(this.videoQuality);
        sb.append(", bitRateSet=");
        sb.append((Object) this.bitRateSet);
        sb.append(", playOrder=");
        sb.append(this.playOrder);
        sb.append(", enableHwDecode=");
        sb.append(this.enableHwDecode);
        sb.append(", videoBitrate=");
        sb.append(this.videoBitrate);
        sb.append(", playBitrate=");
        sb.append(this.playBitrate);
        sb.append(", isPreloaded=");
        sb.append(this.isPreloaded);
        sb.append(", priorityRegion='");
        sb.append(this.priorityRegion);
        sb.append("', carrierRegion='");
        sb.append(this.carrierRegion);
        sb.append("', enterFrom=");
        sb.append((Object) this.enterFrom);
        sb.append(", format='");
        sb.append((Object) this.format);
        sb.append("', isLogin=");
        return UPJ.LIZLLL(sb, this.isLogin, ')');
    }

    public final String getAccess2() {
        return this.access2;
    }

    public final String getAid() {
        return this.aid;
    }

    public final String getAppId() {
        return this.appId;
    }

    public final String getAppVersion() {
        return this.appVersion;
    }

    public final long getAudioBitrate() {
        return this.audioBitrate;
    }

    public final int getAudioQuality() {
        return this.audioQuality;
    }

    public final String getBitRateSet() {
        return this.bitRateSet;
    }

    public final String getCarrierRegion() {
        return this.carrierRegion;
    }

    public final String getCodec() {
        return this.codec;
    }

    public final int getCodecId() {
        return this.codecId;
    }

    public final String getCodecName() {
        return this.codecName;
    }

    public final String getCodecNameStr() {
        return this.codecNameStr;
    }

    public final String getContentType() {
        return this.contentType;
    }

    public final float getDuration() {
        return this.duration;
    }

    public final int getEnableHdr() {
        return this.enableHdr;
    }

    public final int getEnableHwDecode() {
        return this.enableHwDecode;
    }

    public final int getEncodedFrameRate() {
        return this.encodedFrameRate;
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final String getFeedTab() {
        return this.feedTab;
    }

    public final String getFormat() {
        return this.format;
    }

    public final int getInternetSpeed() {
        return this.internetSpeed;
    }

    public final String getKey() {
        return this.key;
    }

    public final long getPlayBitrate() {
        return this.playBitrate;
    }

    public final int getPlayOrder() {
        return this.playOrder;
    }

    public final int getPreCacheSize() {
        return this.preCacheSize;
    }

    public final String getPriorityRegion() {
        return this.priorityRegion;
    }

    public final String getPtPredictL() {
        return this.ptPredictL;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public final String getTopActivity() {
        return this.topActivity;
    }

    public final String getUrl() {
        return this.url;
    }

    public final long getVideoBitrate() {
        return this.videoBitrate;
    }

    public final int getVideoQuality() {
        return this.videoQuality;
    }

    public final long getVideoSize() {
        return this.videoSize;
    }

    public final int isBatterySaver() {
        return this.isBatterySaver;
    }

    public final int isBytevc1() {
        return this.isBytevc1;
    }

    public final String isFirst() {
        return this.isFirst;
    }

    public final String isFromFeedCache() {
        return this.isFromFeedCache;
    }

    public final int isHitCache() {
        return this.isHitCache;
    }

    public final int isLogin() {
        return this.isLogin;
    }

    public final int isNewUser() {
        return this.isNewUser;
    }

    public final int isPreloaded() {
        return this.isPreloaded;
    }

    public final VideoInfo clone(VideoInfo videoInfo) {
        if (videoInfo == null) {
            return null;
        }
        VideoInfo videoInfo2 = new VideoInfo();
        videoInfo2.setKey(videoInfo.getKey());
        videoInfo2.setUrl(videoInfo.getUrl());
        videoInfo2.setRequestId(videoInfo.getRequestId());
        videoInfo2.setDuration(videoInfo.getDuration());
        videoInfo2.setVideoSize(videoInfo.getVideoSize());
        videoInfo2.setNewUser(videoInfo.isNewUser());
        videoInfo2.setBytevc1(videoInfo.isBytevc1());
        videoInfo2.setEncodedFrameRate(videoInfo.getEncodedFrameRate());
        videoInfo2.setAppId(videoInfo.getAppId());
        videoInfo2.setAppVersion(videoInfo.getAppVersion());
        videoInfo2.setCodecName(videoInfo.getCodecName());
        videoInfo2.setCodecNameStr(videoInfo.getCodecNameStr());
        videoInfo2.setContentType(videoInfo.getContentType());
        videoInfo2.setCodec(videoInfo.getCodec());
        videoInfo2.setInternetSpeed(videoInfo.getInternetSpeed());
        videoInfo2.setAid(videoInfo.getAid());
        videoInfo2.setBatterySaver(videoInfo.isBatterySaver());
        videoInfo2.setVideoQuality(videoInfo.getVideoQuality());
        videoInfo2.setAudioQuality(videoInfo.getAudioQuality());
        videoInfo2.setBitRateSet(videoInfo.getBitRateSet());
        videoInfo2.setPlayOrder(videoInfo.getPlayOrder());
        videoInfo2.setEnableHwDecode(videoInfo.getEnableHwDecode());
        videoInfo2.setVideoBitrate(videoInfo.getVideoBitrate());
        videoInfo2.setAudioBitrate(videoInfo.getAudioBitrate());
        videoInfo2.setPlayBitrate(videoInfo.getPlayBitrate());
        videoInfo2.setPreloaded(videoInfo.isPreloaded());
        videoInfo2.setPriorityRegion(videoInfo.getPriorityRegion());
        videoInfo2.setCarrierRegion(videoInfo.getCarrierRegion());
        videoInfo2.setEnterFrom(videoInfo.getEnterFrom());
        videoInfo2.setFormat(videoInfo.getFormat());
        videoInfo2.setLogin(videoInfo.isLogin());
        videoInfo2.setPreCacheSize(videoInfo.getPreCacheSize());
        return new VideoInfo();
    }

    public final void setAccess2(String str) {
        this.access2 = str;
    }

    public final void setAid(String str) {
        this.aid = str;
    }

    public final void setAppId(String str) {
        this.appId = str;
    }

    public final void setAppVersion(String str) {
        this.appVersion = str;
    }

    public final void setAudioBitrate(long j) {
        this.audioBitrate = j;
    }

    public final void setAudioQuality(int i) {
        this.audioQuality = i;
    }

    public final void setBatterySaver(int i) {
        this.isBatterySaver = i;
    }

    public final void setBitRateSet(String str) {
        this.bitRateSet = str;
    }

    public final void setBytevc1(int i) {
        this.isBytevc1 = i;
    }

    public final void setCarrierRegion(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.carrierRegion = str;
    }

    public final void setCodec(String str) {
        this.codec = str;
    }

    public final void setCodecId(int i) {
        this.codecId = i;
    }

    public final void setCodecName(String str) {
        this.codecName = str;
    }

    public final void setCodecNameStr(String str) {
        this.codecNameStr = str;
    }

    public final void setContentType(String str) {
        this.contentType = str;
    }

    public final void setDuration(float f) {
        this.duration = f;
    }

    public final void setEnableHdr(int i) {
        this.enableHdr = i;
    }

    public final void setEnableHwDecode(int i) {
        this.enableHwDecode = i;
    }

    public final void setEncodedFrameRate(int i) {
        this.encodedFrameRate = i;
    }

    public final void setEnterFrom(String str) {
        this.enterFrom = str;
    }

    public final void setFeedTab(String str) {
        this.feedTab = str;
    }

    public final void setFirst(String str) {
        this.isFirst = str;
    }

    public final void setFormat(String str) {
        this.format = str;
    }

    public final void setFromFeedCache(String str) {
        this.isFromFeedCache = str;
    }

    public final void setHitCache(int i) {
        this.isHitCache = i;
    }

    public final void setInternetSpeed(int i) {
        this.internetSpeed = i;
    }

    public final void setKey(String str) {
        this.key = str;
    }

    public final void setLogin(int i) {
        this.isLogin = i;
    }

    public final void setNewUser(int i) {
        this.isNewUser = i;
    }

    public final void setPlayBitrate(long j) {
        this.playBitrate = j;
    }

    public final void setPlayOrder(int i) {
        this.playOrder = i;
    }

    public final void setPreCacheSize(int i) {
        this.preCacheSize = i;
    }

    public final void setPreloaded(int i) {
        this.isPreloaded = i;
    }

    public final void setPriorityRegion(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.priorityRegion = str;
    }

    public final void setPtPredictL(String str) {
        this.ptPredictL = str;
    }

    public final void setRequestId(String str) {
        this.requestId = str;
    }

    public final void setTopActivity(String str) {
        this.topActivity = str;
    }

    public final void setUrl(String str) {
        this.url = str;
    }

    public final void setVideoBitrate(long j) {
        this.videoBitrate = j;
    }

    public final void setVideoQuality(int i) {
        this.videoQuality = i;
    }

    public final void setVideoSize(long j) {
        this.videoSize = j;
    }
}
