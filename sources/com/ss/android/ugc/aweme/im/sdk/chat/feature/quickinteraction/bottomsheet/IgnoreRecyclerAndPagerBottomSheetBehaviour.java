package com.ss.android.ugc.aweme.im.sdk.chat.feature.quickinteraction.bottomsheet;

import X.C16360ka;
import X.C45621qg;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class IgnoreRecyclerAndPagerBottomSheetBehaviour extends BottomSheetBehavior<View> {
    public final Map<Integer, WeakReference<View>> LIZ = new LinkedHashMap();
    public WeakReference<View> LIZIZ;
    public boolean LIZJ;

    public static View LIZ(View view) {
        if (C16360ka.LJIILL(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                o.LJIIIIZZ(childAt, "view.getChildAt(i)");
                View LIZ = LIZ(childAt);
                if (LIZ != null) {
                    return LIZ;
                }
            }
        }
        return null;
    }

    public final void LIZIZ(View view) {
        if ((view instanceof RecyclerView) || (view instanceof ViewPager)) {
            this.LIZ.put(Integer.valueOf(view.getId()), new WeakReference<>(view));
            return;
        }
        if (!(view instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            o.LJIIIIZZ(childAt, "view.getChildAt(i)");
            LIZIZ(childAt);
        }
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, X.C06C
    public final boolean onInterceptTouchEvent(C45621qg parent, View child, MotionEvent event) {
        boolean onInterceptTouchEvent;
        boolean z;
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(child, "child");
        o.LJIIIZ(event, "event");
        int x = (int) event.getX();
        int y = (int) event.getY();
        if (event.getAction() == 0) {
            Collection values = ((LinkedHashMap) this.LIZ).values();
            ArrayList arrayList = new ArrayList();
            Iterator it = values.iterator();
            while (it.hasNext()) {
                Object obj = ((Reference) it.next()).get();
                if (obj != null) {
                    arrayList.add(obj);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (true) {
                View view = null;
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                View view2 = (View) next;
                WeakReference<View> weakReference = this.LIZIZ;
                if (weakReference != null) {
                    view = weakReference.get();
                }
                if (!o.LJ(view2, view) && parent.LJII(x, y, view2)) {
                    if (next != null) {
                        z = true;
                    }
                }
            }
            z = false;
            this.LIZJ = z;
        }
        if (this.LIZJ) {
            onInterceptTouchEvent = false;
        } else {
            onInterceptTouchEvent = super.onInterceptTouchEvent(parent, child, event);
        }
        if (event.getAction() == 3 || event.getAction() == 1) {
            this.LIZJ = false;
        }
        return onInterceptTouchEvent;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, X.C06C
    public final boolean onLayoutChild(C45621qg parent, View child, int i) {
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(child, "child");
        LIZIZ(parent);
        this.LIZIZ = new WeakReference<>(LIZ(child));
        return super.onLayoutChild(parent, child, i);
    }
}
