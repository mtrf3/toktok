package com.google.android.gms.auth.api.accounttransfer;

import X.C1HQ;
import X.C64;
import X.C67320QbU;
import X.C79057V0z;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzbz;
import java.util.List;
import java.util.Map;

/* loaded from: classes12.dex */
public final class zzs extends zzbz {
    public static final Parcelable.Creator<zzs> CREATOR = new C67320QbU();
    public static final C1HQ zzb;
    public final int LJLIL;
    public List zzc;
    public List zzd;
    public List zze;
    public List zzf;
    public List zzg;

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final Map LIZIZ() {
        return zzb;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final boolean LJI(FastJsonResponse.Field field) {
        return true;
    }

    static {
        C1HQ c1hq = new C1HQ();
        zzb = c1hq;
        c1hq.put("registered", FastJsonResponse.Field.LJJJJL(2, "registered"));
        c1hq.put("in_progress", FastJsonResponse.Field.LJJJJL(3, "in_progress"));
        c1hq.put("success", FastJsonResponse.Field.LJJJJL(4, "success"));
        c1hq.put("failed", FastJsonResponse.Field.LJJJJL(5, "failed"));
        c1hq.put("escrowed", FastJsonResponse.Field.LJJJJL(6, "escrowed"));
    }

    public zzs() {
        this.LJLIL = 1;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final Object LIZLLL(FastJsonResponse.Field field) {
        switch (field.zaf) {
            case 1:
                return Integer.valueOf(this.LJLIL);
            case 2:
                return this.zzc;
            case 3:
                return this.zzd;
            case 4:
                return this.zze;
            case 5:
                return this.zzf;
            case 6:
                return this.zzg;
            default:
                throw new IllegalStateException(C64.LIZIZ("Unknown SafeParcelable id=", field.zaf));
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 1, this.LJLIL);
        C79057V0z.LJLI(parcel, 2, this.zzc);
        C79057V0z.LJLI(parcel, 3, this.zzd);
        C79057V0z.LJLI(parcel, 4, this.zze);
        C79057V0z.LJLI(parcel, 5, this.zzf);
        C79057V0z.LJLI(parcel, 6, this.zzg);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public zzs(int i, List list, List list2, List list3, List list4, List list5) {
        this.LJLIL = i;
        this.zzc = list;
        this.zzd = list2;
        this.zze = list3;
        this.zzf = list4;
        this.zzg = list5;
    }
}
