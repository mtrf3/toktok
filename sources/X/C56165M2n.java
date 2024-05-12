package X;

import android.os.Handler;
import android.os.Message;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import kotlin.jvm.internal.o;

/* renamed from: X.M2n, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56165M2n {
    public static final List<C56167M2p<?>> LIZ = new ArrayList();
    public static final Queue<C56167M2p<?>> LIZIZ = new LinkedList();
    public static final Handler LIZJ = new Handler(C16880lQ.LLJJJJ(), C56166M2o.LJLIL);

    public static C56167M2p LIZ(String str) {
        Object obj;
        Object obj2;
        Iterator it = ((ArrayList) LIZ).iterator();
        while (true) {
            obj = null;
            if (it.hasNext()) {
                obj2 = it.next();
                if (o.LJ(((C56167M2p) obj2).LIZ, str)) {
                    break;
                }
            } else {
                obj2 = null;
                break;
            }
        }
        C56167M2p c56167M2p = (C56167M2p) obj2;
        if (c56167M2p != null) {
            return c56167M2p;
        }
        Iterator<T> it2 = LIZIZ.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (o.LJ(((C56167M2p) next).LIZ, str)) {
                obj = next;
                break;
            }
        }
        return (C56167M2p) obj;
    }

    public static void LIZIZ(C56167M2p c56167M2p) {
        Handler handler = LIZJ;
        Message obtain = Message.obtain();
        obtain.what = 1;
        obtain.obj = c56167M2p;
        handler.sendMessage(obtain);
    }
}
