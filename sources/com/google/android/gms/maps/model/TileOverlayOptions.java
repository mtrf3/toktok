package com.google.android.gms.maps.model;

import X.C68797QzJ;
import X.C68798QzK;
import X.C68799QzL;
import X.C79057V0z;
import X.InterfaceC68800QzM;
import X.InterfaceC68802QzO;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes12.dex */
public final class TileOverlayOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TileOverlayOptions> CREATOR = new C68797QzJ();
    public InterfaceC68800QzM zza;
    public InterfaceC68802QzO zzb;
    public boolean zzc;
    public float zzd;
    public boolean zze;
    public float zzf;

    public TileOverlayOptions() {
        this.zzc = true;
        this.zze = true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        IBinder asBinder;
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        InterfaceC68800QzM interfaceC68800QzM = this.zza;
        if (interfaceC68800QzM == null) {
            asBinder = null;
        } else {
            asBinder = interfaceC68800QzM.asBinder();
        }
        C79057V0z.LJJLIIIJLJLI(parcel, 2, asBinder);
        C79057V0z.LJJJZ(parcel, 3, this.zzc);
        C79057V0z.LJJLIIIJJIZ(parcel, 4, this.zzd);
        C79057V0z.LJJJZ(parcel, 5, this.zze);
        C79057V0z.LJJLIIIJJIZ(parcel, 6, this.zzf);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public TileOverlayOptions(IBinder iBinder, boolean z, float f, boolean z2, float f2) {
        InterfaceC68800QzM c68799QzL;
        this.zzc = true;
        this.zze = true;
        if (iBinder == null) {
            c68799QzL = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ITileProviderDelegate");
            if (queryLocalInterface instanceof InterfaceC68800QzM) {
                c68799QzL = (InterfaceC68800QzM) queryLocalInterface;
            } else {
                c68799QzL = new C68799QzL(iBinder);
            }
        }
        this.zza = c68799QzL;
        this.zzb = c68799QzL != null ? new C68798QzK(this) : null;
        this.zzc = z;
        this.zzd = f;
        this.zze = z2;
        this.zzf = f2;
    }
}
