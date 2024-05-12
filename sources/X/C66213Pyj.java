package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Pyj, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66213Pyj implements InterfaceC66218Pyo {
    public static final C66213Pyj LIZ = new C66213Pyj();

    @Override // X.InterfaceC66218Pyo
    public final String name() {
        return "RulerFilter";
    }

    @Override // X.InterfaceC66218Pyo
    public final boolean LIZ(C66211Pyh c66211Pyh) {
        if (o.LJ(c66211Pyh.LJLILLLLZI, "bpea") && c66211Pyh.LJLIL.get("entry_datatypes") == null) {
            return true;
        }
        return false;
    }
}
