package X;

import android.hardware.display.DisplayManager;

/* loaded from: classes9.dex */
public final class KTT extends AbstractC65781Prl implements InterfaceC65784Pro<DisplayManager> {
    public static final KTT INSTANCE = new KTT();

    public KTT() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.InterfaceC65784Pro
    public final DisplayManager invoke() {
        Object LLILL = C16880lQ.LLILL(EF7.LIZIZ(), "display");
        if (LLILL instanceof DisplayManager) {
            return (DisplayManager) LLILL;
        }
        return null;
    }
}
