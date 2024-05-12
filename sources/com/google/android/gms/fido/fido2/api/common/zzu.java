package com.google.android.gms.fido.fido2.api.common;

import X.C79057V0z;
import X.QH7;
import X.R3H;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* loaded from: classes12.dex */
public final class zzu extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzu> CREATOR = new R3H();
    public final boolean zza;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.zza)});
    }

    public zzu(boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        QH7.LJIIIIZZ(valueOf);
        this.zza = valueOf.booleanValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzu) || this.zza != ((zzu) obj).zza) {
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJJZ(parcel, 1, this.zza);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }
}
