package com.ss.android.ugc.aweme.feed.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.b0;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class AppRawData implements Serializable {

    @InterfaceC65349Pkn("download_mode")
    public final int downloadMode;

    @InterfaceC65349Pkn("download_url")
    public final String downloadUrl;

    @InterfaceC65349Pkn("event_tag")
    public final String eventTag;

    @InterfaceC65349Pkn("group_id")
    public final String groupId;

    @InterfaceC65349Pkn("id")
    public final String id;

    @InterfaceC65349Pkn("is_ad")
    public final int isAd;

    @InterfaceC65349Pkn("log_extra")
    public final String logExtra;

    @InterfaceC65349Pkn("name")
    public final String name;

    @InterfaceC65349Pkn("pkg_name")
    public final String pkgName;

    @InterfaceC65349Pkn("quick_app_url")
    public final String quickAppUrl;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AppRawData() {
        /*
            r13 = this;
            r1 = 0
            r7 = 0
            r11 = 1023(0x3ff, float:1.434E-42)
            r0 = r13
            r2 = r1
            r3 = r1
            r4 = r1
            r5 = r1
            r6 = r1
            r8 = r1
            r9 = r1
            r10 = r7
            r12 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.model.AppRawData.<init>():void");
    }

    public static /* synthetic */ AppRawData copy$default(AppRawData appRawData, String str, String str2, String str3, String str4, String str5, String str6, int i, String str7, String str8, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = appRawData.id;
        }
        if ((i3 & 2) != 0) {
            str2 = appRawData.name;
        }
        if ((i3 & 4) != 0) {
            str3 = appRawData.pkgName;
        }
        if ((i3 & 8) != 0) {
            str4 = appRawData.downloadUrl;
        }
        if ((i3 & 16) != 0) {
            str5 = appRawData.eventTag;
        }
        if ((i3 & 32) != 0) {
            str6 = appRawData.groupId;
        }
        if ((i3 & 64) != 0) {
            i = appRawData.isAd;
        }
        if ((i3 & 128) != 0) {
            str7 = appRawData.logExtra;
        }
        if ((i3 & 256) != 0) {
            str8 = appRawData.quickAppUrl;
        }
        if ((i3 & 512) != 0) {
            i2 = appRawData.downloadMode;
        }
        return appRawData.copy(str, str2, str3, str4, str5, str6, i, str7, str8, i2);
    }

    public final AppRawData copy(String str, String str2, String str3, String str4, String str5, String str6, int i, String str7, String str8, int i2) {
        return new AppRawData(str, str2, str3, str4, str5, str6, i, str7, str8, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppRawData)) {
            return false;
        }
        AppRawData appRawData = (AppRawData) obj;
        return o.LJ(this.id, appRawData.id) && o.LJ(this.name, appRawData.name) && o.LJ(this.pkgName, appRawData.pkgName) && o.LJ(this.downloadUrl, appRawData.downloadUrl) && o.LJ(this.eventTag, appRawData.eventTag) && o.LJ(this.groupId, appRawData.groupId) && this.isAd == appRawData.isAd && o.LJ(this.logExtra, appRawData.logExtra) && o.LJ(this.quickAppUrl, appRawData.quickAppUrl) && this.downloadMode == appRawData.downloadMode;
    }

    public int hashCode() {
        String str = this.id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.pkgName;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.downloadUrl;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.eventTag;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.groupId;
        int hashCode6 = (((hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31) + this.isAd) * 31;
        String str7 = this.logExtra;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.quickAppUrl;
        return ((hashCode7 + (str8 != null ? str8.hashCode() : 0)) * 31) + this.downloadMode;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AppRawData(id=");
        LIZ.append(this.id);
        LIZ.append(", name=");
        LIZ.append(this.name);
        LIZ.append(", pkgName=");
        LIZ.append(this.pkgName);
        LIZ.append(", downloadUrl=");
        LIZ.append(this.downloadUrl);
        LIZ.append(", eventTag=");
        LIZ.append(this.eventTag);
        LIZ.append(", groupId=");
        LIZ.append(this.groupId);
        LIZ.append(", isAd=");
        LIZ.append(this.isAd);
        LIZ.append(", logExtra=");
        LIZ.append(this.logExtra);
        LIZ.append(", quickAppUrl=");
        LIZ.append(this.quickAppUrl);
        LIZ.append(", downloadMode=");
        return b0.LIZJ(LIZ, this.downloadMode, ')', LIZ);
    }

    public final int getDownloadMode() {
        return this.downloadMode;
    }

    public final String getDownloadUrl() {
        return this.downloadUrl;
    }

    public final String getEventTag() {
        return this.eventTag;
    }

    public final String getGroupId() {
        return this.groupId;
    }

    public final String getId() {
        return this.id;
    }

    public final String getLogExtra() {
        return this.logExtra;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPkgName() {
        return this.pkgName;
    }

    public final String getQuickAppUrl() {
        return this.quickAppUrl;
    }

    public final int isAd() {
        return this.isAd;
    }

    public AppRawData(String str, String str2, String str3, String str4, String str5, String str6, int i, String str7, String str8, int i2) {
        this.id = str;
        this.name = str2;
        this.pkgName = str3;
        this.downloadUrl = str4;
        this.eventTag = str5;
        this.groupId = str6;
        this.isAd = i;
        this.logExtra = str7;
        this.quickAppUrl = str8;
        this.downloadMode = i2;
    }

    public /* synthetic */ AppRawData(String str, String str2, String str3, String str4, String str5, String str6, int i, String str7, String str8, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? null : str, (i3 & 2) != 0 ? null : str2, (i3 & 4) != 0 ? null : str3, (i3 & 8) != 0 ? null : str4, (i3 & 16) != 0 ? null : str5, (i3 & 32) != 0 ? null : str6, (i3 & 64) != 0 ? 0 : i, (i3 & 128) != 0 ? null : str7, (i3 & 256) == 0 ? str8 : null, (i3 & 512) == 0 ? i2 : 0);
    }
}
