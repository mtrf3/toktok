package X;

import java.util.concurrent.Future;

/* loaded from: classes12.dex */
public final class P8D {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3 */
    public static <V> V LIZ(Future<V> future) {
        boolean z = false;
        V v = future;
        while (true) {
            try {
                v = (V) ((Future) v).get();
                break;
            } catch (InterruptedException unused) {
                z = true;
                v = v;
            } catch (Throwable th) {
                if (z) {
                    C16880lQ.LLLLIIIILLL().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            C16880lQ.LLLLIIIILLL().interrupt();
        }
        return v;
    }
}
