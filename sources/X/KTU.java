package X;

import android.app.KeyguardManager;

/* loaded from: classes9.dex */
public final class KTU extends AbstractC65781Prl implements InterfaceC65784Pro<KeyguardManager> {
    public static final KTU INSTANCE = new KTU();

    public KTU() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.InterfaceC65784Pro
    public final KeyguardManager invoke() {
        Object LLILL = C16880lQ.LLILL(EF7.LIZIZ(), "keyguard");
        if (LLILL instanceof KeyguardManager) {
            return (KeyguardManager) LLILL;
        }
        return null;
    }
}
