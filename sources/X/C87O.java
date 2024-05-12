package X;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* renamed from: X.87O, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C87O<T> {
    public WeakReference<T> LIZ;

    public C87O(InterfaceC65784Pro<? extends T> initializer) {
        o.LJIIIZ(initializer, "initializer");
        this.LIZ = new WeakReference<>(initializer.invoke());
    }

    public final Object LIZ(InterfaceC74236TBo property) {
        o.LJIIIZ(property, "property");
        return this.LIZ.get();
    }

    public final void LIZIZ(InterfaceC74236TBo property, Object obj) {
        o.LJIIIZ(property, "property");
        this.LIZ = new WeakReference<>(obj);
    }
}
