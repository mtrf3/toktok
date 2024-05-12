package X;

import Y.IDhS107S0100000_14;
import java.util.concurrent.Future;
import kotlin.jvm.internal.o;

/* renamed from: X.WQl, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class RunnableC82267WQl implements Runnable, Comparable<Object> {
    public final C79155V4t LJLIL;
    public final int LJLILLLLZI;
    public final InterfaceC48038ItG<C79155V4t, C82273WQr> LJLJI;
    public final C73849Syb<C82263WQh> LJLJJI;
    public volatile boolean LJLJJL;
    public volatile Future<?> LJLJJLL;

    public RunnableC82267WQl() {
        throw null;
    }

    public final void LIZJ() {
        this.LJLJJI.onNext(new C82263WQh(EnumC82257WQb.START, this.LJLIL, null, null));
        try {
            try {
                this.LJLJJI.onNext(new C82263WQh(EnumC82257WQb.SUCCESS, this.LJLIL, this.LJLJI.apply(this.LJLIL), null));
            } catch (Exception e) {
                this.LJLJJI.onNext(new C82263WQh(EnumC82257WQb.FAILED, this.LJLIL, null, e));
            }
        } finally {
            this.LJLJJI.onComplete();
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
        if (other instanceof RunnableC82267WQl) {
            boolean z = this.LJLJJL;
            RunnableC82267WQl runnableC82267WQl = (RunnableC82267WQl) other;
            boolean z2 = runnableC82267WQl.LJLJJL;
            int i = this.LJLILLLLZI;
            int i2 = runnableC82267WQl.LJLILLLLZI;
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

    public RunnableC82267WQl(C79155V4t request, int i, IDhS107S0100000_14 iDhS107S0100000_14, C73849Syb c73849Syb, boolean z) {
        o.LJIIIZ(request, "request");
        this.LJLIL = request;
        this.LJLILLLLZI = i;
        this.LJLJI = iDhS107S0100000_14;
        this.LJLJJI = c73849Syb;
        this.LJLJJL = z;
        this.LJLJJLL = null;
    }
}
