package X;

import java.util.ArrayDeque;
import java.util.Queue;

/* loaded from: classes16.dex */
public class XA9 {
    public final Queue<XAA> LIZ = new ArrayDeque();

    public final XAA LIZ() {
        XAA xaa;
        synchronized (this.LIZ) {
            xaa = (XAA) ((ArrayDeque) this.LIZ).poll();
        }
        if (xaa == null) {
            return new XAA();
        }
        return xaa;
    }

    public final void LIZIZ(XAA xaa) {
        synchronized (this.LIZ) {
            if (((ArrayDeque) this.LIZ).size() < 10) {
                ((ArrayDeque) this.LIZ).offer(xaa);
            }
        }
    }
}
