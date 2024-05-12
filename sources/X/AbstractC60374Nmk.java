package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Nmk, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC60374Nmk {
    public InterfaceC60360NmW LIZ;
    public final C60249Nkj LIZIZ = new C60249Nkj();

    public abstract C60249Nkj LIZIZ();

    public AbstractC60374Nmk(C60504Noq c60504Noq) {
    }

    public C60263Nkx LIZ(String bid) {
        o.LJIIJ(bid, "bid");
        C60249Nkj LIZIZ = LIZIZ();
        InterfaceC60324Nlw LIZIZ2 = C60373Nmj.LIZIZ();
        C60342NmE c60342NmE = LIZIZ.LIZ;
        c60342NmE.getClass();
        LIZIZ2.LJIIIIZZ(bid, new C60378Nmo(c60342NmE));
        C60263Nkx LIZ = LIZIZ.LIZ();
        C58233MtJ.LIZ.put(bid, new C60382Nms(LIZ));
        return LIZ;
    }
}
