package com.google.android.gms.wallet.wobs;

import X.C68763Qyl;
import X.C79057V0z;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;

/* loaded from: classes12.dex */
public class CommonWalletObject extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CommonWalletObject> CREATOR = new C68763Qyl();
    public String zza;
    public String zzb;
    public String zzc;
    public String zzd;
    public String zze;
    public String zzf;
    public String zzg;
    public String zzh;
    public int zzi;
    public ArrayList zzj;
    public TimeInterval zzk;
    public ArrayList zzl;
    public String zzm;
    public String zzn;
    public ArrayList zzo;
    public boolean zzp;
    public ArrayList zzq;
    public ArrayList zzr;
    public ArrayList zzs;

    public CommonWalletObject() {
        this.zzj = new ArrayList();
        this.zzl = new ArrayList();
        this.zzo = new ArrayList();
        this.zzq = new ArrayList();
        this.zzr = new ArrayList();
        this.zzs = new ArrayList();
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
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 10, this.zzi);
        C79057V0z.LJLIIL(parcel, 11, this.zzj, false);
        C79057V0z.LJJZZI(parcel, 12, this.zzk, i, false);
        C79057V0z.LJLIIL(parcel, 13, this.zzl, false);
        C79057V0z.LJJZZIII(parcel, 14, this.zzm, false);
        C79057V0z.LJJZZIII(parcel, 15, this.zzn, false);
        C79057V0z.LJLIIL(parcel, 16, this.zzo, false);
        C79057V0z.LJJJZ(parcel, 17, this.zzp);
        C79057V0z.LJLIIL(parcel, 18, this.zzq, false);
        C79057V0z.LJLIIL(parcel, 19, this.zzr, false);
        C79057V0z.LJLIIL(parcel, 20, this.zzs, false);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public CommonWalletObject(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, ArrayList arrayList, TimeInterval timeInterval, ArrayList arrayList2, String str9, String str10, ArrayList arrayList3, boolean z, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = str5;
        this.zzf = str6;
        this.zzg = str7;
        this.zzh = str8;
        this.zzi = i;
        this.zzj = arrayList;
        this.zzk = timeInterval;
        this.zzl = arrayList2;
        this.zzm = str9;
        this.zzn = str10;
        this.zzo = arrayList3;
        this.zzp = z;
        this.zzq = arrayList4;
        this.zzr = arrayList5;
        this.zzs = arrayList6;
    }
}
