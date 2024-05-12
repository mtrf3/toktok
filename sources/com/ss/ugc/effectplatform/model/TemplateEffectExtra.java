package com.ss.ugc.effectplatform.model;

import X.ESY;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public class TemplateEffectExtra implements AndroidParcelable {
    public static final Parcelable.Creator CREATOR = new ESY();
    public String resource_id;

    /* JADX WARN: Multi-variable type inference failed */
    public TemplateEffectExtra() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        o.LJIIJ(parcel, "parcel");
        parcel.writeString(this.resource_id);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TemplateEffectExtra(resource_id=");
        LIZ.append(getResource_id());
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public String getResource_id() {
        return this.resource_id;
    }

    public TemplateEffectExtra(String str) {
        this.resource_id = str;
    }

    public void setResource_id(String str) {
        this.resource_id = str;
    }

    public /* synthetic */ TemplateEffectExtra(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }
}
