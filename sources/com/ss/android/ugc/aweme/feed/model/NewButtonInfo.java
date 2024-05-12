package com.ss.android.ugc.aweme.feed.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class NewButtonInfo implements Serializable {

    @InterfaceC65349Pkn("app_data")
    public final AppRawData appData;

    @InterfaceC65349Pkn("apple_id")
    public final String appleId;

    @InterfaceC65349Pkn("button_background_color")
    public final String buttonBackgroundColor;

    @InterfaceC65349Pkn("button_text")
    public final String buttonText;

    @InterfaceC65349Pkn("image_url_list")
    public final AwemeUrl imageUrlList;

    @InterfaceC65349Pkn("show_text_link")
    public final Integer showTextLink;

    @InterfaceC65349Pkn("source")
    public final String source;

    @InterfaceC65349Pkn("style_type")
    public final Integer styleType;

    @InterfaceC65349Pkn("title")
    public final String title;

    /* JADX WARN: Multi-variable type inference failed */
    public NewButtonInfo() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 511, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ NewButtonInfo copy$default(NewButtonInfo newButtonInfo, Integer num, String str, String str2, AppRawData appRawData, String str3, String str4, String str5, AwemeUrl awemeUrl, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = newButtonInfo.styleType;
        }
        if ((i & 2) != 0) {
            str = newButtonInfo.buttonText;
        }
        if ((i & 4) != 0) {
            str2 = newButtonInfo.buttonBackgroundColor;
        }
        if ((i & 8) != 0) {
            appRawData = newButtonInfo.appData;
        }
        if ((i & 16) != 0) {
            str3 = newButtonInfo.appleId;
        }
        if ((i & 32) != 0) {
            str4 = newButtonInfo.source;
        }
        if ((i & 64) != 0) {
            str5 = newButtonInfo.title;
        }
        if ((i & 128) != 0) {
            awemeUrl = newButtonInfo.imageUrlList;
        }
        if ((i & 256) != 0) {
            num2 = newButtonInfo.showTextLink;
        }
        return newButtonInfo.copy(num, str, str2, appRawData, str3, str4, str5, awemeUrl, num2);
    }

    public final NewButtonInfo copy(Integer num, String str, String str2, AppRawData appRawData, String str3, String str4, String str5, AwemeUrl awemeUrl, Integer num2) {
        return new NewButtonInfo(num, str, str2, appRawData, str3, str4, str5, awemeUrl, num2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewButtonInfo)) {
            return false;
        }
        NewButtonInfo newButtonInfo = (NewButtonInfo) obj;
        return o.LJ(this.styleType, newButtonInfo.styleType) && o.LJ(this.buttonText, newButtonInfo.buttonText) && o.LJ(this.buttonBackgroundColor, newButtonInfo.buttonBackgroundColor) && o.LJ(this.appData, newButtonInfo.appData) && o.LJ(this.appleId, newButtonInfo.appleId) && o.LJ(this.source, newButtonInfo.source) && o.LJ(this.title, newButtonInfo.title) && o.LJ(this.imageUrlList, newButtonInfo.imageUrlList) && o.LJ(this.showTextLink, newButtonInfo.showTextLink);
    }

    public int hashCode() {
        Integer num = this.styleType;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.buttonText;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.buttonBackgroundColor;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        AppRawData appRawData = this.appData;
        int hashCode4 = (hashCode3 + (appRawData == null ? 0 : appRawData.hashCode())) * 31;
        String str3 = this.appleId;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.source;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.title;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        AwemeUrl awemeUrl = this.imageUrlList;
        int hashCode8 = (hashCode7 + (awemeUrl == null ? 0 : awemeUrl.hashCode())) * 31;
        Integer num2 = this.showTextLink;
        return hashCode8 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NewButtonInfo(styleType=");
        LIZ.append(this.styleType);
        LIZ.append(", buttonText=");
        LIZ.append(this.buttonText);
        LIZ.append(", buttonBackgroundColor=");
        LIZ.append(this.buttonBackgroundColor);
        LIZ.append(", appData=");
        LIZ.append(this.appData);
        LIZ.append(", appleId=");
        LIZ.append(this.appleId);
        LIZ.append(", source=");
        LIZ.append(this.source);
        LIZ.append(", title=");
        LIZ.append(this.title);
        LIZ.append(", imageUrlList=");
        LIZ.append(this.imageUrlList);
        LIZ.append(", showTextLink=");
        return s0.LIZJ(LIZ, this.showTextLink, ')', LIZ);
    }

    public final AppRawData getAppData() {
        return this.appData;
    }

    public final String getAppleId() {
        return this.appleId;
    }

    public final String getButtonBackgroundColor() {
        return this.buttonBackgroundColor;
    }

    public final String getButtonText() {
        return this.buttonText;
    }

    public final AwemeUrl getImageUrlList() {
        return this.imageUrlList;
    }

    public final Integer getShowTextLink() {
        return this.showTextLink;
    }

    public final String getSource() {
        return this.source;
    }

    public final Integer getStyleType() {
        return this.styleType;
    }

    public final String getTitle() {
        return this.title;
    }

    public NewButtonInfo(Integer num, String str, String str2, AppRawData appRawData, String str3, String str4, String str5, AwemeUrl awemeUrl, Integer num2) {
        this.styleType = num;
        this.buttonText = str;
        this.buttonBackgroundColor = str2;
        this.appData = appRawData;
        this.appleId = str3;
        this.source = str4;
        this.title = str5;
        this.imageUrlList = awemeUrl;
        this.showTextLink = num2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ NewButtonInfo(java.lang.Integer r13, java.lang.String r14, java.lang.String r15, com.ss.android.ugc.aweme.feed.model.AppRawData r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, com.ss.android.ugc.aweme.feed.model.AwemeUrl r20, java.lang.Integer r21, int r22, kotlin.jvm.internal.DefaultConstructorMarker r23) {
        /*
            r12 = this;
            r2 = r22
            r9 = r19
            r4 = r14
            r3 = r13
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            r1 = r2 & 1
            r0 = 0
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)
            if (r1 == 0) goto L17
            r3 = r11
        L17:
            r0 = r2 & 2
            r10 = 0
            if (r0 == 0) goto L1d
            r4 = r10
        L1d:
            r0 = r2 & 4
            if (r0 == 0) goto L22
            r5 = r10
        L22:
            r0 = r2 & 8
            if (r0 == 0) goto L27
            r6 = r10
        L27:
            r0 = r2 & 16
            if (r0 == 0) goto L2c
            r7 = r10
        L2c:
            r0 = r2 & 32
            if (r0 == 0) goto L31
            r8 = r10
        L31:
            r0 = r2 & 64
            if (r0 == 0) goto L36
            r9 = r10
        L36:
            r0 = r2 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L46
        L3a:
            r0 = r2 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L43
        L3e:
            r2 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        L43:
            r11 = r21
            goto L3e
        L46:
            r10 = r20
            goto L3a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.model.NewButtonInfo.<init>(java.lang.Integer, java.lang.String, java.lang.String, com.ss.android.ugc.aweme.feed.model.AppRawData, java.lang.String, java.lang.String, java.lang.String, com.ss.android.ugc.aweme.feed.model.AwemeUrl, java.lang.Integer, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
