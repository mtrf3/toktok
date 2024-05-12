package X;

import java.util.LinkedHashSet;
import kotlin.jvm.internal.o;

/* renamed from: X.Ets, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37884Ets extends F9E {
    public EnumC38003Evn LJLIL;
    public final java.util.Set<String> LJLILLLLZI;
    public final java.util.Set<String> LJLJI;

    public C37884Ets() {
        this(null, 7);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI};
    }

    public C37884Ets(EnumC38003Evn access, int i) {
        LinkedHashSet includedMethods;
        access = (i & 1) != 0 ? EnumC38003Evn.PUBLIC : access;
        if ((i & 2) != 0) {
            includedMethods = new LinkedHashSet();
        } else {
            includedMethods = null;
        }
        LinkedHashSet excludedMethods = (i & 4) != 0 ? new LinkedHashSet() : null;
        o.LJIIJ(access, "access");
        o.LJIIJ(includedMethods, "includedMethods");
        o.LJIIJ(excludedMethods, "excludedMethods");
        this.LJLIL = access;
        this.LJLILLLLZI = includedMethods;
        this.LJLJI = excludedMethods;
    }
}
