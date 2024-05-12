package X;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Q9s, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66544Q9s {
    public static final java.util.Set<String> LJIILJJIL = Collections.unmodifiableSet(new HashSet(Arrays.asList("client_id", "code_challenge", "code_challenge_method", "display", "login_hint", "prompt", "redirect_uri", "response_mode", "response_type", "scope", "state")));
    public final C66540Q9o LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final android.net.Uri LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;
    public final String LJIIJ;
    public final String LJIIJJI;
    public final String LJIIL;
    public final java.util.Map<String, String> LJIILIIL;

    public final JSONObject LIZIZ() {
        JSONObject jSONObject = new JSONObject();
        C66540Q9o c66540Q9o = this.LIZ;
        c66540Q9o.getClass();
        JSONObject jSONObject2 = new JSONObject();
        C66546Q9u.LJIIIIZZ("authorizationEndpoint", c66540Q9o.LIZ.toString(), jSONObject2);
        C66546Q9u.LJIIIIZZ("tokenEndpoint", c66540Q9o.LIZIZ.toString(), jSONObject2);
        android.net.Uri uri = c66540Q9o.LIZJ;
        if (uri != null) {
            C66546Q9u.LJIIIIZZ("registrationEndpoint", uri.toString(), jSONObject2);
        }
        C66550Q9y c66550Q9y = c66540Q9o.LIZLLL;
        if (c66550Q9y != null) {
            C66546Q9u.LJIIIZ("discoveryDoc", jSONObject2, c66550Q9y.LIZ);
        }
        C66546Q9u.LJIIIZ("configuration", jSONObject, jSONObject2);
        C66546Q9u.LJIIIIZZ("clientId", this.LIZIZ, jSONObject);
        C66546Q9u.LJIIIIZZ("responseType", this.LJFF, jSONObject);
        C66546Q9u.LJIIIIZZ("redirectUri", this.LJI.toString(), jSONObject);
        C66546Q9u.LJIIJ("display", this.LIZJ, jSONObject);
        C66546Q9u.LJIIJ("login_hint", this.LIZLLL, jSONObject);
        C66546Q9u.LJIIJ("scope", this.LJII, jSONObject);
        C66546Q9u.LJIIJ("prompt", this.LJ, jSONObject);
        C66546Q9u.LJIIJ("state", this.LJIIIIZZ, jSONObject);
        C66546Q9u.LJIIJ("codeVerifier", this.LJIIIZ, jSONObject);
        C66546Q9u.LJIIJ("codeVerifierChallenge", this.LJIIJ, jSONObject);
        C66546Q9u.LJIIJ("codeVerifierChallengeMethod", this.LJIIJJI, jSONObject);
        C66546Q9u.LJIIJ("responseMode", this.LJIIL, jSONObject);
        C66546Q9u.LJIIIZ("additionalParameters", jSONObject, C66546Q9u.LJI(this.LJIILIIL));
        return jSONObject;
    }

    public final android.net.Uri LIZJ() {
        Uri.Builder appendQueryParameter = this.LIZ.LIZ.buildUpon().appendQueryParameter("redirect_uri", this.LJI.toString()).appendQueryParameter("client_id", this.LIZIZ).appendQueryParameter("response_type", this.LJFF);
        CHI.LIZ(appendQueryParameter, "display", this.LIZJ);
        CHI.LIZ(appendQueryParameter, "login_hint", this.LIZLLL);
        CHI.LIZ(appendQueryParameter, "prompt", this.LJ);
        CHI.LIZ(appendQueryParameter, "state", this.LJIIIIZZ);
        CHI.LIZ(appendQueryParameter, "scope", this.LJII);
        CHI.LIZ(appendQueryParameter, "response_mode", this.LJIIL);
        if (this.LJIIIZ != null) {
            appendQueryParameter.appendQueryParameter("code_challenge", this.LJIIJ).appendQueryParameter("code_challenge_method", this.LJIIJJI);
        }
        for (Map.Entry<String, String> entry : this.LJIILIIL.entrySet()) {
            appendQueryParameter.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        return appendQueryParameter.build();
    }

    public static C66544Q9s LIZ(JSONObject jSONObject) {
        C66540Q9o c66540Q9o;
        T2R.LJIILLIIL(jSONObject, "json cannot be null");
        JSONObject jSONObject2 = JSONObjectProtectorUtils.getJSONObject(jSONObject, "configuration");
        T2R.LJIILLIIL(jSONObject2, "json object cannot be null");
        if (jSONObject2.has("discoveryDoc")) {
            try {
                c66540Q9o = new C66540Q9o(new C66550Q9y(jSONObject2.optJSONObject("discoveryDoc")));
            } catch (QAG e) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Missing required field in discovery doc: ");
                LIZ.append(e.getMissingField());
                throw new JSONException(X1D.LIZIZ(LIZ));
            }
        } else {
            T2R.LJIILJJIL("missing authorizationEndpoint", jSONObject2.has("authorizationEndpoint"));
            T2R.LJIILJJIL("missing tokenEndpoint", jSONObject2.has("tokenEndpoint"));
            c66540Q9o = new C66540Q9o(C66546Q9u.LJ("authorizationEndpoint", jSONObject2), C66546Q9u.LJ("tokenEndpoint", jSONObject2), C66546Q9u.LJFF("registrationEndpoint", jSONObject2));
        }
        C66549Q9x c66549Q9x = new C66549Q9x(c66540Q9o, C66546Q9u.LIZIZ(jSONObject, "clientId"), C66546Q9u.LIZIZ(jSONObject, "responseType"), C66546Q9u.LJ("redirectUri", jSONObject));
        String LIZJ = C66546Q9u.LIZJ("display", jSONObject);
        if (LIZJ != null) {
            T2R.LJIILL("display must be null or not empty", LIZJ);
        }
        c66549Q9x.LIZJ = LIZJ;
        String LIZJ2 = C66546Q9u.LIZJ("login_hint", jSONObject);
        if (LIZJ2 != null) {
            T2R.LJIILL("login hint must be null or not empty", LIZJ2);
        }
        c66549Q9x.LIZLLL = LIZJ2;
        String LIZJ3 = C66546Q9u.LIZJ("prompt", jSONObject);
        if (LIZJ3 != null) {
            T2R.LJIILL("prompt must be null or non-empty", LIZJ3);
        }
        c66549Q9x.LJ = LIZJ3;
        String LIZJ4 = C66546Q9u.LIZJ("state", jSONObject);
        if (LIZJ4 != null) {
            T2R.LJIILL("state cannot be empty if defined", LIZJ4);
        }
        c66549Q9x.LJIIIIZZ = LIZJ4;
        c66549Q9x.LIZIZ(C66546Q9u.LIZJ("codeVerifier", jSONObject), C66546Q9u.LIZJ("codeVerifierChallenge", jSONObject), C66546Q9u.LIZJ("codeVerifierChallengeMethod", jSONObject));
        String LIZJ5 = C66546Q9u.LIZJ("responseMode", jSONObject);
        T2R.LJIIZILJ("responseMode must not be empty", LIZJ5);
        c66549Q9x.LJIIL = LIZJ5;
        c66549Q9x.LJIILIIL = C67822lO.LIZ(C66546Q9u.LIZLLL("additionalParameters", jSONObject), LJIILJJIL);
        if (jSONObject.has("scope")) {
            List asList = Arrays.asList(TextUtils.split(C66546Q9u.LIZIZ(jSONObject, "scope"), " "));
            LinkedHashSet linkedHashSet = new LinkedHashSet(asList.size());
            linkedHashSet.addAll(asList);
            c66549Q9x.LJII = C78999UzT.LJIILJJIL(linkedHashSet);
        }
        return c66549Q9x.LIZ();
    }

    public C66544Q9s(C66540Q9o c66540Q9o, String str, String str2, android.net.Uri uri, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, java.util.Map map) {
        this.LIZ = c66540Q9o;
        this.LIZIZ = str;
        this.LJFF = str2;
        this.LJI = uri;
        this.LJIILIIL = map;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
        this.LJII = str6;
        this.LJIIIIZZ = str7;
        this.LJIIIZ = str8;
        this.LJIIJ = str9;
        this.LJIIJJI = str10;
        this.LJIIL = str11;
    }
}
