package X;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes8.dex */
public final class H35<V> implements Callable {
    public final /* synthetic */ C43421H2j LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ float LJLJJI;

    public H35(C43421H2j c43421H2j, int i, int i2, float f) {
        this.LJLIL = c43421H2j;
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
        this.LJLJJI = f;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        List<String> list = this.LJLIL.LJJ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("type:");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(" ext:");
        LIZ.append(this.LJLJI);
        LIZ.append(" f:");
        LIZ.append(this.LJLJJI);
        ((ArrayList) list).add(X1D.LIZIZ(LIZ));
        return null;
    }
}
