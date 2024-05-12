package com.ss.android.ugc.aweme.aigc;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class AIGCTaskStatus {

    @InterfaceC65349Pkn("job_type")
    public final String jobType;

    @InterfaceC65349Pkn("complete_percentage")
    public final Float percentage;

    @InterfaceC65349Pkn("job_status")
    public final Integer status;

    @InterfaceC65349Pkn("status_message")
    public final String statusMessage;

    @InterfaceC65349Pkn("task_id")
    public final String taskId;

    @InterfaceC65349Pkn("waiting_time")
    public final Integer waitingTime;

    /* JADX WARN: Multi-variable type inference failed */
    public AIGCTaskStatus() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 63, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIGCTaskStatus)) {
            return false;
        }
        AIGCTaskStatus aIGCTaskStatus = (AIGCTaskStatus) obj;
        return o.LJ(this.taskId, aIGCTaskStatus.taskId) && o.LJ(this.status, aIGCTaskStatus.status) && o.LJ(this.percentage, aIGCTaskStatus.percentage) && o.LJ(this.statusMessage, aIGCTaskStatus.statusMessage) && o.LJ(this.jobType, aIGCTaskStatus.jobType) && o.LJ(this.waitingTime, aIGCTaskStatus.waitingTime);
    }

    public final int hashCode() {
        String str = this.taskId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.status;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Float f = this.percentage;
        int hashCode3 = (hashCode2 + (f == null ? 0 : f.hashCode())) * 31;
        String str2 = this.statusMessage;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.jobType;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num2 = this.waitingTime;
        return hashCode5 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AIGCTaskStatus(taskId=");
        LIZ.append(this.taskId);
        LIZ.append(", status=");
        LIZ.append(this.status);
        LIZ.append(", percentage=");
        LIZ.append(this.percentage);
        LIZ.append(", statusMessage=");
        LIZ.append(this.statusMessage);
        LIZ.append(", jobType=");
        LIZ.append(this.jobType);
        LIZ.append(", waitingTime=");
        return s0.LIZJ(LIZ, this.waitingTime, ')', LIZ);
    }

    public AIGCTaskStatus(String str, Integer num, Float f, String str2, String str3, Integer num2) {
        this.taskId = str;
        this.status = num;
        this.percentage = f;
        this.statusMessage = str2;
        this.jobType = str3;
        this.waitingTime = num2;
    }

    public /* synthetic */ AIGCTaskStatus(String str, Integer num, Float f, String str2, String str3, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : f, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) == 0 ? num2 : null);
    }
}
