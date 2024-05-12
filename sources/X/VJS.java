package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AqS112S0101000_14;
import kotlin.jvm.internal.AqS161S0200000_14;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class VJS extends VJW {
    public final void LIZ() {
        int i;
        int i2;
        OC6.LIZIZ(new AqS164S0100000_14(this, 301));
        try {
            this.LJLILLLLZI.run();
            AtomicInteger atomicInteger = this.LJLILLLLZI.LJLIL;
            int ordinal = VJP.Running.ordinal();
            VJP vjp = VJP.Finished;
            if (!atomicInteger.compareAndSet(ordinal, vjp.ordinal())) {
                OC6.LIZIZ(new AqS164S0100000_14(this, 302));
                this.LJLILLLLZI.LJLIL.set(vjp.ordinal());
            }
            VJR vjr = this.LJLIL.get();
            if (vjr != null) {
                LinkedList<VJO> linkedList = vjr.LJLIL;
                synchronized (linkedList) {
                    OC6.LIZIZ(new AqS161S0200000_14(this, vjr, 38));
                    vjr.LJLILLLLZI.remove(Integer.valueOf(this.LJLILLLLZI.LJLJJI));
                    Iterator<VJO> it = linkedList.iterator();
                    o.LJFF(it, "pendingQueue.iterator()");
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    while (true) {
                        if (it.hasNext()) {
                            VJO next = it.next();
                            o.LJFF(next, "iterator.next()");
                            VJO vjo = next;
                            if (vjo.LJLIL.get() != VJP.Waiting.ordinal()) {
                                OC6.LIZIZ(new AqS164S0100000_14(vjo, 303));
                                it.remove();
                            } else {
                                Integer num = (Integer) ((LinkedHashMap) vjr.LJLJI).get(Integer.valueOf(vjo.LJLJJI));
                                if (num != null) {
                                    i2 = num.intValue();
                                } else {
                                    i2 = 0;
                                }
                                if (linkedHashSet.contains(Integer.valueOf(vjo.LJLJJI))) {
                                    OC6.LIZIZ(new AqS112S0101000_14(vjo, i2, 5));
                                } else if (vjr.LJLILLLLZI.contains(Integer.valueOf(vjo.LJLJJI))) {
                                    continue;
                                } else {
                                    if (vjo.LJLJI - i2 == 1) {
                                        OC6.LIZIZ(new AqS112S0101000_14(vjo, i2, 6));
                                        it.remove();
                                        vjr.execute(new VJS(vjr, vjo));
                                        break;
                                    }
                                    linkedHashSet.add(Integer.valueOf(vjo.LJLJJI));
                                    OC6.LIZIZ(new AqS112S0101000_14(vjo, i2, 7));
                                }
                            }
                        } else {
                            OC6.LIZIZ(new AqS161S0200000_14(vjr, linkedList, 39));
                            break;
                        }
                    }
                }
                return;
            }
            OC6.LJFF(VJY.LJLIL);
        } catch (Throwable th) {
            AtomicInteger atomicInteger2 = this.LJLILLLLZI.LJLIL;
            int ordinal2 = VJP.Running.ordinal();
            VJP vjp2 = VJP.Finished;
            if (!atomicInteger2.compareAndSet(ordinal2, vjp2.ordinal())) {
                OC6.LIZIZ(new AqS164S0100000_14(this, 302));
                this.LJLILLLLZI.LJLIL.set(vjp2.ordinal());
            }
            VJR vjr2 = this.LJLIL.get();
            if (vjr2 != null) {
                LinkedList<VJO> linkedList2 = vjr2.LJLIL;
                synchronized (linkedList2) {
                    OC6.LIZIZ(new AqS161S0200000_14(this, vjr2, 40));
                    vjr2.LJLILLLLZI.remove(Integer.valueOf(this.LJLILLLLZI.LJLJJI));
                    Iterator<VJO> it2 = linkedList2.iterator();
                    o.LJFF(it2, "pendingQueue.iterator()");
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                    while (true) {
                        if (it2.hasNext()) {
                            VJO next2 = it2.next();
                            o.LJFF(next2, "iterator.next()");
                            VJO vjo2 = next2;
                            if (vjo2.LJLIL.get() != VJP.Waiting.ordinal()) {
                                OC6.LIZIZ(new AqS164S0100000_14(vjo2, 303));
                                it2.remove();
                            } else {
                                Integer num2 = (Integer) ((LinkedHashMap) vjr2.LJLJI).get(Integer.valueOf(vjo2.LJLJJI));
                                if (num2 != null) {
                                    i = num2.intValue();
                                } else {
                                    i = 0;
                                }
                                if (linkedHashSet2.contains(Integer.valueOf(vjo2.LJLJJI))) {
                                    OC6.LIZIZ(new AqS112S0101000_14(vjo2, i, 5));
                                } else if (vjr2.LJLILLLLZI.contains(Integer.valueOf(vjo2.LJLJJI))) {
                                    continue;
                                } else {
                                    if (vjo2.LJLJI - i == 1) {
                                        OC6.LIZIZ(new AqS112S0101000_14(vjo2, i, 6));
                                        it2.remove();
                                        vjr2.execute(new VJS(vjr2, vjo2));
                                        break;
                                    }
                                    linkedHashSet2.add(Integer.valueOf(vjo2.LJLJJI));
                                    OC6.LIZIZ(new AqS112S0101000_14(vjo2, i, 7));
                                }
                            }
                        } else {
                            OC6.LIZIZ(new AqS161S0200000_14(vjr2, linkedList2, 41));
                            break;
                        }
                    }
                }
            } else {
                OC6.LJFF(VJY.LJLIL);
            }
            throw th;
        }
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VJS(VJR vjr, VJO task) {
        super(vjr, task);
        o.LJIIJ(task, "task");
        AtomicInteger atomicInteger = task.LJLIL;
        int ordinal = VJP.Waiting.ordinal();
        VJP vjp = VJP.Running;
        if (!atomicInteger.compareAndSet(ordinal, vjp.ordinal())) {
            OC6.LIZIZ(new AqS164S0100000_14(task, 300));
            task.LJLIL.set(vjp.ordinal());
        }
        OC6.LIZIZ(new AqS161S0200000_14(vjr, task, 37));
        vjr.LJLILLLLZI.add(Integer.valueOf(task.LJLJJI));
        vjr.LJLJI.put(Integer.valueOf(task.LJLJJI), Integer.valueOf(task.LJLJI));
    }
}
