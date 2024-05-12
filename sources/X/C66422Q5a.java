package X;

import android.content.SharedPreferences;
import kotlin.jvm.internal.o;
import m43.u;

/* renamed from: X.Q5a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66422Q5a {
    public final SharedPreferences LIZ;

    public C66422Q5a() {
        SharedPreferences LIZIZ = F9J.LIZIZ(u.LIZJ(), 0, "com.facebook.AccessTokenManager.SharedPreferences");
        o.LJIIIIZZ(LIZIZ, "FacebookSdk.getApplicationContext()\n            .getSharedPreferences(SHARED_PREFERENCES_NAME, Context.MODE_PRIVATE)");
        this.LIZ = LIZIZ;
    }
}
