package com.google.android.gms.fido.u2f.api.common;

import X.C67331Qbf;
import X.C79057V0z;
import X.QH7;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class RegisteredKey extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RegisteredKey> CREATOR = new C67331Qbf();
    public String zza;
    public final KeyHandle zzb;
    public final String zzc;

    public final int hashCode() {
        int hashCode;
        String str = this.zza;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode2 = this.zzb.hashCode() + ((hashCode + 31) * 31);
        String str2 = this.zzc;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (hashCode2 * 31) + i;
    }

    public final String toString() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("keyHandle", Base64.encodeToString(this.zzb.zzb, 11));
            ProtocolVersion protocolVersion = this.zzb.zzc;
            if (protocolVersion != ProtocolVersion.UNKNOWN) {
                jSONObject.put("version", protocolVersion.toString());
            }
            List list = this.zzb.zzd;
            if (list != null) {
                jSONObject.put("transports", list.toString());
            }
            String str = this.zza;
            if (str != null) {
                jSONObject.put("challenge", str);
            }
            String str2 = this.zzc;
            if (str2 != null) {
                jSONObject.put("appId", str2);
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisteredKey)) {
            return false;
        }
        RegisteredKey registeredKey = (RegisteredKey) obj;
        String str = this.zza;
        if (str == null) {
            if (registeredKey.zza != null) {
                return false;
            }
        } else if (!str.equals(registeredKey.zza)) {
            return false;
        }
        if (!this.zzb.equals(registeredKey.zzb)) {
            return false;
        }
        String str2 = this.zzc;
        if (str2 == null) {
            if (registeredKey.zzc != null) {
                return false;
            }
        } else if (!str2.equals(registeredKey.zzc)) {
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJZZI(parcel, 2, this.zzb, i, false);
        C79057V0z.LJJZZIII(parcel, 3, this.zza, false);
        C79057V0z.LJJZZIII(parcel, 4, this.zzc, false);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public RegisteredKey(KeyHandle keyHandle, String str, String str2) {
        QH7.LJIIIIZZ(keyHandle);
        this.zzb = keyHandle;
        this.zza = str;
        this.zzc = str2;
    }
}
