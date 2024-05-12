package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Cbd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31657Cbd<T> {
    public final String LIZ;
    public T LIZIZ;

    public C31657Cbd(String str) {
        this.LIZ = str;
    }

    public final T LIZ(Object thisRef, InterfaceC74236TBo<?> property) {
        o.LJIIIZ(thisRef, "thisRef");
        o.LJIIIZ(property, "property");
        if (this.LIZIZ == null) {
            C75559Tl5 c75559Tl5 = C75559Tl5.LIZIZ;
            String label = this.LIZ;
            c75559Tl5.getClass();
            o.LJIIIZ(label, "label");
            T t = (T) c75559Tl5.LIZJ().get(label);
            if (t == null) {
                t = null;
            }
            this.LIZIZ = t;
        }
        return this.LIZIZ;
    }
}
