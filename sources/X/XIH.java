package X;

import kotlin.jvm.internal.o;
import kotlinx.coroutines.EventLoopImplBase;

/* loaded from: classes16.dex */
public final class XIH extends XJB {
    public final XJL<C76800UCe> LJLJJI;
    public final /* synthetic */ EventLoopImplBase LJLJJL;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            this.LJLJJI.LJIJJ(this.LJLJJL, C76800UCe.LIZ);
        } finally {
            if (LIZ) {
            }
        }
    }

    @Override // X.XJB
    public final String toString() {
        return o.LJIILLIIL(this.LJLJJI, super.toString());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public XIH(EventLoopImplBase eventLoopImplBase, long j, XJL<? super C76800UCe> xjl) {
        super(j);
        this.LJLJJL = eventLoopImplBase;
        this.LJLJJI = xjl;
    }
}
