package X;

import android.content.SharedPreferences;
import kotlin.jvm.internal.o;
import m43.u;

/* renamed from: X.Q5b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66423Q5b {
    public final SharedPreferences LIZ;

    public C66423Q5b() {
        SharedPreferences LIZIZ = F9J.LIZIZ(u.LIZJ(), 0, "com.facebook.AuthenticationTokenManager.SharedPreferences");
        o.LJIIIIZZ(LIZIZ, "FacebookSdk.getApplicationContext()\n              .getSharedPreferences(\n                  AuthenticationTokenManager.SHARED_PREFERENCES_NAME, Context.MODE_PRIVATE)");
        this.LIZ = LIZIZ;
    }
}
