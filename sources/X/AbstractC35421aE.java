package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1aE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC35421aE implements C0SW {
    public final C23300vm LJLIL;

    public abstract void LJ(C1OJ c1oj, InterfaceC70422pa interfaceC70422pa);

    public abstract void LJI(C1OJ c1oj);

    public AbstractC35421aE(InterfaceC35811ar interfaceC35811ar, boolean z) {
        this.LJLIL = new C23300vm(interfaceC35811ar, z);
    }

    public final void LJFF(float f, long j, InterfaceC33691Tx drawStateLayer) {
        float LJJJJIZL;
        o.LJIIIZ(drawStateLayer, "$this$drawStateLayer");
        C23300vm c23300vm = this.LJLIL;
        c23300vm.getClass();
        if (Float.isNaN(f)) {
            LJJJJIZL = C23200vc.LIZ(drawStateLayer, c23300vm.LIZ, drawStateLayer.LIZIZ());
        } else {
            LJJJJIZL = drawStateLayer.LJJJJIZL(f);
        }
        float floatValue = c23300vm.LIZJ.LIZJ().floatValue();
        if (floatValue > 0.0f) {
            long LIZIZ = C11850dJ.LIZIZ(j, floatValue);
            if (c23300vm.LIZ) {
                float LIZLLL = C10430b1.LIZLLL(drawStateLayer.LIZIZ());
                float LIZIZ2 = C10430b1.LIZIZ(drawStateLayer.LIZIZ());
                C33681Tw LJJIII = drawStateLayer.LJJIII();
                long LIZIZ3 = LJJIII.LIZIZ();
                LJJIII.LIZ().LJIIL();
                LJJIII.LIZ.LIZIZ(0.0f, 0.0f, LIZLLL, LIZIZ2, 1);
                C14720hw.LIZJ(drawStateLayer, LIZIZ, LJJJJIZL, 0L, 0.0f, null, 124);
                LJJIII.LIZ().LJIIJ();
                LJJIII.LIZJ(LIZIZ3);
                return;
            }
            C14720hw.LIZJ(drawStateLayer, LIZIZ, LJJJJIZL, 0L, 0.0f, null, 124);
        }
    }
}
