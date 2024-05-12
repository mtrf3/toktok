package com.bytedance.android.livesdk.model.message.ext;

import X.F9E;
import X.InterfaceC65349Pkn;
import X.RUO;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class PromotionView extends F9E implements Parcelable {
    public static final Parcelable.Creator<PromotionView> CREATOR = new RUO();

    @InterfaceC65349Pkn("coupon_schema")
    public final String coupon_schema;

    @InterfaceC65349Pkn("promotion_items")
    public final List<PromotionItem> promotion_items;

    /* JADX WARN: Multi-variable type inference failed */
    public PromotionView() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.promotion_items, this.coupon_schema};
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        o.LJIIIZ(parcel, "parcel");
        List<PromotionItem> list = this.promotion_items;
        if (list != null) {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<PromotionItem> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, 0);
            }
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.coupon_schema);
    }

    public PromotionView(List<PromotionItem> list, String str) {
        this.promotion_items = list;
        this.coupon_schema = str;
    }

    public /* synthetic */ PromotionView(List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : str);
    }
}
