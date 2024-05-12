package X;

import X.InterfaceC87283bg;
import kotlin.jvm.internal.o;

/* renamed from: X.4LX, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4LX<T extends InterfaceC87283bg> {
    public T LIZ;
    public String LIZIZ;

    public final OSZ<String, T> LIZ() {
        String str = this.LIZIZ;
        T t = this.LIZ;
        if (t != null) {
            return new OSZ<>(str, t);
        }
        o.LJIJI("data");
        throw null;
    }

    public final void LIZIZ(T t) {
        o.LJIIIZ(t, "<set-?>");
        this.LIZ = t;
    }
}
