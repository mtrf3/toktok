package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AddonDaInfo implements Serializable {

    @InterfaceC65349Pkn("enter_from")
    public final String enterFrom;

    @InterfaceC65349Pkn("enter_from_info")
    public final String enterFromInfo;

    @InterfaceC65349Pkn("enter_from_merge")
    public final String enterFromMerge;

    @InterfaceC65349Pkn("previous_page")
    public final String previousPage;

    /* JADX WARN: Multi-variable type inference failed */
    public AddonDaInfo() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ AddonDaInfo copy$default(AddonDaInfo addonDaInfo, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = addonDaInfo.enterFrom;
        }
        if ((i & 2) != 0) {
            str2 = addonDaInfo.enterFromInfo;
        }
        if ((i & 4) != 0) {
            str3 = addonDaInfo.enterFromMerge;
        }
        if ((i & 8) != 0) {
            str4 = addonDaInfo.previousPage;
        }
        return addonDaInfo.copy(str, str2, str3, str4);
    }

    public final AddonDaInfo copy(String str, String str2, String str3, String str4) {
        return new AddonDaInfo(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddonDaInfo)) {
            return false;
        }
        AddonDaInfo addonDaInfo = (AddonDaInfo) obj;
        return o.LJ(this.enterFrom, addonDaInfo.enterFrom) && o.LJ(this.enterFromInfo, addonDaInfo.enterFromInfo) && o.LJ(this.enterFromMerge, addonDaInfo.enterFromMerge) && o.LJ(this.previousPage, addonDaInfo.previousPage);
    }

    public int hashCode() {
        String str = this.enterFrom;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.enterFromInfo;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.enterFromMerge;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.previousPage;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AddonDaInfo(enterFrom=");
        LIZ.append(this.enterFrom);
        LIZ.append(", enterFromInfo=");
        LIZ.append(this.enterFromInfo);
        LIZ.append(", enterFromMerge=");
        LIZ.append(this.enterFromMerge);
        LIZ.append(", previousPage=");
        return q.LIZIZ(LIZ, this.previousPage, ')', LIZ);
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final String getEnterFromInfo() {
        return this.enterFromInfo;
    }

    public final String getEnterFromMerge() {
        return this.enterFromMerge;
    }

    public final String getPreviousPage() {
        return this.previousPage;
    }

    public AddonDaInfo(String str, String str2, String str3, String str4) {
        this.enterFrom = str;
        this.enterFromInfo = str2;
        this.enterFromMerge = str3;
        this.previousPage = str4;
    }

    public /* synthetic */ AddonDaInfo(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}
