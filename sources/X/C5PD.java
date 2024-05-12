package X;

import android.os.HandlerThread;

/* renamed from: X.5PD, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5PD extends AbstractC65781Prl implements InterfaceC65784Pro<HandlerThread> {
    public static final C5PD LJLIL = new C5PD();

    public C5PD() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final HandlerThread invoke() {
        return C06M.LIZ("AudioFadeoutThread");
    }
}
