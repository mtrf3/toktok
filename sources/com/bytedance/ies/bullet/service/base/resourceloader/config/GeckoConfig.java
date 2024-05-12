package com.bytedance.ies.bullet.service.base.resourceloader.config;

import X.O1Z;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class GeckoConfig {
    public String accessKey;
    public boolean appLogMonitor;
    public String businessVersion;
    public boolean isRelativePath;
    public O1Z loaderDepender;
    public String localInfo;
    public boolean loopCheck;
    public Object networkImpl;
    public String offlineDir;
    public boolean serverMonitor;
    public boolean updateWhenInit;
    public boolean useGeckoXV4;

    public final String getAccessKey() {
        return this.accessKey;
    }

    public final boolean getAppLogMonitor() {
        return this.appLogMonitor;
    }

    public final String getBusinessVersion() {
        return this.businessVersion;
    }

    public final O1Z getLoaderDepender() {
        return this.loaderDepender;
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

    public final void setLoaderDepender(O1Z o1z) {
        o.LJIIJ(o1z, "<set-?>");
        this.loaderDepender = o1z;
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

    public GeckoConfig(String accessKey, String offlineDir, O1Z loaderDepender, boolean z, boolean z2) {
        o.LJIIJ(accessKey, "accessKey");
        o.LJIIJ(offlineDir, "offlineDir");
        o.LJIIJ(loaderDepender, "loaderDepender");
        this.accessKey = accessKey;
        this.offlineDir = offlineDir;
        this.loaderDepender = loaderDepender;
        this.isRelativePath = z;
        this.loopCheck = z2;
        this.useGeckoXV4 = true;
        this.serverMonitor = true;
        this.localInfo = "";
    }

    public /* synthetic */ GeckoConfig(String str, String str2, O1Z o1z, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, o1z, (i & 8) != 0 ? true : z, (i & 16) != 0 ? false : z2);
    }
}
