package com.ss.android.ugc.effectmanager.algorithm;

import X.C37692Eqm;
import X.C61878OQg;
import X.C84418XBe;
import X.X1D;
import X.XDR;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.bytex.pthread.base.PThreadExecutorsUtils;
import com.ss.android.ugc.bytex.thread_rename.base.DefaultThreadFactory;
import com.ss.android.ugc.effectmanager.AlgorithmModelInfoMemoryCache;
import com.ss.android.ugc.effectmanager.DownloadableModelConfig;
import com.ss.android.ugc.effectmanager.EffectConfiguration;
import com.ss.android.ugc.effectmanager.FetchModelType;
import com.ss.android.ugc.effectmanager.ListenerManger;
import com.ss.android.ugc.effectmanager.LoadedModelList;
import com.ss.android.ugc.effectmanager.ModelEventListener;
import com.ss.android.ugc.effectmanager.common.EffectConstants;
import com.ss.android.ugc.effectmanager.common.ModelNameProcessor;
import com.ss.android.ugc.effectmanager.common.TaskManager;
import com.ss.android.ugc.effectmanager.common.WeakHandler;
import com.ss.android.ugc.effectmanager.common.cache.IModelCache;
import com.ss.android.ugc.effectmanager.common.listener.IMonitorService;
import com.ss.android.ugc.effectmanager.common.logger.EPLog;
import com.ss.android.ugc.effectmanager.common.monitor.EPMonitor;
import com.ss.android.ugc.effectmanager.common.monitor.MonitorTrace;
import com.ss.android.ugc.effectmanager.common.network.EffectNetWorkerWrapper;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.common.utils.CollectionUtil;
import com.ss.android.ugc.effectmanager.common.utils.EventJsonBuilder;
import com.ss.android.ugc.effectmanager.common.utils.TaskUtil;
import com.ss.android.ugc.effectmanager.download.IModelDownloader;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.task.task.FetchModelInfoByNameTask;
import com.ss.android.ugc.effectmanager.model.FetchSingleAlgorithmModelTaskResult;
import com.ss.android.ugc.effectmanager.model.LocalModelInfo;
import com.ss.android.ugc.effectmanager.model.ModelInfo;
import com.ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel;
import com.ss.ugc.effectplatform.model.algorithm.SingleAlgorithmModelResponse;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class ModelFetcher implements WeakHandler.IHandler {
    public static final Companion Companion = new Companion();
    public final DownloadableModelConfig config;
    public final ModelEventListener eventListener;
    public final WeakHandler handler;
    public final IModelCache modelCache;
    public final ModelConfigArbiter modelConfigArbiter;
    public IModelDownloader modelDownloader;
    public final IMonitorService monitorService;
    public final EffectNetWorkerWrapper netWorker;

    private final TaskManager createEffectTaskManager() {
        TaskManager.TaskManagerConfig taskManagerConfig = new TaskManager.TaskManagerConfig();
        taskManagerConfig.setExecutor(PThreadExecutorsUtils.newCachedThreadPool(new DefaultThreadFactory("/ModelFetcher")), false);
        TaskManager taskManager = new TaskManager();
        taskManager.init(taskManagerConfig);
        return taskManager;
    }

    /* loaded from: classes16.dex */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final ModelEventListener getEventListener() {
        return this.eventListener;
    }

    public final WeakHandler getHandler() {
        return this.handler;
    }

    public final IModelDownloader getModelDownloader() {
        return this.modelDownloader;
    }

    public final IMonitorService getMonitorService() {
        return this.monitorService;
    }

    private final boolean canFallbackToBuiltInResources(String[] strArr) {
        for (String str : strArr) {
            IModelCache iModelCache = this.modelCache;
            if (iModelCache == null || !iModelCache.isBuiltInResource(str)) {
                return false;
            }
        }
        return true;
    }

    private final String normalizeResourceName(String str) {
        String nameOfModel = ModelNameProcessor.getNameOfModel(str);
        o.LJFF(nameOfModel, "ModelNameProcessor.getNameOfModel(resourceName)");
        return nameOfModel;
    }

    public final Collection<ModelInfo> collectNeedDownloadModelsListNonBlocking(String[] resourceNamesArray) {
        o.LJIIJ(resourceNamesArray, "resourceNamesArray");
        LoadedModelList requireDecidedConfigNonBlockling = this.modelConfigArbiter.requireDecidedConfigNonBlockling(0);
        if (requireDecidedConfigNonBlockling != null) {
            return collectNeedDownloadModelsListInternal(0, resourceNamesArray, requireDecidedConfigNonBlockling, null);
        }
        return new ArrayList();
    }

    public final void fetchModels(String[] strArr) {
        if (strArr != null) {
            fetchModels(0, strArr);
        }
    }

    @Override // com.ss.android.ugc.effectmanager.common.WeakHandler.IHandler
    public void handleMsg(Message message) {
        XDR kNPlatformListener;
        if (message != null && message.what == 70) {
            Object obj = message.obj;
            if (obj instanceof FetchSingleAlgorithmModelTaskResult) {
                if (obj != null) {
                    FetchSingleAlgorithmModelTaskResult fetchSingleAlgorithmModelTaskResult = (FetchSingleAlgorithmModelTaskResult) obj;
                    EffectConfiguration effectConfiguration = this.config.getEffectConfiguration();
                    o.LJFF(effectConfiguration, "config.effectConfiguration");
                    ListenerManger listenerManger = effectConfiguration.getListenerManger();
                    if (listenerManger != null && (kNPlatformListener = listenerManger.getKNPlatformListener(fetchSingleAlgorithmModelTaskResult.getTaskID())) != null) {
                        ExceptionResult exceptionResult = fetchSingleAlgorithmModelTaskResult.getExceptionResult();
                        SingleAlgorithmModelResponse response = fetchSingleAlgorithmModelTaskResult.getResponse();
                        if (exceptionResult != null) {
                            kNPlatformListener.onFail(null, new C84418XBe(exceptionResult.getErrorCode(), exceptionResult.getException()));
                        } else if (response == null) {
                            kNPlatformListener.onFail(null, new C84418XBe(10002));
                        } else {
                            kNPlatformListener.onSuccess(response.getData());
                        }
                        EffectConfiguration effectConfiguration2 = this.config.getEffectConfiguration();
                        o.LJFF(effectConfiguration2, "config.effectConfiguration");
                        ListenerManger listenerManger2 = effectConfiguration2.getListenerManger();
                        if (listenerManger2 != null) {
                            listenerManger2.removeKNPlatformListener(fetchSingleAlgorithmModelTaskResult.getTaskID());
                            return;
                        }
                        return;
                    }
                    return;
                }
                throw new C37692Eqm("null cannot be cast to non-null type com.ss.android.ugc.effectmanager.model.FetchSingleAlgorithmModelTaskResult");
            }
        }
    }

    public final void setModelDownloader(IModelDownloader iModelDownloader) {
        this.modelDownloader = iModelDownloader;
    }

    private final ModelInfo getLatestModelInfo(int i, String str) {
        LoadedModelList requireDecidedConfig = this.modelConfigArbiter.requireDecidedConfig(i);
        o.LJFF(requireDecidedConfig, "modelConfigArbiter.requi…DecidedConfig(businessId)");
        for (LoadedModelList.ModelInfoState state : requireDecidedConfig.mRequirementModelInfoStateMap.values()) {
            o.LJFF(state, "state");
            if (o.LJ(state.getName(), str)) {
                return state.getModelInfo();
            }
        }
        return null;
    }

    private final ModelInfo getSingleModelInfo(int i, String str) {
        return this.modelConfigArbiter.getSingleModelInfo(i, str);
    }

    private final ModelInfo getSingleModelInfoNonBlocking(int i, String str) {
        return this.modelConfigArbiter.getSingleModelInfoNonBlocking(i, str);
    }

    private final void onFailOver(ModelInfo modelInfo, RuntimeException runtimeException) {
        IModelCache iModelCache = this.modelCache;
        if (iModelCache != null) {
            LocalModelInfo localModelInfoByName = iModelCache.getLocalModelInfoByName(modelInfo.getName(), null);
            if (localModelInfoByName != null) {
                if (ModelNameProcessor.isBigVersionEquals(localModelInfoByName.getVersion(), modelInfo.getVersion())) {
                    return;
                } else {
                    throw runtimeException;
                }
            }
            throw runtimeException;
        }
        throw runtimeException;
    }

    private final Effect parseEffect(Effect effect, ModelInfo modelInfo) {
        if (effect != null) {
            return effect;
        }
        Effect effect2 = new Effect(null, 1, null);
        effect2.setName(modelInfo.getName());
        return effect2;
    }

    public final void fetchModels(int i, String[] resourceNames) {
        o.LJIIJ(resourceNames, "resourceNames");
        fetchModels(i, resourceNames, new MonitorTrace(resourceNames.toString()));
    }

    private final synchronized void fetchModels(int i, String[] strArr, MonitorTrace monitorTrace) {
        try {
            downloadAndUpdateModelList(null, collectNeedDownloadModelsList(i, strArr, monitorTrace), monitorTrace);
        } catch (RuntimeException e) {
            if (!canFallbackToBuiltInResources(strArr)) {
                throw e;
            }
        }
    }

    private final boolean isModelNeedUpdate(LocalModelInfo localModelInfo, ModelInfo modelInfo, MonitorTrace monitorTrace) {
        if (localModelInfo == null) {
            return true;
        }
        if (!TextUtils.equals(localModelInfo.getVersion(), modelInfo.getVersion())) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("model ");
            LIZ.append(localModelInfo.getName());
            LIZ.append(" version not equals, local model version:");
            LIZ.append(localModelInfo.getVersion());
            LIZ.append(", lastest model: ");
            LIZ.append(modelInfo.getVersion());
            EPLog.d("ModelFetcher", X1D.LIZIZ(LIZ));
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("version changed [");
            LIZ2.append(localModelInfo.getVersion());
            LIZ2.append(" → ");
            LIZ2.append(modelInfo.getVersion());
            LIZ2.append("], Need update!");
            EPMonitor.traceStep(monitorTrace, X1D.LIZIZ(LIZ2));
            return true;
        }
        if (localModelInfo.getSize() == modelInfo.getType()) {
            if (TextUtils.equals(localModelInfo.getMD5(), modelInfo.getMD5())) {
                return false;
            }
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("model ");
            LIZ3.append(localModelInfo.getName());
            LIZ3.append(" md5 not equals, local model type:");
            LIZ3.append(localModelInfo.getMD5());
            LIZ3.append(", lastest model: ");
            LIZ3.append(modelInfo.getMD5());
            EPLog.d("ModelFetcher", X1D.LIZIZ(LIZ3));
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("md5 changed [");
            LIZ4.append(localModelInfo.getMD5());
            LIZ4.append(" → ");
            LIZ4.append(modelInfo.getMD5());
            LIZ4.append("], Need update!");
            EPMonitor.traceStep(monitorTrace, X1D.LIZIZ(LIZ4));
            return true;
        }
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append("model ");
        LIZ5.append(localModelInfo.getName());
        LIZ5.append(" size not equals, local model type:");
        LIZ5.append(localModelInfo.getSize());
        LIZ5.append(", lastest model: ");
        LIZ5.append(modelInfo.getType());
        EPLog.d("ModelFetcher", X1D.LIZIZ(LIZ5));
        StringBuilder LIZ6 = X1D.LIZ();
        LIZ6.append("size changed [");
        LIZ6.append(localModelInfo.getSize());
        LIZ6.append(" → ");
        LIZ6.append(modelInfo.getType());
        LIZ6.append("], Need update!");
        EPMonitor.traceStep(monitorTrace, X1D.LIZIZ(LIZ6));
        return true;
    }

    public final Collection<ModelInfo> collectNeedDownloadModelsList(int i, String[] resourceNamesArray, MonitorTrace monitorTrace) {
        o.LJIIJ(resourceNamesArray, "resourceNamesArray");
        LoadedModelList requireDecidedConfig = this.modelConfigArbiter.requireDecidedConfig(i);
        o.LJFF(requireDecidedConfig, "modelConfigArbiter.requi…DecidedConfig(businessId)");
        return collectNeedDownloadModelsListInternal(i, resourceNamesArray, requireDecidedConfig, monitorTrace);
    }

    public final Map<String, Boolean> downloadAndUpdateModelList(Effect effect, Collection<ModelInfo> collection, MonitorTrace monitorTrace) {
        ModelFetcher modelFetcher;
        Effect effect2;
        MonitorTrace monitorTrace2;
        long j;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (collection != null) {
            for (ModelInfo modelInfo : collection) {
                Stopwatch stopwatch = Stopwatch.createStarted();
                try {
                    effect2 = effect;
                    monitorTrace2 = monitorTrace;
                    modelFetcher = this;
                    ModelEventListener modelEventListener = modelFetcher.eventListener;
                    if (modelEventListener != null) {
                        modelEventListener.onModelDownloadStart(modelFetcher.parseEffect(effect2, modelInfo), modelInfo);
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("download start:");
                    LIZ.append(modelInfo);
                    EPMonitor.traceStep(monitorTrace2, X1D.LIZIZ(LIZ));
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("fetchModels, model: ");
                    LIZ2.append(modelInfo.getName());
                    LIZ2.append(", version: ");
                    LIZ2.append(modelInfo.getVersion());
                    LIZ2.append(" download start!");
                    EPLog.d("ModelFetcher", X1D.LIZIZ(LIZ2));
                    IModelDownloader iModelDownloader = modelFetcher.modelDownloader;
                    if (iModelDownloader != null) {
                        FetchModelType modelType = modelFetcher.config.getModelType();
                        o.LJFF(modelType, "config.modelType");
                        j = iModelDownloader.download(modelInfo, modelType, monitorTrace2);
                    } else {
                        j = 0;
                    }
                    if (j > 0) {
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append("download success:");
                        LIZ3.append(modelInfo);
                        EPMonitor.traceStep(monitorTrace2, X1D.LIZIZ(LIZ3));
                        EPMonitor.traceEnd(monitorTrace2);
                        Effect parseEffect = modelFetcher.parseEffect(effect2, modelInfo);
                        o.LJFF(stopwatch, "stopwatch");
                        modelFetcher.onDownloadSuccess(parseEffect, modelInfo, stopwatch, currentTimeMillis, j);
                        StringBuilder LIZ4 = X1D.LIZ();
                        LIZ4.append("model::");
                        LIZ4.append(modelInfo.getName());
                        LIZ4.append(",version = ");
                        LIZ4.append(modelInfo.getVersion());
                        LIZ4.append(",size = ");
                        LIZ4.append(modelInfo.getType());
                        LIZ4.append(" download success!");
                        EPLog.d("ModelFetcher", X1D.LIZIZ(LIZ4));
                        linkedHashMap.put(modelInfo.getName(), Boolean.TRUE);
                    } else {
                        StringBuilder LIZ5 = X1D.LIZ();
                        LIZ5.append("download failed:");
                        LIZ5.append(modelInfo);
                        EPMonitor.traceStep(monitorTrace2, X1D.LIZIZ(LIZ5));
                        EPMonitor.traceEnd(monitorTrace2);
                        StringBuilder LIZ6 = X1D.LIZ();
                        LIZ6.append("download model fail, downloadFileSize = ");
                        LIZ6.append(j);
                        RuntimeException runtimeException = new RuntimeException(X1D.LIZIZ(LIZ6));
                        modelFetcher.onDownloadFailure(modelFetcher.parseEffect(effect2, modelInfo), modelInfo, runtimeException, monitorTrace2);
                        StringBuilder LIZ7 = X1D.LIZ();
                        LIZ7.append("model::");
                        LIZ7.append(modelInfo.getName());
                        LIZ7.append(",info.getVersion() = ");
                        LIZ7.append(modelInfo.getVersion());
                        LIZ7.append(", size = ");
                        LIZ7.append(modelInfo.getType());
                        LIZ7.append(" download failure");
                        EPLog.d("ModelFetcher", X1D.LIZIZ(LIZ7));
                        modelFetcher.onFailOver(modelInfo, runtimeException);
                        linkedHashMap.put(modelInfo.getName(), Boolean.FALSE);
                    }
                } catch (RuntimeException e) {
                    StringBuilder LIZ8 = X1D.LIZ();
                    LIZ8.append("downloadAndUpdateModelList exception occurred: cause = ");
                    LIZ8.append(e.getMessage());
                    EPMonitor.traceStep(monitorTrace2, X1D.LIZIZ(LIZ8));
                    EPMonitor.traceEnd(monitorTrace2);
                    modelFetcher.onDownloadFailure(modelFetcher.parseEffect(effect2, modelInfo), modelInfo, e, monitorTrace2);
                    modelFetcher.onFailOver(modelInfo, e);
                    linkedHashMap.put(modelInfo.getName(), Boolean.FALSE);
                }
            }
        }
        return linkedHashMap;
    }

    public ModelFetcher(DownloadableModelConfig config, ModelConfigArbiter modelConfigArbiter, IModelCache iModelCache, EffectNetWorkerWrapper netWorker) {
        o.LJIIJ(config, "config");
        o.LJIIJ(modelConfigArbiter, "modelConfigArbiter");
        o.LJIIJ(netWorker, "netWorker");
        this.config = config;
        this.modelConfigArbiter = modelConfigArbiter;
        this.modelCache = iModelCache;
        this.netWorker = netWorker;
        this.eventListener = config.getEventListener();
        this.monitorService = config.getMonitorService();
        this.handler = new WeakHandler(this);
        this.modelDownloader = new ModelDownloader((DownloadedModelStorage) iModelCache, netWorker);
    }

    private final void onDownloadFailure(Effect effect, ModelInfo modelInfo, Exception exc, MonitorTrace monitorTrace) {
        String str;
        List<String> list;
        List<String> list2;
        ExtendedUrlModel file_url;
        List<String> url_list;
        ExceptionResult exceptionResult = new ExceptionResult(exc);
        String str2 = null;
        if (modelInfo.getFile_url() != null) {
            ExtendedUrlModel file_url2 = modelInfo.getFile_url();
            if (file_url2 != null) {
                list2 = file_url2.getUrl_list();
            } else {
                list2 = null;
            }
            if (!CollectionUtil.isListEmpty(list2) && (file_url = modelInfo.getFile_url()) != null && (url_list = file_url.getUrl_list()) != null) {
                str2 = (String) ListProtector.get(url_list, 0);
            }
        }
        try {
            InetAddress byName = InetAddress.getByName(new URL(str2).getHost());
            o.LJFF(byName, "InetAddress.getByName(urlHost.host)");
            str = byName.getHostAddress();
        } catch (MalformedURLException | UnknownHostException unused) {
            str = "";
        }
        IMonitorService iMonitorService = this.monitorService;
        if (iMonitorService != null) {
            EventJsonBuilder newBuilder = EventJsonBuilder.newBuilder();
            newBuilder.addValuePair("app_id", this.config.getAppId());
            newBuilder.addValuePair("access_key", this.config.getAccessKey());
            newBuilder.addValuePair("resource_name", modelInfo.getName());
            newBuilder.addValuePair("resource_type", this.config.getModelType().toString());
            newBuilder.addValuePair("error_msg", exc.getMessage());
            newBuilder.addValuePair("error_code", Integer.valueOf(exceptionResult.getErrorCode()));
            newBuilder.addValuePair("download_url", str2);
            newBuilder.addValuePair("host_ip", str);
            if (monitorTrace == null || (list = monitorTrace.getStepList()) == null) {
                list = C61878OQg.INSTANCE;
            }
            newBuilder.addValuePair("monitor_trace", list);
            iMonitorService.monitorStatusRate("resource_download_success_rate", 1, newBuilder.build());
        }
        ModelEventListener modelEventListener = this.eventListener;
        if (modelEventListener != null) {
            modelEventListener.onModelDownloadError(effect, modelInfo, exc);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0160  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Collection<com.ss.android.ugc.effectmanager.model.ModelInfo> collectNeedDownloadModelsListInternal(int r16, java.lang.String[] r17, com.ss.android.ugc.effectmanager.LoadedModelList r18, com.ss.android.ugc.effectmanager.common.monitor.MonitorTrace r19) {
        /*
            Method dump skipped, instructions count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.algorithm.ModelFetcher.collectNeedDownloadModelsListInternal(int, java.lang.String[], com.ss.android.ugc.effectmanager.LoadedModelList, com.ss.android.ugc.effectmanager.common.monitor.MonitorTrace):java.util.Collection");
    }

    private final void onDownloadSuccess(Effect effect, ModelInfo modelInfo, Stopwatch stopwatch, long j, long j2) {
        long j3 = j2 / EffectConstants.KB;
        modelInfo.setTotalSize(j3);
        AlgorithmModelInfoMemoryCache.writeModelInfo(modelInfo);
        long currentTimeMillis = System.currentTimeMillis() - j;
        IMonitorService iMonitorService = this.monitorService;
        if (iMonitorService != null) {
            EventJsonBuilder newBuilder = EventJsonBuilder.newBuilder();
            newBuilder.addValuePair("app_id", this.config.getAppId());
            newBuilder.addValuePair("access_key", this.config.getAccessKey());
            newBuilder.addValuePair("duration", Long.valueOf(currentTimeMillis));
            newBuilder.addValuePair("resource_name", modelInfo.getName());
            newBuilder.addValuePair("resource_type", this.config.getModelType().toString());
            newBuilder.addValuePair("size", Long.valueOf(j3));
            iMonitorService.monitorStatusRate("resource_download_success_rate", 0, newBuilder.build());
        }
        ModelEventListener modelEventListener = this.eventListener;
        if (modelEventListener != null) {
            modelEventListener.onModelDownloadSuccess(effect, modelInfo, stopwatch.elapsedMillis());
        }
    }

    public final void fetchModelByNameDirectlyFromServer(String str, int i, String str2, boolean z, XDR<com.ss.ugc.effectplatform.model.algorithm.ModelInfo> xdr) {
        if (str == null || str.length() == 0) {
            if (xdr != null) {
                xdr.onFail(null, new C84418XBe(new RuntimeException("model name is null!")));
                return;
            }
            return;
        }
        String generateTaskId = TaskUtil.INSTANCE.generateTaskId();
        ModelFetcher$fetchModelByNameDirectlyFromServer$wrappedListener$1 modelFetcher$fetchModelByNameDirectlyFromServer$wrappedListener$1 = new ModelFetcher$fetchModelByNameDirectlyFromServer$wrappedListener$1(this, xdr, z, str);
        EffectConfiguration effectConfiguration = this.config.getEffectConfiguration();
        o.LJFF(effectConfiguration, "config.effectConfiguration");
        ListenerManger listenerManger = effectConfiguration.getListenerManger();
        if (listenerManger != null) {
            listenerManger.addNewKNPlatformListener(generateTaskId, modelFetcher$fetchModelByNameDirectlyFromServer$wrappedListener$1);
        }
        FetchModelInfoByNameTask fetchModelInfoByNameTask = new FetchModelInfoByNameTask(this.config, str, i, str2, generateTaskId, this.handler);
        EffectConfiguration effectConfiguration2 = this.config.getEffectConfiguration();
        o.LJFF(effectConfiguration2, "config.effectConfiguration");
        TaskManager taskManager = effectConfiguration2.getTaskManager();
        if (taskManager == null) {
            taskManager = createEffectTaskManager();
            EffectConfiguration effectConfiguration3 = this.config.getEffectConfiguration();
            o.LJFF(effectConfiguration3, "config.effectConfiguration");
            effectConfiguration3.setTaskManager(taskManager);
        }
        taskManager.commit(fetchModelInfoByNameTask);
    }

    public static /* synthetic */ void fetchModelByNameDirectlyFromServer$default(ModelFetcher modelFetcher, String str, int i, String str2, boolean z, XDR xdr, int i2, Object obj) {
        String str3 = str2;
        boolean z2 = z;
        XDR xdr2 = null;
        if ((i2 & 4) != 0) {
            str3 = null;
        }
        if ((i2 & 8) != 0) {
            z2 = true;
        }
        if ((i2 & 16) == 0) {
            xdr2 = xdr;
        }
        modelFetcher.fetchModelByNameDirectlyFromServer(str, i, str3, z2, xdr2);
    }
}
