package com.google.android.gms.wallet;

import X.C68716Qy0;
import X.C79057V0z;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes12.dex */
public final class zzau extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzau> CREATOR = new C68716Qy0();
    public final String LJLIL;
    public final Bundle LJLILLLLZI;

    public zzau() {
    }

    public zzau(String str, Bundle bundle) {
        this.LJLIL = str;
        this.LJLILLLLZI = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJZZIII(parcel, 2, this.LJLIL, false);
        C79057V0z.LJJLI(parcel, 3, this.LJLILLLLZI);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }
}
