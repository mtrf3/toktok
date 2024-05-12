package com.ss.android.ugc.aweme.compliance.api.model;

import X.C61878OQg;
import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class ResetEntryTextData implements Serializable {

    @InterfaceC65349Pkn("button_cancel")
    public final String cancel;

    @InterfaceC65349Pkn("desc")
    public final String description;

    @InterfaceC65349Pkn("item_link_list")
    public final List<String> itemLinkList;

    @InterfaceC65349Pkn("item_list")
    public final List<String> itemList;

    @InterfaceC65349Pkn("button_ok")
    public final String ok;

    @InterfaceC65349Pkn("reset_done_popup_desc")
    public final String resetDonePopupDesc;

    @InterfaceC65349Pkn("reset_not_done_popup_desc")
    public final String resetNotDonePopupDesc;

    @InterfaceC65349Pkn("reset_status")
    public Integer resetStatus;

    @InterfaceC65349Pkn("title")
    public final String title;

    @InterfaceC65349Pkn("button_withdraw")
    public final String withdraw;

    public ResetEntryTextData() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ResetEntryTextData copy$default(ResetEntryTextData resetEntryTextData, String str, String str2, Integer num, String str3, String str4, List list, List list2, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = resetEntryTextData.title;
        }
        if ((i & 2) != 0) {
            str2 = resetEntryTextData.description;
        }
        if ((i & 4) != 0) {
            num = resetEntryTextData.resetStatus;
        }
        if ((i & 8) != 0) {
            str3 = resetEntryTextData.resetNotDonePopupDesc;
        }
        if ((i & 16) != 0) {
            str4 = resetEntryTextData.resetDonePopupDesc;
        }
        if ((i & 32) != 0) {
            list = resetEntryTextData.itemList;
        }
        if ((i & 64) != 0) {
            list2 = resetEntryTextData.itemLinkList;
        }
        if ((i & 128) != 0) {
            str5 = resetEntryTextData.withdraw;
        }
        if ((i & 256) != 0) {
            str6 = resetEntryTextData.cancel;
        }
        if ((i & 512) != 0) {
            str7 = resetEntryTextData.ok;
        }
        return resetEntryTextData.copy(str, str2, num, str3, str4, list, list2, str5, str6, str7);
    }

    public final ResetEntryTextData copy(String str, String str2, Integer num, String str3, String str4, List<String> list, List<String> list2, String str5, String str6, String str7) {
        return new ResetEntryTextData(str, str2, num, str3, str4, list, list2, str5, str6, str7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResetEntryTextData)) {
            return false;
        }
        ResetEntryTextData resetEntryTextData = (ResetEntryTextData) obj;
        return o.LJ(this.title, resetEntryTextData.title) && o.LJ(this.description, resetEntryTextData.description) && o.LJ(this.resetStatus, resetEntryTextData.resetStatus) && o.LJ(this.resetNotDonePopupDesc, resetEntryTextData.resetNotDonePopupDesc) && o.LJ(this.resetDonePopupDesc, resetEntryTextData.resetDonePopupDesc) && o.LJ(this.itemList, resetEntryTextData.itemList) && o.LJ(this.itemLinkList, resetEntryTextData.itemLinkList) && o.LJ(this.withdraw, resetEntryTextData.withdraw) && o.LJ(this.cancel, resetEntryTextData.cancel) && o.LJ(this.ok, resetEntryTextData.ok);
    }

    public int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.description;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.resetStatus;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.resetNotDonePopupDesc;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.resetDonePopupDesc;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<String> list = this.itemList;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.itemLinkList;
        int hashCode7 = (hashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str5 = this.withdraw;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.cancel;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.ok;
        return hashCode9 + (str7 != null ? str7.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ResetEntryTextData(title=");
        LIZ.append(this.title);
        LIZ.append(", description=");
        LIZ.append(this.description);
        LIZ.append(", resetStatus=");
        LIZ.append(this.resetStatus);
        LIZ.append(", resetNotDonePopupDesc=");
        LIZ.append(this.resetNotDonePopupDesc);
        LIZ.append(", resetDonePopupDesc=");
        LIZ.append(this.resetDonePopupDesc);
        LIZ.append(", itemList=");
        LIZ.append(this.itemList);
        LIZ.append(", itemLinkList=");
        LIZ.append(this.itemLinkList);
        LIZ.append(", withdraw=");
        LIZ.append(this.withdraw);
        LIZ.append(", cancel=");
        LIZ.append(this.cancel);
        LIZ.append(", ok=");
        return q.LIZIZ(LIZ, this.ok, ')', LIZ);
    }

    public final String getCancel() {
        return this.cancel;
    }

    public final String getDescription() {
        return this.description;
    }

    public final List<String> getItemLinkList() {
        return this.itemLinkList;
    }

    public final List<String> getItemList() {
        return this.itemList;
    }

    public final String getOk() {
        return this.ok;
    }

    public final String getResetDonePopupDesc() {
        return this.resetDonePopupDesc;
    }

    public final String getResetNotDonePopupDesc() {
        return this.resetNotDonePopupDesc;
    }

    public final Integer getResetStatus() {
        return this.resetStatus;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getWithdraw() {
        return this.withdraw;
    }

    public final void setResetStatus(Integer num) {
        this.resetStatus = num;
    }

    public ResetEntryTextData(String str, String str2, Integer num, String str3, String str4, List<String> list, List<String> list2, String str5, String str6, String str7) {
        this.title = str;
        this.description = str2;
        this.resetStatus = num;
        this.resetNotDonePopupDesc = str3;
        this.resetDonePopupDesc = str4;
        this.itemList = list;
        this.itemLinkList = list2;
        this.withdraw = str5;
        this.cancel = str6;
        this.ok = str7;
    }

    public ResetEntryTextData(String str, String str2, Integer num, String str3, String str4, List list, List list2, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? -1 : num, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? C61878OQg.INSTANCE : list, (i & 64) != 0 ? C61878OQg.INSTANCE : list2, (i & 128) != 0 ? "" : str5, (i & 256) != 0 ? "" : str6, (i & 512) == 0 ? str7 : "");
    }
}
