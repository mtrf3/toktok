package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1Oq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32321Oq implements C0YT, C0YU {
    public final float LIZ = 0;

    public final String toString() {
        return "Arrangement#SpaceAround";
    }

    @Override // X.C0YT, X.C0YU
    public final float LIZ() {
        return this.LIZ;
    }

    @Override // X.C0YU
    public final void LIZJ(InterfaceC23370vt interfaceC23370vt, int i, int[] sizes, int[] outPositions) {
        o.LJIIIZ(interfaceC23370vt, "<this>");
        o.LJIIIZ(sizes, "sizes");
        o.LJIIIZ(outPositions, "outPositions");
        C0YW.LIZLLL(i, sizes, outPositions, false);
    }

    @Override // X.C0YT
    public final void LIZIZ(int i, InterfaceC23370vt interfaceC23370vt, EnumC23500w6 layoutDirection, int[] sizes, int[] outPositions) {
        o.LJIIIZ(interfaceC23370vt, "<this>");
        o.LJIIIZ(sizes, "sizes");
        o.LJIIIZ(layoutDirection, "layoutDirection");
        o.LJIIIZ(outPositions, "outPositions");
        if (layoutDirection == EnumC23500w6.Ltr) {
            C0YW.LIZLLL(i, sizes, outPositions, false);
        } else {
            C0YW.LIZLLL(i, sizes, outPositions, true);
        }
    }
}
