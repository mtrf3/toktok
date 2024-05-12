package com.google.android.gms.wallet.wobs;

import X.C68761Qyj;
import X.C79057V0z;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes12.dex */
public final class TimeInterval extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TimeInterval> CREATOR = new C68761Qyj();
    public long zza;
    public long zzb;

    public TimeInterval() {
    }

    public TimeInterval(long j, long j2) {
        this.zza = j;
        this.zzb = j2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJLJLI(parcel, 2, this.zza);
        C79057V0z.LJJLJLI(parcel, 3, this.zzb);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }
}
