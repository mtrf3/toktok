package com.ss.android.ugc.aweme.compliance.api.model;

import X.C43588H8u;
import X.C79062V1e;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class PolicyNoticeAction implements Serializable {

    @InterfaceC65349Pkn("approve")
    public final boolean approve;

    @InterfaceC65349Pkn("dismiss")
    public final Boolean dismiss;

    @InterfaceC65349Pkn("dismiss_all")
    public final Boolean dismissAll;

    @InterfaceC65349Pkn("extra")
    public final String extra;

    @InterfaceC65349Pkn("is_bold")
    public final boolean isBold;

    @InterfaceC65349Pkn("link")
    public final String link;

    @InterfaceC65349Pkn("link_type")
    public final String linkType;

    @InterfaceC65349Pkn("next_pop_up")
    public final String nextPopUp;

    @InterfaceC65349Pkn("operation")
    public final Integer operation;

    @InterfaceC65349Pkn("re_get_settings")
    public final Boolean reGetSettings;

    @InterfaceC65349Pkn("text")
    public final String text;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public PolicyNoticeAction() {
        /*
            r14 = this;
            r1 = 0
            r2 = 0
            r12 = 2047(0x7ff, float:2.868E-42)
            r0 = r14
            r3 = r1
            r4 = r1
            r5 = r1
            r6 = r2
            r7 = r1
            r8 = r1
            r9 = r1
            r10 = r1
            r11 = r1
            r13 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.api.model.PolicyNoticeAction.<init>():void");
    }

    public static /* synthetic */ PolicyNoticeAction copy$default(PolicyNoticeAction policyNoticeAction, String str, boolean z, String str2, String str3, String str4, boolean z2, Integer num, String str5, Boolean bool, Boolean bool2, Boolean bool3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = policyNoticeAction.text;
        }
        if ((i & 2) != 0) {
            z = policyNoticeAction.isBold;
        }
        if ((i & 4) != 0) {
            str2 = policyNoticeAction.linkType;
        }
        if ((i & 8) != 0) {
            str3 = policyNoticeAction.link;
        }
        if ((i & 16) != 0) {
            str4 = policyNoticeAction.extra;
        }
        if ((i & 32) != 0) {
            z2 = policyNoticeAction.approve;
        }
        if ((i & 64) != 0) {
            num = policyNoticeAction.operation;
        }
        if ((i & 128) != 0) {
            str5 = policyNoticeAction.nextPopUp;
        }
        if ((i & 256) != 0) {
            bool = policyNoticeAction.dismiss;
        }
        if ((i & 512) != 0) {
            bool2 = policyNoticeAction.dismissAll;
        }
        if ((i & 1024) != 0) {
            bool3 = policyNoticeAction.reGetSettings;
        }
        return policyNoticeAction.copy(str, z, str2, str3, str4, z2, num, str5, bool, bool2, bool3);
    }

    public final PolicyNoticeAction copy(String text, boolean z, String linkType, String link, String extra, boolean z2, Integer num, String str, Boolean bool, Boolean bool2, Boolean bool3) {
        o.LJIIIZ(text, "text");
        o.LJIIIZ(linkType, "linkType");
        o.LJIIIZ(link, "link");
        o.LJIIIZ(extra, "extra");
        return new PolicyNoticeAction(text, z, linkType, link, extra, z2, num, str, bool, bool2, bool3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PolicyNoticeAction)) {
            return false;
        }
        PolicyNoticeAction policyNoticeAction = (PolicyNoticeAction) obj;
        return o.LJ(this.text, policyNoticeAction.text) && this.isBold == policyNoticeAction.isBold && o.LJ(this.linkType, policyNoticeAction.linkType) && o.LJ(this.link, policyNoticeAction.link) && o.LJ(this.extra, policyNoticeAction.extra) && this.approve == policyNoticeAction.approve && o.LJ(this.operation, policyNoticeAction.operation) && o.LJ(this.nextPopUp, policyNoticeAction.nextPopUp) && o.LJ(this.dismiss, policyNoticeAction.dismiss) && o.LJ(this.dismissAll, policyNoticeAction.dismissAll) && o.LJ(this.reGetSettings, policyNoticeAction.reGetSettings);
    }

    public String toString() {
        return "PolicyNoticeAction(text=" + this.text + ", isBold=" + this.isBold + ", linkType=" + this.linkType + ", link=" + this.link + ", extra=" + this.extra + ", approve=" + this.approve + ", operation=" + this.operation + ", nextPopUp=" + this.nextPopUp + ", dismiss=" + this.dismiss + ", dismissAll=" + this.dismissAll + ", reGetSettings=" + this.reGetSettings + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5 = this.text.hashCode() * 31;
        boolean z = this.isBold;
        int i = 1;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int LJ = C79062V1e.LJ(this.extra, C79062V1e.LJ(this.link, C79062V1e.LJ(this.linkType, (hashCode5 + i2) * 31, 31), 31), 31);
        if (!this.approve) {
            i = 0;
        }
        int i3 = (LJ + i) * 31;
        Integer num = this.operation;
        int i4 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i5 = (i3 + hashCode) * 31;
        String str = this.nextPopUp;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i6 = (i5 + hashCode2) * 31;
        Boolean bool = this.dismiss;
        if (bool == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = bool.hashCode();
        }
        int i7 = (i6 + hashCode3) * 31;
        Boolean bool2 = this.dismissAll;
        if (bool2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = bool2.hashCode();
        }
        int i8 = (i7 + hashCode4) * 31;
        Boolean bool3 = this.reGetSettings;
        if (bool3 != null) {
            i4 = bool3.hashCode();
        }
        return i8 + i4;
    }

    public final boolean getApprove() {
        return this.approve;
    }

    public final Boolean getDismiss() {
        return this.dismiss;
    }

    public final Boolean getDismissAll() {
        return this.dismissAll;
    }

    public final String getExtra() {
        return this.extra;
    }

    public final String getLink() {
        return this.link;
    }

    public final String getLinkType() {
        return this.linkType;
    }

    public final String getNextPopUp() {
        return this.nextPopUp;
    }

    public final Integer getOperation() {
        return this.operation;
    }

    public final Boolean getReGetSettings() {
        return this.reGetSettings;
    }

    public final String getText() {
        return this.text;
    }

    public final boolean isBold() {
        return this.isBold;
    }

    public PolicyNoticeAction(String str, boolean z, String str2, String str3, String str4, boolean z2, Integer num, String str5, Boolean bool, Boolean bool2, Boolean bool3) {
        C43588H8u.LIZLLL(str, "text", str2, "linkType", str3, "link", str4, "extra");
        this.text = str;
        this.isBold = z;
        this.linkType = str2;
        this.link = str3;
        this.extra = str4;
        this.approve = z2;
        this.operation = num;
        this.nextPopUp = str5;
        this.dismiss = bool;
        this.dismissAll = bool2;
        this.reGetSettings = bool3;
    }

    public /* synthetic */ PolicyNoticeAction(String str, boolean z, String str2, String str3, String str4, boolean z2, Integer num, String str5, Boolean bool, Boolean bool2, Boolean bool3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) == 0 ? z2 : false, (i & 64) != 0 ? null : num, (i & 128) == 0 ? str5 : "", (i & 256) != 0 ? Boolean.FALSE : bool, (i & 512) != 0 ? Boolean.FALSE : bool2, (i & 1024) != 0 ? Boolean.FALSE : bool3);
    }
}
