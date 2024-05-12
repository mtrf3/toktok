package com.ss.android.ugc.aweme.model.api.response;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ProfileNaviCreateResponse extends BaseResponse {

    @InterfaceC65349Pkn("navi_id")
    public final String naviId;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ProfileNaviCreateResponse) && o.LJ(this.naviId, ((ProfileNaviCreateResponse) obj).naviId);
    }

    public final int hashCode() {
        String str = this.naviId;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ProfileNaviCreateResponse(naviId=");
        return q.LIZIZ(LIZ, this.naviId, ')', LIZ);
    }

    public ProfileNaviCreateResponse(String str) {
        this.naviId = str;
    }
}
