package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.T0i, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class RunnableC73944T0i implements Runnable {
    public final Runnable LJLIL;
    public final C73616Suq LJLILLLLZI;
    public final long LJLJI;
    public long LJLJJI;
    public long LJLJJL;
    public long LJLJJLL;
    public final /* synthetic */ AbstractC73945T0j LJLJL;

    public final void LIZ() {
        long j;
        this.LJLIL.run();
        if (!this.LJLILLLLZI.isDisposed()) {
            AbstractC73945T0j abstractC73945T0j = this.LJLJL;
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            abstractC73945T0j.getClass();
            long LIZ = AbstractC73945T0j.LIZ(timeUnit);
            long j2 = AbstractC73946T0k.LIZ;
            long j3 = LIZ + j2;
            long j4 = this.LJLJJL;
            if (j3 >= j4) {
                long j5 = this.LJLJI;
                if (LIZ < j4 + j5 + j2) {
                    long j6 = this.LJLJJLL;
                    long j7 = this.LJLJJI + 1;
                    this.LJLJJI = j7;
                    j = (j7 * j5) + j6;
                    this.LJLJJL = LIZ;
                    this.LJLILLLLZI.replace(this.LJLJL.LIZJ(this, j - LIZ, timeUnit));
                }
            }
            long j8 = this.LJLJI;
            j = LIZ + j8;
            long j9 = this.LJLJJI + 1;
            this.LJLJJI = j9;
            this.LJLJJLL = j - (j8 * j9);
            this.LJLJJL = LIZ;
            this.LJLILLLLZI.replace(this.LJLJL.LIZJ(this, j - LIZ, timeUnit));
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC73944T0i(AbstractC73945T0j abstractC73945T0j, long j, Runnable runnable, long j2, C73616Suq c73616Suq, long j3) {
        this.LJLJL = abstractC73945T0j;
        this.LJLIL = runnable;
        this.LJLILLLLZI = c73616Suq;
        this.LJLJI = j3;
        this.LJLJJL = j2;
        this.LJLJJLL = j;
    }
}
