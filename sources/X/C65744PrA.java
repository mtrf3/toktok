package X;

import java.util.Collections;

/* renamed from: X.PrA, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65744PrA<T> extends AbstractC65743Pr9<T> {
    public static final C65744PrA<Object> LJLIL = new C65744PrA<>();
    public static final long serialVersionUID = 0;

    @Override // X.AbstractC65743Pr9
    public final boolean equals(Object obj) {
        return obj == this;
    }

    @Override // X.AbstractC65743Pr9
    public final int hashCode() {
        return 2040732332;
    }

    @Override // X.AbstractC65743Pr9
    public final boolean isPresent() {
        return false;
    }

    @Override // X.AbstractC65743Pr9
    public final T orNull() {
        return null;
    }

    @Override // X.AbstractC65743Pr9
    public final String toString() {
        return "Optional.absent()";
    }

    @Override // X.AbstractC65743Pr9
    public final T get() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // X.AbstractC65743Pr9
    public final java.util.Set<T> asSet() {
        return Collections.emptySet();
    }

    private Object readResolve() {
        return LJLIL;
    }

    @Override // X.AbstractC65743Pr9
    public final T or(InterfaceC139745e6<? extends T> interfaceC139745e6) {
        T t = interfaceC139745e6.get();
        C76917UGr.LJII(t, "use Optional.orNull() instead of a Supplier that returns null");
        return t;
    }

    @Override // X.AbstractC65743Pr9
    public final <V> AbstractC65743Pr9<V> transform(InterfaceC65644PpY<? super T, V> interfaceC65644PpY) {
        interfaceC65644PpY.getClass();
        return AbstractC65743Pr9.absent();
    }

    @Override // X.AbstractC65743Pr9
    public final T or(T t) {
        C76917UGr.LJII(t, "use Optional.orNull() instead of Optional.or(null)");
        return t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC65743Pr9
    public final AbstractC65743Pr9<T> or(AbstractC65743Pr9<? extends T> abstractC65743Pr9) {
        abstractC65743Pr9.getClass();
        return abstractC65743Pr9;
    }
}
