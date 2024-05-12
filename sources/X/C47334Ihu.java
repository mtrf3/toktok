package X;

import android.os.HandlerThread;

/* renamed from: X.Ihu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47334Ihu extends AbstractC65781Prl implements InterfaceC65784Pro<HandlerThread> {
    public static final C47334Ihu LJLIL = new C47334Ihu();

    public C47334Ihu() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final HandlerThread invoke() {
        return C06M.LIZ("av_player_thread");
    }
}
