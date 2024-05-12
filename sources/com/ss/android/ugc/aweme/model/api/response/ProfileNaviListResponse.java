package com.ss.android.ugc.aweme.model.api.response;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.model.api.data.ProfileNaviDataModel;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ProfileNaviListResponse extends BaseResponse {

    @InterfaceC65349Pkn("has_more")
    public final int hasMore;

    @InterfaceC65349Pkn("total")
    public final Long naviCount;

    @InterfaceC65349Pkn("navis")
    public final List<ProfileNaviDataModel> naviList;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileNaviListResponse)) {
            return false;
        }
        ProfileNaviListResponse profileNaviListResponse = (ProfileNaviListResponse) obj;
        return o.LJ(this.naviCount, profileNaviListResponse.naviCount) && this.hasMore == profileNaviListResponse.hasMore && o.LJ(this.naviList, profileNaviListResponse.naviList);
    }

    public final int hashCode() {
        Long l = this.naviCount;
        int hashCode = (((l == null ? 0 : l.hashCode()) * 31) + this.hasMore) * 31;
        List<ProfileNaviDataModel> list = this.naviList;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ProfileNaviListResponse(naviCount=");
        LIZ.append(this.naviCount);
        LIZ.append(", hasMore=");
        LIZ.append(this.hasMore);
        LIZ.append(", naviList=");
        return C1NE.LIZIZ(LIZ, this.naviList, ')', LIZ);
    }

    public ProfileNaviListResponse(Long l, int i, List<ProfileNaviDataModel> list) {
        this.naviCount = l;
        this.hasMore = i;
        this.naviList = list;
    }

    public /* synthetic */ ProfileNaviListResponse(Long l, int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(l, (i2 & 2) != 0 ? 0 : i, list);
    }
}
