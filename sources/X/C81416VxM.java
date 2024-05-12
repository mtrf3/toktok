package X;

import kotlin.jvm.internal.o;

/* renamed from: X.VxM, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81416VxM implements InterfaceC81422VxS {
    public final /* synthetic */ C81433Vxd LIZ;

    public C81416VxM(C81433Vxd c81433Vxd) {
        this.LIZ = c81433Vxd;
    }

    @Override // X.InterfaceC81422VxS
    public final void LIZ(Object obj, int i, int i2, boolean z, boolean z2) {
        ViewOnTouchListenerC81419VxP viewOnTouchListenerC81419VxP = this.LIZ.LJLL;
        if (viewOnTouchListenerC81419VxP != null) {
            Object LIZLLL = viewOnTouchListenerC81419VxP.LIZLLL(i);
            if (LIZLLL != null) {
                WS0 ws0 = new WS0(obj, LIZLLL, i2, false, z2, true, this.LIZ.LJLJLLL, 8);
                ws0.LJII = z;
                this.LIZ.LJLILLLLZI.LJII(ws0);
                this.LIZ.LLJJI(i);
                return;
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        o.LJIJI("tabHost");
        throw null;
    }
}
