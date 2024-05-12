package com.google.android.gms.common;

import X.AbstractBinderC68448Qtg;
import X.BinderC68153Qov;
import X.BinderC68444Qtc;
import X.C68449Qth;
import X.C68450Qti;
import X.C79057V0z;
import X.InterfaceC68163Qp5;
import X.InterfaceC68455Qtn;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes12.dex */
public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new C68449Qth();
    public final String zza;
    public final AbstractBinderC68448Qtg zzb;
    public final boolean zzc;
    public final boolean zzd;

    public zzs(String str, AbstractBinderC68448Qtg abstractBinderC68448Qtg, boolean z, boolean z2) {
        this.zza = str;
        this.zzb = abstractBinderC68448Qtg;
        this.zzc = z;
        this.zzd = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJZZIII(parcel, 1, this.zza, false);
        AbstractBinderC68448Qtg abstractBinderC68448Qtg = this.zzb;
        if (abstractBinderC68448Qtg == null) {
            abstractBinderC68448Qtg = null;
        }
        C79057V0z.LJJLIIIJLJLI(parcel, 2, abstractBinderC68448Qtg);
        C79057V0z.LJJJZ(parcel, 3, this.zzc);
        C79057V0z.LJJJZ(parcel, 4, this.zzd);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public zzs(String str, IBinder iBinder, boolean z, boolean z2) {
        InterfaceC68455Qtn c68450Qti;
        byte[] bArr;
        this.zza = str;
        BinderC68444Qtc binderC68444Qtc = null;
        if (iBinder != null) {
            try {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
                if (queryLocalInterface instanceof InterfaceC68455Qtn) {
                    c68450Qti = (InterfaceC68455Qtn) queryLocalInterface;
                } else {
                    c68450Qti = new C68450Qti(iBinder);
                }
                InterfaceC68163Qp5 LIZLLL = c68450Qti.LIZLLL();
                if (LIZLLL != null && (bArr = (byte[]) BinderC68153Qov.LLJJIII(LIZLLL)) != null) {
                    binderC68444Qtc = new BinderC68444Qtc(bArr);
                }
            } catch (RemoteException unused) {
            }
        }
        this.zzb = binderC68444Qtc;
        this.zzc = z;
        this.zzd = z2;
    }
}
