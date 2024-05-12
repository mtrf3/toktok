package X;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: X.IuP, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48109IuP {
    public final ConcurrentLinkedQueue<String> LIZ = new ConcurrentLinkedQueue<>();
    public final ConcurrentHashMap<String, C47456Ijs> LIZIZ = new ConcurrentHashMap<>();

    public final void LIZ(String str, C47456Ijs c47456Ijs) {
        if (str != null && !this.LIZIZ.containsKey(str)) {
            this.LIZIZ.put(str, c47456Ijs);
            this.LIZ.offer(str);
            int i = 0;
            while (this.LIZ.size() > 30) {
                String poll = this.LIZ.poll();
                if (poll != null) {
                    this.LIZIZ.remove(poll);
                }
                i++;
                if (i > 30 || poll == null) {
                    return;
                }
            }
        }
    }
}
