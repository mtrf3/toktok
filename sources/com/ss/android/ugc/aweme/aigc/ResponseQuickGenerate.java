package com.ss.android.ugc.aweme.aigc;

import X.AbstractC36908Ee8;
import X.C1NE;
import X.C32I;
import X.InterfaceC195777mH;
import X.InterfaceC65349Pkn;
import X.ST6;
import X.X1D;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ResponseQuickGenerate extends AbstractC36908Ee8 {

    @InterfaceC65349Pkn("avatar_urls")
    public final List<String> avatarUrls;

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
        if (!(obj instanceof ResponseQuickGenerate)) {
            return false;
        }
        ResponseQuickGenerate responseQuickGenerate = (ResponseQuickGenerate) obj;
        return this.status_code == responseQuickGenerate.status_code && o.LJ(this.status_msg, responseQuickGenerate.status_msg) && o.LJ(this.avatarUrls, responseQuickGenerate.avatarUrls) && o.LJ(this.taskId, responseQuickGenerate.taskId) && o.LJ(this.remainQuota, responseQuickGenerate.remainQuota);
    }

    public final int hashCode() {
        int i = this.status_code * 31;
        String str = this.status_msg;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.avatarUrls;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.taskId;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<Quota> list2 = this.remainQuota;
        return hashCode3 + (list2 != null ? list2.hashCode() : 0);
    }

    public final ST6 LJ() {
        ArrayList arrayList;
        List<String> list = this.avatarUrls;
        List<Quota> list2 = this.remainQuota;
        if (list2 != null) {
            arrayList = new ArrayList(C32I.LJJL(list2, 10));
            for (Quota quota : list2) {
                quota.getClass();
                arrayList.add(new AIGCQuota(quota.quotaType, quota.quotaRemain));
            }
        } else {
            arrayList = null;
        }
        return new ST6(this.taskId, list, arrayList);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ResponseQuickGenerate(status_code=");
        LIZ.append(this.status_code);
        LIZ.append(", status_msg=");
        LIZ.append(this.status_msg);
        LIZ.append(", avatarUrls=");
        LIZ.append(this.avatarUrls);
        LIZ.append(", taskId=");
        LIZ.append(this.taskId);
        LIZ.append(", remainQuota=");
        return C1NE.LIZIZ(LIZ, this.remainQuota, ')', LIZ);
    }

    public ResponseQuickGenerate(int i, String str, List<String> list, String str2, List<Quota> list2) {
        this.status_code = i;
        this.status_msg = str;
        this.avatarUrls = list;
        this.taskId = str2;
        this.remainQuota = list2;
    }

    public /* synthetic */ ResponseQuickGenerate(int i, String str, List list, String str2, List list2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : str, list, str2, list2);
    }
}
