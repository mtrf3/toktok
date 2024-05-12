package com.ss.android.ugc.aweme.pns.universalpopup.api.model;

import X.AnonymousClass391;
import X.C61878OQg;
import X.C79062V1e;
import X.InterfaceC65349Pkn;
import X.UPJ;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class PolicyNoticeUPSdk implements Serializable {

    @InterfaceC65349Pkn("actions")
    public final List<PolicyNoticeActionUPSdk> actions;

    @InterfaceC65349Pkn("body")
    public final String body;

    @InterfaceC65349Pkn("business")
    public final String business;

    @InterfaceC65349Pkn("first_button_highlight")
    public final Boolean firstButtonHighlight;

    @InterfaceC65349Pkn("icon_url")
    public final String icon_url;

    @InterfaceC65349Pkn("sub_pop_up")
    public final Boolean isSubPopUp;

    @InterfaceC65349Pkn("body_link_list")
    public final List<PolicyBodyLinkListUPSdk> policyLinkList;

    @InterfaceC65349Pkn("policy_version")
    public final String policyVersion;

    @InterfaceC65349Pkn("style")
    public final String style;

    @InterfaceC65349Pkn("title")
    public final String title;

    @InterfaceC65349Pkn("upper_right_close")
    public final int upperRightClose;

    public PolicyNoticeUPSdk() {
        this(null, null, null, null, null, null, null, null, null, null, 0, 2047, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PolicyNoticeUPSdk copy$default(PolicyNoticeUPSdk policyNoticeUPSdk, String str, String str2, String str3, String str4, String str5, List list, String str6, List list2, Boolean bool, Boolean bool2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = policyNoticeUPSdk.business;
        }
        if ((i2 & 2) != 0) {
            str2 = policyNoticeUPSdk.policyVersion;
        }
        if ((i2 & 4) != 0) {
            str3 = policyNoticeUPSdk.style;
        }
        if ((i2 & 8) != 0) {
            str4 = policyNoticeUPSdk.title;
        }
        if ((i2 & 16) != 0) {
            str5 = policyNoticeUPSdk.body;
        }
        if ((i2 & 32) != 0) {
            list = policyNoticeUPSdk.actions;
        }
        if ((i2 & 64) != 0) {
            str6 = policyNoticeUPSdk.icon_url;
        }
        if ((i2 & 128) != 0) {
            list2 = policyNoticeUPSdk.policyLinkList;
        }
        if ((i2 & 256) != 0) {
            bool = policyNoticeUPSdk.isSubPopUp;
        }
        if ((i2 & 512) != 0) {
            bool2 = policyNoticeUPSdk.firstButtonHighlight;
        }
        if ((i2 & 1024) != 0) {
            i = policyNoticeUPSdk.upperRightClose;
        }
        return policyNoticeUPSdk.copy(str, str2, str3, str4, str5, list, str6, list2, bool, bool2, i);
    }

    public final PolicyNoticeUPSdk copy(String business, String policyVersion, String style, String title, String body, List<PolicyNoticeActionUPSdk> actions, String icon_url, List<PolicyBodyLinkListUPSdk> list, Boolean bool, Boolean bool2, int i) {
        o.LJIIIZ(business, "business");
        o.LJIIIZ(policyVersion, "policyVersion");
        o.LJIIIZ(style, "style");
        o.LJIIIZ(title, "title");
        o.LJIIIZ(body, "body");
        o.LJIIIZ(actions, "actions");
        o.LJIIIZ(icon_url, "icon_url");
        return new PolicyNoticeUPSdk(business, policyVersion, style, title, body, actions, icon_url, list, bool, bool2, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PolicyNoticeUPSdk)) {
            return false;
        }
        PolicyNoticeUPSdk policyNoticeUPSdk = (PolicyNoticeUPSdk) obj;
        return o.LJ(this.business, policyNoticeUPSdk.business) && o.LJ(this.policyVersion, policyNoticeUPSdk.policyVersion) && o.LJ(this.style, policyNoticeUPSdk.style) && o.LJ(this.title, policyNoticeUPSdk.title) && o.LJ(this.body, policyNoticeUPSdk.body) && o.LJ(this.actions, policyNoticeUPSdk.actions) && o.LJ(this.icon_url, policyNoticeUPSdk.icon_url) && o.LJ(this.policyLinkList, policyNoticeUPSdk.policyLinkList) && o.LJ(this.isSubPopUp, policyNoticeUPSdk.isSubPopUp) && o.LJ(this.firstButtonHighlight, policyNoticeUPSdk.firstButtonHighlight) && this.upperRightClose == policyNoticeUPSdk.upperRightClose;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int LJ = C79062V1e.LJ(this.icon_url, AnonymousClass391.LIZIZ(this.actions, C79062V1e.LJ(this.body, C79062V1e.LJ(this.title, C79062V1e.LJ(this.style, C79062V1e.LJ(this.policyVersion, this.business.hashCode() * 31, 31), 31), 31), 31), 31), 31);
        List<PolicyBodyLinkListUPSdk> list = this.policyLinkList;
        int i = 0;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i2 = (LJ + hashCode) * 31;
        Boolean bool = this.isSubPopUp;
        if (bool == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = bool.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Boolean bool2 = this.firstButtonHighlight;
        if (bool2 != null) {
            i = bool2.hashCode();
        }
        return ((i3 + i) * 31) + this.upperRightClose;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PolicyNoticeUPSdk(business=");
        sb.append(this.business);
        sb.append(", policyVersion=");
        sb.append(this.policyVersion);
        sb.append(", style=");
        sb.append(this.style);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", body=");
        sb.append(this.body);
        sb.append(", actions=");
        sb.append(this.actions);
        sb.append(", icon_url=");
        sb.append(this.icon_url);
        sb.append(", policyLinkList=");
        sb.append(this.policyLinkList);
        sb.append(", isSubPopUp=");
        sb.append(this.isSubPopUp);
        sb.append(", firstButtonHighlight=");
        sb.append(this.firstButtonHighlight);
        sb.append(", upperRightClose=");
        return UPJ.LIZLLL(sb, this.upperRightClose, ')');
    }

    public final List<PolicyNoticeActionUPSdk> getActions() {
        return this.actions;
    }

    public final String getBody() {
        return this.body;
    }

    public final String getBusiness() {
        return this.business;
    }

    public final Boolean getFirstButtonHighlight() {
        return this.firstButtonHighlight;
    }

    public final String getIcon_url() {
        return this.icon_url;
    }

    public final List<PolicyBodyLinkListUPSdk> getPolicyLinkList() {
        return this.policyLinkList;
    }

    public final String getPolicyVersion() {
        return this.policyVersion;
    }

    public final String getStyle() {
        return this.style;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int getUpperRightClose() {
        return this.upperRightClose;
    }

    public final Boolean isSubPopUp() {
        return this.isSubPopUp;
    }

    public PolicyNoticeUPSdk(String business, String policyVersion, String style, String title, String body, List<PolicyNoticeActionUPSdk> actions, String icon_url, List<PolicyBodyLinkListUPSdk> list, Boolean bool, Boolean bool2, int i) {
        o.LJIIIZ(business, "business");
        o.LJIIIZ(policyVersion, "policyVersion");
        o.LJIIIZ(style, "style");
        o.LJIIIZ(title, "title");
        o.LJIIIZ(body, "body");
        o.LJIIIZ(actions, "actions");
        o.LJIIIZ(icon_url, "icon_url");
        this.business = business;
        this.policyVersion = policyVersion;
        this.style = style;
        this.title = title;
        this.body = body;
        this.actions = actions;
        this.icon_url = icon_url;
        this.policyLinkList = list;
        this.isSubPopUp = bool;
        this.firstButtonHighlight = bool2;
        this.upperRightClose = i;
    }

    public PolicyNoticeUPSdk(String str, String str2, String str3, String str4, String str5, List list, String str6, List list2, Boolean bool, Boolean bool2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? "" : str5, (i2 & 32) != 0 ? C61878OQg.INSTANCE : list, (i2 & 64) == 0 ? str6 : "", (i2 & 128) != 0 ? C61878OQg.INSTANCE : list2, (i2 & 256) != 0 ? Boolean.FALSE : bool, (i2 & 512) != 0 ? Boolean.FALSE : bool2, (i2 & 1024) != 0 ? 0 : i);
    }
}
