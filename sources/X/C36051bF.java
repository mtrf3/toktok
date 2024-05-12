package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1bF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36051bF<T> implements InterfaceC24760y8<T> {
    public final C62822Ol8 LJLIL;

    @Override // X.InterfaceC24760y8
    public final T getValue() {
        return (T) this.LJLIL.getValue();
    }

    public C36051bF(InterfaceC65784Pro<? extends T> valueProducer) {
        o.LJIIIZ(valueProducer, "valueProducer");
        this.LJLIL = C221108m2.LIZIZ(valueProducer);
    }
}
