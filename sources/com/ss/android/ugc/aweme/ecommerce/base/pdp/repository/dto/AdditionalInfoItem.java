package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C27630Ass;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AdditionalInfoItem implements Parcelable {
    public static final Parcelable.Creator<AdditionalInfoItem> CREATOR = new C27630Ass();

    @InterfaceC65349Pkn("key")
    public final String key;

    @InterfaceC65349Pkn("value")
    public final String values;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdditionalInfoItem)) {
            return false;
        }
        AdditionalInfoItem additionalInfoItem = (AdditionalInfoItem) obj;
        return o.LJ(this.key, additionalInfoItem.key) && o.LJ(this.values, additionalInfoItem.values);
    }

    public final int hashCode() {
        String str = this.key;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.values;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.key);
        out.writeString(this.values);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AdditionalInfoItem(key=");
        LIZ.append(this.key);
        LIZ.append(", values=");
        return q.LIZIZ(LIZ, this.values, ')', LIZ);
    }

    public AdditionalInfoItem(String str, String str2) {
        this.key = str;
        this.values = str2;
    }
}
