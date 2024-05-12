package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.Swt, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC73743Swt<T> extends AtomicInteger implements InterfaceC73632Sv6<T> {
    public static final long serialVersionUID = -6671519529404341862L;

    public abstract /* synthetic */ void cancel();

    public abstract /* synthetic */ void clear();

    public abstract /* synthetic */ boolean isEmpty();

    public abstract /* synthetic */ T poll();

    public abstract /* synthetic */ void request(long j);

    public abstract /* synthetic */ int requestFusion(int i);

    @Override // X.InterfaceC73570Su6
    public final boolean offer(T t) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public final boolean offer(T t, T t2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
