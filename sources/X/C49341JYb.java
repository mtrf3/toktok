package X;

import Y.IDrS47S0100000_8;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import kotlin.jvm.internal.o;

/* renamed from: X.JYb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49341JYb<T> {
    public static final /* synthetic */ int LJIIL = 0;
    public final RecyclerView LIZ;
    public final ExecutorService LIZIZ;
    public final InterfaceC88471Ynr<RecyclerView.ViewHolder, Integer, C76800UCe> LIZJ;
    public final InterfaceC49350JYk<T> LIZLLL;
    public final java.util.Set<Integer> LJ;
    public final InterfaceC49349JYj LJFF;
    public final InterfaceC88471Ynr<Integer, Integer, Boolean> LJI;
    public Field LJII;
    public Field LJIIIIZZ;
    public final JYZ<T> LJIIIZ;
    public final C49343JYd<RecyclerView.ViewHolder> LJIIJ;
    public final IDrS47S0100000_8 LJIIJJI;

    public C49341JYb(C49342JYc<T> c49342JYc) {
        RecyclerView recyclerView = c49342JYc.LIZ;
        this.LIZ = recyclerView;
        ExecutorService executorService = c49342JYc.LIZIZ;
        this.LIZIZ = executorService;
        this.LIZJ = c49342JYc.LIZJ;
        InterfaceC49350JYk<T> interfaceC49350JYk = c49342JYc.LIZLLL;
        this.LIZLLL = interfaceC49350JYk;
        java.util.Set<Integer> set = c49342JYc.LJ;
        this.LJ = set;
        InterfaceC49349JYj interfaceC49349JYj = c49342JYc.LJII;
        this.LJFF = interfaceC49349JYj;
        this.LJI = c49342JYc.LJFF;
        JYZ<T> jyz = new JYZ<>(recyclerView, interfaceC49350JYk, c49342JYc.LJIIIIZZ, interfaceC49349JYj.LJZ());
        this.LJIIIZ = jyz;
        this.LJIIJ = new C49343JYd<>(new C49348JYi(c49342JYc.LJI, executorService, "async bind"));
        this.LJIIJJI = new IDrS47S0100000_8(this, 4);
        recyclerView.setViewCacheExtension(jyz);
        if (set != null) {
            Iterator<Integer> it = set.iterator();
            while (it.hasNext()) {
                this.LIZ.getRecycledViewPool().setMaxRecycledViews(it.next().intValue(), 15);
            }
        }
        C0A2 layoutManager = this.LIZ.getLayoutManager();
        if (layoutManager != null) {
            layoutManager.LLF(JWC.LIZ.openPrefetch);
        }
        this.LIZ.LJIIJJI(this.LJIIJJI);
    }

    public final void LIZ(int i) {
        AbstractC029409q adapter;
        boolean z;
        if (!this.LIZLLL.LJJIJIL(i)) {
            return;
        }
        JYZ<T> jyz = this.LJIIIZ;
        C49344JYe<T> c49344JYe = jyz.LJI.get(Integer.valueOf(i));
        int i2 = 0;
        if ((c49344JYe == null || !o.LJ(c49344JYe.LIZIZ, jyz.LIZIZ.LJJIZ(i))) && !jyz.LJII.containsKey(Integer.valueOf(i)) && (adapter = this.LIZ.getAdapter()) != null) {
            int itemViewType = adapter.getItemViewType(i);
            java.util.Set<Integer> set = this.LJ;
            if (set != null) {
                z = set.contains(Integer.valueOf(itemViewType));
            } else {
                z = false;
            }
            boolean booleanValue = this.LJI.invoke(Integer.valueOf(itemViewType), Integer.valueOf(i)).booleanValue();
            if (!z && !booleanValue) {
                return;
            }
            JYZ<T> jyz2 = this.LJIIIZ;
            jyz2.getClass();
            C49344JYe<T> c49344JYe2 = new C49344JYe<>(i, jyz2.LIZIZ.LJJIZ(i));
            C49343JYd<RecyclerView.ViewHolder> c49343JYd = this.LJIIJ;
            CallableC49347JYh callableC49347JYh = new CallableC49347JYh(new C49340JYa(this, itemViewType, i, c49344JYe2));
            c49343JYd.getClass();
            try {
                if (!c49343JYd.LIZLLL.isShutdown()) {
                    CopyOnWriteArrayList<Future<JYV<RecyclerView.ViewHolder>>> LIZ = c49343JYd.LIZ(i);
                    int size = LIZ.size();
                    ConcurrentHashMap<Integer, CopyOnWriteArrayList<Future<JYV<RecyclerView.ViewHolder>>>> concurrentHashMap = c49343JYd.LIZ;
                    ArrayList arrayList = new ArrayList();
                    Iterator<Map.Entry<Integer, CopyOnWriteArrayList<Future<JYV<RecyclerView.ViewHolder>>>>> it = concurrentHashMap.entrySet().iterator();
                    while (it.hasNext()) {
                        ORS.LJJLIIIJILLIZJL(it.next().getValue(), arrayList);
                    }
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        i2 += !((Future) it2.next()).isDone() ? 1 : 0;
                    }
                    if (!c49343JYd.LIZJ.invoke(Integer.valueOf(i), Integer.valueOf(size), Integer.valueOf(i2), Boolean.valueOf(o.LJ(c49343JYd.LIZIZ.get(Integer.valueOf(i)), Boolean.TRUE))).booleanValue()) {
                        String valueOf = String.valueOf(i);
                        o.LJIIIZ(valueOf, "<set-?>");
                        callableC49347JYh.LJLILLLLZI = valueOf;
                        Future<JYV<RecyclerView.ViewHolder>> submit = c49343JYd.LIZLLL.submit(callableC49347JYh);
                        LIZ.add(submit);
                        if (submit == null) {
                            return;
                        }
                        c49344JYe2.LIZLLL = submit;
                        JYZ<T> jyz3 = this.LJIIIZ;
                        jyz3.getClass();
                        jyz3.LIZIZ();
                        C49344JYe<T> c49344JYe3 = jyz3.LJI.get(Integer.valueOf(i));
                        if (c49344JYe3 != null && jyz3.LIZIZ.LJJJLIIL(c49344JYe3.LIZIZ, c49344JYe2.LIZIZ)) {
                            try {
                                Future<JYV<RecyclerView.ViewHolder>> future = c49344JYe3.LIZLLL;
                                if (future != null) {
                                    future.cancel(true);
                                }
                            } catch (Exception unused) {
                            }
                        }
                        jyz3.LJI.put(Integer.valueOf(i), c49344JYe2);
                    }
                }
            } catch (Exception unused2) {
            }
        }
    }
}
