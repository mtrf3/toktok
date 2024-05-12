package com.google.android.gms.auth.api.accounttransfer;

import X.C0M4;
import X.C64;
import X.C67317QbR;
import X.C79057V0z;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzbz;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes12.dex */
public final class zzw extends zzbz {
    public static final Parcelable.Creator<zzw> CREATOR = new C67317QbR();
    public static final HashMap zzc;
    public final Set LJLIL;
    public final int LJLILLLLZI;
    public String zzd;
    public int zze;
    public byte[] zzf;
    public PendingIntent zzg;
    public DeviceMetaData zzh;

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final /* synthetic */ Map LIZIZ() {
        return zzc;
    }

    static {
        HashMap hashMap = new HashMap();
        zzc = hashMap;
        hashMap.put("accountType", new FastJsonResponse.Field(7, false, 7, false, "accountType", 2, null));
        hashMap.put("status", new FastJsonResponse.Field(0, false, 0, false, "status", 3, null));
        hashMap.put("transferBytes", new FastJsonResponse.Field(8, false, 8, false, "transferBytes", 4, null));
    }

    public zzw() {
        this.LJLIL = new C0M4(3);
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
                return Integer.valueOf(this.zze);
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
            C79057V0z.LJJZZIII(parcel, 2, this.zzd, true);
        }
        if (set.contains(3)) {
            C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 3, this.zze);
        }
        if (set.contains(4)) {
            C79057V0z.LJJLIIIJ(parcel, 4, this.zzf, true);
        }
        if (set.contains(5)) {
            C79057V0z.LJJZZI(parcel, 5, this.zzg, i, true);
        }
        if (set.contains(6)) {
            C79057V0z.LJJZZI(parcel, 6, this.zzh, i, true);
        }
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public zzw(Set set, int i, String str, int i2, byte[] bArr, PendingIntent pendingIntent, DeviceMetaData deviceMetaData) {
        this.LJLIL = set;
        this.LJLILLLLZI = i;
        this.zzd = str;
        this.zze = i2;
        this.zzf = bArr;
        this.zzg = pendingIntent;
        this.zzh = deviceMetaData;
    }
}
