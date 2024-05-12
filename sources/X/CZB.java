package X;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.performance.LiveRecyclerviewPerformanceOptSwitchSetting;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes6.dex */
public final class CZB {
    public static C81125Vsf LJ;
    public static Context LJFF;
    public static RecyclerView LJI;
    public static final CZB LIZ = new CZB();
    public static final Thread LIZIZ = C16880lQ.LLLLIIIILLL();
    public static final ConcurrentHashMap<Integer, List<CZG>> LIZJ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<Class<?>, CZF> LIZLLL = new ConcurrentHashMap<>();
    public static final C62822Ol8 LJII = C221108m2.LIZIZ(C8B.LJLIL);

    public static void LJFF(View view) {
        MutableContextWrapper mutableContextWrapper;
        Context context = view.getContext();
        if (!(context instanceof MutableContextWrapper) || (mutableContextWrapper = (MutableContextWrapper) context) == null) {
            return;
        }
        mutableContextWrapper.setBaseContext(LJFF);
    }

    public final synchronized View LIZJ(int i, boolean z) {
        boolean z2;
        View view;
        CZG czg;
        ConcurrentHashMap<Integer, List<CZG>> concurrentHashMap = LIZJ;
        List<CZG> list = concurrentHashMap.get(Integer.valueOf(i));
        View view2 = null;
        if (list != null) {
            boolean z3 = false;
            if (list.size() <= 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!z2) {
                list = null;
            }
            if (list != null) {
                try {
                    czg = (CZG) ORS.LJJLL(list);
                    if (czg == null) {
                        z3 = true;
                    }
                } catch (Exception e) {
                    C0NB.LJI("ViewHolderLayoutPreloadManager", e);
                    view = null;
                }
                if (z3) {
                    return null;
                }
                if (list.size() < czg.LIZJ) {
                    C38995FSd.LIZLLL().submit(new CZE(i, czg, z));
                }
                if (czg.LIZJ == 0 && list.size() == 0) {
                    concurrentHashMap.remove(Integer.valueOf(i));
                }
                if (czg.LIZIZ) {
                    LockSupport.parkNanos(czg, 20000L);
                    view = czg.LIZ;
                } else {
                    view = czg.LIZ;
                }
                if (view != null) {
                    LIZ.getClass();
                    LJFF(view);
                    view2 = view;
                }
            }
        }
        return view2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0023, code lost:
    
        if (r0 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(int r6, int r7, boolean r8) {
        /*
            X.CZG r4 = new X.CZG
            X.Vsf r3 = X.CZB.LJ
            r4.<init>(r6, r3)
            r5 = 1
            r4.LIZIZ = r5
            r4.LIZJ = r7
            android.content.Context r2 = X.CZB.LJFF
            if (r2 == 0) goto L25
            X.CZB r0 = X.CZB.LIZ
            r0.getClass()
            X.Ol8 r0 = X.CZB.LJII
            java.lang.Object r1 = r0.getValue()
            com.bytedance.android.livesdkapi.host.IHostPerformanceOpt r1 = (com.bytedance.android.livesdkapi.host.IHostPerformanceOpt) r1
            androidx.recyclerview.widget.RecyclerView r0 = X.CZB.LJI
            android.view.View r0 = r1.ib0(r6, r2, r0, r8)
            if (r0 != 0) goto L2d
        L25:
            if (r3 == 0) goto L64
            androidx.recyclerview.widget.RecyclerView r0 = X.CZB.LJI
            android.view.View r0 = r3.inflate(r6, r0, r8)
        L2d:
            r4.LIZ = r0
            r3 = 0
            r4.LIZIZ = r3
            android.content.Context r0 = X.CZB.LJFF
            if (r0 == 0) goto L53
            android.view.View r1 = r4.LIZ
            if (r1 == 0) goto L42
            X.CZB r0 = X.CZB.LIZ
            r0.getClass()
            LJFF(r1)
        L42:
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, java.util.List<X.CZG>> r2 = X.CZB.LIZJ
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            java.lang.Object r0 = r2.get(r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L54
            r0.add(r4)
        L53:
            return
        L54:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            X.CZG[] r0 = new X.CZG[r5]
            r0[r3] = r4
            java.util.List r0 = X.C47261Igj.LJJIJIL(r0)
            r2.put(r1, r0)
            goto L53
        L64:
            r0 = 0
            goto L2d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CZB.LIZ(int, int, boolean):void");
    }

    public static void LIZLLL(int i, int i2, int i3) {
        if (LJFF != null && LiveRecyclerviewPerformanceOptSwitchSetting.INSTANCE.enableViewHolderLayoutPreload()) {
            C38995FSd.LIZLLL().submit(new CZC(i2, i, i3));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View LIZIZ(int r3, android.view.ViewGroup r4, boolean r5) {
        /*
            r2 = this;
            com.bytedance.android.livesdk.livesetting.performance.LiveRecyclerviewPerformanceOptSwitchSetting r0 = com.bytedance.android.livesdk.livesetting.performance.LiveRecyclerviewPerformanceOptSwitchSetting.INSTANCE
            boolean r0 = r0.enableViewHolderLayoutPreload()
            if (r0 == 0) goto L20
            r0 = 0
            android.view.View r1 = r2.LIZJ(r3, r0)
            if (r1 == 0) goto L17
            if (r5 == 0) goto L16
            if (r4 == 0) goto L16
            r4.addView(r1)
        L16:
            return r1
        L17:
            X.Vsf r0 = X.CZB.LJ
            if (r0 == 0) goto L2a
            android.view.View r1 = r0.inflate(r3, r4, r5)
            goto L28
        L20:
            X.Vsf r0 = X.CZB.LJ
            if (r0 == 0) goto L2a
            android.view.View r1 = r0.inflate(r3, r4, r5)
        L28:
            if (r1 != 0) goto L16
        L2a:
            if (r4 == 0) goto L32
            android.view.View r1 = X.C29306Beo.LJIIIIZZ(r3, r4, r5)
            if (r1 != 0) goto L16
        L32:
            android.content.Context r0 = X.C15380j0.LIZLLL()
            android.view.LayoutInflater r0 = X.C16880lQ.LLZIL(r0)
            android.view.View r1 = X.C16880lQ.LLLLIILL(r0, r3, r4, r5)
            java.lang.String r0 = "from(ResUtil.getContext(…Id, parent, attachToRoot)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CZB.LIZIZ(int, android.view.ViewGroup, boolean):android.view.View");
    }

    public static void LJ(Class cls, int i, int i2, int i3) {
        if (LJFF == null) {
            return;
        }
        LIZLLL.put(cls, new CZF(i));
        if (LiveRecyclerviewPerformanceOptSwitchSetting.INSTANCE.enableViewHolderLayoutPreload()) {
            C38995FSd.LIZLLL().submit(new CZD(i2, i, i3));
        }
    }
}
