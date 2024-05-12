package com.ss.android.ugc.aweme.donation;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NgoStruct {

    @InterfaceC65349Pkn("ngo_about_page")
    public final String aboutPage;

    @InterfaceC65349Pkn("ngo_description")
    public final String description;

    @InterfaceC65349Pkn("ngo_donation_link")
    public final String donationLink;

    @InterfaceC65349Pkn("ngo_name")
    public final String ngoName;

    @InterfaceC65349Pkn("ngo_organization_id")
    public final String orgId;

    @InterfaceC65349Pkn("ngo_organization_type")
    public final String orgType;

    @InterfaceC65349Pkn("ngo_icon_url")
    public final String url;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NgoStruct)) {
            return false;
        }
        NgoStruct ngoStruct = (NgoStruct) obj;
        return o.LJ(this.ngoName, ngoStruct.ngoName) && o.LJ(this.donationLink, ngoStruct.donationLink) && o.LJ(this.url, ngoStruct.url) && o.LJ(this.description, ngoStruct.description) && o.LJ(this.aboutPage, ngoStruct.aboutPage) && o.LJ(this.orgId, ngoStruct.orgId) && o.LJ(this.orgType, ngoStruct.orgType);
    }

    public final int hashCode() {
        String str = this.ngoName;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.donationLink;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.url;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.description;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.aboutPage;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.orgId;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.orgType;
        return hashCode6 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NgoStruct(ngoName=");
        LIZ.append(this.ngoName);
        LIZ.append(", donationLink=");
        LIZ.append(this.donationLink);
        LIZ.append(", url=");
        LIZ.append(this.url);
        LIZ.append(", description=");
        LIZ.append(this.description);
        LIZ.append(", aboutPage=");
        LIZ.append(this.aboutPage);
        LIZ.append(", orgId=");
        LIZ.append(this.orgId);
        LIZ.append(", orgType=");
        return q.LIZIZ(LIZ, this.orgType, ')', LIZ);
    }

    public NgoStruct(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.ngoName = str;
        this.donationLink = str2;
        this.url = str3;
        this.description = str4;
        this.aboutPage = str5;
        this.orgId = str6;
        this.orgType = str7;
    }
}
