package com.ss.android.ugc.aweme.account.login.twostep;

import X.C78920UyC;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class VerifyWay implements Serializable {

    @InterfaceC65349Pkn("is_available")
    public final Boolean is_available;

    @InterfaceC65349Pkn("verify_way")
    public final String verify_way;

    public static /* synthetic */ VerifyWay copy$default(VerifyWay verifyWay, String str, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = verifyWay.verify_way;
        }
        if ((i & 2) != 0) {
            bool = verifyWay.is_available;
        }
        return verifyWay.copy(str, bool);
    }

    public final VerifyWay copy(String str, Boolean bool) {
        return new VerifyWay(str, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VerifyWay)) {
            return false;
        }
        VerifyWay verifyWay = (VerifyWay) obj;
        return o.LJ(this.verify_way, verifyWay.verify_way) && o.LJ(this.is_available, verifyWay.is_available);
    }

    public int hashCode() {
        String str = this.verify_way;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.is_available;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VerifyWay(verify_way=");
        LIZ.append(this.verify_way);
        LIZ.append(", is_available=");
        return C78920UyC.LIZIZ(LIZ, this.is_available, ')', LIZ);
    }

    public final String getVerify_way() {
        return this.verify_way;
    }

    public final Boolean is_available() {
        return this.is_available;
    }

    public VerifyWay(String str, Boolean bool) {
        this.verify_way = str;
        this.is_available = bool;
    }
}
