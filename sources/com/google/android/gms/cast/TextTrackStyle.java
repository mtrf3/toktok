package com.google.android.gms.cast;

import X.C16880lQ;
import X.C37355ElL;
import X.C79057V0z;
import X.C90080ZWy;
import X.C90468Zey;
import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes29.dex */
public final class TextTrackStyle extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TextTrackStyle> CREATOR = new C90080ZWy();
    public String LJLIL;
    public float zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public int zzg;
    public int zzh;
    public int zzi;
    public String zzj;
    public int zzk;
    public int zzl;
    public JSONObject zzm;

    public TextTrackStyle() {
        this(1.0f, 0, 0, -1, 0, -1, 0, 0, null, -1, -1, null);
    }

    public final JSONObject LJJJJL() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("fontScale", this.zzb);
            int i = this.zzc;
            if (i != 0) {
                jSONObject.put("foregroundColor", LJJJJZI(i));
            }
            int i2 = this.zzd;
            if (i2 != 0) {
                jSONObject.put("backgroundColor", LJJJJZI(i2));
            }
            int i3 = this.zze;
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            if (i3 == 4) {
                                jSONObject.put("edgeType", "DEPRESSED");
                            }
                        } else {
                            jSONObject.put("edgeType", "RAISED");
                        }
                    } else {
                        jSONObject.put("edgeType", "DROP_SHADOW");
                    }
                } else {
                    jSONObject.put("edgeType", "OUTLINE");
                }
            } else {
                jSONObject.put("edgeType", "NONE");
            }
            int i4 = this.zzf;
            if (i4 != 0) {
                jSONObject.put("edgeColor", LJJJJZI(i4));
            }
            int i5 = this.zzg;
            if (i5 != 0) {
                if (i5 != 1) {
                    if (i5 == 2) {
                        jSONObject.put("windowType", "ROUNDED_CORNERS");
                    }
                } else {
                    jSONObject.put("windowType", "NORMAL");
                }
            } else {
                jSONObject.put("windowType", "NONE");
            }
            int i6 = this.zzh;
            if (i6 != 0) {
                jSONObject.put("windowColor", LJJJJZI(i6));
            }
            if (this.zzg == 2) {
                jSONObject.put("windowRoundedCornerRadius", this.zzi);
            }
            String str = this.zzj;
            if (str != null) {
                jSONObject.put("fontFamily", str);
            }
            switch (this.zzk) {
                case 0:
                    jSONObject.put("fontGenericFamily", "SANS_SERIF");
                    break;
                case 1:
                    jSONObject.put("fontGenericFamily", "MONOSPACED_SANS_SERIF");
                    break;
                case 2:
                    jSONObject.put("fontGenericFamily", "SERIF");
                    break;
                case 3:
                    jSONObject.put("fontGenericFamily", "MONOSPACED_SERIF");
                    break;
                case 4:
                    jSONObject.put("fontGenericFamily", "CASUAL");
                    break;
                case 5:
                    jSONObject.put("fontGenericFamily", "CURSIVE");
                    break;
                case 6:
                    jSONObject.put("fontGenericFamily", "SMALL_CAPITALS");
                    break;
            }
            int i7 = this.zzl;
            if (i7 != 0) {
                if (i7 != 1) {
                    if (i7 != 2) {
                        if (i7 == 3) {
                            jSONObject.put("fontStyle", "BOLD_ITALIC");
                        }
                    } else {
                        jSONObject.put("fontStyle", "ITALIC");
                    }
                } else {
                    jSONObject.put("fontStyle", "BOLD");
                }
            } else {
                jSONObject.put("fontStyle", "NORMAL");
            }
            JSONObject jSONObject2 = this.zzm;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.zzb), Integer.valueOf(this.zzc), Integer.valueOf(this.zzd), Integer.valueOf(this.zze), Integer.valueOf(this.zzf), Integer.valueOf(this.zzg), Integer.valueOf(this.zzh), Integer.valueOf(this.zzi), this.zzj, Integer.valueOf(this.zzk), Integer.valueOf(this.zzl), String.valueOf(this.zzm)});
    }

    public static final int LJJJJZ(String str) {
        if (str != null && str.length() == 9 && str.charAt(0) == '#') {
            try {
                return Color.argb(CastIntegerProtector.parseInt(str.substring(7, 9), 16), CastIntegerProtector.parseInt(str.substring(1, 3), 16), CastIntegerProtector.parseInt(str.substring(3, 5), 16), CastIntegerProtector.parseInt(str.substring(5, 7), 16));
            } catch (NumberFormatException unused) {
            }
        }
        return 0;
    }

    public static final String LJJJJZI(int i) {
        return C16880lQ.LLLZ("#%02X%02X%02X%02X", new Object[]{Integer.valueOf(Color.red(i)), Integer.valueOf(Color.green(i)), Integer.valueOf(Color.blue(i)), Integer.valueOf(Color.alpha(i))});
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextTrackStyle)) {
            return false;
        }
        TextTrackStyle textTrackStyle = (TextTrackStyle) obj;
        JSONObject jSONObject = this.zzm;
        if (jSONObject != null) {
            z = false;
        } else {
            z = true;
        }
        JSONObject jSONObject2 = textTrackStyle.zzm;
        if (jSONObject2 != null) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z != z2) {
            return false;
        }
        if ((jSONObject == null || jSONObject2 == null || C37355ElL.LIZ(jSONObject, jSONObject2)) && this.zzb == textTrackStyle.zzb && this.zzc == textTrackStyle.zzc && this.zzd == textTrackStyle.zzd && this.zze == textTrackStyle.zze && this.zzf == textTrackStyle.zzf && this.zzg == textTrackStyle.zzg && this.zzh == textTrackStyle.zzh && this.zzi == textTrackStyle.zzi && C90468Zey.LJFF(this.zzj, textTrackStyle.zzj) && this.zzk == textTrackStyle.zzk && this.zzl == textTrackStyle.zzl) {
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String jSONObject;
        JSONObject jSONObject2 = this.zzm;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.LJLIL = jSONObject;
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJLIIIJJIZ(parcel, 2, this.zzb);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 3, this.zzc);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 4, this.zzd);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 5, this.zze);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 6, this.zzf);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 7, this.zzg);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 8, this.zzh);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 9, this.zzi);
        C79057V0z.LJJZZIII(parcel, 10, this.zzj, false);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 11, this.zzk);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 12, this.zzl);
        C79057V0z.LJJZZIII(parcel, 13, this.LJLIL, false);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public TextTrackStyle(float f, int i, int i2, int i3, int i4, int i5, int i6, int i7, String str, int i8, int i9, String str2) {
        this.zzb = f;
        this.zzc = i;
        this.zzd = i2;
        this.zze = i3;
        this.zzf = i4;
        this.zzg = i5;
        this.zzh = i6;
        this.zzi = i7;
        this.zzj = str;
        this.zzk = i8;
        this.zzl = i9;
        this.LJLIL = str2;
        if (str2 != null) {
            try {
                this.zzm = new JSONObject(str2);
                return;
            } catch (JSONException unused) {
                this.zzm = null;
                this.LJLIL = null;
                return;
            }
        }
        this.zzm = null;
    }
}
