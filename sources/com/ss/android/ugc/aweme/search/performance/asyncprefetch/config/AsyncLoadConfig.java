package com.ss.android.ugc.aweme.search.performance.asyncprefetch.config;

import X.C16880lQ;
import X.HXX;
import X.InterfaceC65349Pkn;
import X.JBR;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class AsyncLoadConfig {

    @InterfaceC65349Pkn("pre_async_bind_whitelist")
    public final Set<Integer> bindWhitelist;

    @InterfaceC65349Pkn("pre_async_create_whitelist")
    public final Set<Integer> createWhitelist;

    @InterfaceC65349Pkn("async_bind")
    public final boolean enableAsyncBind;

    @InterfaceC65349Pkn("async_create")
    public final boolean enableAsyncCreate;

    @InterfaceC65349Pkn("enable_debug_info")
    public final boolean enableDebugInfo;

    @InterfaceC65349Pkn("enable_post_value")
    public final boolean enablePostValue;

    @InterfaceC65349Pkn("enable_preload_after_first")
    public final boolean enablePreloadAfterFirst;

    @InterfaceC65349Pkn("enable_scroll_pre_bind")
    public final boolean enableScrollAsyncBind;

    @InterfaceC65349Pkn("pre_lynx_type_whitelist")
    public final Set<String> lynxWhitelist;

    @InterfaceC65349Pkn("open_origin_prefetch")
    public final boolean openPrefetch;

    @InterfaceC65349Pkn("pre_load_count")
    public final int preloadCount;

    @InterfaceC65349Pkn("pre_scroll_distance")
    public final int scrollDistanceToPreLoad;

    @InterfaceC65349Pkn("strategy_version")
    public final long strategyVersion;

    @InterfaceC65349Pkn("async_time_out")
    public final long timeOut;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AsyncLoadConfig() {
        /*
            r19 = this;
            r1 = 0
            r8 = 0
            r11 = 0
            r17 = 16383(0x3fff, float:2.2957E-41)
            r0 = r19
            r2 = r1
            r3 = r1
            r4 = r1
            r5 = r1
            r6 = r1
            r7 = r1
            r9 = r8
            r10 = r8
            r13 = r1
            r14 = r1
            r15 = r11
            r18 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r13, r14, r15, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.performance.asyncprefetch.config.AsyncLoadConfig.<init>():void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AsyncLoadConfig)) {
            return false;
        }
        AsyncLoadConfig asyncLoadConfig = (AsyncLoadConfig) obj;
        return this.enableAsyncCreate == asyncLoadConfig.enableAsyncCreate && this.enableAsyncBind == asyncLoadConfig.enableAsyncBind && this.enableDebugInfo == asyncLoadConfig.enableDebugInfo && this.enableScrollAsyncBind == asyncLoadConfig.enableScrollAsyncBind && this.enablePostValue == asyncLoadConfig.enablePostValue && this.enablePreloadAfterFirst == asyncLoadConfig.enablePreloadAfterFirst && this.openPrefetch == asyncLoadConfig.openPrefetch && o.LJ(this.createWhitelist, asyncLoadConfig.createWhitelist) && o.LJ(this.bindWhitelist, asyncLoadConfig.bindWhitelist) && o.LJ(this.lynxWhitelist, asyncLoadConfig.lynxWhitelist) && this.timeOut == asyncLoadConfig.timeOut && this.scrollDistanceToPreLoad == asyncLoadConfig.scrollDistanceToPreLoad && this.preloadCount == asyncLoadConfig.preloadCount && this.strategyVersion == asyncLoadConfig.strategyVersion;
    }

    public final String toString() {
        return "AsyncLoadConfig(enableAsyncCreate=" + this.enableAsyncCreate + ", enableAsyncBind=" + this.enableAsyncBind + ", enableDebugInfo=" + this.enableDebugInfo + ", enableScrollAsyncBind=" + this.enableScrollAsyncBind + ", enablePostValue=" + this.enablePostValue + ", enablePreloadAfterFirst=" + this.enablePreloadAfterFirst + ", openPrefetch=" + this.openPrefetch + ", createWhitelist=" + this.createWhitelist + ", bindWhitelist=" + this.bindWhitelist + ", lynxWhitelist=" + this.lynxWhitelist + ", timeOut=" + this.timeOut + ", scrollDistanceToPreLoad=" + this.scrollDistanceToPreLoad + ", preloadCount=" + this.preloadCount + ", strategyVersion=" + this.strategyVersion + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    public final int hashCode() {
        int hashCode;
        boolean z = this.enableAsyncCreate;
        int i = 1;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i2 = r0 * 31;
        ?? r02 = this.enableAsyncBind;
        int i3 = r02;
        if (r02 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        ?? r03 = this.enableDebugInfo;
        int i5 = r03;
        if (r03 != 0) {
            i5 = 1;
        }
        int i6 = (i4 + i5) * 31;
        ?? r04 = this.enableScrollAsyncBind;
        int i7 = r04;
        if (r04 != 0) {
            i7 = 1;
        }
        int i8 = (i6 + i7) * 31;
        ?? r05 = this.enablePostValue;
        int i9 = r05;
        if (r05 != 0) {
            i9 = 1;
        }
        int i10 = (i8 + i9) * 31;
        ?? r06 = this.enablePreloadAfterFirst;
        int i11 = r06;
        if (r06 != 0) {
            i11 = 1;
        }
        int i12 = (i10 + i11) * 31;
        if (!this.openPrefetch) {
            i = 0;
        }
        int i13 = (i12 + i) * 31;
        Set<Integer> set = this.createWhitelist;
        int i14 = 0;
        if (set == null) {
            hashCode = 0;
        } else {
            hashCode = set.hashCode();
        }
        int i15 = (i13 + hashCode) * 31;
        Set<Integer> set2 = this.bindWhitelist;
        if (set2 != null) {
            i14 = set2.hashCode();
        }
        return C16880lQ.LLJIJIL(this.strategyVersion) + ((((JBR.LIZJ(this.timeOut, HXX.LIZ(this.lynxWhitelist, (i15 + i14) * 31, 31), 31) + this.scrollDistanceToPreLoad) * 31) + this.preloadCount) * 31);
    }

    public AsyncLoadConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, Set<Integer> set, Set<Integer> set2, Set<String> lynxWhitelist, long j, int i, int i2, long j2) {
        o.LJIIIZ(lynxWhitelist, "lynxWhitelist");
        this.enableAsyncCreate = z;
        this.enableAsyncBind = z2;
        this.enableDebugInfo = z3;
        this.enableScrollAsyncBind = z4;
        this.enablePostValue = z5;
        this.enablePreloadAfterFirst = z6;
        this.openPrefetch = z7;
        this.createWhitelist = set;
        this.bindWhitelist = set2;
        this.lynxWhitelist = lynxWhitelist;
        this.timeOut = j;
        this.scrollDistanceToPreLoad = i;
        this.preloadCount = i2;
        this.strategyVersion = j2;
    }

    public /* synthetic */ AsyncLoadConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, Set set, Set set2, Set set3, long j, int i, int i2, long j2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? false : z2, (i3 & 4) != 0 ? false : z3, (i3 & 8) != 0 ? false : z4, (i3 & 16) != 0 ? false : z5, (i3 & 32) == 0 ? z6 : false, (i3 & 64) != 0 ? true : z7, (i3 & 128) != 0 ? null : set, (i3 & 256) == 0 ? set2 : null, (i3 & 512) != 0 ? new HashSet() : set3, (i3 & 1024) != 0 ? 50L : j, (i3 & 2048) != 0 ? 20 : i, (i3 & 4096) != 0 ? 2 : i2, (i3 & FileUtils.BUFFER_SIZE) != 0 ? 0L : j2);
    }
}
