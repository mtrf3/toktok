package com.bytedance.lynx.hybrid.resource.config;

import X.F9E;
import X.InterfaceC61252O2e;
import X.O2H;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class GeckoConfig extends F9E {
    public String accessKey;
    public boolean appLogMonitor;
    public String businessVersion;
    public InterfaceC61252O2e geckoDepender;
    public boolean isRelativePath;
    public String localInfo;
    public boolean loopCheck;
    public Object networkImpl;
    public String offlineDir;
    public boolean serverMonitor;
    public boolean updateWhenInit;
    public boolean useGeckoXV4;

    public static /* synthetic */ GeckoConfig copy$default(GeckoConfig geckoConfig, String str, String str2, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = geckoConfig.accessKey;
        }
        if ((i & 2) != 0) {
            str2 = geckoConfig.offlineDir;
        }
        if ((i & 4) != 0) {
            z = geckoConfig.isRelativePath;
        }
        if ((i & 8) != 0) {
            z2 = geckoConfig.loopCheck;
        }
        return geckoConfig.copy(str, str2, z, z2);
    }

    public final GeckoConfig copy(String accessKey, String offlineDir, boolean z, boolean z2) {
        o.LJIIJ(accessKey, "accessKey");
        o.LJIIJ(offlineDir, "offlineDir");
        return new GeckoConfig(accessKey, offlineDir, z, z2);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.accessKey, this.offlineDir, Boolean.valueOf(this.isRelativePath), Boolean.valueOf(this.loopCheck)};
    }

    public final String getAccessKey() {
        return this.accessKey;
    }

    public final boolean getAppLogMonitor() {
        return this.appLogMonitor;
    }

    public final String getBusinessVersion() {
        return this.businessVersion;
    }

    public final InterfaceC61252O2e getGeckoDepender() {
        return this.geckoDepender;
    }

    public final String getLocalInfo() {
        return this.localInfo;
    }

    public final boolean getLoopCheck() {
        return this.loopCheck;
    }

    public final Object getNetworkImpl() {
        return this.networkImpl;
    }

    public final String getOfflineDir() {
        return this.offlineDir;
    }

    public final boolean getServerMonitor() {
        return this.serverMonitor;
    }

    public final boolean getUpdateWhenInit() {
        return this.updateWhenInit;
    }

    public final boolean getUseGeckoXV4() {
        return this.useGeckoXV4;
    }

    public final boolean isRelativePath() {
        return this.isRelativePath;
    }

    public final void setAccessKey(String str) {
        o.LJIIJ(str, "<set-?>");
        this.accessKey = str;
    }

    public final void setAppLogMonitor(boolean z) {
        this.appLogMonitor = z;
    }

    public final void setBusinessVersion(String str) {
        this.businessVersion = str;
    }

    public final void setGeckoDepender(InterfaceC61252O2e interfaceC61252O2e) {
        this.geckoDepender = interfaceC61252O2e;
    }

    public final void setLocalInfo(String str) {
        o.LJIIJ(str, "<set-?>");
        this.localInfo = str;
    }

    public final void setLoopCheck(boolean z) {
        this.loopCheck = z;
    }

    public final void setNetworkImpl(Object obj) {
        this.networkImpl = obj;
    }

    public final void setOfflineDir(String str) {
        o.LJIIJ(str, "<set-?>");
        this.offlineDir = str;
    }

    public final void setRelativePath(boolean z) {
        this.isRelativePath = z;
    }

    public final void setServerMonitor(boolean z) {
        this.serverMonitor = z;
    }

    public final void setUpdateWhenInit(boolean z) {
        this.updateWhenInit = z;
    }

    public final void setUseGeckoXV4(boolean z) {
        this.useGeckoXV4 = z;
    }

    public GeckoConfig(String accessKey, String offlineDir, boolean z, boolean z2) {
        o.LJIIJ(accessKey, "accessKey");
        o.LJIIJ(offlineDir, "offlineDir");
        this.accessKey = accessKey;
        this.offlineDir = offlineDir;
        this.isRelativePath = z;
        this.loopCheck = z2;
        this.useGeckoXV4 = true;
        this.serverMonitor = true;
        this.localInfo = "";
        this.geckoDepender = new O2H();
    }

    public /* synthetic */ GeckoConfig(String str, String str2, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? true : z, (i & 8) != 0 ? false : z2);
    }
}
