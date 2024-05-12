package X;

import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MBB implements MBA, Serializable {
    public static final MBB INSTANCE = new MBB();
    public static final long serialVersionUID = 0;

    @Override // X.MBA
    public <R> R fold(R r, InterfaceC88471Ynr<? super R, ? super MBD, ? extends R> operation) {
        o.LJIIIZ(operation, "operation");
        return r;
    }

    @Override // X.MBA
    public <E extends MBD> E get(InterfaceC48698J9i<E> key) {
        o.LJIIIZ(key, "key");
        return null;
    }

    public int hashCode() {
        return 0;
    }

    @Override // X.MBA
    public MBA minusKey(InterfaceC48698J9i<?> key) {
        o.LJIIIZ(key, "key");
        return this;
    }

    @Override // X.MBA
    public MBA plus(MBA context) {
        o.LJIIIZ(context, "context");
        return context;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }

    private final Object readResolve() {
        return INSTANCE;
    }
}
