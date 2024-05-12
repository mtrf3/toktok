package X;

import java.util.concurrent.ExecutorService;

/* renamed from: X.TFt, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74345TFt extends AbstractC65781Prl implements InterfaceC65784Pro<ExecutorService> {
    public static final C74345TFt LJLIL = new C74345TFt();

    public C74345TFt() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final ExecutorService invoke() {
        C38027EwB LIZ = C38028EwC.LIZ(FSY.SERIAL);
        LIZ.LIZJ = 1;
        LIZ.LIZIZ = "FriendsFeedListKeva";
        return C38995FSd.LIZ(LIZ.LIZ());
    }
}
