package com.ss.android.ugc.aweme.ecommerce.base.review;

import X.C48339Iy7;
import X.C70802RqY;
import X.C79062V1e;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class Option implements Parcelable {
    public static final Parcelable.Creator<Option> CREATOR = new C70802RqY();
    public final boolean isEnabled;
    public final String key;
    public final String value;
    public final String valueForEvent;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Option)) {
            return false;
        }
        Option option = (Option) obj;
        return o.LJ(this.value, option.value) && o.LJ(this.key, option.key) && o.LJ(this.valueForEvent, option.valueForEvent) && this.isEnabled == option.isEnabled;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.value);
        out.writeString(this.key);
        out.writeString(this.valueForEvent);
        out.writeInt(this.isEnabled ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.key, this.value.hashCode() * 31, 31);
        String str = this.valueForEvent;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i = (LJ + hashCode) * 31;
        boolean z = this.isEnabled;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        return i + i2;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Option(value=");
        LIZ.append(this.value);
        LIZ.append(", key=");
        LIZ.append(this.key);
        LIZ.append(", valueForEvent=");
        LIZ.append(this.valueForEvent);
        LIZ.append(", isEnabled=");
        return C48339Iy7.LIZJ(LIZ, this.isEnabled, ')', LIZ);
    }

    public Option(String value, String key, String str, boolean z) {
        o.LJIIIZ(value, "value");
        o.LJIIIZ(key, "key");
        this.value = value;
        this.key = key;
        this.valueForEvent = str;
        this.isEnabled = z;
    }
}
