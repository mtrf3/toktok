package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C1FJ;
import X.InterfaceC65349Pkn;
import X.RTJ;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class PurchaseNotice implements Parcelable {
    public static final Parcelable.Creator<PurchaseNotice> CREATOR = new RTJ();

    @InterfaceC65349Pkn("desc")
    public final String desc;

    @InterfaceC65349Pkn("popup_prompt")
    public final PopupPrompt popupPrompt;

    @InterfaceC65349Pkn("notice_type")
    public final Integer purchaseNoticeType;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PurchaseNotice)) {
            return false;
        }
        PurchaseNotice purchaseNotice = (PurchaseNotice) obj;
        return o.LJ(this.desc, purchaseNotice.desc) && o.LJ(this.purchaseNoticeType, purchaseNotice.purchaseNoticeType) && o.LJ(this.popupPrompt, purchaseNotice.popupPrompt);
    }

    public final int hashCode() {
        String str = this.desc;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.purchaseNoticeType;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        PopupPrompt popupPrompt = this.popupPrompt;
        return hashCode2 + (popupPrompt != null ? popupPrompt.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PurchaseNotice(desc=");
        LIZ.append(this.desc);
        LIZ.append(", purchaseNoticeType=");
        LIZ.append(this.purchaseNoticeType);
        LIZ.append(", popupPrompt=");
        LIZ.append(this.popupPrompt);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.desc);
        Integer num = this.purchaseNoticeType;
        if (num == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num);
        }
        PopupPrompt popupPrompt = this.popupPrompt;
        if (popupPrompt == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            popupPrompt.writeToParcel(out, i);
        }
    }

    public PurchaseNotice(String str, Integer num, PopupPrompt popupPrompt) {
        this.desc = str;
        this.purchaseNoticeType = num;
        this.popupPrompt = popupPrompt;
    }
}
