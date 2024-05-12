package X;

import java.util.LinkedList;

/* loaded from: classes12.dex */
public final class PDV {
    public final LinkedList<PDW> LIZ = new LinkedList<>();
    public volatile boolean LIZIZ = false;

    public final void LIZ(String str, String str2) {
        if (this.LIZIZ) {
            return;
        }
        synchronized (this.LIZ) {
            if (this.LIZ.size() > 40) {
                this.LIZ.poll();
            }
            this.LIZ.add(new PDW(str, str2));
        }
    }
}
