package X;

import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class H3B implements InterfaceC133985Nq {
    public final /* synthetic */ C43421H2j LIZ;

    public H3B(C43421H2j c43421H2j) {
        this.LIZ = c43421H2j;
    }

    @Override // X.InterfaceC133985Nq
    public final void LIZ(long j, long j2, boolean z, boolean z2) {
        H5I h5i = new H5I(j, j2, z, z2);
        C67996QmO c67996QmO = this.LIZ.LJIILLIIL;
        if (c67996QmO != null) {
            c67996QmO.LIZIZ(h5i, EnumC43531H6p.ALL);
            H31.LIZIZ(h5i);
        } else {
            o.LJIJI("nodeCallback");
            throw null;
        }
    }
}