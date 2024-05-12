package X;

import android.os.HandlerThread;

/* renamed from: X.OtJ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63329OtJ extends AbstractC65781Prl implements InterfaceC65784Pro<HandlerC63316Ot6> {
    public static final C63329OtJ LJLIL = new C63329OtJ();

    public C63329OtJ() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final HandlerC63316Ot6 invoke() {
        HandlerThread handlerThread = C63315Ot5.LIZIZ;
        handlerThread.start();
        return new HandlerC63316Ot6(handlerThread.getLooper());
    }
}
