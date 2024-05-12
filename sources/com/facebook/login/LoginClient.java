package com.facebook.login;

import X.ActivityC45651qj;
import X.AnonymousClass629;
import X.C113554cx;
import X.C188727au;
import X.C1AS;
import X.C221018lt;
import X.C40700FyC;
import X.C66373Q3d;
import X.C66382Q3m;
import X.C66416Q4u;
import X.C66444Q5w;
import X.C78928UyK;
import X.EnumC65839Psh;
import X.FMX;
import X.Q4J;
import X.Q4W;
import X.Q53;
import X.Q56;
import X.Q5F;
import X.Q5I;
import X.Q5O;
import X.Q5P;
import X.Q5V;
import X.Q5X;
import X.Q63;
import X.UPG;
import X.X1D;
import Y.IDCreatorS54S0000000_11;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.facebook.AccessToken;
import com.facebook.AuthenticationToken;
import com.facebook.CustomTabMainActivity;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;
import ujb.o;

/* loaded from: classes12.dex */
public class LoginClient implements Parcelable {
    public Q56 backgroundProcessingListener;
    public boolean checkedInternetPermission;
    public int currentHandler;
    public Map<String, String> extraData;
    public Fragment fragment;
    public LoginMethodHandler[] handlersToTry;
    public Map<String, String> loggingExtras;
    public Q5F loginLogger;
    public int numActivitiesReturned;
    public int numTotalIntentsFired;
    public Q63 onCompletedListener;
    public Request pendingRequest;
    public static final Q5X Companion = new Q5X();
    public static final Parcelable.Creator<LoginClient> CREATOR = new IDCreatorS54S0000000_11(27);

    /* loaded from: classes12.dex */
    public static final class Request implements Parcelable {
        public final String applicationId;
        public String authId;
        public String authType;
        public final String codeChallenge;
        public final EnumC65839Psh codeChallengeMethod;
        public final String codeVerifier;
        public final Q5V defaultAudience;
        public String deviceAuthTargetUserId;
        public String deviceRedirectUriString;
        public boolean isFamilyLogin;
        public boolean isRerequest;
        public final Q5O loginBehavior;
        public final Q5I loginTargetApp;
        public String messengerPageId;
        public final String nonce;
        public Set<String> permissions;
        public boolean resetMessengerState;
        public boolean shouldSkipAccountDeduplication;
        public static final C66444Q5w Companion = new C66444Q5w();
        public static final Parcelable.Creator<Request> CREATOR = new IDCreatorS54S0000000_11(25);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean LIZ() {
            for (String str : this.permissions) {
                if (str != null && (o.LJJJLIIL(str, "publish", false) || o.LJJJLIIL(str, "manage", false) || LoginManager.LJIIJ.contains(str))) {
                    return true;
                }
            }
            return false;
        }

