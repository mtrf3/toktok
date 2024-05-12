package X;

import android.os.Build;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: X.Pfg, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C65032Pfg extends C65030Pfe {
    @Override // X.C65030Pfe
    public final Executor LIZIZ() {
        return new E1S();
    }

    @Override // X.C65030Pfe
    public final List<? extends AbstractC65015PfP> LIZJ() {
        if (Build.VERSION.SDK_INT >= 24) {
            return Collections.singletonList(C65033Pfh.LIZ);
        }
        return Collections.emptyList();
    }

    @Override // X.C65030Pfe
    public final int LIZLLL() {
        if (Build.VERSION.SDK_INT >= 24) {
            return 1;
        }
        return 0;
    }

    @Override // X.C65030Pfe
    public final List<? extends AbstractC65025PfZ> LIZ(Executor executor) {
        if (executor != null) {
            C65034Pfi c65034Pfi = new C65034Pfi(executor);
            if (Build.VERSION.SDK_INT >= 24) {
                return Arrays.asList(C65035Pfj.LIZ, c65034Pfi);
            }
            return Collections.singletonList(c65034Pfi);
        }
        throw new AssertionError();
    }

    @Override // X.C65030Pfe
    public final boolean LJFF(Method method) {
        if (Build.VERSION.SDK_INT < 24) {
            return false;
        }
        return method.isDefault();
    }
}
