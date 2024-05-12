package X;

import androidx.fragment.app.Fragment;
import defpackage.i0;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;

/* renamed from: X.Llz, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class CallableC55231Llz implements Callable<InterfaceC55235Lm3> {
    public final Object LJLIL;
    public final String LJLILLLLZI;

    @Override // java.util.concurrent.Callable
    public final InterfaceC55235Lm3 call() {
        Object obj = this.LJLIL;
        if (obj instanceof ActivityC45651qj) {
            C55239Lm7 c55239Lm7 = new C55239Lm7((ActivityC45651qj) this.LJLIL, i0.LJFF("activity_", this.LJLILLLLZI));
            c55239Lm7.getTree();
            return c55239Lm7;
        }
        if (obj instanceof Fragment) {
            C55241Lm9 c55241Lm9 = new C55241Lm9((Fragment) this.LJLIL, i0.LJFF("fragment_", this.LJLILLLLZI));
            c55241Lm9.getTree();
            return c55241Lm9;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("do not support ");
        LIZ.append(this.LJLIL);
        LIZ.append(" yet");
        throw new UnsupportedOperationException(X1D.LIZIZ(LIZ));
    }

    public CallableC55231Llz(Object host, String str) {
        o.LJIIIZ(host, "host");
        this.LJLIL = host;
        this.LJLILLLLZI = str;
    }
}
