package X;

import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.0Bv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C03510Bv {
    public static final C40511iR LIZ = new C40511iR();
    public static final ThreadLocal<WeakReference<C1HQ<ViewGroup, ArrayList<AbstractC03490Bt>>>> LIZIZ = new ThreadLocal<>();
    public static final ArrayList<ViewGroup> LIZJ = new ArrayList<>();

    public static C1HQ<ViewGroup, ArrayList<AbstractC03490Bt>> LIZJ() {
        C1HQ<ViewGroup, ArrayList<AbstractC03490Bt>> c1hq;
        ThreadLocal<WeakReference<C1HQ<ViewGroup, ArrayList<AbstractC03490Bt>>>> threadLocal = LIZIZ;
        WeakReference<C1HQ<ViewGroup, ArrayList<AbstractC03490Bt>>> weakReference = threadLocal.get();
        if (weakReference != null && (c1hq = weakReference.get()) != null) {
            return c1hq;
        }
        C1HQ<ViewGroup, ArrayList<AbstractC03490Bt>> c1hq2 = new C1HQ<>();
        threadLocal.set(new WeakReference<>(c1hq2));
        return c1hq2;
    }

    public static void LIZIZ(ViewGroup viewGroup) {
        LIZJ.remove(viewGroup);
        ArrayList<AbstractC03490Bt> orDefault = LIZJ().getOrDefault(viewGroup, null);
        if (orDefault != null && !orDefault.isEmpty()) {
            ArrayList arrayList = new ArrayList(orDefault);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((AbstractC03490Bt) ListProtector.get(arrayList, size)).LJIILIIL(viewGroup);
            }
        }
    }

    public static void LIZLLL(C03820Da c03820Da) {
        C40511iR c40511iR = LIZ;
        ViewGroup viewGroup = c03820Da.LIZJ;
        ArrayList<ViewGroup> arrayList = LIZJ;
        if (!arrayList.contains(viewGroup)) {
            C03820Da c03820Da2 = (C03820Da) viewGroup.getTag(R.id.ljk);
            if (c40511iR == null) {
                if (c03820Da2 != null) {
                    c03820Da2.LIZJ.getTag(R.id.ljk);
                }
                c03820Da.LIZ();
                return;
            }
            arrayList.add(viewGroup);
            AbstractC03490Bt clone = c40511iR.clone();
            clone.LJJIJ(viewGroup);
            if (c03820Da2 != null && c03820Da2.LIZIZ > 0) {
                clone.LJJII();
            }
            LJ(viewGroup, clone);
            c03820Da.LIZ();
            ViewTreeObserverOnPreDrawListenerC03500Bu viewTreeObserverOnPreDrawListenerC03500Bu = new ViewTreeObserverOnPreDrawListenerC03500Bu(viewGroup, clone);
            viewGroup.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC03500Bu);
            viewGroup.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC03500Bu);
        }
    }

    public static void LIZ(ViewGroup viewGroup, AbstractC03490Bt abstractC03490Bt) {
        ArrayList<ViewGroup> arrayList = LIZJ;
        if (!arrayList.contains(viewGroup) && C16330kX.LIZJ(viewGroup)) {
            arrayList.add(viewGroup);
            if (abstractC03490Bt == null) {
                abstractC03490Bt = LIZ;
            }
            AbstractC03490Bt clone = abstractC03490Bt.clone();
            LJ(viewGroup, clone);
            viewGroup.setTag(R.id.ljk, null);
            if (clone != null) {
                ViewTreeObserverOnPreDrawListenerC03500Bu viewTreeObserverOnPreDrawListenerC03500Bu = new ViewTreeObserverOnPreDrawListenerC03500Bu(viewGroup, clone);
                viewGroup.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC03500Bu);
                viewGroup.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC03500Bu);
            }
        }
    }

    public static void LJ(ViewGroup viewGroup, AbstractC03490Bt abstractC03490Bt) {
        ArrayList<AbstractC03490Bt> orDefault = LIZJ().getOrDefault(viewGroup, null);
        if (orDefault != null && orDefault.size() > 0) {
            Iterator<AbstractC03490Bt> it = orDefault.iterator();
            while (it.hasNext()) {
                it.next().LJIJJLI(viewGroup);
            }
        }
        if (abstractC03490Bt != null) {
            abstractC03490Bt.LJII(viewGroup, true);
        }
        C03820Da c03820Da = (C03820Da) viewGroup.getTag(R.id.ljk);
        if (c03820Da != null) {
            c03820Da.LIZJ.getTag(R.id.ljk);
        }
    }
}
