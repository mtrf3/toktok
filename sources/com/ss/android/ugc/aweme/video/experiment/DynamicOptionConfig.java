package com.ss.android.ugc.aweme.video.experiment;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class DynamicOptionConfig {

    @InterfaceC65349Pkn("dynamic_option_keys")
    public final List<DynamicOptionModel> dynamicOptionModelList;

    /* JADX WARN: Multi-variable type inference failed */
    public DynamicOptionConfig() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DynamicOptionConfig) && o.LJ(this.dynamicOptionModelList, ((DynamicOptionConfig) obj).dynamicOptionModelList);
    }

    public final int hashCode() {
        List<DynamicOptionModel> list = this.dynamicOptionModelList;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DynamicOptionConfig(dynamicOptionModelList=");
        return C1NE.LIZIZ(LIZ, this.dynamicOptionModelList, ')', LIZ);
    }

    public DynamicOptionConfig(List<DynamicOptionModel> list) {
        this.dynamicOptionModelList = list;
    }

    public /* synthetic */ DynamicOptionConfig(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }
}
