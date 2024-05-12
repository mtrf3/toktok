package com.ss.android.ugc.aweme.experiment;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ApplogDegradeABData {

    @InterfaceC65349Pkn("ttk_applog_downgrade_list")
    public final List<ApplogDegradeInfoList> degradeInfoList;

    @InterfaceC65349Pkn("ttk_applog_downgrade_total_switch")
    public final boolean enable;

    /* JADX WARN: Multi-variable type inference failed */
    public ApplogDegradeABData() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ApplogDegradeABData copy$default(ApplogDegradeABData applogDegradeABData, boolean z, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            z = applogDegradeABData.enable;
        }
        if ((i & 2) != 0) {
            list = applogDegradeABData.degradeInfoList;
        }
        return applogDegradeABData.copy(z, list);
    }

    public final ApplogDegradeABData copy(boolean z, List<ApplogDegradeInfoList> list) {
        return new ApplogDegradeABData(z, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApplogDegradeABData)) {
            return false;
        }
        ApplogDegradeABData applogDegradeABData = (ApplogDegradeABData) obj;
        return this.enable == applogDegradeABData.enable && o.LJ(this.degradeInfoList, applogDegradeABData.degradeInfoList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public int hashCode() {
        boolean z = this.enable;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        List<ApplogDegradeInfoList> list = this.degradeInfoList;
        return i + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ApplogDegradeABData(enable=");
        LIZ.append(this.enable);
        LIZ.append(", degradeInfoList=");
        return C1NE.LIZIZ(LIZ, this.degradeInfoList, ')', LIZ);
    }

    public final List<ApplogDegradeInfoList> getDegradeInfoList() {
        return this.degradeInfoList;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public ApplogDegradeABData(boolean z, List<ApplogDegradeInfoList> list) {
        this.enable = z;
        this.degradeInfoList = list;
    }

    public /* synthetic */ ApplogDegradeABData(boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : list);
    }
}
