package com.bytedance.ies.ugc.aweme.commercialize.compliance.ata;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes8.dex */
public final class FundingParty implements Serializable {

    @InterfaceC65349Pkn("orientation_track")
    public String eventTrackingText;

    @InterfaceC65349Pkn("orientation_text")
    public String fullText;

    @InterfaceC65349Pkn("info_type")
    public Integer infoType;

    @InterfaceC65349Pkn("orientation_item")
    public String linkText;

    @InterfaceC65349Pkn("url")
    public String linkUrl;

    /* renamed from: switch, reason: not valid java name */
    @InterfaceC65349Pkn("switch")
    public Integer f12switch;

    /* JADX WARN: Multi-variable type inference failed */
    public FundingParty() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 63, 0 == true ? 1 : 0);
    }

    public final String getEventTrackingText() {
        return this.eventTrackingText;
    }

    public final String getFullText() {
        return this.fullText;
    }

    public final Integer getInfoType() {
        return this.infoType;
    }

    public final String getLinkText() {
        return this.linkText;
    }

    public final String getLinkUrl() {
        return this.linkUrl;
    }

    public final Integer getSwitch() {
        return this.f12switch;
    }

    public final void setEventTrackingText(String str) {
        this.eventTrackingText = str;
    }

    public final void setFullText(String str) {
        this.fullText = str;
    }

    public final void setInfoType(Integer num) {
        this.infoType = num;
    }

    public final void setLinkText(String str) {
        this.linkText = str;
    }

    public final void setLinkUrl(String str) {
        this.linkUrl = str;
    }

    public final void setSwitch(Integer num) {
        this.f12switch = num;
    }

    public FundingParty(Integer num, String str, String str2, String str3, String str4, Integer num2) {
        this.infoType = num;
        this.fullText = str;
        this.linkUrl = str2;
        this.linkText = str3;
        this.eventTrackingText = str4;
        this.f12switch = num2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ FundingParty(java.lang.Integer r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.Integer r14, int r15, kotlin.jvm.internal.DefaultConstructorMarker r16) {
        /*
            r8 = this;
            r5 = r12
            r4 = r11
            r2 = r9
            r3 = r10
            r1 = r15 & 1
            r0 = 0
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            if (r1 == 0) goto Le
            r2 = r7
        Le:
            r0 = r15 & 2
            java.lang.String r6 = ""
            if (r0 == 0) goto L15
            r3 = r6
        L15:
            r0 = r15 & 4
            if (r0 == 0) goto L1a
            r4 = r6
        L1a:
            r0 = r15 & 8
            if (r0 == 0) goto L1f
            r5 = r6
        L1f:
            r0 = r15 & 16
            if (r0 == 0) goto L2e
        L23:
            r0 = r15 & 32
            if (r0 == 0) goto L2c
        L27:
            r1 = r8
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return
        L2c:
            r7 = r14
            goto L27
        L2e:
            r6 = r13
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.ugc.aweme.commercialize.compliance.ata.FundingParty.<init>(java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
