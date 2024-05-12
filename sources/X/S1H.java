package X;

import java.util.concurrent.Callable;

/* loaded from: classes13.dex */
public final class S1H<V> implements Callable {
    public final /* synthetic */ S1D LJLIL;
    public final /* synthetic */ C7F9 LJLILLLLZI;
    public final /* synthetic */ S1F LJLJI;

    public S1H(S1D s1d, C7F9 c7f9, S1F s1f) {
        this.LJLIL = s1d;
        this.LJLILLLLZI = c7f9;
        this.LJLJI = s1f;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        this.LJLIL.LJI().LJIIL(this.LJLJI, this.LJLILLLLZI);
        return C76800UCe.LIZ;
    }
}
