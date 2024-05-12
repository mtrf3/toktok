package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Fgo, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39622Fgo {
    public final InterfaceC82086WJm LIZ;

    public abstract boolean LIZ();

    public abstract String LIZIZ();

    public abstract void LIZJ(int i, String str);

    public AbstractC39622Fgo(WRQ cameraApiComponent) {
        o.LJIIIZ(cameraApiComponent, "cameraApiComponent");
        this.LIZ = cameraApiComponent;
    }

    public final void LIZLLL(long j, String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Effect interface: ");
        LIZ.append(LIZIZ());
        LIZ.append(" send effect Msg: arg2: ");
        C65232Piu.LIZLLL(LIZ, j, " msg: ", str);
        H7B.LJ(X1D.LIZIZ(LIZ));
        this.LIZ.e8().LJJIJL(41, 41L, j, str);
    }
}
