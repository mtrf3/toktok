package com.bytedance.android.livesdk.livesetting.watchlive;

import X.InterfaceC65349Pkn;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveQuizContainerOpt {

    @InterfaceC65349Pkn("downgrade")
    public boolean downgrade;

    @InterfaceC65349Pkn("ignore_failed_preload")
    public boolean ignoreFailedPreload;

    @InterfaceC65349Pkn("preload_allow_list")
    public List<String> preloadAllowList;

    @InterfaceC65349Pkn("preload_schema")
    public String preloadSchema;

    @InterfaceC65349Pkn("reuse_allow_list")
    public List<String> reuseAllowList;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public LiveQuizContainerOpt() {
        /*
            r8 = this;
            r1 = 0
            r2 = 0
            r6 = 31
            r0 = r8
            r3 = r2
            r4 = r2
            r5 = r1
            r7 = r2
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.livesetting.watchlive.LiveQuizContainerOpt.<init>():void");
    }

    public LiveQuizContainerOpt(boolean z, String str, List<String> reuseAllowList, List<String> preloadAllowList, boolean z2) {
        o.LJIIIZ(reuseAllowList, "reuseAllowList");
        o.LJIIIZ(preloadAllowList, "preloadAllowList");
        this.downgrade = z;
        this.preloadSchema = str;
        this.reuseAllowList = reuseAllowList;
        this.preloadAllowList = preloadAllowList;
        this.ignoreFailedPreload = z2;
    }

    public /* synthetic */ LiveQuizContainerOpt(boolean z, String str, List list, List list2, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? new ArrayList() : list, (i & 8) != 0 ? new ArrayList() : list2, (i & 16) != 0 ? true : z2);
    }
}
