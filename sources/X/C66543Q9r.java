package X;

import android.content.Intent;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.Collections;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Q9r, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66543Q9r extends Exception {
    public final int code;
    public final String error;
    public final String errorDescription;
    public final android.net.Uri errorUri;
    public final int type;

    public int hashCode() {
        return ((this.type + 31) * 31) + this.code;
    }

    public Intent toIntent() {
        Intent intent = new Intent();
        intent.putExtra("net.openid.appauth.AuthorizationException", toJsonString());
        return intent;
    }

    public JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        C66546Q9u.LJII(this.type, "type", jSONObject);
        C66546Q9u.LJII(this.code, "code", jSONObject);
        C66546Q9u.LJIIJ("error", this.error, jSONObject);
        C66546Q9u.LJIIJ("errorDescription", this.errorDescription, jSONObject);
        android.net.Uri uri = this.errorUri;
        if (uri != null) {
            try {
                jSONObject.put("errorUri", uri.toString());
            } catch (JSONException e) {
                throw new IllegalStateException("JSONException thrown in violation of contract", e);
            }
        }
        return jSONObject;
    }

    public String toJsonString() {
        return toJson().toString();
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AuthorizationException: ");
        LIZ.append(toJsonString());
        return X1D.LIZIZ(LIZ);
    }

    public static java.util.Map<String, C66543Q9r> exceptionMapByString(C66543Q9r... c66543Q9rArr) {
        int i;
        if (c66543Q9rArr != null) {
            i = c66543Q9rArr.length;
        } else {
            i = 0;
        }
        C1HQ c1hq = new C1HQ(i);
        if (c66543Q9rArr != null) {
            for (C66543Q9r c66543Q9r : c66543Q9rArr) {
                String str = c66543Q9r.error;
                if (str != null) {
                    c1hq.put(str, c66543Q9r);
                }
            }
        }
        return Collections.unmodifiableMap(c1hq);
    }

    public static C66543Q9r fromIntent(Intent intent) {
        intent.getClass();
        if (!intent.hasExtra("net.openid.appauth.AuthorizationException")) {
            return null;
        }
        try {
            return fromJson(C16880lQ.LLJJIJIIJIL(intent, "net.openid.appauth.AuthorizationException"));
        } catch (JSONException e) {
            throw new IllegalArgumentException("Intent contains malformed exception data", e);
        }
    }

    public static C66543Q9r fromJson(JSONObject jSONObject) {
        T2R.LJIILLIIL(jSONObject, "json cannot be null");
        return new C66543Q9r(JSONObjectProtectorUtils.getInt(jSONObject, "type"), JSONObjectProtectorUtils.getInt(jSONObject, "code"), C66546Q9u.LIZJ("error", jSONObject), C66546Q9u.LIZJ("errorDescription", jSONObject), C66546Q9u.LJFF("errorUri", jSONObject), null);
    }

    public static C66543Q9r fromOAuthRedirect(android.net.Uri uri) {
        android.net.Uri uri2;
        String queryParameter = UriProtector.getQueryParameter(uri, "error");
        String queryParameter2 = UriProtector.getQueryParameter(uri, "error_description");
        String queryParameter3 = UriProtector.getQueryParameter(uri, "error_uri");
        C66543Q9r c66543Q9r = C66542Q9q.LIZJ.get(queryParameter);
        if (c66543Q9r == null) {
            c66543Q9r = C66542Q9q.LIZ;
        }
        int i = c66543Q9r.type;
        int i2 = c66543Q9r.code;
        if (queryParameter2 == null) {
            queryParameter2 = c66543Q9r.errorDescription;
        }
        if (queryParameter3 != null) {
            uri2 = UriProtector.parse(queryParameter3);
        } else {
            uri2 = c66543Q9r.errorUri;
        }
        return new C66543Q9r(i, i2, queryParameter, queryParameter2, uri2, null);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof C66543Q9r)) {
            return false;
        }
        C66543Q9r c66543Q9r = (C66543Q9r) obj;
        if (this.type == c66543Q9r.type && this.code == c66543Q9r.code) {
            return true;
        }
        return false;
    }

    public static C66543Q9r fromJson(String str) {
        T2R.LJIILL("jsonStr cannot be null or empty", str);
        return fromJson(new JSONObject(str));
    }

    public static C66543Q9r authEx(int i, String str) {
        return new C66543Q9r(1, i, str, null, null, null);
    }

    public static C66543Q9r fromTemplate(C66543Q9r c66543Q9r, Throwable th) {
        return new C66543Q9r(c66543Q9r.type, c66543Q9r.code, c66543Q9r.error, c66543Q9r.errorDescription, c66543Q9r.errorUri, th);
    }

    public static C66543Q9r generalEx(int i, String str) {
        return new C66543Q9r(0, i, null, str, null, null);
    }

    public static C66543Q9r registrationEx(int i, String str) {
        return new C66543Q9r(4, i, str, null, null, null);
    }

    public static C66543Q9r tokenEx(int i, String str) {
        return new C66543Q9r(2, i, str, null, null, null);
    }

    public static C66543Q9r fromOAuthTemplate(C66543Q9r c66543Q9r, String str, String str2, android.net.Uri uri) {
        String str3 = str;
        android.net.Uri uri2 = uri;
        String str4 = str2;
        int i = c66543Q9r.type;
        int i2 = c66543Q9r.code;
        if (str3 == null) {
            str3 = c66543Q9r.error;
        }
        if (str4 == null) {
            str4 = c66543Q9r.errorDescription;
        }
        if (uri2 == null) {
            uri2 = c66543Q9r.errorUri;
        }
        return new C66543Q9r(i, i2, str3, str4, uri2, null);
    }

    public C66543Q9r(int i, int i2, String str, String str2, android.net.Uri uri, Throwable th) {
        super(str2, th);
        this.type = i;
        this.code = i2;
        this.error = str;
        this.errorDescription = str2;
        this.errorUri = uri;
    }
}
