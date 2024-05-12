package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PhoneCredit {

    @InterfaceC65349Pkn("country_code")
    public final String countryCode;

    @InterfaceC65349Pkn("hint")
    public final String hint;

    @InterfaceC65349Pkn("phone_number")
    public final String phoneNumber;

    @InterfaceC65349Pkn("sample_num")
    public final String sampleNum;

    public static /* synthetic */ PhoneCredit copy$default(PhoneCredit phoneCredit, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = phoneCredit.countryCode;
        }
        if ((i & 2) != 0) {
            str2 = phoneCredit.phoneNumber;
        }
        if ((i & 4) != 0) {
            str3 = phoneCredit.hint;
        }
        if ((i & 8) != 0) {
            str4 = phoneCredit.sampleNum;
        }
        return phoneCredit.copy(str, str2, str3, str4);
    }

    public final PhoneCredit copy(String str, String str2, String str3, String str4) {
        return new PhoneCredit(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhoneCredit)) {
            return false;
        }
        PhoneCredit phoneCredit = (PhoneCredit) obj;
        return o.LJ(this.countryCode, phoneCredit.countryCode) && o.LJ(this.phoneNumber, phoneCredit.phoneNumber) && o.LJ(this.hint, phoneCredit.hint) && o.LJ(this.sampleNum, phoneCredit.sampleNum);
    }

    public int hashCode() {
        String str = this.countryCode;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.phoneNumber;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.hint;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.sampleNum;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PhoneCredit(countryCode=");
        LIZ.append(this.countryCode);
        LIZ.append(", phoneNumber=");
        LIZ.append(this.phoneNumber);
        LIZ.append(", hint=");
        LIZ.append(this.hint);
        LIZ.append(", sampleNum=");
        return q.LIZIZ(LIZ, this.sampleNum, ')', LIZ);
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final String getHint() {
        return this.hint;
    }

    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    public final String getSampleNum() {
        return this.sampleNum;
    }

    public PhoneCredit(String str, String str2, String str3, String str4) {
        this.countryCode = str;
        this.phoneNumber = str2;
        this.hint = str3;
        this.sampleNum = str4;
    }
}
