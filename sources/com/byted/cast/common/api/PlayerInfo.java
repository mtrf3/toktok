package com.byted.cast.common.api;

import X.X1D;
import com.byted.cast.common.bean.DramaBean;
import com.byted.cast.common.source.ServiceInfo;
import java.util.Arrays;

/* loaded from: classes29.dex */
public class PlayerInfo {
    public String aesIV;
    public String aesKey;
    public int cameraId;
    public int codecId;
    public boolean customAudioEnable;
    public int danmaku;
    public DramaBean[] dramaList;
    public String extra;
    public String header;
    public boolean isAutoBitrate;
    public boolean isRedirectUrl;
    public String localPath;
    public MediaAssetBean mediaAssetBean;
    public String screenCode;
    public int serverMode;
    public int serverType;
    public ServiceInfo serviceInfo;
    public String startDramaId;
    public long startPosition;
    public int tag;
    public int type;
    public String url;
    public boolean useCustomizedService;
    public int videoSrc;
    public int speed = 1;
    public int resolutionLevel = -1;
    public int bitRateLevel = -1;
    public boolean audioEnable = true;
    public int audioSrc = 1;
    public int fps = 30;
    public int bitrate = -1;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PlayerInfo{url='");
        LIZ.append(this.url);
        LIZ.append('\'');
        LIZ.append(", localPath='");
        LIZ.append(this.localPath);
        LIZ.append('\'');
        LIZ.append(", mediaAssetBean=");
        LIZ.append(this.mediaAssetBean);
        LIZ.append(", serviceInfo=");
        LIZ.append(this.serviceInfo);
        LIZ.append(", type=");
        LIZ.append(this.type);
        LIZ.append(", startPosition=");
        LIZ.append(this.startPosition);
        LIZ.append(", speed=");
        LIZ.append(this.speed);
        LIZ.append(", header='");
        LIZ.append(this.header);
        LIZ.append('\'');
        LIZ.append(", aesKey='");
        LIZ.append(this.aesKey);
        LIZ.append('\'');
        LIZ.append(", aesIV='");
        LIZ.append(this.aesIV);
        LIZ.append('\'');
        LIZ.append(", tag=");
        LIZ.append(this.tag);
        LIZ.append(", dramaList=");
        LIZ.append(Arrays.toString(this.dramaList));
        LIZ.append(", startDramaId='");
        LIZ.append(this.startDramaId);
        LIZ.append('\'');
        LIZ.append(", resolutionLevel=");
        LIZ.append(this.resolutionLevel);
        LIZ.append(", bitRateLevel=");
        LIZ.append(this.bitRateLevel);
        LIZ.append(", audioEnable=");
        LIZ.append(this.audioEnable);
        LIZ.append(", audioSrc=");
        LIZ.append(this.audioSrc);
        LIZ.append(", videoSrc=");
        LIZ.append(this.videoSrc);
        LIZ.append(", cameraId=");
        LIZ.append(this.cameraId);
        LIZ.append(", isAutoBitrate=");
        LIZ.append(this.isAutoBitrate);
        LIZ.append(", screenCode='");
        LIZ.append(this.screenCode);
        LIZ.append('\'');
        LIZ.append(", customAudioEnable=");
        LIZ.append(this.customAudioEnable);
        LIZ.append(", fps=");
        LIZ.append(this.fps);
        LIZ.append(", serverType=");
        LIZ.append(this.serverType);
        LIZ.append(", serverMode=");
        LIZ.append(this.serverMode);
        LIZ.append(", extra=");
        LIZ.append(this.extra);
        LIZ.append(", danmaku=");
        LIZ.append(this.danmaku);
        LIZ.append(", useCustomizedService=");
        LIZ.append(this.useCustomizedService);
        LIZ.append(", isRedirectUrl=");
        LIZ.append(this.isRedirectUrl);
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    public String getAesIV() {
        return this.aesIV;
    }

    public String getAesKey() {
        return this.aesKey;
    }

    public int getAudioSource() {
        return this.audioSrc;
    }

    public int getBitRateLevel() {
        return this.bitRateLevel;
    }

    public int getBitrate() {
        return this.bitrate;
    }

    public int getCameraId() {
        return this.cameraId;
    }

    public int getCodecId() {
        return this.codecId;
    }

    public int getDanmaku() {
        return this.danmaku;
    }

    public DramaBean[] getDramaList() {
        return this.dramaList;
    }

    public String getExtra() {
        return this.extra;
    }

    public int getFps() {
        return this.fps;
    }

    public String getHeader() {
        return this.header;
    }

    public String getLocalPath() {
        return this.localPath;
    }

    public MediaAssetBean getMetaDataBean() {
        return this.mediaAssetBean;
    }

    public int getResolutionLevel() {
        return this.resolutionLevel;
    }

    public String getScreenCode() {
        return this.screenCode;
    }

    public int getServerMode() {
        return this.serverMode;
    }

    public int getServerType() {
        return this.serverType;
    }

    public ServiceInfo getServiceInfo() {
        return this.serviceInfo;
    }

    public int getSpeed() {
        return this.speed;
    }

    public String getStartDramaId() {
        return this.startDramaId;
    }

    public long getStartPosition() {
        return this.startPosition;
    }

    public int getTag() {
        return this.tag;
    }

    public int getType() {
        return this.type;
    }

    public String getUrl() {
        return this.url;
    }

    public int getVideoSrc() {
        return this.videoSrc;
    }

    public boolean isAudioEnable() {
        return this.audioEnable;
    }

    public boolean isAutoBitrate() {
        return this.isAutoBitrate;
    }

    public boolean isCustomAudioEnable() {
        return this.customAudioEnable;
    }

    public boolean isRedirectUrl() {
        return this.isRedirectUrl;
    }

    public boolean isUseCustomizedService() {
        return this.useCustomizedService;
    }

    public void setAesIV(String str) {
        this.aesIV = str;
    }

    public void setAesKey(String str) {
        this.aesKey = str;
    }

    public void setAudioEnable(boolean z) {
        this.audioEnable = z;
    }

    public void setAudioSource(int i) {
        this.audioSrc = i;
    }

    public void setAutoBitrate(boolean z) {
        this.isAutoBitrate = z;
    }

    public void setBitRateLevel(int i) {
        this.bitRateLevel = i;
    }

    public void setBitrate(int i) {
        this.bitrate = i;
    }

    public void setCameraId(int i) {
        this.cameraId = i;
    }

    public void setCodecId(int i) {
        this.codecId = i;
    }

    public void setCustomAudioEnable(boolean z) {
        this.customAudioEnable = z;
    }

    public void setDanmaku(int i) {
        this.danmaku = i;
    }

    public void setDramaList(DramaBean[] dramaBeanArr) {
        this.dramaList = dramaBeanArr;
    }

    public void setExtra(String str) {
        this.extra = str;
    }

    public void setFps(int i) {
        this.fps = i;
    }

    public void setHeader(String str) {
        this.header = str;
    }

    public void setLocalPath(String str) {
        this.localPath = str;
    }

    public void setMetaDataBean(MediaAssetBean mediaAssetBean) {
        this.mediaAssetBean = mediaAssetBean;
    }

    public void setRedirectUrl(boolean z) {
        this.isRedirectUrl = z;
    }

    public void setResolutionLevel(int i) {
        this.resolutionLevel = i;
    }

    public void setScreenCode(String str) {
        this.screenCode = str;
    }

    public void setServerMode(int i) {
        this.serverMode = i;
    }

    public void setServerType(int i) {
        this.serverType = i;
    }

    public void setServiceInfo(ServiceInfo serviceInfo) {
        this.serviceInfo = serviceInfo;
    }

    public void setSpeed(int i) {
        this.speed = i;
    }

    public void setStartDramaId(String str) {
        this.startDramaId = str;
    }

    public void setType(int i) {
        this.type = i;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public void setUseCustomizedService(boolean z) {
        this.useCustomizedService = z;
    }

    public void setVideoSrc(int i) {
        this.videoSrc = i;
    }

    public void setStartPosition(long j, int i) {
        this.startPosition = j;
        this.tag = i;
    }
}
