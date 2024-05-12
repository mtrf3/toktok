package com.bytedance.realx.base;

import X.C16880lQ;
import android.content.Context;
import android.os.Build;
import com.bytedance.realx.base.platformsdk.ImplJsonConverter;
import com.bytedance.realx.base.platformsdk.ImplNetWorker;
import com.ss.android.ugc.effectmanager.DownloadableModelConfig;
import com.ss.android.ugc.effectmanager.EffectConfiguration;
import com.ss.android.ugc.effectmanager.EffectManager;
import com.ss.android.ugc.effectmanager.FetchModelType;
import com.ss.android.ugc.effectmanager.ModelEventListener;
import com.ss.android.ugc.effectmanager.algorithm.AlgorithmModelManager;
import com.ss.android.ugc.effectmanager.algorithm.FetchResourcesListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.link.model.host.Host;
import com.ss.android.ugc.effectmanager.model.ModelInfo;
import java.io.File;
import java.util.ArrayList;

/* loaded from: classes33.dex */
public class RXModelDownloader {
    public static EffectConfiguration mConfiguration;
    public static Context mContext;
    public static DownloadableModelConfig mDownloadableModelConfig;
    public long mcModelDownloaderPtr;
    public final Object mLock = new Object();
    public String sdkDLVersionNumber = "3.19.1";
    public String appVersionNumber = "";
    public String deviceId = "";
    public String appId = "";
    public boolean isTest = true;
    public String effectChannel = "test";
    public int download_retry_times = 3;
    public int rtc_business_id = 199;
    public DownloadableModelConfig.ModelFileEnv modelFileEnv = DownloadableModelConfig.ModelFileEnv.TEST;

    public static native void nativeOnModelDownloaded(long j, String str, boolean z);

    public static synchronized void checkIsEffectManagerInitialized() {
        synchronized (RXModelDownloader.class) {
            if (!AlgorithmModelManager.isInitialized()) {
                AlgorithmModelManager.initialize(mDownloadableModelConfig);
            }
        }
    }

    public void destroy() {
        synchronized (this.mLock) {
            this.mcModelDownloaderPtr = 0L;
        }
    }

    public void DownloadModel(final String str) {
        final String[] strArr = {str};
        try {
            AlgorithmModelManager.getInstance().fetchResourcesWithModelNames(this.rtc_business_id, strArr, new FetchResourcesListener() { // from class: com.bytedance.realx.base.RXModelDownloader.2
                @Override // com.ss.android.ugc.effectmanager.algorithm.FetchResourcesListener
                public void onSuccess() {
                    String findResourceUri = AlgorithmModelManager.getInstance().findResourceUri(RXModelDownloader.this.rtc_business_id, strArr[0]);
                    boolean IsModelPathValid = RXModelDownloader.this.IsModelPathValid(findResourceUri);
                    synchronized (RXModelDownloader.this.mLock) {
                        long j = RXModelDownloader.this.mcModelDownloaderPtr;
                        if (j != 0) {
                            if (!IsModelPathValid) {
                                RXModelDownloader.nativeOnModelDownloaded(j, "", true);
                            } else {
                                RXModelDownloader.nativeOnModelDownloaded(j, findResourceUri, true);
                            }
                        }
                    }
                }

                @Override // com.ss.android.ugc.effectmanager.algorithm.FetchResourcesListener
                public void onFailed(Exception exc) {
                    synchronized (RXModelDownloader.this.mLock) {
                        long j = RXModelDownloader.this.mcModelDownloaderPtr;
                        if (j != 0) {
                            RXModelDownloader.nativeOnModelDownloaded(j, "", false);
                        }
                    }
                }
            });
        } catch (Exception unused) {
        }
    }

    public String FindmodelFilePath(String str) {
        String str2;
        try {
            str2 = AlgorithmModelManager.getInstance().findResourceUri(this.rtc_business_id, str);
        } catch (Exception unused) {
            str2 = "";
        }
        if (!IsModelPathValid(str2)) {
            return "";
        }
        return str2;
    }

    public boolean IsModelPathValid(String str) {
        if (str != null && !str.equals("asset://not_found") && !str.equals("asset://md5_error")) {
            return true;
        }
        return false;
    }

    public void initDownloader(long j, String str, boolean z, String str2) {
        if (str != null && str.length() != 0) {
            this.deviceId = str;
        }
        if (!z) {
            this.modelFileEnv = DownloadableModelConfig.ModelFileEnv.ONLINE;
        }
        this.mcModelDownloaderPtr = j;
        try {
            mContext = ContextUtils.getApplicationContext();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new Host(str2));
            EffectConfiguration.Builder builder = new EffectConfiguration.Builder();
            builder.accessKey("f5c61e00bf9a11e79515bdb2ca03e788");
            builder.channel(this.effectChannel);
            builder.sdkVersion(this.sdkDLVersionNumber);
            builder.appVersion(this.appVersionNumber);
            builder.platform("android");
            String str3 = Build.MODEL;
            builder.deviceType(str3);
            builder.deviceId(this.deviceId);
            builder.effectDir(new File(C16880lQ.LLIIJLIL(mContext), "effect"));
            builder.JsonConverter(new ImplJsonConverter());
            builder.effectNetWorker(new ImplNetWorker());
            builder.hosts(arrayList);
            builder.context(mContext);
            builder.retryCount(this.download_retry_times);
            mConfiguration = builder.build();
            new EffectManager().init(mConfiguration);
            DownloadableModelConfig.Builder builder2 = new DownloadableModelConfig.Builder();
            builder2.setAssetManager(mContext.getAssets());
            builder2.setJsonConverter(new ImplJsonConverter());
            builder2.setAppId(this.appId);
            builder2.setAccessKey("142710f02c3a11e8b42429f14557854a");
            builder2.setDeviceType(str3);
            builder2.setHosts(arrayList);
            builder2.setSdkVersion(this.sdkDLVersionNumber);
            builder2.setWorkspace(new File(C16880lQ.LLIIJLIL(mContext), "effectmodel").getPath());
            builder2.setEffectNetWorker(new ImplNetWorker());
            builder2.setEffectConfiguration(mConfiguration);
            builder2.setExecutor(C16880lQ.LLLLZLLIL());
            builder2.setEventListener(new ModelEventListener() { // from class: com.bytedance.realx.base.RXModelDownloader.1
                @Override // com.ss.android.ugc.effectmanager.ModelEventListener
                public void onFetchModelList(boolean z2, String str4, long j2, String str5) {
                }

                @Override // com.ss.android.ugc.effectmanager.ModelEventListener
                public void onModelDownloadError(Effect effect, ModelInfo modelInfo, Exception exc) {
                }

                @Override // com.ss.android.ugc.effectmanager.ModelEventListener
                public void onModelDownloadStart(Effect effect, ModelInfo modelInfo) {
                }

                @Override // com.ss.android.ugc.effectmanager.ModelEventListener
                public void onModelDownloadSuccess(Effect effect, ModelInfo modelInfo, long j2) {
                }

                @Override // com.ss.android.ugc.effectmanager.ModelEventListener
                public void onModelNotFound(Effect effect, Exception exc) {
                }
            });
            builder2.setModelFileEnv(this.modelFileEnv);
            builder2.setModelType(FetchModelType.ORIGIN);
            mDownloadableModelConfig = builder2.build();
            checkIsEffectManagerInitialized();
        } catch (Exception unused) {
        }
    }
}
