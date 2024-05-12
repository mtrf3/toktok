package Y;

import X.C48824JEe;
import X.IG0;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public class ARunnableS9S0000100_8 implements Runnable {
    public final int $t;
    public long j0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        try {
            Object[] objArr = C48824JEe.LIZIZ;
            if (objArr != null) {
                Object obj = objArr[1];
                Object obj2 = objArr[3];
                if (obj != null || obj2 != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (this.j0 <= 0) {
                        this.j0 = currentTimeMillis;
                    }
                    if (currentTimeMillis - this.j0 >= 1000) {
                        this.j0 = currentTimeMillis;
                    }
                }
                C48824JEe.LIZJ();
                return;
            }
            o.LJIJI("callbackQueues");
            throw null;
        } catch (Throwable unused) {
        }
    }

    public ARunnableS9S0000100_8(int i) {
        this.$t = i;
    }

    public static final void run$0(ARunnableS9S0000100_8 aRunnableS9S0000100_8) {
        boolean LIZ;
        try {
            IG0.LIZLLL.storeLong("video_consume_time_name", aRunnableS9S0000100_8.j0);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS9S0000100_8 aRunnableS9S0000100_8) {
        boolean LIZ;
        try {
            aRunnableS9S0000100_8.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS9S0000100_8(long j, int i) {
        this.$t = i;
        this.j0 = j;
    }
}
