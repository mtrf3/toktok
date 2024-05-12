package com.ss.android.ugc.effectmanager;

import X.C12310e3;
import X.C16880lQ;
import X.C78685UuP;
import X.G0J;
import X.InterfaceC12300e2;
import X.V0N;
import X.X9D;
import X.XA2;
import X.XCF;
import X.XCG;
import android.content.Context;
import android.content.res.AssetManager;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.effectmanager.common.listener.IEffectNetWorker;
import com.ss.android.ugc.effectmanager.common.listener.IJsonConverter;
import com.ss.android.ugc.effectmanager.common.listener.IMonitorService;
import com.ss.android.ugc.effectmanager.common.logger.EPLog;
import com.ss.android.ugc.effectmanager.common.utils.Preconditions;
import com.ss.android.ugc.effectmanager.knadapt.KNExecutor;
import com.ss.android.ugc.effectmanager.knadapt.KNJsonConverter;
import com.ss.android.ugc.effectmanager.knadapt.KNMonitorService;
import com.ss.android.ugc.effectmanager.knadapt.KNNetworkClient;
import com.ss.android.ugc.effectmanager.knadapt.ModelConverterExtKt;
import com.ss.android.ugc.effectmanager.knadapt.ModelListenerAdaptKt;
import com.ss.android.ugc.effectmanager.link.model.host.Host;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class DownloadableModelConfig {
    public final String mAccessKey;
    public final String mAppId;
    public final AssetManager mAssetManager;
    public final Context mContext;
    public final String mDeviceType;
    public final EffectConfiguration mEffectConfiguration;
    public final IEffectNetWorker mEffectNetWorker;
    public final ModelEventListener mEventListener;
    public final Pattern mExclusionPattern;
    public final Executor mExecutor;
    public final FetchModelType mFetchModelType;
    public final List<Host> mHosts;
    public final IJsonConverter mJsonConverter;
    public XCG mKNEffectConfig;
    public final ModelFileEnv mModelFileEnv;
    public final IMonitorService mMonitorService;
    public final String mSdkVersion;
    public final String mWorkspace;

    /* loaded from: classes16.dex */
    public static final class Builder {
        public String mAccessKey;
        public String mAppId;
        public AssetManager mAssetManager;
        public String mBid;
        public Context mContext;
        public String mDeviceType;
        public EffectConfiguration mEffectConfiguration;
        public IEffectNetWorker mEffectNetWorker;
        public ModelEventListener mEventListener;
        public Pattern mExclusionPattern;
        public Executor mExecutor;
        public FetchModelType mFetchModelType;
        public IJsonConverter mJsonConverter;
        public ModelFileEnv mModelFileEnv;
        public IMonitorService mMonitorService;
        public String mSdkVersion;
        public String mWorkspace;
        public List<Host> mHosts = new ArrayList();
        public XCF mKNEffectConfigBuilder = new XCF();

        public DownloadableModelConfig build() {
            return new DownloadableModelConfig(this);
        }

        public XCG buildKNConfig() {
            XCF xcf = this.mKNEffectConfigBuilder;
            xcf.getClass();
            return new XCG(xcf);
        }

        public Builder abDiffEffect(boolean z) {
            this.mKNEffectConfigBuilder.LJJIL = z;
            return this;
        }

        public Builder ignoreBuiltInModel(boolean z) {
            this.mKNEffectConfigBuilder.LJJIJLIJ = z;
            return this;
        }

        public Builder ignoreModelLruVersion(boolean z) {
            this.mKNEffectConfigBuilder.LJJJI = z;
            return this;
        }

        public Builder setAccessKey(String accessKey) {
            this.mAccessKey = accessKey;
            XCF xcf = this.mKNEffectConfigBuilder;
            xcf.getClass();
            o.LJIIJ(accessKey, "accessKey");
            xcf.LIZ = accessKey;
            return this;
        }

        public Builder setAppId(String str) {
            this.mAppId = str;
            this.mKNEffectConfigBuilder.LJFF = str;
            return this;
        }

        public Builder setAssetManager(AssetManager assetManager) {
            this.mAssetManager = assetManager;
            return this;
        }

        public Builder setBid(String str) {
            this.mBid = str;
            return this;
        }

        public Builder setContext(Context context) {
            Context LLLLL = C16880lQ.LLLLL(context);
            this.mContext = LLLLL;
            this.mKNEffectConfigBuilder.LJJIII = LLLLL;
            return this;
        }

        public Builder setDeviceType(String deviceType) {
            this.mDeviceType = deviceType;
            XCF xcf = this.mKNEffectConfigBuilder;
            xcf.getClass();
            o.LJIIJ(deviceType, "deviceType");
            xcf.LJIIJ = deviceType;
            return this;
        }

        public Builder setEffectConfiguration(EffectConfiguration effectConfiguration) {
            this.mEffectConfiguration = effectConfiguration;
            if (effectConfiguration.getContext() != null && this.mContext == null) {
                setContext(effectConfiguration.getContext());
            }
            if (effectConfiguration.getAppVersion() != null) {
                XCF xcf = this.mKNEffectConfigBuilder;
                String appVersion = effectConfiguration.getAppVersion();
                xcf.getClass();
                o.LJIIJ(appVersion, "appVersion");
                xcf.LIZJ = appVersion;
            }
            if (effectConfiguration.getChannel() != null) {
                XCF xcf2 = this.mKNEffectConfigBuilder;
                String channel = effectConfiguration.getChannel();
                xcf2.getClass();
                o.LJIIJ(channel, "channel");
                xcf2.LJIIIIZZ = channel;
            }
            if (effectConfiguration.getDeviceId() != null) {
                XCF xcf3 = this.mKNEffectConfigBuilder;
                String deviceId = effectConfiguration.getDeviceId();
                xcf3.getClass();
                o.LJIIJ(deviceId, "deviceId");
                xcf3.LIZLLL = deviceId;
            }
            if (effectConfiguration.getPlatform() != null) {
                XCF xcf4 = this.mKNEffectConfigBuilder;
                String platform = effectConfiguration.getPlatform();
                xcf4.getClass();
                o.LJIIJ(platform, "platform");
                xcf4.LJIIIZ = platform;
            }
            if (effectConfiguration.getRegion() != null) {
                XCF xcf5 = this.mKNEffectConfigBuilder;
                String region = effectConfiguration.getRegion();
                xcf5.getClass();
                o.LJIIJ(region, "region");
                xcf5.LJ = region;
            }
            if (effectConfiguration.getAppLanguage() != null) {
                XCF xcf6 = this.mKNEffectConfigBuilder;
                String appLanguage = effectConfiguration.getAppLanguage();
                xcf6.getClass();
                o.LJIIJ(appLanguage, "appLanguage");
                xcf6.LJIILL = appLanguage;
            }
            if (effectConfiguration.getGpuVersion() != null) {
                this.mKNEffectConfigBuilder.LJIJJ = effectConfiguration.getGpuVersion();
            }
            if (effectConfiguration.getTestStatus() != null) {
                this.mKNEffectConfigBuilder.LJIJI = effectConfiguration.getTestStatus();
            }
            this.mKNEffectConfigBuilder.LJJIIZI = Integer.valueOf(effectConfiguration.getFilterType());
            return this;
        }

        public Builder setEffectNetWorker(IEffectNetWorker iEffectNetWorker) {
            this.mEffectNetWorker = iEffectNetWorker;
            XCF xcf = this.mKNEffectConfigBuilder;
            KNNetworkClient kNNetworkClient = new KNNetworkClient(iEffectNetWorker);
            xcf.getClass();
            xcf.LJI = kNNetworkClient;
            return this;
        }

        public Builder setEventListener(ModelEventListener modelEventListener) {
            this.mEventListener = modelEventListener;
            XCF xcf = this.mKNEffectConfigBuilder;
            ModelListenerAdaptKt.toKNListener(modelEventListener);
            xcf.getClass();
            return this;
        }

        public Builder setExclusionPattern(String str) {
            if (str == null) {
                this.mExclusionPattern = null;
            } else {
                this.mExclusionPattern = PatternProtector.compile(str);
                XCF xcf = this.mKNEffectConfigBuilder;
                xcf.getClass();
                xcf.LJJIIJZLJL = str;
            }
            return this;
        }

        public Builder setExecutor(Executor executor) {
            this.mExecutor = executor;
            XCF xcf = this.mKNEffectConfigBuilder;
            KNExecutor kNExecutor = new KNExecutor(executor);
            xcf.getClass();
            xcf.LJIILLIIL = kNExecutor;
            return this;
        }

        public Builder setHosts(List<Host> list) {
            this.mHosts.addAll(list);
            if (!list.isEmpty()) {
                XCF xcf = this.mKNEffectConfigBuilder;
                String hosts = ((Host) ListProtector.get(list, 0)).getItemName();
                xcf.getClass();
                o.LJIIJ(hosts, "hosts");
                xcf.LJJ = hosts;
            }
            return this;
        }

        public Builder setJsonConverter(IJsonConverter iJsonConverter) {
            this.mJsonConverter = iJsonConverter;
            XCF xcf = this.mKNEffectConfigBuilder;
            G0J g0j = new G0J(new KNJsonConverter(iJsonConverter));
            xcf.getClass();
            xcf.LJII = g0j;
            return this;
        }

        public Builder setModelApiMaxTryCount(int i) {
            this.mKNEffectConfigBuilder.LJIILJJIL = i;
            return this;
        }

        public Builder setModelFileEnv(ModelFileEnv modelFileEnv) {
            this.mModelFileEnv = modelFileEnv;
            XCF xcf = this.mKNEffectConfigBuilder;
            X9D modelFileEnv2 = ModelConverterExtKt.toKNModel(modelFileEnv);
            xcf.getClass();
            o.LJIIJ(modelFileEnv2, "modelFileEnv");
            xcf.LJJIIZ = modelFileEnv2;
            return this;
        }

        public Builder setModelType(FetchModelType fetchModelType) {
            this.mFetchModelType = fetchModelType;
            XCF xcf = this.mKNEffectConfigBuilder;
            XA2 modelType = ModelConverterExtKt.toKNFetchModelType(fetchModelType);
            xcf.getClass();
            o.LJIIJ(modelType, "modelType");
            xcf.LJJIIJ = modelType;
            return this;
        }

        public Builder setMonitorService(IMonitorService iMonitorService) {
            this.mMonitorService = iMonitorService;
            XCF xcf = this.mKNEffectConfigBuilder;
            KNMonitorService kNMonitorService = new KNMonitorService(iMonitorService);
            xcf.getClass();
            xcf.LJIJ = kNMonitorService;
            return this;
        }

        public Builder setSdkVersion(String sdkVersion) {
            this.mSdkVersion = sdkVersion;
            XCF xcf = this.mKNEffectConfigBuilder;
            xcf.getClass();
            o.LJIIJ(sdkVersion, "sdkVersion");
            xcf.LIZIZ = sdkVersion;
            return this;
        }

        public Builder setWorkspace(String str) {
            this.mWorkspace = str;
            this.mKNEffectConfigBuilder.LJIIL = str;
            return this;
        }
    }

    public String getAccessKey() {
        return this.mAccessKey;
    }

    public String getAppId() {
        return this.mAppId;
    }

    public AssetManager getAssetManager() {
        return this.mAssetManager;
    }

    public Context getContext() {
        return this.mContext;
    }

    public String getDeviceType() {
        return this.mDeviceType;
    }

    public EffectConfiguration getEffectConfiguration() {
        return this.mEffectConfiguration;
    }

    public IEffectNetWorker getEffectNetWorker() {
        return this.mEffectNetWorker;
    }

    public ModelEventListener getEventListener() {
        return this.mEventListener;
    }

    public Pattern getExclusionPattern() {
        return this.mExclusionPattern;
    }

    public Executor getExecutor() {
        return this.mExecutor;
    }

    public List<Host> getHosts() {
        return this.mHosts;
    }

    public IJsonConverter getJsonConverter() {
        return this.mJsonConverter;
    }

    public XCG getKNEffectConfig() {
        return this.mKNEffectConfig;
    }

    public ModelFileEnv getModelFileEnv() {
        return this.mModelFileEnv;
    }

    public FetchModelType getModelType() {
        return this.mFetchModelType;
    }

    public IMonitorService getMonitorService() {
        return this.mMonitorService;
    }

    public String getSdkVersion() {
        return this.mSdkVersion;
    }

    public String getWorkspace() {
        return this.mWorkspace;
    }

    /* loaded from: classes16.dex */
    public enum ModelFileEnv {
        TEST,
        ONLINE;

        public static ModelFileEnv valueOf(String str) {
            return (ModelFileEnv) V0N.LJJJ(ModelFileEnv.class, str);
        }
    }

    public DownloadableModelConfig(Builder builder) {
        AssetManager assetManager = builder.mAssetManager;
        Preconditions.checkNotNull(assetManager);
        this.mAssetManager = assetManager;
        String str = builder.mWorkspace;
        Preconditions.checkNotNull(str);
        this.mWorkspace = str;
        IEffectNetWorker iEffectNetWorker = builder.mEffectNetWorker;
        Preconditions.checkNotNull(iEffectNetWorker);
        this.mEffectNetWorker = iEffectNetWorker;
        this.mHosts = Collections.unmodifiableList(builder.mHosts);
        IJsonConverter iJsonConverter = builder.mJsonConverter;
        Preconditions.checkNotNull(iJsonConverter);
        this.mJsonConverter = iJsonConverter;
        Executor executor = builder.mExecutor;
        Preconditions.checkNotNull(executor);
        this.mExecutor = executor;
        String str2 = builder.mDeviceType;
        Preconditions.checkNotNull(str2);
        this.mDeviceType = str2;
        String str3 = builder.mSdkVersion;
        Preconditions.checkNotNull(str3);
        this.mSdkVersion = str3;
        String str4 = builder.mAppId;
        Preconditions.checkNotNull(str4);
        this.mAppId = str4;
        String str5 = builder.mAccessKey;
        Preconditions.checkNotNull(str5);
        this.mAccessKey = str5;
        this.mMonitorService = builder.mMonitorService;
        this.mExclusionPattern = builder.mExclusionPattern;
        this.mEventListener = builder.mEventListener;
        ModelFileEnv modelFileEnv = builder.mModelFileEnv;
        this.mModelFileEnv = modelFileEnv == null ? ModelFileEnv.ONLINE : modelFileEnv;
        FetchModelType fetchModelType = builder.mFetchModelType;
        this.mFetchModelType = fetchModelType == null ? FetchModelType.ORIGIN : fetchModelType;
        this.mEffectConfiguration = builder.mEffectConfiguration;
        this.mContext = builder.mContext;
        XCG buildKNConfig = builder.buildKNConfig();
        this.mKNEffectConfig = buildKNConfig;
        if (buildKNConfig != null) {
            InterfaceC12300e2 interfaceC12300e2 = new InterfaceC12300e2() { // from class: com.ss.android.ugc.effectmanager.DownloadableModelConfig.1
                public void setEnabled(boolean z) {
                }

                @Override // X.InterfaceC12300e2
                public boolean getEnabled() {
                    return EPLog.INSTANCE.getSEnableLog();
                }

                @Override // X.InterfaceC12300e2
                public void logDebug(String str6, String str7) {
                    EPLog.d(str6, str7);
                }

                @Override // X.InterfaceC12300e2
                public void logError(String str6, String str7) {
                    EPLog.e(str6, str7);
                }

                @Override // X.InterfaceC12300e2
                public void logWarn(String str6, String str7) {
                    EPLog.w(str6, str7);
                }

                @Override // X.InterfaceC12300e2
                public void logError(String str6, String str7, Throwable th) {
                    EPLog.e(str6, str7, th);
                }
            };
            C12310e3.LIZIZ.getClass();
            C78685UuP.LJJLJ(C12310e3.LIZ, interfaceC12300e2);
        }
    }
}
