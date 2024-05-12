package X;

import kotlin.jvm.internal.AqS154S0200000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.GgU, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42150GgU implements G7X {
    public final /* synthetic */ C42149GgT LIZ;

    @Override // X.G7X
    public final void cancel() {
        this.LIZ.LIZLLL();
    }

    public C42150GgU(C42149GgT c42149GgT) {
        this.LIZ = c42149GgT;
    }

    @Override // X.G7X
    public final void LIZ(AbstractC42152GgW<?> abstractC42152GgW) {
        C42149GgT c42149GgT = this.LIZ;
        synchronized (this) {
            if (c42149GgT.LJIIJJI == EnumC42155GgZ.PENDING && o.LJ(c42149GgT.LJII, abstractC42152GgW)) {
                cancel();
            }
        }
    }

    @Override // X.G7X
    public final void LIZIZ(AbstractC42152GgW<?> abstractC42152GgW) {
        C42149GgT c42149GgT = this.LIZ;
        synchronized (this) {
            if (c42149GgT.LJIIJJI == EnumC42155GgZ.CANCELED) {
                return;
            }
            if (abstractC42152GgW != null) {
                if (c42149GgT.LJFF.contains(abstractC42152GgW)) {
                    return;
                } else {
                    c42149GgT.LJFF.add(abstractC42152GgW);
                }
            }
            c42149GgT.LJIIJJI = EnumC42155GgZ.RUNNING;
            c42149GgT.LJII = null;
            C42149GgT c42149GgT2 = this.LIZ;
            c42149GgT2.LJFF(new AqS154S0200000_7(c42149GgT2, (C42149GgT) abstractC42152GgW, (AbstractC42152GgW<?>) this, (C42150GgU) 144));
        }
    }

    @Override // X.G7X
    public final void LIZJ(AbstractC42152GgW<?> abstractC42152GgW) {
        C42149GgT c42149GgT = this.LIZ;
        synchronized (this) {
            if (c42149GgT.LJIIJJI == EnumC42155GgZ.CANCELED) {
                return;
            }
            c42149GgT.LJII = abstractC42152GgW;
            c42149GgT.LJIIJJI = EnumC42155GgZ.PENDING;
            String LIZJ = c42149GgT.LIZJ.get(c42149GgT.LJIIL).LIZJ();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("pending by: ");
            LIZ.append(LIZJ);
            C42149GgT.LJ(X1D.LIZIZ(LIZ));
        }
    }
}
