package X;

import android.os.HandlerThread;
import android.os.Looper;

/* renamed from: X.WoR, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83411WoR extends AbstractC65781Prl implements InterfaceC65784Pro<Looper> {
    public static final C83411WoR LJLIL = new C83411WoR();

    public C83411WoR() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Looper invoke() {
        HandlerThread handlerThread = new HandlerThread("ActionAIMonitor");
        handlerThread.start();
        return handlerThread.getLooper();
    }
}
