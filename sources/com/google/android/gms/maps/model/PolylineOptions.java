package com.google.android.gms.maps.model;

import X.C68777Qyz;
import X.C68778Qz0;
import X.C79057V0z;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes12.dex */
public final class PolylineOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PolylineOptions> CREATOR = new C68778Qz0();
    public final List zza;
    public float zzb;
    public int zzc;
    public float zzd;
    public boolean zze;
    public boolean zzf;
    public boolean zzg;
    public Cap zzh;
    public Cap zzi;
    public int zzj;
    public List zzk;
    public List zzl;

    public PolylineOptions() {
        this.zzb = 10.0f;
        this.zzc = -16777216;
        this.zze = true;
        this.zzh = new ButtCap();
        this.zzi = new ButtCap();
        this.zzj = 0;
        this.zzk = null;
        this.zzl = new ArrayList();
        this.zza = new ArrayList();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJLIIL(parcel, 2, this.zza, false);
        C79057V0z.LJJLIIIJJIZ(parcel, 3, this.zzb);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 4, this.zzc);
        C79057V0z.LJJLIIIJJIZ(parcel, 5, this.zzd);
        C79057V0z.LJJJZ(parcel, 6, this.zze);
        C79057V0z.LJJJZ(parcel, 7, this.zzf);
        C79057V0z.LJJJZ(parcel, 8, this.zzg);
        C79057V0z.LJJZZI(parcel, 9, this.zzh.LJJJJL(), i, false);
        C79057V0z.LJJZZI(parcel, 10, this.zzi.LJJJJL(), i, false);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 11, this.zzj);
        C79057V0z.LJLIIL(parcel, 12, this.zzk, false);
        ArrayList arrayList = new ArrayList(this.zzl.size());
        for (StyleSpan styleSpan : this.zzl) {
            C68777Qyz c68777Qyz = new C68777Qyz(styleSpan.zza);
            c68777Qyz.LIZ = this.zzb;
            c68777Qyz.LIZLLL = this.zze;
            arrayList.add(new StyleSpan(new StrokeStyle(c68777Qyz.LIZ, c68777Qyz.LIZIZ, c68777Qyz.LIZJ, c68777Qyz.LIZLLL, c68777Qyz.LJ), styleSpan.zzb));
        }
        C79057V0z.LJLIIL(parcel, 13, arrayList, false);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public PolylineOptions(List list, float f, int i, float f2, boolean z, boolean z2, boolean z3, Cap cap, Cap cap2, int i2, List list2, List list3) {
        this.zzb = 10.0f;
        this.zzc = -16777216;
        this.zze = true;
        this.zzh = new ButtCap();
        this.zzi = new ButtCap();
        this.zzj = 0;
        this.zzk = null;
        this.zzl = new ArrayList();
        this.zza = list;
        this.zzb = f;
        this.zzc = i;
        this.zzd = f2;
        this.zze = z;
        this.zzf = z2;
        this.zzg = z3;
        if (cap != null) {
            this.zzh = cap;
        }
        if (cap2 != null) {
            this.zzi = cap2;
        }
        this.zzj = i2;
        this.zzk = list2;
        if (list3 != null) {
            this.zzl = list3;
        }
    }
}
