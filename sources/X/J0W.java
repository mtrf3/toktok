package X;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes9.dex */
public final class J0W<T> implements Callable<List<T>> {
    public final int LJLIL = 16;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return new ArrayList(this.LJLIL);
    }
}
