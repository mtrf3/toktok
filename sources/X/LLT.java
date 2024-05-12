package X;

import java.util.concurrent.Callable;

/* loaded from: classes10.dex */
public final class LLT<V> implements Callable {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;

    public LLT(String str, int i, boolean z) {
        this.LJLIL = str;
        this.LJLILLLLZI = i;
        this.LJLJI = z;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        LLQ llq = LLR.LJIIJ;
        if (llq != null) {
            llq.LJFF(this.LJLILLLLZI, this.LJLIL, this.LJLJI);
        }
        LLR.LJ.put(this.LJLIL, Integer.valueOf(this.LJLILLLLZI));
        return C76800UCe.LIZ;
    }
}
