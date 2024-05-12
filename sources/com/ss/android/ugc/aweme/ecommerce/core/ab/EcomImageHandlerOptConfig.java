package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C1NE;
import X.C61878OQg;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class EcomImageHandlerOptConfig {

    @InterfaceC65349Pkn("enable")
    public final boolean enable;

    @InterfaceC65349Pkn("optimize")
    public final boolean optimize;

    @InterfaceC65349Pkn("pages")
    public final List<String> pages;

    @InterfaceC65349Pkn("scenes")
    public final List<String> scenes;

    public EcomImageHandlerOptConfig() {
        this(false, false, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EcomImageHandlerOptConfig copy$default(EcomImageHandlerOptConfig ecomImageHandlerOptConfig, boolean z, boolean z2, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = ecomImageHandlerOptConfig.enable;
        }
        if ((i & 2) != 0) {
            z2 = ecomImageHandlerOptConfig.optimize;
        }
        if ((i & 4) != 0) {
            list = ecomImageHandlerOptConfig.scenes;
        }
        if ((i & 8) != 0) {
            list2 = ecomImageHandlerOptConfig.pages;
        }
        return ecomImageHandlerOptConfig.copy(z, z2, list, list2);
    }

    public final EcomImageHandlerOptConfig copy(boolean z, boolean z2, List<String> list, List<String> pages) {
        o.LJIIIZ(pages, "pages");
        return new EcomImageHandlerOptConfig(z, z2, list, pages);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EcomImageHandlerOptConfig)) {
            return false;
        }
        EcomImageHandlerOptConfig ecomImageHandlerOptConfig = (EcomImageHandlerOptConfig) obj;
        return this.enable == ecomImageHandlerOptConfig.enable && this.optimize == ecomImageHandlerOptConfig.optimize && o.LJ(this.scenes, ecomImageHandlerOptConfig.scenes) && o.LJ(this.pages, ecomImageHandlerOptConfig.pages);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    public int hashCode() {
        boolean z = this.enable;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = ((r0 * 31) + (this.optimize ? 1 : 0)) * 31;
        List<String> list = this.scenes;
        return this.pages.hashCode() + ((i + (list == null ? 0 : list.hashCode())) * 31);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EcomImageHandlerOptConfig(enable=");
        LIZ.append(this.enable);
        LIZ.append(", optimize=");
        LIZ.append(this.optimize);
        LIZ.append(", scenes=");
        LIZ.append(this.scenes);
        LIZ.append(", pages=");
        return C1NE.LIZIZ(LIZ, this.pages, ')', LIZ);
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final boolean getOptimize() {
        return this.optimize;
    }

    public final List<String> getPages() {
        return this.pages;
    }

    public final List<String> getScenes() {
        return this.scenes;
    }

    public EcomImageHandlerOptConfig(boolean z, boolean z2, List<String> list, List<String> pages) {
        o.LJIIIZ(pages, "pages");
        this.enable = z;
        this.optimize = z2;
        this.scenes = list;
        this.pages = pages;
    }

    public EcomImageHandlerOptConfig(boolean z, boolean z2, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? null : list, (i & 8) != 0 ? C61878OQg.INSTANCE : list2);
    }
}
