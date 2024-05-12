package com.ss.android.ugc.aweme.relation.auth.model;

import X.InterfaceC65349Pkn;
import X.O1A;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class UnRegisteredContactUser {

    @O1A
    @InterfaceC65349Pkn("phone_number")
    public final String hashNationalNumber;

    @O1A
    @InterfaceC65349Pkn("region_code")
    public final String hashRegionCode;

    /* JADX WARN: Multi-variable type inference failed */
    public UnRegisteredContactUser() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnRegisteredContactUser)) {
            return false;
        }
        UnRegisteredContactUser unRegisteredContactUser = (UnRegisteredContactUser) obj;
        return o.LJ(this.hashNationalNumber, unRegisteredContactUser.hashNationalNumber) && o.LJ(this.hashRegionCode, unRegisteredContactUser.hashRegionCode);
    }

    public final int hashCode() {
        String str = this.hashNationalNumber;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.hashRegionCode;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UnRegisteredContactUser(hashNationalNumber=");
        LIZ.append(this.hashNationalNumber);
        LIZ.append(", hashRegionCode=");
        return q.LIZIZ(LIZ, this.hashRegionCode, ')', LIZ);
    }

    public UnRegisteredContactUser(String str, String str2) {
        this.hashNationalNumber = str;
        this.hashRegionCode = str2;
    }

    public /* synthetic */ UnRegisteredContactUser(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
