package com.facebook.login;

import X.C16880lQ;
import X.C40700FyC;
import X.C61878OQg;
import X.C66373Q3d;
import X.C66416Q4u;
import X.EnumC66385Q3p;
import X.OQY;
import X.Q4R;
import X.Q4W;
import X.Q54;
import X.Q55;
import X.Q56;
import X.Q57;
import X.Q59;
import X.Q5A;
import Y.IDCreatorS54S0000000_11;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.AccessToken;
import com.facebook.AuthenticationToken;
import com.facebook.login.LoginClient;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.o;
import m43.u;

/* loaded from: classes12.dex */
public final class GetTokenLoginMethodHandler extends LoginMethodHandler {
    public Q55 getTokenClient;
    public final String nameForLogging;
    public static final Q59 Companion = new Q59();
    public static final Parcelable.Creator<GetTokenLoginMethodHandler> CREATOR = new IDCreatorS54S0000000_11(22);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public final void LIZIZ() {
        Q55 q55 = this.getTokenClient;
        if (q55 == null) {
            return;
        }
        q55.LJLJJI = false;
        q55.LJLJI = null;
        this.getTokenClient = null;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public final String LJI() {
        return this.nameForLogging;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetTokenLoginMethodHandler(Parcel source) {
        super(source);
        o.LJIIIZ(source, "source");
        this.nameForLogging = "get_token";
    }

    @Override // com.facebook.login.LoginMethodHandler
    public final int LJIIL(LoginClient.Request request) {
        boolean z;
        Context LJII = LJ().LJII();
        if (LJII == null) {
            LJII = u.LIZJ();
        }
        Q55 q55 = new Q55(LJII, request);
        this.getTokenClient = q55;
        synchronized (q55) {
            if (!q55.LJLJJI) {
                int i = q55.LJLJLLL;
                if (!C40700FyC.LIZ(Q5A.class)) {
                    try {
                        if (Q5A.LIZ.LJIIJJI(Q5A.LIZIZ, new int[]{i}).LIZIZ == -1) {
                        }
                    } catch (Throwable unused) {
                    }
                }
                Intent LJFF = Q5A.LJFF(q55.LJLIL);
                if (LJFF != null) {
                    q55.LJLJJI = true;
                    C16880lQ.LLLJL(q55.LJLIL, LJFF, q55, 1);
                    z = true;
                } else {
                    z = false;
                }
            }
            z = false;
        }
        if (o.LJ(Boolean.valueOf(z), Boolean.FALSE)) {
            return 0;
        }
        Q56 q56 = LJ().backgroundProcessingListener;
        if (q56 != null) {
            q56.LIZ();
        }
        Q57 q57 = new Q57(this, request);
        Q55 q552 = this.getTokenClient;
        if (q552 != null) {
            q552.LJLJI = q57;
        }
        return 1;
    }

    public GetTokenLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
        this.nameForLogging = "get_token";
    }

    public final void LJIILJJIL(Bundle result, LoginClient.Request request) {
        LoginClient.Result LIZLLL;
        AccessToken LIZ;
        String str;
        String string;
        AuthenticationToken authenticationToken;
        o.LJIIIZ(request, "request");
        o.LJIIIZ(result, "result");
        try {
            Q4R q4r = LoginMethodHandler.Companion;
            EnumC66385Q3p enumC66385Q3p = EnumC66385Q3p.FACEBOOK_APPLICATION_SERVICE;
            String str2 = request.applicationId;
            q4r.getClass();
            LIZ = Q4R.LIZ(result, enumC66385Q3p, str2);
            str = request.nonce;
            string = result.getString("com.facebook.platform.extra.ID_TOKEN");
        } catch (Q4W e) {
            LIZLLL = C66416Q4u.LIZLLL(LoginClient.Result.Companion, LJ().pendingRequest, null, e.getMessage());
        }
        if (string != null && string.length() != 0 && str != null && str.length() != 0) {
            try {
                authenticationToken = new AuthenticationToken(string, str);
                LoginClient.Result.Companion.getClass();
                LIZLLL = C66416Q4u.LIZIZ(request, LIZ, authenticationToken);
                LJ().LJI(LIZLLL);
            } catch (Exception e2) {
                throw new Q4W(e2.getMessage());
            }
        }
        authenticationToken = null;
        LoginClient.Result.Companion.getClass();
        LIZLLL = C66416Q4u.LIZIZ(request, LIZ, authenticationToken);
        LJ().LJI(LIZLLL);
    }

    public static void LJIILIIL(Bundle bundle, GetTokenLoginMethodHandler this$0, LoginClient.Request request) {
        o.LJIIIZ(this$0, "this$0");
        o.LJIIIZ(request, "$request");
        Q55 q55 = this$0.getTokenClient;
        if (q55 != null) {
            q55.LJLJI = null;
        }
        this$0.getTokenClient = null;
        Q56 q56 = this$0.LJ().backgroundProcessingListener;
        if (q56 != null) {
            q56.LIZIZ();
        }
        if (bundle != null) {
            List stringArrayList = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
            if (stringArrayList == null) {
                stringArrayList = C61878OQg.INSTANCE;
            }
            Set set = request.permissions;
            if (set == null) {
                set = OQY.INSTANCE;
            }
            String string = bundle.getString("com.facebook.platform.extra.ID_TOKEN");
            if (set.contains("openid") && (string == null || string.length() == 0)) {
                this$0.LJ().LJIIL();
                return;
            }
            if (stringArrayList.containsAll(set)) {
                String string2 = bundle.getString("com.facebook.platform.extra.USER_ID");
                if (string2 == null || string2.length() == 0) {
                    Q56 q562 = this$0.LJ().backgroundProcessingListener;
                    if (q562 != null) {
                        q562.LIZ();
                    }
                    String string3 = bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN");
                    if (string3 != null) {
                        C66373Q3d.LJIIL(new Q54(bundle, this$0, request), string3);
                        return;
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalStateException("Required value was null.");
                    }
                }
                this$0.LJIILJJIL(bundle, request);
                return;
            }
            HashSet hashSet = new HashSet();
            for (Object obj : set) {
                if (!stringArrayList.contains(obj)) {
                    hashSet.add(obj);
                }
            }
            if (!hashSet.isEmpty()) {
                this$0.LIZ(TextUtils.join(",", hashSet), "new_permissions");
            }
            request.permissions = hashSet;
        }
        this$0.LJ().LJIIL();
    }
}
