package com.ss.android.ugc.gamora.editor.sticker.donation.model;

import X.C6J6;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class OrganizationSearchResultModel extends C6J6 implements Serializable {

    @InterfaceC65349Pkn("desc")
    public final String desc;

    @InterfaceC65349Pkn("desc_highlights")
    public List<TextHighlight> descHighlightList;

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
    public final String orgId;

    @InterfaceC65349Pkn("organization_type")
    public final String orgType;

    @InterfaceC65349Pkn("name_highlights")
    public List<TextHighlight> textHighlightList;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OrganizationSearchResultModel copy$default(OrganizationSearchResultModel organizationSearchResultModel, Integer num, String str, List list, String str2, List list2, UrlModel urlModel, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            num = organizationSearchResultModel.getNgoId();
        }
        if ((i & 2) != 0) {
            str = organizationSearchResultModel.getName();
        }
        if ((i & 4) != 0) {
            list = organizationSearchResultModel.textHighlightList;
        }
        if ((i & 8) != 0) {
            str2 = organizationSearchResultModel.getDesc();
        }
        if ((i & 16) != 0) {
            list2 = organizationSearchResultModel.descHighlightList;
        }
        if ((i & 32) != 0) {
            urlModel = organizationSearchResultModel.getIcon();
        }
        if ((i & 64) != 0) {
            str3 = organizationSearchResultModel.getDetailUrl();
        }
        if ((i & 128) != 0) {
            str4 = organizationSearchResultModel.getDonateLink();
        }
        if ((i & 256) != 0) {
            str5 = organizationSearchResultModel.getOrgId();
        }
        if ((i & 512) != 0) {
            str6 = organizationSearchResultModel.getOrgType();
        }
        return organizationSearchResultModel.copy(num, str, list, str2, list2, urlModel, str3, str4, str5, str6);
    }

    public final Integer component1() {
        return getNgoId();
    }

    public final String component10() {
        return getOrgType();
    }

    public final String component2() {
        return getName();
    }

    public final String component4() {
        return getDesc();
    }

    public final UrlModel component6() {
        return getIcon();
    }

    public final String component7() {
        return getDetailUrl();
    }

    public final String component8() {
        return getDonateLink();
    }

    public final String component9() {
        return getOrgId();
    }

    public final OrganizationSearchResultModel copy(Integer num, String str, List<TextHighlight> list, String str2, List<TextHighlight> list2, UrlModel urlModel, String str3, String str4, String str5, String str6) {
        return new OrganizationSearchResultModel(num, str, list, str2, list2, urlModel, str3, str4, str5, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrganizationSearchResultModel)) {
            return false;
        }
        OrganizationSearchResultModel organizationSearchResultModel = (OrganizationSearchResultModel) obj;
        return o.LJ(getNgoId(), organizationSearchResultModel.getNgoId()) && o.LJ(getName(), organizationSearchResultModel.getName()) && o.LJ(this.textHighlightList, organizationSearchResultModel.textHighlightList) && o.LJ(getDesc(), organizationSearchResultModel.getDesc()) && o.LJ(this.descHighlightList, organizationSearchResultModel.descHighlightList) && o.LJ(getIcon(), organizationSearchResultModel.getIcon()) && o.LJ(getDetailUrl(), organizationSearchResultModel.getDetailUrl()) && o.LJ(getDonateLink(), organizationSearchResultModel.getDonateLink()) && o.LJ(getOrgId(), organizationSearchResultModel.getOrgId()) && o.LJ(getOrgType(), organizationSearchResultModel.getOrgType());
    }

    public int hashCode() {
        int hashCode = (((getNgoId() == null ? 0 : getNgoId().hashCode()) * 31) + (getName() == null ? 0 : getName().hashCode())) * 31;
        List<TextHighlight> list = this.textHighlightList;
        int hashCode2 = (((hashCode + (list == null ? 0 : list.hashCode())) * 31) + (getDesc() == null ? 0 : getDesc().hashCode())) * 31;
        List<TextHighlight> list2 = this.descHighlightList;
        return ((((((((((hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31) + (getIcon() == null ? 0 : getIcon().hashCode())) * 31) + (getDetailUrl() == null ? 0 : getDetailUrl().hashCode())) * 31) + (getDonateLink() == null ? 0 : getDonateLink().hashCode())) * 31) + (getOrgId() == null ? 0 : getOrgId().hashCode())) * 31) + (getOrgType() != null ? getOrgType().hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("OrganizationSearchResultModel(ngoId=");
        LIZ.append(getNgoId());
        LIZ.append(", name=");
        LIZ.append(getName());
        LIZ.append(", textHighlightList=");
        LIZ.append(this.textHighlightList);
        LIZ.append(", desc=");
        LIZ.append(getDesc());
        LIZ.append(", descHighlightList=");
        LIZ.append(this.descHighlightList);
        LIZ.append(", icon=");
        LIZ.append(getIcon());
        LIZ.append(", detailUrl=");
        LIZ.append(getDetailUrl());
        LIZ.append(", donateLink=");
        LIZ.append(getDonateLink());
        LIZ.append(", orgId=");
        LIZ.append(getOrgId());
        LIZ.append(", orgType=");
        LIZ.append(getOrgType());
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.C6J6
    public String getDesc() {
        return this.desc;
    }

    public final List<TextHighlight> getDescHighlightList() {
        return this.descHighlightList;
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

    public final List<TextHighlight> getTextHighlightList() {
        return this.textHighlightList;
    }

    public final void setDescHighlightList(List<TextHighlight> list) {
        this.descHighlightList = list;
    }

    public void setNgoId(Integer num) {
        this.ngoId = num;
    }

    public final void setTextHighlightList(List<TextHighlight> list) {
        this.textHighlightList = list;
    }

    public OrganizationSearchResultModel(Integer num, String str, List<TextHighlight> list, String str2, List<TextHighlight> list2, UrlModel urlModel, String str3, String str4, String str5, String str6) {
        this.ngoId = num;
        this.name = str;
        this.textHighlightList = list;
        this.desc = str2;
        this.descHighlightList = list2;
        this.icon = urlModel;
        this.detailUrl = str3;
        this.donateLink = str4;
        this.orgId = str5;
        this.orgType = str6;
    }
}
