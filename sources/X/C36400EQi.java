package X;

import com.bef.effectsdk.message.MessageCenter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.EQi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C36400EQi implements InterfaceC36458ESo, MessageCenter.Listener {
    public final List<MessageCenter.Listener> LJLIL = new ArrayList();

    @Override // X.InterfaceC36458ESo
    public final void LIZ(C36396EQe c36396EQe) {
        if (((ArrayList) this.LJLIL).contains(c36396EQe)) {
            ((ArrayList) this.LJLIL).remove(c36396EQe);
        }
    }

    @Override // X.InterfaceC36458ESo
    public final void LIZIZ(MessageCenter.Listener listener) {
        o.LJIIIZ(listener, "listener");
        if (!((ArrayList) this.LJLIL).contains(listener)) {
            ((ArrayList) this.LJLIL).add(listener);
        }
    }

    @Override // com.bef.effectsdk.message.MessageCenter.Listener
    public final void onMessageReceived(int i, int i2, int i3, String str) {
        Iterator it = ((ArrayList) this.LJLIL).iterator();
        while (it.hasNext()) {
            ((MessageCenter.Listener) it.next()).onMessageReceived(i, i2, i3, str);
        }
    }
}
