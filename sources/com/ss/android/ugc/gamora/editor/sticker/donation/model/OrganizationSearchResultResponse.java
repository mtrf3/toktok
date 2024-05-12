package com.ss.android.ugc.gamora.editor.sticker.donation.model;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class OrganizationSearchResultResponse extends BaseResponse {

    @InterfaceC65349Pkn("cursor")
    public final Integer cursor;

    @InterfaceC65349Pkn("has_more")
    public final Boolean hasMore;

    @InterfaceC65349Pkn("ngos")
    public final List<OrganizationSearchResultModel> orgList;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrganizationSearchResultResponse)) {
            return false;
        }
        OrganizationSearchResultResponse organizationSearchResultResponse = (OrganizationSearchResultResponse) obj;
        return o.LJ(this.cursor, organizationSearchResultResponse.cursor) && o.LJ(this.hasMore, organizationSearchResultResponse.hasMore) && o.LJ(this.orgList, organizationSearchResultResponse.orgList);
    }

    public final int hashCode() {
        Integer num = this.cursor;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Boolean bool = this.hasMore;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        List<OrganizationSearchResultModel> list = this.orgList;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("OrganizationSearchResultResponse(cursor=");
        LIZ.append(this.cursor);
        LIZ.append(", hasMore=");
        LIZ.append(this.hasMore);
        LIZ.append(", orgList=");
        return C1NE.LIZIZ(LIZ, this.orgList, ')', LIZ);
    }

    public OrganizationSearchResultResponse(Integer num, Boolean bool, List<OrganizationSearchResultModel> list) {
        this.cursor = num;
        this.hasMore = bool;
        this.orgList = list;
    }
}
