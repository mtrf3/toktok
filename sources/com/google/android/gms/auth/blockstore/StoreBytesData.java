package com.google.android.gms.auth.blockstore;

import X.C68414Qt8;
import X.C79057V0z;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes12.dex */
public class StoreBytesData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StoreBytesData> CREATOR = new C68414Qt8();
    public final byte[] zza;
    public final boolean zzb;
    public final String zzc;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJLIIIJ(parcel, 1, this.zza, false);
        C79057V0z.LJJJZ(parcel, 2, this.zzb);
        C79057V0z.LJJZZIII(parcel, 3, this.zzc, false);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public StoreBytesData(String str, byte[] bArr, boolean z) {
        this.zza = bArr;
        this.zzb = z;
        this.zzc = str;
    }
}
