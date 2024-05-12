package X;

import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import kotlin.jvm.internal.o;

/* renamed from: X.WlI, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83216WlI {
    public final InterfaceC83142Wk6 LIZ;
    public InterfaceC83233WlZ LIZIZ;
    public InterfaceC83144Wk8 LIZJ;
    public final C68249QqT LIZLLL;
    public final C50765Jw9 LJ;

    public final void LIZ(ComposerBeauty composerBeauty) {
        o.LJIIIZ(composerBeauty, "composerBeauty");
        C68249QqT c68249QqT = this.LIZLLL;
        if (c68249QqT != null) {
            String selectedCategoryName = this.LIZ.K7();
            o.LJIIIZ(selectedCategoryName, "selectedCategoryName");
            InterfaceC83246Wlm interfaceC83246Wlm = (InterfaceC83246Wlm) c68249QqT.LIZ;
            if (interfaceC83246Wlm != null) {
                interfaceC83246Wlm.LJ(composerBeauty, selectedCategoryName);
            }
        }
    }

    public final void LIZJ(boolean z) {
        InterfaceC83268Wm8 interfaceC83268Wm8 = (InterfaceC83268Wm8) this.LJ.LIZJ(InterfaceC83268Wm8.class);
        if (interfaceC83268Wm8 != null) {
            interfaceC83268Wm8.LIZIZ(z);
        }
    }

    public final int[] LIZIZ(String nodePath, String nodeKey) {
        o.LJIIIZ(nodePath, "nodePath");
        o.LJIIIZ(nodeKey, "nodeKey");
        InterfaceC83144Wk8 interfaceC83144Wk8 = this.LIZJ;
        if (interfaceC83144Wk8 != null) {
            return interfaceC83144Wk8.LLII(nodePath, nodeKey);
        }
        return null;
    }

    public final void LIZLLL(ComposerBeauty beautyBean, boolean z) {
        o.LJIIIZ(beautyBean, "beautyBean");
        InterfaceC83268Wm8 interfaceC83268Wm8 = (InterfaceC83268Wm8) this.LJ.LIZJ(InterfaceC83268Wm8.class);
        if (interfaceC83268Wm8 != null) {
            C83269Wm9.LIZ(interfaceC83268Wm8, beautyBean, z, 12);
        }
    }

    public C83216WlI(C50765Jw9 beautyViewApiManager, C68249QqT c68249QqT, InterfaceC83142Wk6 source, InterfaceC83144Wk8 interfaceC83144Wk8, InterfaceC83233WlZ interfaceC83233WlZ) {
        o.LJIIIZ(source, "source");
        o.LJIIIZ(beautyViewApiManager, "beautyViewApiManager");
        this.LIZ = source;
        this.LIZIZ = interfaceC83233WlZ;
        this.LIZJ = interfaceC83144Wk8;
        this.LIZLLL = c68249QqT;
        this.LJ = beautyViewApiManager;
    }
}
