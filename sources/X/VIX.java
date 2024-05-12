package X;

import android.os.HandlerThread;

/* loaded from: classes15.dex */
public final class VIX extends AbstractC65781Prl implements InterfaceC65784Pro<HandlerThread> {
    public static final VIX LJLIL = new VIX();

    public VIX() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final HandlerThread invoke() {
        return C06M.LIZ("assem-handler-executor");
    }
}
