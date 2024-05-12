package com.ss.android.ugc.aweme.image.experiment;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class PhotoModePerformanceOptiData {

    @InterfaceC65349Pkn("delayLoading")
    public final boolean delayLoading;

    @InterfaceC65349Pkn("enableFirstImageDecode")
    public final boolean enableFirstImageDecode;

    @InterfaceC65349Pkn("enablePreCopyFile")
    public final boolean enablePreCopyFile;

    @InterfaceC65349Pkn("enableRgba")
    public final boolean enableRgba;

    @InterfaceC65349Pkn("enableVEImageCacheManager")
    public final boolean enableVEImageCacheManager;

    @InterfaceC65349Pkn("enableVEOptPreDecodeDir")
    public final boolean enableVEOptPreDecodeDir;

    @InterfaceC65349Pkn("enableVEPreDecode")
    public final boolean enableVEPreDecode;

    @InterfaceC65349Pkn("maxImageSideMultiples")
    public final int maxImageSideMultiples;

    @InterfaceC65349Pkn("veCacheType0")
    public final int veCacheType0;

    @InterfaceC65349Pkn("veCacheType1")
    public final int veCacheType1;

    @InterfaceC65349Pkn("veLeftCacheLen")
    public final int veLeftCacheLen;

    @InterfaceC65349Pkn("veRightCacheLen")
    public final int veRightCacheLen;

    /* JADX WARN: Multi-variable type inference failed */
    public PhotoModePerformanceOptiData() {
        this(false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 4095, null);
    }

    public final boolean getDelayLoading() {
        return this.delayLoading;
    }

    public final boolean getEnableFirstImageDecode() {
        return this.enableFirstImageDecode;
    }

    public final boolean getEnablePreCopyFile() {
        return this.enablePreCopyFile;
    }

    public final boolean getEnableRgba() {
        return this.enableRgba;
    }

    public final boolean getEnableVEImageCacheManager() {
        return this.enableVEImageCacheManager;
    }

    public final boolean getEnableVEOptPreDecodeDir() {
        return this.enableVEOptPreDecodeDir;
    }

    public final boolean getEnableVEPreDecode() {
        return this.enableVEPreDecode;
    }

    public final int getMaxImageSideMultiples() {
        return this.maxImageSideMultiples;
    }

    public final int getVeCacheType0() {
        return this.veCacheType0;
    }

    public final int getVeCacheType1() {
        return this.veCacheType1;
    }

    public final int getVeLeftCacheLen() {
        return this.veLeftCacheLen;
    }

    public final int getVeRightCacheLen() {
        return this.veRightCacheLen;
    }

    public PhotoModePerformanceOptiData(boolean z, boolean z2, int i, int i2, int i3, int i4, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i5) {
        this.enableVEPreDecode = z;
        this.enableVEOptPreDecodeDir = z2;
        this.veLeftCacheLen = i;
        this.veRightCacheLen = i2;
        this.veCacheType0 = i3;
        this.veCacheType1 = i4;
        this.enableVEImageCacheManager = z3;
        this.delayLoading = z4;
        this.enableRgba = z5;
        this.enableFirstImageDecode = z6;
        this.enablePreCopyFile = z7;
        this.maxImageSideMultiples = i5;
    }

    public /* synthetic */ PhotoModePerformanceOptiData(boolean z, boolean z2, int i, int i2, int i3, int i4, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? false : z, (i6 & 2) != 0 ? false : z2, (i6 & 4) != 0 ? 0 : i, (i6 & 8) != 0 ? 0 : i2, (i6 & 16) != 0 ? 1 : i3, (i6 & 32) != 0 ? 3 : i4, (i6 & 64) != 0 ? false : z3, (i6 & 128) != 0 ? false : z4, (i6 & 256) != 0 ? false : z5, (i6 & 512) != 0 ? false : z6, (i6 & 1024) == 0 ? z7 : false, (i6 & 2048) == 0 ? i5 : 3);
    }
}
