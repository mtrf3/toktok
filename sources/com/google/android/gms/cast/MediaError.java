package com.google.android.gms.cast;

import X.C79057V0z;
import X.C90060ZWe;
import X.C90468Zey;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import org.json.JSONObject;

/* loaded from: classes29.dex */
public class MediaError extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<MediaError> CREATOR = new C90060ZWe();
    public String LJLIL;
    public String zzb;
    public long zzc;
    public final Integer zzd;
    public final String zze;
    public final JSONObject zzf;

    public static MediaError LJJJJL(JSONObject jSONObject) {
        Integer num;
        String optString = jSONObject.optString("type", "ERROR");
        long optLong = jSONObject.optLong("requestId");
        JSONObject jSONObject2 = null;
        if (jSONObject.has("detailedErrorCode")) {
            num = Integer.valueOf(jSONObject.optInt("detailedErrorCode"));
        } else {
            num = null;
        }
        String LIZIZ = C90468Zey.LIZIZ("reason", jSONObject);
        if (jSONObject.has("customData")) {
            jSONObject2 = jSONObject.optJSONObject("customData");
        }
        return new MediaError(optString, optLong, num, LIZIZ, jSONObject2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String jSONObject;
        JSONObject jSONObject2 = this.zzf;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.LJLIL = jSONObject;
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJZZIII(parcel, 2, this.zzb, false);
        C79057V0z.LJJLJLI(parcel, 3, this.zzc);
        C79057V0z.LJJLJ(parcel, 4, this.zzd);
        C79057V0z.LJJZZIII(parcel, 5, this.zze, false);
        C79057V0z.LJJZZIII(parcel, 6, this.LJLIL, false);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public MediaError(String str, long j, Integer num, String str2, JSONObject jSONObject) {
        this.zzb = str;
        this.zzc = j;
        this.zzd = num;
        this.zze = str2;
        this.zzf = jSONObject;
    }
}
