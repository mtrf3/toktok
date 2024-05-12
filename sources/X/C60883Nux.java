package X;

import android.os.MessageQueue;

/* renamed from: X.Nux, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60883Nux implements MessageQueue.IdleHandler {
    public final /* synthetic */ InterfaceC65784Pro LJLIL;

    public C60883Nux(InterfaceC65784Pro interfaceC65784Pro) {
        this.LJLIL = interfaceC65784Pro;
    }

    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        this.LJLIL.invoke();
        return false;
    }
}
