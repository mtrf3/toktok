package com.ss.android.ugc.aweme.watch.history.api;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class WatchHistoryCopyResponse extends BaseResponse {

    @InterfaceC65349Pkn("action_button")
    public final String actionButton;

    @InterfaceC65349Pkn("action_button_without_number")
    public final String actionButtonWithoutNumber;

    @InterfaceC65349Pkn("banner_hyperlink")
    public final String bannerHyperlink;

    @InterfaceC65349Pkn("delete_confirmation_dialog_all")
    public final WatchHistoryDialogCopy deleteConfirmationDialogAll;

    @InterfaceC65349Pkn("delete_confirmation_dialog_batched")
    public final WatchHistoryDialogCopy deleteConfirmationDialogBatched;

    @InterfaceC65349Pkn("delete_confirmation_dialog_single")
    public final WatchHistoryDialogCopy deleteConfirmationDialogSingle;

    @InterfaceC65349Pkn("dialog_hyperlink")
    public final String dialogHyperlink;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WatchHistoryCopyResponse)) {
            return false;
        }
        WatchHistoryCopyResponse watchHistoryCopyResponse = (WatchHistoryCopyResponse) obj;
        return o.LJ(this.actionButton, watchHistoryCopyResponse.actionButton) && o.LJ(this.actionButtonWithoutNumber, watchHistoryCopyResponse.actionButtonWithoutNumber) && o.LJ(this.dialogHyperlink, watchHistoryCopyResponse.dialogHyperlink) && o.LJ(this.bannerHyperlink, watchHistoryCopyResponse.bannerHyperlink) && o.LJ(this.deleteConfirmationDialogAll, watchHistoryCopyResponse.deleteConfirmationDialogAll) && o.LJ(this.deleteConfirmationDialogBatched, watchHistoryCopyResponse.deleteConfirmationDialogBatched) && o.LJ(this.deleteConfirmationDialogSingle, watchHistoryCopyResponse.deleteConfirmationDialogSingle);
    }

    public final int hashCode() {
        String str = this.actionButton;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.actionButtonWithoutNumber;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.dialogHyperlink;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.bannerHyperlink;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        WatchHistoryDialogCopy watchHistoryDialogCopy = this.deleteConfirmationDialogAll;
        int hashCode5 = (hashCode4 + (watchHistoryDialogCopy == null ? 0 : watchHistoryDialogCopy.hashCode())) * 31;
        WatchHistoryDialogCopy watchHistoryDialogCopy2 = this.deleteConfirmationDialogBatched;
        int hashCode6 = (hashCode5 + (watchHistoryDialogCopy2 == null ? 0 : watchHistoryDialogCopy2.hashCode())) * 31;
        WatchHistoryDialogCopy watchHistoryDialogCopy3 = this.deleteConfirmationDialogSingle;
        return hashCode6 + (watchHistoryDialogCopy3 != null ? watchHistoryDialogCopy3.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("WatchHistoryCopyResponse(actionButton=");
        LIZ.append(this.actionButton);
        LIZ.append(", actionButtonWithoutNumber=");
        LIZ.append(this.actionButtonWithoutNumber);
        LIZ.append(", dialogHyperlink=");
        LIZ.append(this.dialogHyperlink);
        LIZ.append(", bannerHyperlink=");
        LIZ.append(this.bannerHyperlink);
        LIZ.append(", deleteConfirmationDialogAll=");
        LIZ.append(this.deleteConfirmationDialogAll);
        LIZ.append(", deleteConfirmationDialogBatched=");
        LIZ.append(this.deleteConfirmationDialogBatched);
        LIZ.append(", deleteConfirmationDialogSingle=");
        LIZ.append(this.deleteConfirmationDialogSingle);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public WatchHistoryCopyResponse(String str, String str2, String str3, String str4, WatchHistoryDialogCopy watchHistoryDialogCopy, WatchHistoryDialogCopy watchHistoryDialogCopy2, WatchHistoryDialogCopy watchHistoryDialogCopy3) {
        this.actionButton = str;
        this.actionButtonWithoutNumber = str2;
        this.dialogHyperlink = str3;
        this.bannerHyperlink = str4;
        this.deleteConfirmationDialogAll = watchHistoryDialogCopy;
        this.deleteConfirmationDialogBatched = watchHistoryDialogCopy2;
        this.deleteConfirmationDialogSingle = watchHistoryDialogCopy3;
    }

    public /* synthetic */ WatchHistoryCopyResponse(String str, String str2, String str3, String str4, WatchHistoryDialogCopy watchHistoryDialogCopy, WatchHistoryDialogCopy watchHistoryDialogCopy2, WatchHistoryDialogCopy watchHistoryDialogCopy3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) == 0 ? str4 : null, watchHistoryDialogCopy, watchHistoryDialogCopy2, watchHistoryDialogCopy3);
    }
}
