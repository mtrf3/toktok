package com.google.android.gms.maps.model;

import X.C16880lQ;
import X.C67553QfF;
import X.C79057V0z;
import X.QH7;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes12.dex */
public final class MapStyleOptions extends AbstractSafeParcelable {
    public String zzb;
    public static final String zza = C16880lQ.LJLLJ(MapStyleOptions.class);
    public static final Parcelable.Creator<MapStyleOptions> CREATOR = new C67553QfF();

    public MapStyleOptions(String str) {
        QH7.LJIIIZ(str, "json must not be null");
        this.zzb = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJZZIII(parcel, 2, this.zzb, false);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }
}
