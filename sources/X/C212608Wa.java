package X;

import kotlin.jvm.internal.o;

/* renamed from: X.8Wa, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C212608Wa<T> implements InterfaceC214508bO<Object, T> {
    public T LIZ;

    @Override // X.InterfaceC214508bO, X.InterfaceC115514g7
    public final T LIZ(Object obj, InterfaceC74236TBo<?> property) {
        o.LJIIIZ(property, "property");
        T t = this.LIZ;
        if (t != null) {
            return t;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Property ");
        LIZ.append(property.getName());
        LIZ.append(" should be initialized before get.");
        throw new IllegalStateException(X1D.LIZIZ(LIZ));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC214508bO
    public final void LIZIZ(InterfaceC74236TBo property, Object obj, Object value) {
        o.LJIIIZ(property, "property");
        o.LJIIIZ(value, "value");
        this.LIZ = value;
    }
}
