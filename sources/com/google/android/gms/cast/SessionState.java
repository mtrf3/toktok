package com.google.android.gms.cast;

import X.C37355ElL;
import X.C64363PNv;
import X.C79057V0z;
import X.C90079ZWx;
import X.C90208Zam;
import X.C90211Zap;
import X.C90468Zey;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes29.dex */
public class SessionState extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SessionState> CREATOR = new C90079ZWx();
    public String LJLIL;
    public final MediaLoadRequestData zzb;
    public final JSONObject zzc;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zzb, String.valueOf(this.zzc)});
    }

    public static SessionState LJJJJL(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("loadRequestData");
        MediaLoadRequestData mediaLoadRequestData = null;
        if (optJSONObject != null) {
            C90208Zam c90208Zam = new C90208Zam();
            try {
                if (optJSONObject.has("media")) {
                    c90208Zam.LIZ = new MediaInfo(JSONObjectProtectorUtils.getJSONObject(optJSONObject, "media"));
                }
                if (optJSONObject.has("queueData")) {
                    C90211Zap c90211Zap = new C90211Zap();
                    MediaQueueData.LJJJJZ(c90211Zap.LIZ, JSONObjectProtectorUtils.getJSONObject(optJSONObject, "queueData"));
                    c90208Zam.LIZIZ = new MediaQueueData(c90211Zap.LIZ);
                }
                if (optJSONObject.has("autoplay")) {
                    c90208Zam.LIZJ = Boolean.valueOf(JSONObjectProtectorUtils.getBoolean(optJSONObject, "autoplay"));
                } else {
                    c90208Zam.LIZJ = null;
                }
                if (optJSONObject.has("currentTime")) {
                    c90208Zam.LIZLLL = C90468Zey.LIZJ(JSONObjectProtectorUtils.getDouble(optJSONObject, "currentTime"));
                } else {
                    c90208Zam.LIZLLL = -1L;
                }
                double optDouble = optJSONObject.optDouble("playbackRate", 1.0d);
                if (Double.compare(optDouble, 2.0d) <= 0 && Double.compare(optDouble, 0.5d) >= 0) {
                    c90208Zam.LJ = optDouble;
                    c90208Zam.LJII = C90468Zey.LIZIZ("credentials", optJSONObject);
                    c90208Zam.LJIIIIZZ = C90468Zey.LIZIZ("credentialsType", optJSONObject);
                    c90208Zam.LJIIIZ = C90468Zey.LIZIZ("atvCredentials", optJSONObject);
                    c90208Zam.LJIIJ = C90468Zey.LIZIZ("atvCredentialsType", optJSONObject);
                    c90208Zam.LJIIJJI = optJSONObject.optLong("requestId");
                    JSONArray optJSONArray = optJSONObject.optJSONArray("activeTrackIds");
                    if (optJSONArray != null) {
                        long[] jArr = new long[optJSONArray.length()];
                        for (int i = 0; i < optJSONArray.length(); i++) {
                            jArr[i] = JSONArrayProtectorUtils.getLong(optJSONArray, i);
                        }
                        c90208Zam.LJFF = jArr;
                    }
                    c90208Zam.LJI = optJSONObject.optJSONObject("customData");
                    mediaLoadRequestData = c90208Zam.LIZ();
                } else {
                    throw new IllegalArgumentException("playbackRate must be between PLAYBACK_RATE_MIN and PLAYBACK_RATE_MAX");
                }
            } catch (JSONException unused) {
                mediaLoadRequestData = c90208Zam.LIZ();
            }
        }
        return new SessionState(mediaLoadRequestData, jSONObject.optJSONObject("customData"));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionState)) {
            return false;
        }
        SessionState sessionState = (SessionState) obj;
        if (!C37355ElL.LIZ(this.zzc, sessionState.zzc)) {
            return false;
        }
        return C64363PNv.LIZ(this.zzb, sessionState.zzb);
    }

    public SessionState(MediaLoadRequestData mediaLoadRequestData, JSONObject jSONObject) {
        this.zzb = mediaLoadRequestData;
        this.zzc = jSONObject;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String jSONObject;
        JSONObject jSONObject2 = this.zzc;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.LJLIL = jSONObject;
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJZZI(parcel, 2, this.zzb, i, false);
        C79057V0z.LJJZZIII(parcel, 3, this.LJLIL, false);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }
}
