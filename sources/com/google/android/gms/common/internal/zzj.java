package com.google.android.gms.common.internal;

import X.C67842Qju;
import X.C79057V0z;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes12.dex */
public final class zzj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzj> CREATOR = new C67842Qju();
    public final Bundle LJLIL;
    public final Feature[] LJLILLLLZI;
    public final int LJLJI;
    public final ConnectionTelemetryConfiguration LJLJJI;

    public zzj(Bundle bundle, Feature[] featureArr, int i, ConnectionTelemetryConfiguration connectionTelemetryConfiguration) {
        this.LJLIL = bundle;
        this.LJLILLLLZI = featureArr;
        this.LJLJI = i;
        this.LJLJJI = connectionTelemetryConfiguration;
    }

    public zzj() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJLI(parcel, 1, this.LJLIL);
        C79057V0z.LJLIIIL(parcel, 2, this.LJLILLLLZI, i);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 3, this.LJLJI);
        C79057V0z.LJJZZI(parcel, 4, this.LJLJJI, i, false);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }
}
