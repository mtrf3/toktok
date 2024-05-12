package X;

import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XKP<T> extends XKZ<T> {
    public final Thread LJLJI;
    public final AbstractC78624UtQ LJLJJI;

    @Override // kotlinx.coroutines.JobSupport
    public final void LJJII(Object obj) {
        if (!o.LJ(C16880lQ.LLLLIIIILLL(), this.LJLJI)) {
            LockSupport.unpark(this.LJLJI);
        }
    }

    public XKP(MBA mba, Thread thread, AbstractC78624UtQ abstractC78624UtQ) {
        super(mba, true);
        this.LJLJI = thread;
        this.LJLJJI = abstractC78624UtQ;
    }
}
