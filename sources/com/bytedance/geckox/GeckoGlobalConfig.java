package com.bytedance.geckox;

import X.C16880lQ;
import X.C61588OFc;
import X.C64602PXa;
import X.InterfaceC61274O3a;
import X.InterfaceC61465OAj;
import X.InterfaceC61566OEg;
import X.O3Y;
import X.V0N;
import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import java.io.File;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes11.dex */
public class GeckoGlobalConfig {
    public final List<File> candidateRootDirectories;
    public final long mAppColdStartTime;
    public final Long mAppId;
    public final String mAppVersion;
    public final Context mContext;
    public String mDeviceId;
    public final ENVType mEnv;
    public final InterfaceC61274O3a mGeckoServiceManager;
    public String mHost;
    public final IMonitorConfig mMonitorConfig;
    public final InterfaceC61566OEg mNetWork;
    public final String mRegion;
    public final IRequestTagHeaderProvider mRequestTagHeaderProvider;
    public final InterfaceC61465OAj mStatisticMonitor;
    public volatile File rootDirectory;

    /* loaded from: classes11.dex */
    public static class Builder {
        public long appColdStartTime;
        public Long appId;
        public String appVersion;
        public List<File> candidateRootDirectories;
        public String deviceId;
        public ENVType env;
        public InterfaceC61274O3a geckoServiceManager;
        public String host;
        public Context mContext;
        public InterfaceC61566OEg mNetWork;
        public InterfaceC61465OAj mStatisticMonitor;
        public IMonitorConfig monitorConfig;
        public String region;
        public IRequestTagHeaderProvider requestTagHeaderProvider;
        public File rootDirectory;

        public GeckoGlobalConfig build() {
            if (this.rootDirectory != null) {
                return new GeckoGlobalConfig(this);
            }
            throw new IllegalArgumentException("rootDirectory is required");
        }

        public Builder(Context context) {
            this.mContext = C16880lQ.LLLLL(context);
        }

        public Builder appColdStartTime(long j) {
            this.appColdStartTime = j;
            return this;
        }

        public Builder appId(long j) {
            this.appId = Long.valueOf(j);
            return this;
        }

        public Builder appVersion(String str) {
            this.appVersion = str;
            return this;
        }

        public Builder candidateRootDirectories(List<File> list) {
            this.candidateRootDirectories = list;
            return this;
        }

        public Builder deviceId(String str) {
            this.deviceId = str;
            return this;
        }

        public Builder env(ENVType eNVType) {
            this.env = eNVType;
            return this;
        }

        public Builder geckoServiceManager(InterfaceC61274O3a interfaceC61274O3a) {
            this.geckoServiceManager = interfaceC61274O3a;
            return this;
        }

        public Builder host(String str) {
            this.host = str;
            return this;
        }

        public Builder monitorConfig(IMonitorConfig iMonitorConfig) {
            this.monitorConfig = iMonitorConfig;
            return this;
        }

        public Builder netStack(InterfaceC61566OEg interfaceC61566OEg) {
            this.mNetWork = interfaceC61566OEg;
            return this;
        }

        public Builder region(String str) {
            this.region = str;
            return this;
        }

        public Builder requestTagHeaderProvider(IRequestTagHeaderProvider iRequestTagHeaderProvider) {
            this.requestTagHeaderProvider = iRequestTagHeaderProvider;
            return this;
        }

        public Builder rootDirectory(File file) {
            this.rootDirectory = file;
            return this;
        }

        public Builder statisticMonitor(InterfaceC61465OAj interfaceC61465OAj) {
            this.mStatisticMonitor = interfaceC61465OAj;
            return this;
        }
    }

    /* loaded from: classes11.dex */
    public interface IMonitorConfig {
        String getChannel();

        Map<String, String> getCommonParams();

        String getMonitorHost();

        String getPackageId();

        String getUpdateVersionCode();

        boolean isOversea();
    }

    /* loaded from: classes11.dex */
    public interface IRequestTagHeaderProvider {
        Pair<String, String> getRequestTagHeader(boolean z);
    }

    public long getAppId() {
        return this.mAppId.longValue();
    }

