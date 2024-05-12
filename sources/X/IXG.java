package X;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class IXG implements InterfaceC152975zR {
    public final AtomicReference<String> LIZ = new AtomicReference<>(null);

    @Override // X.InterfaceC152975zR
    public final String LIZ() {
        return this.LIZ.get();
    }

    @Override // X.InterfaceC152975zR
    public final void LIZIZ(String cachePath) {
        o.LJIIIZ(cachePath, "cachePath");
        this.LIZ.set(cachePath);
    }
}
