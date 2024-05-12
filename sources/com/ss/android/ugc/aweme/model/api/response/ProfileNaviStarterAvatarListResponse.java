package com.ss.android.ugc.aweme.model.api.response;

import X.C78920UyC;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.model.api.data.ProfileNaviInitialDataModel;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ProfileNaviStarterAvatarListResponse extends BaseResponse {

    @InterfaceC65349Pkn("can_auto_create")
    public final Boolean canAutoCreate;

    @InterfaceC65349Pkn("initial_navis")
    public final List<ProfileNaviInitialDataModel> starterAvatarList;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileNaviStarterAvatarListResponse)) {
            return false;
        }
        ProfileNaviStarterAvatarListResponse profileNaviStarterAvatarListResponse = (ProfileNaviStarterAvatarListResponse) obj;
        return o.LJ(this.starterAvatarList, profileNaviStarterAvatarListResponse.starterAvatarList) && o.LJ(this.canAutoCreate, profileNaviStarterAvatarListResponse.canAutoCreate);
    }

    public final int hashCode() {
        List<ProfileNaviInitialDataModel> list = this.starterAvatarList;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Boolean bool = this.canAutoCreate;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ProfileNaviStarterAvatarListResponse(starterAvatarList=");
        LIZ.append(this.starterAvatarList);
        LIZ.append(", canAutoCreate=");
        return C78920UyC.LIZIZ(LIZ, this.canAutoCreate, ')', LIZ);
    }

    public ProfileNaviStarterAvatarListResponse(List<ProfileNaviInitialDataModel> list, Boolean bool) {
        this.starterAvatarList = list;
        this.canAutoCreate = bool;
    }

    public /* synthetic */ ProfileNaviStarterAvatarListResponse(List list, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? Boolean.FALSE : bool);
    }
}
