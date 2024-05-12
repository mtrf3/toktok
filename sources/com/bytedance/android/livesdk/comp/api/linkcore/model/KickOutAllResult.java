package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.C1NE;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class KickOutAllResult {
    public final List<Long> removeUidList;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ KickOutAllResult copy$default(KickOutAllResult kickOutAllResult, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = kickOutAllResult.removeUidList;
        }
        return kickOutAllResult.copy(list);
    }

    public final List<Long> component1() {
        return this.removeUidList;
    }

    public final KickOutAllResult copy(List<Long> list) {
        return new KickOutAllResult(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof KickOutAllResult) && o.LJ(this.removeUidList, ((KickOutAllResult) obj).removeUidList);
    }

    public int hashCode() {
        List<Long> list = this.removeUidList;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("KickOutAllResult(removeUidList=");
        return C1NE.LIZIZ(LIZ, this.removeUidList, ')', LIZ);
    }

    public KickOutAllResult(List<Long> list) {
        this.removeUidList = list;
    }
}
