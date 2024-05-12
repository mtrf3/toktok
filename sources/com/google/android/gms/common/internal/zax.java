package com.google.android.gms.common.internal;

import X.C67879QkV;
import X.C79057V0z;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes12.dex */
public final class zax extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zax> CREATOR = new C67879QkV();
    public final int LJLIL;
    public final int zab;
    public final int zac;
    public final Scope[] zad;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 1, this.LJLIL);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 2, this.zab);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 3, this.zac);
        C79057V0z.LJLIIIL(parcel, 4, this.zad, i);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public zax(int i, int i2, int i3, Scope[] scopeArr) {
        this.LJLIL = i;
        this.zab = i2;
        this.zac = i3;
        this.zad = scopeArr;
    }
}
