package com.ss.android.ugc.aweme.inbox.widget.multi.horizontal;

import X.C16880lQ;
import X.C47135Ieh;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class SkylightDataResponse extends BaseResponse implements Serializable {

    @InterfaceC65349Pkn("create_time")
    public final long createTime;

    @InterfaceC65349Pkn("skylight_list")
    public final List<SkylightData> dataList;

    /* JADX WARN: Multi-variable type inference failed */
    public SkylightDataResponse() {
        this(null, 0L, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SkylightDataResponse copy$default(SkylightDataResponse skylightDataResponse, List list, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            list = skylightDataResponse.dataList;
        }
        if ((i & 2) != 0) {
            j = skylightDataResponse.createTime;
        }
        return skylightDataResponse.copy(list, j);
    }

    public final SkylightDataResponse copy(List<SkylightData> list, long j) {
        return new SkylightDataResponse(list, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SkylightDataResponse)) {
            return false;
        }
        SkylightDataResponse skylightDataResponse = (SkylightDataResponse) obj;
        return o.LJ(this.dataList, skylightDataResponse.dataList) && this.createTime == skylightDataResponse.createTime;
    }

    public int hashCode() {
        List<SkylightData> list = this.dataList;
        return C16880lQ.LLJIJIL(this.createTime) + ((list == null ? 0 : list.hashCode()) * 31);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SkylightDataResponse(dataList=");
        LIZ.append(this.dataList);
        LIZ.append(", createTime=");
        return C47135Ieh.LIZIZ(LIZ, this.createTime, ')', LIZ);
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final List<SkylightData> getDataList() {
        return this.dataList;
    }

    public SkylightDataResponse(List<SkylightData> list, long j) {
        this.dataList = list;
        this.createTime = j;
    }

    public /* synthetic */ SkylightDataResponse(List list, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? System.currentTimeMillis() : j);
    }
}
