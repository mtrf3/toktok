package X;

import android.os.Handler;
import android.os.Message;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import kotlin.jvm.internal.o;

/* renamed from: X.M2o, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56166M2o implements Handler.Callback {
    public static final C56166M2o LJLIL = new C56166M2o();

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message msg) {
        C56167M2p c56167M2p;
        o.LJIIIZ(msg, "msg");
        if (msg.what != 1) {
            return false;
        }
        Object obj = msg.obj;
        if (!(obj instanceof C56167M2p) || (c56167M2p = (C56167M2p) obj) == null) {
            return false;
        }
        if (c56167M2p.LJFF) {
            List<C56167M2p<?>> list = C56165M2n.LIZ;
            if (!(list instanceof Collection) || !((ArrayList) list).isEmpty()) {
                Iterator it = ((ArrayList) list).iterator();
                while (it.hasNext()) {
                    if (o.LJ(c56167M2p.LIZ, ((C56167M2p) it.next()).LIZ)) {
                        break;
                    }
                }
            }
            ((ArrayList) C56165M2n.LIZ).add(c56167M2p);
            Iterator<C56167M2p<?>> it2 = C56165M2n.LIZIZ.iterator();
            ArrayList arrayList = new ArrayList();
            while (it2.hasNext()) {
                C56167M2p<?> next = it2.next();
                if (next.LIZJ.contains(c56167M2p.LIZ)) {
                    next.LJII.put(c56167M2p.LIZ, Boolean.TRUE);
                    java.util.Map<String, Boolean> map = next.LJII;
                    if (!map.isEmpty()) {
                        Iterator it3 = ((LinkedHashMap) map).entrySet().iterator();
                        while (it3.hasNext()) {
                            if (!((Boolean) ((Map.Entry) it3.next()).getValue()).booleanValue()) {
                                break;
                            }
                        }
                    }
                    arrayList.add(C56167M2p.LIZ(next));
                    it2.remove();
                }
            }
            if (!arrayList.isEmpty()) {
                arrayList.add(C56167M2p.LIZ(c56167M2p));
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    InterfaceC88472Yns<List<? extends C56167M2p<?>>, C76800UCe> interfaceC88472Yns = ((C56167M2p) it4.next()).LJI;
                    if (interfaceC88472Yns != null) {
                        interfaceC88472Yns.invoke(ORZ.LLJI(arrayList));
                    }
                }
            }
        } else {
            ArrayList arrayList2 = new ArrayList();
            Iterator it5 = ((ArrayList) C56165M2n.LIZ).iterator();
            while (it5.hasNext()) {
                C56167M2p c56167M2p2 = (C56167M2p) it5.next();
                if (c56167M2p.LIZJ.contains(c56167M2p2.LIZ)) {
                    c56167M2p.LJII.put(c56167M2p2.LIZ, Boolean.TRUE);
                    arrayList2.add(c56167M2p2);
                }
            }
            java.util.Map<String, Boolean> map2 = c56167M2p.LJII;
            if (!map2.isEmpty()) {
                Iterator it6 = ((LinkedHashMap) map2).entrySet().iterator();
                while (it6.hasNext()) {
                    if (!((Boolean) ((Map.Entry) it6.next()).getValue()).booleanValue()) {
                        Queue<C56167M2p<?>> queue = C56165M2n.LIZIZ;
                        Iterator<C56167M2p<?>> it7 = queue.iterator();
                        int size = ((LinkedList) queue).size();
                        int i = -1;
                        while (it7.hasNext()) {
                            C56167M2p<?> next2 = it7.next();
                            i++;
                            if (i > size - 1) {
                                break;
                            }
                            if (c56167M2p.LJ.contains(next2.LIZ)) {
                                it7.remove();
                            } else if (o.LJ(next2.LIZ, c56167M2p.LIZ) && !c56167M2p.LIZLLL) {
                                it7.remove();
                            }
                        }
                        ((LinkedList) C56165M2n.LIZIZ).offer(c56167M2p);
                    }
                }
            }
            arrayList2.add(c56167M2p);
            InterfaceC88472Yns<List<? extends C56167M2p<?>>, C76800UCe> interfaceC88472Yns2 = c56167M2p.LJI;
            if (interfaceC88472Yns2 != null) {
                interfaceC88472Yns2.invoke(arrayList2);
            }
        }
        return true;
    }
}
