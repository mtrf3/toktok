package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Ztb, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91375Ztb implements InterfaceC91161Zq9 {
    public final /* synthetic */ C91173ZqL LIZ;

    public C91375Ztb(C91173ZqL c91173ZqL) {
        this.LIZ = c91173ZqL;
    }

    @Override // X.InterfaceC91161Zq9
    public final void LIZ(C91169ZqH c91169ZqH) {
        Object obj;
        C91173ZqL c91173ZqL = this.LIZ;
        C91171ZqJ c91171ZqJ = c91173ZqL.LIZLLL;
        c91173ZqL.LJIIIIZZ = c91171ZqJ.LJFF(c91171ZqJ.getSelectedTabPosition());
        if (c91169ZqH != null) {
            obj = c91169ZqH.LJ;
        } else {
            obj = null;
        }
        o.LJII(obj, "null cannot be cast to non-null type kotlin.String");
        C91173ZqL c91173ZqL2 = this.LIZ;
        c91173ZqL2.getClass();
        int tabCount = c91173ZqL2.LIZLLL.getTabCount();
        if (tabCount >= 0) {
            int i = 0;
            while (true) {
                C91169ZqH LJFF = c91173ZqL2.LIZLLL.LJFF(i);
                if (LJFF != null && o.LJ(obj, LJFF.LJ)) {
                    InterfaceC91159Zq7 interfaceC91159Zq7 = c91173ZqL2.LJFF;
                    if (interfaceC91159Zq7 != null) {
                        interfaceC91159Zq7.setCurrentItem(LJFF.LIZ, c91173ZqL2.LJI);
                        return;
                    }
                    return;
                }
                if (i == tabCount) {
                    return;
                } else {
                    i++;
                }
            }
        }
    }
}
