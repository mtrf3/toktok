package com.ss.android.ugc.aweme.music.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TTMLink implements Serializable {

    @InterfaceC65349Pkn("app_link")
    public String appLink;

    @InterfaceC65349Pkn("deep_link")
    public String deepLink;

    @InterfaceC65349Pkn("download_link")
    public String downloadLink;

    @InterfaceC65349Pkn("store_link")
    public TTMStoreLink storeLink;

    /* JADX WARN: Multi-variable type inference failed */
    public TTMLink() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ TTMLink copy$default(TTMLink tTMLink, String str, String str2, String str3, TTMStoreLink tTMStoreLink, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tTMLink.appLink;
        }
        if ((i & 2) != 0) {
            str2 = tTMLink.deepLink;
        }
        if ((i & 4) != 0) {
            str3 = tTMLink.downloadLink;
        }
        if ((i & 8) != 0) {
            tTMStoreLink = tTMLink.storeLink;
        }
        return tTMLink.copy(str, str2, str3, tTMStoreLink);
    }

    public final TTMLink copy(String str, String str2, String str3, TTMStoreLink tTMStoreLink) {
        return new TTMLink(str, str2, str3, tTMStoreLink);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TTMLink)) {
            return false;
        }
        TTMLink tTMLink = (TTMLink) obj;
        return o.LJ(this.appLink, tTMLink.appLink) && o.LJ(this.deepLink, tTMLink.deepLink) && o.LJ(this.downloadLink, tTMLink.downloadLink) && o.LJ(this.storeLink, tTMLink.storeLink);
    }

    public int hashCode() {
        String str = this.appLink;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.deepLink;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.downloadLink;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        TTMStoreLink tTMStoreLink = this.storeLink;
        return hashCode3 + (tTMStoreLink != null ? tTMStoreLink.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TTMLink(appLink=");
        LIZ.append(this.appLink);
        LIZ.append(", deepLink=");
        LIZ.append(this.deepLink);
        LIZ.append(", downloadLink=");
        LIZ.append(this.downloadLink);
        LIZ.append(", storeLink=");
        LIZ.append(this.storeLink);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final String getAppLink() {
        return this.appLink;
    }

    public final String getDeepLink() {
        return this.deepLink;
    }

    public final String getDownloadLink() {
        return this.downloadLink;
    }

    public final TTMStoreLink getStoreLink() {
        return this.storeLink;
    }

    public TTMLink(String str, String str2, String str3, TTMStoreLink tTMStoreLink) {
        this.appLink = str;
        this.deepLink = str2;
        this.downloadLink = str3;
        this.storeLink = tTMStoreLink;
    }

    public /* synthetic */ TTMLink(String str, String str2, String str3, TTMStoreLink tTMStoreLink, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : tTMStoreLink);
    }
}
