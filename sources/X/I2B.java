package X;

import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class I2B extends F9E {
    public final I2A LJLIL;
    public final I2A LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI};
    }

    public I2B() {
        this(new I2A(0), new I2A(0));
    }

    public I2B(I2A from, I2A to) {
        o.LJIIIZ(from, "from");
        o.LJIIIZ(to, "to");
        this.LJLIL = from;
        this.LJLILLLLZI = to;
    }
}
