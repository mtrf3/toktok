package X;

import java.util.concurrent.Callable;

/* loaded from: classes12.dex */
public final class QX6<V> implements Callable {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI = false;

    public QX6(String str) {
        this.LJLIL = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return QX5.LIZ(this.LJLIL, this.LJLILLLLZI);
    }
}
