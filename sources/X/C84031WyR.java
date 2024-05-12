package X;

import com.bef.effectsdk.message.MessageCenter;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.WyR, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C84031WyR implements MessageCenter.Listener {
    public final /* synthetic */ C84024WyK LJLIL;

    public C84031WyR(C84024WyK c84024WyK) {
        this.LJLIL = c84024WyK;
    }

    @Override // com.bef.effectsdk.message.MessageCenter.Listener
    public final void onMessageReceived(int i, int i2, int i3, String str) {
        if (this.LJLIL.LJIIIIZZ.invoke().booleanValue() || ((ArrayList) this.LJLIL.LIZLLL).isEmpty()) {
            return;
        }
        Iterator it = new ArrayList(this.LJLIL.LIZLLL).iterator();
        while (it.hasNext()) {
            MessageCenter.Listener listener = (MessageCenter.Listener) it.next();
            if (listener != null) {
                listener.onMessageReceived(i, i2, i3, str);
            }
        }
    }
}
