package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C1FJ;
import X.C27053AjZ;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import defpackage.q;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class BillItem implements Parcelable {
    public static final Parcelable.Creator<BillItem> CREATOR = new C27053AjZ();

    @InterfaceC65349Pkn("item_explain")
    public final String itemExplain;

    @InterfaceC65349Pkn("item_name")
    public final String itemName;

    @InterfaceC65349Pkn("item_price")
    public final Price itemPrice;

    @InterfaceC65349Pkn("item_text")
    public final String itemText;

    @InterfaceC65349Pkn("item_text_color")
    public final Integer itemTextColor;

    @InterfaceC65349Pkn("item_text_font")
    public final Integer itemTextFont;

    @InterfaceC65349Pkn("item_type")
    public final Integer itemType;

    @InterfaceC65349Pkn("logo")
    public final Icon logo;

    @InterfaceC65349Pkn("sub_items")
    public final ArrayList<BillItem> subItems;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BillItem copy$default(BillItem billItem, Integer num, String str, Price price, Icon icon, Integer num2, Integer num3, String str2, ArrayList arrayList, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            num = billItem.itemType;
        }
        if ((i & 2) != 0) {
            str = billItem.itemName;
        }
        if ((i & 4) != 0) {
            price = billItem.itemPrice;
        }
        if ((i & 8) != 0) {
            icon = billItem.logo;
        }
        if ((i & 16) != 0) {
            num2 = billItem.itemTextColor;
        }
        if ((i & 32) != 0) {
            num3 = billItem.itemTextFont;
        }
        if ((i & 64) != 0) {
            str2 = billItem.itemText;
        }
        if ((i & 128) != 0) {
            arrayList = billItem.subItems;
        }
        if ((i & 256) != 0) {
            str3 = billItem.itemExplain;
        }
        return billItem.copy(num, str, price, icon, num2, num3, str2, arrayList, str3);
    }

    public final BillItem copy(Integer num, String str, Price price, Icon icon, Integer num2, Integer num3, String str2, ArrayList<BillItem> arrayList, String str3) {
        return new BillItem(num, str, price, icon, num2, num3, str2, arrayList, str3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BillItem)) {
            return false;
        }
        BillItem billItem = (BillItem) obj;
        return o.LJ(this.itemType, billItem.itemType) && o.LJ(this.itemName, billItem.itemName) && o.LJ(this.itemPrice, billItem.itemPrice) && o.LJ(this.logo, billItem.logo) && o.LJ(this.itemTextColor, billItem.itemTextColor) && o.LJ(this.itemTextFont, billItem.itemTextFont) && o.LJ(this.itemText, billItem.itemText) && o.LJ(this.subItems, billItem.subItems) && o.LJ(this.itemExplain, billItem.itemExplain);
    }

    public int hashCode() {
        Integer num = this.itemType;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.itemName;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Price price = this.itemPrice;
        int hashCode3 = (hashCode2 + (price == null ? 0 : price.hashCode())) * 31;
        Icon icon = this.logo;
        int hashCode4 = (hashCode3 + (icon == null ? 0 : icon.hashCode())) * 31;
        Integer num2 = this.itemTextColor;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.itemTextFont;
        int hashCode6 = (hashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str2 = this.itemText;
        int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ArrayList<BillItem> arrayList = this.subItems;
        int hashCode8 = (hashCode7 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        String str3 = this.itemExplain;
        return hashCode8 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BillItem(itemType=");
        LIZ.append(this.itemType);
        LIZ.append(", itemName=");
        LIZ.append(this.itemName);
        LIZ.append(", itemPrice=");
        LIZ.append(this.itemPrice);
        LIZ.append(", logo=");
        LIZ.append(this.logo);
        LIZ.append(", itemTextColor=");
        LIZ.append(this.itemTextColor);
        LIZ.append(", itemTextFont=");
        LIZ.append(this.itemTextFont);
        LIZ.append(", itemText=");
        LIZ.append(this.itemText);
        LIZ.append(", subItems=");
        LIZ.append(this.subItems);
        LIZ.append(", itemExplain=");
        return q.LIZIZ(LIZ, this.itemExplain, ')', LIZ);
    }

    public final String getItemExplain() {
        return this.itemExplain;
    }

    public final String getItemName() {
        return this.itemName;
    }

    public final Price getItemPrice() {
        return this.itemPrice;
    }

    public final String getItemText() {
        return this.itemText;
    }

    public final Integer getItemTextColor() {
        return this.itemTextColor;
    }

    public final Integer getItemTextFont() {
        return this.itemTextFont;
    }

    public final Integer getItemType() {
        return this.itemType;
    }

    public final Icon getLogo() {
        return this.logo;
    }

    public final ArrayList<BillItem> getSubItems() {
        return this.subItems;
    }

    public final BillItem merge(BillItem billItem) {
        if (billItem == null) {
            return this;
        }
        Integer num = billItem.itemType;
        if (num == null) {
            num = this.itemType;
        }
        String str = billItem.itemName;
        if (str == null) {
            str = this.itemName;
        }
        Price price = billItem.itemPrice;
        if (price == null) {
            price = this.itemPrice;
        }
        Icon icon = billItem.logo;
        if (icon == null) {
            icon = this.logo;
        }
        Integer num2 = billItem.itemTextColor;
        if (num2 == null) {
            num2 = this.itemTextColor;
        }
        Integer num3 = billItem.itemTextFont;
        if (num3 == null) {
            num3 = this.itemTextFont;
        }
        String str2 = billItem.itemText;
        if (str2 == null) {
            str2 = this.itemText;
        }
        ArrayList<BillItem> arrayList = billItem.subItems;
        if (arrayList == null) {
            arrayList = this.subItems;
        }
        String str3 = billItem.itemExplain;
        if (str3 == null) {
            str3 = this.itemExplain;
        }
        return new BillItem(num, str, price, icon, num2, num3, str2, arrayList, str3);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        Integer num = this.itemType;
        if (num == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num);
        }
        out.writeString(this.itemName);
        Price price = this.itemPrice;
        if (price == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            price.writeToParcel(out, i);
        }
        Icon icon = this.logo;
        if (icon == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            icon.writeToParcel(out, i);
        }
        Integer num2 = this.itemTextColor;
        if (num2 == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num2);
        }
        Integer num3 = this.itemTextFont;
        if (num3 == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num3);
        }
        out.writeString(this.itemText);
        ArrayList<BillItem> arrayList = this.subItems;
        if (arrayList == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(arrayList.size());
            Iterator<BillItem> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(out, i);
            }
        }
        out.writeString(this.itemExplain);
    }

    public BillItem(Integer num, String str, Price price, Icon icon, Integer num2, Integer num3, String str2, ArrayList<BillItem> arrayList, String str3) {
        this.itemType = num;
        this.itemName = str;
        this.itemPrice = price;
        this.logo = icon;
        this.itemTextColor = num2;
        this.itemTextFont = num3;
        this.itemText = str2;
        this.subItems = arrayList;
        this.itemExplain = str3;
    }
}
