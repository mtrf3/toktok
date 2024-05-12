package X;

import android.hardware.SensorManager;

/* renamed from: X.NCk, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58970NCk extends AbstractC65781Prl implements InterfaceC65784Pro<SensorManager> {
    public static final C58970NCk INSTANCE = new C58970NCk();

    public C58970NCk() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.InterfaceC65784Pro
    public final SensorManager invoke() {
        Object LLILL = C16880lQ.LLILL(EF7.LIZIZ(), "sensor");
        if (LLILL instanceof SensorManager) {
            return (SensorManager) LLILL;
        }
        return null;
    }
}
