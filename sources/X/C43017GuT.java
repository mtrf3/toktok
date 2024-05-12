package X;

import android.os.SystemClock;

/* renamed from: X.GuT, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43017GuT extends AbstractC65781Prl implements InterfaceC65784Pro<String> {
    public static final C43017GuT LJLIL = new C43017GuT();

    public C43017GuT() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("taskId:");
        LIZ.append(SystemClock.elapsedRealtime());
        return X1D.LIZIZ(LIZ);
    }
}
