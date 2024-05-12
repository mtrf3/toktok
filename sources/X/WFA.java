package X;

import Y.AfS63S0200000_14;

/* loaded from: classes15.dex */
public final class WFA implements WF6 {
    public final WFB LJLIL;
    public boolean LJLILLLLZI;

    @Override // X.WF6
    public final void LIZIZ(int i) {
    }

    @Override // X.WF6
    public final void LIZJ(String str) {
    }

    @Override // X.WF6
    public final void LIZLLL() {
    }

    public WFA(WFB wfb) {
        this.LJLIL = wfb;
    }

    @Override // X.WF6
    public final void LIZ(final int i, String str, int i2, InterfaceC45734HxC interfaceC45734HxC) {
        this.LJLIL.LIZ().LJJIFFI(new InterfaceC73592SuS() { // from class: X.LE9
            @Override // X.InterfaceC73592SuS
            public final boolean test(Object obj) {
                return ((Integer) ((OSZ) obj).getFirst()).equals(Integer.valueOf(i));
            }
        }).LJJJJZI(new AfS63S0200000_14(this, interfaceC45734HxC, 8));
    }
}
