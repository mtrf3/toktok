package X;

import android.os.StrictMode;
import java.io.Closeable;

/* renamed from: X.FEr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38645FEr implements Closeable {
    public final StrictMode.ThreadPolicy LJLIL;
    public final StrictMode.VmPolicy LJLILLLLZI;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        StrictMode.ThreadPolicy threadPolicy = this.LJLIL;
        if (threadPolicy != null) {
            StrictMode.setThreadPolicy(threadPolicy);
        }
        StrictMode.VmPolicy vmPolicy = this.LJLILLLLZI;
        if (vmPolicy != null) {
            StrictMode.setVmPolicy(vmPolicy);
        }
    }

    public C38645FEr(StrictMode.ThreadPolicy threadPolicy, StrictMode.VmPolicy vmPolicy) {
        this.LJLIL = threadPolicy;
        this.LJLILLLLZI = vmPolicy;
    }
}
