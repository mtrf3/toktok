package com.ss.android.ugc.aweme.compliance.api.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class PolicyBodyLinkList implements Serializable {

    @InterfaceC65349Pkn("approve")
    public final Boolean approve;

    @InterfaceC65349Pkn("dismiss")
    public final Boolean dismiss;

    @InterfaceC65349Pkn("extra")
    public final String extra;

    @InterfaceC65349Pkn("link")
    public final String link;

    @InterfaceC65349Pkn("name")
    public final String name;

    @InterfaceC65349Pkn("operation")
    public final Integer operation;

    /* JADX WARN: Multi-variable type inference failed */
    public PolicyBodyLinkList() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 63, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ PolicyBodyLinkList copy$default(PolicyBodyLinkList policyBodyLinkList, String str, String str2, Boolean bool, Integer num, Boolean bool2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = policyBodyLinkList.name;
        }
        if ((i & 2) != 0) {
            str2 = policyBodyLinkList.link;
        }
        if ((i & 4) != 0) {
            bool = policyBodyLinkList.approve;
        }
        if ((i & 8) != 0) {
            num = policyBodyLinkList.operation;
        }
        if ((i & 16) != 0) {
            bool2 = policyBodyLinkList.dismiss;
        }
        if ((i & 32) != 0) {
            str3 = policyBodyLinkList.extra;
        }
        return policyBodyLinkList.copy(str, str2, bool, num, bool2, str3);
    }

    public final PolicyBodyLinkList copy(String str, String str2, Boolean bool, Integer num, Boolean bool2, String extra) {
        o.LJIIIZ(extra, "extra");
        return new PolicyBodyLinkList(str, str2, bool, num, bool2, extra);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PolicyBodyLinkList)) {
            return false;
        }
        PolicyBodyLinkList policyBodyLinkList = (PolicyBodyLinkList) obj;
        return o.LJ(this.name, policyBodyLinkList.name) && o.LJ(this.link, policyBodyLinkList.link) && o.LJ(this.approve, policyBodyLinkList.approve) && o.LJ(this.operation, policyBodyLinkList.operation) && o.LJ(this.dismiss, policyBodyLinkList.dismiss) && o.LJ(this.extra, policyBodyLinkList.extra);
    }

    public int hashCode() {
        String str = this.name;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.link;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.approve;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.operation;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool2 = this.dismiss;
        return this.extra.hashCode() + ((hashCode4 + (bool2 != null ? bool2.hashCode() : 0)) * 31);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PolicyBodyLinkList(name=");
        LIZ.append(this.name);
        LIZ.append(", link=");
        LIZ.append(this.link);
        LIZ.append(", approve=");
        LIZ.append(this.approve);
        LIZ.append(", operation=");
        LIZ.append(this.operation);
        LIZ.append(", dismiss=");
        LIZ.append(this.dismiss);
        LIZ.append(", extra=");
        return q.LIZIZ(LIZ, this.extra, ')', LIZ);
    }

    public final Boolean getApprove() {
        return this.approve;
    }

    public final Boolean getDismiss() {
        return this.dismiss;
    }

    public final String getExtra() {
        return this.extra;
    }

    public final String getLink() {
        return this.link;
    }

    public final String getName() {
        return this.name;
    }

    public final Integer getOperation() {
        return this.operation;
    }

    public PolicyBodyLinkList(String str, String str2, Boolean bool, Integer num, Boolean bool2, String extra) {
        o.LJIIIZ(extra, "extra");
        this.name = str;
        this.link = str2;
        this.approve = bool;
        this.operation = num;
        this.dismiss = bool2;
        this.extra = extra;
    }

    public /* synthetic */ PolicyBodyLinkList(String str, String str2, Boolean bool, Integer num, Boolean bool2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? Boolean.FALSE : bool, (i & 8) != 0 ? null : num, (i & 16) != 0 ? Boolean.FALSE : bool2, (i & 32) == 0 ? str3 : "");
    }
}
