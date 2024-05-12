package X;

import android.text.TextUtils;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: X.IbP, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46931IbP {
    public String LIZ;
    public String LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public long LJ;
    public int LJFF;
    public int LJI;

    public final java.util.Map<String, Object> LIZJ() {
        HashMap hashMap = new HashMap();
        hashMap.put("file_id", LJ(2));
        hashMap.put("media_type", "mask");
        hashMap.put("file_size", Long.valueOf(this.LJ));
        hashMap.put("bitrate", Integer.valueOf(LIZLLL(6)));
        String LJ = LJ(1);
        if (!TextUtils.isEmpty(LJ)) {
            hashMap.put("urls", new String[]{LJ});
        }
        hashMap.put("file_hash", LJ(3));
        return hashMap;
    }

    public final void LIZ(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            this.LIZ = jSONObject.optString("version");
            this.LIZIZ = jSONObject.optString("barrage_mask_url");
            this.LIZJ = jSONObject.optString("file_id");
            this.LIZLLL = jSONObject.optString("file_hash");
            this.LJ = jSONObject.optLong("file_size");
            jSONObject.optLong("updated_at");
            this.LJFF = jSONObject.optInt("bitrate");
            this.LJI = jSONObject.optInt("head_len");
        } catch (Exception e) {
            TTVideoEngineLog.d(e);
        }
    }

    public final void LIZIZ(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            this.LIZ = jSONObject.optString("Version");
            this.LIZIZ = jSONObject.optString("BarrageMaskUrl");
            this.LIZJ = jSONObject.optString("FileId");
            this.LIZLLL = jSONObject.optString("FileHash");
            this.LJ = jSONObject.optLong("FileSize");
            jSONObject.optLong("UpdatedAt");
            this.LJFF = jSONObject.optInt("Bitrate");
            this.LJI = jSONObject.optInt("HeadLen");
        } catch (Exception e) {
            TTVideoEngineLog.d(e);
        }
    }

    public final int LIZLLL(int i) {
        if (i != 6) {
            if (i != 7) {
                return -1;
            }
            return this.LJI;
        }
        return this.LJFF;
    }

    public final String LJ(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return "";
                    }
                    return this.LIZLLL;
                }
                return this.LIZJ;
            }
            return this.LIZIZ;
        }
        return this.LIZ;
    }
}
