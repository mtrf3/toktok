package com.google.android.gms.wallet;

import X.C68762Qyk;
import X.C79057V0z;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wallet.wobs.LoyaltyPoints;
import com.google.android.gms.wallet.wobs.TimeInterval;
import java.util.ArrayList;

/* loaded from: classes12.dex */
public final class LoyaltyWalletObject extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LoyaltyWalletObject> CREATOR = new C68762Qyk();
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
    public int zzk;
    public ArrayList zzl;
    public TimeInterval zzm;
    public ArrayList zzn;
    public String zzo;
    public String zzp;
    public ArrayList zzq;
    public boolean zzr;
    public ArrayList zzs;
    public ArrayList zzt;
    public ArrayList zzu;
    public LoyaltyPoints zzv;

    public LoyaltyWalletObject() {
        this.zzl = new ArrayList();
        this.zzn = new ArrayList();
        this.zzq = new ArrayList();
        this.zzs = new ArrayList();
        this.zzt = new ArrayList();
        this.zzu = new ArrayList();
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
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 12, this.zzk);
        C79057V0z.LJLIIL(parcel, 13, this.zzl, false);
        C79057V0z.LJJZZI(parcel, 14, this.zzm, i, false);
        C79057V0z.LJLIIL(parcel, 15, this.zzn, false);
        C79057V0z.LJJZZIII(parcel, 16, this.zzo, false);
        C79057V0z.LJJZZIII(parcel, 17, this.zzp, false);
        C79057V0z.LJLIIL(parcel, 18, this.zzq, false);
        C79057V0z.LJJJZ(parcel, 19, this.zzr);
        C79057V0z.LJLIIL(parcel, 20, this.zzs, false);
        C79057V0z.LJLIIL(parcel, 21, this.zzt, false);
        C79057V0z.LJLIIL(parcel, 22, this.zzu, false);
        C79057V0z.LJJZZI(parcel, 23, this.zzv, i, false);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public LoyaltyWalletObject(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, ArrayList arrayList, TimeInterval timeInterval, ArrayList arrayList2, String str11, String str12, ArrayList arrayList3, boolean z, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, LoyaltyPoints loyaltyPoints) {
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
        this.zzk = i;
        this.zzl = arrayList;
        this.zzm = timeInterval;
        this.zzn = arrayList2;
        this.zzo = str11;
        this.zzp = str12;
        this.zzq = arrayList3;
        this.zzr = z;
        this.zzs = arrayList4;
        this.zzt = arrayList5;
        this.zzu = arrayList6;
        this.zzv = loyaltyPoints;
    }
}
