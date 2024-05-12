package com.ss.android.ugc.aweme.openauthorize.entity;

import X.C48339Iy7;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class AuthorizedPage implements Serializable {

    @InterfaceC65349Pkn("app_icon")
    public final String appIcon;

    @InterfaceC65349Pkn("check_result")
    public final AuthorizedCheckResult checkResult;

    @InterfaceC65349Pkn("is_lite")
    public final Boolean isLite;

    @InterfaceC65349Pkn("page_detail")
    public final AuthorizedPageDetail pageDetail;

    @InterfaceC65349Pkn("show_edit_access")
    public final boolean showEditAccess;

    @InterfaceC65349Pkn("show_switch_account")
    public final boolean showSwitchAccount;

    @InterfaceC65349Pkn("status_code")
    public final Integer statusCode;

    @InterfaceC65349Pkn("status_msg")
    public final String statusMsg;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AuthorizedPage() {
        /*
            r11 = this;
            r1 = 0
            r7 = 0
            r9 = 255(0xff, float:3.57E-43)
            r0 = r11
            r2 = r1
            r3 = r1
            r4 = r1
            r5 = r1
            r6 = r1
            r8 = r7
            r10 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.openauthorize.entity.AuthorizedPage.<init>():void");
    }

    public static /* synthetic */ AuthorizedPage copy$default(AuthorizedPage authorizedPage, Integer num, String str, AuthorizedPageDetail authorizedPageDetail, AuthorizedCheckResult authorizedCheckResult, Boolean bool, String str2, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = authorizedPage.statusCode;
        }
        if ((i & 2) != 0) {
            str = authorizedPage.statusMsg;
        }
        if ((i & 4) != 0) {
            authorizedPageDetail = authorizedPage.pageDetail;
        }
        if ((i & 8) != 0) {
            authorizedCheckResult = authorizedPage.checkResult;
        }
        if ((i & 16) != 0) {
            bool = authorizedPage.isLite;
        }
        if ((i & 32) != 0) {
            str2 = authorizedPage.appIcon;
        }
        if ((i & 64) != 0) {
            z = authorizedPage.showSwitchAccount;
        }
        if ((i & 128) != 0) {
            z2 = authorizedPage.showEditAccess;
        }
        return authorizedPage.copy(num, str, authorizedPageDetail, authorizedCheckResult, bool, str2, z, z2);
    }

    public final AuthorizedPage copy(Integer num, String str, AuthorizedPageDetail authorizedPageDetail, AuthorizedCheckResult authorizedCheckResult, Boolean bool, String str2, boolean z, boolean z2) {
        return new AuthorizedPage(num, str, authorizedPageDetail, authorizedCheckResult, bool, str2, z, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthorizedPage)) {
            return false;
        }
        AuthorizedPage authorizedPage = (AuthorizedPage) obj;
        return o.LJ(this.statusCode, authorizedPage.statusCode) && o.LJ(this.statusMsg, authorizedPage.statusMsg) && o.LJ(this.pageDetail, authorizedPage.pageDetail) && o.LJ(this.checkResult, authorizedPage.checkResult) && o.LJ(this.isLite, authorizedPage.isLite) && o.LJ(this.appIcon, authorizedPage.appIcon) && this.showSwitchAccount == authorizedPage.showSwitchAccount && this.showEditAccess == authorizedPage.showEditAccess;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        Integer num = this.statusCode;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.statusMsg;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        AuthorizedPageDetail authorizedPageDetail = this.pageDetail;
        int hashCode3 = (hashCode2 + (authorizedPageDetail == null ? 0 : authorizedPageDetail.hashCode())) * 31;
        AuthorizedCheckResult authorizedCheckResult = this.checkResult;
        int hashCode4 = (hashCode3 + (authorizedCheckResult == null ? 0 : authorizedCheckResult.hashCode())) * 31;
        Boolean bool = this.isLite;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.appIcon;
        int hashCode6 = (hashCode5 + (str2 != null ? str2.hashCode() : 0)) * 31;
        boolean z = this.showSwitchAccount;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((hashCode6 + i) * 31) + (this.showEditAccess ? 1 : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AuthorizedPage(statusCode=");
        LIZ.append(this.statusCode);
        LIZ.append(", statusMsg=");
        LIZ.append(this.statusMsg);
        LIZ.append(", pageDetail=");
        LIZ.append(this.pageDetail);
        LIZ.append(", checkResult=");
        LIZ.append(this.checkResult);
        LIZ.append(", isLite=");
        LIZ.append(this.isLite);
        LIZ.append(", appIcon=");
        LIZ.append(this.appIcon);
        LIZ.append(", showSwitchAccount=");
        LIZ.append(this.showSwitchAccount);
        LIZ.append(", showEditAccess=");
        return C48339Iy7.LIZJ(LIZ, this.showEditAccess, ')', LIZ);
    }

    public final String getAppIcon() {
        return this.appIcon;
    }

    public final AuthorizedCheckResult getCheckResult() {
        return this.checkResult;
    }

    public final AuthorizedPageDetail getPageDetail() {
        return this.pageDetail;
    }

    public final boolean getShowEditAccess() {
        return this.showEditAccess;
    }

    public final boolean getShowSwitchAccount() {
        return this.showSwitchAccount;
    }

    public final Integer getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusMsg() {
        return this.statusMsg;
    }

    public final Boolean isLite() {
        return this.isLite;
    }

    public AuthorizedPage(Integer num, String str, AuthorizedPageDetail authorizedPageDetail, AuthorizedCheckResult authorizedCheckResult, Boolean bool, String str2, boolean z, boolean z2) {
        this.statusCode = num;
        this.statusMsg = str;
        this.pageDetail = authorizedPageDetail;
        this.checkResult = authorizedCheckResult;
        this.isLite = bool;
        this.appIcon = str2;
        this.showSwitchAccount = z;
        this.showEditAccess = z2;
    }

    public /* synthetic */ AuthorizedPage(Integer num, String str, AuthorizedPageDetail authorizedPageDetail, AuthorizedCheckResult authorizedCheckResult, Boolean bool, String str2, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : authorizedPageDetail, (i & 8) != 0 ? null : authorizedCheckResult, (i & 16) != 0 ? null : bool, (i & 32) == 0 ? str2 : null, (i & 64) != 0 ? false : z, (i & 128) == 0 ? z2 : false);
    }
}
