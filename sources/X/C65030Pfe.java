package X;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: X.Pfe, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C65030Pfe {
    public static final C65030Pfe LIZ;

    public Executor LIZIZ() {
        return null;
    }

    public int LIZLLL() {
        return 0;
    }

    public boolean LJFF(Method method) {
        return false;
    }

    static {
        C65030Pfe c65030Pfe;
        try {
            try {
                Class.forName("android.os.Build");
                c65030Pfe = new C65032Pfg();
            } catch (ClassNotFoundException unused) {
                c65030Pfe = new C65030Pfe();
            }
        } catch (ClassNotFoundException unused2) {
            Class.forName("java.util.Optional");
            c65030Pfe = new C65031Pff();
        }
        LIZ = c65030Pfe;
    }

    public List<? extends AbstractC65015PfP> LIZJ() {
        return Collections.emptyList();
    }

    public List<? extends AbstractC65025PfZ> LIZ(Executor executor) {
        return Collections.singletonList(new C65034Pfi(executor));
    }

    public Object LJ(Method method, Class<?> cls, Object obj, Object... objArr) {
        throw new UnsupportedOperationException();
    }
}
