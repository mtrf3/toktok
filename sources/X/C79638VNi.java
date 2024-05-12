package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.VNi, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79638VNi implements OCW {
    public final /* synthetic */ AtomicInteger LIZ;
    public final /* synthetic */ OCW LIZIZ = null;

    public final void LIZ() {
        OCW ocw;
        if (this.LIZ.decrementAndGet() == 0 && (ocw = this.LIZIZ) != null) {
            ((C79638VNi) ocw).LIZ();
        }
    }

    public C79638VNi(AtomicInteger atomicInteger) {
        this.LIZ = atomicInteger;
    }
}
