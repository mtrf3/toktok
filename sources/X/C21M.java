package X;

import android.os.HandlerThread;

/* renamed from: X.21M, reason: invalid class name */
/* loaded from: classes.dex */
public final class C21M extends AbstractC65781Prl implements InterfaceC65784Pro<HandlerThread> {
    public static final C21M LJLIL = new C21M();

    public C21M() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final HandlerThread invoke() {
        HandlerThread handlerThread = new HandlerThread("accompaniment-thread", 10);
        handlerThread.start();
        return handlerThread;
    }
}
