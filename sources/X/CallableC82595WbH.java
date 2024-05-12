package X;

import com.zhiliaoapp.musically.R;
import java.util.concurrent.Callable;

/* renamed from: X.WbH, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class CallableC82595WbH<V> implements Callable {
    public final /* synthetic */ C82585Wb7 LJLIL;
    public final /* synthetic */ int LJLILLLLZI;

    public CallableC82595WbH(C82585Wb7 c82585Wb7, int i) {
        this.LJLIL = c82585Wb7;
        this.LJLILLLLZI = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C5S1 c5s1 = new C5S1(this.LJLIL.LJLIL);
        c5s1.LIZJ(R.string.bzl);
        c5s1.LJ();
        this.LJLIL.LJLZ(this.LJLILLLLZI, 3);
        return C76800UCe.LIZ;
    }
}
