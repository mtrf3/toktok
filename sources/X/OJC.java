package X;

import Y.IDObjectS4S0101000_10;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OJC<T> implements InterfaceC1039145z<T>, OJ8<T> {
    public final InterfaceC1039145z<T> LIZ;
    public final int LIZIZ;

    @Override // X.OJ8
    public final InterfaceC1039145z take() {
        if (2 >= this.LIZIZ) {
            return this;
        }
        return new OJC(this.LIZ);
    }

    @Override // X.InterfaceC1039145z
    public final Iterator<T> iterator() {
        return new IDObjectS4S0101000_10(this, 3);
    }

    public OJC(InterfaceC1039145z sequence) {
        o.LJIIIZ(sequence, "sequence");
        this.LIZ = sequence;
        this.LIZIZ = 2;
    }
}
