package com.facebook.login;

import X.AnonymousClass003;
import X.AnonymousClass007;
import X.AnonymousClass629;
import X.C16880lQ;
import X.C37349ElF;
import X.C40700FyC;
import X.C65838Psg;
import X.C66382Q3m;
import X.C66393Q3x;
import X.C66424Q5c;
import X.C66426Q5e;
import X.C66429Q5h;
import X.C77275UUl;
import X.EnumC65839Psh;
import X.F9J;
import X.InterfaceC66438Q5q;
import X.OHQ;
import X.ORZ;
import X.Q4J;
import X.Q4W;
import X.Q53;
import X.Q5F;
import X.Q5G;
import X.Q5I;
import X.Q5L;
import X.Q5N;
import X.Q5O;
import X.Q5P;
import X.Q5R;
import X.Q5T;
import X.Q5U;
import X.Q5V;
import X.Q6A;
import X.Q6B;
import X.Q6C;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.facebook.AccessToken;
import com.facebook.AuthenticationToken;
import com.facebook.FacebookActivity;
import com.facebook.Profile;
import com.facebook.login.LoginClient;
import com.facebook.login.LoginManager;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.internal.o;
import m43.u;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class LoginManager {
    public static final C66429Q5h LJIIIZ = new C66429Q5h();
    public static final Set<String> LJIIJ = C77275UUl.LJIIIIZZ("ads_management", "create_event", "rsvp_event");
    public static volatile LoginManager LJIIJJI;
    public final SharedPreferences LIZJ;
    public String LJ;
    public boolean LJFF;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public Q5O LIZ = Q5O.NATIVE_WITH_FALLBACK;
    public Q5V LIZIZ = Q5V.FRIENDS;
    public String LIZLLL = "rerequest";
    public Q5I LJI = Q5I.FACEBOOK;

    static {
        o.LJIIIIZZ(LoginManager.class.toString(), "LoginManager::class.java.toString()");
    }

    public final void LIZLLL() {
        AccessToken.Companion.getClass();
        C66393Q3x.LJFF.LIZ().LIZJ(null, true);
        AuthenticationToken.Companion.getClass();
        Q5T.LIZ(null);
        Profile.Companion.getClass();
        Q5L.LIZLLL.LIZ().LIZ(null, true);
        SharedPreferences.Editor edit = this.LIZJ.edit();
        edit.putBoolean("express_login_allowed", false);
        edit.apply();
    }

    public LoginManager() {
        Q4J.LJI();
        SharedPreferences LIZIZ = F9J.LIZIZ(u.LIZJ(), 0, "com.facebook.loginManager");
        o.LJIIIIZZ(LIZIZ, "getApplicationContext().getSharedPreferences(PREFERENCE_LOGIN_MANAGER, Context.MODE_PRIVATE)");
        this.LIZJ = LIZIZ;
        if (u.LJIIJJI && Q5G.LIZ() != null) {
            AnonymousClass003.LIZ(u.LIZJ(), "com.android.chrome", new Q5N());
            Context LIZJ = u.LIZJ();
            String packageName = u.LIZJ().getPackageName();
            if (packageName == null) {
                return;
            }
            final Context LLLLL = C16880lQ.LLLLL(LIZJ);
            try {
                AnonymousClass003.LIZ(LLLLL, packageName, new AnonymousClass007() { // from class: X.17K
                    @Override // android.content.ServiceConnection
                    public final void onServiceDisconnected(ComponentName componentName) {
                    }

                    @Override // X.AnonymousClass007
                    public final void onCustomTabsServiceConnected(ComponentName componentName, AnonymousClass003 anonymousClass003) {
                        anonymousClass003.getClass();
                        try {
                            anonymousClass003.LIZ.LLZLLIL(0L);
                        } catch (RemoteException unused) {
                        }
                        LLLLL.unbindService(this);
                    }
                });
            } catch (SecurityException unused) {
            }
        }
    }

    public final LoginClient.Request LIZ(C37349ElF c37349ElF) {
        String str;
        EnumC65839Psh enumC65839Psh = EnumC65839Psh.S256;
        try {
            str = C65838Psg.LIZ(c37349ElF.LIZJ, enumC65839Psh);
        } catch (Q4W unused) {
            enumC65839Psh = EnumC65839Psh.PLAIN;
            str = c37349ElF.LIZJ;
        }
        LoginClient.Request request = new LoginClient.Request(this.LIZ, ORZ.LLJJ(c37349ElF.LIZ), this.LIZIZ, this.LIZLLL, u.LIZLLL(), AnonymousClass629.LIZ("randomUUID().toString()"), this.LJI, c37349ElF.LIZIZ, c37349ElF.LIZJ, str, enumC65839Psh);
        AccessToken.Companion.getClass();
        request.isRerequest = C66382Q3m.LIZJ();
        request.messengerPageId = this.LJ;
        request.resetMessengerState = this.LJFF;
        request.isFamilyLogin = this.LJII;
        request.shouldSkipAccountDeduplication = this.LJIIIIZZ;
        return request;
    }

    public final void LJFF(InterfaceC66438Q5q interfaceC66438Q5q, LoginClient.Request request) {
        Q5F LIZ = C66424Q5c.LIZ.LIZ(interfaceC66438Q5q.LIZ());
        if (LIZ != null && !C40700FyC.LIZ(LIZ)) {
            try {
                Bundle LIZ2 = Q5P.LIZ(request.authId);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("login_behavior", request.loginBehavior.toString());
                    LoginClient.Companion.getClass();
                    jSONObject.put("request_code", Q5U.Login.toRequestCode());
                    jSONObject.put(OHQ.LIZIZ, TextUtils.join(",", request.permissions));
                    jSONObject.put("default_audience", request.defaultAudience.toString());
                    jSONObject.put("isReauthorize", request.isRerequest);
                    String str = LIZ.LIZJ;
                    if (str != null) {
                        jSONObject.put("facebookVersion", str);
                    }
                    Q5I q5i = request.loginTargetApp;
                    if (q5i != null) {
                        jSONObject.put("target_app", q5i.toString());
                    }
                    LIZ2.putString("6_extras", jSONObject.toString());
                } catch (JSONException unused) {
                }
                LIZ.LIZIZ.getClass();
            } catch (Throwable unused2) {
            }
        }
        Q6A q6a = Q6B.LIZIZ;
        Q5U q5u = Q5U.Login;
        q6a.LIZ(q5u.toRequestCode(), new Q6C() { // from class: X.Q5j
            @Override // X.Q6C
            public final boolean LIZ(int i, Intent intent) {
                LoginManager this$0 = LoginManager.this;
                o.LJIIIZ(this$0, "this$0");
                this$0.LJ(i, intent, null);
                return true;
            }
        });
        Intent intent = new Intent();
        intent.setClass(u.LIZJ(), FacebookActivity.class);
        intent.setAction(request.loginBehavior.toString());
        Bundle bundle = new Bundle();
        bundle.putParcelable("request", request);
        intent.putExtra("com.facebook.LoginFragment:Request", bundle);
        if (u.LIZJ().getPackageManager().resolveActivity(intent, 0) != null) {
            try {
                LoginClient.Companion.getClass();
                interfaceC66438Q5q.startActivityForResult(intent, q5u.toRequestCode());
                return;
            } catch (ActivityNotFoundException unused3) {
                if (0 != 0) {
                    return;
                }
            }
        }
        Q4W q4w = new Q4W("Log in attempt failed: FacebookActivity could not be started. Please make sure you added FacebookActivity to the AndroidManifest.");
        LIZIZ(interfaceC66438Q5q.LIZ(), Q53.ERROR, null, q4w, false, request);
        throw q4w;
    }

    public final void LIZJ(C66426Q5e c66426Q5e, Collection<String> collection, String str) {
        LoginClient.Request LIZ = LIZ(new C37349ElF(collection));
        if (str != null) {
            LIZ.authId = str;
        }
        LJFF(new Q5R(c66426Q5e), LIZ);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        if (r5 == false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(int r13, android.content.Intent r14, X.Q6L r15) {
        /*
            Method dump skipped, instructions count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.LoginManager.LJ(int, android.content.Intent, X.Q6L):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0095, code lost:
    
        if (r6 != null) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(android.content.Context r7, X.Q53 r8, java.util.Map r9, X.Q4W r10, boolean r11, com.facebook.login.LoginClient.Request r12) {
        /*
            X.Q5c r0 = X.C66424Q5c.LIZ
            X.Q5F r2 = r0.LIZ(r7)
            if (r2 != 0) goto L9
            return
        L9:
            if (r12 != 0) goto L1b
        Lc:
            java.lang.Class<X.Q5F> r0 = X.Q5F.class
            boolean r0 = X.C40700FyC.LIZ(r0)
            if (r0 == 0) goto L15
        L14:
            return
        L15:
            java.lang.String r0 = ""
            r2.LIZ(r0)     // Catch: java.lang.Throwable -> L14
            goto L14
        L1b:
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            if (r11 == 0) goto L32
            java.lang.String r1 = "1"
        L24:
            java.lang.String r0 = "try_login_activity"
            r4.put(r0, r1)
            java.lang.String r5 = r12.authId
            boolean r0 = X.C40700FyC.LIZ(r2)
            if (r0 == 0) goto L35
            goto L14
        L32:
            java.lang.String r1 = "0"
            goto L24
        L35:
            android.os.Bundle r7 = X.Q5P.LIZ(r5)     // Catch: java.lang.Throwable -> L14
            if (r8 == 0) goto L45
            java.lang.String r1 = "2_result"
            java.lang.String r0 = r8.getLoggingValue()     // Catch: java.lang.Throwable -> L14
            r7.putString(r1, r0)     // Catch: java.lang.Throwable -> L14
        L45:
            r6 = 0
            if (r10 != 0) goto L49
            goto L58
        L49:
            java.lang.String r0 = r10.getMessage()     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto L58
            java.lang.String r1 = "5_error_message"
            java.lang.String r0 = r10.getMessage()     // Catch: java.lang.Throwable -> L14
            r7.putString(r1, r0)     // Catch: java.lang.Throwable -> L14
        L58:
            boolean r0 = r4.isEmpty()     // Catch: java.lang.Throwable -> L14
            r3 = 1
            r0 = r0 ^ 1
            if (r0 == 0) goto L66
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L14
            r6.<init>(r4)     // Catch: java.lang.Throwable -> L14
        L66:
            if (r9 == 0) goto L95
            if (r6 != 0) goto L6f
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L14
            r6.<init>()     // Catch: java.lang.Throwable -> L14
        L6f:
            java.util.Set r0 = r9.entrySet()     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L95
            java.util.Iterator r4 = r0.iterator()     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L95
        L77:
            boolean r0 = r4.hasNext()     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L95
            if (r0 == 0) goto L97
            java.lang.Object r0 = r4.next()     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L95
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L95
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L95
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L95
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L95
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L95
            if (r1 == 0) goto L77
            r6.put(r1, r0)     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L95
            goto L77
        L95:
            if (r6 == 0) goto La0
        L97:
            java.lang.String r1 = "6_extras"
            java.lang.String r0 = r6.toString()     // Catch: java.lang.Throwable -> L14
            r7.putString(r1, r0)     // Catch: java.lang.Throwable -> L14
        La0:
            X.Q5z r0 = r2.LIZIZ     // Catch: java.lang.Throwable -> L14
            r0.getClass()     // Catch: java.lang.Throwable -> L14
            X.Q53 r0 = X.Q53.SUCCESS     // Catch: java.lang.Throwable -> L14
            if (r8 != r0) goto L14
            boolean r0 = X.C40700FyC.LIZ(r2)     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto Lb1
            goto L14
        Lb1:
            android.os.Bundle r1 = X.Q5P.LIZ(r5)     // Catch: java.lang.Throwable -> L14
            Y.IDRunnableS0S0201000 r4 = new Y.IDRunnableS0S0201000     // Catch: java.lang.Throwable -> L14
            r0 = 7
            r4.<init>(r3, r2, r1, r0)     // Catch: java.lang.Throwable -> L14
            java.util.concurrent.ScheduledExecutorService r3 = X.Q5F.LIZLLL     // Catch: java.lang.Throwable -> L14
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L14
            r0 = 5
            r3.schedule(r4, r0, r2)     // Catch: java.lang.Throwable -> L14
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.LoginManager.LIZIZ(android.content.Context, X.Q53, java.util.Map, X.Q4W, boolean, com.facebook.login.LoginClient$Request):void");
    }
}
