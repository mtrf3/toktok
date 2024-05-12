package com.bytedance.pitaya.api.bean;

import X.F9E;
import com.bytedance.pitaya.jniwrapper.ReflectionCall;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class PTYNativeTaskConfig extends F9E implements ReflectionCall {
    public final String aid;
    public final String appVersion;
    public final String pluginVersion;
    public final PTYNativeService service;

    public static /* synthetic */ PTYNativeTaskConfig copy$default(PTYNativeTaskConfig pTYNativeTaskConfig, PTYNativeService pTYNativeService, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            pTYNativeService = pTYNativeTaskConfig.service;
        }
        if ((i & 2) != 0) {
            str = pTYNativeTaskConfig.aid;
        }
        if ((i & 4) != 0) {
            str2 = pTYNativeTaskConfig.appVersion;
        }
        if ((i & 8) != 0) {
            str3 = pTYNativeTaskConfig.pluginVersion;
        }
        return pTYNativeTaskConfig.copy(pTYNativeService, str, str2, str3);
    }

    public final PTYNativeTaskConfig copy(PTYNativeService service, String aid, String str, String str2) {
        o.LJIIJ(service, "service");
        o.LJIIJ(aid, "aid");
        return new PTYNativeTaskConfig(service, aid, str, str2);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.service, this.aid, this.appVersion, this.pluginVersion};
    }

    public final String getAid() {
        return this.aid;
    }

    public final String getAppVersion() {
        return this.appVersion;
    }

    public final String getPluginVersion() {
        return this.pluginVersion;
    }

    public final PTYNativeService getService() {
        return this.service;
    }

    public PTYNativeTaskConfig(PTYNativeService service, String aid, String str, String str2) {
        o.LJIIJ(service, "service");
        o.LJIIJ(aid, "aid");
        this.service = service;
        this.aid = aid;
        this.appVersion = str;
        this.pluginVersion = str2;
    }

    public /* synthetic */ PTYNativeTaskConfig(PTYNativeService pTYNativeService, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(pTYNativeService, str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
    }
}
