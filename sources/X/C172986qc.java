package X;

import android.os.SystemClock;
import kotlin.jvm.internal.o;

/* renamed from: X.6qc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C172986qc {
    public volatile boolean LIZ;

    public final void LIZ(String libName) {
        o.LJIIIZ(libName, "libName");
        if (!this.LIZ) {
            synchronized (this) {
                if (!this.LIZ) {
                    SystemClock.uptimeMillis();
                    C16880lQ.LLJJJIL(libName);
                    this.LIZ = true;
                }
            }
        }
    }
}
