package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C26834Ag2;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PrivacyPolicy implements Parcelable {
    public static final Parcelable.Creator<PrivacyPolicy> CREATOR = new C26834Ag2();

    @InterfaceC65349Pkn("btn_text")
    public final String buttonText;

    @InterfaceC65349Pkn("link")
    public final String link;

    @InterfaceC65349Pkn("name_en")
    public final String nameEn;

    @InterfaceC65349Pkn("privacy_policy_type")
    public final Integer policyType;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrivacyPolicy)) {
            return false;
        }
        PrivacyPolicy privacyPolicy = (PrivacyPolicy) obj;
        return o.LJ(this.policyType, privacyPolicy.policyType) && o.LJ(this.buttonText, privacyPolicy.buttonText) && o.LJ(this.link, privacyPolicy.link) && o.LJ(this.nameEn, privacyPolicy.nameEn);
    }

    public final int hashCode() {
        Integer num = this.policyType;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.buttonText;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.link;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.nameEn;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        int intValue;
        o.LJIIIZ(out, "out");
        Integer num = this.policyType;
        if (num == null) {
            intValue = 0;
        } else {
            out.writeInt(1);
            intValue = num.intValue();
        }
        out.writeInt(intValue);
        out.writeString(this.buttonText);
        out.writeString(this.link);
        out.writeString(this.nameEn);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PrivacyPolicy(policyType=");
        LIZ.append(this.policyType);
        LIZ.append(", buttonText=");
        LIZ.append(this.buttonText);
        LIZ.append(", link=");
        LIZ.append(this.link);
        LIZ.append(", nameEn=");
        return q.LIZIZ(LIZ, this.nameEn, ')', LIZ);
    }

    public PrivacyPolicy(Integer num, String str, String str2, String str3) {
        this.policyType = num;
        this.buttonText = str;
        this.link = str2;
        this.nameEn = str3;
    }
}
