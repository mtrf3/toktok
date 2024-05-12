package X;

import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WSD implements InterfaceC81422VxS {
    public final /* synthetic */ WSE LIZ;

    public WSD(WSE wse) {
        this.LIZ = wse;
    }

    @Override // X.InterfaceC81422VxS
    public final void LIZ(Object obj, int i, int i2, boolean z, boolean z2) {
        ViewOnTouchListenerC81419VxP viewOnTouchListenerC81419VxP = this.LIZ.LJII;
        if (viewOnTouchListenerC81419VxP != null) {
            Object LIZLLL = viewOnTouchListenerC81419VxP.LIZLLL(i);
            if (LIZLLL == null) {
                LIZLLL = "";
            }
            WSE wse = this.LIZ;
            boolean z3 = wse.LIZJ;
            Object obj2 = wse.LIZIZ;
            if (obj2 == null) {
                obj2 = LIZLLL;
            }
            WS0 ws0 = new WS0(obj, LIZLLL, i2, false, z2, z3, obj2, 8);
            this.LIZ.LJ(ws0);
            if (ws0.LIZJ == 2) {
                ViewOnTouchListenerC81419VxP viewOnTouchListenerC81419VxP2 = this.LIZ.LJII;
                if (viewOnTouchListenerC81419VxP2 != null) {
                    AnonymousClass632.LIZIZ(viewOnTouchListenerC81419VxP2.getContext());
                } else {
                    o.LJIJI("bottomTabHost");
                    throw null;
                }
            }
            if (!o.LJ(LIZLLL, "")) {
                C40871j1<WS0> c40871j1 = this.LIZ.LJ;
                if (c40871j1 != null) {
                    c40871j1.LJI(ws0);
                    InterfaceC81422VxS interfaceC81422VxS = this.LIZ.LJIIIZ;
                    if (interfaceC81422VxS != null) {
                        interfaceC81422VxS.LIZ(obj, i, i2, z, z2);
                        return;
                    }
                    return;
                }
                o.LJIJI("bottomTabIndexChangeEvent");
                throw null;
            }
            return;
        }
        o.LJIJI("bottomTabHost");
        throw null;
    }
}
