package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Wky, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83196Wky implements InterfaceC83180Wki {
    public final /* synthetic */ C83195Wkx LJLIL;

    public C83196Wky(C83195Wkx c83195Wkx) {
        this.LJLIL = c83195Wkx;
    }

    @Override // X.InterfaceC83180Wki
    public final void LIZIZ(List paths) {
        InterfaceC83144Wk8 interfaceC83144Wk8;
        o.LJIIIZ(paths, "paths");
        if ((!this.LJLIL.LIZ() || this.LJLIL.LJ()) && (interfaceC83144Wk8 = this.LJLIL.LIZIZ) != null) {
            interfaceC83144Wk8.LIZIZ(paths);
        }
    }

    @Override // X.InterfaceC83180Wki
    public final void LIZ(List list, List newPaths) {
        InterfaceC83144Wk8 interfaceC83144Wk8;
        o.LJIIIZ(newPaths, "newPaths");
        if ((!this.LJLIL.LIZ() || this.LJLIL.LJ()) && (interfaceC83144Wk8 = this.LJLIL.LIZIZ) != null) {
            interfaceC83144Wk8.LIZ(list, newPaths);
        }
    }
}
