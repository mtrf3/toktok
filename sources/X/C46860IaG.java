package X;

import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.IaG, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46860IaG {
    public int LIZ;
    public String LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public String LJ;
    public int LJFF = -1;
    public int LJI;
    public float LJII;
    public float LJIIIIZZ;
    public String LJIIIZ;

    public final JSONObject LIZIZ() {
        try {
            if (TextUtils.isEmpty(this.LIZIZ)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("main_url", this.LIZIZ);
            String str = this.LIZJ;
            if (str == null) {
                str = "";
            }
            jSONObject.put("backup_url_1", str);
            jSONObject.put("check_info", (Object) null);
            jSONObject.put("info_id", this.LJFF);
            jSONObject.put("bitrate", this.LJI);
            jSONObject.put("loudness", this.LJII);
            jSONObject.put("peak", this.LJIIIIZZ);
            return jSONObject;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    public final JSONObject LIZJ() {
        String str;
        try {
            if (TextUtils.isEmpty(this.LIZIZ)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(this.LIZIZ);
            String str2 = this.LIZJ;
            if (str2 != null) {
                jSONArray.put(str2);
            }
            String str3 = this.LIZLLL;
            if (str3 != null) {
                jSONArray.put(str3);
            }
            String str4 = this.LJ;
            if (str4 != null) {
                jSONArray.put(str4);
            }
            jSONObject.put("urls", jSONArray);
            jSONObject.put("info_id", this.LJFF);
            jSONObject.put("bitrate", this.LJI);
            jSONObject.put("file_hash", this.LJIIIZ);
            if (this.LIZ == 0) {
                str = "video";
            } else {
                str = "audio";
            }
            jSONObject.put("media_type", str);
            return jSONObject;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    public final String[] LIZ() {
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(this.LIZIZ)) {
            arrayList.add(this.LIZIZ);
        }
        if (!TextUtils.isEmpty(this.LIZJ)) {
            arrayList.add(this.LIZJ);
        } else if (!TextUtils.isEmpty(this.LIZLLL)) {
            arrayList.add(this.LIZLLL);
        } else if (!TextUtils.isEmpty(this.LJ)) {
            arrayList.add(this.LJ);
        }
        if (arrayList.size() == 0) {
            return null;
        }
        String[] strArr = new String[arrayList.size()];
        arrayList.toArray(strArr);
        return strArr;
    }
}
