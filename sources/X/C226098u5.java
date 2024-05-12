package X;

import java.util.concurrent.Executor;
import kotlin.jvm.internal.o;

/* renamed from: X.8u5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C226098u5 implements C5H3<InterfaceC70422pa> {
    public final Executor LJLIL;
    public C55259LmR LJLILLLLZI;

    @Override // X.C5H3
    public final boolean isInitialized() {
        return true;
    }

    @Override // X.C5H3
    public final InterfaceC70422pa getValue() {
        C55259LmR c55259LmR = this.LJLILLLLZI;
        if (c55259LmR == null) {
            Executor executor = this.LJLIL;
            C60741Nsf LJIIJJI = T2R.LJIIJJI();
            XI8 xi8 = null;
            if (!(executor instanceof ExecutorC120404o0) || executor == null) {
                xi8 = new XI8(executor);
            }
            c55259LmR = new C55259LmR(LJIIJJI.plus(xi8));
            this.LJLILLLLZI = c55259LmR;
        }
        return c55259LmR;
    }

    public C226098u5(Executor executor) {
        o.LJIIIZ(executor, "executor");
        this.LJLIL = executor;
    }
}
