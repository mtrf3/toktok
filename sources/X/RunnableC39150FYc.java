package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.sliver.SliverAllThreadSupport;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.FYc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class RunnableC39150FYc implements Runnable {
    public final int LJLIL;
    public List<Thread> LJLILLLLZI;

    public final void LIZ() {
        List<Thread> allThread = SliverAllThreadSupport.getAllThread();
        if (this.LJLILLLLZI == null) {
            LIZIZ(allThread);
        } else {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Thread thread : allThread) {
                if (!this.LJLILLLLZI.contains(thread)) {
                    arrayList.add(thread);
                }
            }
            for (Thread thread2 : this.LJLILLLLZI) {
                if (!allThread.contains(thread2)) {
                    arrayList2.add(thread2);
                }
            }
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                int i = 1;
                while (true) {
                    List<C39149FYb> list = SliverAllThreadSupport.threadGroups;
                    if (i < list.size()) {
                        C39149FYb c39149FYb = (C39149FYb) ListProtector.get(list, i);
                        synchronized (c39149FYb) {
                            if (!c39149FYb.LIZJ.isEmpty()) {
                                if (c39149FYb.LIZJ.remove(next)) {
                                    c39149FYb.LJI = true;
                                }
                            }
                            i++;
                        }
                        break;
                    }
                }
            }
            LIZIZ(arrayList);
        }
        this.LJLILLLLZI = allThread;
        Iterator<C39149FYb> it2 = SliverAllThreadSupport.threadGroups.iterator();
        while (it2.hasNext()) {
            it2.next().LIZIZ();
        }
        SliverAllThreadSupport.newThreadHandler().postDelayed(this, this.LJLIL);
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

    public RunnableC39150FYc(int i) {
        this.LJLIL = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZIZ(List list) {
        int size = list.size();
        int i = 0;
        while (true) {
            int i2 = 1;
            while (i < size) {
                List<C39149FYb> list2 = SliverAllThreadSupport.threadGroups;
                C39149FYb c39149FYb = (C39149FYb) ListProtector.get(list2, i2);
                Object obj = ListProtector.get(list, i);
                synchronized (c39149FYb) {
                    c39149FYb.LIZJ.add(obj);
                    c39149FYb.LJI = true;
                }
                i++;
                i2++;
                if (i2 >= list2.size()) {
                    break;
                }
            }
            return;
        }
    }
}
