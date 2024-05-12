package X;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: X.PgD, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C65065PgD {
    public static final C65065PgD LIZ;
    public static final boolean LIZIZ;

    public Executor LIZIZ() {
        return null;
    }

    public void LIZLLL() {
    }

    public boolean LJ(Method method) {
        return false;
    }

    static {
        C65065PgD c65065PgD;
        boolean z;
        try {
            Class.forName("android.os.Build");
            c65065PgD = new C65066PgE();
        } catch (ClassNotFoundException unused) {
            c65065PgD = new C65065PgD();
        }
        LIZ = c65065PgD;
        try {
            new C65027Pfb();
            z = true;
        } catch (NoClassDefFoundError unused2) {
            z = false;
        }
        LIZIZ = z;
    }

    public List<? extends AbstractC65022PfW> LIZJ() {
        return Collections.emptyList();
    }

    public List<? extends AbstractC65069PgH> LIZ(Executor executor) {
        if (executor != null) {
            return Collections.singletonList(new C65067PgF(executor));
        }
        return Collections.singletonList(C65068PgG.LIZ);
    }
}
