package X;

import android.os.Message;
import android.text.TextUtils;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.Iq0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C47836Iq0 {
    public String LIZ;
    public long LIZLLL;
    public long LJ;
    public int LJFF;
    public C47789IpF LJI;
    public String LJII;
    public ArrayList<String> LJIIIIZZ;
    public HashMap<String, List<String>> LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public String LJIIL;
    public String LJIILIIL;
    public C47837Iq1 LJIILJJIL;
    public HashMap<String, Long> LJIILL;
    public HashMap<String, Long> LJIILLIIL;
    public HandlerC47839Iq3 LJIIZILJ;
    public String LJIJI;
    public long LIZIZ = -1;
    public String LIZJ = "base_task";
    public EnumC47842Iq6 LJIJ = EnumC47842Iq6.NONE;

    public JSONObject LIZJ() {
        return new JSONObject(LIZLLL());
    }

    public final java.util.Map LIZLLL() {
        HashMap hashMap = new HashMap();
        hashMap.put("id", Long.valueOf(this.LIZIZ));
        LJ("des", this.LIZ, hashMap);
        hashMap.put("res_size", Long.valueOf(this.LIZLLL));
        hashMap.put("content_size", Long.valueOf(this.LJ));
        hashMap.put("state", Integer.valueOf(this.LJFF));
        C47789IpF c47789IpF = this.LJI;
        if (c47789IpF != null) {
            LJFF("error", hashMap, c47789IpF.LJFF());
        }
        LJ("file_path", this.LJII, hashMap);
        ArrayList<String> arrayList = this.LJIIIIZZ;
        if (arrayList != null && !arrayList.isEmpty()) {
            hashMap.put("media_keys", arrayList);
        }
        LJFF("use_urls", hashMap, this.LJIIIZ);
        hashMap.put("finish", Boolean.valueOf(this.LJIIJ));
        hashMap.put("cancel", Boolean.valueOf(this.LJIIJJI));
        LJ("task_type", this.LIZJ, hashMap);
        LJ("vid", this.LJIIL, hashMap);
        LJ("auth_token", this.LJIILIIL, hashMap);
        LJFF("bytes_rec_map", hashMap, this.LJIILL);
        LJFF("bytes_expect_map", hashMap, this.LJIILLIIL);
        hashMap.put("encrypt_version", Integer.valueOf(this.LJIJ.version));
        if (!TextUtils.isEmpty(this.LJIJI)) {
            LJ("custom_dir", this.LJIJI, hashMap);
        }
        return hashMap;
    }

    public void LJII() {
        if (this.LJIIZILJ == null) {
            this.LJIIZILJ = new HandlerC47839Iq3(this, C47756Ioi.LJII(), this);
        }
        this.LJI = null;
        this.LJIIJ = false;
        System.currentTimeMillis();
    }

    public void LJIIIZ() {
        this.LIZIZ = -1L;
        this.LIZJ = "base_task";
        this.LIZLLL = 0L;
        this.LJ = 0L;
        this.LJFF = 0;
        this.LJI = null;
        this.LJII = null;
        this.LJIIIIZZ = new ArrayList<>();
        this.LJIIIZ = null;
        this.LJIIJ = false;
        this.LJIIL = null;
        this.LJIILL = new HashMap<>();
        this.LJIILLIIL = new HashMap<>();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(super.toString());
        LIZ.append("   id = ");
        LIZ.append(this.LIZIZ);
        LIZ.append(", state = ");
        LIZ.append(this.LJFF);
        LIZ.append(",  videoId ");
        LIZ.append(this.LJIIL);
        return X1D.LIZIZ(LIZ);
    }

    public boolean LIZ(C47789IpF c47789IpF) {
        int i;
        if (c47789IpF == null || (i = c47789IpF.LIZ) == -9995 || i == -9948 || i == -9949 || i == -9947 || i == -9946) {
            return false;
        }
        return true;
    }

    public void LIZIZ(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.LIZIZ = jSONObject.optLong("id");
        this.LIZ = jSONObject.optString("des");
        this.LIZLLL = jSONObject.optLong("res_size");
        this.LJ = jSONObject.optLong("content_size");
        this.LJFF = jSONObject.optInt("state");
        JSONObject optJSONObject = jSONObject.optJSONObject("error");
        C47789IpF c47789IpF = null;
        if (optJSONObject != null) {
            try {
                c47789IpF = new C47789IpF(optJSONObject.optString("domain"), optJSONObject.optInt("code"), optJSONObject.optInt("innerCode"), optJSONObject.optString("des"));
            } catch (Throwable th) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("generate error fail. ");
                LIZ.append(th);
                LIZ.append(" ");
                LIZ.append(optJSONObject);
                C78253UnR.LIZLLL("TTVideoEngineTTHelper", X1D.LIZIZ(LIZ));
            }
        }
        this.LJI = c47789IpF;
        this.LJII = jSONObject.optString("file_path");
        this.LJIJI = jSONObject.optString("custom_dir");
        JSONArray optJSONArray = jSONObject.optJSONArray("media_keys");
        if (optJSONArray != null && optJSONArray.length() > 0) {
            this.LJIIIIZZ = new ArrayList<>();
            for (int i = 0; i < optJSONArray.length(); i++) {
                String optString = optJSONArray.optString(i);
                if (!TextUtils.isEmpty(optString)) {
                    this.LJIIIIZZ.add(optString);
                }
            }
        } else {
            this.LJIIIIZZ = new ArrayList<>();
        }
        this.LJIIJ = jSONObject.optBoolean("finish");
        this.LJIIJJI = jSONObject.optBoolean("cancel");
        this.LIZJ = jSONObject.optString("task_type");
        this.LJIIL = jSONObject.optString("vid");
        this.LJIILIIL = jSONObject.optString("auth_token");
        if (jSONObject.optInt("encrypt_version", 0) == 1) {
            this.LJIJ = EnumC47842Iq6.MDL_VERSION_1;
        } else {
            this.LJIJ = EnumC47842Iq6.NONE;
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("bytes_rec_map");
        if (optJSONObject2 != null && optJSONObject2.length() > 0) {
            Iterator<String> keys = optJSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                this.LJIILL.put(next, Long.valueOf(optJSONObject2.optLong(next)));
            }
        }
        JSONObject optJSONObject3 = jSONObject.optJSONObject("bytes_expect_map");
        if (optJSONObject3 != null && optJSONObject3.length() > 0) {
            Iterator<String> keys2 = optJSONObject3.keys();
            while (keys2.hasNext()) {
                String next2 = keys2.next();
                this.LJIILLIIL.put(next2, Long.valueOf(optJSONObject3.optLong(next2)));
            }
        }
    }

    public void LJI(C47789IpF c47789IpF) {
        if (this.LJIIZILJ == null) {
            this.LJIIZILJ = new HandlerC47839Iq3(this, C47756Ioi.LJII(), this);
        }
        HandlerC47839Iq3 handlerC47839Iq3 = this.LJIIZILJ;
        if (handlerC47839Iq3 != null) {
            handlerC47839Iq3.sendMessage(Message.obtain(handlerC47839Iq3, 112, c47789IpF));
        }
    }

    public final void LJIIIIZZ(int i) {
        String str;
        if (i != this.LJFF) {
            this.LJFF = i;
            StringBuilder LJ = C7MY.LJ("[downloader] state did changed. state = ", i, " key = ");
            ArrayList<String> arrayList = this.LJIIIIZZ;
            if (arrayList != null) {
                str = arrayList.toString();
            } else {
                str = null;
            }
            LJ.append(str);
            TTVideoEngineLog.d("TTVideoEngine.DownloadTask", X1D.LIZIZ(LJ));
            C47837Iq1 c47837Iq1 = this.LJIILJJIL;
            if (c47837Iq1 != null) {
                c47837Iq1.getClass();
            }
        }
    }

    public static void LJ(String str, String str2, java.util.Map map) {
        if (!TextUtils.isEmpty(str2)) {
            ((HashMap) map).put(str, str2);
        }
    }

    public static void LJFF(String str, java.util.Map map, java.util.Map map2) {
        if (map2 != null && !map2.isEmpty()) {
            ((HashMap) map).put(str, map2);
        }
    }
}
