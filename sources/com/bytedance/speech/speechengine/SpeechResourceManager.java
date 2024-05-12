package com.bytedance.speech.speechengine;

import android.content.Context;

/* loaded from: classes13.dex */
public interface SpeechResourceManager {

    /* loaded from: classes13.dex */
    public interface CheckResouceUpdateListener {
        void onCheckResult(boolean z);
    }

    /* loaded from: classes13.dex */
    public interface FetchResourceListener {
        void onFailed(String str);

        void onSuccess();
    }

    boolean checkResourceDownload();

    boolean checkResourceDownload(String str);

    void checkResourceUpdate(CheckResouceUpdateListener checkResouceUpdateListener);

    void checkResourceUpdate(String str, CheckResouceUpdateListener checkResouceUpdateListener);

    void fetchResource(FetchResourceListener fetchResourceListener);

    void fetchResourceByName(String str, FetchResourceListener fetchResourceListener);

    String getResourcePath();

    String getResourcePath(String str);

    boolean initResourceManager(Context context, String str);

    boolean initResourceManager(Context context, String str, String str2, String str3, boolean z, String str4);

    void setAppId(String str);

    void setAppVersion(String str);

    void setDeviceId(String str);

    void setEngineName(String str);

    void setTtsLanguage(String[] strArr);

    void setTtsVoiceType(String[] strArr);

    void setUseOnlineModel(boolean z);
}
