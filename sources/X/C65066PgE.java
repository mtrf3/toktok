package X;

import android.os.Build;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: X.PgE, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C65066PgE extends C65065PgD {
    @Override // X.C65065PgD
    public final void LIZLLL() {
    }

    @Override // X.C65065PgD
    public final Executor LIZIZ() {
        return new E1R();
    }

    @Override // X.C65065PgD
    public final List<? extends AbstractC65022PfW> LIZJ() {
        return Collections.emptyList();
    }

    @Override // X.C65065PgD
    public final List<? extends AbstractC65069PgH> LIZ(Executor executor) {
        if (executor != null) {
            return Collections.singletonList(new C65067PgF(executor));
        }
        throw new AssertionError();
    }

    @Override // X.C65065PgD
    public final boolean LJ(Method method) {
        if (Build.VERSION.SDK_INT < 24) {
            return false;
        }
        return method.isDefault();
    }
}
