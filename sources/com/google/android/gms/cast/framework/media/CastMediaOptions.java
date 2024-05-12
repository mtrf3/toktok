package com.google.android.gms.cast.framework.media;

import X.BinderC68153Qov;
import X.C16880lQ;
import X.C79057V0z;
import X.C90117ZYj;
import X.C90126ZYs;
import X.C90469Zez;
import X.C90642Zhm;
import X.ZZ1;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes29.dex */
public class CastMediaOptions extends AbstractSafeParcelable {
    public final String zzb;
    public final String zzc;
    public final ZZ1 zzd;
    public final NotificationOptions zze;
    public final boolean zzf;
    public final boolean zzg;
    public static final C90469Zez zza = new C90469Zez("CastMediaOptions");
    public static final Parcelable.Creator<CastMediaOptions> CREATOR = new C90126ZYs();

    public final C90117ZYj LJJJJL() {
        ZZ1 zz1 = this.zzd;
        if (zz1 != null) {
            try {
                return (C90117ZYj) BinderC68153Qov.LLJJIII(zz1.LIZJ());
            } catch (RemoteException unused) {
                C90469Zez c90469Zez = zza;
                C16880lQ.LJLLJ(ZZ1.class);
                c90469Zez.getClass();
                return null;
            }
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        IBinder asBinder;
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJZZIII(parcel, 2, this.zzb, false);
        C79057V0z.LJJZZIII(parcel, 3, this.zzc, false);
        ZZ1 zz1 = this.zzd;
        if (zz1 == null) {
            asBinder = null;
        } else {
            asBinder = zz1.asBinder();
        }
        C79057V0z.LJJLIIIJLJLI(parcel, 4, asBinder);
        C79057V0z.LJJZZI(parcel, 5, this.zze, i, false);
        C79057V0z.LJJJZ(parcel, 6, this.zzf);
        C79057V0z.LJJJZ(parcel, 7, this.zzg);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public CastMediaOptions(String str, String str2, IBinder iBinder, NotificationOptions notificationOptions, boolean z, boolean z2) {
        ZZ1 c90642Zhm;
        this.zzb = str;
        this.zzc = str2;
        if (iBinder == null) {
            c90642Zhm = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.IImagePicker");
            if (queryLocalInterface instanceof ZZ1) {
                c90642Zhm = (ZZ1) queryLocalInterface;
            } else {
                c90642Zhm = new C90642Zhm(iBinder);
            }
        }
        this.zzd = c90642Zhm;
        this.zze = notificationOptions;
        this.zzf = z;
        this.zzg = z2;
    }
}
