package X;

import android.app.ActivityManager;

/* renamed from: X.Zw8, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91532Zw8 extends AbstractC65781Prl implements InterfaceC65784Pro<ActivityManager> {
    public static final C91532Zw8 INSTANCE = new C91532Zw8();

    public C91532Zw8() {
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
