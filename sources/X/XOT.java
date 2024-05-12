package X;

import android.app.ActivityManager;

/* loaded from: classes16.dex */
public final class XOT extends AbstractC65781Prl implements InterfaceC65784Pro<ActivityManager> {
    public static final XOT INSTANCE = new XOT();

    public XOT() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.InterfaceC65784Pro
    public final ActivityManager invoke() {
        Object LLILL = C16880lQ.LLILL(EF7.LIZIZ(), "activity");
        if (LLILL instanceof ActivityManager) {
            return (ActivityManager) LLILL;
        }
        return null;
    }
}
