package X;

import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OJL<T> implements InterfaceC1039145z<T> {
    public final InterfaceC65784Pro<T> LIZ;
    public final InterfaceC88472Yns<T, T> LIZIZ;

    @Override // X.InterfaceC1039145z
    public final Iterator<T> iterator() {
        return new OJK(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OJL(InterfaceC65784Pro<? extends T> interfaceC65784Pro, InterfaceC88472Yns<? super T, ? extends T> getNextValue) {
        o.LJIIIZ(getNextValue, "getNextValue");
        this.LIZ = interfaceC65784Pro;
        this.LIZIZ = getNextValue;
    }
}
