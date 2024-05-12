package X;

import X.AbstractC31467CWp;
import kotlin.jvm.internal.o;

/* renamed from: X.CWk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31462CWk<T extends AbstractC31467CWp> {
    public T LIZ;

    public abstract int LIZJ();

    public abstract T LIZLLL();

    public final T LIZIZ() {
        if (this.LIZ == null) {
            this.LIZ = LIZLLL();
        }
        T t = this.LIZ;
        if (t != null) {
            return t;
        }
        o.LJIJI("badge");
        throw null;
    }
}
