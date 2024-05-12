package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PolicyModule {

    @InterfaceC65349Pkn("policy_statements")
    public final List<PolicyStatement> policyStatements;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PolicyModule copy$default(PolicyModule policyModule, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = policyModule.policyStatements;
        }
        return policyModule.copy(list);
    }

    public final PolicyModule copy(List<PolicyStatement> list) {
        return new PolicyModule(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PolicyModule) && o.LJ(this.policyStatements, ((PolicyModule) obj).policyStatements);
    }

    public int hashCode() {
        List<PolicyStatement> list = this.policyStatements;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PolicyModule(policyStatements=");
        return C1NE.LIZIZ(LIZ, this.policyStatements, ')', LIZ);
    }

    public final List<PolicyStatement> getPolicyStatements() {
        return this.policyStatements;
    }

    public PolicyModule(List<PolicyStatement> list) {
        this.policyStatements = list;
    }
}
