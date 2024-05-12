package X;

import java.util.concurrent.ExecutorService;

/* renamed from: X.TFs, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74344TFs extends AbstractC65781Prl implements InterfaceC65784Pro<ExecutorService> {
    public static final C74344TFs LJLIL = new C74344TFs();

    public C74344TFs() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final ExecutorService invoke() {
        C38027EwB LIZ = C38028EwC.LIZ(FSY.SERIAL);
        LIZ.LIZIZ = "feed-diff";
        return C38995FSd.LIZ(LIZ.LIZ());
    }
}
