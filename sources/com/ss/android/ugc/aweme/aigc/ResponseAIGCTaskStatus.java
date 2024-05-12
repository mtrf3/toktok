package com.ss.android.ugc.aweme.aigc;

import X.AbstractC36908Ee8;
import X.C1NE;
import X.InterfaceC195777mH;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ResponseAIGCTaskStatus extends AbstractC36908Ee8 {

    @InterfaceC195777mH
    @InterfaceC65349Pkn("status_code")
    public final int status_code;

    @InterfaceC65349Pkn("status_msg")
    public final String status_msg;

    @InterfaceC65349Pkn("task_statuses")
    public final List<AIGCTaskStatus> tasks;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResponseAIGCTaskStatus)) {
            return false;
        }
        ResponseAIGCTaskStatus responseAIGCTaskStatus = (ResponseAIGCTaskStatus) obj;
        return this.status_code == responseAIGCTaskStatus.status_code && o.LJ(this.status_msg, responseAIGCTaskStatus.status_msg) && o.LJ(this.tasks, responseAIGCTaskStatus.tasks);
    }

    public final int hashCode() {
        int i = this.status_code * 31;
        String str = this.status_msg;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        List<AIGCTaskStatus> list = this.tasks;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ResponseAIGCTaskStatus(status_code=");
        LIZ.append(this.status_code);
        LIZ.append(", status_msg=");
        LIZ.append(this.status_msg);
        LIZ.append(", tasks=");
        return C1NE.LIZIZ(LIZ, this.tasks, ')', LIZ);
    }

    public ResponseAIGCTaskStatus(int i, String str, List<AIGCTaskStatus> list) {
        this.status_code = i;
        this.status_msg = str;
        this.tasks = list;
    }

    public /* synthetic */ ResponseAIGCTaskStatus(int i, String str, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : str, list);
    }
}
