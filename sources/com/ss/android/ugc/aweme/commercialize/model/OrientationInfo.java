package com.ss.android.ugc.aweme.commercialize.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes8.dex */
public final class OrientationInfo implements Serializable {
    public String LJLIL;
    public Integer LJLILLLLZI;
    public Boolean LJLJI;
    public String LJLJJI;

    @InterfaceC65349Pkn("disable_text")
    public String disableText;

    @InterfaceC65349Pkn("enable_text")
    public String enableText;

    @InterfaceC65349Pkn("orientation_track")
    public String eventTrackingText;

    @InterfaceC65349Pkn("orientation_text")
    public String fullText;

    @InterfaceC65349Pkn("geo_country_type")
    public String geoCountryType;

    @InterfaceC65349Pkn("info_type")
    public Integer infoType;

    @InterfaceC65349Pkn("orientation_item")
    public String linkText;

    @InterfaceC65349Pkn("url")
    public String linkUrl;

    /* renamed from: switch, reason: not valid java name */
    @InterfaceC65349Pkn("switch")
    public Integer f17switch;

    /* JADX WARN: Multi-variable type inference failed */
    public OrientationInfo() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 8191, 0 == true ? 1 : 0);
    }

    public final String getButtonText() {
        return this.LJLJJI;
    }

    public final String getDisableText() {
        return this.disableText;
    }

    public final String getEnableText() {
        return this.enableText;
    }

    public final String getEventTrackingText() {
        return this.eventTrackingText;
    }

    public final String getFullText() {
        return this.fullText;
    }

    public final String getGeoCountryType() {
        return this.geoCountryType;
    }

    public final Integer getInfoType() {
        return this.infoType;
    }

    public final Integer getItemType() {
        return this.LJLILLLLZI;
    }

    public final String getLinkText() {
        return this.linkText;
    }

    public final String getLinkUrl() {
        return this.linkUrl;
    }

    public final Integer getSwitch() {
        return this.f17switch;
    }

    public final String getTitle() {
        return this.LJLIL;
    }

    public final Boolean isLastItem() {
        return this.LJLJI;
    }

    public final void setButtonText(String str) {
        this.LJLJJI = str;
    }

    public final void setDisableText(String str) {
        this.disableText = str;
    }

    public final void setEnableText(String str) {
        this.enableText = str;
    }

    public final void setEventTrackingText(String str) {
        this.eventTrackingText = str;
    }

    public final void setFullText(String str) {
        this.fullText = str;
    }

    public final void setGeoCountryType(String str) {
        this.geoCountryType = str;
    }

    public final void setInfoType(Integer num) {
        this.infoType = num;
    }

    public final void setItemType(Integer num) {
        this.LJLILLLLZI = num;
    }

    public final void setLastItem(Boolean bool) {
        this.LJLJI = bool;
    }

    public final void setLinkText(String str) {
        this.linkText = str;
    }

    public final void setLinkUrl(String str) {
        this.linkUrl = str;
    }

    public final void setSwitch(Integer num) {
        this.f17switch = num;
    }

    public final void setTitle(String str) {
        this.LJLIL = str;
    }

    public OrientationInfo(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num2, String str8, Integer num3, Boolean bool, String str9) {
        this.infoType = num;
        this.fullText = str;
        this.linkUrl = str2;
        this.linkText = str3;
        this.eventTrackingText = str4;
        this.geoCountryType = str5;
        this.enableText = str6;
        this.disableText = str7;
        this.f17switch = num2;
        this.LJLIL = str8;
        this.LJLILLLLZI = num3;
        this.LJLJI = bool;
        this.LJLJJI = str9;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ OrientationInfo(java.lang.Integer r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.Integer r25, java.lang.String r26, java.lang.Integer r27, java.lang.Boolean r28, java.lang.String r29, int r30, kotlin.jvm.internal.DefaultConstructorMarker r31) {
        /*
            r16 = this;
            r1 = r30
            r14 = r28
            r12 = r26
            r11 = r25
            r10 = r24
            r9 = r23
            r4 = r18
            r3 = r17
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            r2 = r1 & 1
            r0 = 0
            java.lang.Integer r13 = java.lang.Integer.valueOf(r0)
            if (r2 == 0) goto L22
            r3 = r13
        L22:
            r0 = r1 & 2
            java.lang.String r15 = ""
            if (r0 == 0) goto L29
            r4 = r15
        L29:
            r0 = r1 & 4
            if (r0 == 0) goto L2e
            r5 = r15
        L2e:
            r0 = r1 & 8
            if (r0 == 0) goto L33
            r6 = r15
        L33:
            r0 = r1 & 16
            if (r0 == 0) goto L38
            r7 = r15
        L38:
            r0 = r1 & 32
            if (r0 == 0) goto L3d
            r8 = r15
        L3d:
            r0 = r1 & 64
            if (r0 == 0) goto L42
            r9 = r15
        L42:
            r0 = r1 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L47
            r10 = r15
        L47:
            r0 = r1 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L4c
            r11 = r13
        L4c:
            r0 = r1 & 512(0x200, float:7.17E-43)
            if (r0 == 0) goto L51
            r12 = r15
        L51:
            r0 = r1 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L68
        L55:
            r0 = r1 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L5b
            java.lang.Boolean r14 = java.lang.Boolean.FALSE
        L5b:
            r0 = r1 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L65
        L5f:
            r2 = r16
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        L65:
            r15 = r29
            goto L5f
        L68:
            r13 = r27
            goto L55
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.model.OrientationInfo.<init>(java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Boolean, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
