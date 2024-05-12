package X;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: X.Irk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47944Irk {
    public final ConcurrentHashMap<String, C47945Irl> LIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, String> LIZIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, String> LIZJ = new ConcurrentHashMap<>();
    public final ConcurrentLinkedQueue<String> LIZLLL = new ConcurrentLinkedQueue<>();

    public static C47944Irk LIZIZ() {
        return C47480IkG.LIZ;
    }

    public final long LIZ(String str) {
        C47945Irl c47945Irl;
        if (str != null && this.LIZ.containsKey(str) && (c47945Irl = this.LIZ.get(str)) != null) {
            return c47945Irl.LIZ.get();
        }
        return 0L;
    }

    public final void LIZJ(String str, String str2) {
        if (!this.LIZIZ.containsKey(str)) {
            this.LIZLLL.offer(str);
        }
        this.LIZIZ.put(str, str2);
        this.LIZJ.put(str2, str);
        int i = 0;
        while (this.LIZLLL.size() > 100) {
            String poll = this.LIZLLL.poll();
            if (poll != null) {
                String str3 = this.LIZIZ.get(poll);
                this.LIZ.remove(poll);
                this.LIZIZ.remove(poll);
                if (str3 != null) {
                    this.LIZJ.remove(str3);
                }
            }
            i++;
            if (i > 100 || poll == null) {
                return;
            }
        }
    }

    public final void LIZLLL(long j, String str) {
        C47945Irl c47945Irl;
        if (str == null) {
            return;
        }
        if (this.LIZ.containsKey(str)) {
            c47945Irl = this.LIZ.get(str);
            if (c47945Irl == null) {
                return;
            }
        } else {
            c47945Irl = new C47945Irl();
            this.LIZ.put(str, c47945Irl);
        }
        c47945Irl.LIZ.set(j);
    }
}
