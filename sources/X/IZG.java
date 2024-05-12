package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.io.Serializable;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class IZG implements Serializable {
    public static final IZG LJLJLLL = new IZG();
    public static final C35751E1j LJLL = new C35751E1j(100);
    public final String LJLIL;
    public transient E0B LJLILLLLZI;
    public transient IZH LJLJI;
    public transient IZK LJLJJI;
    public transient C47194Ife LJLJJL;
    public transient IZB LJLJJLL;
    public transient String LJLJL;
    public transient JSONObject LJLJLJ;

    public IZH getBarrageMaskInfo() {
        if (this.LJLJI == null) {
            this.LJLJI = LIZ(getJson());
        }
        return this.LJLJI;
    }

    public JSONObject getJson() {
        JSONObject jSONObject;
        if (this.LJLJLJ == null) {
            try {
                jSONObject = new JSONObject(this.LJLIL);
            } catch (Throwable unused) {
                jSONObject = new JSONObject();
            }
            this.LJLJLJ = jSONObject;
        }
        return this.LJLJLJ;
    }

    public IZK getPlayTimeInfo() {
        if (this.LJLJJI == null) {
            this.LJLJJI = LIZIZ(getJson());
        }
        return this.LJLJJI;
    }

    public String getStrategyTokens() {
        if (this.LJLJL == null) {
            this.LJLJL = getJson().optString("strategy_tokens", "");
        }
        return this.LJLJL;
    }

    public E0B getVidToken() {
        if (((Boolean) IZ8.LJJZ.getValue()).booleanValue()) {
            if (this.LJLILLLLZI == null) {
                this.LJLILLLLZI = LIZJ(getJson());
            }
            return this.LJLILLLLZI;
        }
        return null;
    }

    public IZB getVolumeInfo() {
        if (this.LJLJJLL == null) {
            this.LJLJJLL = LIZLLL(getJson());
        }
        return this.LJLJJLL;
    }

    public C47194Ife getWatchTimeInfo() {
        if (this.LJLJJL == null) {
            this.LJLJJL = LJ(getJson());
        }
        return this.LJLJJL;
    }

    public IZG() {
    }

    public String getMetaStr() {
        return this.LJLIL;
    }

    public IZG(String str) {
        JSONObject jSONObject;
        this.LJLIL = str;
        if (!((Boolean) IZ8.LJJLIIIJJI.getValue()).booleanValue()) {
            try {
                jSONObject = new JSONObject(str);
            } catch (Throwable unused) {
                jSONObject = new JSONObject();
            }
            this.LJLJLJ = jSONObject;
            if (TextUtils.isEmpty(jSONObject.toString())) {
                this.LJLILLLLZI = null;
                this.LJLJI = null;
                this.LJLJJI = null;
                this.LJLJJL = null;
                this.LJLJJLL = null;
                this.LJLJL = null;
                return;
            }
            this.LJLILLLLZI = LIZJ(jSONObject);
            this.LJLJI = LIZ(jSONObject);
            this.LJLJJI = LIZIZ(jSONObject);
            this.LJLJJL = LJ(jSONObject);
            this.LJLJJLL = LIZLLL(jSONObject);
            this.LJLJL = jSONObject.optString("strategy_tokens", "");
        }
    }

    public static IZH LIZ(JSONObject jSONObject) {
        IZH izh;
        String optString = jSONObject.optString("barrage_mask_info");
        if (TextUtils.isEmpty(optString)) {
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject(optString);
            String optString2 = jSONObject2.optString("FileId");
            String optString3 = jSONObject2.optString("FileHash");
            String optString4 = jSONObject2.optString("BarrageMaskUrl");
            int optInt = jSONObject2.optInt("FileSize");
            int optInt2 = jSONObject2.optInt("Bitrate");
            izh = new IZH(optString2, optString4, jSONObject2.optInt("HeadLen"));
            izh.setBitrate(optInt2);
            izh.setFileHash(optString3);
            izh.setFileSize(optInt);
        } catch (Throwable unused) {
        }
        if (!izh.isValid()) {
            return null;
        }
        return izh;
    }

    public static IZK LIZIZ(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("play_time_prob_dist");
        if (TextUtils.isEmpty(optString)) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray(optString);
            if (jSONArray.length() >= 3) {
                return new IZK(JSONArrayProtectorUtils.getString(jSONArray, 0), JSONArrayProtectorUtils.getString(jSONArray, 1), JSONArrayProtectorUtils.getString(jSONArray, 2));
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static E0B LIZJ(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject(jSONObject.optString("token_auth", "{}"));
            String optString = jSONObject2.optString("vid");
            String optString2 = jSONObject2.optString("token");
            int optInt = jSONObject2.optInt("version", 2);
            ArrayList arrayList = new ArrayList();
            JSONArray optJSONArray = jSONObject2.optJSONArray("hosts");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    arrayList.add(optJSONArray.optString(i));
                }
            }
            E0B e0b = new E0B(optString, optString2, arrayList, optInt);
            if (e0b.isValid()) {
                return e0b;
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static IZB LIZLLL(JSONObject jSONObject) {
        if (jSONObject == null || TextUtils.isEmpty(jSONObject.toString())) {
            return null;
        }
        try {
            float parseFloat = CastFloatProtector.parseFloat(jSONObject.optString("LoudnessRange", CardStruct.IStatusCode.DEFAULT));
            float parseFloat2 = CastFloatProtector.parseFloat(jSONObject.optString("LoudnessRangeStart", CardStruct.IStatusCode.DEFAULT));
            float parseFloat3 = CastFloatProtector.parseFloat(jSONObject.optString("LoudnessRangeEnd", CardStruct.IStatusCode.DEFAULT));
            float parseFloat4 = CastFloatProtector.parseFloat(jSONObject.optString("MaximumMomentaryLoudness", CardStruct.IStatusCode.DEFAULT));
            float parseFloat5 = CastFloatProtector.parseFloat(jSONObject.optString("MaximumShortTermLoudness", CardStruct.IStatusCode.DEFAULT));
            String optString = jSONObject.optString("VolumeInfoJson", "");
            boolean optBoolean = jSONObject.optBoolean("disable_in_photo_mode", false);
            int parseInt = CastIntegerProtector.parseInt(jSONObject.optString("Version", CardStruct.IStatusCode.DEFAULT));
            IZB izb = new IZB();
            izb.setLoudnessRange(parseFloat);
            izb.setLoudnessRangeStart(parseFloat2);
            izb.setLoudnessRangeEnd(parseFloat3);
            izb.setMaximumShortTermLoudness(parseFloat5);
            izb.setMaximumMomentaryLoudness(parseFloat4);
            izb.setVolumeInfoJson(optString);
            izb.setDisableInPhotoMode(optBoolean);
            izb.setVersion(parseInt);
            return izb;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static C47194Ife LJ(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("estimate_posterior_watch_time");
        if (TextUtils.isEmpty(optString)) {
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject(optString);
            return new C47194Ife(jSONObject2.optString("param_a"), jSONObject2.optString("param_b"), jSONObject2.optString("param_c"), jSONObject2.optString("param_d"), jSONObject2.optInt("threshold"));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static IZG from(String str) {
        if (!((Boolean) IZ8.LJJLIIIJJIZ.getValue()).booleanValue()) {
            if (TextUtils.isEmpty(str)) {
                return new IZG();
            }
            return new IZG(str);
        }
        if (TextUtils.isEmpty(str)) {
            return LJLJLLL;
        }
        C35751E1j c35751E1j = LJLL;
        IZG izg = (IZG) c35751E1j.get(str);
        if (izg == null) {
            if (TextUtils.isEmpty(str)) {
                izg = new IZG();
            } else {
                izg = new IZG(str);
            }
            c35751E1j.put(str, izg);
        }
        return izg;
    }
}
