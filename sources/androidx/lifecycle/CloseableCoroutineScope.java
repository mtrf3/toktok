package androidx.lifecycle;

import X.C79146V4k;
import X.InterfaceC70422pa;
import X.MBA;
import java.io.Closeable;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class CloseableCoroutineScope implements Closeable, InterfaceC70422pa {
    public final MBA coroutineContext;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        C79146V4k.LJIJ(getCoroutineContext(), null);
    }

    @Override // X.InterfaceC70422pa
    public MBA getCoroutineContext() {
        return this.coroutineContext;
    }

    public CloseableCoroutineScope(MBA context) {
        o.LJIIIZ(context, "context");
        this.coroutineContext = context;
    }
}
