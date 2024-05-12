package X;

import java.util.concurrent.Callable;

/* renamed from: X.VqQ, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class CallableC80986VqQ<V> implements Callable {
    public final /* synthetic */ C80985VqP LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ boolean LJLJJL;

    public CallableC80986VqQ(C80985VqP c80985VqP, String str, int i, long j, boolean z) {
        this.LJLIL = c80985VqP;
        this.LJLILLLLZI = str;
        this.LJLJI = i;
        this.LJLJJI = j;
        this.LJLJJL = z;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.LJLIL.LJ(this.LJLJI, this.LJLJJI, this.LJLILLLLZI, this.LJLJJL);
    }
}
