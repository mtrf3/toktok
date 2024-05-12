package X;

import java.util.concurrent.ExecutorService;

/* renamed from: X.Ei5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37153Ei5 extends AbstractC65781Prl implements InterfaceC65784Pro<ExecutorService> {
    public static final C37153Ei5 LJLIL = new C37153Ei5();

    public C37153Ei5() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final ExecutorService invoke() {
        C38027EwB LIZ = C38028EwC.LIZ(FSY.SERIAL);
        LIZ.LIZIZ = "renderthread-booster";
        return C38995FSd.LIZ(LIZ.LIZ());
    }
}
