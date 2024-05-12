package X;

import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: X.X8e, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84340X8e {
    public static X8W LIZ() {
        if (C84339X8d.LIZ != null) {
            return C74782wc.LIZ();
        }
        return null;
    }

    public static void LIZIZ(InterfaceC84349X8n interfaceC84349X8n) {
        if (C84339X8d.LIZ != null) {
            interfaceC84349X8n.LIZ(C74782wc.LIZ());
            return;
        }
        ConcurrentLinkedQueue<InterfaceC84349X8n> concurrentLinkedQueue = C84339X8d.LIZIZ;
        if (concurrentLinkedQueue.size() >= 5) {
            concurrentLinkedQueue.poll();
            concurrentLinkedQueue.offer(interfaceC84349X8n);
        } else {
            concurrentLinkedQueue.offer(interfaceC84349X8n);
        }
    }
}
