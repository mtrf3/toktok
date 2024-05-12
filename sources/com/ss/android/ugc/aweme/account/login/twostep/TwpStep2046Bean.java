package com.ss.android.ugc.aweme.account.login.twostep;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class TwpStep2046Bean implements Serializable {

    @InterfaceC65349Pkn("default_verify_way")
    public final String default_verify_way;

    @InterfaceC65349Pkn("not_login_ticket")
    public final String not_login_ticket;

    @InterfaceC65349Pkn("verify_ticket")
    public final String verify_ticket;

    @InterfaceC65349Pkn("verify_ways")
    public final ArrayList<TwoStepVerifyWays> verify_ways;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TwpStep2046Bean copy$default(TwpStep2046Bean twpStep2046Bean, String str, String str2, ArrayList arrayList, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = twpStep2046Bean.verify_ticket;
        }
        if ((i & 2) != 0) {
            str2 = twpStep2046Bean.default_verify_way;
        }
        if ((i & 4) != 0) {
            arrayList = twpStep2046Bean.verify_ways;
        }
        if ((i & 8) != 0) {
            str3 = twpStep2046Bean.not_login_ticket;
        }
        return twpStep2046Bean.copy(str, str2, arrayList, str3);
    }

    public final TwpStep2046Bean copy(String str, String str2, ArrayList<TwoStepVerifyWays> arrayList, String str3) {
        return new TwpStep2046Bean(str, str2, arrayList, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TwpStep2046Bean)) {
            return false;
        }
        TwpStep2046Bean twpStep2046Bean = (TwpStep2046Bean) obj;
        return o.LJ(this.verify_ticket, twpStep2046Bean.verify_ticket) && o.LJ(this.default_verify_way, twpStep2046Bean.default_verify_way) && o.LJ(this.verify_ways, twpStep2046Bean.verify_ways) && o.LJ(this.not_login_ticket, twpStep2046Bean.not_login_ticket);
    }

    public int hashCode() {
        String str = this.verify_ticket;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.default_verify_way;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ArrayList<TwoStepVerifyWays> arrayList = this.verify_ways;
        int hashCode3 = (hashCode2 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        String str3 = this.not_login_ticket;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TwpStep2046Bean(verify_ticket=");
        LIZ.append(this.verify_ticket);
        LIZ.append(", default_verify_way=");
        LIZ.append(this.default_verify_way);
        LIZ.append(", verify_ways=");
        LIZ.append(this.verify_ways);
        LIZ.append(", not_login_ticket=");
        return q.LIZIZ(LIZ, this.not_login_ticket, ')', LIZ);
    }

    public final String getDefault_verify_way() {
        return this.default_verify_way;
    }

    public final String getNot_login_ticket() {
        return this.not_login_ticket;
    }

    public final String getVerify_ticket() {
        return this.verify_ticket;
    }

    public final ArrayList<TwoStepVerifyWays> getVerify_ways() {
        return this.verify_ways;
    }

    public TwpStep2046Bean(String str, String str2, ArrayList<TwoStepVerifyWays> arrayList, String str3) {
        this.verify_ticket = str;
        this.default_verify_way = str2;
        this.verify_ways = arrayList;
        this.not_login_ticket = str3;
    }
}
