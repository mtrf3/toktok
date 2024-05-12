package X;

import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.EventListener;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class YRS implements YRT {
    public final List<EventListener> LIZ = new CopyOnWriteArrayList();

    @Override // X.YRT
    public final void LIZ() {
    }

    @Override // X.YRT
    public final void LIZLLL(C32075CiN configuration) {
        o.LJIIIZ(configuration, "configuration");
    }

    @Override // X.YRT
    public final void LJIIIIZZ(C30176Bsq stopMessageConfig) {
        o.LJIIIZ(stopMessageConfig, "stopMessageConfig");
    }

    @Override // X.YRT
    public final void onRelease() {
    }

    @Override // X.YRT
    public final void onStart() {
    }

    @Override // X.YRT
    public final void startPrefetchMessage() {
    }

    @Override // X.YRT
    public final void onDestroy() {
        ((CopyOnWriteArrayList) this.LIZ).clear();
    }

    @Override // X.YRT
    public final void LJ(long j, C32075CiN currentConfiguration) {
        o.LJIIIZ(currentConfiguration, "currentConfiguration");
    }

    public final void LJIIIZ(List<? extends IMessage> list, List<? extends IMessage> list2) {
        Iterator it = ((CopyOnWriteArrayList) this.LIZ).iterator();
        while (it.hasNext()) {
            ((EventListener) it.next()).onEnqueueMessage(list, list2);
        }
    }
}
