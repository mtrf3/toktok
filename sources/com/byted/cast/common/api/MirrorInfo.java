package com.byted.cast.common.api;

import X.X1D;
import com.byted.cast.common.source.ServiceInfo;

/* loaded from: classes29.dex */
public class MirrorInfo {
    public int cameraId;
    public int captureAudioWay;
    public int codecId;
    public boolean customAudioEnable;
    public boolean enableAudioMix;
    public boolean enableEncodeSizeToScreen;
    public boolean isAutoBitrate;
    public String screenCode;
    public int serverMode;
    public int serverType;
    public ServiceInfo serviceInfo;
    public int videoSrc;
    public int resolutionLevel = -1;
    public int bitRateLevel = -1;
    public boolean audioEnable = true;
    public int audioSrc = 1;
    public int fps = 30;
    public String virtualDisplayName = "";
    public int virtualDisplayFlag = -1;
    public int virtualDisplayWidth = -1;
    public int virtualDisplayHeight = -1;
    public boolean enableSetMaxFps = true;
    public int videoTransportType = -1;
    public int encodeWidth = -1;
    public int encodeHeight = -1;
    public String httpServerRoot = "";
    public int bitrate = -1;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PlayerInfo{, serviceInfo=");
        LIZ.append(this.serviceInfo);
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
        LIZ.append(", virtualDisplayName=");
        LIZ.append(this.virtualDisplayName);
        LIZ.append(", virtualDisplayFlag=");
        LIZ.append(this.virtualDisplayFlag);
        LIZ.append(", virtualDisplayWidth=");
        LIZ.append(this.virtualDisplayWidth);
        LIZ.append(", virtualDisplayHeight=");
        LIZ.append(this.virtualDisplayHeight);
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
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

    public int getCaptureAudioWay() {
        return this.captureAudioWay;
    }

    public int getCodecId() {
        return this.codecId;
    }

    public int getEncodeHeight() {
        return this.encodeHeight;
    }

    public int getEncodeWidth() {
        return this.encodeWidth;
    }

    public int getFps() {
        return this.fps;
    }

    public String getHttpServerRoot() {
        return this.httpServerRoot;
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

    public int getVideoSrc() {
        return this.videoSrc;
    }

    public int getVideoTransportType() {
        return this.videoTransportType;
    }

    public int getVirtualDisplayFlag() {
        return this.virtualDisplayFlag;
    }

    public int getVirtualDisplayHeight() {
        return this.virtualDisplayHeight;
    }

    public String getVirtualDisplayName() {
        return this.virtualDisplayName;
    }

    public int getVirtualDisplayWidth() {
        return this.virtualDisplayWidth;
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

    public boolean isEnableAudioMix() {
        return this.enableAudioMix;
    }

    public boolean isEnableSetMaxFps() {
        return this.enableSetMaxFps;
    }

    public boolean isEncodeSizeToScreen() {
        return this.enableEncodeSizeToScreen;
    }

    public void enableAudioMix(boolean z) {
        this.enableAudioMix = z;
    }

    public void enableEncodeSizeToScreen(boolean z) {
        this.enableEncodeSizeToScreen = z;
    }

    public void enableSetMaxFps(boolean z) {
        this.enableSetMaxFps = z;
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

    public void setCaptureAudioWay(int i) {
        this.captureAudioWay = i;
    }

    public void setCodecId(int i) {
        this.codecId = i;
    }

    public void setCustomAudioEnable(boolean z) {
        this.customAudioEnable = z;
    }

    public void setEncodeHeight(int i) {
        this.encodeHeight = i;
    }

    public void setEncodeWidth(int i) {
        this.encodeWidth = i;
    }

    public void setFps(int i) {
        this.fps = i;
    }

    public void setHttpServerRoot(String str) {
        this.httpServerRoot = str;
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

    public void setVideoSrc(int i) {
        this.videoSrc = i;
    }

    public void setVideoTransportType(int i) {
        this.videoTransportType = i;
    }

    public void setVirtualDisplayFlag(int i) {
        this.virtualDisplayFlag = i;
    }

    public void setVirtualDisplayHeight(int i) {
        this.virtualDisplayHeight = i;
    }

    public void setVirtualDisplayName(String str) {
        this.virtualDisplayName = str;
    }

    public void setVirtualDisplayWidth(int i) {
        this.virtualDisplayWidth = i;
    }
}
