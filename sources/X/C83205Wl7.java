package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Wl7, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83205Wl7 implements InterfaceC83180Wki {
    public final /* synthetic */ C83199Wl1 LJLIL;

    public C83205Wl7(C83199Wl1 c83199Wl1) {
        this.LJLIL = c83199Wl1;
    }

    @Override // X.InterfaceC83180Wki
    public final void LIZIZ(List paths) {
        o.LJIIIZ(paths, "paths");
        if (this.LJLIL.LIZIZ.getViewConfig().LIZLLL) {
            C80371VgV swEnableBeauty = this.LJLIL.LIZIZ.getSwEnableBeauty();
            o.LJIIIIZZ(swEnableBeauty, "beautyViewImpl.swEnableBeauty");
            if (!swEnableBeauty.LJLJLJ) {
                return;
            }
        }
        InterfaceC83144Wk8 beautyViewListener = this.LJLIL.LIZIZ.getBeautyViewListener();
        if (beautyViewListener != null) {
            beautyViewListener.LIZIZ(paths);
        }
    }

    @Override // X.InterfaceC83180Wki
    public final void LIZ(List list, List newPaths) {
        o.LJIIIZ(newPaths, "newPaths");
        if (this.LJLIL.LIZIZ.getViewConfig().LIZLLL) {
            C80371VgV swEnableBeauty = this.LJLIL.LIZIZ.getSwEnableBeauty();
            o.LJIIIIZZ(swEnableBeauty, "beautyViewImpl.swEnableBeauty");
            if (!swEnableBeauty.LJLJLJ) {
                return;
            }
        }
        InterfaceC83144Wk8 beautyViewListener = this.LJLIL.LIZIZ.getBeautyViewListener();
        if (beautyViewListener != null) {
            beautyViewListener.LIZ(list, newPaths);
        }
    }
}
