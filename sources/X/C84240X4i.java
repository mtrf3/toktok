package X;

import android.os.Handler;
import java.net.InetAddress;
import java.util.List;

/* renamed from: X.X4i, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84240X4i {
    public final X40<String, X5A> LIZ = new X40<>(4, 16, false);
    public final Handler LIZIZ = new Handler(X4X.LIZ.getLooper());
    public final Handler LIZJ = new Handler(PS1.LIZ);

    public final void LIZ(String str, List<InetAddress> list) {
        synchronized (this.LIZ) {
            X5A x5a = this.LIZ.get(str);
            if (x5a == null) {
                x5a = new X5A();
                this.LIZ.put(str, x5a);
            }
            x5a.LIZ = list;
            x5a.LIZIZ = System.currentTimeMillis();
        }
    }
}
