package X;

import com.facebook.login.LoginManager;
import kotlin.jvm.internal.o;

/* renamed from: X.Q5h, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66429Q5h {
    public final LoginManager LIZ() {
        if (LoginManager.LJIIJJI == null) {
            synchronized (this) {
                LoginManager.LJIIJJI = new LoginManager();
            }
        }
        LoginManager loginManager = LoginManager.LJIIJJI;
        if (loginManager != null) {
            return loginManager;
        }
        o.LJIJI("instance");
        throw null;
    }
}
