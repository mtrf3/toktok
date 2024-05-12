package com.ss.android.ugc.aweme.pns.universalpopup.api.model;

import X.AnonymousClass391;
import X.C61878OQg;
import X.C79062V1e;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class UniversalPopup implements Serializable {

    @InterfaceC65349Pkn("body")
    public final String body;

    @InterfaceC65349Pkn("business")
    public final String business;

    @InterfaceC65349Pkn("buttons")
    public final List<UniversalPopupButton> buttons;

    @InterfaceC65349Pkn("extra")
    public final Map<String, String> extra;

    @InterfaceC65349Pkn("first_button_highlight")
    public final Boolean firstButtonHighlight;

    @InterfaceC65349Pkn("icon_url")
    public final String icon_url;

    @InterfaceC65349Pkn("icon_url_dark")
    public final String icon_url_dark;

    @InterfaceC65349Pkn("sub_pop_up")
    public final Boolean isSubPopUp;

    @InterfaceC65349Pkn("policy_version")
    public final String policyVersion;

    @InterfaceC65349Pkn("body_link_list")
    public final List<UniversalPopupBodyLinkList> popupLinkList;

    @InterfaceC65349Pkn("style")
    public final String style;

    @InterfaceC65349Pkn("title")
    public final String title;

    public UniversalPopup() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UniversalPopup copy$default(UniversalPopup universalPopup, String str, String str2, String str3, String str4, String str5, List list, String str6, String str7, List list2, Boolean bool, Boolean bool2, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = universalPopup.business;
        }
        if ((i & 2) != 0) {
            str2 = universalPopup.policyVersion;
        }
        if ((i & 4) != 0) {
            str3 = universalPopup.style;
        }
        if ((i & 8) != 0) {
            str4 = universalPopup.title;
        }
        if ((i & 16) != 0) {
            str5 = universalPopup.body;
        }
        if ((i & 32) != 0) {
            list = universalPopup.buttons;
        }
        if ((i & 64) != 0) {
            str6 = universalPopup.icon_url;
        }
        if ((i & 128) != 0) {
            str7 = universalPopup.icon_url_dark;
        }
        if ((i & 256) != 0) {
            list2 = universalPopup.popupLinkList;
        }
        if ((i & 512) != 0) {
            bool = universalPopup.isSubPopUp;
        }
        if ((i & 1024) != 0) {
            bool2 = universalPopup.firstButtonHighlight;
        }
        if ((i & 2048) != 0) {
            map = universalPopup.extra;
        }
        return universalPopup.copy(str, str2, str3, str4, str5, list, str6, str7, list2, bool, bool2, map);
    }

    public final UniversalPopup copy(String business, String policyVersion, String style, String title, String body, List<UniversalPopupButton> buttons, String icon_url, String icon_url_dark, List<UniversalPopupBodyLinkList> list, Boolean bool, Boolean bool2, Map<String, String> map) {
        o.LJIIIZ(business, "business");
        o.LJIIIZ(policyVersion, "policyVersion");
        o.LJIIIZ(style, "style");
        o.LJIIIZ(title, "title");
        o.LJIIIZ(body, "body");
        o.LJIIIZ(buttons, "buttons");
        o.LJIIIZ(icon_url, "icon_url");
        o.LJIIIZ(icon_url_dark, "icon_url_dark");
        return new UniversalPopup(business, policyVersion, style, title, body, buttons, icon_url, icon_url_dark, list, bool, bool2, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UniversalPopup)) {
            return false;
        }
        UniversalPopup universalPopup = (UniversalPopup) obj;
        return o.LJ(this.business, universalPopup.business) && o.LJ(this.policyVersion, universalPopup.policyVersion) && o.LJ(this.style, universalPopup.style) && o.LJ(this.title, universalPopup.title) && o.LJ(this.body, universalPopup.body) && o.LJ(this.buttons, universalPopup.buttons) && o.LJ(this.icon_url, universalPopup.icon_url) && o.LJ(this.icon_url_dark, universalPopup.icon_url_dark) && o.LJ(this.popupLinkList, universalPopup.popupLinkList) && o.LJ(this.isSubPopUp, universalPopup.isSubPopUp) && o.LJ(this.firstButtonHighlight, universalPopup.firstButtonHighlight) && o.LJ(this.extra, universalPopup.extra);
    }

    public String toString() {
        return "UniversalPopup(business=" + this.business + ", policyVersion=" + this.policyVersion + ", style=" + this.style + ", title=" + this.title + ", body=" + this.body + ", buttons=" + this.buttons + ", icon_url=" + this.icon_url + ", icon_url_dark=" + this.icon_url_dark + ", popupLinkList=" + this.popupLinkList + ", isSubPopUp=" + this.isSubPopUp + ", firstButtonHighlight=" + this.firstButtonHighlight + ", extra=" + this.extra + ')';
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int LJ = C79062V1e.LJ(this.icon_url_dark, C79062V1e.LJ(this.icon_url, AnonymousClass391.LIZIZ(this.buttons, C79062V1e.LJ(this.body, C79062V1e.LJ(this.title, C79062V1e.LJ(this.style, C79062V1e.LJ(this.policyVersion, this.business.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31);
        List<UniversalPopupBodyLinkList> list = this.popupLinkList;
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
        if (bool2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = bool2.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        Map<String, String> map = this.extra;
        if (map != null) {
            i = map.hashCode();
        }
        return i4 + i;
    }

    public final String getBody() {
        return this.body;
    }

    public final String getBusiness() {
        return this.business;
    }

    public final List<UniversalPopupButton> getButtons() {
        return this.buttons;
    }

    public final Map<String, String> getExtra() {
        return this.extra;
    }

    public final Boolean getFirstButtonHighlight() {
        return this.firstButtonHighlight;
    }

    public final String getIcon_url() {
        return this.icon_url;
    }

    public final String getIcon_url_dark() {
        return this.icon_url_dark;
    }

    public final String getPolicyVersion() {
        return this.policyVersion;
    }

    public final List<UniversalPopupBodyLinkList> getPopupLinkList() {
        return this.popupLinkList;
    }

    public final String getStyle() {
        return this.style;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Boolean isSubPopUp() {
        return this.isSubPopUp;
    }

    public UniversalPopup(String business, String policyVersion, String style, String title, String body, List<UniversalPopupButton> buttons, String icon_url, String icon_url_dark, List<UniversalPopupBodyLinkList> list, Boolean bool, Boolean bool2, Map<String, String> map) {
        o.LJIIIZ(business, "business");
        o.LJIIIZ(policyVersion, "policyVersion");
        o.LJIIIZ(style, "style");
        o.LJIIIZ(title, "title");
        o.LJIIIZ(body, "body");
        o.LJIIIZ(buttons, "buttons");
        o.LJIIIZ(icon_url, "icon_url");
        o.LJIIIZ(icon_url_dark, "icon_url_dark");
        this.business = business;
        this.policyVersion = policyVersion;
        this.style = style;
        this.title = title;
        this.body = body;
        this.buttons = buttons;
        this.icon_url = icon_url;
        this.icon_url_dark = icon_url_dark;
        this.popupLinkList = list;
        this.isSubPopUp = bool;
        this.firstButtonHighlight = bool2;
        this.extra = map;
    }

    public UniversalPopup(String str, String str2, String str3, String str4, String str5, List list, String str6, String str7, List list2, Boolean bool, Boolean bool2, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? C61878OQg.INSTANCE : list, (i & 64) != 0 ? "" : str6, (i & 128) == 0 ? str7 : "", (i & 256) != 0 ? C61878OQg.INSTANCE : list2, (i & 512) != 0 ? Boolean.FALSE : bool, (i & 1024) != 0 ? Boolean.FALSE : bool2, (i & 2048) != 0 ? null : map);
    }
}
