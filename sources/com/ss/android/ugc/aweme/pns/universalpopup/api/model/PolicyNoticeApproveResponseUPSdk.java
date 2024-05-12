package com.ss.android.ugc.aweme.pns.universalpopup.api.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class PolicyNoticeApproveResponseUPSdk implements Serializable {

    @InterfaceC65349Pkn("status_code")
    public final int status_code;

    @InterfaceC65349Pkn("status_msg")
    public final String status_msg;

    /* JADX WARN: Multi-variable type inference failed */
    public PolicyNoticeApproveResponseUPSdk() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ PolicyNoticeApproveResponseUPSdk copy$default(PolicyNoticeApproveResponseUPSdk policyNoticeApproveResponseUPSdk, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = policyNoticeApproveResponseUPSdk.status_code;
        }
        if ((i2 & 2) != 0) {
            str = policyNoticeApproveResponseUPSdk.status_msg;
        }
        return policyNoticeApproveResponseUPSdk.copy(i, str);
    }

    public final PolicyNoticeApproveResponseUPSdk copy(int i, String str) {
        return new PolicyNoticeApproveResponseUPSdk(i, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PolicyNoticeApproveResponseUPSdk)) {
            return false;
        }
        PolicyNoticeApproveResponseUPSdk policyNoticeApproveResponseUPSdk = (PolicyNoticeApproveResponseUPSdk) obj;
        return this.status_code == policyNoticeApproveResponseUPSdk.status_code && o.LJ(this.status_msg, policyNoticeApproveResponseUPSdk.status_msg);
    }

    public int hashCode() {
        int i = this.status_code * 31;
        String str = this.status_msg;
        return i + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PolicyNoticeApproveResponseUPSdk(status_code=");
        LIZ.append(this.status_code);
        LIZ.append(", status_msg=");
        LIZ.append((Object) this.status_msg);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final int getStatus_code() {
        return this.status_code;
    }

    public final String getStatus_msg() {
        return this.status_msg;
    }

    public PolicyNoticeApproveResponseUPSdk(int i, String str) {
        this.status_code = i;
        this.status_msg = str;
    }

    public /* synthetic */ PolicyNoticeApproveResponseUPSdk(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str);
    }
}
