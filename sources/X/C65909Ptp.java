package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Ptp, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65909Ptp implements InterfaceC65913Ptt<C65902Pti> {
    @Override // X.InterfaceC65913Ptt
    public final void LIZJ(C65908Pto<C65902Pti> queue) {
        o.LJIIIZ(queue, "queue");
        int i = 0;
        do {
            queue.poll();
            i++;
        } while (i < 100);
    }

    @Override // X.InterfaceC65913Ptt
    public final void LIZ(C65908Pto<C65902Pti> queue, C65902Pti element) {
        o.LJIIIZ(queue, "queue");
        o.LJIIIZ(element, "element");
        while (true) {
            C65902Pti peek = queue.peek();
            if (peek != null && System.currentTimeMillis() - peek.LJLIL.LJZ > C65907Ptn.LIZ().maxStoreInterval) {
                queue.poll();
            } else {
                return;
            }
        }
    }

    @Override // X.InterfaceC65913Ptt
    public final void LIZIZ(C65908Pto<C65902Pti> queue, C65902Pti c65902Pti) {
        C65902Pti element = c65902Pti;
        o.LJIIIZ(queue, "queue");
        o.LJIIIZ(element, "element");
        C65917Ptx.LIZLLL(element);
    }
}
