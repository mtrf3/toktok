package X;

import android.app.Activity;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.IDqS420S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.0gf */
/* loaded from: classes.dex */
public final class C13930gf {
    public static long LIZ;
    public static final java.util.Map<Integer, java.util.Set<C17040lg>> LIZIZ = new HashMap();
    public static final java.util.Map<Integer, java.util.Map<String, C15210ij>> LIZJ = new HashMap();
    public static final HashSet<C15210ij> LIZLLL = new HashSet<>();
    public static final C62822Ol8 LJ = C221108m2.LIZIZ(C21G.LJLIL);

    public static final void LIZIZ() {
        LIZLLL(true);
    }

    public static int LJII() {
        Activity activity;
        WeakReference<Activity> weakReference = C18140nS.LJLJJI;
        if (weakReference != null && (activity = weakReference.get()) != null) {
            return activity.hashCode();
        }
        return 0;
    }

    public static /* synthetic */ void LIZLLL(boolean z) {
        LIZJ(LJII(), z);
    }

    public static java.util.Map LJ(int i) {
        HashMap hashMap = (HashMap) LIZJ;
        java.util.Map map = (java.util.Map) hashMap.get(Integer.valueOf(i));
        if (map == null) {
            HashMap hashMap2 = new HashMap();
            hashMap.put(Integer.valueOf(i), hashMap2);
            return hashMap2;
        }
        return map;
    }

    public static java.util.Set LJFF(int i) {
        HashMap hashMap = (HashMap) LIZIZ;
        java.util.Set set = (java.util.Set) hashMap.get(Integer.valueOf(i));
        if (set == null) {
            HashSet hashSet = new HashSet();
            hashMap.put(Integer.valueOf(i), hashSet);
            return hashSet;
        }
        return set;
    }

    public static void LJIIIZ(String pageId) {
        o.LJIIIZ(pageId, "pageId");
        java.util.Set LJFF = LJFF(LJII());
        ArrayList arrayList = new ArrayList();
        for (Object obj : LJFF) {
            View view = ((C17040lg) obj).getViewRef().get();
            String str = null;
            if (view != null) {
                C18080nM.LIZ.getClass();
                C18090nN LIZLLL2 = C18080nM.LIZLLL(view, null);
                if (LIZLLL2 != null) {
                    str = LIZLLL2.LIZ;
                }
            }
            if (o.LJ(str, pageId)) {
                arrayList.add(obj);
            }
        }
        LJFF.removeAll(ORZ.LLJJ(arrayList));
        Iterator it = LJ(LJII()).entrySet().iterator();
        while (it.hasNext()) {
            if (o.LJ(((C15210ij) ((Map.Entry) it.next()).getValue()).LJIIIIZZ, pageId)) {
                it.remove();
            }
        }
    }

    public static void LJIIJ(C17040lg c17040lg) {
        if (c17040lg.isCommon()) {
            for (java.util.Set set : ((HashMap) LIZIZ).values()) {
                if (!set.contains(c17040lg)) {
                    set.add(c17040lg);
                }
            }
            J8W.LIZIZ(c17040lg, new IDqS420S0100000(c17040lg, 124), new IDqS420S0100000(c17040lg, 125));
            return;
        }
        java.util.Set LJFF = LJFF(LJII());
        c17040lg.setActivityID(LJII());
        LJFF.add(c17040lg);
        J8W.LIZIZ(c17040lg, new IDqS420S0100000(c17040lg, 126), new IDqS420S0100000(c17040lg, 127));
    }

