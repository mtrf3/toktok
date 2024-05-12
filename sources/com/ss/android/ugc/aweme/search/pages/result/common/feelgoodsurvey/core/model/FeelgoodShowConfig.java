package com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.core.model;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class FeelgoodShowConfig implements Serializable {

    @InterfaceC65349Pkn("pageConfig")
    public final List<FeelgoodPageConfig> pageConfig;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FeelgoodShowConfig copy$default(FeelgoodShowConfig feelgoodShowConfig, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = feelgoodShowConfig.pageConfig;
        }
        return feelgoodShowConfig.copy(list);
    }

    public final FeelgoodShowConfig copy(List<FeelgoodPageConfig> list) {
        return new FeelgoodShowConfig(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FeelgoodShowConfig) && o.LJ(this.pageConfig, ((FeelgoodShowConfig) obj).pageConfig);
    }

    public int hashCode() {
        List<FeelgoodPageConfig> list = this.pageConfig;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FeelgoodShowConfig(pageConfig=");
        return C1NE.LIZIZ(LIZ, this.pageConfig, ')', LIZ);
    }

    public final List<FeelgoodPageConfig> getPageConfig() {
        return this.pageConfig;
    }

    public FeelgoodShowConfig(List<FeelgoodPageConfig> list) {
        this.pageConfig = list;
    }
}
