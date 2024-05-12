package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C27509Aqv;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ModelFigure implements Parcelable {
    public static final Parcelable.Creator<ModelFigure> CREATOR = new C27509Aqv();

    @InterfaceC65349Pkn("name")
    public final String name;

    @InterfaceC65349Pkn("value")
    public final String value;

    /* JADX WARN: Multi-variable type inference failed */
    public ModelFigure() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ModelFigure)) {
            return false;
        }
        ModelFigure modelFigure = (ModelFigure) obj;
        return o.LJ(this.name, modelFigure.name) && o.LJ(this.value, modelFigure.value);
    }

    public final int hashCode() {
        String str = this.name;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.value;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.name);
        out.writeString(this.value);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ModelFigure(name=");
        LIZ.append(this.name);
        LIZ.append(", value=");
        return q.LIZIZ(LIZ, this.value, ')', LIZ);
    }

    public ModelFigure(String str, String str2) {
        this.name = str;
        this.value = str2;
    }

    public /* synthetic */ ModelFigure(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
