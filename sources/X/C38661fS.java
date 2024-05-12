package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.1fS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C38661fS extends F9E {
    public final long LJLIL;
    public final int LJLILLLLZI;
    public final List<C14H> LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Long.valueOf(this.LJLIL), Integer.valueOf(this.LJLILLLLZI), this.LJLJI};
    }

    public C38661fS(long j, int i, List<C14H> info) {
        o.LJIIIZ(info, "info");
        this.LJLIL = j;
        this.LJLILLLLZI = i;
        this.LJLJI = info;
    }
}
