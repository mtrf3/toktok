package X;

import Y.ARunnableS1S1101000_6;
import Y.ARunnableS42S0100000_6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FDY {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C59012Th.LJLIL);
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C38604FDc.LJLIL);
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(C38606FDe.LJLIL);
    public static final C62822Ol8 LIZLLL = C221108m2.LIZIZ(C38605FDd.LJLIL);
    public static final C62822Ol8 LJ = C221108m2.LIZIZ(C38603FDb.LJLIL);
    public static final AtomicBoolean LJFF;
    public static final AtomicBoolean LJI;
    public static final AtomicBoolean LJII;
    public static final AtomicBoolean LJIIIIZZ;
    public static final AtomicBoolean LJIIIZ;

    static {
        C221108m2.LIZIZ(C38607FDf.LJLIL);
        LJFF = new AtomicBoolean(false);
        LJI = new AtomicBoolean(false);
        LJII = new AtomicBoolean(false);
        LJIIIIZZ = new AtomicBoolean(false);
        LJIIIZ = new AtomicBoolean(false);
    }

    public static int LIZ() {
        return ((Number) LIZ.getValue()).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZIZ() {
        Integer LJJIJIL;
        List<InterfaceC38616FDo> list;
        if (((Boolean) LJ.getValue()).booleanValue() && LJI.compareAndSet(false, true) && (LJJIJIL = C38891fp.LJJIJIL("common_feed_item_feed")) != null) {
            int intValue = LJJIJIL.intValue();
            C38619FDr.LIZLLL.getClass();
            if (!C38619FDr.LIZ.get()) {
                return;
            }
            ReentrantReadWriteLock.ReadLock readLock = FE8.LIZIZ.readLock();
            readLock.lock();
            try {
                List LIZLLL2 = FE8.LIZJ.LIZLLL(intValue);
                synchronized (LIZLLL2) {
                    FDZ fdz = new FDZ();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : LIZLLL2) {
                        if (((Boolean) fdz.invoke(obj)).booleanValue()) {
                            arrayList.add(obj);
                        }
                    }
                    if (!(!arrayList.isEmpty())) {
                        arrayList = null;
                    }
                    if (arrayList != null) {
                        ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(((FE5) it.next()).LJLJJL);
                        }
                        list = Collections.unmodifiableList(arrayList2);
                    } else {
                        list = null;
                    }
                }
                if (list == null) {
                    return;
                }
                ArrayList arrayList3 = new ArrayList(C32I.LJJL(list, 10));
                for (InterfaceC38616FDo interfaceC38616FDo : list) {
                    RunnableC38602FDa runnableC38602FDa = new RunnableC38602FDa(new ARunnableS1S1101000_6(interfaceC38616FDo, intValue, 2));
                    interfaceC38616FDo.LJ(runnableC38602FDa);
                    arrayList3.add(runnableC38602FDa);
                }
                if (!(!arrayList3.isEmpty())) {
                    return;
                }
                C38619FDr.LIZLLL.getClass();
                C38612FDk c38612FDk = C38619FDr.LIZIZ;
                if (c38612FDk != null) {
                    c38612FDk.LIZJ.execute(new ARunnableS42S0100000_6(arrayList3, 158));
                } else {
                    o.LJIJI("config");
                    throw null;
                }
            } finally {
                readLock.unlock();
            }
        }
    }
}
