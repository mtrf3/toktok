package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Wlr, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83251Wlr implements InterfaceC83180Wki {
    public final /* synthetic */ C83202Wl4 LJLIL;

    public C83251Wlr(C83202Wl4 c83202Wl4) {
        this.LJLIL = c83202Wl4;
    }

    @Override // X.InterfaceC83180Wki
    public final void LIZIZ(List paths) {
        o.LJIIIZ(paths, "paths");
        InterfaceC83144Wk8 beautyViewListener = this.LJLIL.LIZIZ.getBeautyViewListener();
        if (beautyViewListener != null) {
            beautyViewListener.LIZIZ(paths);
        }
    }

    @Override // X.InterfaceC83180Wki
    public final void LIZ(List list, List newPaths) {
        o.LJIIIZ(newPaths, "newPaths");
        InterfaceC83144Wk8 beautyViewListener = this.LJLIL.LIZIZ.getBeautyViewListener();
        if (beautyViewListener != null) {
            beautyViewListener.LIZ(list, newPaths);
        }
    }
}
