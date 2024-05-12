package com.bytedance.android.livesdk.model.message.ext;

import X.F9E;
import X.InterfaceC65349Pkn;
import X.RUM;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class PromotionProperty extends F9E implements Serializable, Parcelable {
    public static final Parcelable.Creator<PromotionProperty> CREATOR = new RUM();

    @InterfaceC65349Pkn("property_name")
    public final String propertyName;

    @InterfaceC65349Pkn("property_value")
    public final String propertyValue;

    /* JADX WARN: Multi-variable type inference failed */
    public PromotionProperty() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ PromotionProperty copy$default(PromotionProperty promotionProperty, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = promotionProperty.propertyName;
        }
        if ((i & 2) != 0) {
            str2 = promotionProperty.propertyValue;
        }
        return promotionProperty.copy(str, str2);
    }

    public final PromotionProperty copy(String str, String str2) {
        return new PromotionProperty(str, str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.propertyName, this.propertyValue};
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        o.LJIIIZ(parcel, "parcel");
        parcel.writeString(this.propertyName);
        parcel.writeString(this.propertyValue);
    }

    public final String getPropertyName() {
        return this.propertyName;
    }

    public final String getPropertyValue() {
        return this.propertyValue;
    }

    public PromotionProperty(String str, String str2) {
        this.propertyName = str;
        this.propertyValue = str2;
    }

    public /* synthetic */ PromotionProperty(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
