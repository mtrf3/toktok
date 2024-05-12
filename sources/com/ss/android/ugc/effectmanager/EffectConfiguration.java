package com.ss.android.ugc.effectmanager;

import X.C12310e3;
import X.C16880lQ;
import X.C78685UuP;
import X.C79855VVr;
import X.G0J;
import X.InterfaceC84427XBn;
import X.X9B;
import X.XBE;
import X.XCF;
import X.XCG;
import X.XCK;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.wallet.LiveWalletRechargeExchangeStrengthen;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.effectmanager.common.TaskManager;
import com.ss.android.ugc.effectmanager.common.cachemanager.ICache;
import com.ss.android.ugc.effectmanager.common.listener.IEffectNetWorker;
import com.ss.android.ugc.effectmanager.common.listener.IJsonConverter;
import com.ss.android.ugc.effectmanager.common.listener.IMonitorService;
import com.ss.android.ugc.effectmanager.common.logger.EPLog;
import com.ss.android.ugc.effectmanager.common.network.EffectNetWorkerWrapper;
import com.ss.android.ugc.effectmanager.common.utils.EPUtils;
import com.ss.android.ugc.effectmanager.effect.bridge.EffectFetcher;
import com.ss.android.ugc.effectmanager.effect.repository.newrepo.EffectDownloadManager;
import com.ss.android.ugc.effectmanager.effect.task.task.DefaultEffectFetcher;
import com.ss.android.ugc.effectmanager.knadapt.KNExecutorService;
import com.ss.android.ugc.effectmanager.knadapt.KNJsonConverter;
import com.ss.android.ugc.effectmanager.knadapt.KNLogger;
import com.ss.android.ugc.effectmanager.knadapt.KNMonitorService;
import com.ss.android.ugc.effectmanager.knadapt.KNNetworkClient;
import com.ss.android.ugc.effectmanager.knadapt.UseKNPlatform;
import com.ss.android.ugc.effectmanager.link.model.host.Host;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class EffectConfiguration {
    public ExecutorService executor;
    public int filterType;
    public HashMap<String, String> iopInfo;
    public IJsonConverter jsonConverter;
    public ListenerManger listenerManger;
    public String mAccessKey;
    public String mApiAddress;
    public String mAppID;
    public String mAppLanguage;
    public String mAppVersion;
    public ICache mCache;
    public String mChannel;
    public Context mContext;
    public String mDeviceId;
    public String mDeviceType;
    public ArrayList<String> mDraftList;
    public XCG mEffectConfig;
    public File mEffectDir;
    public EffectDownloadManager mEffectDownloadManager;
    public EffectFetcher mEffectFetcher;
    public EffectNetWorkerWrapper mEffectNetWorker;
    public String mGpuVersion;
    public List<Host> mHosts;
    public String mPlatform;
    public String mRegion;
    public int mRetryCount;
    public String mSdkVersion;
    public TaskManager mTaskManager;
    public IMonitorService monitorService;
    public int requestStrategy;
    public String testStatus;

    /* loaded from: classes16.dex */
    public static final class Builder {
        public static boolean hasAddedVersionTagInLog;
        public String accessKey;
        public String appID;
        public String appLanguage;
        public String appVersion;
        public ICache cache;
        public String channel;
        public Context context;
        public String deviceId;
        public String deviceType;
        public ArrayList<String> draftList;
        public File effectDir;
        public EffectFetcher effectFetcher;
        public IEffectNetWorker effectNetWorker;
        public int filterType;
        public String gpuVersion;
        public List<Host> hosts;
        public IJsonConverter jsonConverter;
        public ExecutorService mExecutor;
        public XCF mKNEffectConfigBuilder;
        public IMonitorService monitorService;
        public String platform;
        public String region;
        public int requestStrategy;
        public String sdkVersion;
        public String testStatus;
        public int retryCount = 3;
        public HashMap<String, String> iopInfo = new HashMap<>();

        public Builder sysLanguage(String str) {
            return this;
        }

        public EffectConfiguration build() {
            return new EffectConfiguration(this);
        }

        public XCG buildKNEffectConfig() {
            XCF xcf = this.mKNEffectConfigBuilder;
            xcf.getClass();
            return new XCG(xcf);
        }

        public Builder() {
            if (!hasAddedVersionTagInLog) {
                if (UseKNPlatform.enableKNPlatform) {
                    EPLog.addSDKTagString("760.0.0.228-mt");
                } else {
                    EPLog.addSDKTagString(EPUtils.getPlatformSDKVersion());
                }
                hasAddedVersionTagInLog = true;
            }
            this.mKNEffectConfigBuilder = new XCF();
        }

        public Builder JsonConverter(IJsonConverter iJsonConverter) {
            this.jsonConverter = iJsonConverter;
            XCF xcf = this.mKNEffectConfigBuilder;
            G0J g0j = new G0J(new KNJsonConverter(iJsonConverter));
            xcf.getClass();
            xcf.LJII = g0j;
            return this;
        }

        public Builder abDiffEffect(boolean z) {
            this.mKNEffectConfigBuilder.LJJIL = z;
            return this;
        }

        public Builder abInsertHead(boolean z) {
            this.mKNEffectConfigBuilder.LJJIJIIJIL = z;
            return this;
        }

        public Builder abInsertHeadPanels(String[] testPanels) {
            XCF xcf = this.mKNEffectConfigBuilder;
            xcf.getClass();
            o.LJIIJ(testPanels, "testPanels");
            xcf.LJJIJIL = testPanels;
            return this;
        }

        public Builder accessKey(String accessKey) {
            this.accessKey = accessKey;
            XCF xcf = this.mKNEffectConfigBuilder;
            xcf.getClass();
            o.LJIIJ(accessKey, "accessKey");
            xcf.LIZ = accessKey;
            return this;
        }

        public Builder appID(String str) {
            this.appID = str;
            this.mKNEffectConfigBuilder.LJFF = str;
            return this;
        }

        public Builder appLanguage(String appLanguage) {
            this.appLanguage = appLanguage;
            XCF xcf = this.mKNEffectConfigBuilder;
            xcf.getClass();
            o.LJIIJ(appLanguage, "appLanguage");
            xcf.LJIILL = appLanguage;
            return this;
        }

        public Builder appVersion(String appVersion) {
            this.appVersion = appVersion;
            XCF xcf = this.mKNEffectConfigBuilder;
            xcf.getClass();
            o.LJIIJ(appVersion, "appVersion");
            xcf.LIZJ = appVersion;
            return this;
        }

        public Builder cache(ICache iCache) {
            this.cache = iCache;
            return this;
        }

        public Builder channel(String channel) {
            this.channel = channel;
            XCF xcf = this.mKNEffectConfigBuilder;
            xcf.getClass();
            o.LJIIJ(channel, "channel");
            xcf.LJIIIIZZ = channel;
            return this;
        }

        public Builder context(Context context) {
            Context LLLLL = C16880lQ.LLLLL(context);
            this.context = LLLLL;
            this.mKNEffectConfigBuilder.LJJIII = LLLLL;
            return this;
        }

        public Builder deviceId(String deviceId) {
            this.deviceId = deviceId;
            XCF xcf = this.mKNEffectConfigBuilder;
            xcf.getClass();
            o.LJIIJ(deviceId, "deviceId");
            xcf.LIZLLL = deviceId;
            return this;
        }

        public Builder deviceType(String deviceType) {
            this.deviceType = deviceType;
            XCF xcf = this.mKNEffectConfigBuilder;
            xcf.getClass();
            o.LJIIJ(deviceType, "deviceType");
            xcf.LJIIJ = deviceType;
            return this;
        }

        public Builder draftList(ArrayList<String> draftList) {
            this.draftList = draftList;
            XCF xcf = this.mKNEffectConfigBuilder;
            xcf.getClass();
            o.LJIIJ(draftList, "draftList");
            xcf.LJJIFFI = draftList;
            return this;
        }

        public Builder effectDir(File file) {
            this.effectDir = file;
            if (file == null) {
                return this;
            }
            if (!file.exists()) {
                file.mkdirs();
            }
            this.mKNEffectConfigBuilder.LJIIJJI = file.getAbsolutePath();
            return this;
        }

        public Builder effectFetcher(EffectFetcher effectFetcher) {
            this.effectFetcher = effectFetcher;
            if (effectFetcher != null && "DownloadableModelSupportEffectFetcher".equals(C16880lQ.LJLLJ(effectFetcher.getClass())) && XBE.LJ()) {
                this.mKNEffectConfigBuilder.LJIIZILJ = XBE.LIZJ().LIZIZ();
            }
            return this;
        }

        public Builder effectMaxCacheSize(long j) {
            XCF xcf = this.mKNEffectConfigBuilder;
            if (j <= 0) {
                xcf.getClass();
            } else {
                xcf.LJJIJ = j;
            }
            return this;
        }

        public Builder effectNetWorker(IEffectNetWorker iEffectNetWorker) {
            this.effectNetWorker = iEffectNetWorker;
            XCF xcf = this.mKNEffectConfigBuilder;
            KNNetworkClient kNNetworkClient = new KNNetworkClient(iEffectNetWorker);
            xcf.getClass();
            xcf.LJI = kNNetworkClient;
            return this;
        }

        public Builder executor(ExecutorService executorService) {
            this.mExecutor = executorService;
            XCF xcf = this.mKNEffectConfigBuilder;
            KNExecutorService kNExecutorService = new KNExecutorService(executorService);
            xcf.getClass();
            xcf.LJIILLIIL = kNExecutorService;
            return this;
        }

        public Builder extraParams(X9B extraParams) {
            XCF xcf = this.mKNEffectConfigBuilder;
            xcf.getClass();
            o.LJIIJ(extraParams, "extraParams");
            xcf.LJJIJL = extraParams;
            return this;
        }

        public Builder filterType(int i) {
            this.filterType = i;
            this.mKNEffectConfigBuilder.LJJIIZI = Integer.valueOf(i);
            return this;
        }

        public Builder gpuInfo(String str) {
            this.gpuVersion = str;
            this.mKNEffectConfigBuilder.LJIJJ = str;
            return this;
        }

        public Builder hosts(List<Host> list) {
            this.hosts = list;
            if (!list.isEmpty()) {
                XCF xcf = this.mKNEffectConfigBuilder;
                String hosts = ((Host) ListProtector.get(list, 0)).getItemName();
                xcf.getClass();
                o.LJIIJ(hosts, "hosts");
                xcf.LJJ = hosts;
            }
            return this;
        }

        public Builder ignoreBuiltInModel(boolean z) {
            this.mKNEffectConfigBuilder.LJJIJLIJ = z;
            return this;
        }

        public Builder ignoreNullCallback(boolean z) {
            this.mKNEffectConfigBuilder.LJJIZ = z;
            return this;
        }

        public Builder jsonOptimizeType(int i) {
            this.mKNEffectConfigBuilder.LJJJ = i;
            return this;
        }

        public Builder knEffectFetcher(InterfaceC84427XBn interfaceC84427XBn) {
            this.mKNEffectConfigBuilder.LJIIZILJ = interfaceC84427XBn;
            return this;
        }

        public Builder monitorService(IMonitorService iMonitorService) {
            this.monitorService = iMonitorService;
            XCF xcf = this.mKNEffectConfigBuilder;
            KNMonitorService kNMonitorService = new KNMonitorService(iMonitorService);
            xcf.getClass();
            xcf.LJIJ = kNMonitorService;
            return this;
        }

        public Builder objIdConversionConfig(XCK objIdConversionConfig) {
            XCF xcf = this.mKNEffectConfigBuilder;
            xcf.getClass();
            o.LJIIJ(objIdConversionConfig, "objIdConversionConfig");
            xcf.LJJII = objIdConversionConfig;
            return this;
        }

        public Builder platform(String platform) {
            this.platform = platform;
            XCF xcf = this.mKNEffectConfigBuilder;
            xcf.getClass();
            o.LJIIJ(platform, "platform");
            xcf.LJIIIZ = platform;
            return this;
        }

        public Builder region(String region) {
            this.region = region;
            XCF xcf = this.mKNEffectConfigBuilder;
            xcf.getClass();
            o.LJIIJ(region, "region");
            xcf.LJ = region;
            return this;
        }

        public Builder requestStrategy(int i) {
            this.requestStrategy = i;
            this.mKNEffectConfigBuilder.LJIL = i;
            return this;
        }

        public Builder retryCount(int i) {
            this.retryCount = i;
            this.mKNEffectConfigBuilder.LJIILIIL = i;
            return this;
        }

        public Builder sdkVersion(String sdkVersion) {
            this.sdkVersion = sdkVersion;
            XCF xcf = this.mKNEffectConfigBuilder;
            xcf.getClass();
            o.LJIIJ(sdkVersion, "sdkVersion");
            xcf.LIZIZ = sdkVersion;
            return this;
        }

        public Builder setUnzipNewSolution(boolean z) {
            this.mKNEffectConfigBuilder.LJJI = z;
            return this;
        }

        public Builder testStatus(String str) {
            this.testStatus = str;
            this.mKNEffectConfigBuilder.LJIJI = str;
            return this;
        }

        public Builder threadCoreSize(int i) {
            XCF xcf = this.mKNEffectConfigBuilder;
            xcf.getClass();
            xcf.LJIILLIIL = C79855VVr.LIZ(i, 30000L);
            xcf.LJJIJIIJI = i;
            return this;
        }

        public Builder iop(String str, String str2, String str3) {
            if (!TextUtils.isEmpty(str)) {
                this.iopInfo.put("lx", str);
            }
            if (!TextUtils.isEmpty(str2)) {
                this.iopInfo.put("ly", str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                this.iopInfo.put("cy_code", str3);
            }
            XCF xcf = this.mKNEffectConfigBuilder;
            xcf.getClass();
            if (str != null && (!o.LJ(str, ""))) {
                xcf.LJIJJLI.put("lx", str);
            }
            if (str2 != null && (!o.LJ(str2, ""))) {
                xcf.LJIJJLI.put("ly", str2);
            }
            if (str3 != null && (!o.LJ(str3, ""))) {
                xcf.LJIJJLI.put("cy_code", str3);
            }
            return this;
        }
    }

    public String getAccessKey() {
        return this.mAccessKey;
    }

    public String getApiAdress() {
        return this.mApiAddress;
    }

    public String getAppID() {
        return this.mAppID;
    }

    public String getAppLanguage() {
        return this.mAppLanguage;
    }

    public String getAppVersion() {
        return this.mAppVersion;
    }

    public ICache getCache() {
        return this.mCache;
    }

    public String getChannel() {
        return this.mChannel;
    }

    public Context getContext() {
        return this.mContext;
    }

    public String getDeviceId() {
        return this.mDeviceId;
    }

    public String getDeviceType() {
        return this.mDeviceType;
    }

    public ArrayList<String> getDraftList() {
        return this.mDraftList;
    }

    public XCG getEffectConfig() {
        return this.mEffectConfig;
    }

    public File getEffectDir() {
        return this.mEffectDir;
    }

    public EffectDownloadManager getEffectDownloadManager() {
        return this.mEffectDownloadManager;
    }

    public EffectFetcher getEffectFetcher() {
        return this.mEffectFetcher;
    }

    public EffectNetWorkerWrapper getEffectNetWorker() {
        return this.mEffectNetWorker;
    }

    public ExecutorService getExecutor() {
        return this.executor;
    }

    public int getFilterType() {
        return this.filterType;
    }

    public String getGpuVersion() {
        return this.mGpuVersion;
    }

    public List<Host> getHosts() {
        return this.mHosts;
    }

    public HashMap<String, String> getIopInfo() {
        return this.iopInfo;
    }

    public IJsonConverter getJsonConverter() {
        return this.jsonConverter;
    }

    public ListenerManger getListenerManger() {
        return this.listenerManger;
    }

    public IMonitorService getMonitorService() {
        return this.monitorService;
    }

    public String getPlatform() {
        return this.mPlatform;
    }

    public String getRegion() {
        return this.mRegion;
    }

    public int getRequestStrategy() {
        return this.requestStrategy;
    }

    public int getRetryCount() {
        return this.mRetryCount;
    }

    public String getSdkVersion() {
        return this.mSdkVersion;
    }

    public TaskManager getTaskManager() {
        return this.mTaskManager;
    }

    public String getTestStatus() {
        return this.testStatus;
    }

    public EffectConfiguration(Builder builder) {
        String str = LiveWalletRechargeExchangeStrengthen.DEFAULT;
        this.mChannel = LiveWalletRechargeExchangeStrengthen.DEFAULT;
        this.iopInfo = new HashMap<>();
        this.mRetryCount = 1;
        this.mApiAddress = "/effect/api";
        this.mAccessKey = builder.accessKey;
        this.mSdkVersion = builder.sdkVersion;
        this.mAppVersion = builder.appVersion;
        this.mDeviceId = builder.deviceId;
        String str2 = builder.channel;
        this.mChannel = str2 != null ? str2 : str;
        String str3 = builder.platform;
        this.mPlatform = str3 == null ? "android" : str3;
        this.mDeviceType = builder.deviceType;
        Context context = builder.context;
        this.mContext = context;
        File file = builder.effectDir;
        if (file == null && context != null) {
            this.mEffectDir = new File(C16880lQ.LLIIJLIL(this.mContext), "effect");
        } else {
            this.mEffectDir = file;
        }
        this.mEffectDir = builder.effectDir;
        EffectNetWorkerWrapper effectNetWorkerWrapper = new EffectNetWorkerWrapper(builder.effectNetWorker, builder.context);
        this.mEffectNetWorker = effectNetWorkerWrapper;
        this.mRegion = builder.region;
        this.mCache = builder.cache;
        this.mRetryCount = builder.retryCount;
        this.jsonConverter = builder.jsonConverter;
        String str4 = builder.appID;
        str4 = str4 == null ? CardStruct.IStatusCode.DEFAULT : str4;
        this.mAppID = str4;
        this.mAppLanguage = builder.appLanguage;
        this.iopInfo = builder.iopInfo;
        IMonitorService iMonitorService = builder.monitorService;
        this.monitorService = iMonitorService;
        this.executor = builder.mExecutor;
        EffectFetcher effectFetcher = builder.effectFetcher;
        this.mEffectFetcher = effectFetcher == null ? new DefaultEffectFetcher(effectNetWorkerWrapper, iMonitorService, str4, this.mAccessKey) : effectFetcher;
        this.testStatus = builder.testStatus;
        this.listenerManger = new ListenerManger();
        this.mEffectDownloadManager = EffectDownloadManager.INSTANCE;
        this.mDraftList = builder.draftList;
        this.mGpuVersion = builder.gpuVersion;
        this.requestStrategy = builder.requestStrategy;
        this.mHosts = builder.hosts;
        this.filterType = builder.filterType;
        XCG buildKNEffectConfig = builder.buildKNEffectConfig();
        this.mEffectConfig = buildKNEffectConfig;
        KNLogger customLogger = KNLogger.INSTANCE;
        buildKNEffectConfig.getClass();
        o.LJIIJ(customLogger, "customLogger");
        C12310e3.LIZIZ.getClass();
        C78685UuP.LJJLJ(C12310e3.LIZ, customLogger);
    }

    public void setCache(ICache iCache) {
        this.mCache = iCache;
    }

    public void setDeviceId(String str) {
        this.mDeviceId = str;
    }

    public void setDraftList(ArrayList<String> arrayList) {
        this.mDraftList = arrayList;
    }

    public void setEffectDir(File file) {
        this.mEffectDir = file;
    }

    public void setEffectFetcher(EffectFetcher effectFetcher) {
        this.mEffectFetcher = effectFetcher;
    }

    public void setEffectNetWorker(IEffectNetWorker iEffectNetWorker) {
        this.mEffectNetWorker.setIEffectNetWorker(iEffectNetWorker);
    }

    public void setTaskManager(TaskManager taskManager) {
        this.mTaskManager = taskManager;
    }
}
