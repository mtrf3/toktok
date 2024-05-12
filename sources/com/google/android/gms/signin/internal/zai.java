package com.google.android.gms.signin.internal;

import X.C67849Qk1;
import X.C79057V0z;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zat;

/* loaded from: classes12.dex */
public final class zai extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zai> CREATOR = new C67849Qk1();
    public final int LJLIL;
    public final zat LJLILLLLZI;

    public zai(int i, zat zatVar) {
        this.LJLIL = i;
        this.LJLILLLLZI = zatVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 1, this.LJLIL);
        C79057V0z.LJJZZI(parcel, 2, this.LJLILLLLZI, i, false);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }
}
