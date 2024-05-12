package com.facebook.login;

import X.C47261Igj;
import X.C66416Q4u;
import X.EnumC66385Q3p;
import X.ORZ;
import X.Q4R;
import X.Q4W;
import android.os.Bundle;
import android.os.Parcel;
import com.facebook.AccessToken;
import com.facebook.AuthenticationToken;
import com.facebook.login.LoginClient;
import java.util.Set;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public abstract class NativeAppLoginMethodHandler extends LoginMethodHandler {
    public static final /* synthetic */ int LJLIL = 0;
    public final EnumC66385Q3p tokenSource;

    public EnumC66385Q3p LJIILJJIL() {
        return this.tokenSource;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeAppLoginMethodHandler(Parcel source) {
        super(source);
        o.LJIIIZ(source, "source");
        this.tokenSource = EnumC66385Q3p.FACEBOOK_APPLICATION_WEB;
    }

    public final void LJIILIIL(LoginClient.Result result) {
        if (result != null) {
            LJ().LJI(result);
        } else {
            LJ().LJIIL();
        }
    }

    public NativeAppLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
        this.tokenSource = EnumC66385Q3p.FACEBOOK_APPLICATION_WEB;
    }

    public final void LJIILLIIL(Bundle bundle, LoginClient.Request request) {
        try {
            Q4R q4r = LoginMethodHandler.Companion;
            Set<String> set = request.permissions;
            EnumC66385Q3p LJIILJJIL = LJIILJJIL();
            String str = request.applicationId;
            q4r.getClass();
            AccessToken LIZIZ = Q4R.LIZIZ(set, bundle, LJIILJJIL, str);
            AuthenticationToken LIZJ = Q4R.LIZJ(bundle, request.nonce);
            LoginClient.Result.Companion.getClass();
            LJIILIIL(C66416Q4u.LIZIZ(request, LIZIZ, LIZJ));
        } catch (Q4W e) {
            LJIILIIL(C66416Q4u.LIZLLL(LoginClient.Result.Companion, request, null, e.getMessage()));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x005d, code lost:
    
        if (r6 == null) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0070  */
    @Override // com.facebook.login.LoginMethodHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIIIZ(int r11, int r12, android.content.Intent r13) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.NativeAppLoginMethodHandler.LJIIIZ(int, int, android.content.Intent):boolean");
    }

    public final void LJIILL(LoginClient.Request request, String str, String str2, String str3) {
        if (str != null && o.LJ(str, "logged_out")) {
            CustomTabLoginMethodHandler.calledThroughLoggedOutAppSwitch = true;
            LJIILIIL(null);
        } else if (ORZ.LJLJJI(str, C47261Igj.LJJIJIIJI("service_disabled", "AndroidAuthKillSwitchException"))) {
            LJIILIIL(null);
        } else if (ORZ.LJLJJI(str, C47261Igj.LJJIJIIJI("access_denied", "OAuthAccessDeniedException"))) {
            LoginClient.Result.Companion.getClass();
            LJIILIIL(C66416Q4u.LIZ(request, null));
        } else {
            LoginClient.Result.Companion.getClass();
            LJIILIIL(C66416Q4u.LIZJ(request, str, str2, str3));
        }
    }
}
