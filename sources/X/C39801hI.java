package X;

import android.view.View;

/* renamed from: X.1hI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C39801hI extends C31309CQn {
    public final /* synthetic */ C280718h LJLILLLLZI;

    @Override // X.InterfaceC16660l4
    public final void LIZ() {
        View view;
        C280718h c280718h = this.LJLILLLLZI;
        if (c280718h.LJIILL && (view = c280718h.LJI) != null) {
            view.setTranslationY(0.0f);
            this.LJLILLLLZI.LIZLLL.setTranslationY(0.0f);
        }
        this.LJLILLLLZI.LIZLLL.setVisibility(8);
        this.LJLILLLLZI.LIZLLL.setTransitioning(false);
        C280718h c280718h2 = this.LJLILLLLZI;
        c280718h2.LJIJJ = null;
        InterfaceC25570zR interfaceC25570zR = c280718h2.LJIIJ;
        if (interfaceC25570zR != null) {
            interfaceC25570zR.LIZJ(c280718h2.LJIIIZ);
            c280718h2.LJIIIZ = null;
            c280718h2.LJIIJ = null;
        }
        C45161pw c45161pw = this.LJLILLLLZI.LIZJ;
        if (c45161pw != null) {
            C16340kY.LIZJ(c45161pw);
        }
    }

    public C39801hI(C280718h c280718h) {
        this.LJLILLLLZI = c280718h;
    }
}
