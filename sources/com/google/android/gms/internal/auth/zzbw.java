package com.google.android.gms.internal.auth;

import X.C79057V0z;
import X.YP9;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes16.dex */
public final class zzbw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbw> CREATOR = new YP9();
    public final int LJLIL;
    public final String LJLILLLLZI;

    public zzbw() {
        this.LJLIL = 1;
    }

    public zzbw(int i, String str) {
        this.LJLIL = i;
        this.LJLILLLLZI = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 1, this.LJLIL);
        C79057V0z.LJJZZIII(parcel, 2, this.LJLILLLLZI, false);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }
}
