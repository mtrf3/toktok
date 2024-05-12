package com.google.android.gms.cast;

import X.C79057V0z;
import X.C90065ZWj;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* loaded from: classes29.dex */
public final class zzap extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzap> CREATOR = new C90065ZWj();
    public final float zza;
    public final float zzb;
    public final float zzc;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.zza), Float.valueOf(this.zzb), Float.valueOf(this.zzc)});
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzap)) {
            return false;
        }
        zzap zzapVar = (zzap) obj;
        if (this.zza == zzapVar.zza && this.zzb == zzapVar.zzb && this.zzc == zzapVar.zzc) {
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJLIIIJJIZ(parcel, 2, this.zza);
        C79057V0z.LJJLIIIJJIZ(parcel, 3, this.zzb);
        C79057V0z.LJJLIIIJJIZ(parcel, 4, this.zzc);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public zzap(float f, float f2, float f3) {
        this.zza = f;
        this.zzb = f2;
        this.zzc = f3;
    }
}
