package X;

import android.os.HandlerThread;

/* renamed from: X.ERe, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36422ERe extends AbstractC65781Prl implements InterfaceC65784Pro<HandlerThread> {
    public static final C36422ERe LJLIL = new C36422ERe();

    public C36422ERe() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final HandlerThread invoke() {
        return C06M.LIZ("tracker-serial-t-handler-thread");
    }
}
