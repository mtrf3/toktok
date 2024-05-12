package com.ss.android.ugc.aweme.setting.performance.videoquality;

import X.C1NE;
import X.C61878OQg;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class StickerPreviewResolutionConfig {

    @InterfaceC65349Pkn("block_category")
    public final List<String> blockCategories;

    @InterfaceC65349Pkn("block_effect")
    public final List<String> blockEffects;

    @InterfaceC65349Pkn("disable_downgrade_by_ppi")
    public final boolean disableDowngradeByPPI;

    @InterfaceC65349Pkn("enable")
    public final boolean enable;

    @InterfaceC65349Pkn("enable_downgrade_with_multi_segments")
    public final boolean enableDowngradeMultiSegments;

    @InterfaceC65349Pkn("resolution")
    public final List<String> resolution;

    public StickerPreviewResolutionConfig() {
        this(false, false, false, null, null, null, 63, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickerPreviewResolutionConfig)) {
            return false;
        }
        StickerPreviewResolutionConfig stickerPreviewResolutionConfig = (StickerPreviewResolutionConfig) obj;
        return this.enable == stickerPreviewResolutionConfig.enable && this.enableDowngradeMultiSegments == stickerPreviewResolutionConfig.enableDowngradeMultiSegments && this.disableDowngradeByPPI == stickerPreviewResolutionConfig.disableDowngradeByPPI && o.LJ(this.resolution, stickerPreviewResolutionConfig.resolution) && o.LJ(this.blockCategories, stickerPreviewResolutionConfig.blockCategories) && o.LJ(this.blockEffects, stickerPreviewResolutionConfig.blockEffects);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean] */
    public final int hashCode() {
        boolean z = this.enable;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        ?? r02 = this.enableDowngradeMultiSegments;
        int i2 = r02;
        if (r02 != 0) {
            i2 = 1;
        }
        int i3 = (((i + i2) * 31) + (this.disableDowngradeByPPI ? 1 : 0)) * 31;
        List<String> list = this.resolution;
        int hashCode = (i3 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.blockCategories;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.blockEffects;
        return hashCode2 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StickerPreviewResolutionConfig(enable=");
        LIZ.append(this.enable);
        LIZ.append(", enableDowngradeMultiSegments=");
        LIZ.append(this.enableDowngradeMultiSegments);
        LIZ.append(", disableDowngradeByPPI=");
        LIZ.append(this.disableDowngradeByPPI);
        LIZ.append(", resolution=");
        LIZ.append(this.resolution);
        LIZ.append(", blockCategories=");
        LIZ.append(this.blockCategories);
        LIZ.append(", blockEffects=");
        return C1NE.LIZIZ(LIZ, this.blockEffects, ')', LIZ);
    }

    public StickerPreviewResolutionConfig(boolean z, boolean z2, boolean z3, List<String> list, List<String> list2, List<String> list3) {
        this.enable = z;
        this.enableDowngradeMultiSegments = z2;
        this.disableDowngradeByPPI = z3;
        this.resolution = list;
        this.blockCategories = list2;
        this.blockEffects = list3;
    }

    public StickerPreviewResolutionConfig(boolean z, boolean z2, boolean z3, List list, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) == 0 ? z3 : false, (i & 8) != 0 ? null : list, (i & 16) != 0 ? C61878OQg.INSTANCE : list2, (i & 32) != 0 ? C61878OQg.INSTANCE : list3);
    }
}
