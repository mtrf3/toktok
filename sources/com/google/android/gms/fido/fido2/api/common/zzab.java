package com.google.android.gms.fido.fido2.api.common;

import X.C79057V0z;
import X.QH7;
import X.R3C;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* loaded from: classes12.dex */
public final class zzab extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzab> CREATOR = new R3C();
    public final long zza;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.zza)});
    }

    public zzab(long j) {
        Long valueOf = Long.valueOf(j);
        QH7.LJIIIIZZ(valueOf);
        this.zza = valueOf.longValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzab) || this.zza != ((zzab) obj).zza) {
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJLJLI(parcel, 1, this.zza);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }
}
