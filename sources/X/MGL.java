package X;

import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MGL implements InterfaceC72822Si2 {
    @Override // X.InterfaceC72822Si2
    public final void onReceiveJsEvent(C199097rd c199097rd) {
        if (o.LJ(c199097rd.LJLIL, "music_subscription_success_event")) {
            Iterator<MGM> it = MG0.LIZLLL.iterator();
            while (it.hasNext()) {
                it.next().LIZ();
            }
            MG0.LIZ = true;
        }
    }
}
