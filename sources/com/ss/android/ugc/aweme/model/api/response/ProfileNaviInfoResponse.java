package com.ss.android.ugc.aweme.model.api.response;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.model.api.data.ProfileNaviDataModel;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class ProfileNaviInfoResponse extends BaseResponse {

    @InterfaceC65349Pkn("navi")
    public final ProfileNaviDataModel navi;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ProfileNaviInfoResponse) && o.LJ(this.navi, ((ProfileNaviInfoResponse) obj).navi);
    }

    public final int hashCode() {
        ProfileNaviDataModel profileNaviDataModel = this.navi;
        if (profileNaviDataModel == null) {
            return 0;
        }
        return profileNaviDataModel.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ProfileNaviInfoResponse(navi=");
        LIZ.append(this.navi);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public ProfileNaviInfoResponse(ProfileNaviDataModel profileNaviDataModel) {
        this.navi = profileNaviDataModel;
    }
}
