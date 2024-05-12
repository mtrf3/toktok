package com.google.android.gms.auth.api.accounttransfer;

import X.C64;
import X.C67318QbS;
import X.C79057V0z;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzbz;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes12.dex */
public final class zzu extends zzbz {
    public static final Parcelable.Creator<zzu> CREATOR = new C67318QbS();
    public static final HashMap zzc;
    public final Set LJLIL;
    public final int LJLILLLLZI;
    public zzw zzd;
    public String zze;
    public String zzf;
    public String zzg;

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final /* synthetic */ Map LIZIZ() {
        return zzc;
    }

    static {
        HashMap hashMap = new HashMap();
        zzc = hashMap;
        hashMap.put("authenticatorInfo", new FastJsonResponse.Field(11, false, 11, false, "authenticatorInfo", 2, zzw.class));
        hashMap.put("signature", new FastJsonResponse.Field(7, false, 7, false, "signature", 3, null));
        hashMap.put("package", new FastJsonResponse.Field(7, false, 7, false, "package", 4, null));
    }

    public zzu() {
        this.LJLIL = new HashSet(3);
        this.LJLILLLLZI = 1;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final Object LIZLLL(FastJsonResponse.Field field) {
        int i = field.zaf;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return this.zzf;
                    }
                    throw new IllegalStateException(C64.LIZIZ("Unknown SafeParcelable id=", field.zaf));
                }
                return this.zze;
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
            C79057V0z.LJJZZI(parcel, 2, this.zzd, i, true);
        }
        if (set.contains(3)) {
            C79057V0z.LJJZZIII(parcel, 3, this.zze, true);
        }
        if (set.contains(4)) {
            C79057V0z.LJJZZIII(parcel, 4, this.zzf, true);
        }
        if (set.contains(5)) {
            C79057V0z.LJJZZIII(parcel, 5, this.zzg, true);
        }
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public zzu(Set set, int i, zzw zzwVar, String str, String str2, String str3) {
        this.LJLIL = set;
        this.LJLILLLLZI = i;
        this.zzd = zzwVar;
        this.zze = str;
        this.zzf = str2;
        this.zzg = str3;
    }
}
