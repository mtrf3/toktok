package com.ss.android.ugc.aweme.compliance.api.model;

import X.C61878OQg;
import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class CopyWritingInfo implements Serializable {

    @InterfaceC65349Pkn("check")
    public final String checkSettings;

    @InterfaceC65349Pkn("confirm")
    public final String confirm;

    @InterfaceC65349Pkn("policy_link_list")
    public final List<String> policyLinkList;

    @InterfaceC65349Pkn("policy_list")
    public final List<String> policyList;

    @InterfaceC65349Pkn("subtext")
    public final String subtext;

    @InterfaceC65349Pkn("title")
    public final String title;

    public CopyWritingInfo() {
        this(null, null, null, null, null, null, 63, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CopyWritingInfo copy$default(CopyWritingInfo copyWritingInfo, String str, String str2, List list, List list2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = copyWritingInfo.title;
        }
        if ((i & 2) != 0) {
            str2 = copyWritingInfo.subtext;
        }
        if ((i & 4) != 0) {
            list = copyWritingInfo.policyList;
        }
        if ((i & 8) != 0) {
            list2 = copyWritingInfo.policyLinkList;
        }
        if ((i & 16) != 0) {
            str3 = copyWritingInfo.confirm;
        }
        if ((i & 32) != 0) {
            str4 = copyWritingInfo.checkSettings;
        }
        return copyWritingInfo.copy(str, str2, list, list2, str3, str4);
    }

    public final CopyWritingInfo copy(String str, String str2, List<String> list, List<String> list2, String str3, String str4) {
        return new CopyWritingInfo(str, str2, list, list2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CopyWritingInfo)) {
            return false;
        }
        CopyWritingInfo copyWritingInfo = (CopyWritingInfo) obj;
        return o.LJ(this.title, copyWritingInfo.title) && o.LJ(this.subtext, copyWritingInfo.subtext) && o.LJ(this.policyList, copyWritingInfo.policyList) && o.LJ(this.policyLinkList, copyWritingInfo.policyLinkList) && o.LJ(this.confirm, copyWritingInfo.confirm) && o.LJ(this.checkSettings, copyWritingInfo.checkSettings);
    }

    public int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.subtext;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.policyList;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.policyLinkList;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str3 = this.confirm;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.checkSettings;
        return hashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CopyWritingInfo(title=");
        LIZ.append(this.title);
        LIZ.append(", subtext=");
        LIZ.append(this.subtext);
        LIZ.append(", policyList=");
        LIZ.append(this.policyList);
        LIZ.append(", policyLinkList=");
        LIZ.append(this.policyLinkList);
        LIZ.append(", confirm=");
        LIZ.append(this.confirm);
        LIZ.append(", checkSettings=");
        return q.LIZIZ(LIZ, this.checkSettings, ')', LIZ);
    }

    public final String getCheckSettings() {
        return this.checkSettings;
    }

    public final String getConfirm() {
        return this.confirm;
    }

    public final List<String> getPolicyLinkList() {
        return this.policyLinkList;
    }

    public final List<String> getPolicyList() {
        return this.policyList;
    }

    public final String getSubtext() {
        return this.subtext;
    }

    public final String getTitle() {
        return this.title;
    }

    public CopyWritingInfo(String str, String str2, List<String> list, List<String> list2, String str3, String str4) {
        this.title = str;
        this.subtext = str2;
        this.policyList = list;
        this.policyLinkList = list2;
        this.confirm = str3;
        this.checkSettings = str4;
    }

    public CopyWritingInfo(String str, String str2, List list, List list2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? C61878OQg.INSTANCE : list, (i & 8) != 0 ? C61878OQg.INSTANCE : list2, (i & 16) != 0 ? "" : str3, (i & 32) == 0 ? str4 : "");
    }
}
