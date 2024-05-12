package X;

import com.bytedance.poplayer.core.PopupManager;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.LuJ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC55747LuJ implements Runnable {
    public static final RunnableC55747LuJ LJLIL = new RunnableC55747LuJ();

    public static void LIZ() {
        InterfaceC55643Lsd interfaceC55643Lsd;
        C44384HbQ.LLFZ("==== startPendingList ===");
        CopyOnWriteArrayList<InterfaceC55643Lsd> copyOnWriteArrayList = PopupManager.LJI;
        if (copyOnWriteArrayList.isEmpty()) {
            C44384HbQ.LLFZ("==== pendingList isEmpty. Pop show finish... ===");
            return;
        }
        Iterator<InterfaceC55643Lsd> it = copyOnWriteArrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                interfaceC55643Lsd = it.next();
                if (interfaceC55643Lsd.isSceneActive()) {
                    break;
                }
            } else {
                interfaceC55643Lsd = null;
                break;
            }
        }
        InterfaceC55643Lsd interfaceC55643Lsd2 = interfaceC55643Lsd;
        if (interfaceC55643Lsd2 == null) {
            return;
        }
        PopupManager.LJIIJJI(interfaceC55643Lsd2);
        PopupManager.LJI.remove(interfaceC55643Lsd2);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
