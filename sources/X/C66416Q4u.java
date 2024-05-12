package X;

import android.text.TextUtils;
import com.facebook.AccessToken;
import com.facebook.AuthenticationToken;
import com.facebook.login.LoginClient;
import java.util.ArrayList;

/* renamed from: X.Q4u, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66416Q4u {
    public static LoginClient.Result LIZ(LoginClient.Request request, String str) {
        return new LoginClient.Result(request, Q53.CANCEL, null, str, null);
    }

    public static LoginClient.Result LIZIZ(LoginClient.Request request, AccessToken accessToken, AuthenticationToken authenticationToken) {
        return new LoginClient.Result(request, Q53.SUCCESS, accessToken, authenticationToken, null, null);
    }

    public static LoginClient.Result LIZJ(LoginClient.Request request, String str, String str2, String str3) {
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            arrayList.add(str);
        }
        if (str2 != null) {
            arrayList.add(str2);
        }
        return new LoginClient.Result(request, Q53.ERROR, null, TextUtils.join(": ", arrayList), str3);
    }

    public static /* synthetic */ LoginClient.Result LIZLLL(C66416Q4u c66416Q4u, LoginClient.Request request, String str, String str2) {
        c66416Q4u.getClass();
        return LIZJ(request, str, str2, null);
    }
}
