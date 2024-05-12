package com.ss.android.ugc.aweme.compliance.protection.common.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class FamilyPairingBean {

    @InterfaceC65349Pkn("restriction")
    public final GuardianRestrictionBean restriction;

    @InterfaceC65349Pkn("user_identity")
    public final Integer userIdentity;

    /* JADX WARN: Multi-variable type inference failed */
    public FamilyPairingBean() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FamilyPairingBean)) {
            return false;
        }
        FamilyPairingBean familyPairingBean = (FamilyPairingBean) obj;
        return o.LJ(this.userIdentity, familyPairingBean.userIdentity) && o.LJ(this.restriction, familyPairingBean.restriction);
    }

    public final int hashCode() {
        Integer num = this.userIdentity;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        GuardianRestrictionBean guardianRestrictionBean = this.restriction;
        return hashCode + (guardianRestrictionBean != null ? guardianRestrictionBean.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FamilyPairingBean(userIdentity=");
        LIZ.append(this.userIdentity);
        LIZ.append(", restriction=");
        LIZ.append(this.restriction);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public FamilyPairingBean(Integer num, GuardianRestrictionBean guardianRestrictionBean) {
        this.userIdentity = num;
        this.restriction = guardianRestrictionBean;
    }

    public /* synthetic */ FamilyPairingBean(Integer num, GuardianRestrictionBean guardianRestrictionBean, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 1 : num, (i & 2) != 0 ? new GuardianRestrictionBean(null, null, null, null, null, null, 0, null, 255, null) : guardianRestrictionBean);
    }
}
