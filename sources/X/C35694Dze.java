package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Dze, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35694Dze<T, Y> {
    public final LinkedHashMap<T, Y> LIZ = new LinkedHashMap<>(100, 0.75f, true);
    public int LIZJ = 0;
    public final int LIZIZ = 1000;

    public final void LIZ() {
        int i = this.LIZIZ;
        synchronized (this) {
            while (this.LIZJ > i) {
                Map.Entry<T, Y> next = this.LIZ.entrySet().iterator().next();
                next.getValue();
                this.LIZJ--;
                this.LIZ.remove(next.getKey());
            }
        }
    }

    public final synchronized Object LIZIZ(C37241EjV c37241EjV) {
        return this.LIZ.get(c37241EjV);
    }

    public final synchronized void LIZJ(C37241EjV c37241EjV, Object obj) {
        if (1 >= this.LIZIZ) {
            return;
        }
        Y put = this.LIZ.put(c37241EjV, obj);
        int i = this.LIZJ + 1;
        this.LIZJ = i;
        if (put != null) {
            this.LIZJ = i - 1;
        }
        LIZ();
    }
}