        public Request(Parcel parcel) {
            Q5V q5v;
            boolean z;
            boolean z2;
            Q5I q5i;
            boolean z3;
            EnumC65839Psh valueOf;
            String readString = parcel.readString();
            Q4J.LJFF(readString, "loginBehavior");
            this.loginBehavior = Q5O.valueOf(readString);
            ArrayList arrayList = new ArrayList();
            parcel.readStringList(arrayList);
            this.permissions = new HashSet(arrayList);
            String readString2 = parcel.readString();
            if (readString2 != null) {
                q5v = Q5V.valueOf(readString2);
            } else {
                q5v = Q5V.NONE;
            }
            this.defaultAudience = q5v;
            String readString3 = parcel.readString();
            Q4J.LJFF(readString3, "applicationId");
            this.applicationId = readString3;
            String readString4 = parcel.readString();
            Q4J.LJFF(readString4, "authId");
            this.authId = readString4;
            if (parcel.readByte() != 0) {
                z = true;
            } else {
                z = false;
            }
            this.isRerequest = z;
            this.deviceRedirectUriString = parcel.readString();
            String readString5 = parcel.readString();
            Q4J.LJFF(readString5, "authType");
            this.authType = readString5;
            this.deviceAuthTargetUserId = parcel.readString();
            this.messengerPageId = parcel.readString();
            if (parcel.readByte() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.resetMessengerState = z2;
            String readString6 = parcel.readString();
            if (readString6 != null) {
                q5i = Q5I.valueOf(readString6);
            } else {
                q5i = Q5I.FACEBOOK;
            }
            this.loginTargetApp = q5i;
            if (parcel.readByte() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.isFamilyLogin = z3;
            this.shouldSkipAccountDeduplication = parcel.readByte() != 0;
            String readString7 = parcel.readString();
            Q4J.LJFF(readString7, "nonce");
            this.nonce = readString7;
            this.codeVerifier = parcel.readString();
            this.codeChallenge = parcel.readString();
            String readString8 = parcel.readString();
            if (readString8 == null) {
                valueOf = null;
            } else {
                valueOf = EnumC65839Psh.valueOf(readString8);
            }
            this.codeChallengeMethod = valueOf;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            String name;
            kotlin.jvm.internal.o.LJIIIZ(dest, "dest");
            dest.writeString(this.loginBehavior.name());
            dest.writeStringList(new ArrayList(this.permissions));
            dest.writeString(this.defaultAudience.name());
            dest.writeString(this.applicationId);
            dest.writeString(this.authId);
            dest.writeByte(this.isRerequest ? (byte) 1 : (byte) 0);
            dest.writeString(this.deviceRedirectUriString);
            dest.writeString(this.authType);
            dest.writeString(this.deviceAuthTargetUserId);
            dest.writeString(this.messengerPageId);
            dest.writeByte(this.resetMessengerState ? (byte) 1 : (byte) 0);
            dest.writeString(this.loginTargetApp.name());
            dest.writeByte(this.isFamilyLogin ? (byte) 1 : (byte) 0);
            dest.writeByte(this.shouldSkipAccountDeduplication ? (byte) 1 : (byte) 0);
            dest.writeString(this.nonce);
            dest.writeString(this.codeVerifier);
            dest.writeString(this.codeChallenge);
            EnumC65839Psh enumC65839Psh = this.codeChallengeMethod;
            if (enumC65839Psh == null) {
                name = null;
            } else {
                name = enumC65839Psh.name();
            }
            dest.writeString(name);
        }

        public Request(Q5O loginBehavior, Set<String> set, Q5V defaultAudience, String authType, String str, String str2, Q5I q5i, String str3, String str4, String str5, EnumC65839Psh enumC65839Psh) {
            kotlin.jvm.internal.o.LJIIIZ(loginBehavior, "loginBehavior");
            kotlin.jvm.internal.o.LJIIIZ(defaultAudience, "defaultAudience");
            kotlin.jvm.internal.o.LJIIIZ(authType, "authType");
            this.loginBehavior = loginBehavior;
            this.permissions = set == null ? new HashSet<>() : set;
            this.defaultAudience = defaultAudience;
            this.authType = authType;
            this.applicationId = str;
            this.authId = str2;
            this.loginTargetApp = q5i == null ? Q5I.FACEBOOK : q5i;
            if (str3 == null || str3.length() == 0) {
                this.nonce = AnonymousClass629.LIZ("randomUUID().toString()");
            } else {
                this.nonce = str3;
            }
            this.codeVerifier = str4;
            this.codeChallenge = str5;
            this.codeChallengeMethod = enumC65839Psh;
        }
    }

    public final void LJIIL() {
        LoginMethodHandler LJIIIIZZ = LJIIIIZZ();
        if (LJIIIIZZ != null) {
            LJIIJ(LJIIIIZZ.LJI(), "skipped", null, null, LJIIIIZZ.methodLoggingExtras);
        }
        LoginMethodHandler[] loginMethodHandlerArr = this.handlersToTry;
        if (loginMethodHandlerArr != null) {
            while (true) {
                int i = this.currentHandler;
                if (i >= loginMethodHandlerArr.length - 1) {
                    break;
                }
                this.currentHandler = i + 1;
                LoginMethodHandler LJIIIIZZ2 = LJIIIIZZ();
                if (LJIIIIZZ2 != null) {
                    if ((LJIIIIZZ2 instanceof WebViewLoginMethodHandler) && !LIZLLL()) {
                        LIZIZ("no_internet_permission", "1", false);
                    } else {
                        Request request = this.pendingRequest;
                        if (request == null) {
                            continue;
                        } else {
                            int LJIIL = LJIIIIZZ2.LJIIL(request);
                            this.numActivitiesReturned = 0;
                            if (LJIIL > 0) {
                                Q5F LJIIIZ = LJIIIZ();
                                String str = request.authId;
                                String LJI = LJIIIIZZ2.LJI();
                                if (!C40700FyC.LIZ(LJIIIZ)) {
                                    try {
                                        Q5P.LIZ(str).putString("3_method", LJI);
                                        LJIIIZ.LIZIZ.getClass();
                                    } catch (Throwable unused) {
                                    }
                                }
                                this.numTotalIntentsFired = LJIIL;
                                return;
                            }
                            Q5F LJIIIZ2 = LJIIIZ();
                            String str2 = request.authId;
                            String LJI2 = LJIIIIZZ2.LJI();
                            if (!C40700FyC.LIZ(LJIIIZ2)) {
                                try {
                                    Q5P.LIZ(str2).putString("3_method", LJI2);
                                    LJIIIZ2.LIZIZ.getClass();
                                } catch (Throwable unused2) {
                                }
                            }
                            LIZIZ("not_tried", LJIIIIZZ2.LJI(), true);
                        }
                    }
                }
            }
        }
        Request request2 = this.pendingRequest;
        if (request2 != null) {
            LIZ(this, C66416Q4u.LIZLLL(Result.Companion, request2, "Login attempt failed.", null));
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean LIZLLL() {
        String string;
        if (this.checkedInternetPermission) {
            return true;
        }
        ActivityC45651qj LJII = LJII();
        if (LJII == null || LJII.checkCallingOrSelfPermission("android.permission.INTERNET") != 0) {
            ActivityC45651qj LJII2 = LJII();
            String str = null;
            if (LJII2 == null) {
                string = null;
            } else {
                string = LJII2.getString(R.string.dh1);
                str = LJII2.getString(R.string.dh0);
            }
            LIZ(this, C66416Q4u.LIZLLL(Result.Companion, this.pendingRequest, string, str));
            return false;
        }
        this.checkedInternetPermission = true;
        return true;
    }

    public final ActivityC45651qj LJII() {
        Fragment fragment = this.fragment;
        if (fragment == null) {
            return null;
        }
        return fragment.mo49getActivity();
    }

    public final LoginMethodHandler LJIIIIZZ() {
        LoginMethodHandler[] loginMethodHandlerArr;
        int i = this.currentHandler;
        if (i < 0 || (loginMethodHandlerArr = this.handlersToTry) == null) {
            return null;
        }
        return loginMethodHandlerArr[i];
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0014, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r1, r2) != false) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.Q5F LJIIIZ() {
        /*
            r4 = this;
            X.Q5F r3 = r4.loginLogger
            if (r3 == 0) goto L16
            boolean r0 = X.C40700FyC.LIZ(r3)
            r2 = 0
            if (r0 == 0) goto L36
        Lb:
            r1 = r2
        Lc:
            com.facebook.login.LoginClient$Request r0 = r4.pendingRequest
            if (r0 != 0) goto L33
        L10:
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r2)
            if (r0 != 0) goto L2f
        L16:
            X.Q5F r3 = new X.Q5F
            X.1qj r1 = r4.LJII()
            if (r1 != 0) goto L22
            android.content.Context r1 = m43.u.LIZJ()
        L22:
            com.facebook.login.LoginClient$Request r0 = r4.pendingRequest
            if (r0 != 0) goto L30
            java.lang.String r0 = m43.u.LIZLLL()
        L2a:
            r3.<init>(r1, r0)
            r4.loginLogger = r3
        L2f:
            return r3
        L30:
            java.lang.String r0 = r0.applicationId
            goto L2a
        L33:
            java.lang.String r2 = r0.applicationId
            goto L10
        L36:
            java.lang.String r1 = r3.LIZ     // Catch: java.lang.Throwable -> Lb
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.LoginClient.LJIIIZ():X.Q5F");
    }

    /* loaded from: classes12.dex */
    public static final class Result implements Parcelable {
        public final AuthenticationToken authenticationToken;
        public final Q53 code;
        public final String errorCode;
        public final String errorMessage;
        public Map<String, String> extraData;
        public Map<String, String> loggingExtras;
        public final Request request;
        public final AccessToken token;
        public static final C66416Q4u Companion = new C66416Q4u();
        public static final Parcelable.Creator<Result> CREATOR = new IDCreatorS54S0000000_11(26);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public Result(Parcel parcel) {
            String readString = parcel.readString();
            this.code = Q53.valueOf(readString == null ? "error" : readString);
            this.token = (AccessToken) parcel.readParcelable(AccessToken.class.getClassLoader());
            this.authenticationToken = (AuthenticationToken) parcel.readParcelable(AuthenticationToken.class.getClassLoader());
            this.errorMessage = parcel.readString();
            this.errorCode = parcel.readString();
            this.request = (Request) parcel.readParcelable(Request.class.getClassLoader());
            this.loggingExtras = C66373Q3d.LJJIIJ(parcel);
            this.extraData = C66373Q3d.LJJIIJ(parcel);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            kotlin.jvm.internal.o.LJIIIZ(dest, "dest");
            dest.writeString(this.code.name());
            dest.writeParcelable(this.token, i);
            dest.writeParcelable(this.authenticationToken, i);
            dest.writeString(this.errorMessage);
            dest.writeString(this.errorCode);
            dest.writeParcelable(this.request, i);
            C66373Q3d.LJJIIZ(dest, this.loggingExtras);
            C66373Q3d.LJJIIZ(dest, this.extraData);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Result(Request request, Q53 code, AccessToken accessToken, String str, String str2) {
            this(request, code, accessToken, null, str, str2);
            kotlin.jvm.internal.o.LJIIIZ(code, "code");
        }

        public Result(Request request, Q53 code, AccessToken accessToken, AuthenticationToken authenticationToken, String str, String str2) {
            kotlin.jvm.internal.o.LJIIIZ(code, "code");
            this.request = request;
            this.token = accessToken;
            this.authenticationToken = authenticationToken;
            this.errorMessage = str;
            this.code = code;
            this.errorCode = str2;
        }
    }

    public LoginClient(Parcel source) {
        Map<String, String> LJJLIL;
        LoginMethodHandler loginMethodHandler;
        kotlin.jvm.internal.o.LJIIIZ(source, "source");
        this.currentHandler = -1;
        Parcelable[] readParcelableArray = source.readParcelableArray(LoginMethodHandler.class.getClassLoader());
        readParcelableArray = readParcelableArray == null ? new Parcelable[0] : readParcelableArray;
        ArrayList arrayList = new ArrayList();
        int length = readParcelableArray.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            Parcelable parcelable = readParcelableArray[i];
            if ((parcelable instanceof LoginMethodHandler) && (loginMethodHandler = (LoginMethodHandler) parcelable) != null) {
                loginMethodHandler.loginClient = this;
                arrayList.add(loginMethodHandler);
            }
            i++;
        }
        Object[] array = arrayList.toArray(new LoginMethodHandler[0]);
        if (array != null) {
            this.handlersToTry = (LoginMethodHandler[]) array;
            this.currentHandler = source.readInt();
            this.pendingRequest = (Request) source.readParcelable(Request.class.getClassLoader());
            Map<String, String> LJJIIJ = C66373Q3d.LJJIIJ(source);
            if (LJJIIJ == null) {
                LJJLIL = null;
            } else {
                LJJLIL = C113554cx.LJJLIL(LJJIIJ);
            }
            this.loggingExtras = LJJLIL;
            Map<String, String> LJJIIJ2 = C66373Q3d.LJJIIJ(source);
            this.extraData = LJJIIJ2 != null ? C113554cx.LJJLIL(LJJIIJ2) : null;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public final void LJ(Result outcome) {
        kotlin.jvm.internal.o.LJIIIZ(outcome, "outcome");
        LoginMethodHandler LJIIIIZZ = LJIIIIZZ();
        if (LJIIIIZZ != null) {
            String LJI = LJIIIIZZ.LJI();
            LJIIJ(LJI, outcome.code.getLoggingValue(), outcome.errorMessage, outcome.errorCode, LJIIIIZZ.methodLoggingExtras);
            if (UPG.LJLLLL) {
                String loggingValue = outcome.code.getLoggingValue();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("method: ");
                LIZ.append(LJI);
                LIZ.append(", result: ");
                LIZ.append(loggingValue);
                C221018lt.LIZ("yjy", X1D.LIZIZ(LIZ));
                C188727au LIZ2 = C78928UyK.LIZ(LJI, "loginHandler", loggingValue, "resultCode");
                LIZ2.LJIIIZ("fb_login_method", LJI);
                LIZ2.LJIIIZ("fb_login_result", loggingValue);
                FMX.LJIIL("fb_login_method_track", LIZ2.LIZ);
            }
        }
        Map<String, String> map = this.loggingExtras;
        if (map != null) {
            outcome.loggingExtras = map;
        }
        Map<String, String> map2 = this.extraData;
        if (map2 != null) {
            outcome.extraData = map2;
        }
        this.handlersToTry = null;
        int i = -1;
        this.currentHandler = -1;
        this.pendingRequest = null;
        this.loggingExtras = null;
        this.numActivitiesReturned = 0;
        this.numTotalIntentsFired = 0;
        Q63 q63 = this.onCompletedListener;
        if (q63 == null) {
            return;
        }
        LoginFragment this$0 = (LoginFragment) ((C1AS) q63).LIZ;
        kotlin.jvm.internal.o.LJIIIZ(this$0, "this$0");
        this$0.LJLJI = null;
        if (outcome.code == Q53.CANCEL) {
            i = 0;
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.facebook.LoginFragment:Result", outcome);
        Intent intent = new Intent();
        intent.putExtras(bundle);
        ActivityC45651qj mo49getActivity = this$0.mo49getActivity();
        if (!this$0.isAdded() || mo49getActivity == null) {
            return;
        }
        mo49getActivity.setResult(i, intent);
        mo49getActivity.finish();
    }

    public final void LJI(Result outcome) {
        Result LIZIZ;
        kotlin.jvm.internal.o.LJIIIZ(outcome, "outcome");
        if (outcome.token != null) {
            AccessToken.Companion.getClass();
            if (C66382Q3m.LIZJ()) {
                if (outcome.token != null) {
                    AccessToken LIZIZ2 = C66382Q3m.LIZIZ();
                    AccessToken accessToken = outcome.token;
                    if (LIZIZ2 != null) {
                        try {
                            if (kotlin.jvm.internal.o.LJ(LIZIZ2.userId, accessToken.userId)) {
                                C66416Q4u c66416Q4u = Result.Companion;
                                Request request = this.pendingRequest;
                                AccessToken accessToken2 = outcome.token;
                                AuthenticationToken authenticationToken = outcome.authenticationToken;
                                c66416Q4u.getClass();
                                LIZIZ = C66416Q4u.LIZIZ(request, accessToken2, authenticationToken);
                                LIZ(this, LIZIZ);
                                return;
                            }
                        } catch (Exception e) {
                            LIZ(this, C66416Q4u.LIZLLL(Result.Companion, this.pendingRequest, "Caught exception", e.getMessage()));
                            return;
                        }
                    }
                    LIZIZ = C66416Q4u.LIZLLL(Result.Companion, this.pendingRequest, "User logged in as different Facebook user.", null);
                    LIZ(this, LIZIZ);
                    return;
                }
                throw new Q4W("Can't validate without a token");
            }
        }
        LIZ(this, outcome);
    }

    public LoginClient(Fragment fragment) {
        kotlin.jvm.internal.o.LJIIIZ(fragment, "fragment");
        this.currentHandler = -1;
        if (this.fragment == null) {
            this.fragment = fragment;
            return;
        }
        throw new Q4W("Can't set fragment once it is already set.");
    }

    public static void LIZ(LoginClient loginClient, Result result) {
        loginClient.LJ(result);
        UPG.LJLLLL = false;
        C221018lt.LIZ("yjy", "loging reset!");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        kotlin.jvm.internal.o.LJIIIZ(dest, "dest");
        dest.writeParcelableArray(this.handlersToTry, i);
        dest.writeInt(this.currentHandler);
        dest.writeParcelable(this.pendingRequest, i);
        C66373Q3d.LJJIIZ(dest, this.loggingExtras);
        C66373Q3d.LJJIIZ(dest, this.extraData);
    }

    public final void LIZIZ(String str, String str2, boolean z) {
        Map<String, String> map = this.loggingExtras;
        if (map == null) {
            map = new HashMap<>();
        }
        if (this.loggingExtras == null) {
            this.loggingExtras = map;
        }
        if (map.containsKey(str) && z) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append((Object) map.get(str));
            LIZ.append(',');
            LIZ.append(str2);
            str2 = X1D.LIZIZ(LIZ);
        }
        map.put(str, str2);
    }

    public final void LJIIJJI(int i, int i2, Intent intent) {
        this.numActivitiesReturned++;
        if (this.pendingRequest != null) {
            if (intent != null && intent.getBooleanExtra(CustomTabMainActivity.LJLJLLL, false)) {
                LJIIL();
                return;
            }
            LoginMethodHandler LJIIIIZZ = LJIIIIZZ();
            if (LJIIIIZZ != null) {
                if (!(LJIIIIZZ instanceof KatanaProxyLoginMethodHandler) || intent != null || this.numActivitiesReturned >= this.numTotalIntentsFired) {
                    LJIIIIZZ.LJIIIZ(i, i2, intent);
                }
            }
        }
    }

    public final void LJIIJ(String str, String str2, String str3, String str4, Map<String, String> map) {
        Request request = this.pendingRequest;
        if (request == null) {
            LJIIIZ().LIZ(str);
        }
        Q5F LJIIIZ = LJIIIZ();
        String str5 = request.authId;
        if (!C40700FyC.LIZ(LJIIIZ)) {
            try {
                Bundle LIZ = Q5P.LIZ(str5);
                if (str2 != null) {
                    LIZ.putString("2_result", str2);
                }
                if (str3 != null) {
                    LIZ.putString("5_error_message", str3);
                }
                if (str4 != null) {
                    LIZ.putString("4_error_code", str4);
                }
                if (map != null && (!map.isEmpty())) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        if (entry.getKey() != null) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    LIZ.putString("6_extras", new JSONObject(linkedHashMap).toString());
                }
                LIZ.putString("3_method", str);
                LJIIIZ.LIZIZ.getClass();
            } catch (Throwable unused) {
            }
        }
    }
}
