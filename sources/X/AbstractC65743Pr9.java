package X;

import java.io.Serializable;

/* renamed from: X.Pr9, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC65743Pr9<T> implements Serializable {
    public static final long serialVersionUID = 0;

    public abstract java.util.Set<T> asSet();

    public abstract boolean equals(Object obj);

    public abstract T get();

    public abstract int hashCode();

    public abstract boolean isPresent();

    public abstract AbstractC65743Pr9<T> or(AbstractC65743Pr9<? extends T> abstractC65743Pr9);

    public abstract T or(InterfaceC139745e6<? extends T> interfaceC139745e6);

    public abstract T or(T t);

    public abstract T orNull();

    public abstract String toString();

    public abstract <V> AbstractC65743Pr9<V> transform(InterfaceC65644PpY<? super T, V> interfaceC65644PpY);

    public static <T> AbstractC65743Pr9<T> absent() {
        return C65744PrA.LJLIL;
    }

    public static <T> AbstractC65743Pr9<T> fromNullable(T t) {
        if (t == null) {
            return absent();
        }
        return new C65742Pr8(t);
    }

    public static <T> AbstractC65743Pr9<T> of(T t) {
        t.getClass();
        return new C65742Pr8(t);
    }

    public static <T> Iterable<T> presentInstances(Iterable<? extends AbstractC65743Pr9<? extends T>> iterable) {
        iterable.getClass();
        return new C65745PrB(iterable);
    }
}
