package com.google.android.gms.common;

import X.AbstractBinderC68227Qq7;
import X.BinderC68153Qov;
import X.C68440QtY;
import X.C79057V0z;
import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes12.dex */
public final class zzn extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzn> CREATOR = new C68440QtY();
    public final String zza;
    public final boolean zzb;
    public final boolean zzc;
    public final Context zzd;
    public final boolean zze;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJZZIII(parcel, 1, this.zza, false);
        C79057V0z.LJJJZ(parcel, 2, this.zzb);
        C79057V0z.LJJJZ(parcel, 3, this.zzc);
        C79057V0z.LJJLIIIJLJLI(parcel, 4, new BinderC68153Qov(this.zzd));
        C79057V0z.LJJJZ(parcel, 5, this.zze);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public zzn(String str, boolean z, boolean z2, IBinder iBinder, boolean z3) {
        this.zza = str;
        this.zzb = z;
        this.zzc = z2;
        this.zzd = (Context) BinderC68153Qov.LLJJIII(AbstractBinderC68227Qq7.LLJI(iBinder));
        this.zze = z3;
    }
}
