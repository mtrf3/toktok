package X;

import Y.ARunnableS48S0100000_12;

/* loaded from: classes13.dex */
public final class T1M extends AbstractC73946T0k {
    public final C60692Zt LIZIZ;
    public final /* synthetic */ T1N LIZJ;

    @Override // X.AbstractC73946T0k
    public final AbstractC73945T0j LIZ() {
        T1N t1n = this.LIZJ;
        synchronized (t1n.LIZIZ) {
            if (t1n.LIZIZ.get() < 1) {
                t1n.LIZIZ.incrementAndGet();
                t1n.LIZJ.submit(new ARunnableS48S0100000_12(t1n, 114));
            }
        }
        return new T1L(this.LIZIZ, this.LIZJ.LIZ);
    }

    public T1M(T1N t1n, C60692Zt c60692Zt) {
        this.LIZJ = t1n;
        this.LIZIZ = c60692Zt;
    }
}
