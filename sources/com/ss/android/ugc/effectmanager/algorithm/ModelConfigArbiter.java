package com.ss.android.ugc.effectmanager.algorithm;

import X.C10K;
import X.KMP;
import X.X1D;
import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.effectmanager.AlgorithmModelInfoMemoryCache;
import com.ss.android.ugc.effectmanager.DownloadableModelConfig;
import com.ss.android.ugc.effectmanager.EffectConfiguration;
import com.ss.android.ugc.effectmanager.LoadedModelList;
import com.ss.android.ugc.effectmanager.ModelEventListener;
import com.ss.android.ugc.effectmanager.common.EffectRequest;
import com.ss.android.ugc.effectmanager.common.Multimap;
import com.ss.android.ugc.effectmanager.common.Supplier;
import com.ss.android.ugc.effectmanager.common.cache.IModelCache;
import com.ss.android.ugc.effectmanager.common.logger.EPLog;
import com.ss.android.ugc.effectmanager.common.task.NormalTask;
import com.ss.android.ugc.effectmanager.common.utils.AssetUtils;
import com.ss.android.ugc.effectmanager.common.utils.EffectRequestUtil;
import com.ss.android.ugc.effectmanager.common.utils.NetworkUtils;
import com.ss.android.ugc.effectmanager.effect.task.task.FetchModelInfoByNameTask;
import com.ss.android.ugc.effectmanager.link.model.host.Host;
import com.ss.android.ugc.effectmanager.model.DownloadableModelResponse;
import com.ss.android.ugc.effectmanager.model.ModelInfo;
import com.ss.ugc.effectplatform.model.algorithm.SingleAlgorithmModelResponse;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes16.dex */
public class ModelConfigArbiter {
    public final DownloadableModelConfig mConfig;
    public IModelCache mIModelCache;
    public Map<String, ServerConfig> mModelListMap = new ConcurrentHashMap();
    public Map<String, ModelInfo> mSingleModelMap = new ConcurrentHashMap();
    public Supplier<C10K<ServerConfig>> mTaskSupplier = new Supplier<C10K<ServerConfig>>() { // from class: com.ss.android.ugc.effectmanager.algorithm.ModelConfigArbiter.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.ss.android.ugc.effectmanager.common.Supplier
        public C10K<ServerConfig> get(int i) {
            return ModelConfigArbiter.this.requestServerConfig(i);
        }
    };

    public ModelConfigArbiter(DownloadableModelConfig downloadableModelConfig) {
        this.mConfig = downloadableModelConfig;
    }

    public C10K<ServerConfig> requestServerConfig(final int i) {
        return C10K.LIZIZ(new Callable<ServerConfig>() { // from class: com.ss.android.ugc.effectmanager.algorithm.ModelConfigArbiter.3
            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public ServerConfig call() {
                Stopwatch createStarted = Stopwatch.createStarted();
                ModelEventListener eventListener = ModelConfigArbiter.this.mConfig.getEventListener();
                Handler handler = null;
                Object[] objArr = 0;
                try {
                    final HashMap hashMap = new HashMap();
                    hashMap.put("sdk_version", ModelConfigArbiter.this.mConfig.getSdkVersion());
                    hashMap.put("device_type", ModelConfigArbiter.this.mConfig.getDeviceType());
                    hashMap.put("status", String.valueOf(ModelConfigArbiter.this.mConfig.getModelFileEnv().ordinal()));
                    new NormalTask(handler, objArr == true ? 1 : 0) { // from class: com.ss.android.ugc.effectmanager.algorithm.ModelConfigArbiter.3.1
                        @Override // com.ss.android.ugc.effectmanager.common.task.ITask
                        public void execute() {
                            EffectConfiguration effectConfiguration = ModelConfigArbiter.this.mConfig.getEffectConfiguration();
                            if (effectConfiguration != null) {
                                hashMap.putAll(EffectRequestUtil.INSTANCE.addCommonParams(effectConfiguration));
                            }
                            String loadJson = AssetUtils.loadJson(ModelConfigArbiter.this.mConfig.getAssetManager(), "model/effect_local_config.json");
                            if (!TextUtils.isEmpty(loadJson)) {
                                try {
                                    String optString = new JSONObject(loadJson).optString("tag");
                                    StringBuilder LIZ = X1D.LIZ();
                                    LIZ.append("asset tag = ");
                                    LIZ.append(optString);
                                    EPLog.d("ModelConfigArbiter", X1D.LIZIZ(LIZ));
                                    if (!TextUtils.isEmpty(optString)) {
                                        hashMap.put("tag", optString);
                                    }
                                } catch (JSONException unused) {
                                }
                            }
                            int i2 = i;
                            if (i2 > 0) {
                                hashMap.put("busi_id", String.valueOf(i2));
                            }
                        }
                    }.execute();
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(((Host) ListProtector.get(ModelConfigArbiter.this.mConfig.getHosts(), 0)).getItemName());
                    LIZ.append("/model/api/arithmetics");
                    DownloadableModelResponse downloadableModelResponse = (DownloadableModelResponse) ModelConfigArbiter.this.mConfig.getJsonConverter().convertJsonToObj(ModelConfigArbiter.this.mConfig.getEffectNetWorker().execute(new EffectRequest("GET", NetworkUtils.buildRequestUrl(hashMap, X1D.LIZIZ(LIZ)))), DownloadableModelResponse.class);
                    Multimap multimap = new Multimap();
                    if (downloadableModelResponse != null) {
                        int i2 = downloadableModelResponse.status_code;
                        if (i2 == 0) {
                            DownloadableModelResponse.Data data = downloadableModelResponse.getData();
                            if (data != null && data.getArithmetics() != null) {
                                Map<String, List<ModelInfo>> arithmetics = data.getArithmetics();
                                for (String str : arithmetics.keySet()) {
                                    Iterator<ModelInfo> it = arithmetics.get(str).iterator();
                                    while (it.hasNext()) {
                                        multimap.put(str, it.next());
                                    }
                                }
                                if (eventListener != null) {
                                    eventListener.onFetchModelList(true, null, createStarted.elapsedMillis(), ModelConfigArbiter.this.mConfig.getSdkVersion());
                                }
                                return new ServerConfig(multimap);
                            }
                            throw new IllegalStateException("status_code == 0 but data == null, indicates there may be an internal server error");
                        }
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("status code == ");
                        LIZ2.append(i2);
                        LIZ2.append(" , indicates there is no model config from server, sdk version is ");
                        LIZ2.append(ModelConfigArbiter.this.mConfig.getSdkVersion());
                        throw new IllegalStateException(X1D.LIZIZ(LIZ2));
                    }
                    throw new IllegalStateException("response == null, indicates there may be an internal server error");
                } catch (IllegalStateException e) {
                    if (eventListener != null) {
                        eventListener.onFetchModelList(false, e.getMessage(), createStarted.elapsedMillis(), ModelConfigArbiter.this.mConfig.getSdkVersion());
                    }
                    return null;
                }
            }
        }, this.mConfig.getExecutor(), null);
    }

