package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Ptq, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65910Ptq implements InterfaceC65913Ptt<C65896Ptc> {
    @Override // X.InterfaceC65913Ptt
    public final void LIZJ(C65908Pto<C65896Ptc> queue) {
        o.LJIIIZ(queue, "queue");
        int i = 0;
        do {
            queue.poll();
            i++;
        } while (i < 100);
    }

    @Override // X.InterfaceC65913Ptt
    public final void LIZ(C65908Pto<C65896Ptc> queue, C65896Ptc element) {
        o.LJIIIZ(queue, "queue");
        o.LJIIIZ(element, "element");
        while (true) {
            C65896Ptc peek = queue.peek();
            if (peek != null && System.currentTimeMillis() - peek.LJLIL.LJZ > C65907Ptn.LIZ().maxStoreInterval) {
                queue.poll();
            } else {
                return;
            }
        }
    }

    @Override // X.InterfaceC65913Ptt
    public final void LIZIZ(C65908Pto<C65896Ptc> queue, C65896Ptc element) {
        o.LJIIIZ(queue, "queue");
        o.LJIIIZ(element, "element");
    }
}
