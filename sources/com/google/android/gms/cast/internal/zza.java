package com.google.android.gms.cast.internal;

import X.C79057V0z;
import X.C90468Zey;
import X.C90484ZfE;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* loaded from: classes29.dex */
public final class zza extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zza> CREATOR = new C90484ZfE();
    public final String zza;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza});
    }

    public zza() {
    }

    public zza(String str) {
        this.zza = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zza)) {
            return false;
        }
        return C90468Zey.LJFF(this.zza, ((zza) obj).zza);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJZZIII(parcel, 2, this.zza, false);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }
}
