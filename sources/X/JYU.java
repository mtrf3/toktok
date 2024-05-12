package X;

import android.os.SystemClock;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JYU<T> {
    public static final /* synthetic */ int LJI = 0;
    public final InterfaceC88471Ynr<ViewGroup, Integer, RecyclerView.ViewHolder> LIZ;
    public final InterfaceC88471Ynr<RecyclerView.ViewHolder, Integer, C76800UCe> LIZIZ;
    public final C62822Ol8 LIZJ;
    public final C49345JYf LIZLLL;
    public final C49341JYb<T> LJ;
    public final JYY LJFF;

    public final void LIZIZ() {
        C49341JYb<T> c49341JYb = this.LJ;
        if (c49341JYb != null) {
            C49343JYd<RecyclerView.ViewHolder> c49343JYd = c49341JYb.LJIIJ;
            Iterator LIZLLL = C47135Ieh.LIZLLL(c49343JYd.LIZ, "futureMap.values");
            while (LIZLLL.hasNext()) {
                CopyOnWriteArrayList futures = (CopyOnWriteArrayList) LIZLLL.next();
                o.LJIIIIZZ(futures, "futures");
                Iterator it = futures.iterator();
                while (it.hasNext()) {
                    ((Future) it.next()).cancel(true);
                }
                futures.clear();
            }
            c49343JYd.LIZ.clear();
            c49343JYd.LIZIZ.clear();
            JYZ<T> jyz = c49341JYb.LJIIIZ;
            Collection<C49344JYe<T>> values = jyz.LJI.values();
            o.LJIIIIZZ(values, "cachedViewHolder.values");
            ArrayList arrayList = new ArrayList();
            Iterator<C49344JYe<T>> it2 = values.iterator();
            while (it2.hasNext()) {
                RecyclerView.ViewHolder viewHolder = it2.next().LIZJ;
                if (viewHolder != null) {
                    arrayList.add(viewHolder);
                }
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                RecyclerView.ViewHolder viewHolder2 = (RecyclerView.ViewHolder) it3.next();
                if (viewHolder2 != null) {
                    jyz.LIZ.getRecycledViewPool().putRecycledView(viewHolder2);
                }
            }
            jyz.LJI.clear();
            jyz.LJII.clear();
        }
    }

    public final ExecutorService LIZLLL() {
        Object value = this.LIZJ.getValue();
        o.LJIIIIZZ(value, "<get-executor>(...)");
        return (ExecutorService) value;
    }

    public JYU(RecyclerView recyclerView, JWM<T> jwm) {
        C49345JYf c49345JYf;
        InterfaceC88471Ynr<ViewGroup, Integer, RecyclerView.ViewHolder> interfaceC88471Ynr = jwm.LIZ;
        this.LIZ = interfaceC88471Ynr;
        InterfaceC88471Ynr<RecyclerView.ViewHolder, Integer, C76800UCe> interfaceC88471Ynr2 = jwm.LIZIZ;
        this.LIZIZ = interfaceC88471Ynr2;
        JWP jwp = jwm.LIZJ;
        JYI<T> jyi = jwm.LIZLLL;
        this.LIZJ = C221108m2.LIZIZ(JWO.INSTANCE);
        if (jwp == null) {
            c49345JYf = null;
        } else {
            c49345JYf = new C49345JYf(new C49346JYg(recyclerView, interfaceC88471Ynr, LIZLLL(), jwp.LIZ, jwp.LIZIZ, jwp.LIZJ));
        }
        this.LIZLLL = c49345JYf;
        C49341JYb<T> c49341JYb = jyi != null ? new C49341JYb<>(new C49342JYc(recyclerView, LIZLLL(), interfaceC88471Ynr2, jyi.LIZ, jyi.LIZIZ, jyi.LIZJ, jyi.LIZLLL, jyi.LJ, jyi.LJFF)) : null;
        this.LJ = c49341JYb;
        this.LJFF = new JYY(c49341JYb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ(RecyclerView.ViewHolder viewHolder, int i) {
        List LIZ;
        o.LJIIIZ(viewHolder, "viewHolder");
        C49341JYb<T> c49341JYb = this.LJ;
        if (c49341JYb != null) {
            if ((viewHolder instanceof JW4) && (LIZ = C49262JVa.LIZ((JW4) viewHolder)) != null) {
                Iterator it = LIZ.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
            }
            java.util.Set<Integer> set = JYW.LIZIZ;
            if (set.contains(Integer.valueOf(viewHolder.itemView.hashCode()))) {
                set.remove(Integer.valueOf(viewHolder.itemView.hashCode()));
                return;
            } else {
                c49341JYb.LIZJ.invoke(viewHolder, Integer.valueOf(i));
                return;
            }
        }
        this.LIZIZ.invoke(viewHolder, Integer.valueOf(i));
    }

    public final RecyclerView.ViewHolder LIZJ(ViewGroup parent, int i) {
        Future<JYV<RecyclerView.ViewHolder>> future;
        JYV<RecyclerView.ViewHolder> jyv;
        RecyclerView.ViewHolder viewHolder;
        o.LJIIIZ(parent, "parent");
        C49345JYf c49345JYf = this.LIZLLL;
        if (c49345JYf != null) {
            long uptimeMillis = SystemClock.uptimeMillis();
            String valueOf = String.valueOf(i);
            C49343JYd<RecyclerView.ViewHolder> c49343JYd = c49345JYf.LJFF;
            CopyOnWriteArrayList<Future<JYV<RecyclerView.ViewHolder>>> LIZ = c49343JYd.LIZ(i);
            if (LIZ.size() > 0) {
                future = LIZ.remove(0);
            } else {
                future = null;
            }
            if (future == null || future.isCancelled()) {
                jyv = new JYV<>(2, null, 28);
            } else {
                try {
                    jyv = future.get(100L, TimeUnit.MICROSECONDS);
                    if (jyv.LIZIZ == 1) {
                        c49343JYd.LIZIZ.put(Integer.valueOf(i), Boolean.TRUE);
                    }
                } catch (Exception unused) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("waitForResult time out : ");
                    LIZ2.append(100L);
                    LIZ2.append(" ms");
                    jyv = new JYV<>(1, new C49352JYm(X1D.LIZIZ(LIZ2)), 24);
                }
            }
            long uptimeMillis2 = SystemClock.uptimeMillis() - uptimeMillis;
            int i2 = jyv.LIZIZ;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        JYX jyx = c49345JYf.LJ;
                        if (jyx != null) {
                            StringBuilder LIZ3 = X1D.LIZ();
                            LIZ3.append("result status is ");
                            LIZ3.append(jyv.LIZIZ);
                            jyx.LIZJ(0, valueOf, uptimeMillis2, new Exception(X1D.LIZIZ(LIZ3)));
                        }
                        viewHolder = c49345JYf.LIZ.invoke(parent, Integer.valueOf(i));
                    } else {
                        JYX jyx2 = c49345JYf.LJ;
                        if (jyx2 != null) {
                            jyx2.LIZ(0, valueOf);
                        }
                        viewHolder = c49345JYf.LIZ.invoke(parent, Integer.valueOf(i));
                    }
                } else {
                    JYX jyx3 = c49345JYf.LJ;
                    if (jyx3 != null) {
                        jyx3.LIZJ(0, valueOf, uptimeMillis2, jyv.LIZJ);
                    }
                    viewHolder = c49345JYf.LIZ.invoke(parent, Integer.valueOf(i));
                }
            } else {
                JYX jyx4 = c49345JYf.LJ;
                if (jyx4 != null) {
                    jyx4.LIZIZ(0, jyv.LIZLLL, uptimeMillis2, valueOf);
                }
                viewHolder = jyv.LIZ;
            }
            if (viewHolder != null) {
                return viewHolder;
            }
        }
        return this.LIZ.invoke(parent, Integer.valueOf(i));
    }
}
