package com.ss.android.ugc.effectmanager.algorithm;

import X.UPJ;
import X.X1D;
import android.net.Uri;
import android.text.TextUtils;
import com.ss.android.ugc.effectmanager.DownloadableModelConfig;
import com.ss.android.ugc.effectmanager.LoadedModelList;
import com.ss.android.ugc.effectmanager.ModelEventListener;
import com.ss.android.ugc.effectmanager.common.ModelNameProcessor;
import com.ss.android.ugc.effectmanager.common.cache.IModelCache;
import com.ss.android.ugc.effectmanager.common.listener.IMonitorService;
import com.ss.android.ugc.effectmanager.common.logger.EPLog;
import com.ss.android.ugc.effectmanager.common.monitor.EPMonitor;
import com.ss.android.ugc.effectmanager.common.monitor.MonitorTrace;
import com.ss.android.ugc.effectmanager.common.utils.EventJsonBuilder;
import com.ss.android.ugc.effectmanager.common.utils.MD5Utils;
import com.ss.android.ugc.effectmanager.model.ExtendedUrlModel;
import com.ss.android.ugc.effectmanager.model.LocalModelInfo;
import com.ss.android.ugc.effectmanager.model.ModelInfo;
import defpackage.i0;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class ModelFinder {
    public final String TAG;
    public final AssetManagerWrapper assetManagerWrapper;
    public final DownloadableModelConfig config;
    public final IModelCache modelCache;
    public final ModelConfigArbiter modelConfigArbiter;

    private final boolean isExactBuiltInResource(String str) {
        AssetManagerWrapper assetManagerWrapper = this.assetManagerWrapper;
        if (assetManagerWrapper != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("model/");
            LIZ.append(str);
            return assetManagerWrapper.exists(X1D.LIZIZ(LIZ));
        }
        return false;
    }

    private final void monitorStatusRateSuccess(String str) {
        IMonitorService monitorService = this.config.getMonitorService();
        if (monitorService != null) {
            EventJsonBuilder newBuilder = EventJsonBuilder.newBuilder();
            newBuilder.addValuePair("app_id", this.config.getAppId());
            newBuilder.addValuePair("access_key", this.config.getAccessKey());
            newBuilder.addValuePair("model_name", str);
            newBuilder.addValuePair("effect_platform_type", (Integer) 0);
            monitorService.monitorStatusRate("find_resource_uri_success_rate", 0, newBuilder.build());
        }
    }

    public final boolean isResourceAvailable(String str) {
        if (str != null) {
            if (queryResourceUri(str, null) != null) {
                return true;
            }
            return false;
        }
        o.LJIIZILJ();
        throw null;
    }

    public final void onModelNotFound(String errorMessage) {
        o.LJIIJ(errorMessage, "errorMessage");
        RuntimeException runtimeException = new RuntimeException(i0.LJFF("model not found neither in asset nor disk ", errorMessage));
        try {
            ModelEventListener eventListener = this.config.getEventListener();
            if (eventListener != null) {
                eventListener.onModelNotFound(null, runtimeException);
            }
        } catch (Throwable unused) {
        }
    }

    public final void monitorStatusRateFail(MonitorTrace monitorTrace, String modelName) {
        List<String> list;
        long j;
        o.LJIIJ(modelName, "modelName");
        IMonitorService monitorService = this.config.getMonitorService();
        if (monitorService != null) {
            EventJsonBuilder newBuilder = EventJsonBuilder.newBuilder();
            newBuilder.addValuePair("app_id", this.config.getAppId());
            newBuilder.addValuePair("access_key", this.config.getAccessKey());
            newBuilder.addValuePair("model_name", modelName);
            if (monitorTrace != null) {
                list = monitorTrace.getStepList();
            } else {
                list = null;
            }
            newBuilder.addValuePair("monitor_trace", list);
            if (monitorTrace != null) {
                j = monitorTrace.getDuration();
            } else {
                j = 0;
            }
            newBuilder.addValuePair("duration", Long.valueOf(j));
            newBuilder.addValuePair("effect_platform_type", (Integer) 0);
            monitorService.monitorStatusRate("find_resource_uri_success_rate", 1, newBuilder.build());
        }
    }

    public final String queryResourceUri(String modelName, MonitorTrace monitorTrace) {
        boolean z;
        o.LJIIJ(modelName, "modelName");
        String name = ModelNameProcessor.getNameOfModel(modelName);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ResourceFinder#findResourceUri::modelName = ");
        LIZ.append(name);
        EPMonitor.traceStep(monitorTrace, X1D.LIZIZ(LIZ));
        IModelCache iModelCache = this.modelCache;
        o.LJFF(name, "name");
        LocalModelInfo localModelInfoByName = iModelCache.getLocalModelInfoByName(name, monitorTrace);
        if (localModelInfoByName != null) {
            z = true;
        } else {
            z = false;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("ResourceFinder#findResourceUri::isResourceDownloaded = ");
        LIZ2.append(z);
        EPMonitor.traceStep(monitorTrace, X1D.LIZIZ(LIZ2));
        String str = null;
        if (z) {
            if (localModelInfoByName != null) {
                str = localModelInfoByName.getUri().toString();
            } else {
                o.LJIIZILJ();
                throw null;
            }
        } else if (isExactBuiltInResource(modelName)) {
            str = i0.LJFF("asset://model/", modelName);
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("ResourceFinder#findResourceUri::Result Uri = ");
        LIZ3.append(str);
        EPMonitor.traceStep(monitorTrace, X1D.LIZIZ(LIZ3));
        return str;
    }

    public final String findResourceUri(int i, String str, String modelName) {
        o.LJIIJ(modelName, "modelName");
        MonitorTrace monitorTrace = new MonitorTrace(modelName);
        EPMonitor.traceBegin(monitorTrace);
        String str2 = this.TAG;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("findResourceUri::nameStr = ");
        LIZ.append(modelName);
        EPLog.d(str2, X1D.LIZIZ(LIZ));
        String queryResourceUri = queryResourceUri(modelName, monitorTrace);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("findResourceUri = ");
        LIZ2.append(queryResourceUri);
        EPMonitor.traceStep(monitorTrace, X1D.LIZIZ(LIZ2));
        try {
            String nameOfModel = ModelNameProcessor.getNameOfModel(modelName);
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("findResourceUri::nameOfModel = ");
            LIZ3.append(nameOfModel);
            EPMonitor.traceStep(monitorTrace, X1D.LIZIZ(LIZ3));
            o.LJFF(nameOfModel, "nameOfModel");
            if (checkModelMd5(nameOfModel, modelName, i, monitorTrace)) {
                return "asset://md5_error";
            }
        } catch (Exception e) {
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("findResourceUri::Exception occurred, cause=");
            LIZ4.append(e.getMessage());
            EPMonitor.traceStep(monitorTrace, X1D.LIZIZ(LIZ4));
            String str3 = this.TAG;
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append("findResourceUri::nameStr = ");
            LIZ5.append(modelName);
            EPLog.e(str3, X1D.LIZIZ(LIZ5), e);
        }
        if (queryResourceUri == null) {
            EPMonitor.traceStep(monitorTrace, "findResourceUri::uri not found");
            EPMonitor.traceEnd(monitorTrace);
            String str4 = this.TAG;
            StringBuilder LIZ6 = X1D.LIZ();
            LIZ6.append("findResourceUri::nameStr = ");
            LIZ6.append(modelName);
            LIZ6.append(" returned not_found");
            EPLog.e(str4, X1D.LIZIZ(LIZ6));
            return "asset://not_found";
        }
        EPMonitor.traceEnd(monitorTrace);
        monitorStatusRateSuccess(modelName);
        String str5 = this.TAG;
        StringBuilder LIZ7 = X1D.LIZ();
        LIZ7.append("findResourceUri::nameStr = ");
        LIZ7.append(modelName);
        LIZ7.append(" returned result: ");
        LIZ7.append(queryResourceUri);
        EPLog.d(str5, X1D.LIZIZ(LIZ7));
        return queryResourceUri;
    }

    public ModelFinder(DownloadableModelConfig config, ModelConfigArbiter modelConfigArbiter, IModelCache modelCache, AssetManagerWrapper assetManagerWrapper) {
        o.LJIIJ(config, "config");
        o.LJIIJ(modelCache, "modelCache");
        this.config = config;
        this.modelConfigArbiter = modelConfigArbiter;
        this.modelCache = modelCache;
        this.assetManagerWrapper = assetManagerWrapper;
        this.TAG = "ModelFinder";
    }

    private final boolean checkModelMd5(String str, String str2, int i, MonitorTrace monitorTrace) {
        LoadedModelList requireDecidedConfigNonBlockling;
        ModelInfo singleModelInfoNonBlocking;
        ExtendedUrlModel fileUrl;
        LocalModelInfo localModelInfoByName = this.modelCache.getLocalModelInfoByName(str, monitorTrace);
        if (localModelInfoByName == null || isExactBuiltInResource(str2)) {
            return false;
        }
        EPMonitor.traceStep(monitorTrace, "findResourceUri::localModel exist and is not buildIn model");
        ModelConfigArbiter modelConfigArbiter = this.modelConfigArbiter;
        if (modelConfigArbiter != null && (requireDecidedConfigNonBlockling = modelConfigArbiter.requireDecidedConfigNonBlockling(i)) != null) {
            try {
                fileUrl = requireDecidedConfigNonBlockling.getDownloadUrl(str);
            } catch (IllegalArgumentException e) {
                EPLog.e(this.TAG, "model info not found in model list!", e);
                ModelConfigArbiter modelConfigArbiter2 = this.modelConfigArbiter;
                if (modelConfigArbiter2 != null && (singleModelInfoNonBlocking = modelConfigArbiter2.getSingleModelInfoNonBlocking(i, str)) != null) {
                    fileUrl = singleModelInfoNonBlocking.getFileUrl();
                }
            }
            if (fileUrl != null) {
                Uri uri = localModelInfoByName.getUri();
                o.LJFF(uri, "localModelInfo.uri");
                String path = uri.getPath();
                if (path != null) {
                    String fileMD5 = MD5Utils.getFileMD5(new File(path), monitorTrace);
                    String uri2 = fileUrl.getUri();
                    if (TextUtils.equals(fileMD5, uri2)) {
                        return false;
                    }
                    String LIZIZ = UPJ.LIZIZ(str2, " md5 = ", fileMD5, " expectedMd5 = ", uri2);
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("findResourceUri::errorMessage = ");
                    LIZ.append(LIZIZ);
                    EPMonitor.traceStep(monitorTrace, X1D.LIZIZ(LIZ));
                    EPMonitor.traceEnd(monitorTrace);
                    String str3 = this.TAG;
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("findResourceUri() return asset://md5_error\n");
                    LIZ2.append(LIZIZ);
                    EPLog.e(str3, X1D.LIZIZ(LIZ2));
                    onModelNotFound(LIZIZ);
                    monitorStatusRateFail(monitorTrace, str2);
                    return true;
                }
                o.LJIIZILJ();
                throw null;
            }
        }
        EPLog.e(this.TAG, "expected model info not found in model list!");
        return false;
    }
}
