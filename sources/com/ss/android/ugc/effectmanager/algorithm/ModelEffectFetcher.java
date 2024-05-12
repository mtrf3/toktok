package com.ss.android.ugc.effectmanager.algorithm;

import X.ORZ;
import X.X1D;
import com.ss.android.ugc.effectmanager.DownloadableModelConfig;
import com.ss.android.ugc.effectmanager.algorithm.ModelEffectFetcher;
import com.ss.android.ugc.effectmanager.common.cache.IModelCache;
import com.ss.android.ugc.effectmanager.common.listener.IMonitorService;
import com.ss.android.ugc.effectmanager.common.network.EffectNetWorkerWrapper;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.common.task.SyncTask;
import com.ss.android.ugc.effectmanager.common.task.SyncTaskListener;
import com.ss.android.ugc.effectmanager.common.utils.EffectUtils;
import com.ss.android.ugc.effectmanager.common.utils.EventJsonBuilder;
import com.ss.android.ugc.effectmanager.effect.bridge.EffectFetcher;
import com.ss.android.ugc.effectmanager.effect.bridge.EffectFetcherArguments;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.task.result.EffectTaskResult;
import com.ss.android.ugc.effectmanager.effect.task.task.DefaultEffectFetcher;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class ModelEffectFetcher implements EffectFetcher {
    public final DownloadableModelConfig config;
    public final IModelCache modelCache;
    public final ModelConfigArbiter modelConfigArbiter;
    public final ModelFetcher modelFetcher;
    public final EffectNetWorkerWrapper netWorker;

    /* loaded from: classes16.dex */
    public final class FetchModelAndEffectTask extends SyncTask<EffectTaskResult> {
        public final EffectFetcherArguments arguments;
        public final ModelFetcher modelFetcher;
        public final /* synthetic */ ModelEffectFetcher this$0;
        public final SyncTask<EffectTaskResult> wrappedTask;

        private final SyncTaskListener<EffectTaskResult> getListener() {
            return new SyncTaskListener<EffectTaskResult>() { // from class: com.ss.android.ugc.effectmanager.algorithm.ModelEffectFetcher$FetchModelAndEffectTask$getListener$1
                @Override // com.ss.android.ugc.effectmanager.common.task.SyncTaskListener
                public void onStart(SyncTask<EffectTaskResult> syncTask) {
                    o.LJIIJ(syncTask, "syncTask");
                }

                @Override // com.ss.android.ugc.effectmanager.common.task.SyncTaskListener
                public void onFinally(SyncTask<EffectTaskResult> syncTask) {
                    o.LJIIJ(syncTask, "syncTask");
                    ModelEffectFetcher.FetchModelAndEffectTask fetchModelAndEffectTask = ModelEffectFetcher.FetchModelAndEffectTask.this;
                    fetchModelAndEffectTask.onFinally(fetchModelAndEffectTask);
                }

                @Override // com.ss.android.ugc.effectmanager.common.task.SyncTaskListener
                public void onFailed(SyncTask<EffectTaskResult> syncTask, ExceptionResult e) {
                    o.LJIIJ(syncTask, "syncTask");
                    o.LJIIJ(e, "e");
                    ModelEffectFetcher.FetchModelAndEffectTask fetchModelAndEffectTask = ModelEffectFetcher.FetchModelAndEffectTask.this;
                    fetchModelAndEffectTask.onFailed(fetchModelAndEffectTask, e);
                }

                @Override // com.ss.android.ugc.effectmanager.common.task.SyncTaskListener
                public void onResponse(SyncTask<EffectTaskResult> syncTask, EffectTaskResult response) {
                    o.LJIIJ(syncTask, "syncTask");
                    o.LJIIJ(response, "response");
                    ModelEffectFetcher.FetchModelAndEffectTask fetchModelAndEffectTask = ModelEffectFetcher.FetchModelAndEffectTask.this;
                    fetchModelAndEffectTask.onResponse(fetchModelAndEffectTask, response);
                }

                @Override // com.ss.android.ugc.effectmanager.common.task.SyncTaskListener
                public void onProgress(SyncTask<EffectTaskResult> syncTask, int i, long j) {
                    o.LJIIJ(syncTask, "syncTask");
                    ModelEffectFetcher.FetchModelAndEffectTask.this.onProgress(syncTask, i, j);
                }
            };
        }

        @Override // com.ss.android.ugc.effectmanager.common.task.SyncTask
        public void execute() {
            Effect effect;
            String str;
            String str2;
            List<String> requirements_sec;
            try {
                onStart(this);
                EffectFetcherArguments effectFetcherArguments = this.arguments;
                List list = null;
                if (effectFetcherArguments != null) {
                    effect = effectFetcherArguments.getEffect();
                } else {
                    effect = null;
                }
                if (EffectUtils.isRequirementsInvalid(effect)) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("Effect Requirements Decrypt Failed, ");
                    LIZ.append("effect: ");
                    if (effect == null) {
                        str = null;
                    } else {
                        str = effect.getEffect_id();
                    }
                    LIZ.append(str);
                    LIZ.append(", name: ");
                    if (effect == null) {
                        str2 = null;
                    } else {
                        str2 = effect.getName();
                    }
                    LIZ.append(str2);
                    LIZ.append(", toDownloadRequirements: ");
                    if (effect != null && (requirements_sec = effect.getRequirements_sec()) != null) {
                        list = ORZ.LLJI(requirements_sec);
                    }
                    LIZ.append(list);
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException(X1D.LIZIZ(LIZ));
                    onFailed(this, new ExceptionResult(illegalArgumentException));
                    mobEffectDownloadFail(effect, illegalArgumentException);
                    return;
                }
                try {
                    this.modelFetcher.fetchModels(this.this$0.peekResourceNameArray(this.arguments));
                    SyncTask<EffectTaskResult> syncTask = this.wrappedTask;
                    if (syncTask != null) {
                        syncTask.execute();
                    }
                } catch (Exception e) {
                    mobEffectDownloadFail(effect, e);
                    throw e;
                }
            } catch (Exception e2) {
                try {
                    onFailed(this, new ExceptionResult(e2));
                } finally {
                    onFinally(this);
                }
            }
        }

        private final void mobEffectDownloadFail(Effect effect, Exception exc) {
            String effectId;
            IMonitorService monitorService = this.this$0.config.getMonitorService();
            if (monitorService != null) {
                EventJsonBuilder newBuilder = EventJsonBuilder.newBuilder();
                String appId = this.this$0.config.getAppId();
                String str = "";
                if (appId == null) {
                    appId = "";
                }
                newBuilder.addValuePair("app_id", appId);
                String accessKey = this.this$0.config.getAccessKey();
                if (accessKey == null) {
                    accessKey = "";
                }
                newBuilder.addValuePair("access_key", accessKey);
                if (effect != null && (effectId = effect.getEffectId()) != null) {
                    str = effectId;
                }
                newBuilder.addValuePair("effect_id", str);
                newBuilder.addValuePair("error_code", (Integer) 10018);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("download effect failed because of model fetcher failed! detail: ");
                LIZ.append(exc.getMessage());
                newBuilder.addValuePair("error_msg", X1D.LIZIZ(LIZ));
                newBuilder.addValuePair("effect_platform_type", (Integer) 0);
                monitorService.monitorStatusRate("effect_download_success_rate", 1, newBuilder.build());
            }
        }

        public FetchModelAndEffectTask(ModelEffectFetcher modelEffectFetcher, SyncTask<EffectTaskResult> syncTask, ModelFetcher modelFetcher, EffectFetcherArguments effectFetcherArguments) {
            o.LJIIJ(modelFetcher, "modelFetcher");
            this.this$0 = modelEffectFetcher;
            this.wrappedTask = syncTask;
            this.modelFetcher = modelFetcher;
            this.arguments = effectFetcherArguments;
            if (syncTask != null) {
                syncTask.setListener(getListener());
            }
        }
    }

    public String[] peekResourceNameArray(EffectFetcherArguments effectFetcherArguments) {
        return new String[0];
    }

    public final IModelCache getModelCache() {
        return this.modelCache;
    }

    public final ModelConfigArbiter getModelConfigArbiter() {
        return this.modelConfigArbiter;
    }

    public final ModelFetcher getModelFetcher() {
        return this.modelFetcher;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.bridge.EffectFetcher
    public SyncTask<EffectTaskResult> fetchEffect(EffectFetcherArguments effectFetcherArguments) {
        return new FetchModelAndEffectTask(this, new DefaultEffectFetcher(this.netWorker, this.config.getMonitorService(), this.config.getAppId(), this.config.getAccessKey()).fetchEffect(effectFetcherArguments), this.modelFetcher, effectFetcherArguments);
    }

    public ModelEffectFetcher(DownloadableModelConfig config, ModelConfigArbiter modelConfigArbiter, IModelCache iModelCache, EffectNetWorkerWrapper netWorker) {
        o.LJIIJ(config, "config");
        o.LJIIJ(modelConfigArbiter, "modelConfigArbiter");
        o.LJIIJ(netWorker, "netWorker");
        this.config = config;
        this.modelConfigArbiter = modelConfigArbiter;
        this.modelCache = iModelCache;
        this.netWorker = netWorker;
        this.modelFetcher = new ModelFetcher(config, modelConfigArbiter, iModelCache, netWorker);
    }
}
