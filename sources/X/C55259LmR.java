package X;

import java.io.Closeable;
import kotlin.jvm.internal.o;

/* renamed from: X.LmR, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55259LmR implements Closeable, InterfaceC70422pa {
    public final MBA LJLIL;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C79146V4k.LJIJ(this.LJLIL, null);
    }

    @Override // X.InterfaceC70422pa
    public final MBA getCoroutineContext() {
        return this.LJLIL;
    }

    public C55259LmR(MBA context) {
        o.LJIIIZ(context, "context");
        this.LJLIL = context;
    }
}
