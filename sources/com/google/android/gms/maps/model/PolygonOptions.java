package com.google.android.gms.maps.model;

import X.C68781Qz3;
import X.C79057V0z;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes12.dex */
public final class PolygonOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PolygonOptions> CREATOR = new C68781Qz3();
    public final List zza;
    public final List zzb;
    public float zzc;
    public int zzd;
    public int zze;
    public float zzf;
    public boolean zzg;
    public boolean zzh;
    public boolean zzi;
    public int zzj;
    public List zzk;

    public PolygonOptions() {
        this.zzc = 10.0f;
        this.zzd = -16777216;
        this.zzg = true;
        this.zza = new ArrayList();
        this.zzb = new ArrayList();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJLIIL(parcel, 2, this.zza, false);
        List list = this.zzb;
        if (list != null) {
            int LJLIL2 = C79057V0z.LJLIL(parcel, 3);
            parcel.writeList(list);
            C79057V0z.LJLILLLLZI(parcel, LJLIL2);
        }
        C79057V0z.LJJLIIIJJIZ(parcel, 4, this.zzc);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 5, this.zzd);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 6, this.zze);
        C79057V0z.LJJLIIIJJIZ(parcel, 7, this.zzf);
        C79057V0z.LJJJZ(parcel, 8, this.zzg);
        C79057V0z.LJJJZ(parcel, 9, this.zzh);
        C79057V0z.LJJJZ(parcel, 10, this.zzi);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 11, this.zzj);
        C79057V0z.LJLIIL(parcel, 12, this.zzk, false);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public PolygonOptions(List list, List list2, float f, int i, int i2, float f2, boolean z, boolean z2, boolean z3, int i3, List list3) {
        this.zza = list;
        this.zzb = list2;
        this.zzc = f;
        this.zzd = i;
        this.zze = i2;
        this.zzf = f2;
        this.zzg = z;
        this.zzh = z2;
        this.zzi = z3;
        this.zzj = i3;
        this.zzk = list3;
    }
}
