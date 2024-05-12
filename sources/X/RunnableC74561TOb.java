package X;

import java.util.concurrent.Future;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.TOb, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class RunnableC74561TOb<KEY, RESULT> implements Runnable, Comparable<Object> {
    public final C73849Syb<TO8> LJLIL;
    public final KEY LJLILLLLZI;
    public final int LJLJI;
    public final RTU<KEY, InterfaceC88472Yns<Integer, C76800UCe>, RESULT> LJLJJI;
    public volatile boolean LJLJJL;
    public volatile Future<?> LJLJJLL;

    public RunnableC74561TOb() {
        throw null;
    }

    public final void LIZJ() {
        this.LJLIL.onNext(new TO8(EnumC74565TOf.START, this.LJLILLLLZI, null, null));
        try {
            try {
                this.LJLIL.onNext(new TO8(EnumC74565TOf.SUCCESS, this.LJLILLLLZI, this.LJLJJI.apply(this.LJLILLLLZI, new AqS178S0100000_12((RunnableC74561TOb) this, 593)), null));
            } catch (Exception e) {
                this.LJLIL.onNext(new TO8(EnumC74565TOf.FAILED, this.LJLILLLLZI, null, e));
            }
        } finally {
            this.LJLIL.onComplete();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZJ();
        } finally {
            if (LIZ) {
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object other) {
        o.LJIIIZ(other, "other");
        if (other instanceof RunnableC74561TOb) {
            boolean z = this.LJLJJL;
            RunnableC74561TOb runnableC74561TOb = (RunnableC74561TOb) other;
            boolean z2 = runnableC74561TOb.LJLJJL;
            int i = this.LJLJI;
            int i2 = runnableC74561TOb.LJLJI;
            if (z == z2) {
                return o.LJIIJJI(i, i2);
            }
            if (z) {
                return -1;
            }
            return 1;
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RunnableC74561TOb(Object obj, int i, C74562TOc c74562TOc, boolean z) {
        this.LJLILLLLZI = obj;
        this.LJLJI = i;
        this.LJLJJI = c74562TOc;
        this.LJLJJL = z;
        this.LJLJJLL = null;
        this.LJLIL = new C73849Syb<>();
    }
}
