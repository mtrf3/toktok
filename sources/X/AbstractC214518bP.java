package X;

import kotlin.jvm.internal.o;

/* renamed from: X.8bP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC214518bP<V> implements InterfaceC214508bO<Object, V> {
    public V LIZ;

    public abstract void LIZJ(InterfaceC74236TBo<?> interfaceC74236TBo, V v, V v2);

    public AbstractC214518bP(V v) {
        this.LIZ = v;
    }

    @Override // X.InterfaceC214508bO, X.InterfaceC115514g7
    public final V LIZ(Object obj, InterfaceC74236TBo<?> property) {
        o.LJIIIZ(property, "property");
        return this.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC214508bO
    public final void LIZIZ(InterfaceC74236TBo property, Object obj, Object obj2) {
        o.LJIIIZ(property, "property");
        V v = this.LIZ;
        this.LIZ = obj2;
        LIZJ(property, v, obj2);
    }
}
