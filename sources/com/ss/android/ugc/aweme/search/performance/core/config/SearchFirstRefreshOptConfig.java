package com.ss.android.ugc.aweme.search.performance.core.config;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class SearchFirstRefreshOptConfig extends F9E {

    @InterfaceC65349Pkn("await_optimize")
    public final boolean enableAwaitOptimize;

    @InterfaceC65349Pkn("chunk_method_optimize")
    public final boolean enableChunkMethodOptimize;

    @InterfaceC65349Pkn("forecast_optimize")
    public final boolean enableForecastOptimize;

    @InterfaceC65349Pkn("jato_optimize")
    public final boolean enableJatoOptimize;

    @InterfaceC65349Pkn("pre_request_optimize")
    public final boolean enablePreRequestNotFirst;

    @InterfaceC65349Pkn("research_item_pre_create")
    public final boolean enableResearchItemPreCreate;

    @InterfaceC65349Pkn("update_aweme_optimize")
    public final boolean enableUpdateAwemeOptimize;

    @InterfaceC65349Pkn("video_layout_pre_inflate")
    public final boolean enableVideoLayoutPreInflate;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SearchFirstRefreshOptConfig() {
        /*
            r11 = this;
            r1 = 0
            r9 = 255(0xff, float:3.57E-43)
            r10 = 0
            r0 = r11
            r2 = r1
            r3 = r1
            r4 = r1
            r5 = r1
            r6 = r1
            r7 = r1
            r8 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.performance.core.config.SearchFirstRefreshOptConfig.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.enableVideoLayoutPreInflate), Boolean.valueOf(this.enableResearchItemPreCreate), Boolean.valueOf(this.enableChunkMethodOptimize), Boolean.valueOf(this.enableUpdateAwemeOptimize), Boolean.valueOf(this.enableJatoOptimize), Boolean.valueOf(this.enablePreRequestNotFirst), Boolean.valueOf(this.enableAwaitOptimize), Boolean.valueOf(this.enableForecastOptimize)};
    }

    public SearchFirstRefreshOptConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        this.enableVideoLayoutPreInflate = z;
        this.enableResearchItemPreCreate = z2;
        this.enableChunkMethodOptimize = z3;
        this.enableUpdateAwemeOptimize = z4;
        this.enableJatoOptimize = z5;
        this.enablePreRequestNotFirst = z6;
        this.enableAwaitOptimize = z7;
        this.enableForecastOptimize = z8;
    }

    public /* synthetic */ SearchFirstRefreshOptConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4, (i & 16) != 0 ? false : z5, (i & 32) != 0 ? false : z6, (i & 64) != 0 ? false : z7, (i & 128) == 0 ? z8 : false);
    }
}