    public synchronized LoadedModelList requireDecidedConfig(int i) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("biz_");
        LIZ.append(i);
        String LIZIZ = X1D.LIZIZ(LIZ);
        ServerConfig serverConfig = this.mModelListMap.get(LIZIZ);
        if (serverConfig != null && serverConfig.getLoadedModelList() != null) {
            return serverConfig.getLoadedModelList();
        }
        C10K<ServerConfig> c10k = this.mTaskSupplier.get(i);
        try {
            c10k.LJIJI();
            if (!c10k.LJIILJJIL()) {
                final ServerConfig LJIIJJI = c10k.LJIIJJI();
                if (this.mIModelCache != null) {
                    C10K.LIZJ(new Callable<Void>() { // from class: com.ss.android.ugc.effectmanager.algorithm.ModelConfigArbiter.4
                        @Override // java.util.concurrent.Callable
                        public Void call() {
                            AlgorithmModelInfoMemoryCache.INSTANCE.buildCache(LJIIJJI.getLoadedModelList(), ModelConfigArbiter.this.mIModelCache);
                            return null;
                        }
                    });
                }
                if (LJIIJJI != null) {
                    if (LJIIJJI.getLoadedModelList() != null) {
                        this.mModelListMap.put(LIZIZ, LJIIJJI);
                        return LJIIJJI.getLoadedModelList();
                    }
                    throw new RuntimeException("loadedModelList == null");
                }
                throw new RuntimeException("config == null");
            }
            throw new RuntimeException(c10k.LJIIJ());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public LoadedModelList requireDecidedConfigNonBlockling(final int i) {
        ServerConfig serverConfig = this.mModelListMap.get(KMP.LJ("biz_", i));
        if (serverConfig != null && serverConfig.getLoadedModelList() != null) {
            return serverConfig.getLoadedModelList();
        }
        C10K.LIZJ(new Callable<Object>() { // from class: com.ss.android.ugc.effectmanager.algorithm.ModelConfigArbiter.5
            @Override // java.util.concurrent.Callable
            public Object call() {
                ModelConfigArbiter.this.requireDecidedConfig(i);
                return null;
            }
        });
        return null;
    }

    public void setIModelCache(IModelCache iModelCache) {
        this.mIModelCache = iModelCache;
    }

    private C10K<ModelInfo> requestSingleModel(final int i, final String str) {
        return C10K.LIZIZ(new Callable<ModelInfo>() { // from class: com.ss.android.ugc.effectmanager.algorithm.ModelConfigArbiter.2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public ModelInfo call() {
                SingleAlgorithmModelResponse runDirectly = new FetchModelInfoByNameTask(ModelConfigArbiter.this.mConfig, str, i, null, null, null).runDirectly();
                if (runDirectly == null || runDirectly.getData() == null || runDirectly.getData().getFile_url() == null) {
                    return null;
                }
                return new ModelInfo(runDirectly.getData());
            }
        }, this.mConfig.getExecutor(), null);
    }

    public synchronized ModelInfo getSingleModelInfo(int i, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ModelInfo modelInfo = this.mSingleModelMap.get(str);
        if (modelInfo == null) {
            C10K<ModelInfo> requestSingleModel = requestSingleModel(i, str);
            try {
                requestSingleModel.LJIJI();
                if (!requestSingleModel.LJIILJJIL()) {
                    modelInfo = requestSingleModel.LJIIJJI();
                    this.mSingleModelMap.put(str, modelInfo);
                } else {
                    throw new RuntimeException(requestSingleModel.LJIIJ());
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        return modelInfo;
    }

    public ModelInfo getSingleModelInfoNonBlocking(final int i, final String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ModelInfo modelInfo = this.mSingleModelMap.get(str);
        if (modelInfo == null) {
            C10K.LIZJ(new Callable<Object>() { // from class: com.ss.android.ugc.effectmanager.algorithm.ModelConfigArbiter.6
                @Override // java.util.concurrent.Callable
                public Object call() {
                    ModelConfigArbiter.this.getSingleModelInfo(i, str);
                    return null;
                }
            });
        }
        return modelInfo;
    }
}
