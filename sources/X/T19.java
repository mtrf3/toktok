package X;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes13.dex */
public final class T19 extends AbstractC73946T0k {
    public static final P3I LIZJ = new P3I("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.newthread-priority", 5).intValue())));
    public final ThreadFactory LIZIZ = LIZJ;

    @Override // X.AbstractC73946T0k
    public final AbstractC73945T0j LIZ() {
        return new C73956T0u(this.LIZIZ);
    }
}
