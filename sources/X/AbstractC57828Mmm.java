package X;

import X.InterfaceC57927MoN;
import kotlin.jvm.internal.o;

/* renamed from: X.Mmm, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC57828Mmm<T extends InterfaceC57927MoN> {
    public final T LIZ;
    public final int LIZIZ;

    public final int hashCode() {
        return this.LIZ.getElementId().hashCode() + this.LIZIZ;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AbstractC57828Mmm)) {
            return false;
        }
        AbstractC57828Mmm abstractC57828Mmm = (AbstractC57828Mmm) obj;
        if (abstractC57828Mmm.LIZIZ != this.LIZIZ || !o.LJ(this.LIZ.getElementId(), abstractC57828Mmm.LIZ.getElementId())) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC57828Mmm(InterfaceC57927MoN interfaceC57927MoN, int i) {
        this.LIZ = interfaceC57927MoN;
        this.LIZIZ = i;
    }
}
