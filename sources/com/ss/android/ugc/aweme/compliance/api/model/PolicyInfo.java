package com.ss.android.ugc.aweme.compliance.api.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class PolicyInfo implements Serializable {

    @InterfaceC65349Pkn("policy_key")
    public final String policyKey;

    @InterfaceC65349Pkn("policy_url")
    public final String policyUrl;

    /* JADX WARN: Multi-variable type inference failed */
    public PolicyInfo() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ PolicyInfo copy$default(PolicyInfo policyInfo, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = policyInfo.policyKey;
        }
        if ((i & 2) != 0) {
            str2 = policyInfo.policyUrl;
        }
        return policyInfo.copy(str, str2);
    }

    public final PolicyInfo copy(String str, String str2) {
        return new PolicyInfo(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PolicyInfo)) {
            return false;
        }
        PolicyInfo policyInfo = (PolicyInfo) obj;
        return o.LJ(this.policyKey, policyInfo.policyKey) && o.LJ(this.policyUrl, policyInfo.policyUrl);
    }

    public int hashCode() {
        String str = this.policyKey;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.policyUrl;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PolicyInfo(policyKey=");
        LIZ.append(this.policyKey);
        LIZ.append(", policyUrl=");
        return q.LIZIZ(LIZ, this.policyUrl, ')', LIZ);
    }

    public final String getPolicyKey() {
        return this.policyKey;
    }

    public final String getPolicyUrl() {
        return this.policyUrl;
    }

    public PolicyInfo(String str, String str2) {
        this.policyKey = str;
        this.policyUrl = str2;
    }

    public /* synthetic */ PolicyInfo(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
