package com.google.android.gms.cast;

import X.C79057V0z;
import X.C90067ZWl;
import X.C90468Zey;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* loaded from: classes29.dex */
public final class zzar extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzar> CREATOR = new C90067ZWl();
    public final zzap zza;
    public final zzap zzb;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb});
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzar)) {
            return false;
        }
        zzar zzarVar = (zzar) obj;
        if (C90468Zey.LJFF(this.zza, zzarVar.zza) && C90468Zey.LJFF(this.zzb, zzarVar.zzb)) {
            return true;
        }
        return false;
    }

    public zzar(zzap zzapVar, zzap zzapVar2) {
        this.zza = zzapVar;
        this.zzb = zzapVar2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJZZI(parcel, 2, this.zza, i, false);
        C79057V0z.LJJZZI(parcel, 3, this.zzb, i, false);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }
}
