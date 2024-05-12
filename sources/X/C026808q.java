package X;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: X.08q, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C026808q {
    public static final int[] LIZ = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};
    public static final C1B7 LIZIZ = new AbstractC027608y() { // from class: X.1B7
        public static boolean LIZ(Transition transition) {
            if (!AbstractC027608y.isNullOrEmpty(transition.getTargetIds()) || !AbstractC027608y.isNullOrEmpty(transition.getTargetNames()) || !AbstractC027608y.isNullOrEmpty(transition.getTargetTypes())) {
                return true;
            }
            return false;
        }

        @Override // X.AbstractC027608y
        public final boolean canHandle(Object obj) {
            return obj instanceof Transition;
        }

        @Override // X.AbstractC027608y
        public final Object cloneTransition(Object obj) {
            if (obj != null) {
                return ((Transition) obj).clone();
            }
            return null;
        }

        @Override // X.AbstractC027608y
        public final Object wrapTransitionInSet(Object obj) {
            if (obj == null) {
                return null;
            }
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.addTransition((Transition) obj);
            return transitionSet;
        }

        @Override // X.AbstractC027608y
        public final void addTarget(Object obj, View view) {
            if (obj != null) {
                ((Transition) obj).addTarget(view);
            }
        }

        @Override // X.AbstractC027608y
        public final void addTargets(Object obj, ArrayList<View> arrayList) {
            Transition transition = (Transition) obj;
            if (transition == null) {
                return;
            }
            int i = 0;
            if (transition instanceof TransitionSet) {
                TransitionSet transitionSet = (TransitionSet) transition;
                int transitionCount = transitionSet.getTransitionCount();
                while (i < transitionCount) {
                    addTargets(transitionSet.getTransitionAt(i), arrayList);
                    i++;
                }
                return;
            }
            if (!LIZ(transition) && AbstractC027608y.isNullOrEmpty(transition.getTargets())) {
                int size = arrayList.size();
                while (i < size) {
                    transition.addTarget((View) ListProtector.get(arrayList, i));
                    i++;
                }
            }
        }

        @Override // X.AbstractC027608y
        public final void beginDelayedTransition(ViewGroup viewGroup, Object obj) {
            TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
        }

        @Override // X.AbstractC027608y
        public final void removeTarget(Object obj, View view) {
            if (obj != null) {
                ((Transition) obj).removeTarget(view);
            }
        }

        @Override // X.AbstractC027608y
        public final void setEpicenter(Object obj, View view) {
            if (view != null) {
                final Rect rect = new Rect();
                getBoundsOnScreen(view, rect);
                ((Transition) obj).setEpicenterCallback(new Transition.EpicenterCallback() { // from class: X.08s
                    @Override // android.transition.Transition.EpicenterCallback
                    public final Rect onGetEpicenter(Transition transition) {
                        return rect;
                    }
                });
            }
        }

        @Override // X.AbstractC027608y
        public final void setEpicenter(Object obj, final Rect rect) {
            if (obj != null) {
                ((Transition) obj).setEpicenterCallback(new Transition.EpicenterCallback() { // from class: X.08w
                    @Override // android.transition.Transition.EpicenterCallback
                    public final Rect onGetEpicenter(Transition transition) {
                        Rect rect2 = rect;
                        if (rect2 == null || rect2.isEmpty()) {
                            return null;
                        }
                        return rect;
                    }
                });
            }
        }

        @Override // X.AbstractC027608y
        public final Object mergeTransitionsInSequence(Object obj, Object obj2, Object obj3) {
            Transition transition = (Transition) obj;
            Transition transition2 = (Transition) obj2;
            Transition transition3 = (Transition) obj3;
            if (transition != null) {
                if (transition2 != null) {
                    transition = new TransitionSet().addTransition(transition).addTransition(transition2).setOrdering(1);
                }
            } else if (transition2 != null) {
                transition = transition2;
            } else {
                transition = null;
            }
            if (transition3 != null) {
                TransitionSet transitionSet = new TransitionSet();
                if (transition != null) {
                    transitionSet.addTransition(transition);
                }
                transitionSet.addTransition(transition3);
                return transitionSet;
            }
            return transition;
        }

        @Override // X.AbstractC027608y
        public final Object mergeTransitionsTogether(Object obj, Object obj2, Object obj3) {
            TransitionSet transitionSet = new TransitionSet();
            if (obj != null) {
                transitionSet.addTransition((Transition) obj);
            }
            if (obj2 != null) {
                transitionSet.addTransition((Transition) obj2);
            }
            if (obj3 != null) {
                transitionSet.addTransition((Transition) obj3);
            }
            return transitionSet;
        }

        @Override // X.AbstractC027608y
        public final void replaceTargets(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
            List<View> targets;
            Transition transition = (Transition) obj;
            int i = 0;
            if (transition instanceof TransitionSet) {
                TransitionSet transitionSet = (TransitionSet) transition;
                int transitionCount = transitionSet.getTransitionCount();
                while (i < transitionCount) {
                    replaceTargets(transitionSet.getTransitionAt(i), arrayList, arrayList2);
                    i++;
                }
                return;
            }
            if (!LIZ(transition) && (targets = transition.getTargets()) != null && targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
                if (arrayList2 != null) {
                    int size = arrayList2.size();
                    while (i < size) {
                        transition.addTarget((View) ListProtector.get(arrayList2, i));
                        i++;
                    }
                }
                int size2 = arrayList.size();
                while (true) {
                    size2--;
                    if (size2 >= 0) {
                        transition.removeTarget((View) ListProtector.get(arrayList, size2));
                    } else {
                        return;
                    }
                }
            }
        }

        @Override // X.AbstractC027608y
        public final void scheduleHideFragmentView(Object obj, final View view, final ArrayList<View> arrayList) {
            ((Transition) obj).addListener(new Transition.TransitionListener() { // from class: X.08t
                @Override // android.transition.Transition.TransitionListener
                public final void onTransitionCancel(Transition transition) {
                }

                @Override // android.transition.Transition.TransitionListener
                public final void onTransitionPause(Transition transition) {
                }

                @Override // android.transition.Transition.TransitionListener
                public final void onTransitionResume(Transition transition) {
                }

                @Override // android.transition.Transition.TransitionListener
                public final void onTransitionEnd(Transition transition) {
                    transition.removeListener(this);
                    view.setVisibility(8);
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        ((View) ListProtector.get(arrayList, i)).setVisibility(0);
                    }
                }

                @Override // android.transition.Transition.TransitionListener
                public final void onTransitionStart(Transition transition) {
                    transition.removeListener(this);
                    transition.addListener(this);
                }
            });
        }

        @Override // X.AbstractC027608y
        public final void setSharedElementTargets(Object obj, View view, ArrayList<View> arrayList) {
            Transition transition = (Transition) obj;
            List<View> targets = transition.getTargets();
            targets.clear();
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                AbstractC027608y.bfsAddViewChildren(targets, (View) ListProtector.get(arrayList, i));
            }
            targets.add(view);
            arrayList.add(view);
            addTargets(transition, arrayList);
        }

        @Override // X.AbstractC027608y
        public final void swapSharedElementTargets(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
            Transition transition = (Transition) obj;
            if (transition != null) {
                transition.getTargets().clear();
                transition.getTargets().addAll(arrayList2);
                replaceTargets(transition, arrayList, arrayList2);
            }
        }

        @Override // X.AbstractC027608y
        public final void setListenerForTransitionEnd(Fragment fragment, Object obj, C10610bJ c10610bJ, final Runnable runnable) {
            ((Transition) obj).addListener(new Transition.TransitionListener() { // from class: X.08v
                @Override // android.transition.Transition.TransitionListener
                public final void onTransitionCancel(Transition transition) {
                }

                @Override // android.transition.Transition.TransitionListener
                public final void onTransitionPause(Transition transition) {
                }

                @Override // android.transition.Transition.TransitionListener
                public final void onTransitionResume(Transition transition) {
                }

                @Override // android.transition.Transition.TransitionListener
                public final void onTransitionStart(Transition transition) {
                }

                @Override // android.transition.Transition.TransitionListener
                public final void onTransitionEnd(Transition transition) {
                    runnable.run();
                }
            });
        }

        @Override // X.AbstractC027608y
        public final void scheduleRemoveTargets(Object obj, final Object obj2, final ArrayList<View> arrayList, final Object obj3, final ArrayList<View> arrayList2, final Object obj4, final ArrayList<View> arrayList3) {
            ((Transition) obj).addListener(new Transition.TransitionListener() { // from class: X.08u
                @Override // android.transition.Transition.TransitionListener
                public final void onTransitionCancel(Transition transition) {
                }

                @Override // android.transition.Transition.TransitionListener
                public final void onTransitionPause(Transition transition) {
                }

                @Override // android.transition.Transition.TransitionListener
                public final void onTransitionResume(Transition transition) {
                }

                @Override // android.transition.Transition.TransitionListener
                public final void onTransitionEnd(Transition transition) {
                    transition.removeListener(this);
                }

                @Override // android.transition.Transition.TransitionListener
                public final void onTransitionStart(Transition transition) {
                    Object obj5 = obj2;
                    if (obj5 != null) {
                        replaceTargets(obj5, arrayList, null);
                    }
                    Object obj6 = obj3;
                    if (obj6 != null) {
                        replaceTargets(obj6, arrayList2, null);
                    }
                    Object obj7 = obj4;
                    if (obj7 != null) {
                        replaceTargets(obj7, arrayList3, null);
                    }
                }
            });
        }
    };
    public static final AbstractC027608y LIZJ;

    /* JADX WARN: Type inference failed for: r0v2, types: [X.1B7] */
    static {
        AbstractC027608y abstractC027608y;
        try {
            abstractC027608y = (AbstractC027608y) Class.forName("androidx.transition.FragmentTransitionSupport").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            abstractC027608y = null;
        }
        LIZJ = abstractC027608y;
    }

    public static AbstractC027608y LJ(Fragment fragment, Fragment fragment2) {
        ArrayList arrayList = new ArrayList();
        if (fragment != null) {
            Object exitTransition = fragment.getExitTransition();
            if (exitTransition != null) {
                arrayList.add(exitTransition);
            }
            Object returnTransition = fragment.getReturnTransition();
            if (returnTransition != null) {
                arrayList.add(returnTransition);
            }
            Object sharedElementReturnTransition = fragment.getSharedElementReturnTransition();
            if (sharedElementReturnTransition != null) {
                arrayList.add(sharedElementReturnTransition);
            }
        }
        if (fragment2 != null) {
            Object enterTransition = fragment2.getEnterTransition();
            if (enterTransition != null) {
                arrayList.add(enterTransition);
            }
            Object reenterTransition = fragment2.getReenterTransition();
            if (reenterTransition != null) {
                arrayList.add(reenterTransition);
            }
            Object sharedElementEnterTransition = fragment2.getSharedElementEnterTransition();
            if (sharedElementEnterTransition != null) {
                arrayList.add(sharedElementEnterTransition);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        C1B7 c1b7 = LIZIZ;
        if (c1b7 != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (c1b7.canHandle(ListProtector.get(arrayList, i))) {
                }
            }
            return c1b7;
        }
        AbstractC027608y abstractC027608y = LIZJ;
        if (abstractC027608y != null) {
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (abstractC027608y.canHandle(ListProtector.get(arrayList, i2))) {
                }
            }
            return abstractC027608y;
        }
        if (c1b7 == null && abstractC027608y == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    public static void LJIIIZ(int i, ArrayList arrayList) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((View) ListProtector.get(arrayList, size)).setVisibility(i);
        }
    }

    public static void LIZ(ArrayList<View> arrayList, C1HQ<String, View> c1hq, Collection<String> collection) {
        int i = c1hq.LJLJI;
        while (true) {
            i--;
            if (i >= 0) {
                View LJIIJJI = c1hq.LJIIJJI(i);
                if (collection.contains(C16360ka.LJIIJ(LJIIJJI))) {
                    arrayList.add(LJIIJJI);
                }
            } else {
                return;
            }
        }
    }

    public static C1HQ<String, View> LIZJ(AbstractC027608y abstractC027608y, C1HQ<String, String> c1hq, Object obj, C026708p c026708p) {
        ArrayList<String> arrayList;
        Fragment fragment = c026708p.LIZ;
        View view = fragment.getView();
        if (c1hq.isEmpty() || obj == null || view == null) {
            c1hq.clear();
            return null;
        }
        C1HQ<String, View> c1hq2 = new C1HQ<>();
        abstractC027608y.findNamedViews(c1hq2, view);
        C1B3 c1b3 = c026708p.LIZJ;
        if (c026708p.LIZIZ) {
            fragment.getExitTransitionCallback();
            arrayList = c1b3.LJIILIIL;
        } else {
            fragment.getEnterTransitionCallback();
            arrayList = c1b3.LJIILJJIL;
        }
        if (arrayList != null) {
            C0M9.LJIIJ(arrayList, c1hq2);
            C0M9.LJIIJ(c1hq.values(), c1hq2);
        }
        int i = c1hq.LJLJI;
        while (true) {
            i--;
            if (i >= 0) {
                if (!c1hq2.containsKey(c1hq.LJIIJJI(i))) {
                    c1hq.LJIIIZ(i);
                }
            } else {
                return c1hq2;
            }
        }
    }

    public static C1HQ<String, View> LIZLLL(AbstractC027608y abstractC027608y, C1HQ<String, String> c1hq, Object obj, C026708p c026708p) {
        ArrayList<String> arrayList;
        if (c1hq.isEmpty() || obj == null) {
            c1hq.clear();
            return null;
        }
        Fragment fragment = c026708p.LIZLLL;
        C1HQ<String, View> c1hq2 = new C1HQ<>();
        abstractC027608y.findNamedViews(c1hq2, fragment.requireView());
        C1B3 c1b3 = c026708p.LJFF;
        if (c026708p.LJ) {
            fragment.getEnterTransitionCallback();
            arrayList = c1b3.LJIILJJIL;
        } else {
            fragment.getExitTransitionCallback();
            arrayList = c1b3.LJIILIIL;
        }
        if (arrayList != null) {
            C0M9.LJIIJ(arrayList, c1hq2);
        }
        C0M9.LJIIJ(c1hq2.keySet(), c1hq);
        return c1hq2;
    }

    public static View LJI(C1HQ<String, View> c1hq, C026708p c026708p, Object obj, boolean z) {
        ArrayList<String> arrayList;
        Object obj2;
        C1B3 c1b3 = c026708p.LIZJ;
        if (obj == null || c1hq == null || (arrayList = c1b3.LJIILIIL) == null || arrayList.isEmpty()) {
            return null;
        }
        if (z) {
            obj2 = ListProtector.get(c1b3.LJIILIIL, 0);
        } else {
            obj2 = ListProtector.get(c1b3.LJIILJJIL, 0);
        }
        return c1hq.getOrDefault(obj2, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x00ba, code lost:
    
        if (r11.mHidden == false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0167, code lost:
    
        if (r9.LIZLLL == null) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00cb, code lost:
    
        if (r11.mAdded != false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00cd, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x00a0, code lost:
    
        r16 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0171 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(X.C1B3 r18, X.C025708f r19, android.util.SparseArray<X.C026708p> r20, boolean r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C026808q.LIZIZ(X.1B3, X.08f, android.util.SparseArray, boolean, boolean):void");
    }

    public static ArrayList<View> LJFF(AbstractC027608y abstractC027608y, Object obj, Fragment fragment, ArrayList<View> arrayList, View view) {
        if (obj != null) {
            ArrayList<View> arrayList2 = new ArrayList<>();
            View view2 = fragment.getView();
            if (view2 != null) {
                abstractC027608y.captureTransitioningViews(arrayList2, view2);
            }
            if (arrayList != null) {
                arrayList2.removeAll(arrayList);
            }
            if (!arrayList2.isEmpty()) {
                arrayList2.add(view);
                abstractC027608y.addTargets(obj, arrayList2);
                return arrayList2;
            }
            return arrayList2;
        }
        return null;
    }

    public static Object LJII(AbstractC027608y abstractC027608y, Object obj, Object obj2, Object obj3, Fragment fragment, boolean z) {
        boolean allowEnterTransitionOverlap;
        if (obj != null && obj2 != null && fragment != null) {
            if (z) {
                allowEnterTransitionOverlap = fragment.getAllowReturnTransitionOverlap();
            } else {
                allowEnterTransitionOverlap = fragment.getAllowEnterTransitionOverlap();
            }
            if (!allowEnterTransitionOverlap) {
                return abstractC027608y.mergeTransitionsInSequence(obj2, obj, obj3);
            }
        }
        return abstractC027608y.mergeTransitionsTogether(obj2, obj, obj3);
    }

    public static void LJIIIIZZ(AbstractC027608y abstractC027608y, Object obj, Object obj2, C1HQ<String, View> c1hq, boolean z, C1B3 c1b3) {
        Object obj3;
        ArrayList<String> arrayList = c1b3.LJIILIIL;
        if (arrayList != null && !arrayList.isEmpty()) {
            if (z) {
                obj3 = ListProtector.get(c1b3.LJIILJJIL, 0);
            } else {
                obj3 = ListProtector.get(c1b3.LJIILIIL, 0);
            }
            View orDefault = c1hq.getOrDefault(obj3, null);
            abstractC027608y.setEpicenter(obj, orDefault);
            if (obj2 != null) {
                abstractC027608y.setEpicenter(obj2, orDefault);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0116 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIJ(androidx.fragment.app.FragmentManager r43, java.util.ArrayList<X.C1B3> r44, java.util.ArrayList<java.lang.Boolean> r45, int r46, int r47, boolean r48, X.InterfaceC026608o r49) {
        /*
            Method dump skipped, instructions count: 1073
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C026808q.LJIIJ(androidx.fragment.app.FragmentManager, java.util.ArrayList, java.util.ArrayList, int, int, boolean, X.08o):void");
    }
}
