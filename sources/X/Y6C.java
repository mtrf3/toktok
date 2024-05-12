package X;

import java.util.Comparator;

/* loaded from: classes16.dex */
public final class Y6C implements Comparator<Y64> {
    public final /* synthetic */ Y64 LJLIL;
    public final /* synthetic */ Y6D LJLILLLLZI;

    public Y6C(Y6D y6d, Y64 y64) {
        this.LJLILLLLZI = y6d;
        this.LJLIL = y64;
    }

    @Override // java.util.Comparator
    public final int compare(Y64 y64, Y64 y642) {
        return Float.compare(this.LJLILLLLZI.LIZ(y642, this.LJLIL), this.LJLILLLLZI.LIZ(y64, this.LJLIL));
    }
}
