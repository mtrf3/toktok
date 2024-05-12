package com.google.android.gms.cast;

import X.C37355ElL;
import X.C79057V0z;
import X.C90077ZWv;
import X.C90468Zey;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes29.dex */
public final class MediaTrack extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<MediaTrack> CREATOR = new C90077ZWv();
    public String LJLIL;
    public long zzb;
    public int zzc;
    public String zzd;
    public String zze;
    public String zzf;
    public final String zzg;
    public int zzh;
    public final List<String> zzi;
    public final JSONObject zzj;

    public final JSONObject LJJJJL() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("trackId", this.zzb);
            int i = this.zzc;
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        jSONObject.put("type", "VIDEO");
                    }
                } else {
                    jSONObject.put("type", "AUDIO");
                }
            } else {
                jSONObject.put("type", "TEXT");
            }
            String str = this.zzd;
            if (str != null) {
                jSONObject.put("trackContentId", str);
            }
            String str2 = this.zze;
            if (str2 != null) {
                jSONObject.put("trackContentType", str2);
            }
            String str3 = this.zzf;
            if (str3 != null) {
                jSONObject.put("name", str3);
            }
            if (!TextUtils.isEmpty(this.zzg)) {
                jSONObject.put("language", this.zzg);
            }
            int i2 = this.zzh;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 == 5) {
                                jSONObject.put("subtype", "METADATA");
                            }
                        } else {
                            jSONObject.put("subtype", "CHAPTERS");
                        }
                    } else {
                        jSONObject.put("subtype", "DESCRIPTIONS");
                    }
                } else {
                    jSONObject.put("subtype", "CAPTIONS");
                }
            } else {
                jSONObject.put("subtype", "SUBTITLES");
            }
            List<String> list = this.zzi;
            if (list != null) {
                jSONObject.put("roles", new JSONArray((Collection) list));
            }
            JSONObject jSONObject2 = this.zzj;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.zzb), Integer.valueOf(this.zzc), this.zzd, this.zze, this.zzf, this.zzg, Integer.valueOf(this.zzh), this.zzi, String.valueOf(this.zzj)});
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaTrack)) {
            return false;
        }
        MediaTrack mediaTrack = (MediaTrack) obj;
        JSONObject jSONObject = this.zzj;
        if (jSONObject != null) {
            z = false;
        } else {
            z = true;
        }
        JSONObject jSONObject2 = mediaTrack.zzj;
        if (jSONObject2 != null) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z != z2) {
            return false;
        }
        if ((jSONObject == null || jSONObject2 == null || C37355ElL.LIZ(jSONObject, jSONObject2)) && this.zzb == mediaTrack.zzb && this.zzc == mediaTrack.zzc && C90468Zey.LJFF(this.zzd, mediaTrack.zzd) && C90468Zey.LJFF(this.zze, mediaTrack.zze) && C90468Zey.LJFF(this.zzf, mediaTrack.zzf) && C90468Zey.LJFF(this.zzg, mediaTrack.zzg) && this.zzh == mediaTrack.zzh && C90468Zey.LJFF(this.zzi, mediaTrack.zzi)) {
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String jSONObject;
        JSONObject jSONObject2 = this.zzj;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.LJLIL = jSONObject;
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJLJLI(parcel, 2, this.zzb);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 3, this.zzc);
        C79057V0z.LJJZZIII(parcel, 4, this.zzd, false);
        C79057V0z.LJJZZIII(parcel, 5, this.zze, false);
        C79057V0z.LJJZZIII(parcel, 6, this.zzf, false);
        C79057V0z.LJJZZIII(parcel, 7, this.zzg, false);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 8, this.zzh);
        C79057V0z.LJLI(parcel, 9, this.zzi);
        C79057V0z.LJJZZIII(parcel, 10, this.LJLIL, false);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public MediaTrack(long j, int i, String str, String str2, String str3, String str4, int i2, List<String> list, JSONObject jSONObject) {
        this.zzb = j;
        this.zzc = i;
        this.zzd = str;
        this.zze = str2;
        this.zzf = str3;
        this.zzg = str4;
        this.zzh = i2;
        this.zzi = list;
        this.zzj = jSONObject;
    }
}
