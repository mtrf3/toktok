package X;

import android.app.Activity;
import android.os.Vibrator;

/* loaded from: classes11.dex */
public final class NDU extends AbstractC65781Prl implements InterfaceC65784Pro<Vibrator> {
    public static final NDU INSTANCE = new NDU();

    public NDU() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.InterfaceC65784Pro
    public final Vibrator invoke() {
        Object obj;
        Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
        if (LJIIIIZZ != null) {
            obj = C16880lQ.LLILIL(LJIIIIZZ, "vibrator");
        } else {
            obj = null;
        }
        if (!(obj instanceof Vibrator)) {
            return null;
        }
        return (Vibrator) obj;
    }
}
