package com.ss.android.ugc.aweme.repo;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;

/* loaded from: classes4.dex */
public final class DanmakuListResponse extends BaseResponse {

    @InterfaceC65349Pkn("danmaku_list")
    public final List<DanmakuStruct> data;

    @InterfaceC65349Pkn("end_time")
    public final long endTime;

    @InterfaceC65349Pkn("start_time")
    public final long startTime;

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        Integer num;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("status_code:");
        LIZ.append(this.status_code);
        LIZ.append(", start:");
        LIZ.append(this.startTime);
        LIZ.append(", end:");
        LIZ.append(this.endTime);
        LIZ.append(", cnt:");
        List<DanmakuStruct> list = this.data;
        if (list != null) {
            num = Integer.valueOf(list.size());
        } else {
            num = null;
        }
        LIZ.append(num);
        return X1D.LIZIZ(LIZ);
    }

    public final List<DanmakuStruct> getData() {
        return this.data;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final long getStartTime() {
        return this.startTime;
    }
}
