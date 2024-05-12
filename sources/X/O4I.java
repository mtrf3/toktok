package X;

import X.C61311O4l;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes11.dex */
public final class O4I<E extends C61311O4l> {
    public volatile boolean LIZ;
    public final C61311O4l LIZIZ = new C61311O4l();

    public final void LIZ(O4B o4b) {
        o4b.LIZ.set(null);
        while (true) {
            C61311O4l c61311O4l = this.LIZIZ.LIZ.get();
            o4b.LIZ.set(c61311O4l);
            AtomicReference<C61311O4l> atomicReference = this.LIZIZ.LIZ;
            while (!atomicReference.compareAndSet(c61311O4l, o4b)) {
                if (atomicReference.get() != c61311O4l) {
                    break;
                }
            }
            return;
        }
    }
}
