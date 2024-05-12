package com.ss.android.ugc.aweme.im.sdk.chat.feature.socialpublish.model;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class DMStoryStatusResponse extends BaseResponse {

    @InterfaceC65349Pkn("users_story_status")
    public final List<DMSocPubStatus> statusList;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DMStoryStatusResponse) && o.LJ(this.statusList, ((DMStoryStatusResponse) obj).statusList);
    }

    public final int hashCode() {
        List<DMSocPubStatus> list = this.statusList;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DMStoryStatusResponse(statusList=");
        return C1NE.LIZIZ(LIZ, this.statusList, ')', LIZ);
    }

    public DMStoryStatusResponse(List<DMSocPubStatus> list) {
        this.statusList = list;
    }
}
