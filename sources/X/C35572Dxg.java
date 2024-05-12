package X;

import android.os.MessageQueue;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Dxg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35572Dxg implements MessageQueue.IdleHandler {
    public static final C35572Dxg LJLIL = new C35572Dxg();

    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        Iterator it = ((LinkedHashMap) C35570Dxe.LIZLLL).entrySet().iterator();
        while (it.hasNext()) {
            ((Runnable) ((Map.Entry) it.next()).getValue()).run();
        }
        ((LinkedHashMap) C35570Dxe.LIZLLL).clear();
        return false;
    }
}
