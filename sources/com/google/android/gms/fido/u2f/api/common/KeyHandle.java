package com.google.android.gms.fido.u2f.api.common;

import X.C16880lQ;
import X.C67324QbY;
import X.C67333Qbh;
import X.C79057V0z;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes12.dex */
public class KeyHandle extends AbstractSafeParcelable {
    public static final Parcelable.Creator<KeyHandle> CREATOR = new C67324QbY();
    public final int zza;
    public final byte[] zzb;
    public final ProtocolVersion zzc;
    public final List zzd;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.zzb)), this.zzc, this.zzd});
    }

    public final String toString() {
        String obj;
        String encodeToString;
        List list = this.zzd;
        if (list == null) {
            obj = "null";
        } else {
            obj = list.toString();
        }
        Object[] objArr = new Object[3];
        byte[] bArr = this.zzb;
        if (bArr == null) {
            encodeToString = null;
        } else {
            encodeToString = Base64.encodeToString(bArr, 0);
        }
        objArr[0] = encodeToString;
        objArr[1] = this.zzc;
        objArr[2] = obj;
        return C16880lQ.LLLZ("{keyHandle: %s, version: %s, transports: %s}", objArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyHandle)) {
            return false;
        }
        KeyHandle keyHandle = (KeyHandle) obj;
        if (!Arrays.equals(this.zzb, keyHandle.zzb) || !this.zzc.equals(keyHandle.zzc)) {
            return false;
        }
        List list = this.zzd;
        if (list == null) {
            if (keyHandle.zzd == null) {
                return true;
            }
        } else {
            List list2 = keyHandle.zzd;
            if (list2 != null && list.containsAll(list2) && keyHandle.zzd.containsAll(this.zzd)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 1, this.zza);
        C79057V0z.LJJLIIIJ(parcel, 2, this.zzb, false);
        C79057V0z.LJJZZIII(parcel, 3, this.zzc.toString(), false);
        C79057V0z.LJLIIL(parcel, 4, this.zzd, false);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public KeyHandle(int i, byte[] bArr, String str, List list) {
        this.zza = i;
        this.zzb = bArr;
        try {
            this.zzc = ProtocolVersion.fromString(str);
            this.zzd = list;
        } catch (C67333Qbh e) {
            throw new IllegalArgumentException(e);
        }
    }
}
