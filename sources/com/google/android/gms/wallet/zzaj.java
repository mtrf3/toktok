package com.google.android.gms.wallet;

import X.C68727QyB;
import X.C79057V0z;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes12.dex */
public final class zzaj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaj> CREATOR = new C68727QyB();
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final int LJLJI;
    public final int LJLJJI;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJZZIII(parcel, 2, this.LJLIL, false);
        C79057V0z.LJJZZIII(parcel, 3, this.LJLILLLLZI, false);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 4, this.LJLJI);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 5, this.LJLJJI);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public zzaj(String str, String str2, int i, int i2) {
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = i;
        this.LJLJJI = i2;
    }
}
