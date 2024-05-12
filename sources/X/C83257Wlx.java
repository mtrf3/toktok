package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Wlx, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83257Wlx implements InterfaceC83180Wki {
    public final /* synthetic */ C83203Wl5 LJLIL;

    public C83257Wlx(C83203Wl5 c83203Wl5) {
        this.LJLIL = c83203Wl5;
    }

    @Override // X.InterfaceC83180Wki
    public final void LIZIZ(List paths) {
        o.LJIIIZ(paths, "paths");
        InterfaceC83144Wk8 interfaceC83144Wk8 = this.LJLIL.LIZIZ;
        if (interfaceC83144Wk8 != null) {
            interfaceC83144Wk8.LIZIZ(paths);
        }
    }

    @Override // X.InterfaceC83180Wki
    public final void LIZ(List list, List newPaths) {
        o.LJIIIZ(newPaths, "newPaths");
        InterfaceC83144Wk8 interfaceC83144Wk8 = this.LJLIL.LIZIZ;
        if (interfaceC83144Wk8 != null) {
            interfaceC83144Wk8.LIZ(list, newPaths);
        }
    }
}
