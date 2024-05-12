package com.ss.android.ugc.aweme.setting.performance;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class CameraPureColorFakeFrameConfig {

    @InterfaceC65349Pkn("enable")
    public final boolean enable;

    @InterfaceC65349Pkn("token_list")
    public final List<String> excludedList;

    /* JADX WARN: Multi-variable type inference failed */
    public CameraPureColorFakeFrameConfig() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraPureColorFakeFrameConfig)) {
            return false;
        }
        CameraPureColorFakeFrameConfig cameraPureColorFakeFrameConfig = (CameraPureColorFakeFrameConfig) obj;
        return this.enable == cameraPureColorFakeFrameConfig.enable && o.LJ(this.excludedList, cameraPureColorFakeFrameConfig.excludedList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public final int hashCode() {
        boolean z = this.enable;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        List<String> list = this.excludedList;
        return i + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CameraPureColorFakeFrameConfig(enable=");
        LIZ.append(this.enable);
        LIZ.append(", excludedList=");
        return C1NE.LIZIZ(LIZ, this.excludedList, ')', LIZ);
    }

    public CameraPureColorFakeFrameConfig(boolean z, List<String> list) {
        this.enable = z;
        this.excludedList = list;
    }

    public /* synthetic */ CameraPureColorFakeFrameConfig(boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : list);
    }
}
