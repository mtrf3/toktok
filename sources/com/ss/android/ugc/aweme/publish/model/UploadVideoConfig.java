package com.ss.android.ugc.aweme.publish.model;

import X.AbstractC36908Ee8;
import X.InterfaceC195777mH;
import X.InterfaceC65349Pkn;
import X.Q89;
import X.X1D;

/* loaded from: classes8.dex */
public class UploadVideoConfig extends AbstractC36908Ee8 {

    @InterfaceC65349Pkn("aiCutAppKey")
    public String aiCutAppKey;

    @InterfaceC65349Pkn("aiCutAuthorization")
    public String aiCutAuthorization;

    @InterfaceC195777mH
    @InterfaceC65349Pkn("appKey")
    public String appKey;

    @InterfaceC195777mH
    @InterfaceC65349Pkn("authorization")
    public String authorization;

    @InterfaceC65349Pkn("authorization2")
    public STSAuthConfig authorizationV2;

    @InterfaceC65349Pkn("upload_backup_network_type")
    public int backupNetworkType;

    @InterfaceC65349Pkn("captionAppKey")
    public String captionAppKey;

    @InterfaceC65349Pkn("captionAuthorization")
    public String captionAuthorization;

    @InterfaceC65349Pkn("captionAuthorization2")
    public STSAuthConfig captionAuthorization2;

    @InterfaceC65349Pkn("enable_client_network_judgement")
    public boolean enableClientNetworkJudgement;

    @InterfaceC65349Pkn("enableExternDNS")
    public int enableExternDNS;

    @InterfaceC65349Pkn("enableExternNet")
    public int enableExternNet;

    @InterfaceC65349Pkn("enableHttps")
    public int enableHttps;

    @InterfaceC65349Pkn("enableMutitask")
    public int enableMutitask;

    @InterfaceC65349Pkn("enablePostMethod")
    public int enablePostMethod;

    @InterfaceC65349Pkn("enableQuic")
    public int enableQuic;

    @InterfaceC65349Pkn("enableTTNetDNS")
    public int enableTTNetDNS;

    @InterfaceC65349Pkn("enable_tt_uploader_ev_state")
    public boolean enableTTUploaderEvState;

    @InterfaceC65349Pkn("enable_tt_uploader_log_callback")
    public boolean enableTTUploaderLogCallback;

    @InterfaceC195777mH
    @InterfaceC65349Pkn("fileHostName")
    public String fileHostName;

    @InterfaceC65349Pkn("is_stream_upload_enable")
    public int isStreamUploadEnable;

    @InterfaceC65349Pkn("upload_main_network_type")
    public int mainNetworkType;

    @InterfaceC65349Pkn("maxFailTime")
    public int maxFailTime;

    @InterfaceC65349Pkn("sliceRetryCount")
    public int sliceRetryCount;

    @InterfaceC65349Pkn("sliceSize")
    public int sliceSize;

    @InterfaceC65349Pkn("sliceTimeout")
    public int sliceTimeout;

    @InterfaceC65349Pkn("testSpeedAppKey")
    public String testSpeedAppKey;

    @InterfaceC65349Pkn("testSpeedAuthorization")
    public String testSpeedAuthorization;

    @InterfaceC65349Pkn("testSpeedAuthorization2")
    public STSAuthConfig testSpeedAuthorization2;

    @InterfaceC65349Pkn("ttnetConfigValue")
    public int ttnetConfigValue;

    @InterfaceC65349Pkn("uploadRegion")
    public String uploadRegion;

    @InterfaceC65349Pkn("userStoreRegion")
    public String userStoreRegion;

    @InterfaceC195777mH
    @InterfaceC65349Pkn("videoHostName")
    public String videoHostName;

    @InterfaceC65349Pkn("fileRetryCount")
    public int fileRetryCount = 1;

    @InterfaceC65349Pkn("aliveMaxFailTime")
    public int aliveMaxFailTime = 6;

    @InterfaceC65349Pkn("openTimeOut")
    public int openTimeOut = 5000;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UploadVideoConfig{appKey='");
        Q89.LIZIZ(LIZ, this.appKey, '\'', ", fileHostName='");
        Q89.LIZIZ(LIZ, this.fileHostName, '\'', ", videoHostName='");
        Q89.LIZIZ(LIZ, this.videoHostName, '\'', ", sliceTimeout=");
        LIZ.append(this.sliceTimeout);
        LIZ.append(", sliceRetryCount=");
        LIZ.append(this.sliceRetryCount);
        LIZ.append(", sliceSize=");
        LIZ.append(this.sliceSize);
        LIZ.append(", fileRetryCount=");
        LIZ.append(this.fileRetryCount);
        LIZ.append(", maxFailTime=");
        LIZ.append(this.maxFailTime);
        LIZ.append(", authorization='");
        Q89.LIZIZ(LIZ, this.authorization, '\'', ", enableHttps=");
        LIZ.append(this.enableHttps);
        LIZ.append(", enableExternDNS=");
        LIZ.append(this.enableExternDNS);
        LIZ.append(", aliveMaxFailTime=");
        LIZ.append(this.aliveMaxFailTime);
        LIZ.append(", enableTTNetDNS=");
        LIZ.append(this.enableTTNetDNS);
        LIZ.append(", enablePostMethod=");
        LIZ.append(this.enablePostMethod);
        LIZ.append(", openTimeOut=");
        LIZ.append(this.openTimeOut);
        LIZ.append(", uploadRegion='");
        Q89.LIZIZ(LIZ, this.uploadRegion, '\'', ", enableExternNet=");
        LIZ.append(this.enableExternNet);
        LIZ.append(", enableQuic=");
        LIZ.append(this.enableQuic);
        LIZ.append(", enableMutitask=");
        LIZ.append(this.enableMutitask);
        LIZ.append(", ttnetConfigValue=");
        LIZ.append(this.ttnetConfigValue);
        LIZ.append(", enableTTUploaderLogCallback=");
        LIZ.append(this.enableTTUploaderLogCallback);
        LIZ.append(", isStreamUploadEnable=");
        LIZ.append(this.isStreamUploadEnable);
        LIZ.append(", enableClientNetworkJudgement=");
        LIZ.append(this.enableClientNetworkJudgement);
        LIZ.append(", testSpeedAppKey='");
        Q89.LIZIZ(LIZ, this.testSpeedAppKey, '\'', ", testSpeedAuthorization='");
        Q89.LIZIZ(LIZ, this.testSpeedAuthorization, '\'', ", captionAppKey='");
        Q89.LIZIZ(LIZ, this.captionAppKey, '\'', ", captionAuthorization='");
        Q89.LIZIZ(LIZ, this.captionAuthorization, '\'', ", aiCutAuthorization='");
        Q89.LIZIZ(LIZ, this.aiCutAuthorization, '\'', ", aiCutAppKey='");
        Q89.LIZIZ(LIZ, this.aiCutAppKey, '\'', ", authorization2=");
        LIZ.append(this.authorizationV2);
        LIZ.append('\'');
        LIZ.append(", captionAuthorization2=");
        LIZ.append(this.captionAuthorization2);
        LIZ.append('\'');
        LIZ.append(", testSpeedAuthorization2=");
        LIZ.append(this.testSpeedAuthorization2);
        LIZ.append('\'');
        LIZ.append(", mainNetworkType='");
        LIZ.append(this.mainNetworkType);
        LIZ.append('\'');
        LIZ.append(", backupNetworkType='");
        LIZ.append(this.backupNetworkType);
        LIZ.append('\'');
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }
}
