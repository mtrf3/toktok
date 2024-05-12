package X;

import kotlin.jvm.internal.o;

/* renamed from: X.86c, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2058686c {
    public final IZ2 LIZ;
    public final C62822Ol8 LIZIZ;
    public C57756Mlc LIZJ;

    public final InterfaceC197777pV LIZ() {
        return (InterfaceC197777pV) this.LIZIZ.getValue();
    }

    public C2058686c(C71084Rv6 playerHost) {
        o.LJIIIZ(playerHost, "playerHost");
        this.LIZ = playerHost;
        this.LIZIZ = C221108m2.LIZIZ(C86Q.LJLIL);
    }

    public final void LIZIZ(EnumC71086Rv8 enumC71086Rv8) {
        try {
            switch (C71085Rv7.LIZ[enumC71086Rv8.ordinal()]) {
                case 1:
                    LIZ().LIZIZ(this.LIZ);
                    break;
                case 2:
                    LIZ().LIZ(this.LIZJ);
                    break;
                case 3:
                    LIZ().resume();
                    break;
                case 4:
                    LIZ().pause();
                    break;
                case 5:
                    LIZ().stop();
                    break;
                case 6:
                    LIZ().release();
                    break;
            }
        } catch (Throwable unused) {
        }
    }
}
