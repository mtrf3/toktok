package X;

import android.content.SharedPreferences;
import kotlin.jvm.internal.o;
import m43.u;

/* loaded from: classes12.dex */
public final class Q4L {
    public final SharedPreferences LIZ;

    public Q4L() {
        SharedPreferences LIZIZ = F9J.LIZIZ(u.LIZJ(), 0, "com.facebook.AccessTokenManager.SharedPreferences");
        o.LJIIIIZZ(LIZIZ, "FacebookSdk.getApplicationContext()\n              .getSharedPreferences(\n                  AccessTokenManager.SHARED_PREFERENCES_NAME, Context.MODE_PRIVATE)");
        new Q4M();
        this.LIZ = LIZIZ;
    }
}
