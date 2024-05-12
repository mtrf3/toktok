package com.ss.android.ugc.aweme.profile.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ProfileNgoStruct implements Serializable {

    @InterfaceC65349Pkn("ngo_id")
    public int id;

    @InterfaceC65349Pkn("organization_id")
    public String orgId = "";

    @InterfaceC65349Pkn("organization_type")
    public String orgType = "";

    @InterfaceC65349Pkn("ngo_name")
    public String name = "";

    @InterfaceC65349Pkn("ngo_icon_url")
    public String iconUrl = "";

    @InterfaceC65349Pkn("ngo_donation_link")
    public String donationLink = "";

    public final String getDonationLink() {
        return this.donationLink;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final int getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getOrgId() {
        return this.orgId;
    }

    public final String getOrgType() {
        return this.orgType;
    }

    public final void setDonationLink(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.donationLink = str;
    }

    public final void setIconUrl(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.iconUrl = str;
    }

    public final void setId(int i) {
        this.id = i;
    }

    public final void setName(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.name = str;
    }

    public final void setOrgId(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.orgId = str;
    }

    public final void setOrgType(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.orgType = str;
    }
}
