package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1MX, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1MX extends F9E {
    public final InterfaceC30494Bxy LJLIL;
    public final boolean LJLILLLLZI;
    public final boolean LJLJI;
    public final boolean LJLJJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Boolean.valueOf(this.LJLILLLLZI), Boolean.valueOf(this.LJLJI), Boolean.valueOf(this.LJLJJI)};
    }

    public C1MX(InterfaceC30494Bxy listener, boolean z, boolean z2, boolean z3) {
        o.LJIIIZ(listener, "listener");
        this.LJLIL = listener;
        this.LJLILLLLZI = z;
        this.LJLJI = z2;
        this.LJLJJI = z3;
    }
}
