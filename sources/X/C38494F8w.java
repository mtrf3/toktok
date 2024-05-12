package X;

import com.bytedance.helios.api.consumer.ApmEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.F8w, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38494F8w extends F9E implements AutoCloseable {
    public final long LJLIL;
    public final String LJLILLLLZI;
    public long LJLJI;
    public final boolean LJLJJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLILLLLZI, Long.valueOf(this.LJLJI), Boolean.valueOf(this.LJLJJI)};
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        long currentTimeMillis = System.currentTimeMillis() - this.LJLIL;
        this.LJLJI = currentTimeMillis;
        if (this.LJLJJI || currentTimeMillis > 1) {
            C66059PwF.LIZIZ(ApmEvent.LJ(currentTimeMillis, this.LJLILLLLZI));
        }
    }

    public C38494F8w(boolean z, String methodName, int i) {
        methodName = (i & 1) != 0 ? "" : methodName;
        z = (i & 4) != 0 ? false : z;
        o.LJIIIZ(methodName, "methodName");
        this.LJLILLLLZI = methodName;
        this.LJLJI = 0L;
        this.LJLJJI = z;
        this.LJLIL = System.currentTimeMillis();
    }
}
