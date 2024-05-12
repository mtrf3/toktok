package com.ss.android.ugc.aweme.ecommerce.base.osp.module.summary;

import X.C1FJ;
import X.C27054Aja;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillItem;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class SubBillItemData implements Parcelable {
    public static final Parcelable.Creator<SubBillItemData> CREATOR = new C27054Aja();
    public final String itemFee;
    public final Integer itemFeeColor;
    public final String itemName;
    public final String itemText;
    public final Integer itemTextColor;
    public final Integer itemType;
    public final String link;
    public final ArrayList<BillItem> subItems;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubBillItemData)) {
            return false;
        }
        SubBillItemData subBillItemData = (SubBillItemData) obj;
        return o.LJ(this.itemName, subBillItemData.itemName) && o.LJ(this.itemFee, subBillItemData.itemFee) && o.LJ(this.itemFeeColor, subBillItemData.itemFeeColor) && o.LJ(this.link, subBillItemData.link) && o.LJ(this.itemTextColor, subBillItemData.itemTextColor) && o.LJ(this.itemType, subBillItemData.itemType) && o.LJ(this.itemText, subBillItemData.itemText) && o.LJ(this.subItems, subBillItemData.subItems);
    }

    public final int hashCode() {
        String str = this.itemName;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.itemFee;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.itemFeeColor;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.link;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num2 = this.itemTextColor;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.itemType;
        int hashCode6 = (hashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str4 = this.itemText;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        ArrayList<BillItem> arrayList = this.subItems;
        return hashCode7 + (arrayList != null ? arrayList.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SubBillItemData(itemName=");
        LIZ.append(this.itemName);
        LIZ.append(", itemFee=");
        LIZ.append(this.itemFee);
        LIZ.append(", itemFeeColor=");
        LIZ.append(this.itemFeeColor);
        LIZ.append(", link=");
        LIZ.append(this.link);
        LIZ.append(", itemTextColor=");
        LIZ.append(this.itemTextColor);
        LIZ.append(", itemType=");
        LIZ.append(this.itemType);
        LIZ.append(", itemText=");
        LIZ.append(this.itemText);
        LIZ.append(", subItems=");
        LIZ.append(this.subItems);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.itemName);
        out.writeString(this.itemFee);
        Integer num = this.itemFeeColor;
        if (num == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num);
        }
        out.writeString(this.link);
        Integer num2 = this.itemTextColor;
        if (num2 == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num2);
        }
        Integer num3 = this.itemType;
        if (num3 == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num3);
        }
        out.writeString(this.itemText);
        ArrayList<BillItem> arrayList = this.subItems;
        if (arrayList == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        out.writeInt(arrayList.size());
        Iterator<BillItem> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(out, i);
        }
    }

    public SubBillItemData(String str, String str2, Integer num, String str3, Integer num2, Integer num3, String str4, ArrayList<BillItem> arrayList) {
        this.itemName = str;
        this.itemFee = str2;
        this.itemFeeColor = num;
        this.link = str3;
        this.itemTextColor = num2;
        this.itemType = num3;
        this.itemText = str4;
        this.subItems = arrayList;
    }
}
