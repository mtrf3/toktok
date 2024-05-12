package com.ss.android.ugc.aweme.services.audio;

/* loaded from: classes16.dex */
public interface IVopCameraClientService {
    String genVopSdkSavePath();

    String getCurrentUserId();

    String getSDKVersion();

    String getUserTTToken();

    void initDownloadableModel();

    void initVESdk();
}
