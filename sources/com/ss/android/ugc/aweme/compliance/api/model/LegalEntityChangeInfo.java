package com.ss.android.ugc.aweme.compliance.api.model;

import X.C1NE;
import X.C61878OQg;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class LegalEntityChangeInfo implements Serializable {

    @InterfaceC65349Pkn("body")
    public final String body;

    @InterfaceC65349Pkn("content_link_list")
    public final List<PolicyBodyLinkList> bodyLinkList;

    @InterfaceC65349Pkn("title")
    public final String title;

    public LegalEntityChangeInfo() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LegalEntityChangeInfo copy$default(LegalEntityChangeInfo legalEntityChangeInfo, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = legalEntityChangeInfo.title;
        }
        if ((i & 2) != 0) {
            str2 = legalEntityChangeInfo.body;
        }
        if ((i & 4) != 0) {
            list = legalEntityChangeInfo.bodyLinkList;
        }
        return legalEntityChangeInfo.copy(str, str2, list);
    }

    public final LegalEntityChangeInfo copy(String str, String str2, List<PolicyBodyLinkList> list) {
        return new LegalEntityChangeInfo(str, str2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LegalEntityChangeInfo)) {
            return false;
        }
        LegalEntityChangeInfo legalEntityChangeInfo = (LegalEntityChangeInfo) obj;
        return o.LJ(this.title, legalEntityChangeInfo.title) && o.LJ(this.body, legalEntityChangeInfo.body) && o.LJ(this.bodyLinkList, legalEntityChangeInfo.bodyLinkList);
    }

    public int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.body;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<PolicyBodyLinkList> list = this.bodyLinkList;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LegalEntityChangeInfo(title=");
        LIZ.append(this.title);
        LIZ.append(", body=");
        LIZ.append(this.body);
        LIZ.append(", bodyLinkList=");
        return C1NE.LIZIZ(LIZ, this.bodyLinkList, ')', LIZ);
    }

    public final String getBody() {
        return this.body;
    }

    public final List<PolicyBodyLinkList> getBodyLinkList() {
        return this.bodyLinkList;
    }

    public final String getTitle() {
        return this.title;
    }

    public LegalEntityChangeInfo(String str, String str2, List<PolicyBodyLinkList> list) {
        this.title = str;
        this.body = str2;
        this.bodyLinkList = list;
    }

    public LegalEntityChangeInfo(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? C61878OQg.INSTANCE : list);
    }
}
