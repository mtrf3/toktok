package com.google.android.gms.fido.fido2.api.common;

import X.C68861R0v;
import X.C79057V0z;
import X.QH7;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* loaded from: classes12.dex */
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new C68861R0v();
    public final long zza;
    public final byte[] zzb;
    public final byte[] zzc;
    public final byte[] zzd;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.zza), this.zzb, this.zzc, this.zzd});
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzq)) {
            return false;
        }
        zzq zzqVar = (zzq) obj;
        if (this.zza != zzqVar.zza || !Arrays.equals(this.zzb, zzqVar.zzb) || !Arrays.equals(this.zzc, zzqVar.zzc) || !Arrays.equals(this.zzd, zzqVar.zzd)) {
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJLJLI(parcel, 1, this.zza);
        C79057V0z.LJJLIIIJ(parcel, 2, this.zzb, false);
        C79057V0z.LJJLIIIJ(parcel, 3, this.zzc, false);
        C79057V0z.LJJLIIIJ(parcel, 4, this.zzd, false);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public zzq(long j, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.zza = j;
        QH7.LJIIIIZZ(bArr);
        this.zzb = bArr;
        QH7.LJIIIIZZ(bArr2);
        this.zzc = bArr2;
        QH7.LJIIIIZZ(bArr3);
        this.zzd = bArr3;
    }
}
