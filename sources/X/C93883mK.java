package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3mK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C93883mK extends F9E implements C33Q {
    public final List<C91243i4> LJLIL;

    public C93883mK() {
        this(0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL};
    }

    public C93883mK(List<C91243i4> filterList) {
        o.LJIIIZ(filterList, "filterList");
        this.LJLIL = filterList;
    }

    public C93883mK(int i) {
        this(C61878OQg.INSTANCE);
    }
}
