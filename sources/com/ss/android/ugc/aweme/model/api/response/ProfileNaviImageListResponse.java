package com.ss.android.ugc.aweme.model.api.response;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.model.api.data.ProfileNaviImageDataModel;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ProfileNaviImageListResponse extends BaseResponse {

    @InterfaceC65349Pkn("has_more")
    public final int hasMore;

    @InterfaceC65349Pkn("navi_profile_images")
    public final List<ProfileNaviImageDataModel> naviList;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileNaviImageListResponse)) {
            return false;
        }
        ProfileNaviImageListResponse profileNaviImageListResponse = (ProfileNaviImageListResponse) obj;
        return this.hasMore == profileNaviImageListResponse.hasMore && o.LJ(this.naviList, profileNaviImageListResponse.naviList);
    }

    public final int hashCode() {
        int i = this.hasMore * 31;
        List<ProfileNaviImageDataModel> list = this.naviList;
        return i + (list == null ? 0 : list.hashCode());
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ProfileNaviImageListResponse(hasMore=");
        LIZ.append(this.hasMore);
        LIZ.append(", naviList=");
        return C1NE.LIZIZ(LIZ, this.naviList, ')', LIZ);
    }

    public ProfileNaviImageListResponse(int i, List<ProfileNaviImageDataModel> list) {
        this.hasMore = i;
        this.naviList = list;
    }

    public /* synthetic */ ProfileNaviImageListResponse(int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, list);
    }
}
