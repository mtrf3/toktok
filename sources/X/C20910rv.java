package X;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.performance.LiveClearConstraintSetSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadOptimizationV1Setting;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.android.livesdk.livesetting.performance.LiveWatchLayoutPreloadLogOpt;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.o;

/* renamed from: X.0rv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20910rv {
    public static C20830rn LJI;
    public static C20830rn LJII;
    public static Context LJIIIIZZ;
    public static boolean LJIIIZ;
    public static C81246Vuc LJIIJ;
    public static AnonymousClass064 LJIILJJIL;
    public static AnonymousClass064 LJIILL;
    public static final C20910rv LIZ = new C20910rv();
    public static long LIZIZ = -1;
    public static final Thread LIZJ = C16880lQ.LLLLIIIILLL();
    public static final SparseArray<C20840ro> LIZLLL = new SparseArray<>();
    public static final ConcurrentHashMap<Integer, C20810rl> LJ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<Integer, List<C20810rl>> LJFF = new ConcurrentHashMap<>();
    public static EnumC20870rr LJIIJJI = EnumC20870rr.UN_SET;
    public static final ConcurrentHashMap<EnumC20870rr, ConcurrentHashMap<Integer, C20810rl>> LJIIL = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<EnumC20870rr, ConcurrentHashMap<Integer, C20810rl>> LJIILIIL = new ConcurrentHashMap<>();
    public static final C62822Ol8 LJIILLIIL = C221108m2.LIZIZ(C24M.LJLIL);

    public static void LIZIZ() {
        C20910rv c20910rv;
        String str;
        String str2;
        EnumC20860rq enumC20860rq;
        String str3;
        Iterator<Map.Entry<EnumC20870rr, ConcurrentHashMap<Integer, C20810rl>>> it = LJIIL.entrySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            c20910rv = LIZ;
            if (!hasNext) {
                break;
            }
            Map.Entry<EnumC20870rr, ConcurrentHashMap<Integer, C20810rl>> next = it.next();
            if (LJIIJJI.isAtLeast(next.getKey())) {
                for (Map.Entry<Integer, C20810rl> entry : next.getValue().entrySet()) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("do pending ");
                    C20890rt c20890rt = entry.getValue().LIZLLL;
                    if (c20890rt != null) {
                        str3 = c20890rt.LIZ;
                    } else {
                        str3 = null;
                    }
                    LIZ2.append(str3);
                    LIZ2.append(" currentStatus = ");
                    LIZ2.append(LJIIJJI);
                    LIZ2.append(" preloadLevel = ");
                    LIZ2.append(next.getKey());
                    C0NB.LJIIIZ("LayoutPreloadManager", X1D.LIZIZ(LIZ2));
                    LIZJ(entry.getKey().intValue(), entry.getValue().LIZIZ, entry.getValue().LIZLLL, entry.getValue().LJFF);
                }
                next.getValue().clear();
            }
        }
        for (Map.Entry<EnumC20870rr, ConcurrentHashMap<Integer, C20810rl>> entry2 : LJIILIIL.entrySet()) {
            if (LJIIJJI.isAtLeast(entry2.getKey())) {
                for (Map.Entry<Integer, C20810rl> entry3 : entry2.getValue().entrySet()) {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("do pending ");
                    C20890rt c20890rt2 = entry3.getValue().LIZLLL;
                    if (c20890rt2 != null) {
                        str = c20890rt2.LIZ;
                    } else {
                        str = null;
                    }
                    LIZ3.append(str);
                    LIZ3.append(" currentStatus = ");
                    LIZ3.append(LJIIJJI);
                    LIZ3.append(" preloadLevel = ");
                    LIZ3.append(entry2.getKey());
                    C0NB.LJIIIZ("LayoutPreloadManager", X1D.LIZIZ(LIZ3));
                    int intValue = entry3.getKey().intValue();
                    ViewGroup viewGroup = entry3.getValue().LIZIZ;
                    int i = entry3.getValue().LJ;
                    C20890rt c20890rt3 = entry3.getValue().LIZLLL;
                    if (c20890rt3 != null) {
                        str2 = c20890rt3.LIZ;
                    } else {
                        str2 = null;
                    }
                    C20890rt c20890rt4 = entry3.getValue().LIZLLL;
                    if (c20890rt4 == null || (enumC20860rq = c20890rt4.LIZIZ) == null) {
                        enumC20860rq = EnumC20860rq.FOUNDATION;
                    }
                    c20910rv.LJ(intValue, i, viewGroup, enumC20860rq, str2, entry3.getValue().LJFF);
                }
                entry2.getValue().clear();
            }
        }
    }

    public static boolean LJIIZILJ() {
        String str;
        Context context = LJIIIIZZ;
        if (context != null) {
            str = C16880lQ.LJLLJ(context.getClass());
        } else {
            str = null;
        }
        if (!o.LJ(str, "LivePlayActivity") ? !LiveWatchLayoutPreloadLogOpt.isEnableAnchor() : !LiveWatchLayoutPreloadLogOpt.isEnableWatch()) {
            return false;
        }
        return true;
    }

    public static View LJIIIIZZ(int i) {
        View view;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C20810rl remove = LJ.remove(Integer.valueOf(i));
        if (remove == null) {
            view = null;
        } else {
            remove.LJII = true;
            if (remove.LJIIIIZZ) {
                LockSupport.parkNanos(remove, 20000L);
                view = remove.LJI;
            } else {
                view = remove.LJI;
            }
        }
        C20890rt LJIJI = LJIJI(remove, i, elapsedRealtime);
        if (LJIIZILJ()) {
            C20790rj.LIZ.LIZJ(LJIJI);
        }
        return view;
    }

    public static View LJIIIZ(int i) {
        View view;
        boolean z;
        boolean enable = LiveLayoutPreloadSetting.INSTANCE.enable();
        C20800rk.LIZJ(i);
        if (enable) {
            view = LJIIIIZZ(i);
        } else {
            view = null;
        }
        Context context = LJIIIIZZ;
        if (view == null) {
            z = true;
        } else {
            z = false;
        }
        C20800rk.LIZ(context, i, true ^ z);
        return view;
    }

    public static void LJIIL(Context context) {
        String str;
        C81246Vuc c81246Vuc;
        if (context != null) {
            str = C16880lQ.LJLLJ(context.getClass());
        } else {
            str = null;
        }
        LJIIIZ = o.LJ(str, "LivePlayActivity");
        LJIIIIZZ = context;
        if (context != null) {
            C0YG.LIZ(context);
            MutableContextWrapper mutableContextWrapper = new MutableContextWrapper(context);
            if (C28329B9x.LIZJ(context)) {
                mutableContextWrapper.setTheme(C259710f.LIZ.LJFF(context));
            }
            LJI = new C20830rn(mutableContextWrapper);
            LJII = new C20830rn(mutableContextWrapper);
            if (!LJIIIZ) {
                Iterator LIZLLL2 = C47135Ieh.LIZLLL(LJ, "asyncItemMap.values");
                while (LIZLLL2.hasNext()) {
                    View view = ((C20810rl) LIZLLL2.next()).LJI;
                    if (view != null) {
                        LJIJ(view);
                    }
                }
            }
            if (LiveLayoutPreloadOptimizationV1Setting.threadOptimize(LJIIIZ)) {
                LJIIJ = C81246Vuc.LIZ(LiveLayoutPreloadThreadPriority.INSTANCE.getPriority(), mutableContextWrapper);
                if (C259710f.LIZ.LJIILJJIL && (c81246Vuc = LJIIJ) != null) {
                    C30878C9y c30878C9y = new C30878C9y();
                    C81126Vsg c81126Vsg = c81246Vuc.LIZ;
                    if (c81126Vsg != null && c81126Vsg.getFactory2() == null) {
                        c81246Vuc.LIZ.setFactory2(c30878C9y);
                    }
                }
            }
        } else {
            LJ.clear();
        }
        CZB.LIZ.getClass();
        CZB.LJFF = context;
        if (context != null) {
            RecyclerView recyclerView = CZB.LJI;
            if (recyclerView == null) {
                RecyclerView recyclerView2 = new RecyclerView(context, null);
                recyclerView2.setLayoutManager(new LinearLayoutManager());
                CZB.LJI = recyclerView2;
            } else {
                CZB.LJFF(recyclerView);
            }
            MutableContextWrapper mutableContextWrapper2 = new MutableContextWrapper(context);
            if (C28329B9x.LIZJ(context)) {
                mutableContextWrapper2.setTheme(C259710f.LIZ.LJFF(context));
            }
            CZB.LJ = new C81125Vsf(mutableContextWrapper2);
            return;
        }
        CZB.LIZLLL.clear();
        CZB.LIZJ.clear();
        CZB.LJI = null;
    }

    public static void LJIILLIIL(Context context) {
        LJI = null;
        LJII = null;
        if (context == null || o.LJ(C31729Ccn.LIZ(context), C31729Ccn.LIZ(LJIIIIZZ))) {
            LJIIJ = null;
        }
        if (LJIIZILJ()) {
            for (Map.Entry<Integer, C20810rl> entry : LJ.entrySet()) {
                C20790rj c20790rj = C20790rj.LIZ;
                C20890rt c20890rt = entry.getValue().LIZLLL;
                if (c20890rt != null) {
                    c20890rt.LJII = SystemClock.elapsedRealtime() - c20890rt.LJ;
                    c20890rt.LJFF = -1L;
                } else {
                    c20890rt = null;
                }
                c20790rj.LIZJ(c20890rt);
            }
            Iterator<Map.Entry<Integer, List<C20810rl>>> it = LJFF.entrySet().iterator();
            while (it.hasNext()) {
                for (C20810rl c20810rl : it.next().getValue()) {
                    C20790rj c20790rj2 = C20790rj.LIZ;
                    C20890rt c20890rt2 = c20810rl.LIZLLL;
                    if (c20890rt2 != null) {
                        c20890rt2.LJII = SystemClock.elapsedRealtime() - c20890rt2.LJ;
                        c20890rt2.LJFF = -1L;
                    } else {
                        c20890rt2 = null;
                    }
                    c20790rj2.LIZJ(c20890rt2);
                }
            }
            C20790rj.LIZ.LIZIZ();
        }
        LJIIL.clear();
        LJIILIIL.clear();
        LIZIZ = -1L;
        LJIIIZ = false;
        LJ.clear();
        LJFF.clear();
        if (context == null) {
            context = LJIIIIZZ;
        }
        if (C81246Vuc.LIZJ(context)) {
            if (C81246Vuc.LIZLLL != null) {
                C81246Vuc.LIZLLL.LIZLLL(C81246Vuc.LIZLLL.LIZ.getContext());
            }
            C81246Vuc.LIZLLL = null;
        }
        LJIIIIZZ = null;
        CZB.LIZ.getClass();
        CZB.LJ = null;
        CZB.LIZLLL.clear();
        CZB.LIZJ.clear();
        CZB.LJFF = null;
        CZB.LJI = null;
        if (!LiveWatchLayoutPreloadLogOpt.INSTANCE.isEnable()) {
            C20800rk.LIZIZ.clear();
            C20800rk.LIZJ.clear();
            C20800rk.LIZ.clear();
        }
        C20780ri.LIZIZ.clear();
        if (LiveClearConstraintSetSetting.INSTANCE.getEnabled()) {
            LJIILJJIL = null;
            LJIILL = null;
        }
        LJIIJJI = EnumC20870rr.UN_SET;
    }

    public static void LJIJ(View view) {
        MutableContextWrapper mutableContextWrapper;
        Context context = view.getContext();
        if (!(context instanceof MutableContextWrapper) || (mutableContextWrapper = (MutableContextWrapper) context) == null) {
            return;
        }
        mutableContextWrapper.setBaseContext(LJIIIIZZ);
    }

    public final synchronized void LIZ(C20810rl c20810rl) {
        ConcurrentHashMap<Integer, List<C20810rl>> concurrentHashMap = LJFF;
        List<C20810rl> list = concurrentHashMap.get(Integer.valueOf(c20810rl.LIZ));
        if (list != null) {
            list.add(c20810rl);
        } else {
            concurrentHashMap.put(Integer.valueOf(c20810rl.LIZ), C47261Igj.LJJIJIL(c20810rl));
        }
    }

    public final synchronized View LJII(int i) {
        View view;
        boolean z;
        boolean z2;
        View view2;
        ConcurrentHashMap<Integer, List<C20810rl>> concurrentHashMap = LJFF;
        List<C20810rl> list = concurrentHashMap.get(Integer.valueOf(i));
        C20800rk.LIZJ(i);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z3 = false;
        view = null;
        if (list != null) {
            if (list.size() > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                list = null;
            }
            if (list != null) {
                try {
                    C20810rl c20810rl = (C20810rl) ORS.LJJLL(list);
                    if (list.size() == 0) {
                        concurrentHashMap.remove(Integer.valueOf(i));
                    }
                    if (c20810rl != null) {
                        if (c20810rl.LJIIIIZZ) {
                            LockSupport.parkNanos(c20810rl, 20000L);
                            view2 = c20810rl.LJI;
                            if (view2 != null) {
                                LJIJ(view2);
                                view = view2;
                            }
                        } else {
                            view2 = c20810rl.LJI;
                            if (view2 != null) {
                                LJIJ(view2);
                                view = view2;
                            }
                        }
                    }
                    C20890rt LJIJI = LJIJI(c20810rl, i, elapsedRealtime);
                    if (LJIIZILJ()) {
                        C20790rj.LIZ.LIZJ(LJIJI);
                    }
                } catch (Exception e) {
                    C0NB.LJI("LayoutPreloadManager", e);
                }
            }
        }
        Context context = LJIIIIZZ;
        if (view != null) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            z3 = true;
        }
        C20800rk.LIZ(context, i, z3);
        return view;
    }

    public static final void LIZLLL(int i, C20810rl c20810rl) {
        c20810rl.LJIIIIZZ = false;
        if (LJIIIIZZ != null) {
            View view = c20810rl.LJI;
            if (view != null) {
                LJIJ(view);
            }
        } else {
            LJ.remove(Integer.valueOf(i));
        }
        LockSupport.unpark(LIZJ);
        if (c20810rl.LJII) {
            LJ.remove(Integer.valueOf(i));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x005c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v24, types: [X.1Yo] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.view.View LJIIJ(final X.C20810rl r11, final X.InterfaceC81248Vue r12) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20910rv.LJIIJ(X.0rl, X.Vue):android.view.View");
    }

    public static final void LJIIJJI(C20810rl c20810rl, long j, boolean z) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C20890rt c20890rt = c20810rl.LIZLLL;
        if (c20890rt != null) {
            c20890rt.LIZLLL = elapsedRealtime - j;
            c20890rt.LJ = elapsedRealtime;
        }
        C20800rk.LIZIZ(LJIIIIZZ, c20810rl.LIZ, z);
    }

    public static C20890rt LJIJI(C20810rl c20810rl, int i, long j) {
        C20890rt c20890rt = null;
        if (c20810rl != null) {
            c20890rt = c20810rl.LIZLLL;
        }
        if (c20890rt == null) {
            C20840ro c20840ro = LIZLLL.get(i);
            if (c20840ro != null) {
                C20890rt c20890rt2 = new C20890rt(c20840ro.LIZ, c20840ro.LIZIZ);
                c20890rt2.LIZLLL = -999L;
                c20890rt2.LJ = -999L;
                c20890rt2.LJI = -999L;
                c20890rt2.LJFF = -999L;
                return c20890rt2;
            }
            return c20890rt;
        }
        if (c20810rl != null && c20810rl.LJI != null) {
            c20890rt.LJFF = SystemClock.elapsedRealtime() - j;
            c20890rt.LJII = SystemClock.elapsedRealtime() - c20890rt.LJ;
            if (LIZIZ <= 0) {
                return c20890rt;
            }
            c20890rt.LJI = SystemClock.elapsedRealtime() - LIZIZ;
            return c20890rt;
        }
        c20890rt.LIZLLL = -999L;
        c20890rt.LJ = -999L;
        c20890rt.LJI = -999L;
        c20890rt.LJFF = -999L;
        return c20890rt;
    }

    public static void LIZJ(final int i, ViewGroup viewGroup, C20890rt c20890rt, boolean z) {
        ConcurrentHashMap<Integer, C20810rl> concurrentHashMap = LJ;
        if (!concurrentHashMap.containsKey(Integer.valueOf(i))) {
            final C20810rl c20810rl = new C20810rl(i, viewGroup, LJI, c20890rt, z, 16);
            concurrentHashMap.put(Integer.valueOf(i), c20810rl);
            if (LJIIJ != null) {
                c20810rl.LJIIIIZZ = true;
                LJIIJ(c20810rl, new InterfaceC81248Vue() { // from class: X.1Yn
                    @Override // X.InterfaceC81248Vue
                    public final /* synthetic */ boolean callBackInMainThread() {
                        return true;
                    }

                    @Override // X.InterfaceC81248Vue
                    public final void onInflateFinished(View view, int i2, ViewGroup viewGroup2) {
                        c20810rl.LJI = view;
                        C20910rv.LIZLLL(i, c20810rl);
                    }
                });
            } else {
                C38995FSd.LIZLLL().submit(new Runnable() { // from class: X.0ru
                    public final void LIZ() {
                        ConcurrentHashMap<Integer, C20810rl> concurrentHashMap2 = C20910rv.LJ;
                        C20810rl c20810rl2 = concurrentHashMap2.get(Integer.valueOf(i));
                        if (c20810rl2 != null && !c20810rl2.LJII) {
                            c20810rl2.LJIIIIZZ = true;
                            c20810rl2.LJI = C20910rv.LJIIJ(c20810rl2, null);
                            C20910rv.LIZLLL(i, c20810rl2);
                            return;
                        }
                        concurrentHashMap2.remove(Integer.valueOf(i));
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean LIZ2;
                        try {
                            LIZ();
                        } finally {
                            if (LIZ2) {
                            }
                        }
                    }
                });
            }
        }
        if (c20890rt != null) {
            LIZLLL.put(i, new C20840ro(c20890rt.LIZ, c20890rt.LIZIZ));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
    
        if (r0 != null) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.view.View LJFF(int r3, android.content.Context r4, android.view.ViewGroup r5, boolean r6) {
        /*
            com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadSetting r0 = com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadSetting.INSTANCE
            boolean r0 = r0.enable()
            X.C20800rk.LIZJ(r3)
            r2 = 0
            if (r0 == 0) goto L2b
            android.view.View r0 = LJIIIIZZ(r3)
            if (r0 == 0) goto L22
            if (r6 == 0) goto L19
            if (r5 == 0) goto L19
            r5.addView(r0)
        L19:
            r2 = 1
        L1a:
            android.content.Context r1 = r0.getContext()
            X.C20800rk.LIZ(r1, r3, r2)
            return r0
        L22:
            X.0rn r0 = X.C20910rv.LJII
            if (r0 == 0) goto L35
            android.view.View r0 = r0.inflate(r3, r5, r6)
            goto L33
        L2b:
            X.0rn r0 = X.C20910rv.LJII
            if (r0 == 0) goto L35
            android.view.View r0 = r0.inflate(r3, r5, r6)
        L33:
            if (r0 != 0) goto L1a
        L35:
            if (r5 == 0) goto L3d
            android.view.View r0 = X.C29306Beo.LJIIIIZZ(r3, r5, r6)
            if (r0 != 0) goto L1a
        L3d:
            if (r4 != 0) goto L43
            android.content.Context r4 = X.C15380j0.LIZLLL()
        L43:
            android.view.LayoutInflater r0 = X.C16880lQ.LLZIL(r4)
            android.view.View r0 = X.C16880lQ.LLLLIILL(r0, r3, r5, r6)
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20910rv.LJFF(int, android.content.Context, android.view.ViewGroup, boolean):android.view.View");
    }

    public static /* synthetic */ View LJI(int i, ViewGroup viewGroup, boolean z, int i2) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        return LJFF(i, null, viewGroup, z);
    }

    public static void LJIILIIL(C20910rv c20910rv, int i, C20890rt c20890rt, EnumC20870rr preloadLevel, boolean z, int i2) {
        boolean z2 = z;
        if ((i2 & 8) != 0) {
            preloadLevel = EnumC20870rr.UN_SET;
        }
        if ((i2 & 16) != 0) {
            z2 = false;
        }
        c20910rv.getClass();
        o.LJIIIZ(preloadLevel, "preloadLevel");
        if (!LiveLayoutPreloadSetting.INSTANCE.enable() || LJIIIIZZ == null) {
            return;
        }
        if (LJIIJJI.isAtLeast(preloadLevel) || !LiveLayoutPreloadOptimizationV1Setting.levelOptimize(LJIIIZ)) {
            LIZJ(i, null, c20890rt, z2);
            return;
        }
        if (LJ.containsKey(Integer.valueOf(i))) {
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("pending ");
        LIZ2.append(c20890rt.LIZ);
        LIZ2.append(" currentStatus = ");
        LIZ2.append(LJIIJJI);
        LIZ2.append(" preloadLevel = ");
        LIZ2.append(preloadLevel);
        C0NB.LJIIIZ("LayoutPreloadManager", X1D.LIZIZ(LIZ2));
        ConcurrentHashMap<EnumC20870rr, ConcurrentHashMap<Integer, C20810rl>> concurrentHashMap = LJIIL;
        ConcurrentHashMap<Integer, C20810rl> concurrentHashMap2 = concurrentHashMap.get(preloadLevel);
        if (concurrentHashMap2 == null) {
            concurrentHashMap2 = new ConcurrentHashMap<>();
            concurrentHashMap.put(preloadLevel, concurrentHashMap2);
        }
        if (concurrentHashMap2.containsKey(Integer.valueOf(i))) {
            return;
        }
        concurrentHashMap2.put(Integer.valueOf(i), new C20810rl(i, (ViewGroup) null, LJI, c20890rt, z2, 16));
    }

    public final void LJ(final int i, final int i2, final ViewGroup viewGroup, final EnumC20860rq enumC20860rq, final String str, final boolean z) {
        C20890rt c20890rt;
        if (LJIIJ != null) {
            List<C20810rl> list = LJFF.get(Integer.valueOf(i));
            if (list != null) {
                Integer valueOf = Integer.valueOf(list.size());
                if (valueOf.intValue() >= i2) {
                    valueOf.intValue();
                    return;
                }
            }
            if (1 <= i2) {
                int i3 = 1;
                while (true) {
                    C20830rn c20830rn = LJI;
                    if (str != null) {
                        c20890rt = new C20890rt(str, enumC20860rq);
                    } else {
                        c20890rt = null;
                    }
                    final C20810rl c20810rl = new C20810rl(i, viewGroup, c20830rn, c20890rt, z, 16);
                    c20810rl.LJIIIIZZ = true;
                    LIZ(c20810rl);
                    LJIIJ(c20810rl, new InterfaceC81248Vue() { // from class: X.1Yp
                        @Override // X.InterfaceC81248Vue
                        public final /* synthetic */ boolean callBackInMainThread() {
                            return true;
                        }

                        @Override // X.InterfaceC81248Vue
                        public final void onInflateFinished(View view, int i4, ViewGroup viewGroup2) {
                            c20810rl.LJI = view;
                            c20810rl.LJIIIIZZ = false;
                            if (C20910rv.LJIIIIZZ != null) {
                                View view2 = c20810rl.LJI;
                                if (view2 != null) {
                                    C20910rv.LJIJ(view2);
                                }
                            } else {
                                List<C20810rl> list2 = C20910rv.LJFF.get(Integer.valueOf(i));
                                if (list2 != null) {
                                    list2.remove(c20810rl);
                                }
                            }
                            LockSupport.unpark(C20910rv.LIZJ);
                        }
                    });
                    if (i3 != i2) {
                        i3++;
                    } else {
                        return;
                    }
                }
            }
        } else {
            C38995FSd.LIZLLL().submit(new Runnable() { // from class: X.0rw
                public final void LIZ() {
                    C20890rt c20890rt2;
                    if (1 <= i2) {
                        int i4 = 1;
                        while (true) {
                            List<C20810rl> list2 = C20910rv.LJFF.get(Integer.valueOf(i));
                            if (list2 != null) {
                                Integer valueOf2 = Integer.valueOf(list2.size());
                                if (valueOf2.intValue() >= i2) {
                                    valueOf2.intValue();
                                    return;
                                }
                            }
                            int i5 = i;
                            ViewGroup viewGroup2 = viewGroup;
                            C20830rn c20830rn2 = C20910rv.LJI;
                            String str2 = str;
                            if (str2 != null) {
                                c20890rt2 = new C20890rt(str2, enumC20860rq);
                            } else {
                                c20890rt2 = null;
                            }
                            C20810rl c20810rl2 = new C20810rl(i5, viewGroup2, c20830rn2, c20890rt2, z, 16);
                            c20810rl2.LJIIIIZZ = true;
                            C20910rv c20910rv = C20910rv.LIZ;
                            c20810rl2.LJI = C20910rv.LJIIJ(c20810rl2, null);
                            c20810rl2.LJIIIIZZ = false;
                            if (C20910rv.LJIIIIZZ != null) {
                                View view = c20810rl2.LJI;
                                if (view != null) {
                                    C20910rv.LJIJ(view);
                                }
                                c20910rv.LIZ(c20810rl2);
                            }
                            LockSupport.unpark(C20910rv.LIZJ);
                            if (i4 != i2) {
                                i4++;
                            } else {
                                return;
                            }
                        }
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean LIZ2;
                    try {
                        LIZ();
                    } finally {
                        if (LIZ2) {
                        }
                    }
                }
            });
        }
    }

    public final void LJIILJJIL(int i, int i2, String str, EnumC20860rq bizType, EnumC20870rr preloadLevel, boolean z) {
        String str2 = str;
        o.LJIIIZ(bizType, "bizType");
        o.LJIIIZ(preloadLevel, "preloadLevel");
        if (LJIIIIZZ == null) {
            return;
        }
        if (LJIIJJI.isAtLeast(preloadLevel) || !LiveLayoutPreloadOptimizationV1Setting.levelOptimize(LJIIIZ)) {
            LJ(i, i2, null, bizType, str2, z);
            return;
        }
        StringBuilder LIZIZ2 = C25620zW.LIZIZ("pending ", str2, " currentStatus = ");
        LIZIZ2.append(LJIIJJI);
        LIZIZ2.append(" preloadLevel = ");
        LIZIZ2.append(preloadLevel);
        C0NB.LJIIIZ("LayoutPreloadManager", X1D.LIZIZ(LIZIZ2));
        List<C20810rl> list = LJFF.get(Integer.valueOf(i));
        if (list != null) {
            Integer valueOf = Integer.valueOf(list.size());
            if (valueOf.intValue() >= i2) {
                valueOf.intValue();
                return;
            }
        }
        ConcurrentHashMap<EnumC20870rr, ConcurrentHashMap<Integer, C20810rl>> concurrentHashMap = LJIILIIL;
        ConcurrentHashMap<Integer, C20810rl> concurrentHashMap2 = concurrentHashMap.get(preloadLevel);
        if (concurrentHashMap2 == null) {
            concurrentHashMap2 = new ConcurrentHashMap<>();
            concurrentHashMap.put(preloadLevel, concurrentHashMap2);
        }
        if (concurrentHashMap2.containsKey(Integer.valueOf(i))) {
            return;
        }
        Integer valueOf2 = Integer.valueOf(i);
        C20830rn c20830rn = LJI;
        if (str2 == null) {
            str2 = "";
        }
        concurrentHashMap2.put(valueOf2, new C20810rl(i, (ViewGroup) null, c20830rn, new C20890rt(str2, bizType), i2, z));
    }

    public static /* synthetic */ void LJIILL(int i, int i2, String str, EnumC20860rq enumC20860rq, EnumC20870rr enumC20870rr, boolean z, int i3) {
        C20910rv c20910rv = LIZ;
        if ((i3 & 32) != 0) {
            enumC20870rr = EnumC20870rr.UN_SET;
        }
        if ((i3 & 64) != 0) {
            z = false;
        }
        c20910rv.LJIILJJIL(i, i2, str, enumC20860rq, enumC20870rr, z);
    }
}
