package X;

import android.os.HandlerThread;

/* renamed from: X.Be2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29258Be2 extends AbstractC65781Prl implements InterfaceC65784Pro<HandlerThread> {
    public static final C29258Be2 LJLIL = new C29258Be2();

    public C29258Be2() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final HandlerThread invoke() {
        return new HandlerThread("widget");
    }
}
