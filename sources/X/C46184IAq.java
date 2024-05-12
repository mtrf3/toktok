package X;

import android.view.View;
import com.ss.android.ugc.tools.utils.KeyboardUtils;
import kotlin.jvm.internal.o;

/* renamed from: X.IAq, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46184IAq extends TMN {
    public final /* synthetic */ C46183IAp LIZ;

    @Override // X.TMN
    public final void LIZ(View view) {
    }

    public C46184IAq(C46183IAp c46183IAp) {
        this.LIZ = c46183IAp;
    }

    @Override // X.TMN
    public final void LIZIZ(int i, View view) {
        WMH wmh;
        if (i == 5) {
            C46183IAp c46183IAp = this.LIZ;
            WM7 wm7 = c46183IAp.mParentScene;
            if ((wm7 instanceof WMH) && (wmh = (WMH) wm7) != null) {
                wmh.hide(c46183IAp);
            }
            C6K9 c6k9 = c46183IAp.LJLLLLLL;
            if (c6k9 != null) {
                KeyboardUtils.LIZ(c46183IAp.getSceneContext(), c6k9);
                c46183IAp.LLJILJIL().jL().LIZIZ(I0E.EFFECT_DISCOVER_SCENE, C83728WtY.LIZIZ.LIZIZ(EnumC83729WtZ.OPEN_CAMERA_CLOSE_EFFECT_DISCOVER, null));
                C82631Wbr c82631Wbr = c46183IAp.LJLJJLL;
                InterfaceC74236TBo<?>[] interfaceC74236TBoArr = C46183IAp.LLI;
                InterfaceC82199WNv interfaceC82199WNv = (InterfaceC82199WNv) c82631Wbr.LIZ(c46183IAp, interfaceC74236TBoArr[3]);
                if (interfaceC82199WNv != null) {
                    interfaceC82199WNv.zE();
                }
                if (V3N.LJJI(c46183IAp.LLJJ().LLLLL().LLJJIJIIJIL())) {
                    c46183IAp.LLJILJIL().e8().LLZIL();
                } else {
                    ((I8E) c46183IAp.LJLJL.LIZ(c46183IAp, interfaceC74236TBoArr[4])).eF(null);
                }
                InterfaceC45540Hu4 LIZIZ = C163756bj.LIZIZ(c46183IAp);
                if (LIZIZ != null) {
                    LIZIZ.unRegisterActivityOnKeyDownListener(c46183IAp);
                    LIZIZ.unRegisterActivityResultListener(c46183IAp);
                    return;
                }
                return;
            }
            o.LJIJI("searchEditView");
            throw null;
        }
    }
}
