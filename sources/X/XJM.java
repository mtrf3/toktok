package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AqS146S0200000_15;

/* loaded from: classes16.dex */
public final class XJM extends XJN {
    public final XJL<C76800UCe> LJLJJLL;
    public final /* synthetic */ XJO LJLJL;

    @Override // X.XJN
    public final void LJJII() {
        this.LJLJJLL.LJJIJIIJIL();
    }

    @Override // X.XJN
    public final boolean LJJIII() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = XJN.LJLJJL;
        Boolean bool = Boolean.FALSE;
        Boolean bool2 = Boolean.TRUE;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, bool, bool2)) {
            if (atomicReferenceFieldUpdater.get(this) != bool) {
                return false;
            }
        }
        if (this.LJLJJLL.LIZLLL(C76800UCe.LIZ, null, new AqS146S0200000_15(this.LJLJL, this, 54)) == null) {
            return false;
        }
        return true;
    }

    @Override // X.C84629XJh
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LockCont[");
        LIZ.append(this.LJLJJI);
        LIZ.append(", ");
        LIZ.append(this.LJLJJLL);
        LIZ.append("] for ");
        LIZ.append(this.LJLJL);
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XJM(XJO xjo, Object obj, XKS xks) {
        super(obj);
        this.LJLJL = xjo;
        this.LJLJJLL = xks;
    }
}
