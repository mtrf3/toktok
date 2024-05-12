package com.ss.android.ugc.gamora.editor.sticker.donation.model;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class OrganizationResponse extends BaseResponse {

    @InterfaceC65349Pkn("cursor")
    public final int cursor;

    @InterfaceC65349Pkn("has_more")
    public final int hasMore;

    @InterfaceC65349Pkn("donation_text")
    public final MatchDonationText matchDonationText;

    @InterfaceC65349Pkn("organizations")
    public final List<OrganizationModel> orgList;

    @InterfaceC65349Pkn("powered_by")
    public final String poweredBy;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrganizationResponse)) {
            return false;
        }
        OrganizationResponse organizationResponse = (OrganizationResponse) obj;
        return this.cursor == organizationResponse.cursor && this.hasMore == organizationResponse.hasMore && o.LJ(this.poweredBy, organizationResponse.poweredBy) && o.LJ(this.matchDonationText, organizationResponse.matchDonationText) && o.LJ(this.orgList, organizationResponse.orgList);
    }

    public final int hashCode() {
        int i = ((this.cursor * 31) + this.hasMore) * 31;
        String str = this.poweredBy;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        MatchDonationText matchDonationText = this.matchDonationText;
        int hashCode2 = (hashCode + (matchDonationText == null ? 0 : matchDonationText.hashCode())) * 31;
        List<OrganizationModel> list = this.orgList;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("OrganizationResponse(cursor=");
        LIZ.append(this.cursor);
        LIZ.append(", hasMore=");
        LIZ.append(this.hasMore);
        LIZ.append(", poweredBy=");
        LIZ.append(this.poweredBy);
        LIZ.append(", matchDonationText=");
        LIZ.append(this.matchDonationText);
        LIZ.append(", orgList=");
        return C1NE.LIZIZ(LIZ, this.orgList, ')', LIZ);
    }

    public OrganizationResponse(int i, int i2, String str, MatchDonationText matchDonationText, List<OrganizationModel> list) {
        this.cursor = i;
        this.hasMore = i2;
        this.poweredBy = str;
        this.matchDonationText = matchDonationText;
        this.orgList = list;
    }
}
