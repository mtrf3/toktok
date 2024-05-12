package com.google.android.gms.wallet;

import X.C68178QpK;
import X.C79057V0z;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;

/* loaded from: classes12.dex */
public final class IsReadyToPayRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<IsReadyToPayRequest> CREATOR = new C68178QpK();
    public final String LJLIL;
    public final String LJLILLLLZI;
    public ArrayList zza;
    public ArrayList zzd;
    public boolean zze;
    public String zzf;

    public IsReadyToPayRequest() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJLIL(parcel, 2, this.zza);
        C79057V0z.LJJZZIII(parcel, 4, this.LJLIL, false);
        C79057V0z.LJJZZIII(parcel, 5, this.LJLILLLLZI, false);
        C79057V0z.LJJLIL(parcel, 6, this.zzd);
        C79057V0z.LJJJZ(parcel, 7, this.zze);
        C79057V0z.LJJZZIII(parcel, 8, this.zzf, false);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public IsReadyToPayRequest(ArrayList arrayList, String str, String str2, ArrayList arrayList2, boolean z, String str3) {
        this.zza = arrayList;
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.zzd = arrayList2;
        this.zze = z;
        this.zzf = str3;
    }
}
