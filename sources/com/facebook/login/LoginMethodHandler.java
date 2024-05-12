package com.facebook.login;

import X.C113554cx;
import X.C65834Psc;
import X.C66373Q3d;
import X.C66381Q3l;
import X.C66388Q3s;
import X.EnumC66377Q3h;
import X.Q4R;
import X.Q4W;
import X.X1D;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.login.LoginClient;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.o;
import m43.u;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public abstract class LoginMethodHandler implements Parcelable {
    public static final Q4R Companion = new Q4R();
    public LoginClient loginClient;
    public Map<String, String> methodLoggingExtras;

    public void LIZIZ() {
    }

    public abstract String LJI();

    public boolean LJIIIZ(int i, int i2, Intent intent) {
        return false;
    }

    public void LJIIJJI(JSONObject jSONObject) {
    }

    public abstract int LJIIL(LoginClient.Request request);

    public final LoginClient LJ() {
        LoginClient loginClient = this.loginClient;
        if (loginClient != null) {
            return loginClient;
        }
        o.LJIJI("loginClient");
        throw null;
    }

    public String LJII() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("fb");
        LIZ.append(u.LIZLLL());
        LIZ.append("://authorize/");
        return X1D.LIZIZ(LIZ);
    }

    public LoginMethodHandler(Parcel source) {
        o.LJIIIZ(source, "source");
        int readInt = source.readInt();
        Map<String, String> map = null;
        if (readInt >= 0) {
            HashMap hashMap = new HashMap();
            if (readInt > 0) {
                int i = 0;
                do {
                    i++;
                    hashMap.put(source.readString(), source.readString());
                } while (i < readInt);
            }
            map = C113554cx.LJJLIL(hashMap);
        }
        this.methodLoggingExtras = map;
    }

    public final String LIZLLL(String authId) {
        o.LJIIIZ(authId, "authId");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("0_auth_logger_id", authId);
            jSONObject.put("3_method", LJI());
            LJIIJJI(jSONObject);
        } catch (JSONException unused) {
        }
        String jSONObject2 = jSONObject.toString();
        o.LJIIIIZZ(jSONObject2, "param.toString()");
        return jSONObject2;
    }

    public final void LJIIIIZZ(String str) {
        String str2;
        LoginClient.Request request = LJ().pendingRequest;
        if (request == null || (str2 = request.applicationId) == null) {
            str2 = u.LIZLLL();
        }
        LJ().LJII();
        Bundle bundle = new Bundle();
        bundle.putString("fb_web_login_e2e", str);
        bundle.putLong("fb_web_login_switchback_time", System.currentTimeMillis());
        bundle.putString("app_id", str2);
    }

    public LoginMethodHandler(LoginClient loginClient) {
        this.loginClient = loginClient;
    }

    public final void LIZ(Object obj, String str) {
        String obj2;
        if (this.methodLoggingExtras == null) {
            this.methodLoggingExtras = new HashMap();
        }
        Map<String, String> map = this.methodLoggingExtras;
        if (map == null) {
            return;
        }
        if (obj == null) {
            obj2 = null;
        } else {
            obj2 = obj.toString();
        }
        map.put(str, obj2);
    }

    public final void LJIIJ(Bundle bundle, LoginClient.Request request) {
        String string = bundle.getString("code");
        if (!C66373Q3d.LJIJJ(string)) {
            if (string == null) {
                throw new Q4W("Failed to create code exchange request");
            }
            String redirectUri = LJII();
            String str = request.codeVerifier;
            if (str == null) {
                str = "";
            }
            o.LJIIIZ(redirectUri, "redirectUri");
            Bundle bundle2 = new Bundle();
            bundle2.putString("code", string);
            bundle2.putString("client_id", u.LIZLLL());
            bundle2.putString("redirect_uri", redirectUri);
            bundle2.putString("code_verifier", str);
            GraphRequest LJI = C66388Q3s.LJI(null, "oauth/access_token", null);
            LJI.LJIIIZ(EnumC66377Q3h.GET);
            LJI.LIZJ = bundle2;
            C66381Q3l LIZJ = LJI.LIZJ();
            FacebookRequestError facebookRequestError = LIZJ.LIZLLL;
            if (facebookRequestError == null) {
                try {
                    JSONObject jSONObject = LIZJ.LIZJ;
                    if (jSONObject != null) {
                        String string2 = jSONObject.getString("access_token");
                        if (!C66373Q3d.LJIJJ(string2)) {
                            bundle.putString("access_token", string2);
                            if (jSONObject.has("id_token")) {
                                bundle.putString("id_token", jSONObject.getString("id_token"));
                                return;
                            }
                            return;
                        }
                    }
                    throw new Q4W("No access token found from result");
                } catch (JSONException e) {
                    throw new Q4W(o.LJIILLIIL(e.getMessage(), "Fail to process code exchange response: "));
                }
            }
            throw new C65834Psc(facebookRequestError, facebookRequestError.LIZ());
        }
        throw new Q4W("No code param found from the request");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i) {
        o.LJIIIZ(dest, "dest");
        Map<String, String> map = this.methodLoggingExtras;
        if (map == null) {
            dest.writeInt(-1);
            return;
        }
        dest.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            dest.writeString(key);
            dest.writeString(value);
        }
    }
}
