package com.google.android.gms.common.server.converter;

import X.C67311QbL;
import X.C79057V0z;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes12.dex */
public final class zac extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zac> CREATOR = new C67311QbL();
    public final int LJLIL;
    public final String LJLILLLLZI;
    public final int LJLJI;

    public zac(String str, int i) {
        this.LJLIL = 1;
        this.LJLILLLLZI = str;
        this.LJLJI = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 1, this.LJLIL);
        C79057V0z.LJJZZIII(parcel, 2, this.LJLILLLLZI, false);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 3, this.LJLJI);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public zac(int i, String str, int i2) {
        this.LJLIL = i;
        this.LJLILLLLZI = str;
        this.LJLJI = i2;
    }
}
