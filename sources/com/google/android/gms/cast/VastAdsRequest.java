package com.google.android.gms.cast;

import X.C79057V0z;
import X.C90081ZWz;
import X.C90468Zey;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* loaded from: classes29.dex */
public class VastAdsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<VastAdsRequest> CREATOR = new C90081ZWz();
    public final String zza;
    public final String zzb;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb});
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VastAdsRequest)) {
            return false;
        }
        VastAdsRequest vastAdsRequest = (VastAdsRequest) obj;
        if (C90468Zey.LJFF(this.zza, vastAdsRequest.zza) && C90468Zey.LJFF(this.zzb, vastAdsRequest.zzb)) {
            return true;
        }
        return false;
    }

    public VastAdsRequest(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJZZIII(parcel, 2, this.zza, false);
        C79057V0z.LJJZZIII(parcel, 3, this.zzb, false);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }
}
