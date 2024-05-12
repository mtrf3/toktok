package X;

import android.text.TextUtils;
import java.io.Serializable;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class IVV implements Serializable {
    public static final IVV LJLJJLL = new IVV();
    public static final C35751E1j LJLJL = new C35751E1j(100);
    public final IVW LJLIL;
    public final IVU[] LJLILLLLZI;
    public final transient JSONObject LJLJI;
    public final int LJLJJI;
    public final String LJLJJL;

    public boolean isVR() {
        if (this.LJLIL != null) {
            return true;
        }
        return false;
    }

    public IVV() {
    }

    public String getFormat() {
        return this.LJLJJL;
    }

    public IVU[] getFrameOffsets() {
        return this.LJLILLLLZI;
    }

    public JSONObject getJson() {
        return this.LJLJI;
    }

    public int getRealBitrate() {
        return this.LJLJJI;
    }

    public IVW getVideoStyle() {
        return this.LJLIL;
    }

    public IVV(JSONObject jSONObject) {
        this.LJLJI = jSONObject;
        this.LJLIL = IVW.fromJSON(jSONObject.optJSONObject("VideoStyle"));
        this.LJLJJI = jSONObject.optInt("real_bitrate");
        this.LJLJJL = jSONObject.optString("format");
        IVU[] fromJSON = IVU.fromJSON(jSONObject.optString("PktOffsetMap"));
        this.LJLILLLLZI = fromJSON;
        if (fromJSON != null && fromJSON.length > 0) {
            for (int i = 0; i < this.LJLILLLLZI.length; i++) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static IVV from(String str) {
        if (!((Boolean) IZ8.LJJLIIIJJIZ.getValue()).booleanValue()) {
            try {
                return new IVV(new JSONObject(str));
            } catch (Throwable unused) {
                return new IVV();
            }
        }
        if (TextUtils.isEmpty(str)) {
            return LJLJJLL;
        }
        C35751E1j c35751E1j = LJLJL;
        IVV ivv = (IVV) c35751E1j.get(str);
        if (ivv == null) {
            try {
                ivv = new IVV(new JSONObject(str));
            } catch (Throwable unused2) {
                ivv = new IVV();
            }
            c35751E1j.put(str, ivv);
        }
        return ivv;
    }
}
