package com.google.android.gms.auth.api.accounttransfer;

import X.C64;
import X.C67319QbT;
import X.C79057V0z;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzbz;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes12.dex */
public final class zzo extends zzbz {
    public static final Parcelable.Creator<zzo> CREATOR = new C67319QbT();
    public static final HashMap zzc;
    public final Set LJLIL;
    public final int LJLILLLLZI;
    public ArrayList zzd;
    public int zze;
    public zzs zzf;

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final /* synthetic */ Map LIZIZ() {
        return zzc;
    }

    static {
        HashMap hashMap = new HashMap();
        zzc = hashMap;
        hashMap.put("authenticatorData", new FastJsonResponse.Field(11, true, 11, true, "authenticatorData", 2, zzu.class));
        hashMap.put("progress", new FastJsonResponse.Field(11, false, 11, false, "progress", 4, zzs.class));
    }

    public zzo() {
        this.LJLIL = new HashSet(1);
        this.LJLILLLLZI = 1;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final Object LIZLLL(FastJsonResponse.Field field) {
        int i = field.zaf;
        if (i != 1) {
            if (i != 2) {
                if (i == 4) {
                    return this.zzf;
                }
                throw new IllegalStateException(C64.LIZIZ("Unknown SafeParcelable id=", field.zaf));
            }
            return this.zzd;
        }
        return Integer.valueOf(this.LJLILLLLZI);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final boolean LJI(FastJsonResponse.Field field) {
        return this.LJLIL.contains(Integer.valueOf(field.zaf));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        Set set = this.LJLIL;
        if (set.contains(1)) {
            C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 1, this.LJLILLLLZI);
        }
        if (set.contains(2)) {
            C79057V0z.LJLIIL(parcel, 2, this.zzd, true);
        }
        if (set.contains(3)) {
            C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 3, this.zze);
        }
        if (set.contains(4)) {
            C79057V0z.LJJZZI(parcel, 4, this.zzf, i, true);
        }
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public zzo(Set set, int i, ArrayList arrayList, int i2, zzs zzsVar) {
        this.LJLIL = set;
        this.LJLILLLLZI = i;
        this.zzd = arrayList;
        this.zze = i2;
        this.zzf = zzsVar;
    }
}
