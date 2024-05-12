package X;

import android.view.View;
import kotlin.jvm.internal.AqS159S0200000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.TGo, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74366TGo implements TGM {
    public final /* synthetic */ AqS159S0200000_12 LJLIL;

    @Override // X.TGM
    public final void LIZ(View stickerView) {
        o.LJIIIZ(stickerView, "stickerView");
    }

    @Override // X.TGM
    public final void LJI() {
    }

    public C74366TGo(AqS159S0200000_12 aqS159S0200000_12) {
        this.LJLIL = aqS159S0200000_12;
    }

    @Override // X.TGM
    public final void LIZJ(IDK state) {
        o.LJIIIZ(state, "state");
        if (state == IDK.BEFORE_ANIMATE) {
            InterfaceC74368TGq interfaceC74368TGq = (InterfaceC74368TGq) ((C74365TGn) this.LJLIL.l0).LJLJL.LJIIIIZZ(null, InterfaceC74368TGq.class);
            if (interfaceC74368TGq != null) {
                interfaceC74368TGq.ql(PNV.STICKER_PANEL);
            }
            InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns = ((C74365TGn) this.LJLIL.l0).LJLIL;
            if (interfaceC88472Yns != null) {
                interfaceC88472Yns.invoke(Boolean.TRUE);
            }
            InterfaceC45540Hu4 interfaceC45540Hu4 = (InterfaceC45540Hu4) ((C74365TGn) this.LJLIL.l0).LJLILLLLZI.getValue();
            if (interfaceC45540Hu4 != null) {
                interfaceC45540Hu4.registerActivityOnKeyDownListener(((C74365TGn) this.LJLIL.l0).LJLJJI);
            }
        }
    }

    @Override // X.TGM
    public final void LJII(IDK state) {
        o.LJIIIZ(state, "state");
        if (state == IDK.AFTER_ANIMATE) {
            InterfaceC74368TGq interfaceC74368TGq = (InterfaceC74368TGq) ((C74365TGn) this.LJLIL.l0).LJLJL.LJIIIIZZ(null, InterfaceC74368TGq.class);
            if (interfaceC74368TGq != null) {
                interfaceC74368TGq.Gu(PNV.STICKER_PANEL);
            }
            InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns = ((C74365TGn) this.LJLIL.l0).LJLIL;
            if (interfaceC88472Yns != null) {
                interfaceC88472Yns.invoke(Boolean.FALSE);
            }
            InterfaceC45540Hu4 interfaceC45540Hu4 = (InterfaceC45540Hu4) ((C74365TGn) this.LJLIL.l0).LJLILLLLZI.getValue();
            if (interfaceC45540Hu4 != null) {
                interfaceC45540Hu4.unRegisterActivityOnKeyDownListener(((C74365TGn) this.LJLIL.l0).LJLJJI);
            }
        }
    }
}
