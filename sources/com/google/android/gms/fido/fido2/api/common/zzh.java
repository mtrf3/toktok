package com.google.android.gms.fido.fido2.api.common;

import X.C68748QyW;
import X.C79057V0z;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* loaded from: classes12.dex */
public final class zzh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzh> CREATOR = new C68748QyW();
    public final boolean zza;
    public final byte[] zzb;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.zza), this.zzb});
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzh)) {
            return false;
        }
        zzh zzhVar = (zzh) obj;
        if (this.zza != zzhVar.zza || !Arrays.equals(this.zzb, zzhVar.zzb)) {
            return false;
        }
        return true;
    }

    public zzh(byte[] bArr, boolean z) {
        this.zza = z;
        this.zzb = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJJZ(parcel, 1, this.zza);
        C79057V0z.LJJLIIIJ(parcel, 2, this.zzb, false);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }
}
