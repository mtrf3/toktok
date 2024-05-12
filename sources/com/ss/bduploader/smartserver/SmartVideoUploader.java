package com.ss.bduploader.smartserver;

/* loaded from: classes9.dex */
public class SmartVideoUploader {
    public SmartServiceInterface mIntelligentService;
    public String mIntelligentURL = "";

    public void configServer() {
        this.mIntelligentService.setStringValue(1000, "mlsdk");
        this.mIntelligentService.setStringValue(1001, "regression");
        this.mIntelligentService.setStringValue(1002, "smart_upload_tcp_quic");
        this.mIntelligentService.setStringValue(1003, this.mIntelligentURL);
        this.mIntelligentService.configServer();
    }

    public void init() {
        this.mIntelligentService = new SmartServiceWrapper();
    }

    public void preloadEnv() {
        SmartServiceInterface smartServiceInterface = this.mIntelligentService;
        if (smartServiceInterface != null) {
            smartServiceInterface.preloadEnv();
        }
    }
}
