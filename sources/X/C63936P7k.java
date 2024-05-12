package X;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Message;

/* renamed from: X.P7k, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C63936P7k implements InterfaceC63935P7j, Handler.Callback {
    public final InterfaceC63935P7j LJLIL;
    public Handler LJLILLLLZI;

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        return false;
    }

    public C63936P7k(InterfaceC63935P7j interfaceC63935P7j) {
        this.LJLIL = interfaceC63935P7j;
    }

    @Override // X.InterfaceC63935P7j
    public final Bitmap LIZ(C63934P7i c63934P7i) {
        return this.LJLIL.LIZ(c63934P7i);
    }
}
