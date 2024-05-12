package com.ss.android.ugc.aweme.model;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class UpdatedVideosResponse extends BaseResponse {

    @InterfaceC65349Pkn("videos")
    public final List<ManagementPagePaidVideo> videos;

    /* JADX WARN: Multi-variable type inference failed */
    public UpdatedVideosResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UpdatedVideosResponse) && o.LJ(this.videos, ((UpdatedVideosResponse) obj).videos);
    }

    public final int hashCode() {
        List<ManagementPagePaidVideo> list = this.videos;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UpdatedVideosResponse(videos=");
        return C1NE.LIZIZ(LIZ, this.videos, ')', LIZ);
    }

    public UpdatedVideosResponse(List<ManagementPagePaidVideo> list) {
        this.videos = list;
    }

    public /* synthetic */ UpdatedVideosResponse(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }
}
