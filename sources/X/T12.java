package X;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes13.dex */
public final class T12 {
    public final int LIZ;
    public final T13[] LIZIZ;
    public long LIZJ;

    public final T13 LIZ() {
        int i = this.LIZ;
        if (i == 0) {
            return C73958T0w.LJFF;
        }
        T13[] t13Arr = this.LIZIZ;
        long j = this.LIZJ;
        this.LIZJ = 1 + j;
        return t13Arr[(int) (j % i)];
    }

    public T12(int i, ThreadFactory threadFactory) {
        this.LIZ = i;
        this.LIZIZ = new T13[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.LIZIZ[i2] = new T13(threadFactory);
        }
    }
}
