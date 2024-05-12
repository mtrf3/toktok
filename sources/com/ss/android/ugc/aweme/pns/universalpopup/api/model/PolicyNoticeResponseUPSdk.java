package com.ss.android.ugc.aweme.pns.universalpopup.api.model;

import X.C61878OQg;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class PolicyNoticeResponseUPSdk implements Serializable {

    @InterfaceC65349Pkn("policy_notices")
    public final List<PolicyNoticeUPSdk> policyNotices;

    @InterfaceC65349Pkn("status_code")
    public final int status_code;

    @InterfaceC65349Pkn("status_msg")
    public final String status_msg;

    public PolicyNoticeResponseUPSdk() {
        this(null, 0, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PolicyNoticeResponseUPSdk copy$default(PolicyNoticeResponseUPSdk policyNoticeResponseUPSdk, List list, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = policyNoticeResponseUPSdk.policyNotices;
        }
        if ((i2 & 2) != 0) {
            i = policyNoticeResponseUPSdk.status_code;
        }
        if ((i2 & 4) != 0) {
            str = policyNoticeResponseUPSdk.status_msg;
        }
        return policyNoticeResponseUPSdk.copy(list, i, str);
    }

    public final PolicyNoticeResponseUPSdk copy(List<PolicyNoticeUPSdk> policyNotices, int i, String str) {
        o.LJIIIZ(policyNotices, "policyNotices");
        return new PolicyNoticeResponseUPSdk(policyNotices, i, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PolicyNoticeResponseUPSdk)) {
            return false;
        }
        PolicyNoticeResponseUPSdk policyNoticeResponseUPSdk = (PolicyNoticeResponseUPSdk) obj;
        return o.LJ(this.policyNotices, policyNoticeResponseUPSdk.policyNotices) && this.status_code == policyNoticeResponseUPSdk.status_code && o.LJ(this.status_msg, policyNoticeResponseUPSdk.status_msg);
    }

    public int hashCode() {
        int hashCode = ((this.policyNotices.hashCode() * 31) + this.status_code) * 31;
        String str = this.status_msg;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PolicyNoticeResponseUPSdk(policyNotices=");
        LIZ.append(this.policyNotices);
        LIZ.append(", status_code=");
        LIZ.append(this.status_code);
        LIZ.append(", status_msg=");
        LIZ.append((Object) this.status_msg);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final List<PolicyNoticeUPSdk> getPolicyNotices() {
        return this.policyNotices;
    }

    public final int getStatus_code() {
        return this.status_code;
    }

    public final String getStatus_msg() {
        return this.status_msg;
    }

    public PolicyNoticeResponseUPSdk(List<PolicyNoticeUPSdk> policyNotices, int i, String str) {
        o.LJIIIZ(policyNotices, "policyNotices");
        this.policyNotices = policyNotices;
        this.status_code = i;
        this.status_msg = str;
    }

    public PolicyNoticeResponseUPSdk(List list, int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? C61878OQg.INSTANCE : list, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? "" : str);
    }
}
