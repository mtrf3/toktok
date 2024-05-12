package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class CheckLawfulRequest {

    @InterfaceC65349Pkn("phone_credit")
    public final PhoneCredit phoneCredit;

    @InterfaceC65349Pkn("type")
    public final Integer type;

    public static /* synthetic */ CheckLawfulRequest copy$default(CheckLawfulRequest checkLawfulRequest, Integer num, PhoneCredit phoneCredit, int i, Object obj) {
        if ((i & 1) != 0) {
            num = checkLawfulRequest.type;
        }
        if ((i & 2) != 0) {
            phoneCredit = checkLawfulRequest.phoneCredit;
        }
        return checkLawfulRequest.copy(num, phoneCredit);
    }

    public final CheckLawfulRequest copy(Integer num, PhoneCredit phoneCredit) {
        return new CheckLawfulRequest(num, phoneCredit);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckLawfulRequest)) {
            return false;
        }
        CheckLawfulRequest checkLawfulRequest = (CheckLawfulRequest) obj;
        return o.LJ(this.type, checkLawfulRequest.type) && o.LJ(this.phoneCredit, checkLawfulRequest.phoneCredit);
    }

    public int hashCode() {
        Integer num = this.type;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        PhoneCredit phoneCredit = this.phoneCredit;
        return hashCode + (phoneCredit != null ? phoneCredit.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CheckLawfulRequest(type=");
        LIZ.append(this.type);
        LIZ.append(", phoneCredit=");
        LIZ.append(this.phoneCredit);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final PhoneCredit getPhoneCredit() {
        return this.phoneCredit;
    }

    public final Integer getType() {
        return this.type;
    }

    public CheckLawfulRequest(Integer num, PhoneCredit phoneCredit) {
        this.type = num;
        this.phoneCredit = phoneCredit;
    }
}
