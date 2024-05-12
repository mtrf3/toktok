package com.ss.android.ugc.aweme.ad.settings;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public final class AdLandPageOptimizationModel {

    @InterfaceC65349Pkn("enable_cache_channel_path")
    public final boolean enableCacheChannelPath;

    @InterfaceC65349Pkn("enable_parse_manifest_on_null")
    public final boolean enableParseManifest;

    @InterfaceC65349Pkn("enable_prefetch_resource")
    public final boolean enablePrefetchResource;

    @InterfaceC65349Pkn("remove_sync_block")
    public final boolean enableRemoveSyncBlock;

    @InterfaceC65349Pkn("enable_remove_useless_interceptor")
    public final boolean enableRemoveUselessInterceptor;

    @InterfaceC65349Pkn("enable_resource_to_mem")
    public final boolean enableResourceToMem;

    @InterfaceC65349Pkn("enable_stop_loading_url")
    public final boolean enableStopLoading;

    @InterfaceC65349Pkn("enable_use_url_md5_map")
    public final boolean enableUseMd5UrlMap;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AdLandPageOptimizationModel() {
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ad.settings.AdLandPageOptimizationModel.<init>():void");
    }

    public AdLandPageOptimizationModel(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        this.enableCacheChannelPath = z;
        this.enableParseManifest = z2;
        this.enablePrefetchResource = z3;
        this.enableUseMd5UrlMap = z4;
        this.enableStopLoading = z5;
        this.enableResourceToMem = z6;
        this.enableRemoveSyncBlock = z7;
        this.enableRemoveUselessInterceptor = z8;
    }

    public /* synthetic */ AdLandPageOptimizationModel(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4, (i & 16) != 0 ? true : z5, (i & 32) != 0 ? false : z6, (i & 64) != 0 ? false : z7, (i & 128) == 0 ? z8 : false);
    }
}
