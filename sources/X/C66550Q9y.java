package X;

import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Q9y, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66550Q9y {
    public static final QAK LIZIZ = new QAK("authorization_endpoint");
    public static final QAK LIZJ = new QAK("token_endpoint");
    public static final QAK LIZLLL = new QAK("registration_endpoint");
    public static final List<String> LJ;
    public final JSONObject LIZ;

    static {
        Arrays.asList("authorization_code", "implicit");
        Collections.singletonList("client_secret_basic");
        Collections.singletonList("normal");
        new QAH("claims_parameter_supported", false);
        new QAH("request_parameter_supported", false);
        new QAH("request_uri_parameter_supported", true);
        new QAH("require_request_uri_registration", false);
        LJ = Arrays.asList("issuer", "authorization_endpoint", "jwks_uri", "response_types_supported", "subject_types_supported", "id_token_signing_alg_values_supported");
    }

    public C66550Q9y(JSONObject jSONObject) {
        jSONObject.getClass();
        this.LIZ = jSONObject;
        for (String str : LJ) {
            if (!this.LIZ.has(str) || this.LIZ.get(str) == null) {
                throw new QAG(str);
            }
        }
    }

    public final Object LIZ(QAK qak) {
        JSONObject jSONObject = this.LIZ;
        try {
            if (!jSONObject.has(qak.LIZ)) {
                return qak.LIZIZ;
            }
            return UriProtector.parse(JSONObjectProtectorUtils.getString(jSONObject, qak.LIZ));
        } catch (JSONException e) {
            throw new IllegalStateException("unexpected JSONException", e);
        }
    }
}
