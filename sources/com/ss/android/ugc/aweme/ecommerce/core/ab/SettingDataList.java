package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class SettingDataList {

    @InterfaceC65349Pkn("list")
    public final List<SettingModel> list;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SettingDataList) && o.LJ(this.list, ((SettingDataList) obj).list);
    }

    public final int hashCode() {
        List<SettingModel> list = this.list;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SettingDataList(list=");
        return C1NE.LIZIZ(LIZ, this.list, ')', LIZ);
    }

    public SettingDataList(List<SettingModel> list) {
        this.list = list;
    }
}
