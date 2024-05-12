package X;

import java.util.concurrent.Callable;

/* renamed from: X.Hu1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class CallableC45537Hu1<V> implements Callable {
    public final /* synthetic */ C45501HtR LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    public CallableC45537Hu1(C45501HtR c45501HtR, long j, int i) {
        this.LJLIL = c45501HtR;
        this.LJLILLLLZI = j;
        this.LJLJI = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        this.LJLIL.LLJLL(this.LJLJI, this.LJLILLLLZI);
        return C76800UCe.LIZ;
    }
}
