package com.ss.android.ugc.aweme.relation.auth.model;

import X.InterfaceC65349Pkn;
import X.O1A;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class ContactBookPhone {

    @O1A
    @InterfaceC65349Pkn("region_source")
    public final String countryCodeSource;

    @O1A
    @InterfaceC65349Pkn("hashed_phone_e164")
    public final String hashE164PhoneNumber;

    @O1A
    @InterfaceC65349Pkn("hashed_phone")
    public final String hashNationalNumber;

    @O1A
    @InterfaceC65349Pkn("region_code")
    public final String hashRegionCode;

    /* JADX WARN: Multi-variable type inference failed */
    public ContactBookPhone() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContactBookPhone)) {
            return false;
        }
        ContactBookPhone contactBookPhone = (ContactBookPhone) obj;
        return o.LJ(this.hashNationalNumber, contactBookPhone.hashNationalNumber) && o.LJ(this.hashRegionCode, contactBookPhone.hashRegionCode) && o.LJ(this.hashE164PhoneNumber, contactBookPhone.hashE164PhoneNumber) && o.LJ(this.countryCodeSource, contactBookPhone.countryCodeSource);
    }

    public final int hashCode() {
        String str = this.hashNationalNumber;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.hashRegionCode;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.hashE164PhoneNumber;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.countryCodeSource;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ContactBookPhone(hashNationalNumber=");
        LIZ.append(this.hashNationalNumber);
        LIZ.append(", hashRegionCode=");
        LIZ.append(this.hashRegionCode);
        LIZ.append(", hashE164PhoneNumber=");
        LIZ.append(this.hashE164PhoneNumber);
        LIZ.append(", countryCodeSource=");
        return q.LIZIZ(LIZ, this.countryCodeSource, ')', LIZ);
    }

    public ContactBookPhone(String str, String str2, String str3, String str4) {
        this.hashNationalNumber = str;
        this.hashRegionCode = str2;
        this.hashE164PhoneNumber = str3;
        this.countryCodeSource = str4;
    }

    public /* synthetic */ ContactBookPhone(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}
