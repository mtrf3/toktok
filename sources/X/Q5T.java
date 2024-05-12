package X;

import android.content.Intent;
import com.facebook.AuthenticationToken;
import com.facebook.AuthenticationTokenManager;
import kotlin.jvm.internal.o;
import m43.u;
import org.json.JSONException;

/* loaded from: classes12.dex */
public final class Q5T {
    public static void LIZ(AuthenticationToken authenticationToken) {
        C66440Q5s c66440Q5s = AuthenticationTokenManager.LIZLLL;
        AuthenticationTokenManager authenticationTokenManager = AuthenticationTokenManager.LJ;
        if (authenticationTokenManager == null) {
            synchronized (c66440Q5s) {
                authenticationTokenManager = AuthenticationTokenManager.LJ;
                if (authenticationTokenManager == null) {
                    C10760bY LIZ = C10760bY.LIZ(u.LIZJ());
                    o.LJIIIIZZ(LIZ, "getInstance(applicationContext)");
                    authenticationTokenManager = new AuthenticationTokenManager(LIZ, new C66423Q5b());
                    AuthenticationTokenManager.LJ = authenticationTokenManager;
                }
            }
        }
        AuthenticationToken authenticationToken2 = authenticationTokenManager.LIZJ;
        authenticationTokenManager.LIZJ = authenticationToken;
        if (authenticationToken != null) {
            C66423Q5b c66423Q5b = authenticationTokenManager.LIZIZ;
            c66423Q5b.getClass();
            try {
                c66423Q5b.LIZ.edit().putString("com.facebook.AuthenticationManager.CachedAuthenticationToken", authenticationToken.LIZ().toString()).apply();
            } catch (JSONException unused) {
            }
        } else {
            authenticationTokenManager.LIZIZ.LIZ.edit().remove("com.facebook.AuthenticationManager.CachedAuthenticationToken").apply();
            C16880lQ.LLIILII(u.LIZJ());
        }
        if (authenticationToken2 == null) {
            if (authenticationToken == null) {
                return;
            }
        } else if (o.LJ(authenticationToken2, authenticationToken)) {
            return;
        }
        Intent intent = new Intent(u.LIZJ(), (Class<?>) AuthenticationTokenManager.CurrentAuthenticationTokenChangedBroadcastReceiver.class);
        intent.setAction("com.facebook.sdk.ACTION_CURRENT_AUTHENTICATION_TOKEN_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_AUTHENTICATION_TOKEN", authenticationToken2);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_AUTHENTICATION_TOKEN", authenticationToken);
        authenticationTokenManager.LIZ.LIZJ(intent);
    }
}
