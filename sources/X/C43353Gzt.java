package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Gzt, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43353Gzt {
    public boolean LIZ;
    public final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C43354Gzu.LJLIL);

    public final synchronized void LIZIZ() {
        this.LIZ = true;
        if (LIZ().LIZIZ) {
            LIZ().LJ();
        }
    }

    public final synchronized void LIZJ() {
        if (!this.LIZ) {
            if (LIZ().LIZIZ) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("WaitClickPublishTimeCounter: ");
                LIZ.append("repeat start uploadDataFinish");
                String LIZIZ = X1D.LIZIZ(LIZ);
                C60903NvH.LJIIJJI().LJJIIJ();
                H7B.LIZJ(LIZIZ);
                return;
            }
            LIZ().LIZLLL();
        }
    }

    public final C44428Hc8 LIZ() {
        Object value = this.LIZIZ.getValue();
        o.LJIIIIZZ(value, "<get-counter>(...)");
        return (C44428Hc8) value;
    }
}
