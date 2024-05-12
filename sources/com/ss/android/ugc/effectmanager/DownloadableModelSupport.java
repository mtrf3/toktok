package com.ss.android.ugc.effectmanager;

import X.C10I;
import X.C10K;
import X.C12310e3;
import X.C37692Eqm;
import X.C44384HbQ;
import X.C79057V0z;
import X.C84376X9o;
import X.C84393XAf;
import X.C84397XAj;
import X.C84409XAv;
import X.C84410XAw;
import X.C84416XBc;
import X.C84419XBf;
import X.X1D;
import X.X95;
import X.X97;
import X.XAN;
import X.XAO;
import X.XAP;
import X.XAR;
import X.XBD;
import X.XBE;
import X.XCG;
import X.XCT;
import X.XCX;
import X.XDR;
import com.ss.android.ugc.effectmanager.DownloadableModelSupportLibraryLoader;
import com.ss.android.ugc.effectmanager.algorithm.AlgorithmModelManager;
import com.ss.android.ugc.effectmanager.algorithm.AssetManagerWrapper;
import com.ss.android.ugc.effectmanager.algorithm.DownloadedModelStorage;
import com.ss.android.ugc.effectmanager.algorithm.FetchResourcesListener;
import com.ss.android.ugc.effectmanager.algorithm.ModelConfigArbiter;
import com.ss.android.ugc.effectmanager.common.ModelNameProcessor;
import com.ss.android.ugc.effectmanager.common.logger.EPLog;
import com.ss.android.ugc.effectmanager.common.network.EffectNetWorkerWrapper;
import com.ss.android.ugc.effectmanager.common.utils.EffectUtils;
import com.ss.android.ugc.effectmanager.common.utils.Preconditions;
import com.ss.android.ugc.effectmanager.effect.bridge.EffectFetcher;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.knadapt.KNLibraryLoader;
import com.ss.android.ugc.effectmanager.knadapt.KNResourceFinder;
import com.ss.android.ugc.effectmanager.knadapt.ModelListenerAdaptKt;
import com.ss.android.ugc.effectmanager.knadapt.UseKNPlatform;
import com.ss.android.ugc.effectmanager.model.LocalModelInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class DownloadableModelSupport {
    public static DownloadableModelSupport INSTANCE;
    public static DownloadableModelSupportLibraryLoader sLibraryLoader = new DownloadableModelSupportLibraryLoader.SystemLoader();
    public final DownloadableModelConfig config;
    public final AssetManagerWrapper mAssetManagerWrapper;
    public DownloadableModelSupportEffectFetcher mEffectFetcher;
    public boolean mEnableKotlinNative;
    public KNResourceFinder mKNResourceFinder;
    public final DownloadedModelStorage mModelCache;
    public ModelConfigArbiter mModelConfigArbiter;
    public final EffectNetWorkerWrapper mNetWorker;
    public DownloadableModelSupportResourceFinder mResourceFinder;
    public final String mSdkVersion;
    public final String mWorkspace;

    /* loaded from: classes16.dex */
    public interface EventListener extends ModelEventListener {
    }

    public static DownloadableModelSupport getInstance() {
        DownloadableModelSupport downloadableModelSupport = INSTANCE;
        if (downloadableModelSupport != null) {
            return downloadableModelSupport;
        }
        throw new IllegalStateException("downloadableModelSupport not initialize");
    }

    private DownloadableModelSupportResourceFinder getOrCreateKNResourceFinder() {
        if (this.mKNResourceFinder == null) {
            this.mKNResourceFinder = new KNResourceFinder(XBE.LIZJ().LIZLLL());
        }
        return this.mKNResourceFinder;
    }

    private DownloadableModelSupportResourceFinder getOrCreateResourceFinder() {
        if (this.mEnableKotlinNative && XBE.LJ()) {
            return getOrCreateKNResourceFinder();
        }
        if (this.mResourceFinder == null) {
            this.mResourceFinder = new DownloadableModelSupportResourceFinder(this.mModelConfigArbiter, this.mModelCache, this.config, this.mAssetManagerWrapper);
        }
        return this.mResourceFinder;
    }

    private void initializeOnStart() {
        ModelConfigArbiter modelConfigArbiter = new ModelConfigArbiter(this.config);
        this.mModelConfigArbiter = modelConfigArbiter;
        modelConfigArbiter.setIModelCache(this.mModelCache);
    }

    public static boolean isInitialized() {
        if (INSTANCE != null) {
            return true;
        }
        return false;
    }

    public static void loadSo() {
        if (UseKNPlatform.enableKNPlatform) {
            X97.LIZJ.LIZ();
        } else {
            DownloadableModelLibraryLoader.INSTANCE.loadLibrary();
        }
    }

    public DownloadableModelSupportEffectFetcher getEffectFetcherInternal() {
        return INSTANCE.getOrCreateEffectFetcher();
    }

    public DownloadableModelSupportEffectFetcher getOrCreateEffectFetcher() {
        if (this.mEffectFetcher == null) {
            this.mEffectFetcher = new DownloadableModelSupportEffectFetcher(this.config, this.mModelCache, this.mNetWorker, this.mModelConfigArbiter);
        }
        return this.mEffectFetcher;
    }

    public void requestModelInfoBackGround() {
        XCX xcx;
        if (this.mEnableKotlinNative && XBE.LJ()) {
            XBE.LJIIIIZZ.getClass();
            C84397XAj.LJIIJJI.getClass();
            if (C84397XAj.LJII.get(C44384HbQ.LJIJ(0)) == null && (xcx = C84419XBf.LIZ().LJI.LJJIIJ) != null) {
                xcx.LIZ(new C84416XBc(C84410XAw.LIZ()));
                return;
            }
            return;
        }
        if (this.mModelConfigArbiter.requireDecidedConfigNonBlockling(0) == null) {
            C10K.LIZJ(new Callable<Void>() { // from class: com.ss.android.ugc.effectmanager.DownloadableModelSupport.1
                @Override // java.util.concurrent.Callable
                public Void call() {
                    DownloadableModelSupport.this.mModelConfigArbiter.requireDecidedConfig(0);
                    return null;
                }
            });
        }
    }

    public EffectFetcher getEffectFetcher() {
        return getEffectFetcherInternal();
    }

    public DownloadableModelSupportResourceFinder getResourceFinder() {
        return getOrCreateResourceFinder();
    }

    public DownloadableModelSupport(DownloadableModelConfig downloadableModelConfig) {
        AssetManagerWrapper assetManagerWrapper = new AssetManagerWrapper(downloadableModelConfig.getAssetManager(), downloadableModelConfig.getExclusionPattern());
        this.mAssetManagerWrapper = assetManagerWrapper;
        String workspace = downloadableModelConfig.getWorkspace();
        this.mWorkspace = workspace;
        this.mNetWorker = new EffectNetWorkerWrapper(downloadableModelConfig.getEffectNetWorker(), downloadableModelConfig.getContext());
        String sdkVersion = downloadableModelConfig.getSdkVersion();
        this.mSdkVersion = sdkVersion;
        this.mEnableKotlinNative = UseKNPlatform.enableKNPlatform;
        this.config = downloadableModelConfig;
        this.mModelCache = DownloadedModelStorage.getInstance(workspace, sdkVersion, assetManagerWrapper);
    }

    private boolean checkModelReadyLocal(String str) {
        boolean isResourceAvailable = getOrCreateResourceFinder().isResourceAvailable(str);
        try {
            if (!getEffectFetcherInternal().collectNeedDownloadModelsListNonBlocking(new String[]{str}).isEmpty()) {
                isResourceAvailable = false;
            }
            return isResourceAvailable;
        } catch (Exception unused) {
            return false;
        }
    }

    public static void initialize(DownloadableModelConfig downloadableModelConfig) {
        if (downloadableModelConfig != null) {
            if (INSTANCE == null) {
                DownloadableModelSupport downloadableModelSupport = new DownloadableModelSupport(downloadableModelConfig);
                INSTANCE = downloadableModelSupport;
                downloadableModelSupport.initializeOnStart();
                if (UseKNPlatform.enableKNPlatform && downloadableModelConfig.getKNEffectConfig() != null && !XBE.LJ()) {
                    XCG kNEffectConfig = downloadableModelConfig.getKNEffectConfig();
                    synchronized (XBE.class) {
                        XBE.LJIIIIZZ.LIZIZ(kNEffectConfig);
                    }
                    return;
                }
                return;
            }
            throw new IllegalStateException("Duplicate initialization");
        }
        throw null;
    }

    public static void setLibraryLoader(DownloadableModelSupportLibraryLoader downloadableModelSupportLibraryLoader) {
        Preconditions.checkNotNull(downloadableModelSupportLibraryLoader);
        sLibraryLoader = downloadableModelSupportLibraryLoader;
        C84419XBf c84419XBf = XBE.LJIIIIZZ;
        KNLibraryLoader kNLibraryLoader = new KNLibraryLoader(downloadableModelSupportLibraryLoader);
        c84419XBf.getClass();
        X97.LIZ = kNLibraryLoader;
    }

    public List<LocalModelInfo> getLocalModelInfo(List<String> list) {
        ArrayList arrayList;
        if (this.mEnableKotlinNative && XBE.LJ()) {
            C84393XAf c84393XAf = XBE.LIZJ().LJ;
            c84393XAf.getClass();
            int i = 0;
            if (list == null || list.isEmpty()) {
                arrayList = new ArrayList();
            } else {
                Object[] array = list.toArray(new String[0]);
                if (array != null) {
                    String[] LIZ = X95.LIZ((String[]) array);
                    XBD xbd = c84393XAf.LIZJ().LIZ;
                    xbd.getClass();
                    XAR xar = new XAR(xbd.LJIIJJI, xbd.LJIIIIZZ, xbd.LJIIIZ, xbd.LJIIJ, null, i, 2032);
                    if (LIZ == null || LIZ.length == 0) {
                        arrayList = new ArrayList();
                    } else {
                        arrayList = new ArrayList();
                        int length = LIZ.length;
                        while (i < length) {
                            String str = LIZ[i];
                            XAO LJII = xar.LJIIZILJ.LJII(XAN.LIZJ(str));
                            if (LJII != null) {
                                arrayList.add(LJII);
                            } else if (xar.LJIIL(str)) {
                                C84376X9o c84376X9o = xar.LJIILLIIL;
                                StringBuilder LIZ2 = X1D.LIZ();
                                LIZ2.append(C79057V0z.LJJIJIIJI("model"));
                                LIZ2.append(str);
                                String fileName = X1D.LIZIZ(LIZ2);
                                c84376X9o.getClass();
                                o.LJIIJ(fileName, "fileName");
                                StringBuilder LIZ3 = X1D.LIZ();
                                LIZ3.append("file:///android_asset://");
                                LIZ3.append(fileName);
                                XAO LIZ4 = XAP.LIZ(X1D.LIZIZ(LIZ3));
                                String LJ = XAN.LJ(str);
                                int LIZLLL = XAN.LIZLLL(str);
                                LIZ4.LIZIZ = LJ;
                                LIZ4.LIZLLL = LIZLLL;
                                arrayList.add(LIZ4);
                            }
                            i++;
                        }
                    }
                } else {
                    throw new C37692Eqm("null cannot be cast to non-null type kotlin.Array<T>");
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                XAO xao = (XAO) it.next();
                LocalModelInfo fromFile = LocalModelInfo.fromFile(xao.LJFF);
                fromFile.setSize(xao.LIZJ());
                fromFile.setName(xao.LIZIZ());
                fromFile.setVersion(xao.LIZLLL());
                arrayList2.add(fromFile);
            }
            return arrayList2;
        }
        if (list == null || list.isEmpty()) {
            return new ArrayList();
        }
        return getOrCreateEffectFetcher().collectLocalModelInfo(X95.LIZ((String[]) list.toArray(new String[list.size()])));
    }

    public boolean areRequirementsReady(EffectManager effectManager, Effect effect) {
        boolean checkModelReadyLocal;
        String str;
        if (this.mEnableKotlinNative && XBE.LJ()) {
            XBE LIZJ = XBE.LIZJ();
            o.LJIIJ(effect, "effect");
            return LIZJ.LJ.LIZ(effect);
        }
        if (EffectUtils.isRequirementsInvalid(effect)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("decrypt error effect_id: ");
            LIZ.append(effect.getId());
            LIZ.append(", effect_name: ");
            LIZ.append(effect.getName());
            LIZ.append(", requirements_sec: ");
            if (effect.getRequirements_sec() != null) {
                str = effect.getRequirements_sec().toString();
            } else {
                str = "";
            }
            LIZ.append(str);
            EPLog.d("DownloadableModelSupport", X1D.LIZIZ(LIZ));
            return false;
        }
        String[] resourceNameArrayOfEffect = AlgorithmUtils.getResourceNameArrayOfEffect(effect);
        if (resourceNameArrayOfEffect == null || resourceNameArrayOfEffect.length == 0) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("effect: ");
            LIZ2.append(effect.getEffectId());
            LIZ2.append(" name: ");
            LIZ2.append(effect.getName());
            LIZ2.append(" returned empty resourceNameArrayOfEffect");
            EPLog.d("DownloadableModelSupport", X1D.LIZIZ(LIZ2));
            return true;
        }
        this.mModelCache.checkDiskLruCache();
        for (String str2 : resourceNameArrayOfEffect) {
            if (AlgorithmModelInfoMemoryCache.hasBuiltCache()) {
                if (!AlgorithmModelInfoMemoryCache.isModelReady(ModelNameProcessor.getNameOfModel(str2))) {
                    checkModelReadyLocal = checkModelReadyLocal(str2);
                } else {
                    continue;
                }
            } else {
                checkModelReadyLocal = checkModelReadyLocal(str2);
            }
            if (!checkModelReadyLocal) {
                return false;
            }
        }
        return true;
    }

    public void fetchResourcesNeededByRequirements(final List<String> list, final IFetchModelListener iFetchModelListener) {
        if (this.mEnableKotlinNative && XBE.LJ()) {
            XBE.LIZJ().LIZ(list, ModelListenerAdaptKt.toKNListener(iFetchModelListener));
        } else {
            C10K.LIZIZ(new Callable<Void>() { // from class: com.ss.android.ugc.effectmanager.DownloadableModelSupport.3
                @Override // java.util.concurrent.Callable
                public Void call() {
                    DownloadableModelSupport.this.getOrCreateEffectFetcher().fetchModels(list, null);
                    return null;
                }
            }, C10K.LJI, null).LIZLLL(new C10I<Void, Void>() { // from class: com.ss.android.ugc.effectmanager.DownloadableModelSupport.2
                @Override // X.C10I
                public Void then(C10K<Void> c10k) {
                    if (c10k.LJIILJJIL()) {
                        IFetchModelListener iFetchModelListener2 = iFetchModelListener;
                        if (iFetchModelListener2 != null) {
                            iFetchModelListener2.onFailed(c10k.LJIIJ());
                            return null;
                        }
                        return null;
                    }
                    IFetchModelListener iFetchModelListener3 = iFetchModelListener;
                    if (iFetchModelListener3 == null) {
                        return null;
                    }
                    iFetchModelListener3.onSuccess((String[]) list.toArray(new String[0]));
                    return null;
                }
            });
        }
    }

    public boolean isEffectReady(EffectManager effectManager, Effect effect) {
        boolean z;
        if (this.mEnableKotlinNative && XBE.LJ() && effectManager.getKNEffectPlatform() != null) {
            XBE LIZJ = XBE.LIZJ();
            XCT effectPlatform = effectManager.getKNEffectPlatform();
            o.LJIIJ(effectPlatform, "effectPlatform");
            o.LJIIJ(effect, "effect");
            long currentTimeMillis = System.currentTimeMillis();
            if (effectPlatform.LJIIJJI(effect)) {
                z = LIZJ.LJ.LIZ(effect);
            } else {
                z = false;
            }
            C12310e3 c12310e3 = C12310e3.LIZIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("effect: ");
            LIZ.append(effect.getEffect_id());
            LIZ.append(", name:");
            LIZ.append(effect.getName());
            LIZ.append(", result: ");
            LIZ.append(z);
            LIZ.append(", time cost: ");
            LIZ.append(System.currentTimeMillis() - currentTimeMillis);
            LIZ.append(" ms");
            String LIZIZ = X1D.LIZIZ(LIZ);
            c12310e3.getClass();
            C12310e3.LIZ("isEffectReady", LIZIZ);
            return z;
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        boolean isEffectDownloaded = effectManager.isEffectDownloaded(effect);
        if (isEffectDownloaded) {
            isEffectDownloaded = areRequirementsReady(effectManager, effect);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("effect: ");
        LIZ2.append(effect.getEffectId());
        LIZ2.append(" name: ");
        LIZ2.append(effect.getName());
        LIZ2.append(" result: ");
        LIZ2.append(isEffectDownloaded);
        LIZ2.append(" time cost: ");
        LIZ2.append(System.currentTimeMillis() - currentTimeMillis2);
        LIZ2.append("ms");
        EPLog.d("DownloadableModelSupport", X1D.LIZIZ(LIZ2));
        return isEffectDownloaded;
    }

    public void fetchResourcesNeededByRequirements(String[] strArr, IFetchModelListener iFetchModelListener) {
        if (this.mEnableKotlinNative && XBE.LJ()) {
            XBE.LIZJ().LIZ(Arrays.asList(strArr), ModelListenerAdaptKt.toKNListener(iFetchModelListener));
        } else {
            fetchResourcesNeededByRequirements(Arrays.asList(strArr), iFetchModelListener);
        }
    }

    public void fetchResourcesByRequirementsAndModelNames(final String[] requirements, final Map<String, List<String>> modelNames, final IFetchResourceListener iFetchResourceListener) {
        if (this.mEnableKotlinNative && XBE.LJ()) {
            XBE LIZJ = XBE.LIZJ();
            XDR<Long> kNListener = IFetchResourceListenerKt.toKNListener(iFetchResourceListener);
            o.LJIIJ(requirements, "requirements");
            o.LJIIJ(modelNames, "modelNames");
            C84393XAf c84393XAf = LIZJ.LJ;
            c84393XAf.getClass();
            XCX xcx = c84393XAf.LJFF.LJJIIJ;
            if (xcx != null) {
                xcx.LIZ(new C84409XAv(c84393XAf, requirements, modelNames, kNListener, C84410XAw.LIZ()));
                return;
            }
            return;
        }
        C10K.LIZIZ(new Callable<Void>() { // from class: com.ss.android.ugc.effectmanager.DownloadableModelSupport.5
            @Override // java.util.concurrent.Callable
            public Void call() {
                DownloadableModelSupport.this.getOrCreateEffectFetcher().fetchModels(Arrays.asList(requirements), modelNames);
                return null;
            }
        }, C10K.LJI, null).LIZLLL(new C10I<Void, Void>() { // from class: com.ss.android.ugc.effectmanager.DownloadableModelSupport.4
            @Override // X.C10I
            public Void then(C10K<Void> c10k) {
                if (c10k.LJIILJJIL()) {
                    IFetchResourceListener iFetchResourceListener2 = iFetchResourceListener;
                    if (iFetchResourceListener2 != null) {
                        iFetchResourceListener2.onFailure(c10k.LJIIJ());
                        return null;
                    }
                    return null;
                }
                IFetchResourceListener iFetchResourceListener3 = iFetchResourceListener;
                if (iFetchResourceListener3 == null) {
                    return null;
                }
                iFetchResourceListener3.onSuccess(DownloadableModelSupport.this.getResourceFinder().getEffectHandle());
                return null;
            }
        });
    }

    public void fetchResourcesWithModelNames(int i, String[] strArr, FetchResourcesListener fetchResourcesListener) {
        if (!AlgorithmModelManager.isInitialized()) {
            AlgorithmModelManager.initialize(this.config);
        }
        AlgorithmModelManager.getInstance().fetchResourcesWithModelNames(i, strArr, fetchResourcesListener);
    }
}
