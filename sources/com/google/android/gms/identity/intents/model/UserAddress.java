package com.google.android.gms.identity.intents.model;

import X.C68728QyC;
import X.C79057V0z;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes12.dex */
public final class UserAddress extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<UserAddress> CREATOR = new C68728QyC();
    public String zza;
    public String zzb;
    public String zzc;
    public String zzd;
    public String zze;
    public String zzf;
    public String zzg;
    public String zzh;
    public String zzi;
    public String zzj;
    public String zzk;
    public String zzl;
    public boolean zzm;
    public String zzn;
    public String zzo;

    public UserAddress() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJZZIII(parcel, 2, this.zza, false);
        C79057V0z.LJJZZIII(parcel, 3, this.zzb, false);
        C79057V0z.LJJZZIII(parcel, 4, this.zzc, false);
        C79057V0z.LJJZZIII(parcel, 5, this.zzd, false);
        C79057V0z.LJJZZIII(parcel, 6, this.zze, false);
        C79057V0z.LJJZZIII(parcel, 7, this.zzf, false);
        C79057V0z.LJJZZIII(parcel, 8, this.zzg, false);
        C79057V0z.LJJZZIII(parcel, 9, this.zzh, false);
        C79057V0z.LJJZZIII(parcel, 10, this.zzi, false);
        C79057V0z.LJJZZIII(parcel, 11, this.zzj, false);
        C79057V0z.LJJZZIII(parcel, 12, this.zzk, false);
        C79057V0z.LJJZZIII(parcel, 13, this.zzl, false);
        C79057V0z.LJJJZ(parcel, 14, this.zzm);
        C79057V0z.LJJZZIII(parcel, 15, this.zzn, false);
        C79057V0z.LJJZZIII(parcel, 16, this.zzo, false);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public UserAddress(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, boolean z, String str13, String str14) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = str5;
        this.zzf = str6;
        this.zzg = str7;
        this.zzh = str8;
        this.zzi = str9;
        this.zzj = str10;
        this.zzk = str11;
        this.zzl = str12;
        this.zzm = z;
        this.zzn = str13;
        this.zzo = str14;
    }
}
