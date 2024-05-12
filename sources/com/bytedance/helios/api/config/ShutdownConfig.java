package com.bytedance.helios.api.config;

import X.C61878OQg;
import X.F9E;
import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class ShutdownConfig extends F9E {

    @InterfaceC65349Pkn("auto_replace_http")
    public final boolean autoReplaceHttp;

    @InterfaceC65349Pkn("enable_domain_cache")
    public final boolean enableDomainCache;

    @InterfaceC65349Pkn("fuse_configs")
    public final List<FuseConfig> fuseConfigs;

    @InterfaceC65349Pkn("fuse_upload_sample_rate")
    public final double fuseUploadSampleRate;

    @InterfaceC65349Pkn("modify_configs")
    public final List<ModifyConfig> modifyConfigs;

    @InterfaceC65349Pkn("modify_upload_sample_rate")
    public final double modifyUploadSampleRate;

    @InterfaceC65349Pkn("native_allow_list_action")
    public final String nativeAllowListAction;

    @InterfaceC65349Pkn("one_party_domains")
    public final Set<String> onePartyDomains;

    @InterfaceC65349Pkn("third_party_domains")
    public final Set<String> thirdPartyDomains;

    @InterfaceC65349Pkn("url_replace")
    public final boolean urlReplace;

    @InterfaceC65349Pkn("webview_allow_list_action")
    public final String webviewAllowListAction;

    public ShutdownConfig() {
        this(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, null, null, null, null, null, null, false, false, false, 2047, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Double.valueOf(this.fuseUploadSampleRate), Double.valueOf(this.modifyUploadSampleRate), this.fuseConfigs, this.modifyConfigs, this.nativeAllowListAction, this.webviewAllowListAction, this.onePartyDomains, this.thirdPartyDomains, Boolean.valueOf(this.autoReplaceHttp), Boolean.valueOf(this.enableDomainCache), Boolean.valueOf(this.urlReplace)};
    }

    public ShutdownConfig(double d, double d2, List<FuseConfig> fuseConfigs, List<ModifyConfig> modifyConfigs, String nativeAllowListAction, String webviewAllowListAction, Set<String> onePartyDomains, Set<String> thirdPartyDomains, boolean z, boolean z2, boolean z3) {
        o.LJIIIZ(fuseConfigs, "fuseConfigs");
        o.LJIIIZ(modifyConfigs, "modifyConfigs");
        o.LJIIIZ(nativeAllowListAction, "nativeAllowListAction");
        o.LJIIIZ(webviewAllowListAction, "webviewAllowListAction");
        o.LJIIIZ(onePartyDomains, "onePartyDomains");
        o.LJIIIZ(thirdPartyDomains, "thirdPartyDomains");
        this.fuseUploadSampleRate = d;
        this.modifyUploadSampleRate = d2;
        this.fuseConfigs = fuseConfigs;
        this.modifyConfigs = modifyConfigs;
        this.nativeAllowListAction = nativeAllowListAction;
        this.webviewAllowListAction = webviewAllowListAction;
        this.onePartyDomains = onePartyDomains;
        this.thirdPartyDomains = thirdPartyDomains;
        this.autoReplaceHttp = z;
        this.enableDomainCache = z2;
        this.urlReplace = z3;
    }

    public ShutdownConfig(double d, double d2, List list, List list2, String str, String str2, Set set, Set set2, boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 1.0d : d, (i & 2) == 0 ? d2 : 1.0d, (i & 4) != 0 ? new ArrayList() : list, (i & 8) != 0 ? C61878OQg.INSTANCE : list2, (i & 16) != 0 ? "unable" : str, (i & 32) == 0 ? str2 : "unable", (i & 64) != 0 ? new LinkedHashSet() : set, (i & 128) != 0 ? new LinkedHashSet() : set2, (i & 256) != 0 ? false : z, (i & 512) != 0 ? false : z2, (i & 1024) == 0 ? z3 : false);
    }
}
