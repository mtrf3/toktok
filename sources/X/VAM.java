package X;

import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public final class VAM {
    public final JSONObject LIZ;
    public final JSONObject LIZIZ;
    public int LIZJ;
    public String LIZLLL;
    public String LJ;
    public String LJII;
    public String LJIIIIZZ;
    public int LJIIJJI;
    public int LJIIL;
    public int LJIILIIL;
    public int LJIILJJIL;
    public int LJIILL;
    public int LJIILLIIL;
    public int LJIIZILJ;
    public int LJIJ;
    public int LJIJI;
    public JSONObject LJIJJLI;
    public JSONObject LJIL;
    public boolean LJJ;
    public final String LJJI;
    public boolean LJJIIJ;
    public int LJJIIJZLJL;
    public int LJJIIZ;
    public int LJJIJ;
    public int LJJIJIIJI;
    public int LJJIJIIJIL;
    public int LJJIJIL;
    public String LJJIJLIJ;
    public String LJJIL;
    public int LJJIZ;
    public int LJJJ;
    public long LJFF = -1;
    public int LJI = -1;
    public String LJIIIZ = "";
    public String LJIIJ = "";
    public String LJIJJ = "";
    public String LJJIFFI = LiveGiftNewGifterBadgeSetting.DEFAULT;
    public String LJJII = LiveGiftNewGifterBadgeSetting.DEFAULT;
    public int LJJIII = -1;
    public String LJJIIZI = "1.0.105.5";
    public String LJJIJL = "h2q";
    public String LJJJI = "";
    public long LJJJIL = -1;
    public final HashSet<String> LJJJJ = new HashSet<>();
    public String LJJJJI = "";
    public int LJJJJIZL = -1;
    public String LJJJJJ = "";

    public VAM(JSONObject jSONObject) {
        JSONObject jSONObject2;
        this.LJJI = LiveGiftNewGifterBadgeSetting.DEFAULT;
        if (jSONObject == null) {
            return;
        }
        try {
            this.LIZ = JSONObjectProtectorUtils.getJSONObject(jSONObject, "data");
            if (jSONObject.has("common")) {
                this.LIZIZ = JSONObjectProtectorUtils.getJSONObject(jSONObject, "common");
            }
            JSONObject jSONObject3 = this.LIZIZ;
            if (jSONObject3 != null && jSONObject3.has("auto") && (jSONObject2 = JSONObjectProtectorUtils.getJSONObject(this.LIZIZ, "auto")) != null && jSONObject2.has("default")) {
                this.LIZLLL = JSONObjectProtectorUtils.getString(jSONObject2, "default");
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("mDefaultResolution: ");
                LIZ.append(this.LIZLLL);
                X1D.LIZIZ(LIZ);
                C46496IMq.LIZJ();
            }
            JSONObject jSONObject4 = this.LIZIZ;
            if (jSONObject4 != null && jSONObject4.has("app_id")) {
                this.LJJI = this.LIZIZ.optString("app_id");
            }
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        this.LIZJ = 0;
    }

    public final boolean LJFF(String str) {
        if (!TextUtils.isEmpty(str) && str.equals("auto") && !TextUtils.isEmpty(this.LIZLLL)) {
            return true;
        }
        return false;
    }

    public final boolean LJI(String str) {
        if (this.LIZ != null && !TextUtils.isEmpty(str)) {
            if (this.LJJIZ == 1 && !this.LJJJJ.isEmpty() && this.LJJJJ.contains(str)) {
                return true;
            }
            try {
                if (JSONObjectProtectorUtils.getJSONObject(this.LIZ, str) != null) {
                    if (this.LJJIZ == 1) {
                        this.LJJJJ.add(str);
                    }
                    return true;
                }
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        return false;
    }

    public final String LJII(String str) {
        int indexOf;
        int indexOf2 = str.indexOf(".com");
        int indexOf3 = str.indexOf(".com:");
        StringBuilder sb = new StringBuilder(str);
        if (!TextUtils.isEmpty(this.LJIIJ)) {
            if (indexOf3 != -1) {
                int i = indexOf3 + 5;
                int i2 = i + 1;
                while (i2 < sb.length() && sb.charAt(i2) - '0' >= 0 && sb.charAt(i2) - '0' <= 9) {
                    i2++;
                }
                sb.replace(i, i2, this.LJIIJ);
            } else if (indexOf2 != -1 && ((indexOf = str.indexOf("vhost")) == -1 || indexOf > indexOf2)) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(":");
                LIZ.append(this.LJIIJ);
                sb.insert(indexOf2 + 4, X1D.LIZIZ(LIZ));
            }
        }
        StringBuilder sb2 = new StringBuilder(sb.toString());
        int indexOf4 = sb2.indexOf("://");
        if (!TextUtils.isEmpty(this.LJIIIZ)) {
            if (this.LJIIIZ.equals("kcp")) {
                if (indexOf4 != -1) {
                    sb2.replace(0, indexOf4, "httpk");
                }
            } else if (this.LJIIIZ.equals("quic") || this.LJIIIZ.equals("quicu")) {
                if (indexOf4 != -1) {
                    sb2.replace(0, indexOf4, "httpq");
                }
            } else if (this.LJIIIZ.equals("tls")) {
                if (indexOf4 != -1) {
                    sb2.replace(0, indexOf4, "https");
                }
            } else if (this.LJIIIZ.equals("tcp")) {
                if (indexOf4 != -1) {
                    sb2.replace(0, indexOf4, "http");
                }
            } else if ((this.LJIIIZ.equals("h2") || this.LJIIIZ.equals("h2q") || this.LJIIIZ.equals("h2qu")) && indexOf4 != -1) {
                sb2.replace(0, indexOf4, "httpx");
            }
        }
        return sb2.toString();
    }

    public final long LIZ(String str, String str2) {
        if (LJFF(str)) {
            str = this.LIZLLL;
        }
        long j = 0;
        if (!LJI(str)) {
            return 0L;
        }
        if (str.equals("origin")) {
            long j2 = this.LJFF;
            if (j2 > 0) {
                return j2;
            }
        }
        try {
            j = new JSONObject(JSONObjectProtectorUtils.getJSONObject(JSONObjectProtectorUtils.getJSONObject(this.LIZ, str), str2).optString("sdk_params")).optLong("vbitrate");
            return j;
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
            return j;
        }
    }

    public final String LIZIZ(String str, String str2) {
        if (LJFF(str)) {
            str = this.LIZLLL;
        }
        String str3 = null;
        if (!LJI(str)) {
            return null;
        }
        try {
            str3 = JSONObjectProtectorUtils.getJSONObject(JSONObjectProtectorUtils.getJSONObject(this.LIZ, str), str2).optString("sdk_params");
            return str3;
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
            return str3;
        }
    }

    public final String LIZLLL(String str, String str2) {
        if (LJFF(str)) {
            str = this.LIZLLL;
        }
        String str3 = null;
        if (!LJI(str)) {
            return null;
        }
        try {
            str3 = new JSONObject(JSONObjectProtectorUtils.getJSONObject(JSONObjectProtectorUtils.getJSONObject(this.LIZ, str), str2).optString("sdk_params")).optString("VCodec");
            return str3;
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
            return str3;
        }
    }

    public final boolean LJ(String str, boolean z) {
        if (LJFF(str)) {
            str = this.LIZLLL;
        }
        if (!LJI(str)) {
            return false;
        }
        try {
            if (TextUtils.isEmpty(this.LJJIL)) {
                JSONObject jSONObject = this.LIZIZ;
                if (jSONObject != null) {
                    try {
                        if (jSONObject.has("auto")) {
                            JSONObject jSONObject2 = JSONObjectProtectorUtils.getJSONObject(this.LIZIZ, "auto");
                            if (jSONObject2 != null && jSONObject2.has("list")) {
                                JSONArray optJSONArray = jSONObject2.optJSONArray("list");
                                if (optJSONArray != null) {
                                    this.LJJIL = optJSONArray.toString();
                                }
                            }
                        }
                    } catch (JSONException e) {
                        C16880lQ.LLLLIIL(e);
                    }
                }
                return false;
            }
            if (!TextUtils.isEmpty(this.LJJIL)) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("\"");
                LIZ.append(str);
                LIZ.append("\"");
                if (this.LJJIL.contains(X1D.LIZIZ(LIZ))) {
                    return true;
                }
            }
        } catch (Exception e2) {
            C16880lQ.LLLLIIL(e2);
        }
        if (!z || !TextUtils.equals(str, this.LJJJJJ)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:206:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fc A[Catch: JSONException -> 0x024c, TryCatch #6 {JSONException -> 0x024c, blocks: (B:122:0x0067, B:22:0x0070, B:24:0x0076, B:27:0x008a, B:30:0x0093, B:33:0x00ae, B:35:0x00b4, B:36:0x00d5, B:39:0x00f1, B:41:0x00fc, B:43:0x0103, B:44:0x011c, B:46:0x0124, B:47:0x0117, B:50:0x013f, B:53:0x014b, B:55:0x0157, B:56:0x0168, B:58:0x016f, B:60:0x0177, B:61:0x0179, B:70:0x01ab, B:77:0x01af, B:79:0x01b7, B:80:0x01bb, B:84:0x01c4, B:87:0x01ef, B:92:0x01e9, B:101:0x01f0, B:104:0x0165, B:106:0x00c3, B:114:0x01f4, B:116:0x0219, B:118:0x0226, B:119:0x022d, B:89:0x01ca), top: B:121:0x0067, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x016f A[Catch: JSONException -> 0x024c, TryCatch #6 {JSONException -> 0x024c, blocks: (B:122:0x0067, B:22:0x0070, B:24:0x0076, B:27:0x008a, B:30:0x0093, B:33:0x00ae, B:35:0x00b4, B:36:0x00d5, B:39:0x00f1, B:41:0x00fc, B:43:0x0103, B:44:0x011c, B:46:0x0124, B:47:0x0117, B:50:0x013f, B:53:0x014b, B:55:0x0157, B:56:0x0168, B:58:0x016f, B:60:0x0177, B:61:0x0179, B:70:0x01ab, B:77:0x01af, B:79:0x01b7, B:80:0x01bb, B:84:0x01c4, B:87:0x01ef, B:92:0x01e9, B:101:0x01f0, B:104:0x0165, B:106:0x00c3, B:114:0x01f4, B:116:0x0219, B:118:0x0226, B:119:0x022d, B:89:0x01ca), top: B:121:0x0067, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x018b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LIZJ(java.lang.String r30, java.lang.String r31, java.lang.String r32) {
        /*
            Method dump skipped, instructions count: 947
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.VAM.LIZJ(java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }
}
