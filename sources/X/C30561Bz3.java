package X;

import android.view.MotionEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Iterator;
import java.util.PriorityQueue;
import kotlin.jvm.internal.o;

/* renamed from: X.Bz3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30561Bz3 extends AbstractC12520eO {
    public final DataChannel LIZ;

    public C30561Bz3(DataChannel dataChannel) {
        o.LJIIIZ(dataChannel, "dataChannel");
        this.LIZ = dataChannel;
    }

    public final void LIZIZ(AbstractC32821Qo abstractC32821Qo) {
        if (abstractC32821Qo == null) {
            return;
        }
        PriorityQueue priorityQueue = (PriorityQueue) this.LIZ.kv0(C30564Bz6.class);
        if (priorityQueue != null) {
            Iterator it = priorityQueue.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                AbstractC32821Qo abstractC32821Qo2 = (AbstractC32821Qo) next;
                if (C16880lQ.LJLLJ(abstractC32821Qo2.getClass()).equals(C16880lQ.LJLLJ(abstractC32821Qo.getClass())) && abstractC32821Qo2.LIZ() == abstractC32821Qo.LIZ()) {
                    if (next != null) {
                        return;
                    }
                }
            }
        }
        abstractC32821Qo.LIZIZ();
        PriorityQueue priorityQueue2 = (PriorityQueue) this.LIZ.kv0(C30564Bz6.class);
        if (priorityQueue2 != null) {
            priorityQueue2.offer(abstractC32821Qo);
        }
    }

    public final void LIZJ(AbstractC32821Qo abstractC32821Qo) {
        if (abstractC32821Qo == null) {
            return;
        }
        PriorityQueue priorityQueue = (PriorityQueue) this.LIZ.kv0(C30564Bz6.class);
        Object obj = null;
        if (priorityQueue != null) {
            Iterator it = priorityQueue.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                AbstractC32821Qo abstractC32821Qo2 = (AbstractC32821Qo) next;
                if (C16880lQ.LJLLJ(abstractC32821Qo2.getClass()).equals(C16880lQ.LJLLJ(abstractC32821Qo.getClass())) && abstractC32821Qo2.LIZ() == abstractC32821Qo.LIZ()) {
                    obj = next;
                    break;
                }
            }
            AbstractC32821Qo abstractC32821Qo3 = (AbstractC32821Qo) obj;
            if (abstractC32821Qo3 != null) {
                abstractC32821Qo3.LIZJ();
                PriorityQueue priorityQueue2 = (PriorityQueue) this.LIZ.kv0(C30564Bz6.class);
                if (priorityQueue2 != null) {
                    priorityQueue2.remove(abstractC32821Qo3);
                }
            }
        }
    }

    @Override // X.AbstractC12520eO
    public final boolean LIZ(MotionEvent event, C32811Qn c32811Qn) {
        o.LJIIIZ(event, "event");
        PriorityQueue priorityQueue = (PriorityQueue) this.LIZ.kv0(C30564Bz6.class);
        if (priorityQueue != null) {
            PriorityQueue priorityQueue2 = new PriorityQueue(10, C30562Bz4.LJLIL);
            priorityQueue2.addAll(priorityQueue);
            while (!priorityQueue2.isEmpty()) {
                if (((AbstractC32821Qo) priorityQueue2.poll()).LIZLLL(event, c32811Qn)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
}
