package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.Str, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC73555Str<T> extends AtomicInteger implements InterfaceC73558Stu<T> {
    public static final long serialVersionUID = -1001730202384742097L;

    public abstract /* synthetic */ void clear();

    public abstract /* synthetic */ void dispose();

    public abstract /* synthetic */ boolean isDisposed();

    public abstract /* synthetic */ boolean isEmpty();

    public abstract /* synthetic */ T poll();

    public abstract /* synthetic */ int requestFusion(int i);

    @Override // X.InterfaceC73570Su6
    public final boolean offer(T t) {
        throw new UnsupportedOperationException("Should not be called");
    }

    public final boolean offer(T t, T t2) {
        throw new UnsupportedOperationException("Should not be called");
    }
}
