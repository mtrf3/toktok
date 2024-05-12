package com.bytedance.pitaya.api;

import android.content.Context;
import com.bytedance.pitaya.api.bean.PTYNativeTaskConfig;
import com.bytedance.pitaya.api.bean.PTYNativeTaskData;
import com.bytedance.pitaya.api.bean.PTYRequestConfig;
import com.bytedance.pitaya.api.bean.PTYSetupInfo;
import com.bytedance.pitaya.api.bean.PTYTaskConfig;
import com.bytedance.pitaya.api.bean.PTYTaskData;
import java.util.List;

/* loaded from: classes16.dex */
public interface IPitayaCore extends PitayaFE {
    void cleanStorage(Context context, List<String> list, PTYNormalCallback pTYNormalCallback);

    void downloadPackage(String str, PTYPackageCallback pTYPackageCallback);

    String getAid();

    boolean isReady();

    void preDownloadAllPackage();

    void queryPackage(String str, PTYPackageCallback pTYPackageCallback);

    void releaseAllEngines();

    void releaseEngine(String str);

    void releaseNativeEngine(String str);

    void requestUpdate(String str, PTYRequestConfig pTYRequestConfig, PTYPackageCallback pTYPackageCallback);

    void requestUpdateAll();

    void runNativeTask(String str, PTYNativeTaskData pTYNativeTaskData, PTYNativeTaskConfig pTYNativeTaskConfig, PTYTaskResultCallback pTYTaskResultCallback);

    void runTask(String str, PTYTaskData pTYTaskData, PTYTaskConfig pTYTaskConfig, PTYTaskResultCallback pTYTaskResultCallback);

    void setAid(String str);

    void setup(Context context, PTYSetupInfo pTYSetupInfo, PTYSetupCallback pTYSetupCallback);

    void socketLogError(String str);

    void socketLogInfo(String str);

    void socketLogWarn(String str);

    void stopAllDownloadTask();
}
