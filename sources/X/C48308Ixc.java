package X;

import Y.AfS4S1100100_7;
import kotlin.jvm.internal.o;

/* renamed from: X.Ixc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48308Ixc extends AbstractC48314Ixi {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(C48253Iwj.LJLIL);

    @Override // X.AbstractC48314Ixi
    public final void LIZJ(I1Z i1z, String str, String destFilePath) {
        o.LJIIIZ(destFilePath, "destFilePath");
        long currentTimeMillis = System.currentTimeMillis();
        C64618PXq c64618PXq = new C64618PXq();
        c64618PXq.LJII(str);
        AbstractC73638SvC.LJI(new C48307Ixb(this, c64618PXq.LIZIZ())).LJJIIJ(T16.LIZ()).LJIJI(new C48309Ixd(this, destFilePath)).LJJII(new AfS4S1100100_7(currentTimeMillis, i1z, str, 2), new AfS4S1100100_7(currentTimeMillis, i1z, str, 3));
    }
}
