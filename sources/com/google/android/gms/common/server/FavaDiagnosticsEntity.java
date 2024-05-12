package com.google.android.gms.common.server;

import X.C79057V0z;
import X.YPB;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes16.dex */
public class FavaDiagnosticsEntity extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<FavaDiagnosticsEntity> CREATOR = new YPB();
    public final int LJLIL;
    public final String zab;
    public final int zac;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 1, this.LJLIL);
        C79057V0z.LJJZZIII(parcel, 2, this.zab, false);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 3, this.zac);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public FavaDiagnosticsEntity(int i, String str, int i2) {
        this.LJLIL = i;
        this.zab = str;
        this.zac = i2;
    }
}
