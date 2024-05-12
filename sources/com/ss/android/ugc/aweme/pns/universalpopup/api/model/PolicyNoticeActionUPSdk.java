package com.ss.android.ugc.aweme.pns.universalpopup.api.model;

import X.C43588H8u;
import X.C79062V1e;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class PolicyNoticeActionUPSdk implements Serializable {

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

    @InterfaceC65349Pkn("upgrade")
    public final Boolean upgrade;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public PolicyNoticeActionUPSdk() {
        /*
            r15 = this;
            r1 = 0
            r2 = 0
            r13 = 4095(0xfff, float:5.738E-42)
            r0 = r15
            r3 = r1
            r4 = r1
            r5 = r1
            r6 = r2
            r7 = r1
            r8 = r1
            r9 = r1
            r10 = r1
            r11 = r1
            r12 = r1
            r14 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.pns.universalpopup.api.model.PolicyNoticeActionUPSdk.<init>():void");
    }

    public static /* synthetic */ PolicyNoticeActionUPSdk copy$default(PolicyNoticeActionUPSdk policyNoticeActionUPSdk, String str, boolean z, String str2, String str3, String str4, boolean z2, Integer num, String str5, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = policyNoticeActionUPSdk.text;
        }
        if ((i & 2) != 0) {
            z = policyNoticeActionUPSdk.isBold;
        }
        if ((i & 4) != 0) {
            str2 = policyNoticeActionUPSdk.linkType;
        }
        if ((i & 8) != 0) {
            str3 = policyNoticeActionUPSdk.link;
        }
        if ((i & 16) != 0) {
            str4 = policyNoticeActionUPSdk.extra;
        }
        if ((i & 32) != 0) {
            z2 = policyNoticeActionUPSdk.approve;
        }
        if ((i & 64) != 0) {
            num = policyNoticeActionUPSdk.operation;
        }
        if ((i & 128) != 0) {
            str5 = policyNoticeActionUPSdk.nextPopUp;
        }
        if ((i & 256) != 0) {
            bool = policyNoticeActionUPSdk.dismiss;
        }
        if ((i & 512) != 0) {
            bool2 = policyNoticeActionUPSdk.dismissAll;
        }
        if ((i & 1024) != 0) {
            bool3 = policyNoticeActionUPSdk.upgrade;
        }
        if ((i & 2048) != 0) {
            bool4 = policyNoticeActionUPSdk.reGetSettings;
        }
        return policyNoticeActionUPSdk.copy(str, z, str2, str3, str4, z2, num, str5, bool, bool2, bool3, bool4);
    }

    public final PolicyNoticeActionUPSdk copy(String text, boolean z, String linkType, String link, String extra, boolean z2, Integer num, String str, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        o.LJIIIZ(text, "text");
        o.LJIIIZ(linkType, "linkType");
        o.LJIIIZ(link, "link");
        o.LJIIIZ(extra, "extra");
        return new PolicyNoticeActionUPSdk(text, z, linkType, link, extra, z2, num, str, bool, bool2, bool3, bool4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PolicyNoticeActionUPSdk)) {
            return false;
        }
        PolicyNoticeActionUPSdk policyNoticeActionUPSdk = (PolicyNoticeActionUPSdk) obj;
        return o.LJ(this.text, policyNoticeActionUPSdk.text) && this.isBold == policyNoticeActionUPSdk.isBold && o.LJ(this.linkType, policyNoticeActionUPSdk.linkType) && o.LJ(this.link, policyNoticeActionUPSdk.link) && o.LJ(this.extra, policyNoticeActionUPSdk.extra) && this.approve == policyNoticeActionUPSdk.approve && o.LJ(this.operation, policyNoticeActionUPSdk.operation) && o.LJ(this.nextPopUp, policyNoticeActionUPSdk.nextPopUp) && o.LJ(this.dismiss, policyNoticeActionUPSdk.dismiss) && o.LJ(this.dismissAll, policyNoticeActionUPSdk.dismissAll) && o.LJ(this.upgrade, policyNoticeActionUPSdk.upgrade) && o.LJ(this.reGetSettings, policyNoticeActionUPSdk.reGetSettings);
    }

    public String toString() {
        return "PolicyNoticeActionUPSdk(text=" + this.text + ", isBold=" + this.isBold + ", linkType=" + this.linkType + ", link=" + this.link + ", extra=" + this.extra + ", approve=" + this.approve + ", operation=" + this.operation + ", nextPopUp=" + ((Object) this.nextPopUp) + ", dismiss=" + this.dismiss + ", dismissAll=" + this.dismissAll + ", upgrade=" + this.upgrade + ", reGetSettings=" + this.reGetSettings + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6 = this.text.hashCode() * 31;
        boolean z = this.isBold;
        int i = 1;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int LJ = C79062V1e.LJ(this.extra, C79062V1e.LJ(this.link, C79062V1e.LJ(this.linkType, (hashCode6 + i2) * 31, 31), 31), 31);
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
        Boolean bool3 = this.upgrade;
        if (bool3 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = bool3.hashCode();
        }
        int i9 = (i8 + hashCode5) * 31;
        Boolean bool4 = this.reGetSettings;
        if (bool4 != null) {
            i4 = bool4.hashCode();
        }
        return i9 + i4;
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

    public final Boolean getUpgrade() {
        return this.upgrade;
    }

    public final boolean isBold() {
        return this.isBold;
    }

    public PolicyNoticeActionUPSdk(String str, boolean z, String str2, String str3, String str4, boolean z2, Integer num, String str5, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
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
        this.upgrade = bool3;
        this.reGetSettings = bool4;
    }

    public /* synthetic */ PolicyNoticeActionUPSdk(String str, boolean z, String str2, String str3, String str4, boolean z2, Integer num, String str5, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) == 0 ? str4 : "", (i & 32) == 0 ? z2 : false, (i & 64) != 0 ? null : num, (i & 128) == 0 ? str5 : null, (i & 256) != 0 ? Boolean.FALSE : bool, (i & 512) != 0 ? Boolean.FALSE : bool2, (i & 1024) != 0 ? Boolean.FALSE : bool3, (i & 2048) != 0 ? Boolean.FALSE : bool4);
    }
}
