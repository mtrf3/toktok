package X;

import Y.ARunnableS51S0100000_15;
import android.os.Message;

/* renamed from: X.X3v, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public class C84227X3v implements INL {
    public final /* synthetic */ C84222X3q LIZ;

    public C84227X3v(C84222X3q c84222X3q) {
        this.LIZ = c84222X3q;
    }

    @Override // X.INL
    public final void handleMsg(Message message) {
        if (message.what == 1) {
            C84212X3g.LJFF().execute(new ARunnableS51S0100000_15(this, 7));
        }
    }
}
