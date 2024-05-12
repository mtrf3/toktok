package X;

import Y.IDRunnableS29S0200000;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.08y, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC027608y {
    public abstract void addTarget(Object obj, View view);

    public abstract void addTargets(Object obj, ArrayList<View> arrayList);

    public abstract void beginDelayedTransition(ViewGroup viewGroup, Object obj);

    public abstract boolean canHandle(Object obj);

    public abstract Object cloneTransition(Object obj);

    public abstract Object mergeTransitionsInSequence(Object obj, Object obj2, Object obj3);

    public abstract Object mergeTransitionsTogether(Object obj, Object obj2, Object obj3);

    public abstract void removeTarget(Object obj, View view);

    public abstract void replaceTargets(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    public abstract void scheduleHideFragmentView(Object obj, View view, ArrayList<View> arrayList);

    public abstract void scheduleRemoveTargets(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    public abstract void setEpicenter(Object obj, Rect rect);

    public abstract void setEpicenter(Object obj, View view);

    public abstract void setSharedElementTargets(Object obj, View view, ArrayList<View> arrayList);

    public abstract void swapSharedElementTargets(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    public abstract Object wrapTransitionInSet(Object obj);

    public static boolean isNullOrEmpty(List list) {
        if (list == null || list.isEmpty()) {
            return true;
        }
        return false;
    }

    public ArrayList<String> prepareSetNameOverridesReordered(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            View view = (View) ListProtector.get(arrayList, i);
            arrayList2.add(C16360ka.LJIIJ(view));
            C16360ka.LJIJJLI(view, null);
        }
        return arrayList2;
    }

    public static void bfsAddViewChildren(List<View> list, View view) {
        int size = list.size();
        if (containedBeforeIndex(list, view, size)) {
            return;
        }
        list.add(view);
        for (int i = size; i < list.size(); i++) {
            View view2 = (View) ListProtector.get(list, i);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = viewGroup.getChildAt(i2);
                    if (!containedBeforeIndex(list, childAt, size)) {
                        list.add(childAt);
                    }
                }
            }
        }
    }

    public static String findKeyForValue(java.util.Map<String, String> map, String str) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (str.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }

    public void captureTransitioningViews(ArrayList<View> arrayList, View view) {
        if (view.getVisibility() == 0) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (C16540ks.LIZIZ(viewGroup)) {
                    arrayList.add(viewGroup);
                    return;
                }
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    captureTransitioningViews(arrayList, viewGroup.getChildAt(i));
                }
                return;
            }
            arrayList.add(view);
        }
    }

    public void findNamedViews(java.util.Map<String, View> map, View view) {
        if (view.getVisibility() == 0) {
            String LJIIJ = C16360ka.LJIIJ(view);
            if (LJIIJ != null) {
                map.put(LJIIJ, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    findNamedViews(map, viewGroup.getChildAt(i));
                }
            }
        }
    }

    public void getBoundsOnScreen(View view, Rect rect) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        rect.set(i, iArr[1], view.getWidth() + i, view.getHeight() + iArr[1]);
    }

    public static boolean containedBeforeIndex(List<View> list, View view, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (ListProtector.get(list, i2) == view) {
                return true;
            }
        }
        return false;
    }

    public void scheduleNameReset(ViewGroup viewGroup, ArrayList<View> arrayList, java.util.Map<String, String> map) {
        ViewTreeObserverOnPreDrawListenerC16840lM.LIZ(viewGroup, new IDRunnableS29S0200000(arrayList, map, 5));
    }

    public void setNameOverridesOrdered(View view, ArrayList<View> arrayList, java.util.Map<String, String> map) {
        ViewTreeObserverOnPreDrawListenerC16840lM.LIZ(view, new IDRunnableS29S0200000(arrayList, map, 4));
    }

    public void setListenerForTransitionEnd(Fragment fragment, Object obj, C10610bJ c10610bJ, Runnable runnable) {
        runnable.run();
    }

    public void setNameOverridesReordered(View view, final ArrayList<View> arrayList, final ArrayList<View> arrayList2, final ArrayList<String> arrayList3, java.util.Map<String, String> map) {
        final int size = arrayList2.size();
        final ArrayList arrayList4 = new ArrayList();
        for (int i = 0; i < size; i++) {
            View view2 = (View) ListProtector.get(arrayList, i);
            String LJIIJ = C16360ka.LJIIJ(view2);
            arrayList4.add(LJIIJ);
            if (LJIIJ != null) {
                C16360ka.LJIJJLI(view2, null);
                String str = map.get(LJIIJ);
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    }
                    if (str.equals(ListProtector.get(arrayList3, i2))) {
                        C16360ka.LJIJJLI((View) ListProtector.get(arrayList2, i2), LJIIJ);
                        break;
                    }
                    i2++;
                }
            }
        }
        ViewTreeObserverOnPreDrawListenerC16840lM.LIZ(view, new Runnable() { // from class: X.08x
            public final void LIZ() {
                for (int i3 = 0; i3 < size; i3++) {
                    C16360ka.LJIJJLI((View) ListProtector.get(arrayList2, i3), (String) ListProtector.get(arrayList3, i3));
                    C16360ka.LJIJJLI((View) ListProtector.get(arrayList, i3), (String) ListProtector.get(arrayList4, i3));
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
        });
    }
}