    public static void LIZ(View view, AbstractC13940gg provider) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(provider, "provider");
        if (o.LJ(C16880lQ.LLJJJJ(), Looper.myLooper())) {
            LJIIJ(new C17040lg(new WeakReference(view), provider));
            return;
        }
        throw new Exception("Add exposure view must run on the main thread");
    }

    public static final void LIZJ(int i, boolean z) {
        boolean LJIIIIZZ;
        Object obj;
        Integer num;
        View rootView;
        Object obj2;
        long currentTimeMillis = System.currentTimeMillis();
        if (z && currentTimeMillis - LIZ < 100) {
            return;
        }
        LIZ = System.currentTimeMillis();
        long currentTimeMillis2 = System.currentTimeMillis();
        java.util.Set<C17040lg> LJFF = LJFF(i);
        if (LJFF.isEmpty()) {
            return;
        }
        java.util.Map LJ2 = LJ(i);
        HashSet hashSet = new HashSet();
        for (C17040lg c17040lg : LJFF) {
            View view = c17040lg.getViewRef().get();
            if (view == null) {
                hashSet.add(c17040lg);
            } else {
                C15210ij LJI = LJI(c17040lg, LJ2);
                int i2 = C13920ge.LIZ[c17040lg.getStrategy().ordinal()];
                if (i2 != 1) {
                    if (i2 == 2) {
                        LJIIIIZZ = LJIIIIZZ(view, c17040lg.getVisiblePercent());
                    } else {
                        throw new C162476Zf();
                    }
                } else {
                    LJIIIIZZ = LJIIIIZZ(view, c17040lg.getVisiblePercent());
                }
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(c17040lg.getBTM_CD());
                LIZ2.append(" showState: ");
                LIZ2.append(LJIIIIZZ);
                LIZ2.append(" + last: ");
                LIZ2.append(c17040lg.getLastShowState());
                String s = X1D.LIZIZ(LIZ2);
                o.LJIIIZ(s, "s");
                LIZLLL.add(LJI);
                if (LJIIIIZZ) {
                    c17040lg.setLastShowState(true);
                    String str = null;
                    if (c17040lg.getDialogTag$btm_release() == null || LJI.LIZLLL == null) {
                        View view2 = c17040lg.getViewRef().get();
                        if (view2 != null && (rootView = view2.getRootView()) != null) {
                            obj = rootView.getTag(R.id.ngd);
                        } else {
                            obj = null;
                        }
                        if ((obj instanceof Integer) && (num = (Integer) obj) != null) {
                            c17040lg.setDialogTag$btm_release(num);
                            LJI.LIZLLL = num;
                        }
                    }
                    View view3 = c17040lg.getViewRef().get();
                    if (view3 != null) {
                        obj2 = view3.getTag(R.id.lj7);
                    } else {
                        obj2 = null;
                    }
                    LJI.LJII = (Integer) obj2;
                    View view4 = c17040lg.getViewRef().get();
                    if (view4 != null) {
                        C18080nM.LIZ.getClass();
                        C18090nN LIZLLL2 = C18080nM.LIZLLL(view4, null);
                        if (LIZLLL2 != null) {
                            str = LIZLLL2.LIZ;
                        }
                    }
                    LJI.LJIIIIZZ = str;
                    Object value = LJ.getValue();
                    EnumC17030lf enumC17030lf = EnumC17030lf.TO_VISIBLE;
                    value.getClass();
                    C15240im.LIZIZ(enumC17030lf, LJI, c17040lg);
                } else {
                    c17040lg.setLastShowState(false);
                    Object value2 = LJ.getValue();
                    EnumC17030lf enumC17030lf2 = EnumC17030lf.TO_INVISIBLE;
                    value2.getClass();
                    C15240im.LIZIZ(enumC17030lf2, LJI, c17040lg);
                }
            }
        }
        if (hashSet.size() > 0) {
            LJFF.removeAll(hashSet);
        }
        for (C15210ij c15210ij : LJ2.values()) {
            if (!LIZLLL.contains(c15210ij)) {
                int i3 = C13920ge.LIZIZ[c15210ij.LIZIZ.ordinal()];
                if (i3 != 1) {
                    if (i3 == 2 && c15210ij.LJ) {
                        c15210ij.LIZ(EnumC15220ik.DEF);
                    }
                } else {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("resetOtherTargets: ");
                    LIZ3.append(c15210ij.LIZ);
                    String s2 = X1D.LIZIZ(LIZ3);
                    o.LJIIIZ(s2, "s");
                    c15210ij.LIZ(EnumC15220ik.DEF);
                }
            }
        }
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("Detection time-consuming: ");
        LIZ4.append(System.currentTimeMillis() - currentTimeMillis2);
        String s3 = X1D.LIZIZ(LIZ4);
        o.LJIIIZ(s3, "s");
        HashSet<C15210ij> targets = LIZLLL;
        o.LJIIIZ(targets, "targets");
        if (targets.isEmpty()) {
            return;
        }
        Iterator<C15210ij> it = targets.iterator();
        while (it.hasNext()) {
            C15210ij next = it.next();
            if (next.LIZIZ == EnumC15220ik.SHOWING) {
                Handler LIZ5 = C19610pp.LIZ();
                RunnableC19600po runnableC19600po = C19610pp.LIZIZ;
                LIZ5.removeCallbacks(runnableC19600po);
                StringBuilder LIZ6 = X1D.LIZ();
                LIZ6.append("polling case: ");
                LIZ6.append(next.LIZ);
                String s4 = X1D.LIZIZ(LIZ6);
                o.LJIIIZ(s4, "s");
                C19610pp.LIZ().postDelayed(runnableC19600po, 500L);
            }
        }
        targets.clear();
    }

    public static C15210ij LJI(C17040lg c17040lg, java.util.Map map) {
        String btm_cd = c17040lg.getBTM_CD();
        C15210ij c15210ij = (C15210ij) map.get(btm_cd);
        if (c15210ij == null) {
            C15210ij c15210ij2 = new C15210ij(btm_cd);
            map.put(btm_cd, c15210ij2);
            c15210ij2.LJ = c17040lg.getRepeatedInsidePage();
            c15210ij2.LJFF = c17040lg.getRepeatedWhenBack();
            c15210ij2.LJI = c17040lg.getExposePeriodSpecification();
            c17040lg.getVisiblePercent();
            return c15210ij2;
        }
        return c15210ij;
    }

    public static boolean LJIIIIZZ(View view, float f) {
        if (!view.isAttachedToWindow() || !view.hasWindowFocus() || view.getWindowVisibility() != 0 || !view.isShown() || view.getWidth() <= 0 || view.getHeight() <= 0 || view.getAlpha() <= 0.0f) {
            return false;
        }
        if (!view.getGlobalVisibleRect(new Rect())) {
            return false;
        }
        if (r3.width() * r3.height() < view.getMeasuredHeight() * view.getMeasuredWidth() * f) {
            return false;
        }
        return true;
    }
}
