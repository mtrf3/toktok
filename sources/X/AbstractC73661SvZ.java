package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.SvZ, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC73661SvZ<T> extends AtomicReference<T> implements InterfaceC92693kP {
    public static final long serialVersionUID = 6537757548749041217L;

    public abstract void LIZ(T t);

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        T andSet;
        if (get() != null && (andSet = getAndSet(null)) != null) {
            LIZ(andSet);
        }
    }

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        if (get() == null) {
            return true;
        }
        return false;
    }

    public AbstractC73661SvZ(T t) {
        super(t);
    }
}
