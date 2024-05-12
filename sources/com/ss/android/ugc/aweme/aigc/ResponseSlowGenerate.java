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
public final class ResponseSlowGenerate extends AbstractC36908Ee8 {

    @InterfaceC65349Pkn("remain_quotas")
    public final List<Quota> remainQuota;

    @InterfaceC195777mH
    @InterfaceC65349Pkn("status_code")
    public final int status_code;

    @InterfaceC65349Pkn("status_msg")
    public final String status_msg;

    @InterfaceC65349Pkn("task_id")
    public final String taskId;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResponseSlowGenerate)) {
            return false;
        }
        ResponseSlowGenerate responseSlowGenerate = (ResponseSlowGenerate) obj;
        return this.status_code == responseSlowGenerate.status_code && o.LJ(this.status_msg, responseSlowGenerate.status_msg) && o.LJ(this.taskId, responseSlowGenerate.taskId) && o.LJ(this.remainQuota, responseSlowGenerate.remainQuota);
    }

    public final int hashCode() {
        int i = this.status_code * 31;
        String str = this.status_msg;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.taskId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<Quota> list = this.remainQuota;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ResponseSlowGenerate(status_code=");
        LIZ.append(this.status_code);
        LIZ.append(", status_msg=");
        LIZ.append(this.status_msg);
        LIZ.append(", taskId=");
        LIZ.append(this.taskId);
        LIZ.append(", remainQuota=");
        return C1NE.LIZIZ(LIZ, this.remainQuota, ')', LIZ);
    }

    public ResponseSlowGenerate(int i, String str, String str2, List<Quota> list) {
        this.status_code = i;
        this.status_msg = str;
        this.taskId = str2;
        this.remainQuota = list;
    }

    public /* synthetic */ ResponseSlowGenerate(int i, String str, String str2, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : str, str2, list);
    }
}
