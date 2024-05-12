package com.ss.android.ugc.aweme.im.message.template.card.dynamic;

import X.OHH;
import X.V44;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.component.BaseComponent;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class DynamicInfoComponent implements BaseComponent<V44> {
    public static final Parcelable.Creator<DynamicInfoComponent> CREATOR = new OHH();
    public String businessId;
    public String businessType;
    public String cardKey;
    public String cardTemplate;
    public int defaultHeight;
    public int defaultWidth;
    public String rawData;
    public String schema;
    public DynamicUiLocationType uiLocationType;

    public DynamicInfoComponent() {
        this(null, null, null, null, null, null, 0, 0, DynamicUiLocationType.MESSAGE_NORMAL);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DynamicInfoComponent)) {
            return false;
        }
        DynamicInfoComponent dynamicInfoComponent = (DynamicInfoComponent) obj;
        return o.LJ(this.cardKey, dynamicInfoComponent.cardKey) && o.LJ(this.schema, dynamicInfoComponent.schema) && o.LJ(this.cardTemplate, dynamicInfoComponent.cardTemplate) && o.LJ(this.rawData, dynamicInfoComponent.rawData) && o.LJ(this.businessType, dynamicInfoComponent.businessType) && o.LJ(this.businessId, dynamicInfoComponent.businessId) && this.defaultHeight == dynamicInfoComponent.defaultHeight && this.defaultWidth == dynamicInfoComponent.defaultWidth && this.uiLocationType == dynamicInfoComponent.uiLocationType;
    }

    public final int hashCode() {
        String str = this.cardKey;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.schema;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.cardTemplate;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.rawData;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.businessType;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.businessId;
        int hashCode6 = (((((hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31) + this.defaultHeight) * 31) + this.defaultWidth) * 31;
        DynamicUiLocationType dynamicUiLocationType = this.uiLocationType;
        return hashCode6 + (dynamicUiLocationType != null ? dynamicUiLocationType.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DynamicInfoComponent(cardKey=");
        LIZ.append(this.cardKey);
        LIZ.append(", schema=");
        LIZ.append(this.schema);
        LIZ.append(", cardTemplate=");
        LIZ.append(this.cardTemplate);
        LIZ.append(", rawData=");
        LIZ.append(this.rawData);
        LIZ.append(", businessType=");
        LIZ.append(this.businessType);
        LIZ.append(", businessId=");
        LIZ.append(this.businessId);
        LIZ.append(", defaultHeight=");
        LIZ.append(this.defaultHeight);
        LIZ.append(", defaultWidth=");
        LIZ.append(this.defaultWidth);
        LIZ.append(", uiLocationType=");
        LIZ.append(this.uiLocationType);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.cardKey);
        out.writeString(this.schema);
        out.writeString(this.cardTemplate);
        out.writeString(this.rawData);
        out.writeString(this.businessType);
        out.writeString(this.businessId);
        out.writeInt(this.defaultHeight);
        out.writeInt(this.defaultWidth);
        DynamicUiLocationType dynamicUiLocationType = this.uiLocationType;
        if (dynamicUiLocationType == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            dynamicUiLocationType.writeToParcel(out, i);
        }
    }

    public DynamicInfoComponent(String str, String str2, String str3, String str4, String str5, String str6, int i, int i2, DynamicUiLocationType dynamicUiLocationType) {
        this.cardKey = str;
        this.schema = str2;
        this.cardTemplate = str3;
        this.rawData = str4;
        this.businessType = str5;
        this.businessId = str6;
        this.defaultHeight = i;
        this.defaultWidth = i2;
        this.uiLocationType = dynamicUiLocationType;
    }
}
