package com.ss.android.ugc.aweme.net.settings;

import X.F9E;
import X.InterfaceC65349Pkn;
import X.OQY;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class PayLoadControl extends F9E {

    @InterfaceC65349Pkn("applog_sampling")
    public int appLogSampling;

    @InterfaceC65349Pkn("check_list")
    public Set<String> checkList;

    @InterfaceC65349Pkn("commonlog_sampling")
    public int commonLogSampling;

    @InterfaceC65349Pkn("front_back_count")
    public int count;

    @InterfaceC65349Pkn("enable")
    public boolean enable;

    @InterfaceC65349Pkn("flow_control")
    public int flowControl;

    @InterfaceC65349Pkn("intercept_enable")
    public boolean intercept;

    @InterfaceC65349Pkn("intercept_api_list")
    public final Set<String> interceptApi;

    @InterfaceC65349Pkn("max_size")
    public final long maxSize;

    @InterfaceC65349Pkn("okhttp_sampling")
    public int okHttpSampling;

    @InterfaceC65349Pkn("rule_regex")
    public String ruleRegex;

    @InterfaceC65349Pkn("ttnet_sampling")
    public int ttNetSampling;

    @InterfaceC65349Pkn("urlconnection_sampling")
    public int urlConnectionSampling;

    public PayLoadControl() {
        this(false, false, 0, 0, 0, 0, 0, 0, 0, null, 0L, null, null, 8191, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.enable), Boolean.valueOf(this.intercept), Integer.valueOf(this.ttNetSampling), Integer.valueOf(this.okHttpSampling), Integer.valueOf(this.urlConnectionSampling), Integer.valueOf(this.appLogSampling), Integer.valueOf(this.commonLogSampling), Integer.valueOf(this.count), Integer.valueOf(this.flowControl), this.ruleRegex, Long.valueOf(this.maxSize), this.interceptApi, this.checkList};
    }

    public PayLoadControl(boolean z, boolean z2, int i, int i2, int i3, int i4, int i5, int i6, int i7, String ruleRegex, long j, Set<String> interceptApi, Set<String> checkList) {
        o.LJIIIZ(ruleRegex, "ruleRegex");
        o.LJIIIZ(interceptApi, "interceptApi");
        o.LJIIIZ(checkList, "checkList");
        this.enable = z;
        this.intercept = z2;
        this.ttNetSampling = i;
        this.okHttpSampling = i2;
        this.urlConnectionSampling = i3;
        this.appLogSampling = i4;
        this.commonLogSampling = i5;
        this.count = i6;
        this.flowControl = i7;
        this.ruleRegex = ruleRegex;
        this.maxSize = j;
        this.interceptApi = interceptApi;
        this.checkList = checkList;
    }

    public PayLoadControl(boolean z, boolean z2, int i, int i2, int i3, int i4, int i5, int i6, int i7, String str, long j, Set set, Set set2, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? false : z, (i8 & 2) != 0 ? false : z2, (i8 & 4) != 0 ? 0 : i, (i8 & 8) != 0 ? 0 : i2, (i8 & 16) != 0 ? 0 : i3, (i8 & 32) != 0 ? 0 : i4, (i8 & 64) == 0 ? i5 : 0, (i8 & 128) != 0 ? 6 : i6, (i8 & 256) != 0 ? 2 : i7, (i8 & 512) != 0 ? "" : str, (i8 & 1024) != 0 ? 5242880L : j, (i8 & 2048) != 0 ? OQY.INSTANCE : set, (i8 & 4096) != 0 ? OQY.INSTANCE : set2);
    }
}
