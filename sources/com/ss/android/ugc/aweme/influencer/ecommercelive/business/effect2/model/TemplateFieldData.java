package com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model;

import X.InterfaceC65349Pkn;
import X.S8D;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TemplateFieldData implements Parcelable {
    public static final Parcelable.Creator<TemplateFieldData> CREATOR = new S8D();

    @InterfaceC65349Pkn("product_image")
    public final TemplateFieldProduct fieldProduct;

    @InterfaceC65349Pkn("text")
    public final TemplateFieldText fieldText;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        TemplateFieldText templateFieldText = this.fieldText;
        int hashCode = (templateFieldText == null ? 0 : templateFieldText.hashCode()) * 31;
        TemplateFieldProduct templateFieldProduct = this.fieldProduct;
        return hashCode + (templateFieldProduct != null ? templateFieldProduct.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TemplateFieldData(fieldText=");
        LIZ.append(this.fieldText);
        LIZ.append(", fieldProduct=");
        LIZ.append(this.fieldProduct);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        TemplateFieldText templateFieldText = this.fieldText;
        if (templateFieldText == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            templateFieldText.writeToParcel(out, i);
        }
        TemplateFieldProduct templateFieldProduct = this.fieldProduct;
        if (templateFieldProduct == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            templateFieldProduct.writeToParcel(out, i);
        }
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof TemplateFieldData)) {
            TemplateFieldData templateFieldData = (TemplateFieldData) obj;
            if (o.LJ(this.fieldText, templateFieldData.fieldText) && o.LJ(this.fieldProduct, templateFieldData.fieldProduct)) {
                return true;
            }
        }
        return false;
    }

    public TemplateFieldData(TemplateFieldText templateFieldText, TemplateFieldProduct templateFieldProduct) {
        this.fieldText = templateFieldText;
        this.fieldProduct = templateFieldProduct;
    }
}
