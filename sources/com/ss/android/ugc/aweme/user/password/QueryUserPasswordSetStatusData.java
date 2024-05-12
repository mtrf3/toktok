package com.ss.android.ugc.aweme.user.password;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.b0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class QueryUserPasswordSetStatusData {

    @InterfaceC65349Pkn("description")
    public final String description;

    @InterfaceC65349Pkn("error_code")
    public int errorCode;

    @InterfaceC65349Pkn("has_set")
    public final Boolean hasSet;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QueryUserPasswordSetStatusData)) {
            return false;
        }
        QueryUserPasswordSetStatusData queryUserPasswordSetStatusData = (QueryUserPasswordSetStatusData) obj;
        return o.LJ(this.hasSet, queryUserPasswordSetStatusData.hasSet) && o.LJ(this.description, queryUserPasswordSetStatusData.description) && this.errorCode == queryUserPasswordSetStatusData.errorCode;
    }

    public final int hashCode() {
        Boolean bool = this.hasSet;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.description;
        return ((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.errorCode;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("QueryUserPasswordSetStatusData(hasSet=");
        LIZ.append(this.hasSet);
        LIZ.append(", description=");
        LIZ.append(this.description);
        LIZ.append(", errorCode=");
        return b0.LIZJ(LIZ, this.errorCode, ')', LIZ);
    }

    public QueryUserPasswordSetStatusData(Boolean bool, String str, int i) {
        this.hasSet = bool;
        this.description = str;
        this.errorCode = i;
    }

    public /* synthetic */ QueryUserPasswordSetStatusData(Boolean bool, String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(bool, str, (i2 & 4) != 0 ? 0 : i);
    }
}
