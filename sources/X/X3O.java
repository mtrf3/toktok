package X;

import android.util.SparseArray;

/* loaded from: classes16.dex */
public final class X3O {
    public static volatile X3O LIZJ;
    public final SparseArray<Long> LIZ = new SparseArray<>();
    public final SparseArray<X3M> LIZIZ = new SparseArray<>();

    public static X3O LIZ() {
        if (LIZJ == null) {
            synchronized (X3O.class) {
                if (LIZJ == null) {
                    LIZJ = new X3O();
                }
            }
        }
        return LIZJ;
    }
}
