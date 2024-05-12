package X;

import java.util.Collections;

/* renamed from: X.Pr8, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65742Pr8<T> extends AbstractC65743Pr9<T> {
    public static final long serialVersionUID = 0;
    public final T LJLIL;

    @Override // X.AbstractC65743Pr9
    public final boolean isPresent() {
        return true;
    }

    @Override // X.AbstractC65743Pr9
    public final java.util.Set<T> asSet() {
        return Collections.singleton(this.LJLIL);
    }

    @Override // X.AbstractC65743Pr9
    public final int hashCode() {
        return this.LJLIL.hashCode() + 1502476572;
    }

    @Override // X.AbstractC65743Pr9
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Optional.of(");
        LIZ.append(this.LJLIL);
        LIZ.append(")");
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.AbstractC65743Pr9
    public final T get() {
        return this.LJLIL;
    }

    @Override // X.AbstractC65743Pr9
    public final T orNull() {
        return this.LJLIL;
    }

    public C65742Pr8(T t) {
        this.LJLIL = t;
    }

    @Override // X.AbstractC65743Pr9
    public final boolean equals(Object obj) {
        if (obj instanceof C65742Pr8) {
            return this.LJLIL.equals(((C65742Pr8) obj).LJLIL);
        }
        return false;
    }

    @Override // X.AbstractC65743Pr9
    public final T or(T t) {
        C76917UGr.LJII(t, "use Optional.orNull() instead of Optional.or(null)");
        return this.LJLIL;
    }

    @Override // X.AbstractC65743Pr9
    public final <V> AbstractC65743Pr9<V> transform(InterfaceC65644PpY<? super T, V> interfaceC65644PpY) {
        V apply = interfaceC65644PpY.apply(this.LJLIL);
        C76917UGr.LJII(apply, "the Function passed to Optional.transform() must not return null.");
        return new C65742Pr8(apply);
    }

    @Override // X.AbstractC65743Pr9
    public final T or(InterfaceC139745e6<? extends T> interfaceC139745e6) {
        interfaceC139745e6.getClass();
        return this.LJLIL;
    }

    @Override // X.AbstractC65743Pr9
    public final AbstractC65743Pr9<T> or(AbstractC65743Pr9<? extends T> abstractC65743Pr9) {
        abstractC65743Pr9.getClass();
        return this;
    }
}
