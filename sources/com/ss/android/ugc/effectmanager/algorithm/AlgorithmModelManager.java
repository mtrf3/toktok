package com.ss.android.ugc.effectmanager.algorithm;

import X.C10I;
import X.C10K;
import X.C221108m2;
import X.C5H3;
import X.C84393XAf;
import X.C84418XBe;
import X.XAR;
import X.XCR;
import X.XCX;
import X.XDR;
import com.ss.android.ugc.effectmanager.DownloadableModelConfig;
import com.ss.android.ugc.effectmanager.common.cache.IModelCache;
import com.ss.android.ugc.effectmanager.common.network.EffectNetWorkerWrapper;
import com.ss.android.ugc.effectmanager.knadapt.UseKNPlatform;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class AlgorithmModelManager {
    public static final Companion Companion = new Companion();
    public static AlgorithmModelManager INSTANCE;
    public final AssetManagerWrapper assetManagerWrapper;
    public final EffectNetWorkerWrapper effectNetWorkerWrapper;
    public final C5H3 knAlgorithmRepository$delegate;
    public final IModelCache modelCache;
    public final ModelConfigArbiter modelConfigArbiter;
    public final ModelFetcher modelFetcher;
    public final ModelFinder modelFinder;

    /* loaded from: classes16.dex */
    public static final class Companion {
        public final synchronized AlgorithmModelManager getInstance() {
            AlgorithmModelManager algorithmModelManager;
            algorithmModelManager = AlgorithmModelManager.INSTANCE;
            if (algorithmModelManager == null) {
                "AlgorithmModelManager has not initialized".toString();
                throw new IllegalStateException("AlgorithmModelManager has not initialized");
            }
            return algorithmModelManager;
        }

        public final boolean isInitialized() {
            if (AlgorithmModelManager.INSTANCE != null) {
                return true;
            }
            return false;
        }

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void initialize(DownloadableModelConfig config) {
            o.LJIIJ(config, "config");
            if (AlgorithmModelManager.INSTANCE == null) {
                AlgorithmModelManager.INSTANCE = new AlgorithmModelManager(config);
                return;
            }
            throw new IllegalStateException("Duplicate AlgorithmModelManager initialization");
        }
    }

    public static final synchronized AlgorithmModelManager getInstance() {
        AlgorithmModelManager companion;
        synchronized (AlgorithmModelManager.class) {
            companion = Companion.getInstance();
        }
        return companion;
    }

    private final C84393XAf getKnAlgorithmRepository() {
        return (C84393XAf) this.knAlgorithmRepository$delegate.getValue();
    }

    public static final void initialize(DownloadableModelConfig downloadableModelConfig) {
        Companion.initialize(downloadableModelConfig);
    }

    public static final boolean isInitialized() {
        return Companion.isInitialized();
    }

    public AlgorithmModelManager(DownloadableModelConfig downloadableModelConfig) {
        AssetManagerWrapper assetManagerWrapper = new AssetManagerWrapper(downloadableModelConfig.getAssetManager(), downloadableModelConfig.getExclusionPattern());
        this.assetManagerWrapper = assetManagerWrapper;
        EffectNetWorkerWrapper effectNetWorkerWrapper = new EffectNetWorkerWrapper(downloadableModelConfig.getEffectNetWorker(), downloadableModelConfig.getContext());
        this.effectNetWorkerWrapper = effectNetWorkerWrapper;
        ModelConfigArbiter modelConfigArbiter = new ModelConfigArbiter(downloadableModelConfig);
        this.modelConfigArbiter = modelConfigArbiter;
        DownloadedModelStorage downloadedModelStorage = DownloadedModelStorage.getInstance(downloadableModelConfig.getWorkspace(), downloadableModelConfig.getSdkVersion(), assetManagerWrapper);
        o.LJFF(downloadedModelStorage, "DownloadedModelStorage.g…ion, assetManagerWrapper)");
        this.modelCache = downloadedModelStorage;
        this.modelFetcher = new ModelFetcher(downloadableModelConfig, modelConfigArbiter, downloadedModelStorage, effectNetWorkerWrapper);
        this.modelFinder = new ModelFinder(downloadableModelConfig, modelConfigArbiter, downloadedModelStorage, assetManagerWrapper);
        this.knAlgorithmRepository$delegate = C221108m2.LIZIZ(new AqS165S0100000_15(downloadableModelConfig, 672));
        modelConfigArbiter.setIModelCache(downloadedModelStorage);
    }

    public final String findResourceUri(String modelName) {
        o.LJIIJ(modelName, "modelName");
        return findResourceUri(0, modelName);
    }

    public /* synthetic */ AlgorithmModelManager(DownloadableModelConfig downloadableModelConfig, DefaultConstructorMarker defaultConstructorMarker) {
        this(downloadableModelConfig);
    }

    public final void fetchResourcesWithModelNames(String[] modelNames, FetchResourcesListener fetchResourcesListener) {
        o.LJIIJ(modelNames, "modelNames");
        fetchResourcesWithModelNames(0, modelNames, fetchResourcesListener);
    }

    public final String findResourceUri(int i, String modelName) {
        o.LJIIJ(modelName, "modelName");
        if (UseKNPlatform.enableKNPlatform) {
            C84393XAf knAlgorithmRepository = getKnAlgorithmRepository();
            knAlgorithmRepository.getClass();
            return knAlgorithmRepository.LIZLLL().realFindResourceUri(i, null, modelName);
        }
        return this.modelFinder.findResourceUri(i, null, modelName);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [com.ss.android.ugc.effectmanager.algorithm.AlgorithmModelManager$fetchResourcesWithModelNames$1] */
    public final void fetchResourcesWithModelNames(final int i, final String[] modelNames, final FetchResourcesListener fetchResourcesListener) {
        o.LJIIJ(modelNames, "modelNames");
        if (UseKNPlatform.enableKNPlatform) {
            C84393XAf knAlgorithmRepository = getKnAlgorithmRepository();
            ?? r2 = new XDR<String[]>() { // from class: com.ss.android.ugc.effectmanager.algorithm.AlgorithmModelManager$fetchResourcesWithModelNames$1
                @Override // X.XDR
                public void preProcess(String[] response) {
                    o.LJIIJ(response, "response");
                }

                @Override // X.XDR
                public void onSuccess(String[] response) {
                    o.LJIIJ(response, "response");
                    FetchResourcesListener fetchResourcesListener2 = FetchResourcesListener.this;
                    if (fetchResourcesListener2 != null) {
                        fetchResourcesListener2.onSuccess();
                    }
                }

                @Override // X.XDR
                public void onFail(String[] strArr, C84418XBe exception) {
                    o.LJIIJ(exception, "exception");
                    FetchResourcesListener fetchResourcesListener2 = FetchResourcesListener.this;
                    if (fetchResourcesListener2 != null) {
                        fetchResourcesListener2.onFailed(exception.LIZJ);
                    }
                }
            };
            knAlgorithmRepository.getClass();
            XAR xar = new XAR(knAlgorithmRepository.LJFF, knAlgorithmRepository.LIZ, knAlgorithmRepository.LIZLLL, knAlgorithmRepository.LIZJ, modelNames, i, 1984);
            XCX xcx = knAlgorithmRepository.LJFF.LJJIIJ;
            if (xcx != null) {
                xcx.LIZ(new XCR(xar, r2, modelNames));
                return;
            }
            return;
        }
        C10K.LIZIZ(new Callable<Void>() { // from class: com.ss.android.ugc.effectmanager.algorithm.AlgorithmModelManager$fetchResourcesWithModelNames$2
            @Override // java.util.concurrent.Callable
            public final Void call() {
                AlgorithmModelManager.this.modelFetcher.fetchModels(i, modelNames);
                return null;
            }
        }, C10K.LJI, null).LIZLLL(new C10I() { // from class: com.ss.android.ugc.effectmanager.algorithm.AlgorithmModelManager$fetchResourcesWithModelNames$3
            @Override // X.C10I
            public final Void then(C10K<Void> task) {
                o.LJFF(task, "task");
                if (task.LJIILJJIL()) {
                    FetchResourcesListener fetchResourcesListener2 = FetchResourcesListener.this;
                    if (fetchResourcesListener2 != null) {
                        fetchResourcesListener2.onFailed(task.LJIIJ());
                        return null;
                    }
                    return null;
                }
                FetchResourcesListener fetchResourcesListener3 = FetchResourcesListener.this;
                if (fetchResourcesListener3 == null) {
                    return null;
                }
                fetchResourcesListener3.onSuccess();
                return null;
            }

            @Override // X.C10I
            public /* bridge */ /* synthetic */ Object then(C10K c10k) {
                return then((C10K<Void>) c10k);
            }
        });
    }
}
