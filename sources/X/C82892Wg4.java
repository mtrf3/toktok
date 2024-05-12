package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Wg4, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82892Wg4<T> implements InterfaceC214508bO<Object, T> {
    public InterfaceC65784Pro<? extends T> LIZ;
    public volatile Object LIZIZ;

    public C82892Wg4(InterfaceC65784Pro<? extends T> initializer) {
        o.LJIIIZ(initializer, "initializer");
        this.LIZ = initializer;
        this.LIZIZ = C82918WgU.LIZ;
    }

    @Override // X.InterfaceC214508bO, X.InterfaceC115514g7
    public final T LIZ(Object thisRef, InterfaceC74236TBo<?> property) {
        T t;
        o.LJIIIZ(thisRef, "thisRef");
        o.LJIIIZ(property, "property");
        T t2 = (T) this.LIZIZ;
        C82918WgU c82918WgU = C82918WgU.LIZ;
        if (t2 != c82918WgU) {
            return t2;
        }
        synchronized (this) {
            t = (T) this.LIZIZ;
            if (t == c82918WgU) {
                InterfaceC65784Pro<? extends T> interfaceC65784Pro = this.LIZ;
                o.LJI(interfaceC65784Pro);
                t = interfaceC65784Pro.invoke();
                this.LIZIZ = t;
                this.LIZ = null;
            }
        }
        return t;
    }

    @Override // X.InterfaceC214508bO
    public final void LIZIZ(InterfaceC74236TBo property, Object thisRef, Object obj) {
        o.LJIIIZ(thisRef, "thisRef");
        o.LJIIIZ(property, "property");
        this.LIZIZ = obj;
    }
}
