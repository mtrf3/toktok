package com.ss.android.ugc.aweme.watch.history.api;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class WatchHistoryDialogCopy implements Serializable {

    @InterfaceC65349Pkn("body")
    public final String body;

    @InterfaceC65349Pkn("primary_button")
    public final String primaryButton;

    @InterfaceC65349Pkn("secondary_button")
    public final String secondaryButton;

    @InterfaceC65349Pkn("title")
    public final String title;

    @InterfaceC65349Pkn("toast_failed")
    public final String toastFailed;

    @InterfaceC65349Pkn("toast_success")
    public final String toastSuccess;

    public static /* synthetic */ WatchHistoryDialogCopy copy$default(WatchHistoryDialogCopy watchHistoryDialogCopy, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = watchHistoryDialogCopy.title;
        }
        if ((i & 2) != 0) {
            str2 = watchHistoryDialogCopy.body;
        }
        if ((i & 4) != 0) {
            str3 = watchHistoryDialogCopy.toastSuccess;
        }
        if ((i & 8) != 0) {
            str4 = watchHistoryDialogCopy.toastFailed;
        }
        if ((i & 16) != 0) {
            str5 = watchHistoryDialogCopy.primaryButton;
        }
        if ((i & 32) != 0) {
            str6 = watchHistoryDialogCopy.secondaryButton;
        }
        return watchHistoryDialogCopy.copy(str, str2, str3, str4, str5, str6);
    }

    public final WatchHistoryDialogCopy copy(String str, String str2, String str3, String str4, String str5, String str6) {
        return new WatchHistoryDialogCopy(str, str2, str3, str4, str5, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WatchHistoryDialogCopy)) {
            return false;
        }
        WatchHistoryDialogCopy watchHistoryDialogCopy = (WatchHistoryDialogCopy) obj;
        return o.LJ(this.title, watchHistoryDialogCopy.title) && o.LJ(this.body, watchHistoryDialogCopy.body) && o.LJ(this.toastSuccess, watchHistoryDialogCopy.toastSuccess) && o.LJ(this.toastFailed, watchHistoryDialogCopy.toastFailed) && o.LJ(this.primaryButton, watchHistoryDialogCopy.primaryButton) && o.LJ(this.secondaryButton, watchHistoryDialogCopy.secondaryButton);
    }

    public int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.body;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.toastSuccess;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.toastFailed;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.primaryButton;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.secondaryButton;
        return hashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("WatchHistoryDialogCopy(title=");
        LIZ.append(this.title);
        LIZ.append(", body=");
        LIZ.append(this.body);
        LIZ.append(", toastSuccess=");
        LIZ.append(this.toastSuccess);
        LIZ.append(", toastFailed=");
        LIZ.append(this.toastFailed);
        LIZ.append(", primaryButton=");
        LIZ.append(this.primaryButton);
        LIZ.append(", secondaryButton=");
        return q.LIZIZ(LIZ, this.secondaryButton, ')', LIZ);
    }

    public final String getBody() {
        return this.body;
    }

    public final String getPrimaryButton() {
        return this.primaryButton;
    }

    public final String getSecondaryButton() {
        return this.secondaryButton;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getToastFailed() {
        return this.toastFailed;
    }

    public final String getToastSuccess() {
        return this.toastSuccess;
    }

    public WatchHistoryDialogCopy(String str, String str2, String str3, String str4, String str5, String str6) {
        this.title = str;
        this.body = str2;
        this.toastSuccess = str3;
        this.toastFailed = str4;
        this.primaryButton = str5;
        this.secondaryButton = str6;
    }

    public /* synthetic */ WatchHistoryDialogCopy(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) == 0 ? str4 : null, str5, str6);
    }
}
