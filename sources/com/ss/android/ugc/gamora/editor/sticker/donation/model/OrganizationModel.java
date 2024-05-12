package com.ss.android.ugc.gamora.editor.sticker.donation.model;

import X.C6J6;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class OrganizationModel extends C6J6 implements Serializable {

    @InterfaceC65349Pkn("add_time")
    public String addTime;

    @InterfaceC65349Pkn("desc")
    public final String desc;

    @InterfaceC65349Pkn("web_url")
    public final String detailUrl;

    @InterfaceC65349Pkn("donation_link")
    public final String donateLink;

    @InterfaceC65349Pkn("icon")
    public final UrlModel icon;

    @InterfaceC65349Pkn("name")
    public final String name;

    @InterfaceC65349Pkn("ngo_id")
    public Integer ngoId;

    @InterfaceC65349Pkn("organization_id")
    public String orgId;

    @InterfaceC65349Pkn("organization_type")
    public String orgType;

    public static /* synthetic */ OrganizationModel copy$default(OrganizationModel organizationModel, String str, String str2, UrlModel urlModel, String str3, String str4, String str5, Integer num, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = organizationModel.getName();
        }
        if ((i & 2) != 0) {
            str2 = organizationModel.getDesc();
        }
        if ((i & 4) != 0) {
            urlModel = organizationModel.getIcon();
        }
        if ((i & 8) != 0) {
            str3 = organizationModel.getDetailUrl();
        }
        if ((i & 16) != 0) {
            str4 = organizationModel.getDonateLink();
        }
        if ((i & 32) != 0) {
            str5 = organizationModel.getAddTime();
        }
        if ((i & 64) != 0) {
            num = organizationModel.getNgoId();
        }
        if ((i & 128) != 0) {
            str6 = organizationModel.getOrgId();
        }
        if ((i & 256) != 0) {
            str7 = organizationModel.getOrgType();
        }
        return organizationModel.copy(str, str2, urlModel, str3, str4, str5, num, str6, str7);
    }

    public final String component1() {
        return getName();
    }

    public final String component2() {
        return getDesc();
    }

    public final UrlModel component3() {
        return getIcon();
    }

    public final String component4() {
        return getDetailUrl();
    }

    public final String component5() {
        return getDonateLink();
    }

    public final String component6() {
        return getAddTime();
    }

    public final Integer component7() {
        return getNgoId();
    }

    public final String component8() {
        return getOrgId();
    }

    public final String component9() {
        return getOrgType();
    }

    public final OrganizationModel copy(String str, String str2, UrlModel urlModel, String str3, String str4, String str5, Integer num, String str6, String str7) {
        return new OrganizationModel(str, str2, urlModel, str3, str4, str5, num, str6, str7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrganizationModel)) {
            return false;
        }
        C6J6 c6j6 = (C6J6) obj;
        return o.LJ(getName(), c6j6.getName()) && o.LJ(getDesc(), c6j6.getDesc()) && o.LJ(getIcon(), c6j6.getIcon()) && o.LJ(getDetailUrl(), c6j6.getDetailUrl()) && o.LJ(getDonateLink(), c6j6.getDonateLink()) && o.LJ(getAddTime(), c6j6.getAddTime()) && o.LJ(getNgoId(), c6j6.getNgoId()) && o.LJ(getOrgId(), c6j6.getOrgId()) && o.LJ(getOrgType(), c6j6.getOrgType());
    }

    public int hashCode() {
        return ((((((((((((((((getName() == null ? 0 : getName().hashCode()) * 31) + (getDesc() == null ? 0 : getDesc().hashCode())) * 31) + (getIcon() == null ? 0 : getIcon().hashCode())) * 31) + (getDetailUrl() == null ? 0 : getDetailUrl().hashCode())) * 31) + (getDonateLink() == null ? 0 : getDonateLink().hashCode())) * 31) + (getAddTime() == null ? 0 : getAddTime().hashCode())) * 31) + (getNgoId() == null ? 0 : getNgoId().hashCode())) * 31) + (getOrgId() == null ? 0 : getOrgId().hashCode())) * 31) + (getOrgType() != null ? getOrgType().hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("OrganizationModel(name=");
        LIZ.append(getName());
        LIZ.append(", desc=");
        LIZ.append(getDesc());
        LIZ.append(", icon=");
        LIZ.append(getIcon());
        LIZ.append(", detailUrl=");
        LIZ.append(getDetailUrl());
        LIZ.append(", donateLink=");
        LIZ.append(getDonateLink());
        LIZ.append(", addTime=");
        LIZ.append(getAddTime());
        LIZ.append(", ngoId=");
        LIZ.append(getNgoId());
        LIZ.append(", orgId=");
        LIZ.append(getOrgId());
        LIZ.append(", orgType=");
        LIZ.append(getOrgType());
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.C6J6
    public String getAddTime() {
        return this.addTime;
    }

    @Override // X.C6J6
    public String getDesc() {
        return this.desc;
    }

    @Override // X.C6J6
    public String getDetailUrl() {
        return this.detailUrl;
    }

    @Override // X.C6J6
    public String getDonateLink() {
        return this.donateLink;
    }

    @Override // X.C6J6
    public UrlModel getIcon() {
        return this.icon;
    }

    @Override // X.C6J6
    public String getName() {
        return this.name;
    }

    @Override // X.C6J6
    public Integer getNgoId() {
        return this.ngoId;
    }

    @Override // X.C6J6
    public String getOrgId() {
        return this.orgId;
    }

    @Override // X.C6J6
    public String getOrgType() {
        return this.orgType;
    }

    @Override // X.C6J6
    public void setAddTime(String str) {
        this.addTime = str;
    }

    public void setNgoId(Integer num) {
        this.ngoId = num;
    }

    public void setOrgId(String str) {
        this.orgId = str;
    }

    public void setOrgType(String str) {
        this.orgType = str;
    }

    public OrganizationModel(String str, String str2, UrlModel urlModel, String str3, String str4, String str5, Integer num, String str6, String str7) {
        this.name = str;
        this.desc = str2;
        this.icon = urlModel;
        this.detailUrl = str3;
        this.donateLink = str4;
        this.addTime = str5;
        this.ngoId = num;
        this.orgId = str6;
        this.orgType = str7;
    }
}
