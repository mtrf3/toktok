package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1Ou, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32361Ou implements C0YT {
    @Override // X.C0YT, X.C0YU
    public final float LIZ() {
        return 0;
    }

    public final String toString() {
        return "Arrangement#Start";
    }

    @Override // X.C0YT
    public final void LIZIZ(int i, InterfaceC23370vt interfaceC23370vt, EnumC23500w6 layoutDirection, int[] sizes, int[] outPositions) {
        o.LJIIIZ(interfaceC23370vt, "<this>");
        o.LJIIIZ(sizes, "sizes");
        o.LJIIIZ(layoutDirection, "layoutDirection");
        o.LJIIIZ(outPositions, "outPositions");
        if (layoutDirection == EnumC23500w6.Ltr) {
            C0YW.LIZIZ(false, sizes, outPositions);
        } else {
            C0YW.LIZJ(i, sizes, outPositions, true);
        }
    }
}
