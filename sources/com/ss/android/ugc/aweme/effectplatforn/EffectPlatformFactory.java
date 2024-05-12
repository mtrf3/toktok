package com.ss.android.ugc.aweme.effectplatforn;

import X.C00F;
import X.C146165oS;
import X.C1DG;
import X.C34267Dcd;
import X.C38995FSd;
import X.C43941HMj;
import X.C44296Ha0;
import X.C51029K0z;
import X.C52312Kg0;
import X.C52501Kj3;
import X.C52531KjX;
import X.C52955KqN;
import X.C58096Mr6;
import X.C5L7;
import X.C60903NvH;
import X.C76800UCe;
import X.C84135X0h;
import X.C84419XBf;
import X.C84428XBo;
import X.C84429XBp;
import X.C84495XEd;
import X.EF7;
import X.EYQ;
import X.F2W;
import X.FFL;
import X.InterfaceC84498XEg;
import X.InterfaceC88472Yns;
import X.OSZ;
import X.X1D;
import X.XBE;
import X.XCI;
import X.XCK;
import android.content.Context;
import android.os.Build;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.effectplatform.EffectPlatform;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.property.EffectPlatformSingleConfig;
import com.ss.android.ugc.aweme.services.IAVSettingServiceImpl;
import com.ss.android.ugc.aweme.services.effectplatform.EffectPlatformBuilder;
import com.ss.android.ugc.aweme.services.effectplatform.IEffectPlatformFactory;
import com.ss.android.ugc.effectmanager.EffectConfiguration;
import com.ss.android.ugc.effectmanager.common.listener.IEffectNetWorker;
import com.ss.android.ugc.effectmanager.common.listener.IJsonConverter;
import com.ss.android.ugc.effectmanager.link.model.host.Host;
import defpackage.e1;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class EffectPlatformFactory implements IEffectPlatformFactory {
    public static final ConcurrentHashMap<String, String> LIZ = new ConcurrentHashMap<>();
    public static long LIZIZ;

    public static IEffectPlatformFactory LIZ() {
        Object LIZ2 = C58096Mr6.LIZ(IEffectPlatformFactory.class, false);
        if (LIZ2 != null) {
            return (IEffectPlatformFactory) LIZ2;
        }
        if (C58096Mr6.p0 == null) {
            synchronized (IEffectPlatformFactory.class) {
                if (C58096Mr6.p0 == null) {
                    C58096Mr6.p0 = new EffectPlatformFactory();
                }
            }
        }
        return C58096Mr6.p0;
    }

    @Override // com.ss.android.ugc.aweme.services.effectplatform.IEffectPlatformFactory
    public final List<Host> getDownloadableModelHosts() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Host("https://api-va.tiktokv.com"));
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.services.effectplatform.IEffectPlatformFactory
    public final List<Host> getHosts() {
        ArrayList arrayList = new ArrayList();
        if (C1DG.LJIIIIZZ()) {
            arrayList.add(new Host("https://api-va.tiktokv.com/tiktok/v1/kids"));
        } else {
            arrayList.add(new Host("https://api-va.tiktokv.com"));
        }
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.services.effectplatform.IEffectPlatformFactory
    public final InterfaceC84498XEg create(EffectPlatformBuilder effectPlatformBuilder) {
        o.LJIIIZ(effectPlatformBuilder, "effectPlatformBuilder");
        C60903NvH.LJIIJJI().initDownloadableModel();
        EffectConfiguration.Builder createEffectConfigurationBuilder = createEffectConfigurationBuilder(effectPlatformBuilder);
        if (effectPlatformBuilder.getEffectFetcher() == null) {
            createEffectConfigurationBuilder.effectFetcher(new C84429XBp());
            XBE.LJIIIIZZ.getClass();
            if (C84419XBf.LIZJ()) {
                createEffectConfigurationBuilder.knEffectFetcher(new C84428XBo(effectPlatformBuilder));
                createEffectConfigurationBuilder.abInsertHead(true);
                createEffectConfigurationBuilder.abInsertHeadPanels(new String[]{"default", "effect", "editingeffect"});
            }
        } else {
            createEffectConfigurationBuilder.effectFetcher(effectPlatformBuilder.getEffectFetcher());
        }
        InterfaceC84498XEg create = create(createEffectConfigurationBuilder, XCI.LJLIL, false, effectPlatformBuilder.isSingleton());
        create.LJIIJJI(effectPlatformBuilder.getMonitorExtraParams());
        create.LJIJI(C51029K0z.LJJIIZI(new OSZ("show_filtered_effects", "true")));
        return new C84495XEd(create);
    }

    @Override // com.ss.android.ugc.aweme.services.effectplatform.IEffectPlatformFactory
    public final EffectConfiguration.Builder createEffectConfigurationBuilder(EffectPlatformBuilder effectPlatformBuilder) {
        String serverDeviceId;
        boolean LIZ2;
        long LJIILIIL;
        o.LJIIIZ(effectPlatformBuilder, "effectPlatformBuilder");
        if (effectPlatformBuilder.getContext() != null) {
            if (effectPlatformBuilder.getRegion() == null) {
                C60903NvH.LJIIJJI().getRegionService();
                String LIZ3 = C44296Ha0.LIZ();
                if (LIZ3 == null) {
                    LIZ3 = "";
                }
                effectPlatformBuilder.setRegion(LIZ3);
            }
            if (effectPlatformBuilder.getAccessKey() == null) {
                effectPlatformBuilder.setAccessKey(C60903NvH.LJIIJJI().LJIJI().LIZLLL());
            }
            if (effectPlatformBuilder.getCacheDir() == null) {
                effectPlatformBuilder.setCacheDir(EffectPlatform.LJLJJI);
            }
            if (o.LJ(effectPlatformBuilder.getCacheDir(), EffectPlatform.LJLJJI)) {
                if (C43941HMj.LIZIZ()) {
                    effectPlatformBuilder.effectMaxCacheSize = ((EffectPlatformSingleConfig.PlatformAPIConfig) EffectPlatformSingleConfig.LIZIZ.getValue()).dirCacheSizeInMB * 1048576;
                } else {
                    if (C52531KjX.LIZ()) {
                        LIZ2 = ((Boolean) C52955KqN.LIZ.getValue()).booleanValue();
                    } else {
                        LIZ2 = e1.LIZ(31744, "creative_tools_open_effect_cache", true, false);
                    }
                    if (LIZ2) {
                        if (C52531KjX.LIZ()) {
                            LJIILIIL = ((Number) C34267Dcd.LIZ.getValue()).longValue();
                        } else {
                            FFL.LJIIIZ().getClass();
                            LJIILIIL = 1048576 * FFL.LJIILIIL(31744, 800L, "creative_tool_effect_cache_threshold");
                        }
                        effectPlatformBuilder.effectMaxCacheSize = LJIILIIL;
                    }
                }
            }
            if (effectPlatformBuilder.getSdkVersion() == null) {
                effectPlatformBuilder.setSdkVersion(C60903NvH.LJIIJJI().LJIJI().getEffectSDKVersion());
            }
            if (effectPlatformBuilder.getChannel() == null) {
                C60903NvH.LJIIJJI().getApplicationService().getClass();
                String channel = EF7.LJIILIIL;
                C5L7.LIZIZ();
                o.LJIIIIZZ(channel, "channel");
                effectPlatformBuilder.setChannel(channel);
            }
            if (effectPlatformBuilder.getAppVersion() == null) {
                C60903NvH.LJIIJJI().getApplicationService().getClass();
                effectPlatformBuilder.setAppVersion(EF7.LIZLLL());
            }
            if (effectPlatformBuilder.getAppID() == null) {
                String LJJJJZI = EffectPlatform.LJJJJZI();
                o.LJIIIIZZ(LJJJJZI, "getAppId()");
                effectPlatformBuilder.setAppID(LJJJJZI);
            }
            if (effectPlatformBuilder.getAppLanguage() == null) {
                effectPlatformBuilder.setAppLanguage(IAVSettingServiceImpl.createIAVSettingServicebyMonsterPlugin(false).getAppLanguage());
            }
            if (effectPlatformBuilder.getSystemLanguage() == null) {
                effectPlatformBuilder.setSystemLanguage(IAVSettingServiceImpl.createIAVSettingServicebyMonsterPlugin(false).getSysLanguage());
            }
            if (effectPlatformBuilder.getRetryCount() == null) {
                effectPlatformBuilder.setRetryCount(1);
            }
            if (effectPlatformBuilder.getHosts() == null) {
                effectPlatformBuilder.setHosts(getHosts());
            }
            if (effectPlatformBuilder.getEffectNetWorker() == null) {
                effectPlatformBuilder.setEffectNetWorker(new EYQ());
            }
            if (effectPlatformBuilder.getExecutorService() == null) {
                effectPlatformBuilder.setExecutorService(C38995FSd.LIZLLL());
            }
            if (effectPlatformBuilder.getJsonConverter() == null) {
                effectPlatformBuilder.setJsonConverter(new F2W(C60903NvH.LJIIJJI().LIZ()));
            }
            if (effectPlatformBuilder.getRequestStrategy() == null) {
                effectPlatformBuilder.setRequestStrategy(2);
            }
            if (effectPlatformBuilder.effectMaxCacheSize <= 0) {
                effectPlatformBuilder.effectMaxCacheSize = 838860800L;
            }
            if (effectPlatformBuilder.getObjIdConversionConfig() == null) {
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append(C60903NvH.LJIIJJI().getNetworkService().getApiHost());
                LIZ4.append("/aweme/v1/sticker/resource/");
                effectPlatformBuilder.setObjIdConversionConfig(new XCK(X1D.LIZIZ(LIZ4)));
            }
            EffectConfiguration.Builder configurationBuilder = new EffectConfiguration.Builder();
            configurationBuilder.accessKey(String.valueOf(effectPlatformBuilder.getAccessKey()));
            configurationBuilder.channel(String.valueOf(effectPlatformBuilder.getChannel()));
            configurationBuilder.sdkVersion(String.valueOf(effectPlatformBuilder.getSdkVersion()));
            configurationBuilder.appVersion(String.valueOf(effectPlatformBuilder.getAppVersion()));
            configurationBuilder.platform("android");
            configurationBuilder.deviceType(Build.MODEL);
            IJsonConverter jsonConverter = effectPlatformBuilder.getJsonConverter();
            o.LJI(jsonConverter);
            configurationBuilder.JsonConverter(jsonConverter);
            configurationBuilder.monitorService(new C146165oS());
            if (AppLog.getServerDeviceId() == null) {
                serverDeviceId = CardStruct.IStatusCode.DEFAULT;
            } else {
                serverDeviceId = AppLog.getServerDeviceId();
            }
            configurationBuilder.deviceId(serverDeviceId);
            configurationBuilder.appID(effectPlatformBuilder.getAppID());
            configurationBuilder.appLanguage(effectPlatformBuilder.getAppLanguage());
            configurationBuilder.sysLanguage(effectPlatformBuilder.getSystemLanguage());
            Integer retryCount = effectPlatformBuilder.getRetryCount();
            o.LJI(retryCount);
            configurationBuilder.retryCount(retryCount.intValue());
            File cacheDir = effectPlatformBuilder.getCacheDir();
            o.LJI(cacheDir);
            configurationBuilder.effectDir(cacheDir);
            IEffectNetWorker effectNetWorker = effectPlatformBuilder.getEffectNetWorker();
            o.LJI(effectNetWorker);
            configurationBuilder.effectNetWorker(effectNetWorker);
            configurationBuilder.region(String.valueOf(effectPlatformBuilder.getRegion()));
            List<Host> hosts = effectPlatformBuilder.getHosts();
            o.LJI(hosts);
            configurationBuilder.hosts(hosts);
            Context context = effectPlatformBuilder.getContext();
            o.LJI(context);
            configurationBuilder.context(context);
            ExecutorService executorService = effectPlatformBuilder.getExecutorService();
            o.LJI(executorService);
            configurationBuilder.executor(executorService);
            configurationBuilder.effectFetcher(effectPlatformBuilder.getEffectFetcher());
            Integer requestStrategy = effectPlatformBuilder.getRequestStrategy();
            o.LJI(requestStrategy);
            configurationBuilder.requestStrategy(requestStrategy.intValue());
            configurationBuilder.effectMaxCacheSize(effectPlatformBuilder.effectMaxCacheSize);
            XCK objIdConversionConfig = effectPlatformBuilder.getObjIdConversionConfig();
            o.LJI(objIdConversionConfig);
            configurationBuilder.objIdConversionConfig(objIdConversionConfig);
            FFL.LJIIIZ().getClass();
            configurationBuilder.setUnzipNewSolution(FFL.LJ(31744, "ep_unzip_new_solution", true, false));
            FFL.LJIIIZ().getClass();
            configurationBuilder.ignoreBuiltInModel(FFL.LJ(31744, "tools_enable_block_builtin_face_model", true, false));
            FFL.LJIIIZ().getClass();
            configurationBuilder.jsonOptimizeType(FFL.LJIIJ(31744, 0, "ep_json_optimize", true));
            configurationBuilder.ignoreNullCallback(((Boolean) C52501Kj3.LIZ.getValue()).booleanValue());
            FFL.LJIIIZ().getClass();
            configurationBuilder.abDiffEffect(FFL.LJ(31744, "enable_ep_diff_effect", true, false));
            configurationBuilder.extraParams(new C84135X0h(effectPlatformBuilder));
            C5L7.LIZIZ();
            if (C52312Kg0.LIZ()) {
                configurationBuilder.abInsertHead(true);
                configurationBuilder.abInsertHeadPanels(new String[]{"default", "effect", "editingeffect"});
            }
            if (C43941HMj.LIZIZ() && ((EffectPlatformSingleConfig.PlatformAPIConfig) EffectPlatformSingleConfig.LIZIZ.getValue()).useIOExecutor) {
                configurationBuilder.executor(C38995FSd.LIZLLL());
            } else if (C00F.LIZ(31744, 0, "creative_tools_effect_thread_core_size_configuration", true) > 0) {
                FFL.LJIIIZ().getClass();
                configurationBuilder.threadCoreSize(FFL.LJIIJ(31744, 0, "creative_tools_effect_thread_core_size_configuration", true));
            }
            o.LJIIIIZZ(configurationBuilder, "configurationBuilder");
            return configurationBuilder;
        }
        "context is null.".toString();
        throw new IllegalArgumentException("context is null.");
    }

    @Override // com.ss.android.ugc.aweme.services.effectplatform.IEffectPlatformFactory
    public final InterfaceC84498XEg create(EffectConfiguration.Builder builder, InterfaceC88472Yns<? super EffectConfiguration, C76800UCe> interfaceC88472Yns, boolean z, boolean z2) {
        o.LJIIIZ(builder, "builder");
        EffectConfiguration effectConfiguration = builder.build();
        if (interfaceC88472Yns != null) {
            o.LJIIIIZZ(effectConfiguration, "effectConfiguration");
            interfaceC88472Yns.invoke(effectConfiguration);
        }
        return new EffectPlatform(effectConfiguration, z2);
    }
}
