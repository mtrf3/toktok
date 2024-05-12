package com.ss.android.ugc.aweme.im.sdk.chat.feature.tikbot.api;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import defpackage.s0;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class TakoProcessInfoResponse extends BaseResponse {

    @InterfaceC65349Pkn("process_details")
    public final List<String> processInfoList;

    @InterfaceC65349Pkn("process_status")
    public final Integer processStatus;

    /* JADX WARN: Multi-variable type inference failed */
    public TakoProcessInfoResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TakoProcessInfoResponse copy$default(TakoProcessInfoResponse takoProcessInfoResponse, List list, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            list = takoProcessInfoResponse.processInfoList;
        }
        if ((i & 2) != 0) {
            num = takoProcessInfoResponse.processStatus;
        }
        return takoProcessInfoResponse.copy(list, num);
    }

    public final TakoProcessInfoResponse copy(List<String> list, Integer num) {
        return new TakoProcessInfoResponse(list, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TakoProcessInfoResponse)) {
            return false;
        }
        TakoProcessInfoResponse takoProcessInfoResponse = (TakoProcessInfoResponse) obj;
        return o.LJ(this.processInfoList, takoProcessInfoResponse.processInfoList) && o.LJ(this.processStatus, takoProcessInfoResponse.processStatus);
    }

    public int hashCode() {
        List<String> list = this.processInfoList;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.processStatus;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TakoProcessInfoResponse(processInfoList=");
        LIZ.append(this.processInfoList);
        LIZ.append(", processStatus=");
        return s0.LIZJ(LIZ, this.processStatus, ')', LIZ);
    }

    public final List<String> getProcessInfoList() {
        return this.processInfoList;
    }

    public final Integer getProcessStatus() {
        return this.processStatus;
    }

    public TakoProcessInfoResponse(List<String> list, Integer num) {
        this.processInfoList = list;
        this.processStatus = num;
    }

    public /* synthetic */ TakoProcessInfoResponse(List list, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : num);
    }
}