    public List<File> getCandidateRootDirectories() {
        List<File> list = this.candidateRootDirectories;
        if (list != null && !list.isEmpty()) {
            return this.candidateRootDirectories;
        }
        return Collections.singletonList(this.rootDirectory);
    }

    public String getRootDirectoryPath() {
        return this.rootDirectory.getAbsolutePath();
    }

    /* loaded from: classes11.dex */
    public enum ENVType {
        BOE(1),
        DEV(1),
        PROD(2);

        public int val;

        public int getVal() {
            return this.val;
        }

        public static ENVType valueOf(String str) {
            return (ENVType) V0N.LJJJ(ENVType.class, str);
        }

        ENVType(int i) {
            this.val = i;
        }
    }

    public long getAppColdStartTime() {
        return this.mAppColdStartTime;
    }

    public String getAppVersion() {
        return this.mAppVersion;
    }

    public Context getContext() {
        return this.mContext;
    }

    public String getDeviceId() {
        return this.mDeviceId;
    }

    public ENVType getEnv() {
        return this.mEnv;
    }

    public InterfaceC61274O3a getGeckoServiceManager() {
        return this.mGeckoServiceManager;
    }

    public String getHost() {
        return this.mHost;
    }

    public IMonitorConfig getMonitorConfig() {
        return this.mMonitorConfig;
    }

    public InterfaceC61566OEg getNetWork() {
        return this.mNetWork;
    }

    public String getRegion() {
        return this.mRegion;
    }

    public IRequestTagHeaderProvider getRequestTagHeaderProvider() {
        return this.mRequestTagHeaderProvider;
    }

    public File getRootDirectory() {
        return this.rootDirectory;
    }

    public InterfaceC61465OAj getStatisticMonitor() {
        return this.mStatisticMonitor;
    }

    public GeckoGlobalConfig(Builder builder) {
        Context context = builder.mContext;
        this.mContext = context;
        if (context != null) {
            Long l = builder.appId;
            this.mAppId = l;
            if (TextUtils.isEmpty(builder.appVersion)) {
                this.mAppVersion = C61588OFc.LIZJ(context);
            } else {
                this.mAppVersion = builder.appVersion;
            }
            this.mDeviceId = builder.deviceId;
            String str = builder.host;
            this.mHost = str;
            this.mRegion = builder.region;
            ENVType eNVType = builder.env;
            this.mEnv = eNVType;
            if (!TextUtils.isEmpty(str)) {
                if (l != null) {
                    if (!TextUtils.isEmpty(this.mDeviceId)) {
                        if (eNVType != null) {
                            InterfaceC61566OEg interfaceC61566OEg = builder.mNetWork;
                            if (interfaceC61566OEg == null) {
                                this.mNetWork = new C64602PXa();
                            } else {
                                this.mNetWork = interfaceC61566OEg;
                            }
                            this.mStatisticMonitor = builder.mStatisticMonitor;
                            this.mRequestTagHeaderProvider = builder.requestTagHeaderProvider;
                            this.mMonitorConfig = builder.monitorConfig;
                            this.rootDirectory = builder.rootDirectory;
                            this.candidateRootDirectories = builder.candidateRootDirectories;
                            long j = builder.appColdStartTime;
                            if (j == 0) {
                                this.mAppColdStartTime = System.currentTimeMillis();
                            } else {
                                this.mAppColdStartTime = j;
                            }
                            InterfaceC61274O3a interfaceC61274O3a = builder.geckoServiceManager;
                            if (interfaceC61274O3a == null) {
                                this.mGeckoServiceManager = new O3Y();
                                return;
                            } else {
                                this.mGeckoServiceManager = interfaceC61274O3a;
                                return;
                            }
                        }
                        throw new IllegalArgumentException("env is required");
                    }
                    throw new IllegalArgumentException("deviceId is required");
                }
                throw new IllegalArgumentException("appId is required");
            }
            throw new IllegalArgumentException("host is required");
        }
        throw new IllegalArgumentException("context is required");
    }

    public void setDeviceId(String str) {
        this.mDeviceId = str;
    }

    public void setHost(String str) {
        this.mHost = str;
    }

    public void setRootDirectory(File file) {
        this.rootDirectory = file;
    }

    public /* synthetic */ GeckoGlobalConfig(Builder builder, O3Y o3y) {
        this(builder);
    }
}
