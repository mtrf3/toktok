package com.google.android.gms.maps.model;

import X.AbstractBinderC68227Qq7;
import X.C68772Qyu;
import X.C68775Qyx;
import X.C79057V0z;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes12.dex */
public class StampStyle extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StampStyle> CREATOR = new C68775Qyx();
    public final C68772Qyu zza;

    public StampStyle(IBinder iBinder) {
        this.zza = new C68772Qyu(AbstractBinderC68227Qq7.LLJI(iBinder));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJLIIIJLJLI(parcel, 2, this.zza.LIZ.asBinder());
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }
}
