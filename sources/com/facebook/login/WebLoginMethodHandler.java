package com.facebook.login;

import X.C65834Psc;
import X.C66373Q3d;
import X.C66406Q4k;
import X.C66416Q4u;
import X.C66419Q4x;
import X.EnumC66385Q3p;
import X.F9J;
import X.Q4R;
import X.Q4W;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.webkit.CookieSyncManager;
import com.facebook.AccessToken;
import com.facebook.AuthenticationToken;
import com.facebook.FacebookRequestError;
import com.facebook.login.LoginClient;
import java.util.Set;
import kotlin.jvm.internal.o;
import m43.u;

/* loaded from: classes12.dex */
public abstract class WebLoginMethodHandler extends LoginMethodHandler {
    public static final C66419Q4x Companion = new C66419Q4x();
    public String e2e;

    public abstract EnumC66385Q3p LJIILJJIL();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebLoginMethodHandler(Parcel source) {
        super(source);
        o.LJIIIZ(source, "source");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.os.Bundle LJIILIIL(com.facebook.login.LoginClient.Request r9) {
        /*
            r8 = this;
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.util.Set<java.lang.String> r0 = r9.permissions
            r3 = 0
            if (r0 == 0) goto L10
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L96
        L10:
            X.Q5V r0 = r9.defaultAudience
            if (r0 != 0) goto L16
            X.Q5V r0 = X.Q5V.NONE
        L16:
            java.lang.String r1 = "default_audience"
            java.lang.String r0 = r0.getNativeProtocolAudience()
            r2.putString(r1, r0)
            java.lang.String r0 = r9.authId
            java.lang.String r1 = r8.LIZLLL(r0)
            java.lang.String r0 = "state"
            r2.putString(r0, r1)
            X.Q3m r0 = com.facebook.AccessToken.Companion
            r0.getClass()
            com.facebook.AccessToken r0 = X.C66382Q3m.LIZIZ()
            if (r0 != 0) goto L93
            r7 = 0
        L36:
            java.lang.String r4 = "0"
            java.lang.String r5 = "1"
            java.lang.String r6 = "access_token"
            if (r7 == 0) goto L81
            com.facebook.login.LoginClient r0 = r8.LJ()
            X.1qj r1 = r0.LJII()
            if (r1 != 0) goto L4c
            android.content.Context r1 = m43.u.LIZJ()
        L4c:
            java.lang.String r0 = "com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY"
            android.content.SharedPreferences r3 = X.F9J.LIZIZ(r1, r3, r0)
            java.lang.String r1 = "TOKEN"
            java.lang.String r0 = ""
            java.lang.String r0 = r3.getString(r1, r0)
            boolean r0 = kotlin.jvm.internal.o.LJ(r7, r0)
            if (r0 == 0) goto L81
            r2.putString(r6, r7)
            r8.LIZ(r5, r6)
        L66:
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "cbt"
            r2.putString(r0, r1)
            boolean r0 = X.C66371Q3b.LIZIZ()
            if (r0 == 0) goto L7b
            r4 = r5
        L7b:
            java.lang.String r0 = "ies"
            r2.putString(r0, r4)
            return r2
        L81:
            com.facebook.login.LoginClient r0 = r8.LJ()
            X.1qj r0 = r0.LJII()
            if (r0 != 0) goto L8f
        L8b:
            r8.LIZ(r4, r6)
            goto L66
        L8f:
            X.C16880lQ.LLIILII(r0)
            goto L8b
        L93:
            java.lang.String r7 = r0.token
            goto L36
        L96:
            java.lang.String r1 = ","
            java.util.Set<java.lang.String> r0 = r9.permissions
            java.lang.String r1 = android.text.TextUtils.join(r1, r0)
            java.lang.String r0 = "scope"
            r2.putString(r0, r1)
            r8.LIZ(r1, r0)
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.WebLoginMethodHandler.LJIILIIL(com.facebook.login.LoginClient$Request):android.os.Bundle");
    }

    public WebLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    public final void LJIILL(LoginClient.Request request, Bundle bundle, Q4W q4w) {
        String message;
        String str;
        LoginClient.Result LIZJ;
        LoginClient LJ = LJ();
        this.e2e = null;
        if (bundle != null) {
            if (bundle.containsKey("e2e")) {
                this.e2e = bundle.getString("e2e");
            }
            try {
                Q4R q4r = LoginMethodHandler.Companion;
                Set<String> set = request.permissions;
                EnumC66385Q3p LJIILJJIL = LJIILJJIL();
                String str2 = request.applicationId;
                q4r.getClass();
                AccessToken LIZIZ = Q4R.LIZIZ(set, bundle, LJIILJJIL, str2);
                AuthenticationToken LIZJ2 = Q4R.LIZJ(bundle, request.nonce);
                C66416Q4u c66416Q4u = LoginClient.Result.Companion;
                LoginClient.Request request2 = LJ.pendingRequest;
                c66416Q4u.getClass();
                LIZJ = C66416Q4u.LIZIZ(request2, LIZIZ, LIZJ2);
                if (LJ.LJII() != null) {
                    try {
                        CookieSyncManager.createInstance(LJ.LJII()).sync();
                    } catch (Exception unused) {
                    }
                    if (LIZIZ != null) {
                        String str3 = LIZIZ.token;
                        Context LJII = LJ().LJII();
                        if (LJII == null) {
                            LJII = u.LIZJ();
                        }
                        F9J.LIZIZ(LJII, 0, "com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY").edit().putString("TOKEN", str3).apply();
                    }
                }
            } catch (Q4W e) {
                LIZJ = C66416Q4u.LIZLLL(LoginClient.Result.Companion, LJ.pendingRequest, null, e.getMessage());
            }
        } else if (q4w instanceof C66406Q4k) {
            C66416Q4u c66416Q4u2 = LoginClient.Result.Companion;
            LoginClient.Request request3 = LJ.pendingRequest;
            c66416Q4u2.getClass();
            LIZJ = C66416Q4u.LIZ(request3, "User canceled log in.");
        } else {
            this.e2e = null;
            if (q4w == null) {
                message = null;
            } else {
                message = q4w.getMessage();
            }
            if (q4w instanceof C65834Psc) {
                FacebookRequestError requestError = ((C65834Psc) q4w).getRequestError();
                str = String.valueOf(requestError.errorCode);
                message = requestError.toString();
            } else {
                str = null;
            }
            C66416Q4u c66416Q4u3 = LoginClient.Result.Companion;
            LoginClient.Request request4 = LJ.pendingRequest;
            c66416Q4u3.getClass();
            LIZJ = C66416Q4u.LIZJ(request4, null, message, str);
        }
        if (!C66373Q3d.LJIJJ(this.e2e)) {
            LJIIIIZZ(this.e2e);
        }
        LJ.LJI(LIZJ);
    }
}
