package X;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes16.dex */
public final class XS1 extends AtomicLong implements XS2 {
    public XS1() {
    }

    @Override // X.XS2
    public final void LIZ() {
        getAndIncrement();
    }

    public /* synthetic */ XS1(int i) {
        this();
    }

    @Override // X.XS2
    public final void add(long j) {
        getAndAdd(j);
    }
}
