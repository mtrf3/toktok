package com.google.android.gms.common.internal;

import X.C64363PNv;
import X.C67769Qij;
import X.C67883QkZ;
import X.C79057V0z;
import X.InterfaceC67936QlQ;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes12.dex */
public final class zav extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zav> CREATOR = new C67769Qij();
    public final int LJLIL;
    public final IBinder LJLILLLLZI;
    public final ConnectionResult zac;
    public final boolean zad;
    public final boolean zae;

    public final boolean equals(Object obj) {
        IInterface queryLocalInterface;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zav)) {
            return false;
        }
        zav zavVar = (zav) obj;
        if (this.zac.equals(zavVar.zac)) {
            IBinder iBinder = this.LJLILLLLZI;
            IInterface iInterface = null;
            if (iBinder == null) {
                queryLocalInterface = null;
            } else {
                queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                if (!(queryLocalInterface instanceof InterfaceC67936QlQ)) {
                    queryLocalInterface = new C67883QkZ(iBinder);
                }
            }
            IBinder iBinder2 = zavVar.LJLILLLLZI;
            if (iBinder2 != null) {
                iInterface = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                if (!(iInterface instanceof InterfaceC67936QlQ)) {
                    iInterface = new C67883QkZ(iBinder2);
                }
            }
            if (C64363PNv.LIZ(queryLocalInterface, iInterface)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 1, this.LJLIL);
        C79057V0z.LJJLIIIJLJLI(parcel, 2, this.LJLILLLLZI);
        C79057V0z.LJJZZI(parcel, 3, this.zac, i, false);
        C79057V0z.LJJJZ(parcel, 4, this.zad);
        C79057V0z.LJJJZ(parcel, 5, this.zae);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public zav(int i, IBinder iBinder, ConnectionResult connectionResult, boolean z, boolean z2) {
        this.LJLIL = i;
        this.LJLILLLLZI = iBinder;
        this.zac = connectionResult;
        this.zad = z;
        this.zae = z2;
    }
}
