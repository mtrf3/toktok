package com.ss.android.ugc.aweme.im.sdk.chat.feature.tikbot.api;

import X.C78966Uyw;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class TakoMsgAckResponse extends BaseResponse {

    @InterfaceC65349Pkn("request_arrived_time")
    public final long requestArrivedTime;

    @InterfaceC65349Pkn("server_execution_end_time")
    public final long serverExecutionEndTime;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public TakoMsgAckResponse() {
        /*
            r7 = this;
            r1 = 0
            r5 = 3
            r6 = 0
            r0 = r7
            r3 = r1
            r0.<init>(r1, r3, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.feature.tikbot.api.TakoMsgAckResponse.<init>():void");
    }

    public static /* synthetic */ TakoMsgAckResponse copy$default(TakoMsgAckResponse takoMsgAckResponse, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = takoMsgAckResponse.requestArrivedTime;
        }
        if ((i & 2) != 0) {
            j2 = takoMsgAckResponse.serverExecutionEndTime;
        }
        return takoMsgAckResponse.copy(j, j2);
    }

    private Object[] getObjects() {
        return new Object[]{Long.valueOf(this.requestArrivedTime), Long.valueOf(this.serverExecutionEndTime)};
    }

    public final TakoMsgAckResponse copy(long j, long j2) {
        return new TakoMsgAckResponse(j, j2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TakoMsgAckResponse) {
            return C78966Uyw.LJIIIZ(((TakoMsgAckResponse) obj).getObjects(), getObjects());
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(getObjects());
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        return C78966Uyw.LJJJLL("TakoMsgAckResponse:%s,%s", getObjects());
    }

    public final long getRequestArrivedTime() {
        return this.requestArrivedTime;
    }

    public final long getServerExecutionEndTime() {
        return this.serverExecutionEndTime;
    }

    public TakoMsgAckResponse(long j, long j2) {
        this.requestArrivedTime = j;
        this.serverExecutionEndTime = j2;
    }

    public /* synthetic */ TakoMsgAckResponse(long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? 0L : j2);
    }
}
