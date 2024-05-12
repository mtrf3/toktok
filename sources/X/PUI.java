package X;

import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class PUI extends PUH {
    public long LJLILLLLZI;

    public PUI(PUJ puj) {
        super(puj);
    }

    @Override // X.PUJ
    public final void LLIIIL(C64533PUj source, long j) {
        o.LJIIJ(source, "source");
        this.LJLIL.LLIIIL(source, j);
        this.LJLILLLLZI += j;
    }
}
