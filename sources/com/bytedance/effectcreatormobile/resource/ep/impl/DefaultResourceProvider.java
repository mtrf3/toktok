package com.bytedance.effectcreatormobile.resource.ep.impl;

import X.AbstractC93662aUU;
import X.AbstractC94464ahQ;
import X.AbstractC94465ahR;
import X.C32I;
import X.C36636EZk;
import X.C3C5;
import X.C47261Igj;
import X.C48841JEv;
import X.C76800UCe;
import X.C78555UsJ;
import X.C78613UtF;
import X.C84419XBf;
import X.C93511aS3;
import X.C93798aWg;
import X.C93842aXO;
import X.C93843aXP;
import X.C93901aYL;
import X.C93971aZT;
import X.C94034aaU;
import X.C94104abc;
import X.C94105abd;
import X.C94223adX;
import X.C94224adY;
import X.C94423agl;
import X.C94424agm;
import X.C94425agn;
import X.C94426ago;
import X.C94769amL;
import X.C94772amO;
import X.C94774amQ;
import X.C94775amR;
import X.C94777amT;
import X.EnumC58928NAu;
import X.ExecutorC93512aS4;
import X.InterfaceC67352kd;
import X.InterfaceC70422pa;
import X.InterfaceC93663aUV;
import X.T2R;
import X.XAT;
import X.XBE;
import X.XKS;
import X.XKX;
import Y.IDObjectS390S0100000_42;
import android.content.Context;
import android.content.res.AssetManager;
import android.os.Build;
import com.bef.effectsdk.EffectSDKUtils;
import com.bef.effectsdk.ResourceFinder;
import com.bytedance.effectcreatormobile.ckeapi.api.draft.ICKDraftManager;
import com.bytedance.effectcreatormobile.resource.ep.api.IEffectPlatformResourceProvider;
import com.bytedance.effectcreatormobile.resource.ep.api.IVERourceProvider;
import com.bytedance.news.common.service.manager.IService;
import com.ss.android.ugc.effectmanager.DownloadableModelConfig;
import com.ss.android.ugc.effectmanager.DownloadableModelSupport;
import com.ss.android.ugc.effectmanager.EffectConfiguration;
import com.ss.android.ugc.effectmanager.EffectManager;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.ss.android.ugc.effectmanager.link.model.host.Host;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public class DefaultResourceProvider extends AbstractC93662aUU<EffectManager> implements IEffectPlatformResourceProvider {
    public static final C93511aS3 Companion = new C93511aS3();
    public final ConcurrentHashMap<String, Effect> effectCache = new ConcurrentHashMap<>();
    public final InterfaceC70422pa scope = C48841JEv.LIZ(C78613UtF.LIZJ.plus(T2R.LJIIJJI()));
    public C93842aXO appConfig = C93843aXP.LIZ().getEffectPlatformConfig();

    @Override // com.bytedance.effectcreatormobile.resource.ep.api.IEffectPlatformResourceProvider
    public Object downloadEffectById(String str, InterfaceC67352kd<? super Effect> interfaceC67352kd) {
        return downloadEffectById$suspendImpl(this, str, interfaceC67352kd);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.AbstractC93662aUU
    public EffectManager createEpInstance() {
        C94034aaU.LIZ("DefaultResourceProvider", "createEpInstance");
        if (!DownloadableModelSupport.isInitialized()) {
            C94034aaU.LIZ("DefaultResourceProvider", "DownloadableModelSupport init");
            DownloadableModelSupport.initialize(getModelDownloadConfig());
        }
        EffectManager effectManager = new EffectManager();
        effectManager.init(getEffectConfiguration());
        return effectManager;
    }

    @Override // X.AbstractC93662aUU
    public ResourceFinder createVEResourceFinder() {
        ResourceFinder vEResourceFinder;
        IVERourceProvider<? extends ResourceFinder, XAT> iVERourceProvider = C93798aWg.LIZ;
        if (iVERourceProvider != null && (vEResourceFinder = iVERourceProvider.getVEResourceFinder()) != null) {
            return vEResourceFinder;
        }
        throw new Exception("VEResourceFinder not init");
    }

    public EffectConfiguration getEffectConfiguration() {
        EffectConfiguration.Builder builder = new EffectConfiguration.Builder();
        builder.accessKey(this.appConfig.LJIIL);
        builder.channel(this.appConfig.LJFF);
        String str = this.appConfig.LJI;
        if (str == null) {
            str = EffectSDKUtils.nativeGetSdkVersion();
        }
        builder.sdkVersion(str);
        builder.appVersion(this.appConfig.LIZIZ);
        builder.platform("android");
        builder.appLanguage(this.appConfig.LJ);
        builder.region(this.appConfig.LIZLLL);
        builder.deviceType(Build.MODEL);
        builder.setUnzipNewSolution(true);
        builder.deviceId(this.appConfig.LIZJ);
        builder.effectDir(new File(this.appConfig.LJIIIZ));
        builder.JsonConverter(new C94224adY());
        builder.effectMaxCacheSize(Long.MAX_VALUE);
        builder.effectNetWorker(new C94223adX());
        List<String> list = this.appConfig.LJIIJJI;
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new Host(it.next()));
        }
        builder.hosts(arrayList);
        XBE.LJIIIIZZ.getClass();
        if (C84419XBf.LIZJ()) {
            builder.knEffectFetcher(new C94105abd());
        }
        Context context = C93901aYL.LIZ;
        o.LJI(context);
        builder.context(context);
        builder.retryCount(this.appConfig.LJII);
        builder.appID(this.appConfig.LIZ);
        builder.region(this.appConfig.LIZLLL);
        EffectConfiguration build = builder.build();
        o.LJIIIIZZ(build, "EffectConfiguration.Buil…ion)\n            .build()");
        return build;
    }

    public DownloadableModelConfig getModelDownloadConfig() {
        AssetManager assetManager;
        DownloadableModelConfig.Builder builder = new DownloadableModelConfig.Builder();
        Context context = C93901aYL.LIZ;
        if (context != null) {
            assetManager = context.getAssets();
        } else {
            assetManager = null;
        }
        builder.setAssetManager(assetManager);
        builder.setJsonConverter(new C94224adY());
        builder.setAppId(this.appConfig.LIZ);
        builder.setAccessKey(this.appConfig.LJIIL);
        builder.setDeviceType(Build.MODEL);
        List<String> list = this.appConfig.LJIIJJI;
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new Host(it.next()));
        }
        builder.setHosts(arrayList);
        builder.setBid(String.valueOf(this.appConfig.LJIIIIZZ));
        builder.setSdkVersion(EffectSDKUtils.nativeGetSdkVersion());
        builder.setWorkspace(this.appConfig.LJIIJ);
        builder.setContext(C93901aYL.LIZ);
        builder.setEffectNetWorker(new C94223adX());
        builder.setExecutor(ExecutorC93512aS4.LJLIL);
        DownloadableModelConfig build = builder.build();
        o.LJIIIIZZ(build, "DownloadableModelConfig.…   }\n            .build()");
        return build;
    }

    public DefaultResourceProvider() {
        C94034aaU.LIZ("DefaultResourceProvider", "appConfig");
    }

    @Override // com.bytedance.effectcreatormobile.resource.ep.api.IEffectPlatformResourceProvider
    public EffectManager effectManager() {
        return getEpInstance();
    }

    @Override // X.AbstractC93662aUU
    public void removeAllListeners() {
        getEpInstance().removeListener();
    }

    public final Effect extraToEffect(String str) {
        try {
            return this.effectCache.get(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public final void addAll(ConcurrentHashMap<String, Effect> concurrentHashMap, List<? extends Effect> list) {
        if (list != null) {
            for (Effect effect : list) {
                concurrentHashMap.put(effect.getEffect_id(), effect);
            }
        }
    }

    public final Object downloadRes(Effect effect, InterfaceC67352kd<? super String> interfaceC67352kd) {
        XKS xks = new XKS(1, C78555UsJ.LJJII(interfaceC67352kd));
        xks.LJIIL();
        if (getEpInstance().isEffectReady(effect)) {
            String unzipPath = effect.getUnzipPath();
            C3C5.m7constructorimpl(unzipPath);
            xks.resumeWith(unzipPath);
        } else {
            if (getEpInstance().isEffectDownloading(effect)) {
                xks.LJJIJIL(null);
            }
            getEpInstance().downloadEffectList(C47261Igj.LJJIJ(effect), new C94424agm(xks));
        }
        return xks.LJIIJJI();
    }

    @Override // com.bytedance.effectcreatormobile.resource.ep.api.IEffectPlatformResourceProvider
    public void ensureRequiredModels(String resourcePath, InterfaceC93663aUV<? super String> listener) {
        String[] strArr;
        o.LJIIIZ(resourcePath, "resourcePath");
        o.LJIIIZ(listener, "listener");
        getEpInstance();
        DownloadableModelSupport downloadableModelSupport = DownloadableModelSupport.getInstance();
        int i = this.appConfig.LJIIIIZZ;
        ICKDraftManager iCKDraftManager = (ICKDraftManager) ((IService) C93971aZT.LIZ().LIZ(ICKDraftManager.class));
        if (iCKDraftManager == null || (strArr = iCKDraftManager.getDraftRequiredModelNames(resourcePath)) == null) {
            strArr = new String[0];
        }
        downloadableModelSupport.fetchResourcesWithModelNames(i, strArr, new C94104abc(resourcePath, listener));
    }

    public final Object fetchEffectListFromCache(String str, InterfaceC67352kd<? super EffectChannelResponse> interfaceC67352kd) {
        XKS xks = new XKS(1, C78555UsJ.LJJII(interfaceC67352kd));
        xks.LJIIL();
        getEpInstance().fetchEffectListFromCache(str, new IDObjectS390S0100000_42(xks, 1));
        return xks.LJIIJJI();
    }

    @Override // com.bytedance.effectcreatormobile.resource.ep.api.IEffectPlatformResourceProvider
    public void downloadRes(String extra, InterfaceC93663aUV<? super String> resultListener) {
        o.LJIIIZ(extra, "extra");
        o.LJIIIZ(resultListener, "resultListener");
        XKX.LIZLLL(this.scope, null, null, new C94772amO(this, extra, resultListener, null), 3);
    }

    public static Object downloadEffectById$suspendImpl(DefaultResourceProvider defaultResourceProvider, String str, InterfaceC67352kd interfaceC67352kd) {
        XKS xks = new XKS(1, C78555UsJ.LJJII(interfaceC67352kd));
        xks.LJIIL();
        defaultResourceProvider.getEpInstance().fetchEffect(str, new C94423agl(xks));
        return xks.LJIIJJI();
    }

    public final Object fetchEffectList(String str, boolean z, InterfaceC67352kd<? super EffectChannelResponse> interfaceC67352kd) {
        XKS xks = new XKS(1, C78555UsJ.LJJII(interfaceC67352kd));
        xks.LJIIL();
        getEpInstance().fetchEffectList(str, z, new IDObjectS390S0100000_42(xks, 0));
        return xks.LJIIJJI();
    }

    @Override // com.bytedance.effectcreatormobile.resource.ep.api.IEffectPlatformResourceProvider
    public <T> void panelFetch(String panel, AbstractC94465ahR<T> converter, InterfaceC93663aUV<? super T> listener) {
        o.LJIIIZ(panel, "panel");
        o.LJIIIZ(converter, "converter");
        o.LJIIIZ(listener, "listener");
        XKX.LIZLLL(this.scope, null, null, new C94777amT(this, panel, converter, listener, null), 3);
    }

    public final <T> Object onFetchCategorySuccess(AbstractC94464ahQ<T> abstractC94464ahQ, InterfaceC93663aUV<? super T> interfaceC93663aUV, CategoryPageModel categoryPageModel, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        Object LJI = XKX.LJI(C36636EZk.LIZ, new C94774amQ(this, categoryPageModel, abstractC94464ahQ, interfaceC93663aUV, null), interfaceC67352kd);
        if (LJI == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return LJI;
        }
        return C76800UCe.LIZ;
    }

    public final <T> Object onFetchPanelSuccess(AbstractC94465ahR<T> abstractC94465ahR, InterfaceC93663aUV<? super T> interfaceC93663aUV, EffectChannelResponse effectChannelResponse, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        Object LJI = XKX.LJI(C36636EZk.LIZ, new C94775amR(this, effectChannelResponse, abstractC94465ahR, interfaceC93663aUV, null), interfaceC67352kd);
        if (LJI == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return LJI;
        }
        return C76800UCe.LIZ;
    }

    @Override // com.bytedance.effectcreatormobile.resource.ep.api.IEffectPlatformResourceProvider
    public <T> void categoryFetch(String panel, String category, boolean z, AbstractC94464ahQ<T> converter, InterfaceC93663aUV<? super T> listener) {
        o.LJIIIZ(panel, "panel");
        o.LJIIIZ(category, "category");
        o.LJIIIZ(converter, "converter");
        o.LJIIIZ(listener, "listener");
        XKX.LIZLLL(this.scope, null, null, new C94769amL(this, z, panel, category, converter, listener, null), 3);
    }

    public final Object fetchCategoryEffect(String str, String str2, int i, int i2, int i3, String str3, InterfaceC67352kd<? super CategoryPageModel> interfaceC67352kd) {
        XKS xks = new XKS(1, C78555UsJ.LJJII(interfaceC67352kd));
        xks.LJIIL();
        getEpInstance().fetchCategoryEffect(str, str2, i, i2, i3, str3, new C94425agn(xks));
        return xks.LJIIJJI();
    }

    public final Object fetchCategoryEffectFromCache(String str, String str2, int i, int i2, int i3, String str3, InterfaceC67352kd<? super CategoryPageModel> interfaceC67352kd) {
        XKS xks = new XKS(1, C78555UsJ.LJJII(interfaceC67352kd));
        xks.LJIIL();
        getEpInstance().fetchCategoryEffectFromCache(str, str2, i, i2, i3, str3, new C94426ago(xks));
        return xks.LJIIJJI();
    }
}
