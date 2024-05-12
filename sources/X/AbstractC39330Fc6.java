package X;

import com.bytedance.bpea.basics.Cert;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Fc6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39330Fc6 implements Cert {
    public final String certToken;
    public final String certType;
    public java.util.Map<String, Object> customInfo;

    @Override // com.bytedance.bpea.basics.Cert
    public String authKey() {
        return null;
    }

    @Override // com.bytedance.bpea.basics.Cert
    public JSONObject toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("certToken", this.certToken);
            jSONObject.put("certType", this.certType);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public String toString() {
        String jSONObject = toJSON().toString();
        o.LJFF(jSONObject, "toJSON().toString()");
        return jSONObject;
    }

    @Override // com.bytedance.bpea.basics.Cert
    public String certToken() {
        return this.certToken;
    }

    @Override // com.bytedance.bpea.basics.Cert
    public String certType() {
        return this.certType;
    }

    @Override // com.bytedance.bpea.basics.Cert
    public java.util.Map<String, Object> customInfo() {
        return this.customInfo;
    }

    @Override // com.bytedance.bpea.basics.Cert
    public void attachCustomInfo(java.util.Map<String, ? extends Object> map) {
        java.util.Map<String, Object> map2;
        if (this.customInfo == null) {
            this.customInfo = new LinkedHashMap();
        }
        if (map != null && (map2 = this.customInfo) != null) {
            map2.putAll(map);
        }
    }

    @Override // com.bytedance.bpea.basics.Cert
    public void validate(OHW context) {
        o.LJIIJ(context, "context");
        String str = this.certToken;
        if (str == null || str.length() == 0) {
            throw new Q0C(-1, "certToken is empty");
        }
    }

    public AbstractC39330Fc6(String str, String certType) {
        o.LJIIJ(certType, "certType");
        this.certToken = str;
        this.certType = certType;
    }

    @Override // com.bytedance.bpea.basics.Cert
    public void attachCustomInfo(String key, Object obj) {
        o.LJIIJ(key, "key");
        if (this.customInfo == null) {
            this.customInfo = new LinkedHashMap();
        }
        java.util.Map<String, Object> map = this.customInfo;
        if (map != null) {
            map.put(key, obj);
        }
    }
}
