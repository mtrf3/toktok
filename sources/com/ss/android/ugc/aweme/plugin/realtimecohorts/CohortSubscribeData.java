package com.ss.android.ugc.aweme.plugin.realtimecohorts;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class CohortSubscribeData {

    @InterfaceC65349Pkn("path")
    public final String path;

    @InterfaceC65349Pkn("qs")
    public final String queryString;

    /* JADX WARN: Multi-variable type inference failed */
    public CohortSubscribeData() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CohortSubscribeData)) {
            return false;
        }
        CohortSubscribeData cohortSubscribeData = (CohortSubscribeData) obj;
        return o.LJ(this.path, cohortSubscribeData.path) && o.LJ(this.queryString, cohortSubscribeData.queryString);
    }

    public final int hashCode() {
        String str = this.path;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.queryString;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CohortSubscribeData(path=");
        LIZ.append(this.path);
        LIZ.append(", queryString=");
        return q.LIZIZ(LIZ, this.queryString, ')', LIZ);
    }

    public CohortSubscribeData(String str, String str2) {
        this.path = str;
        this.queryString = str2;
    }

    public /* synthetic */ CohortSubscribeData(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
