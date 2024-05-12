package X;

import android.content.IntentFilter;
import kotlin.jvm.internal.o;
import m43.u;

/* renamed from: X.J1s, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC48500J1s {
    public static final /* synthetic */ int LIZLLL = 0;
    public final C48498J1q LIZ;
    public final C10760bY LIZIZ;
    public boolean LIZJ;

    public abstract void LIZ();

    static {
        C16880lQ.LJLLJ(AbstractC48500J1s.class);
    }

    public AbstractC48500J1s() {
        Q4J.LJI();
        C48498J1q c48498J1q = new C48498J1q(this);
        this.LIZ = c48498J1q;
        C10760bY LIZ = C10760bY.LIZ(u.LIZJ());
        o.LJIIIIZZ(LIZ, "getInstance(FacebookSdk.getApplicationContext())");
        this.LIZIZ = LIZ;
        if (this.LIZJ) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
        LIZ.LIZIZ(c48498J1q, intentFilter);
        this.LIZJ = true;
    }
}
