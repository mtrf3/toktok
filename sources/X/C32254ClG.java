package X;

import android.os.Handler;
import android.os.HandlerThread;

/* renamed from: X.ClG, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32254ClG extends AbstractC65781Prl implements InterfaceC65784Pro<Handler> {
    public static final C32254ClG LJLIL = new C32254ClG();

    public C32254ClG() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Handler invoke() {
        HandlerThread LIZLLL = VCG.LIZLLL();
        LIZLLL.start();
        return new Handler(LIZLLL.getLooper());
    }
}
