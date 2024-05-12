package X;

import android.content.Intent;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Q9t, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66545Q9t {
    public static final java.util.Set<String> LJIIIZ = Collections.unmodifiableSet(new HashSet(Arrays.asList("token_type", "state", "code", "access_token", "expires_in", "id_token", "scope")));
    public final C66544Q9s LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final Long LJFF;
    public final String LJI;
    public final String LJII;
    public final java.util.Map<String, String> LJIIIIZZ;

    public final C65474Pmo LIZ() {
        java.util.Map emptyMap = Collections.emptyMap();
        T2R.LJIILLIIL(emptyMap, "additionalExchangeParameters cannot be null");
        if (this.LIZLLL != null) {
            C66544Q9s c66544Q9s = this.LIZ;
            QA0 qa0 = new QA0(c66544Q9s.LIZ, c66544Q9s.LIZIZ);
            T2R.LJIILL("grantType cannot be null or empty", "authorization_code");
            qa0.LIZJ = "authorization_code";
            android.net.Uri uri = this.LIZ.LJI;
            if (uri != null) {
                T2R.LJIILLIIL(uri.getScheme(), "redirectUri must have a scheme");
            }
            qa0.LIZLLL = uri;
            String str = this.LIZ.LJIIIZ;
            if (str != null) {
                C63927P7b.LIZ(str);
            }
            qa0.LJII = str;
            String str2 = this.LIZLLL;
            T2R.LJIIZILJ("authorization code must not be empty", str2);
            qa0.LJFF = str2;
            qa0.LJIIIIZZ = C67822lO.LIZ(emptyMap, C65474Pmo.LJIIIZ);
            return qa0.LIZ();
        }
        throw new IllegalStateException("authorizationCode not available for exchange request");
    }

    public static C66545Q9t LIZIZ(Intent intent) {
        T2R.LJIILLIIL(intent, "dataIntent must not be null");
        if (!intent.hasExtra("net.openid.appauth.AuthorizationResponse")) {
            return null;
        }
        try {
            return LIZJ(C16880lQ.LLJJIJIIJIL(intent, "net.openid.appauth.AuthorizationResponse"));
        } catch (JSONException e) {
            throw new IllegalArgumentException("Intent contains malformed auth response", e);
        }
    }

    public static C66545Q9t LIZJ(String str) {
        JSONObject jSONObject = new JSONObject(str);
        if (jSONObject.has("request")) {
            C66551Q9z c66551Q9z = new C66551Q9z(C66544Q9s.LIZ(JSONObjectProtectorUtils.getJSONObject(jSONObject, "request")));
            String LIZJ = C66546Q9u.LIZJ("token_type", jSONObject);
            T2R.LJIIZILJ("tokenType must not be empty", LIZJ);
            c66551Q9z.LIZJ = LIZJ;
            String LIZJ2 = C66546Q9u.LIZJ("access_token", jSONObject);
            T2R.LJIIZILJ("accessToken must not be empty", LIZJ2);
            c66551Q9z.LJ = LIZJ2;
            String LIZJ3 = C66546Q9u.LIZJ("code", jSONObject);
            T2R.LJIIZILJ("authorizationCode must not be empty", LIZJ3);
            c66551Q9z.LIZLLL = LIZJ3;
            String LIZJ4 = C66546Q9u.LIZJ("id_token", jSONObject);
            T2R.LJIIZILJ("idToken cannot be empty", LIZJ4);
            c66551Q9z.LJI = LIZJ4;
            c66551Q9z.LIZIZ(C66546Q9u.LIZJ("scope", jSONObject));
            String LIZJ5 = C66546Q9u.LIZJ("state", jSONObject);
            T2R.LJIIZILJ("state must not be empty", LIZJ5);
            c66551Q9z.LIZIZ = LIZJ5;
            c66551Q9z.LJFF = C66546Q9u.LIZ(jSONObject);
            c66551Q9z.LJIIIIZZ = C67822lO.LIZ(C66546Q9u.LIZLLL("additional_parameters", jSONObject), LJIIIZ);
            return c66551Q9z.LIZ();
        }
        throw new IllegalArgumentException("authorization request not provided and not found in JSON");
    }

    public C66545Q9t(C66544Q9s c66544Q9s, String str, String str2, String str3, String str4, Long l, String str5, String str6, java.util.Map map) {
        this.LIZ = c66544Q9s;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = str4;
        this.LJFF = l;
        this.LJI = str5;
        this.LJII = str6;
        this.LJIIIIZZ = map;
    }
}
