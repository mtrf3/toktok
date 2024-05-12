package com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import X.S89;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TemplateField extends F9E implements Parcelable {
    public static final Parcelable.Creator<TemplateField> CREATOR = new S89();

    @InterfaceC65349Pkn("field_data")
    public final TemplateFieldData fieldData;

    @InterfaceC65349Pkn("field_id")
    public final long fieldId;

    @InterfaceC65349Pkn("field_type")
    public final int fieldType;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Long.valueOf(this.fieldId), Integer.valueOf(this.fieldType), this.fieldData};
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeLong(this.fieldId);
        out.writeInt(this.fieldType);
        this.fieldData.writeToParcel(out, i);
    }

    public static TemplateField L(TemplateField templateField, TemplateFieldData templateFieldData) {
        long j = templateField.fieldId;
        int i = templateField.fieldType;
        templateField.getClass();
        return new TemplateField(j, i, templateFieldData);
    }

    public TemplateField(long j, int i, TemplateFieldData fieldData) {
        o.LJIIIZ(fieldData, "fieldData");
        this.fieldId = j;
        this.fieldType = i;
        this.fieldData = fieldData;
    }
}
