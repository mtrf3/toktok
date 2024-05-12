package X;

import kotlin.jvm.internal.o;

/* renamed from: X.ApU, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27420ApU extends F9E {
    public final String LJLIL;
    public final boolean LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Boolean.valueOf(this.LJLILLLLZI)};
    }

    public C27420ApU(String index, boolean z) {
        o.LJIIIZ(index, "index");
        this.LJLIL = index;
        this.LJLILLLLZI = z;
    }
}
