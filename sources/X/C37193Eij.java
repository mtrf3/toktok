package X;

import java.util.concurrent.ExecutorService;

/* renamed from: X.Eij, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37193Eij extends AbstractC65781Prl implements InterfaceC65784Pro<ExecutorService> {
    public static final C37193Eij LJLIL = new C37193Eij();

    public C37193Eij() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final ExecutorService invoke() {
        C38027EwB LIZ = C38028EwC.LIZ(FSY.SERIAL);
        LIZ.LIZIZ = "story_publisher_synthetic_wave_executor";
        return C38995FSd.LIZ(LIZ.LIZ());
    }
}
