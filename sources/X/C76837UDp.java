package X;

import Y.ARunnableS32S0200000_13;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;

/* renamed from: X.UDp, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76837UDp implements InterfaceC81841WAb {
    public final /* synthetic */ C76836UDo LJLIL;
    public final /* synthetic */ C2A4 LJLILLLLZI;

    @Override // X.InterfaceC81841WAb
    public final void LIZ(AnimatedDrawable2 animatedDrawable2) {
    }

    @Override // X.InterfaceC81841WAb
    public final void LIZIZ(AnimatedDrawable2 animatedDrawable2) {
    }

    @Override // X.InterfaceC81841WAb
    public final void LIZLLL(AnimatedDrawable2 animatedDrawable2, int i) {
    }

    @Override // X.InterfaceC81841WAb
    public final void LIZJ(AnimatedDrawable2 animatedDrawable2) {
        if (this.LJLIL.indexOfChild(this.LJLILLLLZI) >= 0) {
            C76836UDo c76836UDo = this.LJLIL;
            c76836UDo.post(new ARunnableS32S0200000_13(c76836UDo, this.LJLILLLLZI, 0));
        }
    }

    public C76837UDp(C76836UDo c76836UDo, C2A4 c2a4) {
        this.LJLIL = c76836UDo;
        this.LJLILLLLZI = c2a4;
    }
}
