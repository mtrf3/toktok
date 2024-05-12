package com.bytedance.pitaya.api.bean;

import X.F9E;
import com.bytedance.pitaya.jniwrapper.ReflectionCall;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class PTYProxySetting extends F9E implements ReflectionCall {
    public boolean applogProxyEnabled;
    public boolean featureStoreProxyEnabled;
    public final boolean provideAppLog;
    public boolean useCustomApplogEvents;
    public String customApplogEvents = "";
    public int maxApplogEventCacheNum = 100;

    public static /* synthetic */ PTYProxySetting copy$default(PTYProxySetting pTYProxySetting, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = pTYProxySetting.provideAppLog;
        }
        return pTYProxySetting.copy(z);
    }

    public final PTYProxySetting copy(boolean z) {
        return new PTYProxySetting(z);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.provideAppLog)};
    }

    public final boolean getApplogProxyEnabled() {
        return this.applogProxyEnabled;
    }

    public final String getCustomApplogEvents() {
        return this.customApplogEvents;
    }

    public final boolean getFeatureStoreProxyEnabled() {
        return this.featureStoreProxyEnabled;
    }

    public final int getMaxApplogEventCacheNum() {
        return this.maxApplogEventCacheNum;
    }

    public final boolean getProvideAppLog() {
        return this.provideAppLog;
    }

    public final boolean getUseCustomApplogEvents() {
        return this.useCustomApplogEvents;
    }

    public PTYProxySetting(boolean z) {
        this.provideAppLog = z;
    }

    public final void setApplogProxyEnabled(boolean z) {
        this.applogProxyEnabled = z;
    }

    public final void setCustomApplogEvents(String str) {
        o.LJIIJ(str, "<set-?>");
        this.customApplogEvents = str;
    }

    public final void setFeatureStoreProxyEnabled(boolean z) {
        this.featureStoreProxyEnabled = z;
    }

    public final void setMaxApplogEventCacheNum(int i) {
        this.maxApplogEventCacheNum = i;
    }

    public final void setUseCustomApplogEvents(boolean z) {
        this.useCustomApplogEvents = z;
    }
}
