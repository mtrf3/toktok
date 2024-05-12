package com.ss.android.ugc.effectmanager;

import X.X1D;
import com.bef.effectsdk.AssetResourceFinder;
import com.bef.effectsdk.ResourceFinder;
import com.ss.android.ugc.effectmanager.algorithm.AssetManagerWrapper;
import com.ss.android.ugc.effectmanager.algorithm.ModelConfigArbiter;
import com.ss.android.ugc.effectmanager.algorithm.ModelFinder;
import com.ss.android.ugc.effectmanager.common.cache.IModelCache;
import com.ss.android.ugc.effectmanager.common.logger.EPLog;
import com.ss.android.ugc.effectmanager.common.monitor.MonitorTrace;

/* loaded from: classes16.dex */
public class DownloadableModelSupportResourceFinder implements ResourceFinder {
    public AssetResourceFinder mAssetResourceFinder;
    public long mEffectHandle;
    public ModelFinder mModelFinder;

    private native long nativeCreateResourceFinder(long j);

    public DownloadableModelSupportResourceFinder() {
    }

    public long getEffectHandle() {
        return this.mEffectHandle;
    }

    public static void modelNotFound(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("modelNotFound:nameStr=");
        LIZ.append(str);
        EPLog.d("ResourceFinder", X1D.LIZIZ(LIZ));
        if (DownloadableModelSupport.isInitialized()) {
            DownloadableModelSupport.getInstance().getResourceFinder().onModelNotFound(str);
            DownloadableModelSupport.getInstance().getResourceFinder().monitorStatusRateFail(null, str);
        }
    }

    private void onModelNotFound(String str) {
        ModelFinder modelFinder = this.mModelFinder;
        if (modelFinder != null) {
            modelFinder.onModelNotFound(str);
        }
    }

    @Override // com.bef.effectsdk.ResourceFinder
    public long createNativeResourceFinder(long j) {
        this.mEffectHandle = j;
        DownloadableModelLibraryLoader.INSTANCE.loadLibrary();
        AssetResourceFinder assetResourceFinder = this.mAssetResourceFinder;
        if (assetResourceFinder != null) {
            assetResourceFinder.createNativeResourceFinder(j);
        }
        return nativeCreateResourceFinder(j);
    }

    public boolean isResourceAvailable(String str) {
        String queryResourceUri = this.mModelFinder.queryResourceUri(str, null);
        if (queryResourceUri != null && !"asset://not_found".equals(queryResourceUri) && !"asset://not_initialized".equals(queryResourceUri) && !"asset://md5_error".equals(queryResourceUri)) {
            return true;
        }
        return false;
    }

    @Override // com.bef.effectsdk.ResourceFinder
    public void release(long j) {
        this.mEffectHandle = 0L;
        AssetResourceFinder assetResourceFinder = this.mAssetResourceFinder;
        if (assetResourceFinder != null) {
            assetResourceFinder.release(j);
        }
    }

    public static String findResourceUri(String str, String str2) {
        if (!DownloadableModelSupport.isInitialized()) {
            EPLog.e("ResourceFinder", "findResourceUri return with DownloadableModelSupport not initialized!");
            return "asset://not_initialized";
        }
        ModelFinder modelFinder = DownloadableModelSupport.getInstance().getResourceFinder().mModelFinder;
        if (modelFinder == null) {
            return "asset://not_initialized";
        }
        return modelFinder.findResourceUri(0, str, str2);
    }

    private void monitorStatusRateFail(MonitorTrace monitorTrace, String str) {
        ModelFinder modelFinder = this.mModelFinder;
        if (modelFinder != null) {
            modelFinder.monitorStatusRateFail(monitorTrace, str);
        }
    }

    public DownloadableModelSupportResourceFinder(ModelConfigArbiter modelConfigArbiter, IModelCache iModelCache, DownloadableModelConfig downloadableModelConfig, AssetManagerWrapper assetManagerWrapper) {
        this.mAssetResourceFinder = new AssetResourceFinder(assetManagerWrapper.getWrapped(), iModelCache.getCacheDir());
        this.mModelFinder = new ModelFinder(downloadableModelConfig, modelConfigArbiter, iModelCache, assetManagerWrapper);
    }
}
