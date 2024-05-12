package com.google.android.gms.cast;

import X.C79057V0z;
import X.C90469Zez;
import X.ZX0;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes29.dex */
public final class VideoInfo extends AbstractSafeParcelable {
    public int zzb;
    public int zzc;
    public int zzd;
    public static final C90469Zez zza = new C90469Zez("VideoInfo");
    public static final Parcelable.Creator<VideoInfo> CREATOR = new ZX0();

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), Integer.valueOf(this.zzd)});
    }

    public static VideoInfo LJJJJL(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            String string = JSONObjectProtectorUtils.getString(jSONObject, "hdrType");
            int hashCode = string.hashCode();
            int i = 0;
            if (hashCode != 3218) {
                if (hashCode != 103158) {
                    if (hashCode != 113729) {
                        if (hashCode == 99136405 && string.equals("hdr10")) {
                            i = 2;
                            return new VideoInfo(JSONObjectProtectorUtils.getInt(jSONObject, "width"), JSONObjectProtectorUtils.getInt(jSONObject, "height"), i);
                        }
                        zza.getClass();
                        return new VideoInfo(JSONObjectProtectorUtils.getInt(jSONObject, "width"), JSONObjectProtectorUtils.getInt(jSONObject, "height"), i);
                    }
                    if (string.equals("sdr")) {
                        i = 1;
                        return new VideoInfo(JSONObjectProtectorUtils.getInt(jSONObject, "width"), JSONObjectProtectorUtils.getInt(jSONObject, "height"), i);
                    }
                    zza.getClass();
                    return new VideoInfo(JSONObjectProtectorUtils.getInt(jSONObject, "width"), JSONObjectProtectorUtils.getInt(jSONObject, "height"), i);
                }
                if (string.equals("hdr")) {
                    i = 4;
                    return new VideoInfo(JSONObjectProtectorUtils.getInt(jSONObject, "width"), JSONObjectProtectorUtils.getInt(jSONObject, "height"), i);
                }
                zza.getClass();
                return new VideoInfo(JSONObjectProtectorUtils.getInt(jSONObject, "width"), JSONObjectProtectorUtils.getInt(jSONObject, "height"), i);
            }
            if (string.equals("dv")) {
                i = 3;
                return new VideoInfo(JSONObjectProtectorUtils.getInt(jSONObject, "width"), JSONObjectProtectorUtils.getInt(jSONObject, "height"), i);
            }
            zza.getClass();
            return new VideoInfo(JSONObjectProtectorUtils.getInt(jSONObject, "width"), JSONObjectProtectorUtils.getInt(jSONObject, "height"), i);
        } catch (JSONException unused) {
            zza.getClass();
            return null;
        }
        zza.getClass();
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoInfo)) {
            return false;
        }
        VideoInfo videoInfo = (VideoInfo) obj;
        if (this.zzc == videoInfo.zzc && this.zzb == videoInfo.zzb && this.zzd == videoInfo.zzd) {
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 2, this.zzb);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 3, this.zzc);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 4, this.zzd);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public VideoInfo(int i, int i2, int i3) {
        this.zzb = i;
        this.zzc = i2;
        this.zzd = i3;
    }
}
