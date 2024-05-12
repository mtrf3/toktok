package X;

import kotlin.jvm.internal.o;

/* renamed from: X.9Vl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C237939Vl extends F9E {
    public final boolean LJLIL;
    public final boolean LJLILLLLZI;
    public final String LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.LJLIL), Boolean.valueOf(this.LJLILLLLZI), this.LJLJI};
    }

    public C237939Vl(boolean z, boolean z2, String nameToSync) {
        o.LJIIIZ(nameToSync, "nameToSync");
        this.LJLIL = z;
        this.LJLILLLLZI = z2;
        this.LJLJI = nameToSync;
    }
}
